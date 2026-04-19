package b.b.a.a.b.o;

import com.onkyo.integraRemote4A.R;
import java.util.HashMap;

/* compiled from: ToneInfo.java */
/* loaded from: classes.dex */
public class l extends k {
    public a f;

    /* compiled from: ToneInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        FRONT(0, 1),
        FRONT_WIDE(1, 2),
        FRONT_HIGH(2, 4),
        CENTER(3, 8),
        SURROUND(4, 16),
        SURROUND_BACK(5, 32),
        SUBWOOFER(6, 64);


        /* renamed from: b, reason: collision with root package name */
        public final int f824b;

        /* renamed from: c, reason: collision with root package name */
        public final int f825c;

        a(int i, int i2) {
            this.f824b = i;
            this.f825c = i2;
        }

        public static final a[] a() {
            return new a[]{FRONT, FRONT_WIDE, FRONT_HIGH, CENTER, SURROUND, SURROUND_BACK, SUBWOOFER};
        }
    }

    public static l b(HashMap<String, String> hashMap) {
        l lVar = new l();
        boolean z = false;
        if (super.a(hashMap)) {
            if (lVar.f821a.equals("Bass")) {
                lVar.f = a.FRONT;
                lVar.f821a = a.b.k.r.d(R.string.toneFront);
            } else if (lVar.f821a.equals("Treble")) {
                lVar.f = a.FRONT;
                lVar.f821a = a.b.k.r.d(R.string.toneFront);
            } else if (lVar.f821a.equals("Tone(Front)")) {
                lVar.f = a.FRONT;
                lVar.f821a = a.b.k.r.d(R.string.toneFront);
            } else if (lVar.f821a.equals("Tone(Front Wide)")) {
                lVar.f = a.FRONT_WIDE;
                lVar.f821a = a.b.k.r.d(R.string.toneFrontWide);
            } else if (lVar.f821a.equals("Tone(Front High)")) {
                lVar.f = a.FRONT_HIGH;
                lVar.f821a = a.b.k.r.d(R.string.toneFrontHigh);
            } else if (lVar.f821a.equals("Tone(Center)")) {
                lVar.f = a.CENTER;
                lVar.f821a = a.b.k.r.d(R.string.toneCenter);
            } else if (lVar.f821a.equals("Tone(Surround)")) {
                lVar.f = a.SURROUND;
                lVar.f821a = a.b.k.r.d(R.string.toneSurround);
            } else if (lVar.f821a.equals("Tone(Surround Back)")) {
                lVar.f = a.SURROUND_BACK;
                lVar.f821a = a.b.k.r.d(R.string.toneSurroundBack);
            } else if (lVar.f821a.equals("Tone(Subwoofer)")) {
                lVar.f = a.SUBWOOFER;
                lVar.f821a = a.b.k.r.d(R.string.toneSw);
            }
            z = true;
        }
        if (z) {
            return lVar;
        }
        return null;
    }
}
