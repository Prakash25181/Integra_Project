package b.b.a.a.f.k0.u;

/* compiled from: NetUsbPlaybackPage.java */
/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f1338c;

    public p(o oVar, boolean z) {
        this.f1338c = oVar;
        this.f1337b = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        o oVar = this.f1338c;
        oVar.H = false;
        oVar.I = true;
        if (this.f1337b) {
            oVar.A.s.a("FF");
            this.f1338c.u.setEnabled(false);
        } else {
            oVar.A.s.a("REW");
            this.f1338c.v.setEnabled(false);
        }
    }
}
