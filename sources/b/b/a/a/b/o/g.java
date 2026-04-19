package b.b.a.a.b.o;

import android.graphics.drawable.Drawable;
import java.util.HashMap;

/* compiled from: SelectorIcon.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f811c = {"aux1", "aux2", "aux3", "aux4", "aux5", "aux6", "bd", "dvd", "cd", "game1", "pc1", "pc2", "tv", "cbl", "dvr", "sat", "net", "iradio", "bluetooth", "server", "usb", "strmbox", "tuner", "dap", "dock", "md", "tape", "phono1", "phono2", "other"};
    public static final HashMap<Integer, String> d = new a();
    public static g[] e;

    /* renamed from: a, reason: collision with root package name */
    public String f812a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f813b;

    /* compiled from: SelectorIcon.java */
    /* loaded from: classes.dex */
    public class a extends HashMap<Integer, String> {
        public a() {
            put(0, "dvr");
            put(1, "cbl");
            put(2, "game1");
            put(3, "aux1");
            put(4, "game1");
            put(5, "pc1");
            put(7, "other");
            put(8, "other");
            put(9, "other");
            put(16, "bd");
            put(17, "strmbox");
            put(18, "tv");
            put(32, "tv");
            put(34, "phono1");
            put(35, "tv");
            put(36, "tuner");
            put(37, "tuner");
            put(38, "tuner");
            put(39, "server");
            put(40, "iradio");
            put(41, "usb");
            put(42, "usb");
            put(43, "net");
            put(44, "usb");
            put(45, "dap");
            put(46, "bluetooth");
            put(64, "other");
            put(48, "other");
            put(50, "tuner");
            put(51, "tuner");
            put(65, "aux3");
            put(66, "aux3");
            put(68, "aux5");
            put(69, "aux4");
            put(70, "aux3");
            put(71, "cd");
            put(256, "tape");
            put(257, "cd");
            put(258, "aux1");
        }
    }

    static {
        int i = 0;
        g[] gVarArr = new g[f811c.length];
        while (true) {
            String[] strArr = f811c;
            if (i < strArr.length) {
                gVarArr[i] = new g(strArr[i], a.b.k.r.c("ic_selector_" + strArr[i]));
                i++;
            } else {
                e = gVarArr;
                return;
            }
        }
    }

    public g(String str, Drawable drawable) {
        this.f812a = str;
        this.f813b = drawable;
    }

    public static final g a(String str) {
        if (str != null) {
            for (g gVar : e) {
                if (gVar.f812a.equals(str)) {
                    return gVar;
                }
            }
        }
        return a("other");
    }
}
