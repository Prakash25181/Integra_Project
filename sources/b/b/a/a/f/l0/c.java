package b.b.a.a.f.l0;

import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: AutoConnectFragment.java */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1380b;

    public c(b bVar) {
        this.f1380b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((ConnectionActivity) this.f1380b.getActivity()).k();
    }
}
