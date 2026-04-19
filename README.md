# Onkyo Remote — Modern React Native App

Modern redesign of the onpc (Enhanced Music Controller) app using React Native + Expo.

## Features
- 🎵 **Listen Screen** — Now Playing with album art, progress bar, volume control, input selector
- 📋 **Media Screen** — Queue, Network Services (Spotify, TIDAL, TuneIn), search
- 🎮 **Remote Screen** — OSD navigation (D-pad), listening mode selector, CD controls
- ⚙️ **Device Screen** — Connect to receiver by IP, device info, settings toggles, power control
- 🔌 **ISCP Protocol** — Full command set ported from original Java source (Onkyo + Denon/Marantz)

---

## How to Get APK (Free, No PC Setup Needed)

### Method 1 — EAS Build (Easiest)

1. **Create free Expo account** at https://expo.dev/signup

2. **Create new GitHub repo** and upload all these files

3. **Go to** https://expo.dev → New Project → Connect GitHub repo

4. **Click** "Build" → Android → APK

5. **Download APK** when build completes (~10-15 minutes)

6. **Install on phone** — enable "Install from unknown sources" in Android settings

---

### Method 2 — Local Build (If you have Node.js)

```bash
# 1. Install Expo CLI
npm install -g expo-cli eas-cli

# 2. Install dependencies
npm install

# 3. Login to Expo
eas login

# 4. Build APK
eas build -p android --profile preview

# Or run in browser/emulator instantly:
npx expo start
```

---

### Method 3 — Expo Snack (Instant browser preview)

1. Go to https://snack.expo.dev
2. Upload/paste the files
3. Run in browser instantly

---

## Connecting to Your Receiver

1. Make sure phone + receiver are on **same Wi-Fi network**
2. Open app → go to **Device** tab
3. Enter receiver's IP address (find in receiver's Network Settings menu)
4. Default port: **60128** (ISCP protocol)
5. Tap **Connect**

### Finding Your Receiver's IP
- Check your router's device list
- Or: Receiver Settings → Network → IP Address

---

## Files Structure

```
onkyo-app/
├── App.js              # Main navigation + header + global context
├── connection.js       # ISCP protocol + receiver connection hook
├── theme.js            # Colors, fonts, radius constants
├── app.json            # Expo/Android config
├── package.json        # Dependencies
├── babel.config.js     # Babel config
└── screens/
    ├── ListenScreen.js  # Now Playing
    ├── MediaScreen.js   # Media browser
    ├── RemoteScreen.js  # OSD remote
    └── DeviceScreen.js  # Device settings
```

---

## Protocol Notes

- **ISCP** (port 60128): Onkyo, Integra receivers
- **DCP** (port 1255): Denon, Marantz receivers  
- For real TCP socket connection in production, add `expo-tcp-socket` package
- Current version uses mock connection for demo — replace `connect()` in `connection.js` with real socket

---

## License

Based on onpc (Enhanced Music Controller) by Mikhail Kulesh — GPL v3
UI redesign: React Native + Expo
