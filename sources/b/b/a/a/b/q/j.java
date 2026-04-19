package b.b.a.a.b.q;

import java.util.HashMap;

/* compiled from: NcpListBoxGroupElement.java */
/* loaded from: classes.dex */
public class j extends f {
    public boolean g;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("listboxgroup", this.d);
        b(nVar);
        nVar.a("listboxgroup");
    }

    @Override // b.b.a.a.b.q.f, b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        String str;
        if (super.a(hashMap) && (str = hashMap.get("type")) != null) {
            if (str.equals("single")) {
                this.g = false;
            } else if (str.equals("multi")) {
                this.g = true;
            }
            return true;
        }
        return false;
    }

    @Override // b.b.a.a.b.q.f, b.b.a.a.b.q.e
    public boolean a(e eVar) {
        if (!(eVar instanceof i)) {
            return false;
        }
        super.a(eVar);
        return true;
    }
}
