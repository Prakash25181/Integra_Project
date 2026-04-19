package b.b.a.a.b.r;

import android.graphics.drawable.Drawable;
import android.util.Log;
import b.b.a.a.b.q.e;
import b.b.a.a.b.r.h;
import b.b.a.a.b.r.j;
import b.b.a.a.b.r.l;
import b.b.a.a.b.r.v;
import b.b.a.a.e.e;
import b.b.a.a.e.f;
import java.io.CharConversionException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: NetUsbList_2012_Later.java */
/* loaded from: classes.dex */
public class s extends l {
    public static final l.f F = l.f.IPOD_STANDARD;
    public static int G = 0;
    public boolean A;
    public boolean B;
    public b.b.a.a.b.o.f C;
    public long D;
    public long E;

    /* renamed from: c, reason: collision with root package name */
    public v f999c;
    public k d;
    public y e;
    public w f;
    public b.b.a.a.b.o.d g;
    public ArrayList<i> h;
    public b.b.a.a.b.o.f i;
    public b.b.a.a.b.o.f j;
    public j k;
    public ArrayList<c> l;
    public String m;
    public i n;
    public l.e o;
    public l.a p;
    public n q;
    public n r;
    public boolean s;
    public b.b.a.a.b.o.p[] t;
    public int u;
    public l.f[] v;
    public l.b w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: NetUsbList_2012_Later.java */
    /* loaded from: classes.dex */
    public class a implements e.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f1000a;

        public a(c cVar) {
            this.f1000a = cVar;
        }

        @Override // b.b.a.a.e.e.b
        public void run() {
            s sVar = s.this;
            c cVar = this.f1000a;
            if (sVar != null) {
                cVar.a();
                ArrayList<c> arrayList = sVar.l;
                if (arrayList != null) {
                    arrayList.remove(cVar);
                }
                i iVar = cVar.d;
                j jVar = sVar.k;
                if (iVar == jVar.f970a) {
                    jVar.a(false, cVar.f1004b, null);
                }
                if (b.b.a.a.b.o.i.a(sVar.f981b.b().d()) && sVar.a(sVar.o) && cVar.d == sVar.a()) {
                    sVar.f980a.a(cVar.d);
                    sVar.p();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* compiled from: NetUsbList_2012_Later.java */
    /* loaded from: classes.dex */
    public class b implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f1002a;

        public /* synthetic */ b(s sVar, r rVar) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar, String str) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar, String str, HashMap<String, String> hashMap) {
            if (bVar.f1147a.equals("/response/error")) {
                this.f1002a = hashMap.get("code");
                hashMap.get("message");
            }
        }
    }

    /* compiled from: NetUsbList_2012_Later.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f1003a;

        /* renamed from: b, reason: collision with root package name */
        public int f1004b;

        /* renamed from: c, reason: collision with root package name */
        public int f1005c;
        public i d;
        public b.b.a.a.e.e e;

        public c(i iVar, j.a aVar) {
            int i = s.G;
            s.G = i + 1;
            this.f1003a = i;
            this.f1004b = aVar.f973a;
            this.f1005c = aVar.f974b;
            this.d = iVar;
        }

        public void a() {
            b.b.a.a.e.e eVar = this.e;
            if (eVar != null) {
                eVar.a();
                this.e = null;
            }
        }
    }

    /* compiled from: NetUsbList_2012_Later.java */
    /* loaded from: classes.dex */
    public class d implements f.a {

        /* renamed from: a, reason: collision with root package name */
        public int f1006a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<h> f1007b = new ArrayList<>();

        public /* synthetic */ d(s sVar, r rVar) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar, String str) {
        }

        @Override // b.b.a.a.e.f.a
        public void a(f.b bVar, String str, HashMap<String, String> hashMap) {
            if (bVar.f1147a.equals("/response/items/item")) {
                String str2 = hashMap.get("icontype");
                String str3 = hashMap.get("iconid");
                String str4 = hashMap.get("title");
                StringBuilder a2 = b.a.a.a.a.a("parseStart  ");
                a2.append(bVar.f1147a);
                a2.append(":");
                a2.append(str2);
                a2.append(" ");
                a2.append(str3);
                a2.append(" ");
                a2.append(str4);
                Log.d("XML", a2.toString());
                int i = h.a.NONE.f966b;
                Drawable drawable = null;
                if (str3 != null) {
                    i = b.b.a.a.b.o.c.a(str3);
                    drawable = a.b.k.r.b(i);
                }
                if (drawable == null && str2 != null && str2.length() == 1) {
                    i = h.a.a(str2.charAt(0)).f966b;
                    drawable = a.b.k.r.b(i);
                }
                this.f1007b.add(new h(str4, i, drawable));
                return;
            }
            if (bVar.f1147a.equals("/response/items")) {
                try {
                    this.f1006a = Integer.parseInt(hashMap.get("offset"));
                } catch (NumberFormatException unused) {
                    this.f1006a = 0;
                }
                try {
                    Integer.parseInt(hashMap.get("totalitems"));
                } catch (NumberFormatException unused2) {
                }
                this.f1007b = new ArrayList<>();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r3 != 25) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d4 A[EDGE_INSN: B:15:0x00d4->B:16:0x00d4 BREAK  A[LOOP:0: B:5:0x007d->B:42:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:5:0x007d->B:42:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(b.b.a.a.b.p.d r8) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.r.s.<init>(b.b.a.a.b.p.d):void");
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.o.f fVar, boolean z) {
        if (fVar != null) {
            b.b.a.a.b.o.e eVar = fVar.f808a;
            b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.THIS_DEVICE;
            if (eVar == eVar2) {
                b.b.a.a.b.o.f fVar2 = this.i;
                if (this.f999c.f1010b != v.h.STOP) {
                    this.x = true;
                }
                this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(b.b.a.a.b.o.e.DLNA.f807b)));
                this.i = fVar;
                this.j = fVar;
                a(fVar, fVar2);
                return;
            }
            b.b.a.a.b.o.f fVar3 = this.i;
            if (fVar3 != null && fVar3.f808a == eVar2) {
                this.i = null;
                this.f999c.e();
                b.b.a.a.b.o.e eVar3 = fVar.f808a;
                if (eVar3 == b.b.a.a.b.o.e.NET_TOP || eVar3 == b.b.a.a.b.o.e.DLNA) {
                    this.y = true;
                    this.s = false;
                }
                if (this.f981b.f852c.f801c >= 2016 && fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
                    a("TOP");
                    return;
                }
                if (fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
                    a("RETURN");
                    a("RETURN");
                }
                this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(fVar.f808a.f807b)));
                return;
            }
            this.C = null;
            if (this.f981b.f852c.f801c >= 2016 && fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
                a("TOP");
                return;
            }
            b.b.a.a.b.p.d dVar = this.f981b;
            if (dVar.f852c.f801c >= 2015) {
                this.C = fVar;
                this.D = System.currentTimeMillis();
                b.b.a.a.b.o.f fVar4 = this.i;
                if (fVar4 != null && fVar4.f808a == fVar.f808a) {
                    this.B = true;
                    this.f981b.a(b.b.a.a.b.p.v.a.NLT);
                    return;
                } else {
                    this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(fVar.f808a.f807b)));
                    return;
                }
            }
            dVar.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(fVar.f808a.f807b)));
        }
    }

    @Override // b.b.a.a.b.r.l
    public boolean b() {
        return this.z && g() == b.b.a.a.b.o.e.SPOTIFY;
    }

    @Override // b.b.a.a.b.r.l
    public boolean c() {
        b.b.a.a.b.o.f fVar = this.i;
        if (fVar == null || this.o == l.e.SERVICE_CHANGING) {
            return false;
        }
        int ordinal = fVar.f808a.ordinal();
        if (ordinal != 21 && ordinal != 22) {
            return (ordinal == 24 && this.o == l.e.LIST) ? false : true;
        }
        if (this.f981b.b().d() == b.b.a.a.b.o.h.NETWORK) {
            return true;
        }
        l.e eVar = this.o;
        if (eVar == l.e.USB_NON_CONTROLABLE) {
            return false;
        }
        return (eVar == l.e.LIST && a().f969c == 0) ? false : true;
    }

    @Override // b.b.a.a.b.r.l
    public boolean d() {
        int ordinal = this.f999c.f1010b.ordinal();
        if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            this.s = true;
        }
        b.b.a.a.b.o.f fVar = this.i;
        if (fVar != null && fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
            return this.s;
        }
        int ordinal2 = this.o.ordinal();
        if (ordinal2 == 2 || ordinal2 == 3 || ordinal2 == 4 || ordinal2 == 6 || ordinal2 == 8) {
            return false;
        }
        return this.s;
    }

    @Override // b.b.a.a.b.r.l
    public void e() {
        ArrayList<c> arrayList = this.l;
        if (arrayList != null) {
            Iterator<c> it = arrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                next.a();
                i iVar = next.d;
                j jVar = this.k;
                if (iVar == jVar.f970a) {
                    jVar.a(false, next.f1004b, null);
                }
            }
            this.l.clear();
        }
    }

    @Override // b.b.a.a.b.r.l
    public b.b.a.a.b.o.f f() {
        return this.i;
    }

    @Override // b.b.a.a.b.r.l
    public l.e h() {
        return this.o;
    }

    @Override // b.b.a.a.b.r.l
    public x i() {
        return this.f;
    }

    @Override // b.b.a.a.b.r.l
    public k j() {
        return this.d;
    }

    @Override // b.b.a.a.b.r.l
    public v k() {
        return this.f999c;
    }

    @Override // b.b.a.a.b.r.l
    public y l() {
        return this.e;
    }

    @Override // b.b.a.a.b.r.l
    public void m() {
        a("RETURN");
        e();
    }

    @Override // b.b.a.a.b.r.l
    public void n() {
        b.b.a.a.b.o.f fVar = this.i;
        if (fVar != null && fVar.f808a == b.b.a.a.b.o.e.NET_TOP) {
            a("DISPLAY");
            return;
        }
        if (d()) {
            i a2 = a();
            if (a2 != null) {
                int ordinal = a2.d.ordinal();
                if (ordinal == 1) {
                    a("RETURN");
                } else if (ordinal != 5) {
                    a("LIST");
                } else {
                    a("DISPLAY");
                }
            } else {
                a("LIST");
            }
            e();
        }
    }

    @Override // b.b.a.a.b.r.l
    public l.f o() {
        if (this.i != null) {
            for (int i = 0; i < this.u; i++) {
                if (this.t[i].f808a == this.i.f808a) {
                    if (this.f981b.f852c.c()) {
                        l.f[] fVarArr = this.v;
                        if (fVarArr[i] == F) {
                            int ordinal = this.w.ordinal();
                            if (ordinal != 2 && ordinal != 3) {
                                return l.f.IPOD_STANDARD;
                            }
                            return l.f.IPOD_EXTENDED;
                        }
                        return fVarArr[i];
                    }
                    if (this.f981b.f852c.b()) {
                        int ordinal2 = this.w.ordinal();
                        if (ordinal2 == 1) {
                            return l.f.IPOD_STANDARD;
                        }
                        if (ordinal2 != 2 && ordinal2 != 3) {
                            return l.f.MEMORY;
                        }
                        return l.f.IPOD_EXTENDED;
                    }
                }
            }
        }
        return l.f.NONE;
    }

    public void p() {
        ArrayList<c> arrayList;
        int i;
        if (!a(this.o) || a() != this.k.f970a || (arrayList = this.l) == null || arrayList.size() >= 2) {
            return;
        }
        j jVar = this.k;
        if (jVar != null) {
            j.a aVar = new j.a(jVar, -1, 0);
            int i2 = 0;
            while (true) {
                if (i2 >= jVar.e) {
                    break;
                }
                int intValue = jVar.f971b.get(i2).intValue() | jVar.f972c.get(i2).intValue();
                if (intValue != 255) {
                    int i3 = intValue & 15;
                    if (i3 != 15) {
                        i = j.f[i3];
                    } else {
                        i = j.f[(intValue >> 4) & 15] + 4;
                    }
                    int i4 = ((i2 * 8) + i) * 20;
                    aVar.f973a = i4;
                    if (i4 < jVar.f970a.a()) {
                        jVar.f972c.set(i2, Integer.valueOf((1 << i) | jVar.f972c.get(i2).intValue()));
                    } else {
                        aVar.f973a = -1;
                    }
                } else {
                    i2++;
                }
            }
            if (aVar.f973a != -1) {
                int a2 = jVar.f970a.a() - aVar.f973a;
                if (a2 < 20) {
                    aVar.f974b = a2;
                } else {
                    aVar.f974b = 20;
                }
            }
            if (aVar.f973a == -1) {
                return;
            }
            c cVar = new c(this.k.f970a, aVar);
            b.b.a.a.e.e a3 = b.b.a.a.e.e.a((e.b) new a(cVar), true);
            cVar.e = a3;
            a3.a(false, 15000);
            this.l.add(cVar);
            s.this.f981b.a(b.b.a.a.b.p.v.a.NLA, String.format("L%04X%02X%04X%04X", Integer.valueOf(cVar.f1003a), Integer.valueOf(cVar.d.f969c), Integer.valueOf(cVar.f1004b), Integer.valueOf(cVar.f1005c)));
            return;
        }
        throw null;
    }

    public final void q() {
        w wVar = this.f;
        n nVar = this.r;
        l.e eVar = nVar.f991b;
        int i = nVar.f992c;
        wVar.d = eVar;
        wVar.e = i;
        l.e eVar2 = this.o;
        l.e eVar3 = l.e.CUSTOM_POPUP;
        if (eVar2 != eVar3) {
            this.o = eVar3;
            this.f980a.a(eVar3, this.p);
        }
    }

    @Override // b.b.a.a.b.r.l
    public void a(b.b.a.a.b.p.v.b bVar) {
        int i;
        c cVar;
        String str;
        l.f fVar;
        int i2 = 0;
        switch (bVar.f912b.ordinal()) {
            case 15:
                a(new n(bVar.f913c, false));
                return;
            case 16:
                i a2 = a();
                if (a2 instanceof t) {
                    ((t) a2).a(bVar.f913c);
                    return;
                }
                return;
            case 17:
                String str2 = bVar.f913c.f915a;
                if (str2.charAt(0) != 'X') {
                    return;
                }
                try {
                    i = bVar.f913c.a(1, 4);
                } catch (CharConversionException unused) {
                    i = 0;
                }
                char charAt = str2.charAt(5);
                ArrayList<c> arrayList = this.l;
                r rVar = null;
                if (arrayList != null) {
                    Iterator<c> it = arrayList.iterator();
                    cVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            cVar = it.next();
                            if (cVar.f1003a == i) {
                                cVar.a();
                                this.l.remove(cVar);
                            }
                        }
                    }
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    if (charAt == 'S') {
                        d dVar = new d(this, rVar);
                        if (new b.b.a.a.e.f().a(bVar.f913c.f915a.substring(9), dVar, "")) {
                            this.m = null;
                            i iVar = cVar.d;
                            j jVar = this.k;
                            if (iVar == jVar.f970a) {
                                jVar.a(true, dVar.f1006a, dVar.f1007b);
                                if (a() == this.k.f970a) {
                                    p();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (charAt == 'E') {
                        i iVar2 = cVar.d;
                        j jVar2 = this.k;
                        if (iVar2 == jVar2.f970a) {
                            jVar2.a(false, cVar.f1004b, null);
                        }
                        b bVar2 = new b(this, rVar);
                        if (new b.b.a.a.e.f().a(bVar.f913c.f915a.substring(9), bVar2, "") && (str = this.m) != null && !str.equals(bVar2.f1002a) && !bVar2.f1002a.equals("[-10005]") && !bVar2.f1002a.equals("[-10007]") && !bVar2.f1002a.equals("[4]")) {
                            this.m = bVar2.f1002a;
                        }
                        if (a(this.o) && a() == this.k.f970a) {
                            b.b.a.a.e.e.a((e.b) new r(this), true).a(false, 3000);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 18:
            case 22:
            case 23:
            default:
                this.f999c.a(bVar);
                return;
            case 19:
                if (this.f981b.f852c.e()) {
                    return;
                }
                e();
                k kVar = this.d;
                if (kVar != null) {
                    kVar.a(bVar);
                    return;
                }
                return;
            case 20:
                if (this.f981b.f852c.e()) {
                    return;
                }
                e();
                l.e eVar = this.o;
                l.e eVar2 = l.e.POPUP;
                if (eVar != eVar2) {
                    this.o = eVar2;
                    this.f980a.a(eVar2, l.a.DOWN);
                }
                this.e.a(bVar);
                return;
            case 21:
                if (this.f981b.f852c.e()) {
                    e();
                    b.b.a.a.b.q.m a3 = b.b.a.a.b.q.l.a(bVar.f913c);
                    if (a3 != null) {
                        e.b bVar3 = a3.g;
                        if (bVar3 == e.b.DIALOG) {
                            w wVar = this.f;
                            wVar.f1028b = a3;
                            wVar.f1027a.a();
                            if (this.r != null) {
                                q();
                                return;
                            }
                            return;
                        }
                        if (bVar3 == e.b.OVERLAY) {
                            this.f980a.a((x) new z(a3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 24:
                break;
            case 25:
                l.b d2 = bVar.f913c.d();
                if (this.w != d2) {
                    this.w = d2;
                    b.b.a.a.b.o.f fVar2 = this.i;
                    if (fVar2 != null) {
                        int ordinal = fVar2.f808a.ordinal();
                        if (ordinal == 21 || ordinal == 22) {
                            while (i2 < this.u) {
                                if (this.t[i2].f808a == this.i.f808a && this.v[i2] == F) {
                                    this.f980a.a(o());
                                }
                                i2++;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
        while (i2 < this.u) {
            int i3 = i2 + 1;
            char charAt2 = bVar.f913c.f915a.charAt(i3);
            if (charAt2 == 'B') {
                fVar = l.f.BLUETOOTH_ADAPTER;
            } else if (charAt2 == 'M') {
                fVar = l.f.MEMORY;
            } else if (charAt2 == 'W') {
                fVar = l.f.WIRELESS_ADAPTER;
            } else if (charAt2 == 'i') {
                fVar = F;
            } else if (charAt2 != 'x') {
                fVar = l.f.NONE;
            } else {
                fVar = l.f.DISABLED;
            }
            l.f[] fVarArr = this.v;
            if (fVar != fVarArr[i2]) {
                fVarArr[i2] = fVar;
                b.b.a.a.b.o.f fVar3 = this.i;
                if (fVar3 != null && fVar3.f808a == this.t[i2].f808a) {
                    this.o = l.e.UNKNOWN;
                    this.h.clear();
                    n nVar = this.q;
                    if (nVar != null) {
                        a(nVar);
                    }
                }
            }
            i2 = i3;
        }
    }

    public static s a(b.b.a.a.b.p.d dVar) {
        Log.d("<NetUsbList_2012_Later>", "create()");
        return new s(dVar);
    }

    @Override // b.b.a.a.b.r.l
    public i a() {
        if (this.h.size() <= 0) {
            return null;
        }
        return this.h.get(r0.size() - 1);
    }

    @Override // b.b.a.a.b.r.l
    public void a(int i) {
        int ordinal = a().d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (this.f981b.f852c.f801c >= 2014) {
                    this.f981b.a(b.b.a.a.b.p.v.a.NLA, String.format("I%02X%04X----", Integer.valueOf(a().f969c), Integer.valueOf(i)));
                    return;
                } else {
                    this.f981b.a(b.b.a.a.b.p.v.a.NLS, String.format("L%d", Integer.valueOf(i)));
                    return;
                }
            }
            if (ordinal != 5) {
                return;
            }
        }
        h a2 = a().a(i);
        if (a2 != null) {
            int i2 = a2.f963b;
            if (!(i2 == h.a.MUSIC.f966b || i2 == h.a.TRACK.f966b)) {
                v vVar = this.f999c;
                e eVar = vVar.t;
                if (eVar != null) {
                    eVar.b();
                }
                vVar.l = null;
            }
        }
        this.f981b.a(b.b.a.a.b.p.v.a.NLA, String.format("I%02X%04X----", Integer.valueOf(a().f969c), Integer.valueOf(i)));
    }

    public final void a(n nVar) {
        boolean z;
        boolean z2;
        l.a a2;
        k kVar;
        int i;
        i tVar;
        l.a aVar;
        b.b.a.a.b.o.e eVar;
        l.f o;
        l.e eVar2;
        b.b.a.a.b.o.e eVar3;
        l.e eVar4;
        b.b.a.a.b.o.e eVar5;
        b.b.a.a.b.o.f fVar = this.C;
        boolean z3 = true;
        if (fVar != null && fVar.f808a != nVar.f990a && System.currentTimeMillis() - this.D < 2500 && nVar.f991b != l.e.POPUP) {
            this.f981b.a(b.b.a.a.b.p.v.a.NSV, String.format("%02X0", Integer.valueOf(this.C.f808a.f807b)));
            return;
        }
        this.C = null;
        if (this.y) {
            if (nVar.f990a == b.b.a.a.b.o.e.DLNA && nVar.f991b == l.e.PLAYBACK) {
                return;
            } else {
                this.y = false;
            }
        }
        b.b.a.a.b.o.f fVar2 = this.i;
        if (fVar2 != null && (((eVar5 = fVar2.f808a) == b.b.a.a.b.o.e.DLNA || eVar5 == b.b.a.a.b.o.e.HOME_MEDIA) && nVar.f990a == b.b.a.a.b.o.e.NET_TOP && this.E > 0 && System.currentTimeMillis() - this.E < 200)) {
            Log.v("<NetUsbList_2012_Later>", "ignore NetTop NLT");
            return;
        }
        n nVar2 = this.q;
        this.q = nVar;
        if (this.f981b.f852c.e() && ((eVar4 = nVar.f991b) == l.e.POPUP || eVar4 == l.e.KEYBOARD)) {
            this.r = nVar;
        } else {
            w wVar = this.f;
            if (wVar != null) {
                wVar.a(null);
            }
            this.r = null;
        }
        b.b.a.a.b.o.f fVar3 = this.i;
        if (fVar3 != null && fVar3.f808a == b.b.a.a.b.o.e.THIS_DEVICE && ((eVar3 = nVar.f990a) == b.b.a.a.b.o.e.NET_TOP || eVar3 == b.b.a.a.b.o.e.DLNA)) {
            if (this.x) {
                this.x = false;
                this.f999c.f();
            }
            nVar.f990a = b.b.a.a.b.o.e.THIS_DEVICE;
            nVar.f = 0;
            nVar.f992c = 0;
        }
        if (this.u == 1 && nVar.f990a == b.b.a.a.b.o.e.USB_REAR) {
            nVar.f990a = b.b.a.a.b.o.e.USB_FRONT;
            nVar.g = this.v[0].name();
        }
        l.e eVar6 = nVar.f991b;
        if (this.f981b.f852c.e() && ((eVar2 = nVar.f991b) == l.e.POPUP || eVar2 == l.e.KEYBOARD)) {
            eVar6 = l.e.CUSTOM_POPUP;
        }
        b.b.a.a.b.o.f fVar4 = this.i;
        if (fVar4 == null || fVar4.f808a != nVar.f990a || this.B) {
            this.B = false;
            this.i = null;
            this.h = new ArrayList<>();
            b.b.a.a.b.o.e eVar7 = nVar.f990a;
            if (eVar7 != b.b.a.a.b.o.e.NONE) {
                b.b.a.a.b.o.f a3 = this.f981b.p.a(eVar7);
                this.i = a3;
                if (a3 == null) {
                    if (this.u != 1 || nVar.f990a != b.b.a.a.b.o.e.USB_FRONT) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= this.u) {
                                break;
                            }
                            b.b.a.a.b.o.p[] pVarArr = this.t;
                            if (pVarArr[i2].f808a == nVar.f990a) {
                                this.i = pVarArr[i2];
                                break;
                            }
                            i2++;
                        }
                    } else {
                        this.i = this.t[0];
                    }
                }
            }
            if (this.i == null) {
                this.i = this.g;
            }
            b.b.a.a.b.o.e eVar8 = this.i.f808a;
            if (eVar8 != b.b.a.a.b.o.e.NET_TOP) {
                b.b.a.a.b.o.f fVar5 = this.j;
                if (fVar5 == null || fVar5.f808a != eVar8) {
                    this.j = this.i;
                    this.s = false;
                }
                this.E = System.currentTimeMillis();
            }
            z = true;
        } else {
            z = false;
        }
        l.e eVar9 = this.o;
        l.a aVar2 = l.a.NO_CHANGE;
        b.b.a.a.b.o.f fVar6 = this.i;
        if (fVar6 == null || !((eVar = fVar6.f808a) == b.b.a.a.b.o.e.USB_FRONT || eVar == b.b.a.a.b.o.e.USB_REAR)) {
            z2 = false;
        } else {
            if (this.f981b.f852c.c() && ((o = o()) == l.f.NONE || o == l.f.WIRELESS_ADAPTER || o == l.f.BLUETOOTH_ADAPTER || o == l.f.DISABLED)) {
                nVar.f992c = 0;
                nVar.f = 0;
                eVar6 = l.e.USB_NON_CONTROLABLE;
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f981b.f852c.b() && o() == l.f.IPOD_STANDARD) {
                eVar6 = l.e.PLAYBACK;
                nVar.f991b = eVar6;
            }
        }
        if (eVar6 != eVar9 || z) {
            if (eVar6 != l.e.CUSTOM_POPUP || this.f.f1028b != null) {
                this.o = eVar6;
            }
            if (eVar6 == l.e.KEYBOARD && (kVar = this.d) != null) {
                kVar.a(nVar.g);
            }
            if (eVar6 == l.e.PLAYBACK) {
                this.s = true;
                this.f999c.g();
            }
            l.e eVar10 = l.e.SERVICE_CHANGING;
            if (eVar6 == eVar10) {
                if (fVar4 != null && fVar4.f808a != b.b.a.a.b.o.e.NET_TOP) {
                    a2 = l.a.REPLACE;
                } else {
                    a2 = l.a.DOWN;
                }
            } else if (eVar9 == eVar10) {
                if (z) {
                    a2 = l.a.UP;
                } else {
                    a2 = l.a.DOWN;
                }
            } else if (fVar4 != null && fVar4.f808a == b.b.a.a.b.o.e.FAVORITE && this.i.f808a == b.b.a.a.b.o.e.NET_TOP && eVar6 == l.e.MENU) {
                a2 = l.a.DOWN;
            } else if (fVar4 != null && fVar4.f808a == b.b.a.a.b.o.e.NET_TOP && eVar9 == l.e.MENU && this.i.f808a == b.b.a.a.b.o.e.FAVORITE) {
                a2 = l.a.UP;
            } else {
                b.b.a.a.b.o.e eVar11 = this.i.f808a;
                b.b.a.a.b.o.e eVar12 = b.b.a.a.b.o.e.NET_TOP;
                if (eVar11 == eVar12) {
                    if ((fVar4 == null || fVar4.f808a == eVar12) && eVar6 == l.e.CUSTOM_POPUP) {
                        a2 = l.a.DOWN;
                    } else {
                        a2 = l.a.UP;
                    }
                } else if (fVar4 != null && fVar4.f808a == eVar12) {
                    a2 = l.a.DOWN;
                } else if (z) {
                    a2 = l.a.REPLACE;
                } else {
                    a2 = super.a(eVar9, eVar6);
                }
            }
            aVar2 = a2;
            z2 = true;
        }
        e();
        this.k = null;
        if ((eVar6 == l.e.LIST || eVar6 == l.e.MENU || eVar6 == l.e.MENU_LIST) && ((this.i.f808a != b.b.a.a.b.o.e.NET_TOP || eVar6 != l.e.LIST) && this.i.f808a != b.b.a.a.b.o.e.THIS_DEVICE)) {
            int size = this.h.size();
            while (this.h.size() > nVar.f992c + 1) {
                ArrayList<i> arrayList = this.h;
                arrayList.remove(arrayList.size() - 1);
                z2 = true;
            }
            while (true) {
                int size2 = this.h.size();
                i = nVar.f992c;
                if (size2 >= i + 1) {
                    break;
                }
                this.h.add(null);
                z2 = true;
            }
            i iVar = this.h.get(i);
            if (this.h.get(nVar.f992c) == null || iVar.d != eVar6 || iVar.a() != nVar.f || ((eVar6 == l.e.MENU || eVar6 == l.e.MENU_LIST) && nVar.f992c == iVar.f969c && (nVar2 == null || nVar2.e == nVar.e))) {
                if (a(eVar6)) {
                    tVar = new m(nVar.g, nVar.f992c, eVar6, nVar.f);
                } else {
                    tVar = new t(nVar.g, Math.max(1, nVar.f), eVar6, nVar.f);
                }
                iVar = tVar;
                this.h.set(nVar.f992c, iVar);
            } else {
                z3 = z2;
            }
            if (z3 && aVar2 == l.a.NO_CHANGE) {
                if (this.h.size() < size) {
                    aVar = l.a.UP;
                } else if (this.h.size() > size) {
                    aVar = l.a.DOWN;
                } else {
                    aVar = l.a.REPLACE;
                }
                aVar2 = aVar;
            }
            if (a(eVar6)) {
                this.k = new j(iVar);
                this.l = new ArrayList<>(2);
            }
        }
        this.z = nVar.d;
        if (z) {
            a(this.i, fVar4);
        }
        if (aVar2 != l.a.NO_CHANGE) {
            if (eVar6 != l.e.CUSTOM_POPUP) {
                this.f980a.a(eVar6, aVar2);
            } else {
                this.p = aVar2;
                if (this.f.f1028b != null) {
                    q();
                }
            }
        }
        if (this.k != null) {
            p();
        }
        if (this.A) {
            this.A = false;
            if (this.o == l.e.PLAYBACK) {
                b.b.a.a.b.p.d dVar = this.f981b;
                if (dVar.f852c.J) {
                    dVar.a(b.b.a.a.b.p.v.a.NJA, "REQ");
                }
            }
        }
    }

    public final boolean a(l.e eVar) {
        int ordinal;
        if (eVar != l.e.MENU) {
            return eVar == l.e.LIST || eVar == l.e.MENU_LIST;
        }
        if (!(this.f981b.f852c.f801c >= 2014)) {
            return false;
        }
        b.b.a.a.b.o.f fVar = this.i;
        return fVar == null || !((ordinal = fVar.f808a.ordinal()) == 18 || ordinal == 24);
    }
}
