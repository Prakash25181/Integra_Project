package a.e.h;

import android.util.Base64;
import java.util.List;

/* compiled from: FontRequest.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f389a;

    /* renamed from: b, reason: collision with root package name */
    public final String f390b;

    /* renamed from: c, reason: collision with root package name */
    public final String f391c;
    public final List<List<byte[]>> d;
    public final int e;
    public final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        if (str != null) {
            this.f389a = str;
            if (str2 != null) {
                this.f390b = str2;
                if (str3 != null) {
                    this.f391c = str3;
                    if (list != null) {
                        this.d = list;
                        this.e = 0;
                        this.f = str + "-" + this.f390b + "-" + this.f391c;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = b.a.a.a.a.a("FontRequest {mProviderAuthority: ");
        a2.append(this.f389a);
        a2.append(", mProviderPackage: ");
        a2.append(this.f390b);
        a2.append(", mQuery: ");
        a2.append(this.f391c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
