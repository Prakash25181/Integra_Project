package b.b.a.a.f.k0;

import b.b.a.a.f.m0.u0;

/* compiled from: RadioTunerControlPage.java */
/* loaded from: classes.dex */
public class s implements u0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1267a;

    public s(q qVar) {
        this.f1267a = qVar;
    }

    @Override // b.b.a.a.f.m0.u0.d
    public void a() {
    }

    @Override // b.b.a.a.f.m0.u0.d
    public void a(int i) {
        b.b.a.a.b.t.c cVar = this.f1267a.m;
        if (cVar.f1052b.f755b.f839b != b.b.a.a.b.o.r.MAIN || i < 1 || i > cVar.f1051a.l.f1056b) {
            return;
        }
        b.b.a.a.b.o.o oVar = new b.b.a.a.b.o.o();
        oVar.f831a = i;
        b.b.a.a.b.o.m mVar = b.b.a.a.b.o.m.NONE;
        oVar.f832b = "";
        cVar.f = oVar;
        cVar.f1051a.a(b.b.a.a.b.p.v.a.PRM, String.format("%02X", Integer.valueOf(i)));
    }
}
