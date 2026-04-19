package b.b.a.a.f.k0.u;

import b.b.a.a.f.c;

/* compiled from: NetUsbOverlayPopup.java */
/* loaded from: classes.dex */
public class l implements c.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f1316a;

    /* compiled from: NetUsbOverlayPopup.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.f1316a.a(true);
        }
    }

    public l(m mVar) {
        this.f1316a = mVar;
    }

    @Override // b.b.a.a.f.c.g
    public void a(boolean z) {
        m mVar = this.f1316a;
        int i = mVar.f1319b.f1028b.h;
        if (i > 0) {
            mVar.e.a(0, i, new a());
        }
    }
}
