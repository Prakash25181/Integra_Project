package com.onkyo.jp.upnp;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class UpnpAdvDevice {
    public UpnpDeviceDescriptor _descriptor;
    public String _descriptorUrl;
    public String _deviceId;
    public String _deviceType;
    public InetAddress _inetAddr;
    public String _ipAddress;

    public UpnpDeviceDescriptor descriptor() {
        return this._descriptor;
    }

    public String descriptorUrl() {
        return this._descriptorUrl;
    }

    public String deviceId() {
        return this._deviceId;
    }

    public String deviceType() {
        return this._deviceType;
    }

    public InetAddress host() {
        try {
            if (this._inetAddr == null) {
                this._inetAddr = InetAddress.getByName(this._ipAddress);
            }
            return this._inetAddr;
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String ipAddress() {
        return this._ipAddress;
    }

    public boolean isEqualIpAddress(InetAddress inetAddress) {
        InetAddress host;
        if (inetAddress == null || (host = host()) == null) {
            return false;
        }
        return host.equals(inetAddress);
    }
}
