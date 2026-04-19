package b.b.a.a.b.r;

import b.b.a.a.b.r.l;
import java.util.Iterator;

/* compiled from: NetUsbList_2010.java */
/* loaded from: classes.dex */
public class p extends l {

    /* renamed from: c, reason: collision with root package name */
    public v f996c;
    public k d;
    public y e;
    public b.b.a.a.b.o.f f;
    public l.e g;
    public b.b.a.a.b.o.p h;
    public b.b.a.a.b.o.p i;
    public t j;
    public boolean k;
    public l.b l;
    public String m;
    public n n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;

    public p(b.b.a.a.b.p.d dVar) {
        super(dVar);
        this.f = this.f981b.p.a(b.b.a.a.b.o.e.INTERNET_RADIO);
        this.g = l.e.LIST;
        this.l = l.b.UNKNOWN;
        this.f996c = new v(this.f981b, this);
        this.e = new y(this.f981b);
        this.d = new k(this.f981b);
        Iterator<b.b.a.a.b.o.i> it = this.f981b.f852c.V.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.i next = it.next();
            b.b.a.a.b.o.h hVar = next.f817b;
            if (hVar == b.b.a.a.b.o.h.USB_FRONT) {
                this.h = b.b.a.a.b.o.p.a(b.b.a.a.b.o.e.USB_FRONT, next.d);
            } else if (hVar == b.b.a.a.b.o.h.USB_REAR) {
                this.i = b.b.a.a.b.o.p.a(b.b.a.a.b.o.e.USB_REAR, next.d);
            }
        }
    }

    @Override // b.b.a.a.b.r.l
    public void a(int i) {
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.f fVar, boolean z) {
        b.b.a.a.b.o.f fVar2;
        b.b.a.a.b.o.f fVar3;
        b.b.a.a.b.o.f fVar4;
        if (fVar != null) {
            if (fVar.f808a == b.b.a.a.b.o.e.INTERNET_RADIO && g() != b.b.a.a.b.o.e.DLNA && g() != b.b.a.a.b.o.e.THIS_DEVICE) {
                fVar = this.f;
                this.p = true;
            }
            b.b.a.a.b.o.e eVar = fVar.f808a;
            b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.THIS_DEVICE;
            if (eVar == eVar2 && (((fVar3 = this.f) == null || fVar3.f808a != eVar2) && (fVar4 = this.f) != null && fVar4.f808a == b.b.a.a.b.o.e.DLNA && (this.j.f969c > 1 || this.g == l.e.PLAYBACK))) {
                a("RETURN");
                this.q = true;
            }
            if (z || this.p || (fVar2 = this.f) == null || fVar2.f808a != fVar.f808a) {
                this.p = false;
                this.f = fVar;
                this.k = false;
                a(fVar, (b.b.a.a.b.o.f) null);
                this.f980a.a(this.g, l.a.REPLACE);
            }
        }
    }

    @Override // b.b.a.a.b.r.l
    public boolean c() {
        l.e eVar;
        b.b.a.a.b.o.f fVar = this.f;
        if (fVar != null) {
            b.b.a.a.b.o.e eVar2 = fVar.f808a;
            if (eVar2 == b.b.a.a.b.o.e.USB_FRONT || eVar2 == b.b.a.a.b.o.e.USB_REAR || eVar2 == b.b.a.a.b.o.e.DLNA) {
                return this.g != l.e.LIST || this.j.f969c > 1;
            }
            if (eVar2 != b.b.a.a.b.o.e.INTERNET_RADIO || (eVar = this.g) == l.e.PLAYBACK || eVar == l.e.POPUP || eVar == l.e.KEYBOARD) {
                return true;
            }
        }
        return false;
    }

    @Override // b.b.a.a.b.r.l
    public boolean d() {
        if (this.g == l.e.PLAYBACK) {
            return false;
        }
        b.b.a.a.b.o.f fVar = this.f;
        if (fVar != null && fVar.f808a == b.b.a.a.b.o.e.INTERNET_RADIO) {
            return this.k;
        }
        int ordinal = this.g.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return false;
        }
        return this.k;
    }

    @Override // b.b.a.a.b.r.l
    public b.b.a.a.b.o.f f() {
        return this.f;
    }

    @Override // b.b.a.a.b.r.l
    public l.e h() {
        return this.g;
    }

    @Override // b.b.a.a.b.r.l
    public k j() {
        return this.d;
    }

    @Override // b.b.a.a.b.r.l
    public v k() {
        return this.f996c;
    }

    @Override // b.b.a.a.b.r.l
    public y l() {
        return this.e;
    }

    @Override // b.b.a.a.b.r.l
    public void n() {
        if (d()) {
            a("DISPLAY");
            this.f981b.a(b.b.a.a.b.p.v.a.NST);
        }
    }

    @Override // b.b.a.a.b.r.l
    public l.f o() {
        int ordinal = this.l.ordinal();
        if (ordinal == 1) {
            return l.f.IPOD_STANDARD;
        }
        if (ordinal != 2 && ordinal != 3) {
            return l.f.MEMORY;
        }
        return l.f.IPOD_EXTENDED;
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.p.v.b bVar) {
        char charAt;
        boolean z;
        l.a a2;
        boolean z2;
        b.b.a.a.b.o.e eVar;
        t tVar;
        t tVar2;
        b.b.a.a.b.o.f fVar;
        int ordinal;
        b.b.a.a.b.o.e eVar2;
        b.b.a.a.b.o.e eVar3;
        int ordinal2 = bVar.f912b.ordinal();
        if (ordinal2 == 10) {
            String str = bVar.f913c.f915a;
            if (str.length() == 3 && ((charAt = str.charAt(0)) == 'P' || charAt == 'p')) {
                l.e eVar4 = this.g;
                l.e eVar5 = l.e.PLAYBACK;
                if (eVar4 != eVar5) {
                    this.k = true;
                    this.g = eVar5;
                    this.f980a.a(eVar5, l.a.DOWN);
                }
                if (g() == b.b.a.a.b.o.e.THIS_DEVICE) {
                    this.o = true;
                }
            }
        } else {
            if (ordinal2 == 25) {
                l.b d = bVar.f913c.d();
                if (this.l != d) {
                    this.l = d;
                    b.b.a.a.b.o.f fVar2 = this.f;
                    if (fVar2 != null) {
                        int ordinal3 = fVar2.f808a.ordinal();
                        if (ordinal3 == 21 || ordinal3 == 22) {
                            this.f980a.a(o());
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal2 == 15) {
                b.b.a.a.b.p.v.d dVar = bVar.f913c;
                this.m = dVar.f915a;
                n nVar = new n(dVar, true);
                this.n = nVar;
                b.b.a.a.b.o.f fVar3 = this.f;
                if (fVar3 == null || !((eVar2 = fVar3.f808a) == (eVar3 = nVar.f990a) || (eVar2 == b.b.a.a.b.o.e.THIS_DEVICE && eVar3 == b.b.a.a.b.o.e.DLNA))) {
                    b.b.a.a.b.o.f fVar4 = null;
                    this.j = null;
                    b.b.a.a.b.o.e eVar6 = nVar.f990a;
                    if (eVar6 != b.b.a.a.b.o.e.NONE && (fVar4 = this.f981b.p.a(eVar6)) == null) {
                        int ordinal4 = nVar.f990a.ordinal();
                        if (ordinal4 == 21) {
                            fVar4 = this.h;
                        } else if (ordinal4 == 22) {
                            fVar4 = this.i;
                        }
                    }
                    if (fVar4 == null) {
                        fVar4 = this.f981b.p.a(b.b.a.a.b.o.e.INTERNET_RADIO);
                    }
                    this.k = false;
                    this.f = fVar4;
                    z = true;
                } else {
                    z = false;
                }
                l.e eVar7 = this.g;
                l.a aVar = l.a.NO_CHANGE;
                b.b.a.a.b.o.f fVar5 = this.f;
                if (fVar5 != null && ((ordinal = fVar5.f808a.ordinal()) == 21 || ordinal == 22)) {
                    if (o() == l.f.IPOD_STANDARD) {
                        nVar.f991b = l.e.PLAYBACK;
                    }
                    if (nVar.f992c == 1) {
                        this.k = false;
                    }
                }
                if (this.g == l.e.KEYBOARD && System.currentTimeMillis() - this.r < 200) {
                    nVar.f991b = l.e.KEYBOARD;
                }
                if (nVar.f991b != this.g || z) {
                    l.e eVar8 = nVar.f991b;
                    this.g = eVar8;
                    if (eVar8 == l.e.PLAYBACK) {
                        this.k = true;
                        this.f996c.g();
                    }
                    if (z) {
                        b.b.a.a.b.o.f fVar6 = this.f;
                        if (fVar6 != null && ((eVar = fVar6.f808a) == b.b.a.a.b.o.e.INTERNET_RADIO || eVar == b.b.a.a.b.o.e.DLNA || eVar == b.b.a.a.b.o.e.USB_FRONT || eVar == b.b.a.a.b.o.e.USB_REAR)) {
                            a2 = l.a.REPLACE;
                        } else if (fVar3 != null && fVar3.f808a == b.b.a.a.b.o.e.INTERNET_RADIO) {
                            a2 = l.a.DOWN;
                        } else {
                            a2 = l.a.REPLACE;
                        }
                    } else {
                        b.b.a.a.b.o.f fVar7 = this.f;
                        if (fVar7 != null && fVar7.f808a == b.b.a.a.b.o.e.INTERNET_RADIO) {
                            a2 = l.a.UP;
                        } else {
                            a2 = super.a(eVar7, nVar.f991b);
                        }
                    }
                    aVar = a2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                int ordinal5 = nVar.f991b.ordinal();
                if (ordinal5 == 0 || ordinal5 == 1 || ordinal5 == 5) {
                    t tVar3 = this.j;
                    int i = tVar3 == null ? 0 : tVar3.f969c;
                    if (z || z2 || (tVar = this.j) == null || tVar.f969c != nVar.f992c) {
                        this.j = new t(nVar.g, nVar.f992c, nVar.f991b, nVar.f);
                        z2 = true;
                    }
                    if (z2 && aVar == l.a.NO_CHANGE) {
                        int i2 = nVar.f992c;
                        if (i2 < i) {
                            aVar = l.a.UP;
                        } else if (i2 == i) {
                            aVar = l.a.REPLACE;
                        } else {
                            aVar = l.a.DOWN;
                        }
                    }
                }
                if (!this.f981b.b().s) {
                    if (z) {
                        a(this.f, fVar3);
                    }
                    if (z2 && (fVar = this.f) != null && fVar.f808a != b.b.a.a.b.o.e.THIS_DEVICE) {
                        this.f980a.a(nVar.f991b, aVar);
                    }
                } else if (z) {
                    this.p = true;
                }
                b.b.a.a.b.o.f fVar8 = this.f;
                if (fVar8 != null && fVar8.f808a == b.b.a.a.b.o.e.THIS_DEVICE && this.q) {
                    if (this.g != l.e.PLAYBACK && ((tVar2 = this.j) == null || tVar2.f969c <= 1)) {
                        this.q = false;
                        return;
                    } else {
                        a("RETURN");
                        return;
                    }
                }
                return;
            }
            if (ordinal2 == 16) {
                t tVar4 = this.j;
                if (tVar4 != null) {
                    tVar4.a(bVar.f913c);
                    return;
                }
                return;
            }
            if (ordinal2 == 19) {
                l.e eVar9 = this.g;
                l.e eVar10 = l.e.KEYBOARD;
                if (eVar9 != eVar10) {
                    this.g = eVar10;
                    this.f980a.a(eVar10, l.a.DOWN);
                }
                String str2 = this.m;
                if (str2 != null) {
                    this.d.a(str2.length() > 22 ? str2.substring(22) : "");
                }
                this.d.a(bVar);
                this.r = System.currentTimeMillis();
                return;
            }
            if (ordinal2 == 20) {
                l.e eVar11 = this.g;
                l.e eVar12 = l.e.POPUP;
                if (eVar11 != eVar12) {
                    this.g = eVar12;
                    this.f980a.a(eVar12, l.a.DOWN);
                }
                this.e.a(bVar);
                return;
            }
        }
        this.f996c.a(bVar);
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.h hVar, b.b.a.a.b.l lVar, boolean z) {
        if (z && hVar == b.b.a.a.b.o.h.MUSIC_SERVER) {
            this.k = false;
            b.b.a.a.b.o.f fVar = this.f;
            if (fVar == null || fVar.f808a != b.b.a.a.b.o.e.THIS_DEVICE) {
                return;
            }
            if (this.o) {
                this.o = false;
                a("RETURN");
            }
            this.f = this.f981b.p.a(b.b.a.a.b.o.e.DLNA);
            n nVar = this.n;
            if (nVar != null) {
                this.g = nVar.f991b;
            } else {
                this.g = l.e.LIST;
            }
            a(this.f, this.f981b.p.a(b.b.a.a.b.o.e.THIS_DEVICE));
            this.f980a.a(this.g, l.a.REPLACE);
        }
    }

    @Override // b.b.a.a.b.r.l
    public i a() {
        return this.j;
    }
}
