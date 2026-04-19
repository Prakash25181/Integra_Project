package b.b.a.a.b.q;

import b.b.a.a.b.q.e;
import java.util.HashMap;

/* compiled from: NcpTextBoxElement.java */
/* loaded from: classes.dex */
public class o extends e {
    public String e;
    public String f;
    public e.a g;
    public e.c h;
    public int i;

    @Override // b.b.a.a.b.q.e
    public void a(n nVar) {
        nVar.b("textbox", this.d);
        nVar.a("index", this.i);
        String str = this.f;
        if ((nVar.d & 1) != 0 && str.length() == 0) {
            str = " ";
        }
        nVar.f944a.append(String.format(" value=\"%s\"", nVar.b(str)));
        nVar.a("textbox");
    }

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        if (!super.a(hashMap)) {
            return false;
        }
        String str = hashMap.get("type");
        if (str != null) {
            if (str.equals("plain")) {
                this.h = e.c.PLAIN;
            } else {
                if (!str.equals("password")) {
                    return false;
                }
                this.h = e.c.PASSWORD;
            }
        } else {
            this.h = e.c.PLAIN;
        }
        this.e = hashMap.get("text");
        this.i = b(hashMap.get("index"));
        String str2 = hashMap.get("value");
        this.f = str2;
        if (str2 == null) {
            this.f = "";
        }
        this.g = a(hashMap.get("align"));
        return true;
    }
}
