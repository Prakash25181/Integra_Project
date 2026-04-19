package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r8 != 5) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.core.graphics.drawable.IconCompat read(a.n.a r8) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f699a
            r2 = 1
            int r1 = r8.a(r1, r2)
            r0.f699a = r1
            byte[] r1 = r0.f701c
            r3 = 2
            boolean r4 = r8.a(r3)
            if (r4 != 0) goto L18
            goto L2d
        L18:
            r1 = r8
            a.n.b r1 = (a.n.b) r1
            android.os.Parcel r4 = r1.e
            int r4 = r4.readInt()
            if (r4 >= 0) goto L25
            r1 = 0
            goto L2d
        L25:
            byte[] r4 = new byte[r4]
            android.os.Parcel r1 = r1.e
            r1.readByteArray(r4)
            r1 = r4
        L2d:
            r0.f701c = r1
            android.os.Parcelable r1 = r0.d
            r4 = 3
            android.os.Parcelable r1 = r8.a(r1, r4)
            r0.d = r1
            int r1 = r0.e
            r5 = 4
            int r1 = r8.a(r1, r5)
            r0.e = r1
            int r1 = r0.f
            r6 = 5
            int r1 = r8.a(r1, r6)
            r0.f = r1
            android.content.res.ColorStateList r1 = r0.g
            r7 = 6
            android.os.Parcelable r1 = r8.a(r1, r7)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.g = r1
            java.lang.String r1 = r0.i
            r7 = 7
            boolean r7 = r8.a(r7)
            if (r7 != 0) goto L5f
            goto L67
        L5f:
            a.n.b r8 = (a.n.b) r8
            android.os.Parcel r8 = r8.e
            java.lang.String r1 = r8.readString()
        L67:
            r0.i = r1
            android.graphics.PorterDuff$Mode r8 = android.graphics.PorterDuff.Mode.valueOf(r1)
            r0.h = r8
            int r8 = r0.f699a
            r1 = -1
            if (r8 == r1) goto La8
            if (r8 == r2) goto L94
            if (r8 == r3) goto L84
            if (r8 == r4) goto L7f
            if (r8 == r5) goto L84
            if (r8 == r6) goto L94
            goto Lae
        L7f:
            byte[] r8 = r0.f701c
            r0.f700b = r8
            goto Lae
        L84:
            java.lang.String r8 = new java.lang.String
            byte[] r1 = r0.f701c
            java.lang.String r2 = "UTF-16"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r8.<init>(r1, r2)
            r0.f700b = r8
            goto Lae
        L94:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto L9b
            r0.f700b = r8
            goto Lae
        L9b:
            byte[] r8 = r0.f701c
            r0.f700b = r8
            r0.f699a = r4
            r1 = 0
            r0.e = r1
            int r8 = r8.length
            r0.f = r8
            goto Lae
        La8:
            android.os.Parcelable r8 = r0.d
            if (r8 == 0) goto Laf
            r0.f700b = r8
        Lae:
            return r0
        Laf:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(a.n.a):androidx.core.graphics.drawable.IconCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (r0 != 5) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void write(androidx.core.graphics.drawable.IconCompat r8, a.n.a r9) {
        /*
            if (r9 == 0) goto Laf
            android.graphics.PorterDuff$Mode r0 = r8.h
            java.lang.String r0 = r0.name()
            r8.i = r0
            int r0 = r8.f699a
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = -1
            if (r0 == r6) goto L4f
            if (r0 == r5) goto L48
            java.lang.String r7 = "UTF-16"
            if (r0 == r4) goto L39
            if (r0 == r3) goto L32
            if (r0 == r2) goto L21
            if (r0 == r1) goto L48
            goto L55
        L21:
            java.lang.Object r0 = r8.f700b
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.f701c = r0
            goto L55
        L32:
            java.lang.Object r0 = r8.f700b
            byte[] r0 = (byte[]) r0
            r8.f701c = r0
            goto L55
        L39:
            java.lang.Object r0 = r8.f700b
            java.lang.String r0 = (java.lang.String) r0
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r7)
            byte[] r0 = r0.getBytes(r7)
            r8.f701c = r0
            goto L55
        L48:
            java.lang.Object r0 = r8.f700b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.d = r0
            goto L55
        L4f:
            java.lang.Object r0 = r8.f700b
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r8.d = r0
        L55:
            int r0 = r8.f699a
            if (r6 == r0) goto L5c
            r9.b(r0, r5)
        L5c:
            byte[] r0 = r8.f701c
            if (r0 == 0) goto L71
            r9.b(r4)
            r4 = r9
            a.n.b r4 = (a.n.b) r4
            android.os.Parcel r5 = r4.e
            int r6 = r0.length
            r5.writeInt(r6)
            android.os.Parcel r4 = r4.e
            r4.writeByteArray(r0)
        L71:
            android.os.Parcelable r0 = r8.d
            r4 = 0
            if (r0 == 0) goto L81
            r9.b(r3)
            r3 = r9
            a.n.b r3 = (a.n.b) r3
            android.os.Parcel r3 = r3.e
            r3.writeParcelable(r0, r4)
        L81:
            int r0 = r8.e
            if (r0 == 0) goto L88
            r9.b(r0, r2)
        L88:
            int r0 = r8.f
            if (r0 == 0) goto L8f
            r9.b(r0, r1)
        L8f:
            android.content.res.ColorStateList r0 = r8.g
            if (r0 == 0) goto L9f
            r1 = 6
            r9.b(r1)
            r1 = r9
            a.n.b r1 = (a.n.b) r1
            android.os.Parcel r1 = r1.e
            r1.writeParcelable(r0, r4)
        L9f:
            java.lang.String r8 = r8.i
            if (r8 == 0) goto Lae
            r0 = 7
            r9.b(r0)
            a.n.b r9 = (a.n.b) r9
            android.os.Parcel r9 = r9.e
            r9.writeString(r8)
        Lae:
            return
        Laf:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, a.n.a):void");
    }
}
