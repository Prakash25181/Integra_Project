package a.e.e.b;

import a.b.p.y;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ResourcesCompat.java */
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Typeface f371b;

        public a(Typeface typeface) {
            this.f371b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.a(this.f371b);
        }
    }

    /* compiled from: ResourcesCompat.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f373b;

        public b(int i) {
            this.f373b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((y.a) g.this) == null) {
                throw null;
            }
        }
    }

    public abstract void a(Typeface typeface);

    public final void a(Typeface typeface, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new a(typeface));
    }

    public final void a(int i, Handler handler) {
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new b(i));
    }
}
