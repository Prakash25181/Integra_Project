package b.b.a.a.b.o;

import java.util.HashMap;

/* compiled from: StepRangeInfo.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public String f821a;

    /* renamed from: b, reason: collision with root package name */
    public int f822b;

    /* renamed from: c, reason: collision with root package name */
    public int f823c;
    public float d;
    public int e;

    public boolean a(HashMap<String, String> hashMap) {
        String str = hashMap.get("id");
        if (str == null) {
            return false;
        }
        this.f821a = str.trim();
        this.f822b = 0;
        String str2 = hashMap.get("min");
        if (str2 != null) {
            try {
                this.f822b = Integer.parseInt(str2);
            } catch (NumberFormatException unused) {
            }
        }
        this.f823c = 0;
        String str3 = hashMap.get("max");
        if (str3 != null) {
            try {
                this.f823c = Integer.parseInt(str3);
            } catch (NumberFormatException unused2) {
            }
        }
        this.d = 0.0f;
        if (hashMap.get("step") != null) {
            try {
                this.d = Integer.parseInt(r2);
            } catch (NumberFormatException unused3) {
            }
        }
        String str4 = hashMap.get("zone");
        if (str4 != null) {
            this.e = c.a(str4);
        } else {
            this.e = r.MAIN.f837c;
        }
        if (this.d == 0.0f) {
            this.d = 0.5f;
            this.f822b *= 2;
            this.f823c *= 2;
        }
        return this.f822b < this.f823c && this.e != 0;
    }
}
