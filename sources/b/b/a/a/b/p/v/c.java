package b.b.a.a.b.p.v;

import b.b.a.a.b.p.g;
import java.nio.charset.Charset;

/* compiled from: IscpPacket.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f914a = Charset.forName("UTF-8");

    public static byte[] a(char c2, String str) {
        byte[] bytes = str.getBytes(f914a);
        int i = 18;
        byte[] bArr = new byte[bytes.length + 18 + 1];
        int i2 = 0;
        bArr[0] = 73;
        bArr[1] = 83;
        bArr[2] = 67;
        bArr[3] = 80;
        c(bArr, 4, 16);
        c(bArr, 8, bytes.length + 2 + 1);
        bArr[12] = 1;
        bArr[13] = 0;
        bArr[14] = 0;
        bArr[15] = 0;
        bArr[16] = 33;
        bArr[17] = (byte) c2;
        while (i2 < bytes.length) {
            bArr[i] = bytes[i2];
            i2++;
            i++;
        }
        bArr[i] = 10;
        return bArr;
    }

    public static int b(byte[] bArr, int i, int i2) {
        if (i2 < 12) {
            return 0;
        }
        if (bArr[i] != 73 || bArr[i + 1] != 83 || bArr[i + 2] != 67 || bArr[i + 3] != 80) {
            return -1;
        }
        int a2 = a(bArr, i + 4);
        int a3 = a(bArr, i + 8);
        if (a2 <= 0 || a3 <= 0) {
            return -1;
        }
        return a2 + a3;
    }

    public static void c(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0208, code lost:
    
        if (r1.b(r16, r9, r7) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0212, code lost:
    
        if (r1 == null) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b.b.a.a.b.p.v.b a(byte[] r16, int r17, int r18, java.net.InetAddress r19) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.v.c.a(byte[], int, int, java.net.InetAddress):b.b.a.a.b.p.v.b");
    }

    public static int a(byte[] bArr, int i, int i2) {
        if (i2 < 12) {
            return 12 - i2;
        }
        if (i2 < 12 || bArr[i] != 73 || bArr[i + 1] != 83 || bArr[i + 2] != 67 || bArr[i + 3] != 80) {
            return -1;
        }
        int a2 = a(bArr, i + 4);
        int a3 = a(bArr, i + 8);
        if (a2 <= 0 || a3 <= 0) {
            return -1;
        }
        if (i2 >= a2 + a3) {
            return 0;
        }
        return i2;
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static g.b a(String str) {
        if (str != null) {
            String upperCase = str.toUpperCase();
            if (upperCase.equals("DX")) {
                return g.b.NORTH_AMERICA;
            }
            if (upperCase.equals("XX")) {
                return g.b.EU_or_ASIA;
            }
            if (upperCase.equals("JJ")) {
                return g.b.JAPAN;
            }
        }
        return g.b.UNKNOWN;
    }
}
