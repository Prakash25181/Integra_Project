package b.b.a.a.b.o;

import com.onkyo.integraRemote4A.R;
import java.util.HashMap;

/* compiled from: SpLevelInfo.java */
/* loaded from: classes.dex */
public class j extends k {
    public a f;

    /* compiled from: SpLevelInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        CENTER(0, 1),
        SUBWOOFER1(1, 2),
        SUBWOOFER2(2, 4);


        /* renamed from: b, reason: collision with root package name */
        public final int f819b;

        /* renamed from: c, reason: collision with root package name */
        public final int f820c;

        a(int i, int i2) {
            this.f819b = i;
            this.f820c = i2;
        }

        public static final a[] a() {
            return new a[]{CENTER, SUBWOOFER1, SUBWOOFER2};
        }
    }

    public static j b(HashMap<String, String> hashMap) {
        j jVar = new j();
        boolean z = false;
        if (super.a(hashMap)) {
            if (jVar.f821a.equals("Center Level")) {
                jVar.f = a.CENTER;
                jVar.f821a = a.b.k.r.d(R.string.spLevelCenter);
            } else if (jVar.f821a.equals("Subwoofer Level")) {
                jVar.f = a.SUBWOOFER1;
                jVar.f821a = a.b.k.r.d(R.string.spLevelSw);
            } else if (jVar.f821a.equals("Subwoofer1 Level")) {
                jVar.f = a.SUBWOOFER1;
                jVar.f821a = a.b.k.r.d(R.string.spLevelSw1);
            } else if (jVar.f821a.equals("Subwoofer2 Level")) {
                jVar.f = a.SUBWOOFER2;
                jVar.f821a = a.b.k.r.d(R.string.spLevelSw2);
            }
            z = true;
        }
        if (z) {
            return jVar;
        }
        return null;
    }
}
