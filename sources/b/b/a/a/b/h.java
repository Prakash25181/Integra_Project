package b.b.a.a.b;

import b.b.a.a.b.l;
import b.b.a.a.b.o.c;
import b.b.a.a.b.o.q;
import b.b.a.a.b.o.r;
import b.b.a.a.b.o.s;
import b.b.a.a.b.p.d;
import java.io.CharConversionException;
import java.util.ArrayList;

/* compiled from: MainZone.java */
/* loaded from: classes.dex */
public class h extends l {
    public q A;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public b.b.a.a.b.o.a z;

    public h(b.b.a.a.b.o.c cVar, s sVar, b.b.a.a.b.p.d dVar) {
        super(cVar, sVar, dVar);
        this.y = c.EnumC0028c.UNKNOWN.f805c;
    }

    @Override // b.b.a.a.b.l
    public void a(b.b.a.a.b.o.c cVar, s sVar) {
        super.a(cVar, sVar);
        l.a aVar = this.q;
        boolean z = cVar.i;
        aVar.f758b = z;
        boolean z2 = cVar.j;
        aVar.f759c = z2;
        boolean z3 = cVar.k;
        aVar.d = z3;
        boolean z4 = cVar.l;
        aVar.e = z4;
        boolean z5 = cVar.m;
        aVar.f = z5;
        boolean z6 = cVar.n;
        aVar.g = z6;
        boolean z7 = cVar.o;
        aVar.h = z7;
        if (z || z2 || z3 || z4 || z5 || z6 || z7) {
            this.q.f757a = true;
        }
        l.a aVar2 = this.q;
        aVar2.m = false;
        aVar2.F = cVar.b(r.MAIN);
        l.a aVar3 = this.q;
        aVar3.l = aVar3.F != 0;
        this.q.G = cVar.a(r.MAIN);
        l.a aVar4 = this.q;
        aVar4.i = cVar.p;
        aVar4.j = cVar.q;
        aVar4.k = cVar.L;
        aVar4.C = !cVar.H;
        aVar4.D = !cVar.I;
    }

    @Override // b.b.a.a.b.l
    public void b(boolean z) {
        if (this.q.i) {
            this.f754a.a(b.b.a.a.b.p.v.a.PMB, b.b.a.a.b.p.v.d.a(z));
        }
    }

    @Override // b.b.a.a.b.l
    public boolean c() {
        return this.v;
    }

    @Override // b.b.a.a.b.l
    public void d(boolean z) {
        if (this.q.j) {
            this.f754a.a(b.b.a.a.b.p.v.a.DIR, b.b.a.a.b.p.v.d.a(z));
        }
    }

    public void e(boolean z) {
        if (z) {
            this.z = null;
        }
        if (this.q.C) {
            this.f754a.a(b.b.a.a.b.p.v.a.IFA);
        }
    }

    @Override // b.b.a.a.b.l
    public void f() {
        super.f();
        if (this.q.i) {
            this.f754a.a(b.b.a.a.b.p.v.a.PMB);
        }
        if (this.q.j) {
            this.f754a.a(b.b.a.a.b.p.v.a.DIR);
        }
        if (this.q.k) {
            this.f754a.a(b.b.a.a.b.p.v.a.MOT);
        }
        if (this.q.f757a) {
            this.f754a.a(b.b.a.a.b.p.v.a.LMD);
        }
    }

    @Override // b.b.a.a.b.l
    public boolean g() {
        return this.w;
    }

    @Override // b.b.a.a.b.l
    public void h() {
        if (this.q.i) {
            this.f754a.a(b.b.a.a.b.p.v.a.PMB);
        }
        if (this.q.j) {
            this.f754a.a(b.b.a.a.b.p.v.a.DIR);
        }
        if (this.q.k) {
            this.f754a.a(b.b.a.a.b.p.v.a.MOT);
        }
    }

    @Override // b.b.a.a.b.l
    public boolean a() {
        return this.x;
    }

    @Override // b.b.a.a.b.l
    public void a(boolean z) {
        if (this.q.k) {
            this.f754a.a(b.b.a.a.b.p.v.a.MOT, b.b.a.a.b.p.v.d.a(z));
        }
    }

    @Override // b.b.a.a.b.l
    public boolean a(b.b.a.a.b.p.v.b bVar) {
        ArrayList<String> a2;
        boolean z = false;
        switch (bVar.f912b.ordinal()) {
            case 33:
                try {
                    boolean a3 = bVar.f913c.a();
                    if (this.q.i) {
                        this.v = a3;
                        a(d.f.PMB);
                    }
                } catch (CharConversionException unused) {
                }
                return true;
            case 34:
                try {
                    boolean a4 = bVar.f913c.a();
                    if (this.q.j) {
                        this.w = a4;
                        a(d.f.TONE_DIRECT);
                    }
                } catch (CharConversionException unused2) {
                }
                return true;
            case 35:
                try {
                    boolean a5 = bVar.f913c.a();
                    if (this.q.k) {
                        this.x = a5;
                        a(d.f.MUSIC_OPTIMIZER);
                    }
                } catch (CharConversionException unused3) {
                }
                return true;
            case 36:
                try {
                    if (c.EnumC0028c.x0.get(Integer.valueOf(bVar.f913c.c())) == null) {
                        c.EnumC0028c enumC0028c = c.EnumC0028c.UNKNOWN;
                    }
                    a(d.f.LISTENING_MODE);
                    e(false);
                } catch (CharConversionException unused4) {
                }
                return true;
            case 37:
                b.b.a.a.b.p.v.d dVar = bVar.f913c;
                if (dVar.f915a.equals("N/A")) {
                    this.y = null;
                    a(d.f.LISTENING_MODE_DISPLAY_NAME);
                    a2 = null;
                } else {
                    a2 = a(dVar.f915a.split(","));
                    if (a2.size() >= 5) {
                        this.y = a2.get(4);
                        a(d.f.LISTENING_MODE_DISPLAY_NAME);
                    }
                }
                if (a2 != null) {
                    if (this.z == null) {
                        this.z = new b.b.a.a.b.o.a();
                    }
                    b.b.a.a.b.o.a aVar = this.z;
                    if (aVar != null) {
                        if (a2.size() >= 6) {
                            String str = a2.get(0);
                            String str2 = a2.get(1);
                            String a6 = aVar.a(a2.get(2), a2.get(3));
                            String str3 = a2.get(4);
                            String str4 = a2.get(5);
                            if (!aVar.b(aVar.f796a, str)) {
                                aVar.f796a = str;
                                z = true;
                            }
                            if (!aVar.b(aVar.f797b, str2)) {
                                aVar.f797b = str2;
                                z = true;
                            }
                            if (!aVar.b(aVar.f798c, a6)) {
                                aVar.f798c = a6;
                                z = true;
                            }
                            if (!aVar.b(aVar.d, str3)) {
                                aVar.d = str3;
                                z = true;
                            }
                            if (!aVar.b(aVar.e, str4)) {
                                aVar.e = str4;
                                z = true;
                            }
                        }
                        if (z) {
                            a(d.f.AUDIO_INFO_UPDATED);
                        }
                    } else {
                        throw null;
                    }
                } else if (this.z != null) {
                    this.z = null;
                    a(d.f.AUDIO_INFO_UPDATED);
                }
                return true;
            case 38:
                b.b.a.a.b.p.v.d dVar2 = bVar.f913c;
                ArrayList<String> a7 = dVar2.f915a.equals("N/A") ? null : a(dVar2.f915a.split(","));
                if (a7 != null) {
                    if (this.A == null) {
                        this.A = new q();
                    }
                    q qVar = this.A;
                    if (qVar != null) {
                        if (a7.size() >= 4) {
                            String str5 = a7.get(0);
                            String str6 = a7.get(1);
                            String a8 = qVar.a(a7.get(2), a7.get(3));
                            if (!qVar.b(qVar.f833a, str5)) {
                                qVar.f833a = str5;
                                z = true;
                            }
                            if (!qVar.b(qVar.f834b, str6)) {
                                qVar.f834b = str6;
                                z = true;
                            }
                            if (!qVar.b(qVar.f835c, a8)) {
                                qVar.f835c = a8;
                                z = true;
                            }
                        }
                        if (a7.size() >= 8) {
                            String str7 = a7.get(4);
                            String str8 = a7.get(5);
                            String str9 = a7.get(6);
                            String str10 = a7.get(7);
                            if (!qVar.b(qVar.d, str7)) {
                                qVar.d = str7;
                                z = true;
                            }
                            if (!qVar.b(qVar.e, str8)) {
                                qVar.e = str8;
                                z = true;
                            }
                            if (str9 != null && str9.toLowerCase().equals("none")) {
                                str9 = null;
                            }
                            String a9 = qVar.a(str9, (str10 == null || !str10.toLowerCase().equals("none")) ? str10 : null);
                            if (!qVar.b(qVar.f, a9)) {
                                qVar.f = a9;
                                z = true;
                            }
                        }
                        if (z) {
                            a(d.f.VIDEO_INFO_UPDATED);
                        }
                    } else {
                        throw null;
                    }
                } else if (this.A != null) {
                    this.A = null;
                    a(d.f.VIDEO_INFO_UPDATED);
                }
                return true;
            default:
                return super.a(bVar);
        }
    }

    public final ArrayList<String> a(String[] strArr) {
        char charAt;
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            StringBuilder sb = new StringBuilder(str.length());
            int i = 0;
            int i2 = 0;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt2 == ' ' || charAt2 == '\t') {
                    if (i2 < i) {
                        sb.append(str.substring(i2, i + 1));
                    }
                    i2 = i + 1;
                    while (i2 < str.length() && ((charAt = str.charAt(i2)) == ' ' || charAt == '\t')) {
                        i2++;
                    }
                    i = i2;
                } else {
                    i++;
                }
            }
            if (i2 < i) {
                sb.append(str.substring(i2, i));
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }
}
