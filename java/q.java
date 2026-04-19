package b.b.a.a.b.r;

import b.b.a.a.b.r.l;
import java.util.Iterator;

/* compiled from: NetUsbList_2011.java */
/* loaded from: classes.dex */
public class q extends l {

    /* renamed from: c, reason: collision with root package name */
    public v f997c;
    public k d;
    public y e;
    public b.b.a.a.b.o.d f;
    public b.b.a.a.b.o.f g;
    public b.b.a.a.b.o.f h;
    public l.e i;
    public b.b.a.a.b.o.p j;
    public b.b.a.a.b.o.p k;
    public t l;
    public boolean m;
    public l.b n;
    public b.b.a.a.b.p.v.d o;
    public boolean p;
    public boolean q;

    public q(b.b.a.a.b.p.d dVar) {
        super(dVar);
        this.n = l.b.UNKNOWN;
        b.b.a.a.b.o.d b2 = b.b.a.a.b.o.d.b();
        this.f = b2;
        this.g = b2;
        this.i = l.e.LIST;
        this.f997c = new v(dVar, this);
        this.e = new y(dVar);
        this.d = new k(dVar);
        Iterator<b.b.a.a.b.o.i> it = dVar.f852c.V.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.i next = it.next();
            b.b.a.a.b.o.h hVar = next.f817b;
            if (hVar == b.b.a.a.b.o.h.USB_FRONT) {
                this.j = b.b.a.a.b.o.p.a(b.b.a.a.b.o.e.USB_FRONT, next.d);
            } else if (hVar == b.b.a.a.b.o.h.USB_REAR) {
                this.k = b.b.a.a.b.o.p.a(b.b.a.a.b.o.e.USB_REAR, next.d);
            }
        }
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.f fVar, boolean z) {
        b.b.a.a.b.o.f fVar2;
        if (fVar != null) {
            b.b.a.a.b.o.e eVar = fVar.f808a;
            b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.THIS_DEVICE;
            if (eVar == eVar2) {
                b.b.a.a.b.o.f fVar3 = this.g;
                this.p = true;
                this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(b.b.a.a.b.o.e.DLNA.f807b)));
                this.g = fVar;
                this.h = fVar;
                a(fVar, fVar3);
                return;
            }
            if (this.h != null && (fVar2 = this.g) != null && fVar2.f808a == eVar2) {
                this.g = null;
                this.f997c.e();
                int ordinal = fVar.f808a.ordinal();
                if (ordinal == 0 || ordinal == 24) {
                    this.q = true;
                    this.m = false;
                }
                if (fVar.f808a.ordinal() == 24) {
                    a("RETURN");
                    a("RETURN");
                }
            }
            this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(fVar.f808a.f807b)));
        }
    }

    @Override // b.b.a.a.b.r.l
    public boolean c() {
        b.b.a.a.b.o.f fVar = this.g;
        if (fVar != null) {
            int ordinal = fVar.f808a.ordinal();
            if (ordinal != 21 && ordinal != 22) {
                if (this.g.f808a != b.b.a.a.b.o.e.NET_TOP) {
                    return true;
                }
            } else {
                if (this.i != l.e.LIST || this.l.f969c > 1) {
                    return (o() == l.f.IPOD_STANDARD && this.i == l.e.PLAYBACK) ? false : true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // b.b.a.a.b.r.l
    public boolean d() {
        b.b.a.a.b.o.f fVar = this.g;
        if (fVar != null && fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
            return this.m;
        }
        int ordinal = this.i.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return false;
        }
        return this.m;
    }

    @Override // b.b.a.a.b.r.l
    public b.b.a.a.b.o.f f() {
        return this.g;
    }

    @Override // b.b.a.a.b.r.l
    public l.e h() {
        return this.i;
    }

    @Override // b.b.a.a.b.r.l
    public k j() {
        return this.d;
    }

    @Override // b.b.a.a.b.r.l
    public v k() {
        return this.f997c;
    }

    @Override // b.b.a.a.b.r.l
    public y l() {
        return this.e;
    }

    @Override // b.b.a.a.b.r.l
    public void n() {
        if (d()) {
            a("LIST");
        }
    }

    @Override // b.b.a.a.b.r.l
    public l.f o() {
        int ordinal = this.n.ordinal();
        if (ordinal == 1) {
            return l.f.IPOD_STANDARD;
        }
        if (ordinal != 2 && ordinal != 3) {
            return l.f.MEMORY;
        }
        return l.f.IPOD_EXTENDED;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b.b.a.a.b.p.v.d r14) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.r.q.a(b.b.a.a.b.p.v.d):void");
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.p.v.b bVar) {
        int ordinal = bVar.f912b.ordinal();
        if (ordinal == 15) {
            a(bVar.f913c);
            return;
        }
        if (ordinal == 16) {
            b.b.a.a.b.p.v.d dVar = bVar.f913c;
            t tVar = this.l;
            if (tVar != null) {
                tVar.a(dVar);
                return;
            }
            return;
        }
        if (ordinal == 19) {
            l.e eVar = this.i;
            l.e eVar2 = l.e.KEYBOARD;
            if (eVar != eVar2) {
                this.i = eVar2;
                this.f980a.a(eVar2, l.a.DOWN);
            }
            b.b.a.a.b.p.v.d dVar2 = this.o;
            if (dVar2 != null) {
                k kVar = this.d;
                String str = dVar2.f915a;
                kVar.a(str.length() > 22 ? str.substring(22) : "");
            }
            this.d.a(bVar);
            return;
        }
        if (ordinal == 20) {
            if (a(this.g.f808a) && o() == l.f.IPOD_STANDARD) {
                return;
            }
            l.e eVar3 = this.i;
            l.e eVar4 = l.e.POPUP;
            if (eVar3 != eVar4) {
                this.i = eVar4;
                this.f980a.a(eVar4, l.a.DOWN);
            }
            this.e.a(bVar);
            return;
        }
        if (ordinal != 25) {
            this.f997c.a(bVar);
            return;
        }
        l.b d = bVar.f913c.d();
        l.b bVar2 = this.n;
        if (bVar2 != d) {
            this.n = d;
            b.b.a.a.b.o.f fVar = this.g;
            if (fVar != null) {
                int ordinal2 = fVar.f808a.ordinal();
                if (ordinal2 == 21 || ordinal2 == 22) {
                    this.f980a.a(o());
                    if (!(bVar2 == l.b.STANDARD && this.n == l.b.EXTENDED) && (this.n != l.b.STANDARD || this.i == l.e.PLAYBACK)) {
                        return;
                    }
                    a(this.o);
                }
            }
        }
    }

    @Override // b.b.a.a.b.r.l
    public i a() {
        return this.l;
    }

    @Override // b.b.a.a.b.r.l
    public void a(int i) {
        if (i < 0 || i >= 10) {
            return;
        }
        this.f981b.a(b.b.a.a.b.p.v.a.NLS, String.format("L%d", Integer.valueOf(i)));
    }

    public final boolean a(b.b.a.a.b.o.e eVar) {
        return eVar == b.b.a.a.b.o.e.USB_FRONT || eVar == b.b.a.a.b.o.e.USB_REAR;
    }
}
