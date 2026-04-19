package b.b.a.a.b.t;

import b.b.a.a.b.o.o;
import b.b.a.a.e.e;
import java.util.ArrayList;

/* compiled from: TunerPresetList.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f1055a;

    /* renamed from: b, reason: collision with root package name */
    public int f1056b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<o> f1057c;
    public boolean d;
    public b.b.a.a.e.e e;
    public int f;

    public e(b.b.a.a.b.p.d dVar) {
        this.f1055a = dVar;
    }

    public final void a(o oVar) {
        int i;
        if (oVar == null || (i = oVar.f831a) < 1 || i > this.f1056b) {
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.f1057c.size()) {
                break;
            }
            int i3 = this.f1057c.get(i2).f831a;
            int i4 = oVar.f831a;
            if (i3 == i4) {
                this.f1057c.set(i2, oVar);
                break;
            } else {
                if (i3 >= i4) {
                    this.f1057c.add(i2, oVar);
                    break;
                }
                i2++;
            }
        }
        if (i2 == this.f1057c.size()) {
            this.f1057c.add(oVar);
        }
        int i5 = this.f1056b;
        this.f1057c.size();
    }

    public final void a() {
        if (this.d) {
            if (this.f1057c.size() < this.f1056b) {
                int i = 1;
                for (int i2 = 0; i2 < this.f1057c.size() && this.f1057c.get(i2).f831a <= i; i2++) {
                    i++;
                }
                this.f = i;
                this.f1055a.a(b.b.a.a.b.p.v.a.sPS, String.format("CQSTNPS%03d", Integer.valueOf(i)));
                b.b.a.a.e.e a2 = b.b.a.a.e.e.a((e.b) new d(this), true);
                this.e = a2;
                a2.a(false, 3000);
                return;
            }
            this.d = false;
            b.b.a.a.e.e eVar = this.e;
            if (eVar != null) {
                eVar.a();
                this.e = null;
            }
        }
    }
}
