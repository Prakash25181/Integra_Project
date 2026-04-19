package b.b.a.a.b.o;

/* compiled from: AvInfo.java */
/* loaded from: classes.dex */
public class b {
    public String a(String str, String str2) {
        boolean z = str != null && str.length() > 0;
        boolean z2 = str2 != null && str2.length() > 0;
        if (z && z2) {
            return String.format("%s %s", str, str2);
        }
        return z ? str : z2 ? str2 : "";
    }

    public boolean b(String str, String str2) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        return str.equals(str2);
    }
}
