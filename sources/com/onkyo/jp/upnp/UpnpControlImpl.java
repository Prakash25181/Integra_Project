package com.onkyo.jp.upnp;

import com.onkyo.jp.upnp.UpnpControl;

/* loaded from: classes.dex */
public final class UpnpControlImpl extends UpnpControl {
    public long _nativePtr = 0;
    public long _delegatePtr = 0;

    public UpnpControlImpl(UpnpClient upnpClient, UpnpAdvDevice upnpAdvDevice) {
        nativeCreate(upnpClient, upnpAdvDevice.deviceId());
    }

    private native boolean nativeCreate(UpnpClient upnpClient, String str);

    private native void nativeDispose();

    private native int nativeDmrPosition();

    private native int nativeDmrStatus();

    private native boolean nativeIsConnecting();

    private native void nativePause();

    private native boolean nativePlay(UpnpContent upnpContent, UpnpControl.PlayCallback playCallback);

    private native void nativeRestart(UpnpControl.PlayCallback playCallback);

    private native void nativeSeekTo(int i);

    private native void nativeStop();

    private void onDmrPositionChanged(int i) {
        UpnpControl.Delegate delegate = this._delegate;
        if (delegate != null) {
            delegate.onDmrPositionChanged(i);
        }
    }

    private void onDmrStatusChanged(int i) {
        UpnpControl.Delegate delegate = this._delegate;
        if (delegate != null) {
            delegate.onDmrStatusChanged(i);
        }
    }

    @Override // com.onkyo.jp.upnp.Disposable
    public void disposeObjects() {
        nativeDispose();
        super.disposeObjects();
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public boolean isConnecting() {
        return nativeIsConnecting();
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void pause() {
        nativePause();
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public boolean play(UpnpContent upnpContent, UpnpControl.PlayCallback playCallback) {
        return nativePlay(upnpContent, playCallback);
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public int position() {
        return nativeDmrPosition();
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void restart(UpnpControl.PlayCallback playCallback) {
        nativeRestart(playCallback);
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void seekTo(int i) {
        nativeSeekTo(i);
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public int status() {
        return nativeDmrStatus();
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void stop() {
        nativeStop();
    }
}
