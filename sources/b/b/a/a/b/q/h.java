package b.b.a.a.b.q;

import b.b.a.a.b.q.e;
import java.util.HashMap;

/* compiled from: NcpLineElement.java */
/* loaded from: classes.dex */
public class h extends e {
    public String e;
    public int f;
    public e.a g;

    @Override // b.b.a.a.b.q.e
    public boolean a(HashMap<String, String> hashMap) {
        int i = 0;
        if (!super.a(hashMap)) {
            return false;
        }
        String str = hashMap.get("text");
        int length = str.length();
        this.f = 0;
        int i2 = 2;
        StringBuilder sb = null;
        while (i2 < length) {
            int i3 = i2 - 2;
            char charAt = str.charAt(i3);
            char charAt2 = str.charAt(i2 - 1);
            char charAt3 = str.charAt(i2);
            if ((charAt2 == 183 || charAt2 == 12539) && charAt == ' ' && charAt3 == ' ') {
                if (sb == null) {
                    sb = new StringBuilder(length);
                }
                sb.append(str.substring(i, i3));
                sb.append("\n");
                this.f++;
                i = i2 + 1;
            }
            i2++;
        }
        if (sb != null && i < i2) {
            sb.append(str.substring(i, i2));
            this.f++;
        }
        if (sb == null) {
            this.e = str;
            this.f = 1;
        } else {
            this.e = sb.toString();
        }
        this.g = a(hashMap.get("align"));
        return true;
    }
}
