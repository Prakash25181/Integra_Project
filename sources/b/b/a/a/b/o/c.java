package b.b.a.a.b.o;

import android.util.Log;
import b.b.a.a.b.p.g;
import b.b.a.a.e.f;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public class c implements f.a {
    public static final Map<String, b> a0 = new a();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ArrayList<f> R;
    public f S;
    public f T;
    public ArrayList<s> U;
    public ArrayList<i> V;
    public ArrayList<o> W;
    public int X;
    public ArrayList<l> Y;
    public ArrayList<j> Z;

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.g f799a;

    /* renamed from: b, reason: collision with root package name */
    public b f800b = b.UNKNOWN;

    /* renamed from: c, reason: collision with root package name */
    public int f801c;
    public String d;
    public g.b e;
    public String f;
    public n g;
    public n h;
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

    /* compiled from: DeviceInfo.java */
    /* loaded from: classes.dex */
    public class a extends HashMap<String, b> {
        public a() {
            put("av receiver", b.AV_RECEIVER);
            put("sound system", b.SLIM_AVR);
            put("fs system", b.FST);
            put("soundbar", b.SOUNDBAR);
            put("mrs", b.MRSP);
            put("nap-p", b.NAP);
            put("nap-o", b.NAP);
            put("hm", b.HM);
            put("intec", b.INTEC);
            put("multi room sp", b.MRSP);
            put("mrsp", b.MRSP);
            put("fs theater", b.FST);
            put("slim receiver", b.AV_RECEIVER);
            put("atmos bar", b.UNKNOWN);
            put("network audio player", b.NAP);
            put("nap", b.NAP);
            put("network cd receiver", b.HM);
            put("hi-micro", b.HM);
        }
    }

    /* compiled from: DeviceInfo.java */
    /* loaded from: classes.dex */
    public enum b {
        NAP('0', "Network Audio Player"),
        AV_RECEIVER('1', "AV Receiver"),
        SLIM_AVR('2', "Sound System"),
        HM('3', "Network CD Receiver"),
        INTEC('4', "Network Receiver"),
        MRSP('5', "Wireless Audio Speaker"),
        SOUNDBAR('6', "3D Sound Bar"),
        FST('9', "Freestyle Sound System"),
        UNKNOWN('_', "");

        b(Character ch, String str) {
        }
    }

    /* compiled from: DeviceInfo.java */
    /* renamed from: b.b.a.a.b.o.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0028c {
        STEREO(0, "STEREO"),
        DIRECT(1, "DIRECT"),
        SURROUND(2, "SURROUND"),
        FILM(3, "FILM"),
        THX(4, "THX"),
        ACTION(5, "ACTION"),
        MUSICAL(6, "MUSICAL"),
        MONO_MOVIE(7, "MONO MOVIE"),
        ORCHESTRA(8, "ORCHESTRA"),
        UNPLUGGED(9, "UNPLUGGED"),
        STUDIO_MIX(10, "STUDIO-MIX"),
        TV_LOGIC(11, "TV LOGIC"),
        ALL_CH_STEREO(12, "ALL CH STEREO"),
        THEATER_DIMENSIONAL(13, "THEATER-DIMENSIONAL"),
        ENHANCED(14, "ENHANCED 7/ENHANCE"),
        MONO(15, "MONO"),
        PURE_AUDIO(17, "PURE AUDIO"),
        MULTIPLEX(18, "MULTIPLEX"),
        FULL_MONO(19, "FULL MONO"),
        DOLBY_VIRTUAL(20, "DOLBY VIRTUAL"),
        DTS(21, "DTS Surround Sensation"),
        DSX(22, "Audyssey DSX"),
        WHOLE_HOUSE(31, "Whole House Mode"),
        STAGE(35, "Stage"),
        ACTION_JP(37, "Action"),
        MUSIC(38, "Music"),
        SPORTS(46, "Sports"),
        STRAIGHT_DECODE(64, "Straight Decode"),
        DOLBY_EX(65, "Dolby EX"),
        THX_CINEMA(66, "THX Cinema"),
        THX_SURROUND(67, "THX Surround EX"),
        THX_MUSIC(68, "THX Music"),
        THX_GAMES(69, "THX Games"),
        THX_U2_CINEMA(80, "THX U2/S2/I/S Cinema/Cinema2"),
        THX_U2_MUSIC(81, "THX MusicMode,THX U2/S2/I/S Music"),
        THX_U2_GAMES(82, "THX Games Mode,THX U2/S2/I/S Games"),
        PLLI_MOVIE(128, "PLII/PLIIx Movie"),
        PLLI_MUSIC(129, "PLII/PLIIx Music"),
        NEO_CINEMA(130, "Neo:6 Cinema/Neo:X Cinema"),
        NEO_MUSIC(131, "Neo:6 Music/Neo:X Music"),
        PLLI_CINEMA(132, "PLII/PLIIx THX Cinema"),
        NEO_THX(133, "Neo:6/Neo:X THX Cinema"),
        PLII_GAME(134, "PLII/PLIIx Game"),
        NEURAL_SURR(135, "Neural Surr"),
        NEURAL_THX(136, "Neural THX/Neural Surround"),
        PLII_THX(137, "PLII/PLIIx THX Games"),
        NEO_GAMES(138, "Neo:6/Neo:X THX Games"),
        PLII_THX_MUSIC(139, "PLII/PLIIx THX Music"),
        NEO_THX_MUSIC(140, "Neo:6/Neo:X THX Music"),
        NEURAL_CINEMA(141, "Neural THX Cinema"),
        NEURAL_MUSIC(142, "Neural THX Music"),
        MEURAL_GAMES(143, "Neural THX Games"),
        PLII_HEIGHT(144, "PLIIz Height"),
        NEO_CINEMA_DTS(145, "Neo:6 Cinema DTS Surround Sensation"),
        NEO_MUSIC_DTS(146, "Neo:6 Music DTS Surround Sensation"),
        MEURAL_DIGITAL_MUSIC(147, "Neural Digital Music"),
        PLII_HEIGHT_THX_CINEMA(148, "PLIIz Height + THX Cinema"),
        PLII_HEIGHT_THX_MUSIC(149, "PLIIz Height + THX Music"),
        PLII_HEIGHT_THX_GAMES(150, "PLIIz Height + THX Games"),
        PLII_HEIGHT_THX_U2_CINEMA(151, "PLIIz Height + THX U2/S2 Cinema"),
        PLII_HEIGHT_THX_U2_MUSIC(152, "PLIIz Height + THX U2/S2 Music"),
        PLII_HEIGHT_THX_US_GAMES(153, "PLIIz Height + THX U2/S2 Games"),
        NEOX_GAME(154, "Neo:X Game"),
        PLII_MOVIE_DSX(160, "PLIIx/PLII Movie + Audyssey DSX"),
        PLII_MUSIC_DSX(161, "PLIIx/PLII Music + Audyssey DSX"),
        PLII_GAME_DSX(162, "PLIIx/PLII Game + Audyssey DSX"),
        NEO_GINEMA_DSX(163, "Neo:6 Cinema + Audyssey DSX"),
        NEO_MUSIC_DSX(164, "Neo:6 Music + Audyssey DSX"),
        MEURA_DSX(165, "Neural Surround + Audyssey DSX"),
        NEURAL_DIGITAL_MUSIC_DSX(166, "Neural Digital Music + Audyssey DSX"),
        DOLBY_DSX(167, "Dolby EX + Audyssey DSX"),
        UNKNOWN(65535, "");

        public static final Map<Integer, EnumC0028c> x0 = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public int f804b;

        /* renamed from: c, reason: collision with root package name */
        public String f805c;

        static {
            for (EnumC0028c enumC0028c : values()) {
                x0.put(Integer.valueOf(enumC0028c.f804b), enumC0028c);
            }
        }

        EnumC0028c(int i, String str) {
            this.f804b = i;
            this.f805c = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f805c;
        }
    }

    @Override // b.b.a.a.e.f.a
    public void a(f.b bVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // b.b.a.a.e.f.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.b.a.a.e.f.b r10, java.lang.String r11, java.util.HashMap<java.lang.String, java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.o.c.a(b.b.a.a.e.f$b, java.lang.String, java.util.HashMap):void");
    }

    public int b(r rVar) {
        Iterator<l> it = this.Y.iterator();
        int i = 0;
        while (it.hasNext()) {
            l next = it.next();
            if ((next.e & rVar.f837c) != 0) {
                i |= next.f.f825c;
            }
        }
        return i;
    }

    public boolean c() {
        return this.f801c >= 2013;
    }

    public boolean d() {
        return this.f801c >= 2015 || this.e == g.b.JAPAN;
    }

    public boolean e() {
        return this.f801c >= 2014;
    }

    public boolean b() {
        int i = this.f801c;
        return 2011 <= i && i < 2016;
    }

    public static c a(b.b.a.a.b.p.g gVar, String str) {
        c cVar = new c();
        cVar.f799a = gVar;
        f fVar = new f();
        fVar.f808a = e.THIS_DEVICE;
        fVar.f809b = a.b.k.r.d(R.string.thisDeviceService);
        fVar.f810c = "";
        fVar.d = "";
        fVar.a();
        cVar.T = fVar;
        cVar.R = new ArrayList<>();
        cVar.U = new ArrayList<>();
        cVar.V = new ArrayList<>();
        cVar.W = new ArrayList<>();
        boolean z = false;
        cVar.X = 0;
        cVar.Y = new ArrayList<>();
        cVar.Z = new ArrayList<>();
        cVar.N = false;
        cVar.Q = 0;
        cVar.e = g.b.UNKNOWN;
        cVar.M = true;
        cVar.L = true;
        if (new b.b.a.a.e.f().a(str, cVar, "response")) {
            Iterator<i> it = cVar.V.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (i.c(next.f817b)) {
                    cVar.N = true;
                }
                if (next.f817b == h.TUNER_DAB) {
                    cVar.Q = 40;
                }
                if (next.f817b.ordinal() == 24) {
                    cVar.S = d.b();
                }
                if (cVar.f801c >= 2015 && next.f817b == h.TV2) {
                    cVar.K = true;
                }
            }
            String[] strArr = {"T-4070", "CR-N755", "CR-N765", "C-N7050", "CD-P800NT", "CD-240"};
            int i = 0;
            while (true) {
                if (i >= 6) {
                    break;
                }
                if (cVar.d.equals(strArr[i])) {
                    cVar.M = false;
                    break;
                }
                i++;
            }
            String[] strArr2 = {"CR-N755", "CD-P800NT", "CD-240"};
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    break;
                }
                if (cVar.d.equals(strArr2[i2])) {
                    cVar.L = false;
                    break;
                }
                i2++;
            }
            boolean z2 = !cVar.d.equals("CR-N765") || cVar.e == g.b.JAPAN;
            cVar.O = z2;
            if (z2 && cVar.f801c >= 2012 && !cVar.d.equals("CR-N755")) {
                z = true;
            }
            cVar.P = z;
            z = true;
        }
        if (z) {
            return cVar;
        }
        return null;
    }

    public final boolean a(HashMap<String, String> hashMap) {
        String str = hashMap.get("value");
        return (str == null || str.equals("0")) ? false : true;
    }

    @Override // b.b.a.a.e.f.a
    public void a(f.b bVar, String str) {
        StringBuilder a2 = b.a.a.a.a.a("parseText  ");
        a2.append(bVar.f1147a);
        a2.append(":");
        a2.append(str);
        Log.d("XML", a2.toString());
        if (bVar.f1147a.equals("/device/brand")) {
            return;
        }
        if (bVar.f1147a.equals("/device/category")) {
            b bVar2 = a0.get(str.toLowerCase());
            if (bVar2 == null) {
                bVar2 = b.UNKNOWN;
            }
            this.f800b = bVar2;
            return;
        }
        if (bVar.f1147a.equals("/device/year")) {
            try {
                this.f801c = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                this.f801c = 0;
            }
        } else if (bVar.f1147a.equals("/device/model")) {
            this.d = str.trim();
        } else if (bVar.f1147a.equals("/device/destination")) {
            this.e = b.b.a.a.b.p.v.c.a(str);
        } else if (bVar.f1147a.equals("/device/firmwareversion")) {
            this.f = str;
        }
    }

    public int a(r rVar) {
        Iterator<j> it = this.Z.iterator();
        int i = 0;
        while (it.hasNext()) {
            j next = it.next();
            if ((next.e & rVar.f837c) != 0) {
                i |= next.f.f820c;
            }
        }
        return i;
    }

    public static int a(String str) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        if (str.charAt(0) == '+') {
            i = 1;
        } else if (str.charAt(0) == '-') {
            i = -1;
        } else {
            i = 1;
            i4 = 0;
        }
        int i5 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            int i6 = i5 << 4;
            if ('0' > charAt || charAt > '9') {
                if ('a' <= charAt && charAt <= 'f') {
                    i2 = charAt - 'a';
                } else if ('A' > charAt || charAt > 'F') {
                    i5 = 0;
                    i4++;
                } else {
                    i2 = charAt - 'A';
                }
                i3 = i2 + 10;
            } else {
                i3 = charAt - '0';
            }
            i5 = i6 | i3;
            i4++;
        }
        return i5 * i;
    }

    public boolean a() {
        return this.f801c >= 2013;
    }

    public n a(m mVar) {
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            return this.g;
        }
        if (ordinal != 2) {
            return null;
        }
        return this.h;
    }
}
