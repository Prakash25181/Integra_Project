package b.b.a.a.b.n;

import b.b.a.a.b.r.h;
import b.b.a.a.b.r.l;
import b.b.a.a.b.r.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/* compiled from: DemoNetwork.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public C0027c f778b;

    /* renamed from: c, reason: collision with root package name */
    public b.b.a.a.b.n.a f779c;
    public int f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f777a = new ArrayList<>(Arrays.asList(new b(this, 0, "Internet Radio"), new b(this, 1, "Music"), new b(this, 2, "Country"), new b(this, 2, "Classic"), new b(this, 2, "Jazz"), new b(this, 2, "Rock"), new b(this, 2, "World"), new b(this, 1, "Local Radio"), new b(this, 2, "FM Radio 79.0"), new b(this, 2, "FM Radio 81.6"), new b(this, 2, "FM Radio 97.9"), new b(this, -1, "")));
    public Stack<C0027c> d = new Stack<>();
    public Stack<C0027c> e = new Stack<>();
    public l.e g = l.e.LIST;

    /* compiled from: DemoNetwork.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f780a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f781b;

        static {
            int[] iArr = new int[b.b.a.a.b.o.e.values().length];
            f781b = iArr;
            try {
                b.b.a.a.b.o.e eVar = b.b.a.a.b.o.e.NET_TOP;
                iArr[24] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f781b;
                b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.DEMO;
                iArr2[28] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr3 = new int[b.b.a.a.b.p.v.a.values().length];
            f780a = iArr3;
            try {
                b.b.a.a.b.p.v.a aVar = b.b.a.a.b.p.v.a.NLT;
                iArr3[15] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f780a;
                b.b.a.a.b.p.v.a aVar2 = b.b.a.a.b.p.v.a.NSV;
                iArr4[18] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = f780a;
                b.b.a.a.b.p.v.a aVar3 = b.b.a.a.b.p.v.a.NLA;
                iArr5[17] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = f780a;
                b.b.a.a.b.p.v.a aVar4 = b.b.a.a.b.p.v.a.NTC;
                iArr6[1] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = f780a;
                b.b.a.a.b.p.v.a aVar5 = b.b.a.a.b.p.v.a.NTZ;
                iArr7[2] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                int[] iArr8 = f780a;
                b.b.a.a.b.p.v.a aVar6 = b.b.a.a.b.p.v.a.NT3;
                iArr8[3] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                int[] iArr9 = f780a;
                b.b.a.a.b.p.v.a aVar7 = b.b.a.a.b.p.v.a.NT4;
                iArr9[4] = 7;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: DemoNetwork.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f782a;

        /* renamed from: b, reason: collision with root package name */
        public String f783b;

        public b(c cVar, int i, String str) {
            this.f782a = i;
            this.f783b = str;
        }
    }

    /* compiled from: DemoNetwork.java */
    /* renamed from: b.b.a.a.b.n.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0027c {

        /* renamed from: a, reason: collision with root package name */
        public String f784a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<C0027c> f785b = new ArrayList<>();

        public /* synthetic */ C0027c(c cVar, String str, a aVar) {
            this.f784a = str;
        }
    }

    public c(b.b.a.a.b.n.a aVar) {
        this.f779c = aVar;
        C0027c c0027c = new C0027c(this, "NetTop", null);
        this.f778b = c0027c;
        a(c0027c, 0);
        this.d.push(this.f778b);
    }

    public final int a(C0027c c0027c, int i) {
        a aVar = null;
        C0027c c0027c2 = new C0027c(this, "ERR", aVar);
        int i2 = this.f777a.get(i).f782a;
        while (this.f777a.get(i).f782a >= i2) {
            if (this.f777a.get(i).f782a == i2) {
                c0027c2 = new C0027c(this, this.f777a.get(i).f783b, aVar);
                c0027c.f785b.add(c0027c2);
                i++;
            } else {
                i = a(c0027c2, i);
            }
        }
        return i;
    }

    public final void b() {
        n.a aVar;
        b.b.a.a.b.o.e eVar;
        StringBuilder sb = new StringBuilder();
        C0027c lastElement = this.d.lastElement();
        if (this.d.size() == 1) {
            aVar = n.a.NET_TOP;
            eVar = b.b.a.a.b.o.e.NET_TOP;
        } else if (this.d.size() == 2) {
            aVar = n.a.SERICE_TOP;
            eVar = b.b.a.a.b.o.e.DEMO;
        } else {
            aVar = n.a.SECOND_LAYER;
            eVar = b.b.a.a.b.o.e.DEMO;
        }
        sb.append(String.format("%02X", Integer.valueOf(eVar.f807b)));
        sb.append(String.format("%d", Integer.valueOf(this.g.f987b)));
        sb.append(String.format("%d", Integer.valueOf(aVar.f994b)));
        sb.append(String.format("%04X", 0));
        sb.append(String.format("%04X", Integer.valueOf(lastElement.f785b.size())));
        sb.append(String.format("%02d", Integer.valueOf(this.d.size())));
        sb.append("0");
        sb.append("0");
        sb.append("00");
        sb.append("00");
        sb.append("00");
        sb.append(lastElement.f784a);
        this.f779c.a(b.b.a.a.b.p.v.a.NLT, sb.toString());
    }

    public final void a(int i) {
        C0027c lastElement = this.d.lastElement();
        if (i < lastElement.f785b.size()) {
            C0027c c0027c = lastElement.f785b.get(i);
            this.d.push(c0027c);
            if (c0027c.f785b.size() != 0) {
                b();
                return;
            }
            this.e.removeAllElements();
            this.e.addAll(this.d);
            a();
        }
    }

    public final void a() {
        C0027c lastElement = this.e.lastElement();
        this.g = l.e.PLAYBACK;
        b();
        this.f779c.a(b.b.a.a.b.p.v.a.NST, "S--");
        this.f779c.a(b.b.a.a.b.p.v.a.NTI, lastElement.f784a);
        this.f779c.a(b.b.a.a.b.p.v.a.NAT, "DEMO");
        this.f779c.a(b.b.a.a.b.p.v.a.NAL, "");
        this.f779c.a(b.b.a.a.b.p.v.a.NTM, "00:00/03:00");
        this.f779c.a(b.b.a.a.b.p.v.a.NMS, "xxxxxx100");
    }

    public final void a(int i, int i2, int i3) {
        h.a aVar;
        char c2;
        StringBuilder sb = new StringBuilder();
        C0027c lastElement = this.d.lastElement();
        if (i2 >= lastElement.f785b.size()) {
            i2 = lastElement.f785b.size();
        }
        if (i3 >= lastElement.f785b.size() - i2) {
            i3 = lastElement.f785b.size() - i2;
        }
        sb.append("X");
        sb.append(String.format("%04X", Integer.valueOf(i)));
        sb.append("S");
        sb.append("0");
        sb.append("00");
        sb.append("<response>");
        sb.append(String.format("<items offset=\"%d\" totalitems=\"%d\">", Integer.valueOf(i2), Integer.valueOf(lastElement.f785b.size())));
        if (i2 + i3 > lastElement.f785b.size()) {
            i3 = lastElement.f785b.size() - i2;
        }
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            C0027c c0027c = lastElement.f785b.get(i4);
            if (c0027c.f785b.size() != 0) {
                aVar = h.a.FOLDER;
                c2 = 'F';
            } else {
                aVar = h.a.MUSIC;
                c2 = 'M';
            }
            sb.append(String.format("<item icontype=\"%c\" iconid=\"%X\" title=\"%s\" />", Character.valueOf(c2), Integer.valueOf(aVar.f966b), c0027c.f784a));
        }
        sb.append("</items>");
        sb.append("</response>");
        this.f779c.a(b.b.a.a.b.p.v.a.NLA, sb.toString());
    }

    public final void a(int i, int i2, String str) {
        StringBuilder a2 = b.a.a.a.a.a("X");
        a2.append(String.format("%04d", Integer.valueOf(i)));
        a2.append("E");
        a2.append("0");
        a2.append("00");
        a2.append("<response>");
        a2.append(String.format("<error code=\"%d\" message=\"%s\" />", Integer.valueOf(i2), str));
        a2.append("</response>");
        this.f779c.a(b.b.a.a.b.p.v.a.NLA, a2.toString());
    }
}
