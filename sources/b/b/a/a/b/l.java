package b.b.a.a.b;

import android.util.Log;
import b.b.a.a.b.o.j;
import b.b.a.a.b.o.l;
import b.b.a.a.b.o.m;
import b.b.a.a.b.o.r;
import b.b.a.a.b.o.s;
import b.b.a.a.b.p.d;
import b.b.a.a.e.e;
import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ZoneDevice.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f754a;

    /* renamed from: b, reason: collision with root package name */
    public s f755b;

    /* renamed from: c, reason: collision with root package name */
    public k f756c;
    public b.b.a.a.b.o.c d;
    public j e;
    public ArrayList<b.b.a.a.b.o.l> f;
    public ArrayList<b.b.a.a.b.o.j> g;
    public int j;
    public ArrayList<c> m;
    public ArrayList<Integer> n;
    public b.b.a.a.b.t.c o;
    public b.b.a.a.b.t.b p;
    public boolean r;
    public boolean s;
    public b.b.a.a.b.o.i t;
    public b.b.a.a.b.o.f u;
    public boolean h = false;
    public boolean i = false;
    public b.b.a.a.b.o.i k = null;
    public int l = 0;
    public a q = new a(this);

    /* compiled from: ZoneDevice.java */
    /* loaded from: classes.dex */
    public class a {
        public boolean A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public int F;
        public int G;

        /* renamed from: a, reason: collision with root package name */
        public boolean f757a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f758b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f759c;
        public boolean d;
        public boolean e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q;
        public boolean r;
        public boolean s;
        public boolean t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public boolean y;
        public boolean z;

        public a(l lVar) {
        }
    }

    /* compiled from: ZoneDevice.java */
    /* loaded from: classes.dex */
    public enum b {
        TREBLE,
        BASS
    }

    /* compiled from: ZoneDevice.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f762a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f763b = 0;

        public c(l lVar) {
        }
    }

    public l(b.b.a.a.b.o.c cVar, s sVar, b.b.a.a.b.p.d dVar) {
        this.f754a = dVar;
        this.f755b = sVar;
        this.d = cVar;
        this.f756c = k.m[sVar.f839b.f836b];
        this.j = sVar.e;
        b.b.a.a.b.o.c cVar2 = this.d;
        r rVar = this.f755b.f839b;
        if (cVar2 == null) {
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b.b.a.a.b.o.i> it = cVar2.V.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.i next = it.next();
            if ((next.e & rVar.f837c) != 0) {
                b.b.a.a.b.o.i iVar = new b.b.a.a.b.o.i();
                iVar.f816a = next;
                iVar.f817b = next.f817b;
                iVar.d = next.d;
                iVar.e = next.e;
                iVar.f818c = next.f818c;
                arrayList.add(iVar);
            }
        }
        j jVar = new j();
        jVar.f747a = new b.b.a.a.e.d<>(arrayList);
        this.e = jVar;
        this.f = new ArrayList<>();
        this.m = new ArrayList<>();
        for (l.a aVar : l.a.values()) {
            this.f.add(null);
            this.m.add(new c(this));
        }
        Iterator<b.b.a.a.b.o.l> it2 = cVar.Y.iterator();
        while (it2.hasNext()) {
            b.b.a.a.b.o.l next2 = it2.next();
            if ((next2.e & this.f755b.f839b.f837c) != 0) {
                this.f.set(next2.f.f824b, next2);
            }
        }
        this.g = new ArrayList<>();
        this.n = new ArrayList<>();
        for (j.a aVar2 : j.a.values()) {
            this.g.add(null);
            this.n.add(0);
        }
        Iterator<b.b.a.a.b.o.j> it3 = cVar.Z.iterator();
        while (it3.hasNext()) {
            b.b.a.a.b.o.j next3 = it3.next();
            if ((next3.e & this.f755b.f839b.f837c) != 0) {
                this.g.set(next3.f.f819b, next3);
            }
        }
        this.o = new b.b.a.a.b.t.c(this, this.f754a);
        if (this.e.a(b.b.a.a.b.o.h.TUNER_DAB) != null) {
            this.p = new b.b.a.a.b.t.b(this.f754a);
        }
        a(this.d, this.f755b);
    }

    public void a(boolean z) {
    }

    public boolean a() {
        return false;
    }

    public boolean a(b.b.a.a.b.p.v.b bVar) {
        int ordinal;
        b.b.a.a.b.t.f a2;
        int b2;
        int ordinal2;
        b.b.a.a.b.p.v.a aVar = bVar.f912b;
        if (aVar == b.b.a.a.b.p.v.a.nul) {
            return false;
        }
        k kVar = this.f756c;
        if (aVar == kVar.f751a) {
            try {
                boolean a3 = bVar.f913c.a();
                if (a3 != this.h) {
                    this.h = a3;
                    a(d.f.POWER);
                    if (this.h && this.r) {
                        f();
                    }
                    if (!this.h) {
                        this.f754a.b(this.f755b.f839b);
                    }
                }
            } catch (CharConversionException unused) {
            }
            return true;
        }
        if (aVar == kVar.f752b) {
            try {
                boolean a4 = bVar.f913c.a();
                if (this.i != a4) {
                    this.i = a4;
                    a(d.f.MUTE);
                }
            } catch (CharConversionException unused2) {
            }
            return true;
        }
        if (aVar == kVar.f753c) {
            try {
                int c2 = bVar.f913c.c();
                if (this.j != c2) {
                    this.j = c2;
                    a(d.f.VOLUME);
                }
            } catch (CharConversionException unused3) {
            }
            return true;
        }
        if (aVar == kVar.d) {
            try {
                b.b.a.a.b.o.h a5 = b.b.a.a.b.o.h.a(bVar.f913c.c());
                if (this.k == null || this.k.f817b != a5) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(a5.f815b);
                    objArr[1] = this.s ? "true" : "false";
                    Log.v("Zone", String.format("Selector Changed  %02X  (net changing=%s)", objArr));
                    b.b.a.a.b.o.i iVar = this.k;
                    this.k = this.e.a(a5);
                    if (this.p != null) {
                        if ((iVar == null || iVar.f817b != b.b.a.a.b.o.h.TUNER_DAB) && a5 == b.b.a.a.b.o.h.TUNER_DAB) {
                            b.b.a.a.b.t.b bVar2 = this.p;
                            bVar2.a();
                            bVar2.f1049b = null;
                            bVar2.f1048a.a(b.b.a.a.b.p.v.a.DSN);
                            bVar2.f1048a.a(b.b.a.a.b.p.v.a.PRS);
                            b.b.a.a.e.e a6 = b.b.a.a.e.e.a((e.b) new b.b.a.a.b.t.a(bVar2), true);
                            bVar2.d = a6;
                            a6.a(true, 5000);
                        } else if ((iVar == null || iVar.f817b == b.b.a.a.b.o.h.TUNER_DAB) && a5 != b.b.a.a.b.o.h.TUNER_DAB) {
                            this.p.a();
                        }
                    }
                    i();
                    a(d.f.SELECTOR);
                }
                if (this.s) {
                    this.s = false;
                    if (this.k.f817b == this.t.f817b) {
                        this.f754a.q.a(this.u, true);
                    }
                }
            } catch (CharConversionException unused4) {
            }
            return true;
        }
        if (aVar == kVar.e) {
            try {
                int c3 = bVar.f913c.c();
                if (this.l != c3) {
                    this.l = c3;
                    a(d.f.BALANCE);
                }
            } catch (CharConversionException unused5) {
            }
            return true;
        }
        for (l.a aVar2 : l.a.values()) {
            if (bVar.f912b == this.f756c.i[aVar2.f824b]) {
                String str = bVar.f913c.f915a;
                for (int i = 0; i < 6 && i < str.length(); i += 3) {
                    char charAt = str.charAt(i);
                    if (charAt == 'T' || charAt == 'B') {
                        c cVar = new c(this);
                        try {
                            int a7 = bVar.f913c.a(i + 1, 2);
                            if (charAt == 'T') {
                                cVar.f762a = a7;
                                cVar.f763b = this.m.get(aVar2.f824b).f763b;
                            } else {
                                cVar.f762a = this.m.get(aVar2.f824b).f762a;
                                cVar.f763b = a7;
                            }
                            this.m.set(aVar2.f824b, cVar);
                            a(d.f.TONE);
                        } catch (CharConversionException unused6) {
                        }
                    }
                }
                return true;
            }
        }
        for (j.a aVar3 : j.a.values()) {
            if (bVar.f912b == this.f756c.j[aVar3.f819b]) {
                try {
                    this.n.set(aVar3.f819b, Integer.valueOf(bVar.f913c.c()));
                    a(d.f.SP_LEVEL);
                } catch (CharConversionException unused7) {
                }
                return true;
            }
        }
        b.b.a.a.b.t.b bVar3 = this.p;
        if (bVar3 != null && bVar3.f1048a.b().e() == b.b.a.a.b.o.h.TUNER_DAB && (ordinal2 = bVar.f912b.ordinal()) != 78) {
            if (ordinal2 == 82) {
                try {
                    int c4 = bVar.f913c.c();
                    if (bVar3.f1050c != c4) {
                        bVar3.f1050c = c4;
                        bVar3.f1048a.a(d.f.TUNER_PRESET, bVar3.f1048a.f851b);
                    }
                } catch (CharConversionException unused8) {
                }
            } else if (ordinal2 == 87) {
                b.b.a.a.b.p.v.d dVar = bVar.f913c;
                String str2 = bVar3.f1049b;
                if (str2 == null || !str2.equals(dVar.f915a)) {
                    bVar3.f1049b = dVar.f915a.trim();
                    b.b.a.a.b.p.d dVar2 = bVar3.f1048a;
                    dVar2.a(d.f.RADIO_STATION, dVar2.f851b);
                }
            }
        }
        b.b.a.a.b.p.v.a aVar4 = bVar.f912b;
        k kVar2 = this.f756c;
        if (aVar4 == kVar2.f) {
            b.b.a.a.b.t.c cVar2 = this.o;
            if (cVar2 != null) {
                try {
                    ordinal = cVar2.f1052b.d().ordinal();
                } catch (CharConversionException unused9) {
                }
                if (ordinal == 17) {
                    a2 = cVar2.a(m.FM);
                    b2 = bVar.f913c.b() * 10;
                } else if (ordinal != 18) {
                    if (ordinal != 30) {
                        return true;
                    }
                    a2 = cVar2.a(m.XM);
                    b2 = bVar.f913c.b();
                } else {
                    a2 = cVar2.a(m.AM);
                    b2 = bVar.f913c.b();
                }
                if (a2.f1058a <= b2 && b2 <= a2.f1059b) {
                    cVar2.d = b2;
                    cVar2.f1051a.a(d.f.RADIO_TUNING, cVar2.f1052b.f755b.f839b);
                }
                return true;
            }
            throw null;
        }
        if (aVar4 != kVar2.g) {
            return false;
        }
        b.b.a.a.b.t.c cVar3 = this.o;
        if (cVar3 != null) {
            try {
                int c5 = bVar.f913c.c();
                if (cVar3.f != null) {
                    if (cVar3.f.f831a == c5) {
                        b.b.a.a.b.t.e eVar = cVar3.f1051a.l;
                        eVar.a(cVar3.f);
                        if (b.b.a.a.b.o.i.c(eVar.f1055a.b().d())) {
                            b.b.a.a.b.p.d dVar3 = eVar.f1055a;
                            dVar3.a(d.f.TUNER_PRESET_LIST, dVar3.f851b);
                        }
                    }
                    cVar3.f = null;
                }
                if (c5 != cVar3.e) {
                    cVar3.e = c5;
                    cVar3.f1051a.a(d.f.RADIO_TUNING, cVar3.f1052b.f755b.f839b);
                    cVar3.f1051a.a(d.f.TUNER_PRESET, cVar3.f1052b.f755b.f839b);
                }
            } catch (CharConversionException unused10) {
            }
            return false;
        }
        throw null;
    }

    public b.b.a.a.b.p.v.a b() {
        if (this.f754a.f852c.f801c < 2012) {
            return this.f756c.h;
        }
        return b.b.a.a.b.p.v.a.NTC;
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
        this.f754a.a(this.f756c.f751a, b.b.a.a.b.p.v.d.a(z));
        if (z) {
            return;
        }
        this.f754a.b(this.f755b.f839b);
    }

    public boolean c() {
        return false;
    }

    public b.b.a.a.b.o.h d() {
        b.b.a.a.b.o.h e = e();
        return (this.f755b.f839b == r.MAIN || e != b.b.a.a.b.o.h.SOURCE) ? e : this.f754a.a(r.MAIN).e();
    }

    public void d(boolean z) {
    }

    public b.b.a.a.b.o.h e() {
        b.b.a.a.b.o.i iVar = this.k;
        if (iVar != null) {
            return iVar.f817b;
        }
        return b.b.a.a.b.o.h.UNKNOWN;
    }

    public void f() {
        this.r = false;
        if (this.f755b.d) {
            this.f754a.a(this.f756c.f752b);
            this.f754a.a(this.f756c.f753c);
        }
        if (this.q.m) {
            this.f754a.a(this.f756c.e);
        }
        for (l.a aVar : l.a.values()) {
            if ((this.q.F & aVar.f825c) != 0) {
                this.f754a.a(this.f756c.i[aVar.f824b]);
            }
        }
        for (j.a aVar2 : j.a.values()) {
            if ((this.q.G & aVar2.f820c) != 0) {
                this.f754a.a(this.f756c.j[aVar2.f819b]);
            }
        }
        this.f754a.a(this.f756c.f);
        this.f754a.a(this.f756c.g);
        b.b.a.a.b.t.b bVar = this.p;
        if (bVar != null) {
            bVar.f1048a.a(b.b.a.a.b.p.v.a.TUN);
        }
    }

    public boolean g() {
        return false;
    }

    public void h() {
    }

    public void i() {
        m mVar;
        b.b.a.a.b.t.c cVar;
        m mVar2;
        int ordinal = d().ordinal();
        if (ordinal == 17) {
            mVar = m.FM;
        } else if (ordinal == 18) {
            mVar = m.AM;
        } else if (ordinal != 30 && ordinal != 31) {
            mVar = m.NONE;
        } else {
            mVar = m.XM;
        }
        if (mVar == m.NONE || mVar == (mVar2 = (cVar = this.o).f1053c)) {
            return;
        }
        if (mVar2 != mVar) {
            cVar.f1053c = mVar;
            cVar.d = 0;
        }
        this.f754a.a(this.f756c.f);
        this.f754a.a(this.f756c.g);
        if (this.f755b.f839b == r.MAIN) {
            Iterator<Map.Entry<r, l>> it = this.f754a.d.entrySet().iterator();
            while (it.hasNext()) {
                l value = it.next().getValue();
                if (value.f755b.f839b != r.MAIN && value.e() == b.b.a.a.b.o.h.SOURCE) {
                    value.i();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.b.a.a.b.o.c r7, b.b.a.a.b.o.s r8) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.l.a(b.b.a.a.b.o.c, b.b.a.a.b.o.s):void");
    }

    public void a(b.b.a.a.b.o.i iVar) {
        boolean z;
        boolean z2 = false;
        if (this.f754a.q.g() == b.b.a.a.b.o.e.THIS_DEVICE) {
            b.b.a.a.b.u.d dVar = this.f754a.u;
            if (dVar != null) {
                dVar.stop();
            }
            if (iVar.f817b == b.b.a.a.b.o.h.NETWORK) {
                b.b.a.a.b.p.d dVar2 = this.f754a;
                dVar2.q.a(dVar2.p.a(b.b.a.a.b.o.e.NET_TOP), false);
            }
        }
        b.b.a.a.b.p.d dVar3 = this.f754a;
        dVar3.q.a(iVar.f817b, this, dVar3.f851b == this.f755b.f839b);
        b.b.a.a.b.o.i a2 = this.e.a(iVar.f817b);
        if (a2 != null) {
            this.f754a.a(this.f756c.d, String.format("%02X", Integer.valueOf(a2.f817b.f815b)));
            z = true;
        } else {
            z = false;
        }
        if (z) {
            b.b.a.a.b.p.d dVar4 = this.f754a;
            r rVar = this.f755b.f839b;
            b.b.a.a.b.o.h hVar = iVar.f817b;
            if (dVar4.f852c.f801c == 2011 && rVar != r.MAIN && hVar == b.b.a.a.b.o.h.NETWORK) {
                Iterator<l> it = dVar4.d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    l next = it.next();
                    if (rVar != next.f755b.f839b && next.e() == b.b.a.a.b.o.h.NETWORK) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return;
                }
                dVar4.q.a(dVar4.p.a(b.b.a.a.b.o.e.NET_TOP), true);
            }
        }
    }

    public void a(b.b.a.a.b.o.f fVar) {
        b.b.a.a.b.o.e eVar;
        b.b.a.a.b.u.d dVar;
        b.b.a.a.b.r.l lVar = this.f754a.q;
        b.b.a.a.b.o.i a2 = this.e.a(b.b.a.a.b.o.h.NETWORK);
        if (a2 == null) {
            int ordinal = fVar.f808a.ordinal();
            if (ordinal != 0 && ordinal != 27) {
                a2 = this.e.a(b.b.a.a.b.o.h.INTERNET_RADIO);
            } else {
                a2 = this.e.a(b.b.a.a.b.o.h.MUSIC_SERVER);
            }
        }
        b.b.a.a.b.o.e g = lVar.g();
        b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.THIS_DEVICE;
        if (g == eVar2 && fVar.f808a != eVar2 && (dVar = this.f754a.u) != null) {
            dVar.stop();
        }
        boolean z = (a2 == null || a2.f817b == e()) ? false : true;
        if (lVar.g() != fVar.f808a && lVar.g() == b.b.a.a.b.o.e.DLNA && fVar.f808a == b.b.a.a.b.o.e.THIS_DEVICE) {
            lVar.k().f();
            z = true;
        }
        if (lVar.g() == b.b.a.a.b.o.e.THIS_DEVICE && ((eVar = fVar.f808a) == b.b.a.a.b.o.e.DLNA || eVar == b.b.a.a.b.o.e.NET_TOP)) {
            z = true;
        }
        if (z) {
            this.s = true;
            this.t = a2;
            this.u = fVar;
            a(a2);
            return;
        }
        lVar.a(fVar, false);
    }

    public b.b.a.a.b.o.l a(l.a aVar) {
        return this.f.get(aVar.f824b);
    }

    public int a(l.a aVar, b bVar) {
        if ((this.q.F & aVar.f825c) == 0) {
            return 0;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return this.m.get(aVar.f824b).f762a;
        }
        if (ordinal != 1) {
            return 0;
        }
        return this.m.get(aVar.f824b).f763b;
    }

    public void a(l.a aVar, b bVar, int i) {
        b.b.a.a.b.o.l lVar;
        b.b.a.a.b.p.v.a aVar2;
        if ((aVar == l.a.SUBWOOFER && bVar == b.TREBLE) || (lVar = this.f.get(aVar.f824b)) == null) {
            return;
        }
        int i2 = this.q.F;
        l.a aVar3 = lVar.f;
        if ((i2 & aVar3.f825c) == 0 || (aVar2 = this.f756c.i[aVar3.f824b]) == b.b.a.a.b.p.v.a.nul) {
            return;
        }
        int i3 = lVar.f823c;
        if (i >= i3) {
            i = i3;
        }
        int i4 = lVar.f822b;
        if (i < i4) {
            i = i4;
        }
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            this.f754a.a(aVar2, aVar2, String.format("T%s", b.b.a.a.b.p.v.d.a(i)));
        } else {
            if (ordinal != 1) {
                return;
            }
            this.f754a.a(aVar2, aVar2, String.format("B%s", b.b.a.a.b.p.v.d.a(i)));
        }
    }

    public void a(d.f fVar) {
        this.f754a.a(fVar, this.f755b.f839b);
    }
}
