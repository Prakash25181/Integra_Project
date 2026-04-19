package b.b.a.a.b.q;

/* compiled from: NcpSerializer.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f944a;

    /* renamed from: b, reason: collision with root package name */
    public int f945b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f946c;
    public int d;

    public static String a(m mVar, String str, int i) {
        n nVar = new n();
        StringBuilder sb = new StringBuilder(4096);
        nVar.f944a = sb;
        sb.append(str);
        nVar.f945b = 0;
        nVar.f946c = false;
        nVar.d = i;
        mVar.a(nVar);
        return nVar.f944a.toString();
    }

    public void b(String str, String str2) {
        if (this.f946c) {
            this.f944a.append(">");
        }
        if (str2 != null) {
            this.f944a.append(String.format("<%s uri=\"%s\"", str, str2));
        } else {
            this.f944a.append(String.format("<%s", str));
        }
        this.f945b++;
        this.f946c = true;
    }

    public final String b(String str) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            char charAt = str.charAt(i3);
            if (charAt != '\"') {
                if (charAt == '<' || charAt == '>') {
                    i2 += 4;
                } else if (charAt == '&') {
                    i2 += 5;
                } else if (charAt != '\'') {
                    i2++;
                }
            }
            i2 += 6;
        }
        if (i2 == str.length()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i2 + 1);
        int i4 = 0;
        while (i < str.length()) {
            char charAt2 = str.charAt(i);
            if (charAt2 == '\"' || charAt2 == '<' || charAt2 == '>' || charAt2 == '&' || charAt2 == '\'') {
                if (i4 < i) {
                    sb.append(str.substring(i4, i));
                }
                if (charAt2 == '\"') {
                    sb.append("&quot;");
                } else if (charAt2 == '<') {
                    sb.append("@le;");
                } else if (charAt2 == '>') {
                    sb.append("&gt;");
                } else if (charAt2 == '&') {
                    sb.append("&amp;");
                } else if (charAt2 == '\'') {
                    sb.append("&apos;");
                }
                i4 = i + 1;
            }
            i++;
        }
        if (i4 < i) {
            sb.append(str.substring(i4, i));
        }
        return sb.toString();
    }

    public void a(String str, String str2) {
        this.f944a.append(String.format(" %s=\"%s\"", str, b(str2)));
    }

    public void a(String str, boolean z) {
        if (z) {
            this.f944a.append(String.format(" %s=\"true\"", str));
        } else {
            this.f944a.append(String.format(" %s=\"false\"", str));
        }
    }

    public void a(String str, int i) {
        this.f944a.append(String.format(" %s=\"%d\"", str, Integer.valueOf(i)));
    }

    public void a(String str) {
        if (this.f946c) {
            this.f944a.append(" />");
            this.f946c = false;
        } else {
            this.f944a.append(String.format("</%s>", str));
        }
    }
}
