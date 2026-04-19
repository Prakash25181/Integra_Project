package b.b.a.a.b.r;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NetUsbKeyboard.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.p.d f976b;
    public String d;

    /* renamed from: a, reason: collision with root package name */
    public c f975a = new c(this);

    /* renamed from: c, reason: collision with root package name */
    public a f977c = a.OFF;

    /* compiled from: NetUsbKeyboard.java */
    /* loaded from: classes.dex */
    public enum a {
        OFF(0),
        USER_NAME(1),
        PASSWORD(2),
        ARTIST_NAME(3),
        ALBUM_NAME(4),
        SONG_NAME(5),
        STATION_NAME(6),
        TAG_NAME(7),
        ARTIST_OR_SONG(8),
        EPISODE_NAME(9),
        PIN_CODE(10),
        USER_NAME_ISO_8859_1(11),
        PASSWORD_ISO_8859_1(12),
        URL(13),
        NONE(254),
        UNKNOWN(255);

        public static final Map<Integer, a> s = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final int f979b;

        static {
            for (a aVar : values()) {
                s.put(Integer.valueOf(aVar.f979b), aVar);
            }
        }

        a(int i) {
            this.f979b = i;
        }
    }

    /* compiled from: NetUsbKeyboard.java */
    /* loaded from: classes.dex */
    public interface b {
        void d();

        void e();
    }

    /* compiled from: NetUsbKeyboard.java */
    /* loaded from: classes.dex */
    public class c extends b.b.a.a.e.b<b> implements b {
        public c(k kVar) {
        }

        @Override // b.b.a.a.b.r.k.b
        public void d() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((b) it.next()).d();
            }
        }

        @Override // b.b.a.a.b.r.k.b
        public void e() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((b) it.next()).e();
            }
        }
    }

    public k(b.b.a.a.b.p.d dVar) {
        this.f976b = dVar;
    }

    public void a(String str) {
        this.d = str;
        this.f977c = a.NONE;
    }

    public boolean a(b.b.a.a.b.p.v.b bVar) {
        if (bVar.f912b != b.b.a.a.b.p.v.a.NKY) {
            return false;
        }
        try {
            a aVar = a.s.get(Integer.valueOf(bVar.f913c.c()));
            if (aVar == null) {
                aVar = a.UNKNOWN;
            }
            this.f977c = aVar;
            if (aVar == a.OFF) {
                this.f975a.d();
                return true;
            }
            this.f975a.e();
            return true;
        } catch (CharConversionException unused) {
            return true;
        }
    }
}
