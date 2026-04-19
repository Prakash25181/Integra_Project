package b.b.a.a.b.r;

import android.graphics.drawable.Drawable;

/* compiled from: NetUsbContent.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public String f962a;

    /* renamed from: b, reason: collision with root package name */
    public int f963b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f964c;

    /* compiled from: NetUsbContent.java */
    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        PLAYING(54),
        ARTIST(56),
        ALBUM(57),
        FOLDER(41),
        PROGRAM(58),
        ID_2A(42),
        ID_2C(44),
        ID_2E(46),
        MUSIC(45),
        SERVER(43),
        PLAYLIST(63),
        SEARCH(67),
        TRACK(63),
        ACCOUNT(55),
        PLAYLIST_C(59),
        STARRED(60),
        UNSTARRED(64),
        WHATS_NEW(61),
        DISABLED(254),
        NET_SERVICE(256),
        INVALID(-1);


        /* renamed from: b, reason: collision with root package name */
        public final int f966b;

        a(int i) {
            this.f966b = i;
        }

        public static a a(char c2) {
            if (c2 == '-') {
                return NONE;
            }
            if (c2 == 'P') {
                return PLAYLIST;
            }
            if (c2 == 'A') {
                return ARTIST;
            }
            if (c2 == 'B') {
                return ALBUM;
            }
            if (c2 == 'F') {
                return FOLDER;
            }
            if (c2 == 'G') {
                return PROGRAM;
            }
            if (c2 == 'M') {
                return MUSIC;
            }
            if (c2 == 'N') {
                return SERVER;
            }
            if (c2 == 'S') {
                return SEARCH;
            }
            if (c2 != 'T') {
                switch (c2) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                        return MUSIC;
                    default:
                        switch (c2) {
                            case 'a':
                                return ACCOUNT;
                            case 'b':
                                return PLAYLIST_C;
                            case 'c':
                                return STARRED;
                            case 'd':
                                return UNSTARRED;
                            case 'e':
                                return WHATS_NEW;
                            default:
                                return NONE;
                        }
                }
            }
            return TRACK;
        }
    }

    public h(String str, int i, Drawable drawable) {
        this.f962a = str;
        this.f963b = i;
        this.f964c = drawable;
    }

    public boolean a() {
        int i = this.f963b;
        return (i == a.ID_2A.f966b || i == a.ID_2C.f966b || i == a.ID_2E.f966b || i == a.DISABLED.f966b) ? false : true;
    }
}
