package b.b.a.a.b.o;

/* compiled from: TunerBand.java */
/* loaded from: classes.dex */
public enum m {
    NONE,
    FM,
    AM,
    XM;

    public static m a(String str) {
        if (str != null) {
            if (str.equals("FM")) {
                return FM;
            }
            if (str.equals("AM")) {
                return AM;
            }
            if (str.equals("XM")) {
                return XM;
            }
        }
        return NONE;
    }
}
