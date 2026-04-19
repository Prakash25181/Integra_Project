package b.b.a.a.f.k0;

import b.b.a.a.f.m0.u0;

/* compiled from: DabTunerControlPage.java */
/* loaded from: classes.dex */
public class i implements u0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f1239a;

    public i(h hVar) {
        this.f1239a = hVar;
    }

    @Override // b.b.a.a.f.m0.u0.d
    public void a() {
    }

    @Override // b.b.a.a.f.m0.u0.d
    public void a(int i) {
        b.b.a.a.b.t.b bVar = this.f1239a.h;
        if (bVar == null) {
            throw null;
        }
        if (1 <= i) {
            b.b.a.a.b.p.d dVar = bVar.f1048a;
            if (i <= dVar.f852c.Q) {
                dVar.a(b.b.a.a.b.p.v.a.PRM, String.format("%02X", Integer.valueOf(i)));
                bVar.f1048a.a(b.b.a.a.b.p.v.a.PRS);
            }
        }
    }
}
