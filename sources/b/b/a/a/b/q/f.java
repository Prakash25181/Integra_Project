package b.b.a.a.b.q;

import b.b.a.a.b.q.e;
import java.util.HashMap;

/* compiled from: NcpGroupElement.java */
/* loaded from: classes.dex */
public class f extends e {
    public String e;
    public e.a f;

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        this.e = hashMap.get("title");
        this.f = a(hashMap.get("align"));
        return true;
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(e eVar) {
        e eVar2 = this.f932b;
        if (eVar2 == null) {
            this.f932b = eVar;
            eVar.f933c = null;
            eVar.f931a = this;
            return true;
        }
        while (true) {
            e eVar3 = eVar2.f933c;
            if (eVar3 == null) {
                eVar2.f933c = eVar;
                eVar.f931a = this;
                return true;
            }
            eVar2 = eVar3;
        }
    }
}
