package b.b.a.a.b.q;

import java.util.HashMap;

/* compiled from: NcpListBoxElement.java */
/* loaded from: classes.dex */
public class i extends e {
    public a e;
    public String f;
    public int g;
    public boolean h;

    /* compiled from: NcpListBoxElement.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("listbox", this.d);
        nVar.a("index", this.g);
        nVar.a("selected", this.h);
        nVar.a("listbox");
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        this.f = hashMap.get("text");
        a(hashMap.get("align"));
        this.g = b(hashMap.get("index"));
        this.h = false;
        return this.f != null;
    }
}
