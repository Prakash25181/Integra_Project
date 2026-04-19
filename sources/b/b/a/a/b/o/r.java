package b.b.a.a.b.o;

import java.util.HashMap;
import java.util.Map;

/* compiled from: ZoneId.java */
/* loaded from: classes.dex */
public enum r {
    MAIN(0, 1),
    ZONE2(1, 2),
    ZONE3(2, 4),
    ZONE4(3, 8);

    public static final Map<Integer, r> h = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f836b;

    /* renamed from: c, reason: collision with root package name */
    public final int f837c;

    static {
        for (r rVar : values()) {
            h.put(Integer.valueOf(rVar.f836b), rVar);
        }
    }

    r(int i2, int i3) {
        this.f836b = i2;
        this.f837c = i3;
    }

    public static r a(int i2) {
        return h.get(Integer.valueOf(i2));
    }
}
