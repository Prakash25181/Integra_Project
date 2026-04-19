package b.b.a.a.b.s;

/* compiled from: CdPlayer.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b f1034a = b.CD_DISC_UNKNOWN;

    /* renamed from: b, reason: collision with root package name */
    public e f1035b = e.CD_PLAYER_UNKNOWN;

    /* renamed from: c, reason: collision with root package name */
    public d f1036c = d.CD_PLAYER_REPEAT_OFF;
    public c d = c.CD_PLAYER_RANDOM_OFF;
    public int e;
    public int f;
    public f g;
    public int h;
    public int i;
    public b.b.a.a.b.p.d j;
    public InterfaceC0030a k;

    /* compiled from: CdPlayer.java */
    /* renamed from: b.b.a.a.b.s.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0030a {
    }

    /* compiled from: CdPlayer.java */
    /* loaded from: classes.dex */
    public enum b {
        CD_DISC_UNKNOWN,
        CD_DISC_NONE,
        CD_DISC_AUDIO,
        CD_DISC_MP3
    }

    /* compiled from: CdPlayer.java */
    /* loaded from: classes.dex */
    public enum c {
        CD_PLAYER_RANDOM_OFF,
        CD_PLAYER_RANDOM_ON
    }

    /* compiled from: CdPlayer.java */
    /* loaded from: classes.dex */
    public enum d {
        CD_PLAYER_REPEAT_OFF,
        CD_PLAYER_REPEAT_SINGLE,
        CD_PLAYER_REPEAT_ALL
    }

    /* compiled from: CdPlayer.java */
    /* loaded from: classes.dex */
    public enum e {
        CD_PLAYER_UNKNOWN,
        CD_PLAYER_NODISK,
        CD_PLAYER_STOP,
        CD_PLAYER_PAUSE,
        CD_PLAYER_PLAY,
        CD_PLAYER_FF,
        CD_PLAYER_FR
    }

    /* compiled from: CdPlayer.java */
    /* loaded from: classes.dex */
    public enum f {
        CD_TIME_NO_DURATION,
        CD_TIME_HAS_DURATION,
        CD_TIME_SEEKABLE
    }

    public a(b.b.a.a.b.p.d dVar) {
        this.j = dVar;
    }

    public final int a(String str) {
        if (str.equals("--:--")) {
            return -1;
        }
        String[] split = str.split(":");
        if (str.length() != 5 || split.length != 2) {
            return -1;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt2 < 0 || parseInt2 > 59) {
                return -1;
            }
            return (parseInt * 60) + parseInt2;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final void a() {
        InterfaceC0030a interfaceC0030a = this.k;
        if (interfaceC0030a != null) {
            ((b.b.a.a.f.k0.c) interfaceC0030a).e(this);
        }
    }
}
