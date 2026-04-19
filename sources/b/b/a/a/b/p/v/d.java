package b.b.a.a.b.p.v;

import b.b.a.a.b.r.l;
import java.io.CharConversionException;

/* compiled from: IscpParameter.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f915a;

    public static String a(boolean z) {
        return z ? "01" : "00";
    }

    public boolean a() {
        return a("01", "00");
    }

    public int b() {
        try {
            return Integer.parseInt(this.f915a);
        } catch (NumberFormatException unused) {
            throw new CharConversionException();
        }
    }

    public int c() {
        return a(this.f915a);
    }

    public l.b d() {
        if (this.f915a.contentEquals("STD")) {
            return l.b.STANDARD;
        }
        if (this.f915a.contentEquals("EXT")) {
            return l.b.EXTENDED;
        }
        if (this.f915a.contentEquals("VDC")) {
            return l.b.VIDEO;
        }
        return l.b.UNKNOWN;
    }

    public String toString() {
        return this.f915a;
    }

    public final boolean a(String str, String str2) {
        if (this.f915a.equals(str)) {
            return true;
        }
        if (this.f915a.equals(str2)) {
            return false;
        }
        throw new CharConversionException();
    }

    public static String b(int i, int i2) {
        return i2 == 1 ? i < 0 ? String.format("-%01X", Integer.valueOf(-i)) : i > 0 ? String.format("+%01X", Integer.valueOf(i)) : "00" : i < 0 ? String.format("-%02X", Integer.valueOf(-i)) : i > 0 ? String.format("+%02X", Integer.valueOf(i)) : "000";
    }

    public int a(int i, int i2) {
        return a(this.f915a.substring(i, i2 + i));
    }

    public final int a(String str) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (str.length() == 0) {
            return 0;
        }
        int i5 = 1;
        if (str.charAt(0) == '+') {
            i = 0;
            i4 = 1;
        } else if (str.charAt(0) == '-') {
            i = 0;
            i4 = 1;
            i5 = -1;
        } else {
            i = 0;
        }
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            int i6 = i << 4;
            if ('0' > charAt || charAt > '9') {
                if ('a' <= charAt && charAt <= 'f') {
                    i2 = charAt - 'a';
                } else {
                    if ('A' > charAt || charAt > 'F') {
                        throw new CharConversionException();
                    }
                    i2 = charAt - 'A';
                }
                i3 = i2 + 10;
            } else {
                i3 = charAt - '0';
            }
            i = i6 | i3;
            i4++;
        }
        return i * i5;
    }

    public static String a(int i) {
        return b(i, 1);
    }
}
