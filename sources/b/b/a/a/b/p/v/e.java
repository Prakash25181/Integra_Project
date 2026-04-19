package b.b.a.a.b.p.v;

import java.util.ArrayList;

/* compiled from: IscpParameterPopup.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f916a;

    /* renamed from: b, reason: collision with root package name */
    public String f917b;

    /* renamed from: c, reason: collision with root package name */
    public String f918c;
    public ArrayList<a> d;
    public int e;
    public String[] f = new String[2];
    public int g;

    /* compiled from: IscpParameterPopup.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f919a;

        /* renamed from: b, reason: collision with root package name */
        public String f920b;

        public a(e eVar, String str, String str2) {
            this.f919a = str;
            this.f920b = str2;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 0) {
            i++;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(byte[] r10, int r11, int r12) {
        /*
            r9 = this;
            int r12 = r12 + r11
            r0 = r10[r11]
            r1 = 66
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L1d
            r1 = 76
            if (r0 == r1) goto L12
            r1 = 84
            if (r0 == r1) goto L1d
            return r2
        L12:
            r0 = 6
            r9.f916a = r3
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.d = r1
            goto L20
        L1d:
            r9.f916a = r2
            r0 = 1
        L20:
            int r11 = r11 + r3
            int r1 = r9.a(r10, r11, r12)
            int r4 = r1 - r11
            java.lang.String r11 = r9.c(r10, r11, r4)
            r9.f917b = r11
            int r1 = r1 + r3
            r11 = 0
        L2f:
            r4 = 0
            r5 = 2
            if (r11 >= r0) goto L74
            java.lang.String[] r6 = new java.lang.String[r5]
            r6[r2] = r4
            r6[r3] = r4
            r4 = 0
        L3a:
            if (r4 >= r5) goto L52
            if (r1 < r12) goto L3f
            return r2
        L3f:
            int r7 = r9.a(r10, r1, r12)
            if (r7 <= r1) goto L4d
            int r8 = r7 - r1
            java.lang.String r1 = r9.c(r10, r1, r8)
            r6[r4] = r1
        L4d:
            int r1 = r7 + 1
            int r4 = r4 + 1
            goto L3a
        L52:
            r4 = r6[r2]
            if (r4 != 0) goto L5a
            r4 = r6[r3]
            if (r4 == 0) goto L71
        L5a:
            boolean r4 = r9.f916a
            if (r4 == 0) goto L6d
            java.util.ArrayList<b.b.a.a.b.p.v.e$a> r4 = r9.d
            b.b.a.a.b.p.v.e$a r5 = new b.b.a.a.b.p.v.e$a
            r7 = r6[r2]
            r6 = r6[r3]
            r5.<init>(r9, r7, r6)
            r4.add(r5)
            goto L71
        L6d:
            r4 = r6[r3]
            r9.f918c = r4
        L71:
            int r11 = r11 + 1
            goto L2f
        L74:
            if (r1 < r12) goto L77
            return r2
        L77:
            r11 = r10[r1]
            switch(r11) {
                case 48: goto L85;
                case 49: goto L82;
                case 50: goto L7f;
                default: goto L7c;
            }
        L7c:
            r9.g = r2
            goto L88
        L7f:
            r9.g = r3
            goto L88
        L82:
            r9.g = r2
            goto L88
        L85:
            r11 = -1
            r9.g = r11
        L88:
            int r1 = r1 + r3
            r9.e = r2
            java.lang.String[] r11 = r9.f
            r11[r3] = r4
            r11[r2] = r4
            r11 = 0
        L92:
            if (r11 >= r5) goto Lb1
            if (r1 < r12) goto L97
            return r2
        L97:
            int r0 = r9.a(r10, r1, r12)
            if (r0 <= r1) goto Lac
            java.lang.String[] r4 = r9.f
            int r6 = r0 - r1
            java.lang.String r1 = r9.c(r10, r1, r6)
            r4[r11] = r1
            int r1 = r9.e
            int r1 = r1 + r3
            r9.e = r1
        Lac:
            int r1 = r0 + 1
            int r11 = r11 + 1
            goto L92
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.v.e.b(byte[], int, int):boolean");
    }

    public final String c(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, "UTF-8");
    }
}
