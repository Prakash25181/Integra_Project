package b.b.a.a.b.o;

import java.util.HashMap;
import java.util.Map;

/* compiled from: NetworkServiceId.java */
/* loaded from: classes.dex */
public enum e {
    DLNA(0),
    FAVORITE(1),
    VTUNER(2),
    SERIUS_XM(3),
    PANDORA(4),
    RHAPSODY(5),
    LAST_FM(6),
    NAPSTER(7),
    SLACKER(8),
    MEDIAFLY(9),
    SPOTIFY(10),
    AUPEO(11),
    RADIKO(12),
    E_ONKYO(13),
    TUNEIN(14),
    MP3TUNES(15),
    SIMFY(16),
    HOME_MEDIA(17),
    DEEZER(18),
    AIRPLAY(24),
    TIDAL(27),
    USB_FRONT(240),
    USB_REAR(241),
    INTERNET_RADIO(242),
    NET_TOP(243),
    BLUETOOTH(244),
    NONE(255),
    THIS_DEVICE(256),
    DEMO(238);

    public static final Map<Integer, e> F = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final int f807b;

    static {
        for (e eVar : values()) {
            F.put(Integer.valueOf(eVar.f807b), eVar);
        }
    }

    e(int i) {
        this.f807b = i;
    }

    public static e a(int i) {
        return F.get(Integer.valueOf(i));
    }
}
