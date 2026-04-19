package b.b.a.a.b.r;

import b.b.a.a.b.r.l;

/* compiled from: NetUsbMenuDirectory.java */
/* loaded from: classes.dex */
public final class t extends i {
    public int h;

    public t(String str, int i, l.e eVar, int i2) {
        super(str, i, eVar, i2 >= 10 ? 10 : i2);
        this.h = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r1 != 'U') goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(b.b.a.a.b.p.v.d r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f915a
            int r1 = r0.length()
            r2 = 3
            r3 = 0
            if (r1 < r2) goto L8e
            char r1 = r0.charAt(r3)
            r4 = 65
            r5 = 0
            r6 = 2
            r7 = 1
            if (r1 == r4) goto L57
            r4 = 67
            if (r1 == r4) goto L1e
            r4 = 85
            if (r1 == r4) goto L57
            goto L8e
        L1e:
            java.lang.String r9 = r9.f915a     // Catch: java.lang.NumberFormatException -> L50 java.io.CharConversionException -> L56
            java.lang.String r9 = r9.substring(r7, r6)     // Catch: java.lang.NumberFormatException -> L50 java.io.CharConversionException -> L56
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L50 java.io.CharConversionException -> L56
            r8.h = r9     // Catch: java.io.CharConversionException -> L56
            char r9 = r0.charAt(r6)
            if (r9 == r4) goto L48
            r0 = 80
            if (r9 == r0) goto L35
            goto L8e
        L35:
            r8.f = r3
        L37:
            java.util.ArrayList<b.b.a.a.b.r.h> r9 = r8.e
            int r9 = r9.size()
            if (r3 >= r9) goto L47
            java.util.ArrayList<b.b.a.a.b.r.h> r9 = r8.e
            r9.set(r3, r5)
            int r3 = r3 + 1
            goto L37
        L47:
            return r7
        L48:
            b.b.a.a.b.r.i$a r9 = r8.f967a
            if (r9 == 0) goto L4f
            r9.b(r8)
        L4f:
            return r7
        L50:
            java.io.CharConversionException r9 = new java.io.CharConversionException     // Catch: java.io.CharConversionException -> L56
            r9.<init>()     // Catch: java.io.CharConversionException -> L56
            throw r9     // Catch: java.io.CharConversionException -> L56
        L56:
            return r3
        L57:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r9 = r9.f915a     // Catch: java.lang.NumberFormatException -> L88 java.io.CharConversionException -> L8e
            java.lang.String r9 = r9.substring(r7, r6)     // Catch: java.lang.NumberFormatException -> L88 java.io.CharConversionException -> L8e
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L88 java.io.CharConversionException -> L8e
            if (r9 < 0) goto L87
            r4 = 9
            if (r9 <= r4) goto L6d
            goto L87
        L6d:
            char r3 = r0.charAt(r6)
            b.b.a.a.b.r.h$a r3 = b.b.a.a.b.r.h.a.a(r3)
            java.lang.String r0 = r0.substring(r2)
            int r2 = r3.f966b
            b.b.a.a.b.r.h r3 = new b.b.a.a.b.r.h
            r3.<init>(r0, r2, r5)
            r1.add(r3)
            r8.a(r1, r9)
            return r7
        L87:
            return r3
        L88:
            java.io.CharConversionException r9 = new java.io.CharConversionException     // Catch: java.io.CharConversionException -> L8e
            r9.<init>()     // Catch: java.io.CharConversionException -> L8e
            throw r9     // Catch: java.io.CharConversionException -> L8e
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.r.t.a(b.b.a.a.b.p.v.d):boolean");
    }

    @Override // b.b.a.a.b.r.i
    public boolean b() {
        return true;
    }
}
