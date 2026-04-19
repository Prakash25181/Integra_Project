package b.b.a.a.e;

import java.util.ArrayList;

/* compiled from: ReorderbleArray.java */
/* loaded from: classes.dex */
public class d<CLASS> {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<CLASS> f1136a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<CLASS> f1137b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<CLASS> f1138c;

    public d(ArrayList<CLASS> arrayList) {
        this.f1136a = new ArrayList<>(arrayList);
        this.f1137b = new ArrayList<>(arrayList);
        this.f1138c = new ArrayList<>(arrayList);
    }

    public boolean a(CLASS r2) {
        return r2 != null && this.f1138c.contains(r2);
    }

    public void a(CLASS r4, boolean z) {
        if (r4 != null) {
            if (z) {
                int i = 0;
                int i2 = 0;
                while (i < this.f1137b.size() && r4 != this.f1137b.get(i)) {
                    if (i2 < this.f1138c.size() && this.f1137b.get(i) == this.f1138c.get(i2)) {
                        i2++;
                    }
                    i++;
                }
                if (i >= this.f1137b.size() || i2 >= this.f1138c.size() || this.f1138c.get(i2) != this.f1137b.get(i)) {
                    this.f1138c.add(i2, r4);
                    return;
                }
                return;
            }
            if (a(r4)) {
                this.f1138c.remove(r4);
            }
        }
    }

    public void a(int i, int i2) {
        if (i == i2 || i < 0 || i >= this.f1137b.size() || i2 < 0 || i2 >= this.f1137b.size()) {
            return;
        }
        CLASS r3 = this.f1137b.get(i);
        boolean a2 = a(r3);
        if (a2) {
            a((d<CLASS>) r3, false);
        }
        this.f1137b.remove(r3);
        this.f1137b.add(i2, r3);
        if (a2) {
            a((d<CLASS>) r3, true);
        }
    }
}
