package b.b.a.a.b;

import java.util.HashMap;
import java.util.Map;

/* compiled from: AppModel.java */
/* loaded from: classes.dex */
public enum f {
    onkyo("onkyo"),
    integra("integra"),
    pioneer("pioneer");

    public static f f = null;
    public static Map<String, f> g = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public String f735b;

    static {
        for (f fVar : values()) {
            g.put(fVar.f735b, fVar);
        }
    }

    f(String str) {
        this.f735b = str;
    }
}
