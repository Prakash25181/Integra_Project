/**
 * ISCP (Integra Serial Control Protocol) Connection Manager
 * Logic ported from original onpc Java source code
 * Supports both ISCP (Onkyo/Integra) and DCP (Denon/Marantz) protocols
 */

import { useState, useEffect, useRef, useCallback } from 'react';

// ISCP Message constants from original source
const ISCP_HEADER = 'ISCP';
const ISCP_PORT = 60128;
const BROADCAST_PORT = 60128;
const BROADCAST_MAGIC = '!xECNQSTN';

// ISCP Commands (from ISCPMessage.java + various message files)
export const Commands = {
  // Power
  POWER_ON: 'PWR01',
  POWER_OFF: 'PWR00',
  POWER_QUERY: 'PWRQSTN',

  // Master Volume
  VOLUME_UP: 'MVLUP',
  VOLUME_DOWN: 'MVLDOWN',
  VOLUME_SET: (val) => `MVL${val.toString(16).toUpperCase().padStart(2,'0')}`,
  VOLUME_QUERY: 'MVLQSTN',

  // Mute
  MUTE_ON: 'AMT01',
  MUTE_OFF: 'AMT00',
  MUTE_TOGGLE: 'AMTTG',

  // Playback controls (from PlaybackControlCommandMsg.java)
  PLAY: 'NTCPLAY',
  STOP: 'NTCSTOP',
  PAUSE: 'NTCPAUSE',
  TRACK_UP: 'NTCTRUP',
  TRACK_DOWN: 'NTCTRDN',
  FF: 'NTCFF',
  REW: 'NTCREW',
  REPEAT: 'NTCREPT',
  RANDOM: 'NTCRNDO',

  // Input Selector (from InputSelectorMsg.java)
  INPUT_QUERY: 'SLIQSTN',
  INPUT_SET: (code) => `SLI${code}`,
  INPUT_CODES: {
    'VIDEO1': '00', 'VIDEO2': '01', 'VIDEO3': '02', 'VIDEO4': '03',
    'VIDEO5': '04', 'VIDEO6': '05', 'VIDEO7': '06',
    'DVD': '10', 'BD_DVD': '10',
    'TAPE1': '20', 'TAPE2': '21',
    'PHONO': '22',
    'CD': '23', 'TV_CD': '23',
    'FM': '24', 'AM': '25', 'TUNER': '26',
    'MUSIC_SERVER': '27', 'NET': '2B',
    'HDMI1': '80', 'HDMI2': '81', 'HDMI3': '82', 'HDMI4': '83',
    'HDMI5': '84', 'HDMI6': '85', 'HDMI7': '86',
    'BLUETOOTH': 'B3',
    'USB_FRONT': '2C', 'USB_REAR': '2E',
  },

  // OSD Navigation (from AmpOperationCommandMsg.java)
  OSD_MENU: 'OSDMENU',
  OSD_UP: 'OSDUP',
  OSD_DOWN: 'OSDDOWN',
  OSD_LEFT: 'OSDLEFT',
  OSD_RIGHT: 'OSDRIGHT',
  OSD_ENTER: 'OSDENTER',
  OSD_EXIT: 'OSDEXIT',
  OSD_QUICK: 'OSDQUICK',
  OSD_HOME: 'OSDHOME',

  // Listening Mode (from ListeningModeMsg.java)
  LMD_QUERY: 'LMDQSTN',
  LMD_UP: 'LMDUP',
  LMD_DOWN: 'LMDDOWN',
  LMD_SET: (code) => `LMD${code}`,
  LMD_CODES: {
    'STEREO': '00', 'DIRECT': '01', 'PURE_AUDIO': '02',
    'SURROUND': '03', 'FILM': '06', 'THX': '04',
    'ACTION': '05', 'MUSICAL': '07', 'MONO_MOVIE': '08',
    'ORCHESTRA': '09', 'UNPLUGGED': '0A', 'STUDIO_MIX': '0B',
    'TV_LOGIC': '0C', 'ALL_CH_STEREO': '0D', 'THEATER_D': '0E',
    'DOLBY_ATMOS': '0F', 'DTS_X': '10',
  },

  // Track Info queries
  ARTIST_QUERY: 'IATQSTN',
  ALBUM_QUERY: 'IALQSTN',
  TITLE_QUERY: 'ITIQSTN',
  TIME_QUERY: 'ITMQSTN',
  TRACK_QUERY: 'ITRQSTN',
  FORMAT_QUERY: 'IFMQSTN',

  // Network service
  NET_SERVICE_QUERY: 'NSVSQSTN',

  // Zone 2/3
  ZONE2_POWER_ON: 'ZPW01',
  ZONE2_POWER_OFF: 'ZPW00',
  ZONE2_VOLUME_UP: 'ZVLUP',
  ZONE2_VOLUME_DOWN: 'ZVLDOWN',
};

/**
 * Build ISCP packet from command string
 * From EISCPMessage.java
 */
export function buildISCPPacket(command) {
  const message = `!1${command}\r`;
  const msgBytes = Buffer.from ? Buffer.from(message, 'ascii') : new TextEncoder().encode(message);
  const msgLen = msgBytes.length;

  // ISCP packet: header(4) + headerSize(4) + dataSize(4) + version(1) + reserved(3) + data
  const headerSize = 16;
  const totalSize = headerSize + msgLen;
  const packet = new Uint8Array(totalSize);

  // Header "ISCP"
  packet[0] = 0x49; packet[1] = 0x53; packet[2] = 0x43; packet[3] = 0x50;
  // Header size (big endian) = 16
  packet[4] = 0; packet[5] = 0; packet[6] = 0; packet[7] = 16;
  // Data size (big endian)
  packet[8] = 0; packet[9] = 0;
  packet[10] = (msgLen >> 8) & 0xFF;
  packet[11] = msgLen & 0xFF;
  // Version
  packet[12] = 0x01;
  // Reserved
  packet[13] = 0x00; packet[14] = 0x00; packet[15] = 0x00;
  // Data
  for (let i = 0; i < msgLen; i++) {
    packet[16 + i] = typeof msgBytes[i] !== 'undefined' ? msgBytes[i] : message.charCodeAt(i);
  }
  return packet;
}

/**
 * Parse ISCP response packet
 * From EISCPMessage.java + ISCPMessage.java
 */
export function parseISCPResponse(data) {
  try {
    const str = typeof data === 'string' ? data : new TextDecoder().decode(data);
    // Find the !1 marker
    const idx = str.indexOf('!1');
    if (idx < 0) return null;
    const msg = str.substring(idx + 2).replace(/[\r\n\x1A]/g, '');
    if (msg.length < 3) return null;
    return {
      command: msg.substring(0, 3),
      value: msg.substring(3),
      raw: msg,
    };
  } catch (e) {
    return null;
  }
}

/**
 * Demo/Mock connection hook for UI testing
 * Replace with real TCP socket (expo-tcp-socket or similar) for production
 */
export function useReceiverConnection() {
  const [connected, setConnected] = useState(false);
  const [deviceInfo, setDeviceInfo] = useState({
    name: 'TX-NR7100',
    model: 'TX-NR7100',
    brand: 'Onkyo',
    ip: '',
    port: ISCP_PORT,
    zone: 'Zone 1',
    firmware: 'v2.10.0',
  });
  const [playerState, setPlayerState] = useState({
    isPlaying: false,
    artist: 'Norah Jones',
    album: 'Come Away With Me',
    title: 'Midnight Serenade',
    format: 'FLAC 24bit/96kHz',
    timeElapsed: '0:00',
    timeTotal: '3:42',
    progress: 0,
    repeat: false,
    shuffle: false,
    muted: false,
    volume: 40,
    maxVolume: 100,
    inputSelector: 'NET',
    listeningMode: 'Stereo',
  });
  const [zone2Active, setZone2Active] = useState(false);
  const socketRef = useRef(null);
  const progressTimerRef = useRef(null);

  const sendCommand = useCallback((cmd) => {
    if (!connected) return false;
    // In real app: socket.write(buildISCPPacket(cmd))
    console.log('ISCP Command:', cmd);

    // Mock responses
    if (cmd === Commands.PLAY || cmd === 'PLAY') {
      setPlayerState(p => ({ ...p, isPlaying: true }));
    } else if (cmd === Commands.PAUSE || cmd === Commands.STOP) {
      setPlayerState(p => ({ ...p, isPlaying: false }));
    } else if (cmd === Commands.VOLUME_UP) {
      setPlayerState(p => ({ ...p, volume: Math.min(p.volume + 1, p.maxVolume) }));
    } else if (cmd === Commands.VOLUME_DOWN) {
      setPlayerState(p => ({ ...p, volume: Math.max(p.volume - 1, 0) }));
    } else if (cmd === Commands.MUTE_TOGGLE) {
      setPlayerState(p => ({ ...p, muted: !p.muted }));
    } else if (cmd === Commands.TRACK_UP) {
      setPlayerState(p => ({ ...p, progress: 0, timeElapsed: '0:00' }));
    } else if (cmd === Commands.TRACK_DOWN) {
      setPlayerState(p => ({ ...p, progress: 0, timeElapsed: '0:00' }));
    } else if (cmd === Commands.REPEAT) {
      setPlayerState(p => ({ ...p, repeat: !p.repeat }));
    } else if (cmd === Commands.RANDOM) {
      setPlayerState(p => ({ ...p, shuffle: !p.shuffle }));
    }
    return true;
  }, [connected]);

  const connect = useCallback((ip, port = ISCP_PORT) => {
    // In real production app, use expo-tcp-socket:
    // const socket = TcpSocket.createConnection({ host: ip, port }, () => { setConnected(true); });
    setDeviceInfo(d => ({ ...d, ip, port }));
    setConnected(true);
  }, []);

  const disconnect = useCallback(() => {
    setConnected(false);
    setPlayerState(p => ({ ...p, isPlaying: false }));
    clearInterval(progressTimerRef.current);
  }, []);

  const setVolume = useCallback((vol) => {
    const clamped = Math.max(0, Math.min(100, Math.round(vol)));
    setPlayerState(p => ({ ...p, volume: clamped }));
    sendCommand(Commands.VOLUME_SET(clamped));
  }, [sendCommand]);

  const setInput = useCallback((inputName) => {
    setPlayerState(p => ({ ...p, inputSelector: inputName }));
    const code = Commands.INPUT_CODES[inputName] || '2B';
    sendCommand(Commands.INPUT_SET(code));
  }, [sendCommand]);

  const setListeningMode = useCallback((modeName) => {
    setPlayerState(p => ({ ...p, listeningMode: modeName }));
    const code = Commands.LMD_CODES[modeName.replace(/ /g,'_').toUpperCase()] || '00';
    sendCommand(Commands.LMD_SET(code));
  }, [sendCommand]);

  // Progress timer
  useEffect(() => {
    if (playerState.isPlaying && connected) {
      progressTimerRef.current = setInterval(() => {
        setPlayerState(p => {
          const newProgress = Math.min(p.progress + 0.5, 100);
          const totalSecs = 222;
          const elapsed = Math.round((newProgress / 100) * totalSecs);
          const m = Math.floor(elapsed / 60);
          const s = elapsed % 60;
          return {
            ...p,
            progress: newProgress,
            timeElapsed: `${m}:${s < 10 ? '0' : ''}${s}`,
          };
        });
      }, 500);
    } else {
      clearInterval(progressTimerRef.current);
    }
    return () => clearInterval(progressTimerRef.current);
  }, [playerState.isPlaying, connected]);

  return {
    connected,
    deviceInfo,
    playerState,
    zone2Active,
    setZone2Active,
    sendCommand,
    connect,
    disconnect,
    setVolume,
    setInput,
    setListeningMode,
    Commands,
  };
}

export default { Commands, buildISCPPacket, parseISCPResponse, useReceiverConnection };
