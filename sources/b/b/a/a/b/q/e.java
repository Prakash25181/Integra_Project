package b.b.a.a.b.q;

import java.util.HashMap;

/* compiled from: NcpElement.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public e f931a;

    /* renamed from: b, reason: collision with root package name */
    public e f932b;

    /* renamed from: c, reason: collision with root package name */
    public e f933c;
    public String d;

    /* compiled from: NcpElement.java */
    /* loaded from: classes.dex */
    public enum a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* compiled from: NcpElement.java */
    /* loaded from: classes.dex */
    public enum b {
        INVALID,
        DIALOG,
        OVERLAY
    }

    /* compiled from: NcpElement.java */
    /* loaded from: classes.dex */
    public enum c {
        PLAIN,
        PASSWORD
    }

    public void a(n nVar) {
    }

    public boolean a(e eVar) {
        return false;
    }

    public boolean a(HashMap<String, String> hashMap) {
        String str = hashMap.get("uri");
        if (str == null) {
            return false;
        }
        this.d = str;
        return true;
    }

    public void b(n nVar) {
        for (e eVar = this.f932b; eVar != null; eVar = eVar.f933c) {
            eVar.a(nVar);
        }
    }

    public a a(String str) {
        if (str != null) {
            if (str.equals("left")) {
                return a.LEFT;
            }
            if (str.equals("center")) {
                return a.CENTER;
            }
            if (str.equals("right")) {
                return a.RIGHT;
            }
        }
        return a.LEFT;
    }

    public int b(String str) {
        if (str != null) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }
}
