package b.b.a.a.b.n;

import b.b.a.a.b.k;
import b.b.a.a.b.n.d;
import b.b.a.a.b.o.h;
import b.b.a.a.b.o.i;
import b.b.a.a.b.o.j;
import b.b.a.a.b.o.l;
import b.b.a.a.b.o.m;
import b.b.a.a.b.o.r;
import b.b.a.a.b.o.s;
import b.b.a.a.b.r.l;
import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: DemoDevice.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public g f774a;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.o.c f775b;

    /* renamed from: c, reason: collision with root package name */
    public String f776c;
    public HashMap<r, f> d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public c i;
    public d j;

    public a(g gVar) {
        this.f774a = gVar;
    }

    public void a(m mVar) {
        for (f fVar : this.d.values()) {
            if (i.c(fVar.g)) {
                int ordinal = mVar.ordinal();
                if (ordinal == 1) {
                    fVar.a(h.TUNER_FM);
                } else if (ordinal == 2) {
                    fVar.a(h.TUNER_AM);
                }
            }
        }
    }

    public final boolean a(b.b.a.a.b.p.v.b bVar, String str, String str2, boolean z) {
        if (!bVar.a()) {
            if (bVar.f913c.f915a.equals(str)) {
                z = true;
            } else if (bVar.f913c.f915a.equals(str2)) {
                z = false;
            }
        }
        g gVar = this.f774a;
        b.b.a.a.b.p.v.a aVar = bVar.f912b;
        if (!z) {
            str = str2;
        }
        gVar.b(aVar, str);
        return z;
    }

    public void a(b.b.a.a.b.p.v.b bVar) {
        int ordinal = bVar.f912b.ordinal();
        if (ordinal != 23) {
            if (ordinal == 33) {
                this.g = a(bVar, "01", "00", this.g);
            } else if (ordinal == 35) {
                this.h = a(bVar, "01", "00", this.h);
            } else if (ordinal == 26) {
                this.f = a(bVar, "ON", "OFF", this.f);
            } else if (ordinal == 27) {
                this.e = a(bVar, "01", "00", this.e);
            }
        } else if (bVar.a()) {
            this.f774a.b(b.b.a.a.b.p.v.a.NRI, this.f776c);
        }
        c cVar = this.i;
        if (cVar == null) {
            throw null;
        }
        int ordinal2 = bVar.f912b.ordinal();
        if (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 4) {
            b.b.a.a.b.p.v.d dVar = bVar.f913c;
            if (dVar.f915a.equals("RETURN")) {
                if (cVar.g == l.e.PLAYBACK) {
                    cVar.d.removeAllElements();
                    cVar.d.addAll(cVar.e);
                    cVar.d.pop();
                    cVar.g = l.e.LIST;
                } else if (cVar.d.size() > 1) {
                    cVar.d.pop();
                }
                cVar.b();
            } else if (dVar.f915a.equals("LIST")) {
                if (cVar.g == l.e.LIST && !cVar.e.empty()) {
                    cVar.a();
                }
            } else if (dVar.f915a.equals("DISPLAY") && cVar.g == l.e.LIST && cVar.d.size() == 1) {
                cVar.a();
            }
        } else if (ordinal2 != 15) {
            try {
                if (ordinal2 == 17) {
                    b.b.a.a.b.p.v.d dVar2 = bVar.f913c;
                    char charAt = dVar2.f915a.charAt(0);
                    if (charAt == 'I') {
                        int a2 = dVar2.a(1, 2);
                        int a3 = dVar2.a(3, 4);
                        if (a2 == cVar.d.size()) {
                            cVar.a(a3);
                        } else {
                            cVar.a(0, -1, "unexpected level");
                        }
                    } else if (charAt != 'L') {
                        cVar.a(0, -2, "unexpected request");
                    } else {
                        int a4 = dVar2.a(1, 4);
                        int a5 = dVar2.a(5, 2);
                        int a6 = dVar2.a(7, 4);
                        int a7 = dVar2.a(11, 4);
                        if (a5 == cVar.d.size()) {
                            cVar.a(a4, a6, a7);
                        } else {
                            cVar.a(a4, -1, "unexpected level");
                        }
                    }
                } else if (ordinal2 == 18) {
                    b.b.a.a.b.o.e a8 = b.b.a.a.b.o.e.a(bVar.f913c.a(0, 2));
                    if (a8 != null) {
                        int ordinal3 = a8.ordinal();
                        if (ordinal3 == 24) {
                            cVar.d.removeAllElements();
                            cVar.d.push(cVar.f778b);
                            cVar.b();
                        } else if (ordinal3 == 28) {
                            cVar.d.removeAllElements();
                            cVar.d.push(cVar.f778b);
                            cVar.d.push(cVar.f778b.f785b.get(0));
                            cVar.b();
                        }
                    }
                }
            } catch (CharConversionException unused) {
            }
        } else if (bVar.a()) {
            cVar.b();
        }
        d dVar3 = this.j;
        if (dVar3 != null) {
            switch (bVar.f912b.ordinal()) {
                case 78:
                    dVar3.b(bVar, r.MAIN);
                    break;
                case 79:
                    dVar3.b(bVar, r.ZONE2);
                    break;
                case 80:
                    dVar3.b(bVar, r.ZONE3);
                    break;
                case 81:
                    dVar3.b(bVar, r.ZONE4);
                    break;
                case 82:
                    dVar3.a(bVar, r.MAIN);
                    break;
                case 83:
                    dVar3.a(bVar, r.ZONE2);
                    break;
                case 84:
                    dVar3.a(bVar, r.ZONE3);
                    break;
                case 85:
                    dVar3.a(bVar, r.ZONE4);
                    break;
                case 86:
                    try {
                        int c2 = bVar.f913c.c();
                        if (1 <= c2 && c2 <= dVar3.b()) {
                            d.a aVar = dVar3.f788c[dVar3.b(dVar3.f787b)];
                            for (int i = 0; i < dVar3.b(); i++) {
                                if (dVar3.d[i] == aVar.d) {
                                    dVar3.d[i] = 0;
                                }
                            }
                            dVar3.d[c2 - 1] = aVar.d;
                            dVar3.e = c2;
                            dVar3.c(255);
                            break;
                        }
                    } catch (CharConversionException e) {
                        e.printStackTrace();
                        break;
                    }
                    break;
            }
            for (f fVar : this.d.values()) {
                if (fVar != null) {
                    b.b.a.a.b.p.v.a aVar2 = bVar.f912b;
                    if (aVar2 != b.b.a.a.b.p.v.a.nul) {
                        k kVar = fVar.f793b;
                        if (aVar2 == kVar.f751a) {
                            if (!bVar.a()) {
                                if (bVar.f913c.f915a.equals("TG")) {
                                    fVar.d = !fVar.d;
                                } else {
                                    try {
                                        fVar.d = bVar.f913c.a();
                                    } catch (CharConversionException unused2) {
                                    }
                                }
                            }
                            fVar.f792a.a(fVar.f793b.f751a, b.b.a.a.b.p.v.d.a(fVar.d));
                        } else if (aVar2 == kVar.f752b) {
                            if (!bVar.a()) {
                                if (bVar.f913c.f915a.equals("TG")) {
                                    fVar.e = !fVar.e;
                                } else {
                                    try {
                                        fVar.e = bVar.f913c.a();
                                    } catch (CharConversionException unused3) {
                                    }
                                }
                            }
                            fVar.f792a.a(fVar.f793b.f752b, b.b.a.a.b.p.v.d.a(fVar.e));
                        } else if (aVar2 == kVar.f753c) {
                            if (!bVar.a()) {
                                int i2 = fVar.f;
                                if (bVar.toString().equals("UP")) {
                                    i2 = fVar.f + 1;
                                } else if (bVar.toString().equals("DOWN")) {
                                    i2 = fVar.f - 1;
                                } else {
                                    try {
                                        i2 = bVar.f913c.c();
                                    } catch (CharConversionException unused4) {
                                    }
                                }
                                s sVar = fVar.f794c;
                                int i3 = sVar.f;
                                if (i2 >= i3) {
                                    i2 = i3;
                                }
                                int i4 = sVar.e;
                                if (i2 < i4) {
                                    i2 = i4;
                                }
                                fVar.f = i2;
                            }
                            fVar.f792a.a(fVar.f793b.f753c, String.format("%02X", Integer.valueOf(fVar.f)));
                        } else if (aVar2 == kVar.d) {
                            h hVar = fVar.g;
                            if (!bVar.a()) {
                                try {
                                    h a9 = h.a(bVar.f913c.c());
                                    if (a9 != null) {
                                        Iterator<i> it = fVar.f792a.f775b.V.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                i next = it.next();
                                                if ((fVar.f794c.f839b.f837c & next.e) != 0 && next.f817b == a9) {
                                                    fVar.g = a9;
                                                }
                                            }
                                        }
                                    }
                                } catch (CharConversionException unused5) {
                                }
                            }
                            fVar.f792a.a(fVar.f793b.d, String.format("%02X", Integer.valueOf(fVar.g.f815b)));
                            h hVar2 = fVar.g;
                            if (hVar != hVar2) {
                                h hVar3 = h.NETWORK;
                                if (hVar2 == hVar3) {
                                    c cVar2 = fVar.f792a.i;
                                    cVar2.f = fVar.f794c.f839b.f837c | cVar2.f;
                                    cVar2.b();
                                } else if (hVar == hVar3) {
                                    c cVar3 = fVar.f792a.i;
                                    cVar3.f = (fVar.f794c.f839b.f837c ^ (-1)) & cVar3.f;
                                }
                                h hVar4 = fVar.g;
                                if (hVar4 == h.TUNER_FM) {
                                    fVar.f792a.j.a(m.FM);
                                } else if (hVar4 == h.TUNER_AM) {
                                    fVar.f792a.j.a(m.AM);
                                }
                            }
                        } else if (aVar2 == b.b.a.a.b.p.v.a.IFA) {
                            if (b.b.a.a.b.f.f == b.b.a.a.b.f.pioneer) {
                                fVar.f792a.a(b.b.a.a.b.p.v.a.IFA, "ANALOG,,,,Stereo,2.0 ch,");
                            } else {
                                fVar.f792a.a(b.b.a.a.b.p.v.a.IFA, "HDMI1,PCM,48kHz,5.1ch,Stereo,5.1ch");
                            }
                        } else {
                            b.b.a.a.b.p.v.a aVar3 = b.b.a.a.b.p.v.a.IFV;
                            if (aVar2 == aVar3) {
                                fVar.f792a.a(aVar3, "HDMI1,1920x1080 24Hz,RGB,24bit,Main,1920x1080 24Hz,RGB,24bit,");
                            } else {
                                j.a[] a10 = j.a.a();
                                int length = a10.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        j.a aVar4 = a10[i5];
                                        if (aVar2 == fVar.f793b.j[aVar4.f819b]) {
                                            if (!bVar.a()) {
                                                try {
                                                    fVar.h[aVar4.f819b] = bVar.f913c.c();
                                                } catch (CharConversionException unused6) {
                                                }
                                            }
                                            fVar.f792a.a(bVar.f912b, b.b.a.a.b.p.v.d.a(fVar.h[aVar4.f819b]));
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        l.a[] a11 = l.a.a();
                                        int length2 = a11.length;
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < length2) {
                                                l.a aVar5 = a11[i6];
                                                if (aVar2 == fVar.f793b.i[aVar5.f824b]) {
                                                    if (!bVar.a() && bVar.f913c.f915a.length() == 3) {
                                                        char charAt2 = bVar.f913c.f915a.charAt(0);
                                                        try {
                                                            int a12 = bVar.f913c.a(1, 2);
                                                            if (charAt2 == 'T') {
                                                                fVar.i[aVar5.f824b][0] = a12;
                                                            } else if (charAt2 == 'B') {
                                                                fVar.i[aVar5.f824b][1] = a12;
                                                            }
                                                        } catch (CharConversionException unused7) {
                                                        }
                                                    }
                                                    fVar.f792a.a(bVar.f912b, String.format("T%sB%s", b.b.a.a.b.p.v.d.a(fVar.i[aVar5.f824b][0]), b.b.a.a.b.p.v.d.a(fVar.i[aVar5.f824b][1])));
                                                } else {
                                                    i6++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            return;
        }
        throw null;
    }

    public void a(b.b.a.a.b.p.v.a aVar, String str) {
        g gVar = this.f774a;
        if (gVar != null) {
            gVar.b(aVar, str);
        }
    }
}
