package b.b.a.a.b.o;

import java.util.HashMap;
import java.util.Map;

/* compiled from: SelectorId.java */
/* loaded from: classes.dex */
public enum h {
    VIDEO1(0),
    VIDEO2(1),
    VIDEO3(2),
    VIDEO4(3),
    VIDEO5(4),
    VIDEO6(5),
    VIDEO7(6),
    EXTRA1(7),
    EXTRA2(8),
    EXTRA3(9),
    BD_DVD(16),
    STRM_BOX(17),
    TV2(18),
    TV_TAPE(32),
    TAPE2(33),
    PHONO(34),
    TV_CD(35),
    TUNER_FM(36),
    TUNER_AM(37),
    TUNER(38),
    MUSIC_SERVER(39),
    INTERNET_RADIO(40),
    USB_FRONT(41),
    USB_REAR(42),
    NETWORK(43),
    USB(44),
    AIRPLAY(45),
    BLUETOOTH(46),
    U_PORT(64),
    MULTICH(48),
    TUNER_XM(49),
    TUNER_SIRIUS(50),
    TUNER_DAB(51),
    LINE1(65),
    LINE2(66),
    OPTICAL(68),
    COAXIAL(69),
    SOURCE(128),
    UNKNOWN(255);

    public static final Map<Integer, h> P = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f815b;

    static {
        for (h hVar : values()) {
            P.put(Integer.valueOf(hVar.f815b), hVar);
        }
    }

    h(int i) {
        this.f815b = i;
    }

    public static h a(int i) {
        h hVar = P.get(Integer.valueOf(i));
        return hVar == null ? UNKNOWN : hVar;
    }
}
