package b.b.a.a.b.t;

/* compiled from: DabTuner.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f1048a;

    /* renamed from: b, reason: collision with root package name */
    public String f1049b;

    /* renamed from: c, reason: collision with root package name */
    public int f1050c;
    public b.b.a.a.e.e d;

    public b(b.b.a.a.b.p.d dVar) {
        this.f1048a = dVar;
    }

    public void a() {
        b.b.a.a.e.e eVar = this.d;
        if (eVar != null) {
            eVar.a();
            this.d = null;
        }
    }

    public final void b(boolean z) {
        this.f1049b = "";
        this.f1048a.a(b.b.a.a.b.p.v.a.TUN, z ? "UP" : "DOWN");
        this.f1048a.a(b.b.a.a.b.p.v.a.OSD, "ENTER");
        this.f1048a.a(b.b.a.a.b.p.v.a.PRS);
        this.f1048a.a(b.b.a.a.b.p.v.a.DSN);
    }

    public final void a(boolean z) {
        this.f1049b = "";
        this.f1048a.a(b.b.a.a.b.p.v.a.PRS, z ? "UP" : "DOWN");
        this.f1048a.a(b.b.a.a.b.p.v.a.PRS);
        this.f1048a.a(b.b.a.a.b.p.v.a.DSN);
    }
}
