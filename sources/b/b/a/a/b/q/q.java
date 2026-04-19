package b.b.a.a.b.q;

import java.util.HashMap;

/* compiled from: NcpTimerDrumElement.java */
/* loaded from: classes.dex */
public class q extends e {
    public int e;
    public int f;
    public int g;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("timer_drum", this.d);
        nVar.a("index", this.e);
        nVar.a("hour", this.f);
        nVar.a("minute", this.g);
        nVar.a("timer_drum");
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        this.e = b(hashMap.get("index"));
        this.f = b(hashMap.get("hour")) % 24;
        this.g = b(hashMap.get("minute")) % 60;
        return true;
    }
}
