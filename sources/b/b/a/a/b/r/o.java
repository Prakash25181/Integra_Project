package b.b.a.a.b.r;

import b.b.a.a.b.r.l;

/* compiled from: NetUsbList_2008_09.java */
/* loaded from: classes.dex */
public final class o extends l {

    /* renamed from: c, reason: collision with root package name */
    public v f995c;
    public b.b.a.a.b.o.f d;

    public o(b.b.a.a.b.p.d dVar) {
        super(dVar);
        this.f995c = new v(dVar, this);
    }

    @Override // b.b.a.a.b.r.l
    public i a() {
        return null;
    }

    @Override // b.b.a.a.b.r.l
    public void a(int i) {
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.f fVar, boolean z) {
        b.b.a.a.b.o.f fVar2;
        if (fVar != null) {
            if (z || (fVar2 = this.d) == null || fVar2.f808a != fVar.f808a) {
                this.d = fVar;
                a(fVar, fVar);
            }
        }
    }

    @Override // b.b.a.a.b.r.l
    public boolean c() {
        return true;
    }

    @Override // b.b.a.a.b.r.l
    public boolean d() {
        return false;
    }

    @Override // b.b.a.a.b.r.l
    public b.b.a.a.b.o.f f() {
        return this.d;
    }

    @Override // b.b.a.a.b.r.l
    public l.e h() {
        return l.e.LIST;
    }

    @Override // b.b.a.a.b.r.l
    public k j() {
        return null;
    }

    @Override // b.b.a.a.b.r.l
    public v k() {
        return this.f995c;
    }

    @Override // b.b.a.a.b.r.l
    public y l() {
        return null;
    }

    @Override // b.b.a.a.b.r.l
    public void n() {
    }

    @Override // b.b.a.a.b.r.l
    public l.f o() {
        return l.f.NONE;
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.h hVar, b.b.a.a.b.l lVar, boolean z) {
        b.b.a.a.b.o.f fVar;
        if (z && hVar == b.b.a.a.b.o.h.MUSIC_SERVER && (fVar = this.d) != null && fVar.f808a == b.b.a.a.b.o.e.THIS_DEVICE) {
            a("RETURN");
            b.b.a.a.b.o.f a2 = this.f981b.p.a(b.b.a.a.b.o.e.DLNA);
            this.d = a2;
            a(a2, this.f981b.p.a(b.b.a.a.b.o.e.THIS_DEVICE));
        }
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.p.v.b bVar) {
        this.f995c.a(bVar);
    }
}
