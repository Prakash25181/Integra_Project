package b.b.a.a.b.n;

import com.onkyo.jp.upnp.UpnpContent;
import com.onkyo.jp.upnp.UpnpControl;

/* compiled from: DemoUpnpControl.java */
/* loaded from: classes.dex */
public class e extends UpnpControl {
    @Override // com.onkyo.jp.upnp.UpnpControl
    public boolean isConnecting() {
        return true;
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void pause() {
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public boolean play(UpnpContent upnpContent, UpnpControl.PlayCallback playCallback) {
        if (playCallback == null) {
            return true;
        }
        playCallback.onPlayResult(false, UpnpControl.ERROR_DEMO_MODE);
        return true;
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public int position() {
        return 0;
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void restart(UpnpControl.PlayCallback playCallback) {
        if (playCallback != null) {
            playCallback.onPlayResult(false, UpnpControl.ERROR_DEMO_MODE);
        }
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void seekTo(int i) {
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public int status() {
        return 1;
    }

    @Override // com.onkyo.jp.upnp.UpnpControl
    public void stop() {
    }
}
