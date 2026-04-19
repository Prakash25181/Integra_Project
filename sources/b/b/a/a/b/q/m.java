package b.b.a.a.b.q;

import b.b.a.a.b.q.e;
import java.util.HashMap;

/* compiled from: NcpPopup.java */
/* loaded from: classes.dex */
public class m extends f {
    public e.b g;
    public int h;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("popup", this.d);
        int ordinal = this.g.ordinal();
        if (ordinal == 1) {
            nVar.a("type", "custom");
        } else if (ordinal == 2) {
            nVar.a("type", "overlay");
        }
        for (e eVar = this.f932b; eVar != null; eVar = eVar.f933c) {
            eVar.a(nVar);
        }
        nVar.a("popup");
    }

    @Override // b.b.a.a.b.q.f, b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        String str;
        int b2;
        int i = 0;
        if (super.a(hashMap) && (str = hashMap.get("type")) != null) {
            if (str.equals("custom")) {
                this.g = e.b.DIALOG;
            } else if (str.equals("overlay")) {
                this.g = e.b.OVERLAY;
            }
            String str2 = hashMap.get("time");
            if (str2 != null && (b2 = b(str2)) >= 0) {
                i = b2;
            }
            this.h = i;
            return true;
        }
        return false;
    }
}
