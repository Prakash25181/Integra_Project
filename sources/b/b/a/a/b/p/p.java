package b.b.a.a.b.p;

import android.util.Log;
import b.b.a.a.b.p.d;
import java.util.Iterator;

/* compiled from: IscpIo.java */
/* loaded from: classes.dex */
public class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f897b;

    public p(r rVar) {
        this.f897b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a aVar = (d.a) this.f897b.f900a;
        if (aVar == null) {
            throw null;
        }
        Log.d("ISCP Connect", "DISCONNECTED");
        d dVar = d.this;
        d.j jVar = dVar.e;
        dVar.e = d.j.DISCONNECTED;
        dVar.f850a = null;
        dVar.o();
        b.b.a.a.e.e eVar = d.this.B;
        if (eVar != null) {
            eVar.a();
        }
        b.b.a.a.b.t.e eVar2 = d.this.l;
        if (eVar2 != null) {
            eVar2.d = false;
            b.b.a.a.e.e eVar3 = eVar2.e;
            if (eVar3 != null) {
                eVar3.a();
                eVar2.e = null;
            }
        }
        Iterator<b.b.a.a.b.l> it = d.this.d.values().iterator();
        while (it.hasNext()) {
            b.b.a.a.b.t.b bVar = it.next().p;
            if (bVar != null) {
                bVar.a();
            }
        }
        b.b.a.a.b.r.l lVar = d.this.q;
        if (lVar != null) {
            lVar.e();
        }
        d.this.g();
        int ordinal = jVar.ordinal();
        if (ordinal == 1) {
            d.this.y.a(true);
            return;
        }
        if (ordinal == 2) {
            d.this.y.a(d.i.REPLY_TIMEOUT);
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                d.this.y.a(false);
            } else {
                d.this.y.f();
            }
        }
    }
}
