package b.b.a.a.f.k0.v;

import android.content.Context;
import b.b.a.a.c.d;

/* compiled from: UpnpContentPage.java */
/* loaded from: classes.dex */
public abstract class e extends b.b.a.a.f.k0.u.n {
    public a e;

    /* compiled from: UpnpContentPage.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public e(Context context, a aVar) {
        super(context);
        this.e = aVar;
    }

    public void a(d.m mVar, int i, int i2) {
        a aVar = this.e;
        if (aVar != null) {
            p pVar = (p) aVar;
            b.b.a.a.b.u.c cVar = pVar.f;
            d.m b2 = cVar.b();
            cVar.f1067c.pop();
            cVar.f1067c.push(Integer.valueOf(i));
            if (!b2.e) {
                cVar.f1067c.push(0);
                cVar.d.push(mVar);
                cVar.d.lastElement().a(true);
                cVar.h = false;
                pVar.f.a(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public void b(int i) {
        a aVar = this.e;
        if (aVar != null) {
            p pVar = (p) aVar;
            if (pVar.f.a(i)) {
                return;
            }
            pVar.a(pVar.j(), true);
        }
    }
}
