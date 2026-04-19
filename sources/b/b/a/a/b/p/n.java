package b.b.a.a.b.p;

import android.util.Log;
import b.b.a.a.b.p.d;

/* compiled from: IscpIo.java */
/* loaded from: classes.dex */
public class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f895b;

    public n(r rVar) {
        this.f895b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.a aVar = (d.a) this.f895b.f900a;
        if (aVar != null) {
            Log.d("ISCP Connect", "DISCONNECTED(FAIL)");
            d dVar = d.this;
            dVar.e = d.j.DISCONNECTED;
            dVar.f850a = null;
            dVar.o();
            b.b.a.a.e.e eVar = d.this.B;
            if (eVar != null) {
                eVar.a();
            }
            d.this.y.a(d.i.COULD_NOT_CONNECT);
            return;
        }
        throw null;
    }
}
