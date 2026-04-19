package b.b.a.a.b.q;

import b.b.a.a.b.q.e;
import java.util.HashMap;

/* compiled from: NcpButtonElement.java */
/* loaded from: classes.dex */
public class b extends e {
    public String e;
    public e.a f;
    public int g;
    public boolean h;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("button", this.d);
        nVar.a("index", this.g);
        nVar.a("selected", this.h);
        nVar.a("button");
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        this.e = hashMap.get("text");
        this.f = a(hashMap.get("align"));
        this.g = b(hashMap.get("index"));
        this.h = false;
        return this.e != null;
    }
}
