package com.onkyo.jp.upnp;

/* loaded from: classes.dex */
public abstract class UpnpControl extends Disposable {
    public static final int ERROR_DEMO_MODE = -1001;
    public static final int STATUS_NO_MEDIA = 0;
    public static final int STATUS_PAUSE = 3;
    public static final int STATUS_PLAY = 4;
    public static final int STATUS_STOP = 1;
    public static final int STATUS_TRANSITIONING = 2;
    public Delegate _delegate;

    /* loaded from: classes.dex */
    public interface Delegate {
        void onDmrPositionChanged(int i);

        void onDmrStatusChanged(int i);
    }

    /* loaded from: classes.dex */
    public interface PlayCallback {
        void onPlayResult(boolean z, int i);
    }

    public boolean isConnecting() {
        return false;
    }

    public void pause() {
    }

    public boolean play(UpnpContent upnpContent, PlayCallback playCallback) {
        return false;
    }

    public int position() {
        return 0;
    }

    public void restart(PlayCallback playCallback) {
    }

    public void seekTo(int i) {
    }

    public void setDelegate(Delegate delegate) {
        this._delegate = delegate;
    }

    public int status() {
        return 0;
    }

    public void stop() {
    }
}
