package b.b.a.a.b.p.v;

import java.util.Hashtable;

/* compiled from: IscpParameterSetup.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    public static a[] f921b = {a.MA, a.IP, a.SN, a.GW, a.DS, a.PU, a.PP};

    /* renamed from: c, reason: collision with root package name */
    public static a[] f922c = {a.FQ, a.NM};
    public static a[] d = {a.MN, a.CN, a.RN};

    /* renamed from: a, reason: collision with root package name */
    public Hashtable<String, String> f923a;

    /* compiled from: IscpParameterSetup.java */
    /* loaded from: classes.dex */
    public enum a {
        MA("MA", 12, 1),
        IP("IP", 8, 0),
        SN("SN", 8, 0),
        GW("GW", 8, 0),
        DS("DS", 8, 0),
        PU("PU", 128, 0),
        PP("PP", 4, 4),
        FQ("FQ", 5, 3),
        NM("NM", 10, 3),
        MN("MN", 8, 0),
        CN("CN", 15, 3),
        RN("RN", 15, 3),
        PS("PS", 3, 0),
        BD("BD", 3, 0),
        FS("FS", 3, 0),
        other("__", 3, 0);


        /* renamed from: b, reason: collision with root package name */
        public String f924b;

        /* renamed from: c, reason: collision with root package name */
        public int f925c;
        public int d;

        a(String str, int i, int i2) {
            this.f924b = str;
            this.f925c = i;
            this.d = i2;
        }
    }

    /* compiled from: IscpParameterSetup.java */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        CURRENT,
        STORE
    }

    public final void a(String str, a[] aVarArr) {
        int i = 1;
        while (i < str.length() - 2) {
            StringBuilder a2 = b.a.a.a.a.a("");
            a2.append(str.charAt(i));
            a2.append(str.charAt(i + 1));
            String sb = a2.toString();
            a aVar = a.other;
            int i2 = aVar.f925c;
            int i3 = aVar.d;
            int length = aVarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                a aVar2 = aVarArr[i4];
                if (aVar2.f924b.equals(sb)) {
                    i2 = aVar2.f925c;
                    i3 = aVar2.d;
                    break;
                }
                i4++;
            }
            int i5 = i + 2;
            int i6 = i5 + i2;
            if (i6 + i3 <= str.length()) {
                this.f923a.put(sb, str.substring(i5, i6));
            }
            i = i5 + i2 + i3;
        }
    }

    public String a(a aVar) {
        return this.f923a.get(aVar.f924b);
    }
}
