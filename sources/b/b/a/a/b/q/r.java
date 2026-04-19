package b.b.a.a.b.q;

import java.util.HashMap;

/* compiled from: NcpYearRangeDrumElement.java */
/* loaded from: classes.dex */
public class r extends e {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("yearrange_drum", this.d);
        nVar.a("index", this.e);
        nVar.a("begin", this.i);
        nVar.a("end", this.j);
        nVar.a("yearrange_drum");
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        this.e = b(hashMap.get("index"));
        this.f = b(hashMap.get("range_min"));
        this.g = b(hashMap.get("range_max"));
        this.h = b(hashMap.get("range_step"));
        int i = this.g;
        int i2 = this.f;
        if (i < i2) {
            this.g = i2;
        }
        if (this.h <= 0) {
            this.h = 1;
        }
        this.i = a(b(hashMap.get("begin")));
        int a2 = a(b(hashMap.get("end")));
        this.j = a2;
        int i3 = this.i;
        if (a2 < i3) {
            this.j = i3;
        }
        return true;
    }

    public final int a(int i) {
        int i2 = this.f;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.g;
        if (i > i3) {
            i = i3;
        }
        int i4 = this.h;
        if (i4 <= 0) {
            return i;
        }
        int i5 = this.f;
        return (((i - i5) / i4) * i4) + i5;
    }
}
