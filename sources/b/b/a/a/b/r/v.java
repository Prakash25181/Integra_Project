package b.b.a.a.b.r;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import b.b.a.a.b.r.e;
import b.b.a.a.e.e;
import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NetUsbPlayer.java */
/* loaded from: classes.dex */
public class v implements e.a {
    public b.b.a.a.e.e A;
    public long B;
    public boolean C;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;
    public int j;
    public int k;
    public Bitmap l;
    public boolean m;
    public b p;
    public b q;
    public b.b.a.a.b.p.d r;
    public l s;
    public b.b.a.a.b.r.e t;
    public boolean u;
    public boolean v;
    public boolean w;
    public String x;
    public String y;
    public String z;

    /* renamed from: a, reason: collision with root package name */
    public d f1009a = new d(this);

    /* renamed from: b, reason: collision with root package name */
    public h f1010b = h.STOP;

    /* renamed from: c, reason: collision with root package name */
    public f f1011c = f.DISABLE;
    public e d = e.DISABLE;
    public g n = g.UNKNOWN;
    public i o = i.NONE;

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum a {
        CONTENT_CHANGE,
        ARTIST,
        ALBUM,
        TITLE,
        TIME,
        DURATION,
        TRACK,
        JACKET_IMAGE,
        SEEK_CAPABILITY,
        MENU_STATUS
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE(0),
        LIKE1(1),
        DONT_LIKE2(2),
        LOVE(3),
        BAN(4),
        EPISODE(5),
        RATINGS(6),
        BAN_BLACK(7),
        BAN_WHITE(8),
        FAVORITE_BLACK(9),
        FAVORITE_WHITE(10),
        FAVORITE_YELLOW(11),
        LIKE2(12),
        DONT_LIKE1(13);


        /* renamed from: b, reason: collision with root package name */
        public int f1015b;

        b(int i) {
            this.f1015b = i;
        }
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(a aVar);

        void a(h hVar);

        void c();
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum e {
        OFF,
        ALL,
        ALBUM,
        FOLDER,
        DISABLE
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum f {
        OFF,
        ALL,
        FOLDER,
        ONE,
        DISABLE
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum g {
        UNKNOWN,
        IMPOSSIBLE,
        POSSIBLE
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum h {
        STOP,
        EOF,
        PAUSE,
        PLAY,
        FF,
        REW
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public enum i {
        NONE,
        ELLAPSE,
        ELLAPSE_TOTAL
    }

    public v(b.b.a.a.b.p.d dVar, l lVar) {
        b bVar = b.NONE;
        this.p = bVar;
        this.q = bVar;
        this.C = true;
        this.r = dVar;
        this.s = lVar;
        this.v = dVar.f852c.f801c < 2013;
        e();
    }

    public final String a(b.b.a.a.b.p.v.d dVar) {
        String str = dVar.f915a;
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    public boolean b() {
        return this.s.g() == b.b.a.a.b.o.e.RADIKO || this.s.g() == b.b.a.a.b.o.e.SERIUS_XM || this.s.g() == b.b.a.a.b.o.e.TUNEIN || this.s.g() == b.b.a.a.b.o.e.INTERNET_RADIO || this.s.g() == b.b.a.a.b.o.e.VTUNER;
    }

    public final void c() {
        if (this.u) {
            this.u = false;
            if (this.s.g() == b.b.a.a.b.o.e.RADIKO) {
                this.l = null;
            }
            this.f1009a.a(a.CONTENT_CHANGE);
        }
    }

    public final void d() {
        b.b.a.a.e.e eVar = this.A;
        if (eVar != null) {
            eVar.a();
            this.A = null;
        }
        b.b.a.a.e.e a2 = b.b.a.a.e.e.a((e.b) new u(this), true);
        this.A = a2;
        a2.a(false, 1500);
    }

    public void e() {
        this.g = "";
        this.f = "";
        this.e = "";
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.l = null;
        this.f1010b = h.STOP;
        if (this.v) {
            this.n = g.IMPOSSIBLE;
            this.o = i.NONE;
        }
        b.b.a.a.b.r.e eVar = this.t;
        if (eVar != null) {
            eVar.b();
        }
        this.u = true;
        this.f1009a.a(h.STOP);
        this.f1009a.c();
        this.f1009a.a(a.CONTENT_CHANGE);
        this.f1009a.a(a.ARTIST);
        this.f1009a.a(a.ALBUM);
        this.f1009a.a(a.TITLE);
        this.f1009a.a(a.TIME);
        this.f1009a.a(a.DURATION);
        this.f1009a.a(a.TRACK);
        this.f1009a.a(a.JACKET_IMAGE);
        this.f1009a.a(a.SEEK_CAPABILITY);
        this.f1009a.a(a.MENU_STATUS);
    }

    public void f() {
        this.s.a("STOP");
    }

    public void g() {
        this.r.a(b.b.a.a.b.p.v.a.NAT);
        this.r.a(b.b.a.a.b.p.v.a.NAL);
        this.r.a(b.b.a.a.b.p.v.a.NTI);
        this.r.a(b.b.a.a.b.p.v.a.NTM);
        this.r.a(b.b.a.a.b.p.v.a.NTR);
        this.r.a(b.b.a.a.b.p.v.a.NST);
        this.r.a(b.b.a.a.b.p.v.a.NMS);
        b.b.a.a.b.p.d dVar = this.r;
        if (dVar.f852c.J) {
            dVar.a(b.b.a.a.b.p.v.a.NJA, "REQ");
        }
    }

    /* compiled from: NetUsbPlayer.java */
    /* loaded from: classes.dex */
    public class d extends b.b.a.a.e.b<c> implements c {
        public d(v vVar) {
        }

        @Override // b.b.a.a.b.r.v.c
        public void a(h hVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(hVar);
            }
        }

        @Override // b.b.a.a.b.r.v.c
        public void c() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).c();
            }
        }

        @Override // b.b.a.a.b.r.v.c
        public void a(a aVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(aVar);
            }
        }
    }

    public String a(int i2) {
        if (i2 == -1) {
            return "--:--";
        }
        int i3 = this.h;
        if (i3 != -1 && i3 >= 3600) {
            int i4 = i2 / 3600;
            int i5 = i2 - (i4 * 3600);
            int i6 = i5 / 60;
            return String.format("%2d:%02d:%02d", Integer.valueOf(i4), Integer.valueOf(i6), Integer.valueOf(i5 - (i6 * 60)));
        }
        int i7 = i2 / 60;
        return String.format("%2d:%02d", Integer.valueOf(i7), Integer.valueOf(i2 - (i7 * 60)));
    }

    public final int b(String str) {
        int i2 = -1;
        if (!str.equals("--:--")) {
            String[] split = str.split(":");
            try {
                if (str.length() == 8 && split.length == 3) {
                    int parseInt = Integer.parseInt(split[0]);
                    int parseInt2 = Integer.parseInt(split[1]);
                    int parseInt3 = Integer.parseInt(split[2]);
                    if (parseInt2 >= 0 && parseInt2 <= 59 && parseInt3 >= 0 && parseInt3 <= 59) {
                        i2 = (parseInt2 * 60) + (parseInt * 3600) + parseInt3;
                    }
                } else if (str.length() == 5 && split.length == 2) {
                    int parseInt4 = Integer.parseInt(split[0]);
                    int parseInt5 = Integer.parseInt(split[1]);
                    if (parseInt5 >= 0 && parseInt5 <= 59) {
                        i2 = (parseInt4 * 60) + parseInt5;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return i2;
    }

    public boolean a(b.b.a.a.b.p.v.b bVar) {
        ArrayList<e.b> arrayList;
        int b2;
        int i2;
        int i3;
        h hVar;
        f fVar;
        e eVar;
        boolean z;
        i iVar;
        if (this.s.g() == b.b.a.a.b.o.e.BLUETOOTH) {
            return false;
        }
        int ordinal = bVar.f912b.ordinal();
        e.b bVar2 = null;
        if (ordinal != 14) {
            int i4 = -1;
            switch (ordinal) {
                case 5:
                    b.b.a.a.b.p.v.d dVar = bVar.f913c;
                    c();
                    this.y = a(dVar);
                    d();
                    return true;
                case 6:
                    b.b.a.a.b.p.v.d dVar2 = bVar.f913c;
                    c();
                    this.z = a(dVar2);
                    d();
                    return true;
                case 7:
                    b.b.a.a.b.p.v.d dVar3 = bVar.f913c;
                    c();
                    this.x = a(dVar3);
                    d();
                    return true;
                case 8:
                    String[] split = bVar.f913c.f915a.split("/", 2);
                    int length = split.length;
                    if (length != 1) {
                        if (length == 2) {
                            b2 = b(split[0]);
                            i2 = b(split[1]);
                        }
                        return true;
                    }
                    b2 = b(split[0]);
                    i2 = -1;
                    if (i2 != this.h) {
                        this.h = i2;
                        r2 = true;
                    }
                    if (b2 != this.i) {
                        this.i = b2;
                    }
                    if (this.v && this.o == i.NONE && !b()) {
                        if (this.i != -1) {
                            if (this.h != -1) {
                                this.o = i.ELLAPSE_TOTAL;
                            } else {
                                this.o = i.ELLAPSE;
                            }
                        }
                        this.f1009a.a(a.SEEK_CAPABILITY);
                    }
                    if (r2) {
                        this.f1009a.a(a.DURATION);
                    } else {
                        this.f1009a.a(a.TIME);
                    }
                    return true;
                case 9:
                    String[] split2 = bVar.f913c.f915a.split("/", 2);
                    c();
                    if (split2.length == 2) {
                        String str = split2[1];
                        try {
                            i3 = Integer.parseInt(split2[0]);
                        } catch (NumberFormatException unused) {
                            i3 = -1;
                        }
                        try {
                            i4 = Integer.parseInt(split2[1]);
                        } catch (NumberFormatException unused2) {
                        }
                        if (this.j != i3 || this.k != i4) {
                            this.j = i3;
                            this.k = i4;
                            this.f1009a.a(a.TRACK);
                        }
                    }
                    return true;
                case 10:
                    b.b.a.a.b.p.v.d dVar4 = bVar.f913c;
                    if (dVar4.f915a.length() == 3) {
                        char charAt = dVar4.f915a.charAt(0);
                        if (charAt == 'E') {
                            hVar = h.EOF;
                        } else if (charAt == 'F') {
                            hVar = h.FF;
                        } else if (charAt == 'P') {
                            hVar = h.PLAY;
                        } else if (charAt == 'p') {
                            hVar = h.PAUSE;
                        } else if (charAt == 'R') {
                            hVar = h.REW;
                        } else if (charAt != 'S') {
                            hVar = h.STOP;
                        } else {
                            hVar = h.STOP;
                        }
                        if (this.f1010b != hVar) {
                            b.b.a.a.e.e eVar2 = this.A;
                            if (eVar2 != null) {
                                eVar2.a();
                                this.A = null;
                            }
                            boolean z2 = System.currentTimeMillis() - this.B < 5000;
                            if (b(hVar)) {
                                if (a(this.f1010b) && !z2) {
                                    this.u = true;
                                }
                                this.w = false;
                            }
                            if (b(this.f1010b) && a(hVar)) {
                                c();
                                a();
                                if (!this.w && !z2) {
                                    this.l = null;
                                    this.f1009a.a(a.JACKET_IMAGE);
                                }
                                this.B = 0L;
                            }
                            this.f1010b = hVar;
                            this.f1009a.a(hVar);
                            if (this.C && !b(this.f1010b)) {
                                this.C = false;
                                g();
                            }
                            if (this.f1010b == h.STOP) {
                                g();
                            }
                        }
                        char charAt2 = dVar4.f915a.charAt(1);
                        if (charAt2 == '-') {
                            fVar = f.OFF;
                        } else if (charAt2 == '1') {
                            fVar = f.ONE;
                        } else if (charAt2 == 'F') {
                            fVar = f.FOLDER;
                        } else if (charAt2 == 'R') {
                            fVar = f.ALL;
                        } else if (charAt2 != 'x') {
                            fVar = f.OFF;
                        } else {
                            fVar = f.DISABLE;
                        }
                        if (this.f1011c != fVar) {
                            this.f1011c = fVar;
                            this.f1009a.c();
                        }
                        char charAt3 = dVar4.f915a.charAt(2);
                        if (charAt3 == '-') {
                            eVar = e.OFF;
                        } else if (charAt3 == 'A') {
                            eVar = e.ALBUM;
                        } else if (charAt3 == 'F') {
                            eVar = e.FOLDER;
                        } else if (charAt3 == 'S') {
                            eVar = e.ALL;
                        } else if (charAt3 != 'x') {
                            eVar = e.DISABLE;
                        } else {
                            eVar = e.DISABLE;
                        }
                        if (this.d != eVar) {
                            this.d = eVar;
                            this.f1009a.c();
                        }
                    }
                    return true;
                case 11:
                    b.b.a.a.b.p.v.d dVar5 = bVar.f913c;
                    if (dVar5.f915a.length() == 9) {
                        boolean z3 = dVar5.f915a.charAt(0) == 'M';
                        if (this.m != z3) {
                            this.m = z3;
                            z = true;
                        } else {
                            z = false;
                        }
                        b a2 = a(dVar5.f915a.substring(1, 3));
                        if (this.p != a2) {
                            this.p = a2;
                            z = true;
                        }
                        b a3 = a(dVar5.f915a.substring(3, 5));
                        if (this.q != a3) {
                            this.q = a3;
                            z = true;
                        }
                        g gVar = dVar5.f915a.charAt(5) == 'S' ? g.POSSIBLE : g.IMPOSSIBLE;
                        char charAt4 = dVar5.f915a.charAt(6);
                        if (charAt4 == '1') {
                            iVar = i.ELLAPSE_TOTAL;
                        } else if (charAt4 != '2') {
                            iVar = i.NONE;
                        } else {
                            iVar = i.ELLAPSE;
                        }
                        if (b()) {
                            gVar = g.IMPOSSIBLE;
                            iVar = i.NONE;
                        }
                        r2 = (this.n == gVar && this.o == iVar) ? false : true;
                        this.n = gVar;
                        this.o = iVar;
                        if (z) {
                            this.f1009a.a(a.MENU_STATUS);
                        }
                        if (r2) {
                            this.f1009a.a(a.SEEK_CAPABILITY);
                        }
                    }
                    return true;
                default:
                    return false;
            }
        }
        h hVar2 = this.f1010b;
        if (hVar2 == h.STOP || hVar2 == h.EOF) {
            this.w = true;
        }
        if (this.t == null) {
            Log.d("<IscpImageReceiver>", "create()");
            this.t = new b.b.a.a.b.r.e(this);
        }
        b.b.a.a.b.r.e eVar3 = this.t;
        if (eVar3 == null) {
            throw null;
        }
        if (bVar.f912b == b.b.a.a.b.p.v.a.NJA) {
            try {
                boolean a4 = bVar.f913c.a("ENA", "DIS");
                eVar3.d = a4;
                if (!a4) {
                    eVar3.b();
                }
            } catch (CharConversionException unused3) {
                eVar3.d = false;
                b.b.a.a.b.p.v.d dVar6 = bVar.f913c;
                e.c cVar = e.c.h.get(Character.valueOf(dVar6.f915a.charAt(0)));
                if (cVar == null) {
                    cVar = e.c.UNKNOWN;
                }
                b.b.a.a.e.e eVar4 = eVar3.i;
                if (eVar4 != null) {
                    eVar4.a();
                    eVar3.i = null;
                }
                eVar3.j = 0;
                eVar3.g.a();
                int ordinal2 = cVar.ordinal();
                if (ordinal2 == 1) {
                    eVar3.h = null;
                } else if (ordinal2 != 4) {
                    char charAt5 = dVar6.f915a.charAt(1);
                    if (charAt5 == '0') {
                        eVar3.a();
                        if (cVar != e.c.UNKNOWN) {
                            eVar3.f956b = cVar;
                            eVar3.f955a = new ArrayList<>();
                        }
                    } else if (eVar3.f955a != null) {
                        if (cVar != eVar3.f956b) {
                            eVar3.a();
                        }
                    }
                    int length2 = dVar6.f915a.length();
                    if ((length2 & 1) == 0 && length2 <= 1026) {
                        bVar2 = new e.b(eVar3);
                        String str2 = dVar6.f915a;
                        for (int i5 = 2; i5 < length2 && str2.charAt(i5) != 0; i5 += 2) {
                            int i6 = i5 + 1;
                            if (str2.charAt(i6) == 0) {
                                break;
                            }
                            try {
                                bVar2.f959b[bVar2.f958a] = (byte) (eVar3.a(str2.charAt(i6)) | (eVar3.a(str2.charAt(i5)) << 4));
                                bVar2.f958a++;
                            } catch (CharConversionException unused4) {
                            }
                        }
                    }
                    if (bVar2 == null) {
                        eVar3.a();
                    } else {
                        eVar3.f955a.add(bVar2);
                        int i7 = eVar3.f957c + bVar2.f958a;
                        eVar3.f957c = i7;
                        if (charAt5 == '2') {
                            if (i7 != 0 && (arrayList = eVar3.f955a) != null) {
                                byte[] bArr = new byte[i7];
                                Iterator<e.b> it = arrayList.iterator();
                                int i8 = 0;
                                while (it.hasNext()) {
                                    e.b next = it.next();
                                    System.arraycopy(next.f959b, 0, bArr, i8, next.f958a);
                                    i8 += next.f958a;
                                }
                                ((v) eVar3.e).a(BitmapFactory.decodeByteArray(bArr, 0, eVar3.f957c));
                            }
                            eVar3.a();
                        }
                    }
                } else {
                    String substring = dVar6.f915a.substring(2);
                    eVar3.h = null;
                    eVar3.g.a(substring, new b.b.a.a.b.r.a(eVar3, substring));
                }
            }
        }
        return true;
    }

    public final boolean b(h hVar) {
        return hVar == h.STOP || hVar == h.EOF;
    }

    public final void a() {
        String str = this.y;
        if (str != null) {
            this.g = str;
            this.y = null;
            this.f1009a.a(a.ARTIST);
        }
        String str2 = this.z;
        if (str2 != null) {
            this.f = str2;
            this.z = null;
            this.f1009a.a(a.ALBUM);
        }
        String str3 = this.x;
        if (str3 != null) {
            this.e = str3;
            this.x = null;
            this.f1009a.a(a.TITLE);
        }
    }

    public final boolean a(h hVar) {
        return hVar == h.PAUSE || hVar == h.PLAY || hVar == h.FF || hVar == h.REW;
    }

    public final b a(String str) {
        if (str.charAt(0) == '0') {
            char upperCase = Character.toUpperCase(str.charAt(1));
            switch (upperCase) {
                case '1':
                    return b.LIKE1;
                case '2':
                    return b.DONT_LIKE2;
                case '3':
                    return b.LOVE;
                case '4':
                    return b.BAN;
                case '5':
                    return b.EPISODE;
                case '6':
                    return b.RATINGS;
                case '7':
                    return b.BAN_BLACK;
                case '8':
                    return b.BAN_WHITE;
                case '9':
                    return b.FAVORITE_BLACK;
                default:
                    switch (upperCase) {
                        case 'A':
                            return b.FAVORITE_WHITE;
                        case 'B':
                            return b.FAVORITE_YELLOW;
                        case 'C':
                            return b.LIKE2;
                        case 'D':
                            return b.DONT_LIKE1;
                        default:
                            return b.NONE;
                    }
            }
        }
        return b.NONE;
    }

    public void a(Bitmap bitmap) {
        this.l = bitmap;
        this.f1009a.a(a.JACKET_IMAGE);
    }
}
