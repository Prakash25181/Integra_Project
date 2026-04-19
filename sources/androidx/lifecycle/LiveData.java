package androidx.lifecycle;

import a.c.a.b.b;
import a.j.d;
import a.j.e;
import a.j.h;
import a.j.i;
import a.j.n;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object i = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f715a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public b<n<? super T>, LiveData<T>.a> f716b = new b<>();

    /* renamed from: c, reason: collision with root package name */
    public int f717c = 0;
    public volatile Object d = i;
    public volatile Object e = i;
    public int f = -1;
    public boolean g;
    public boolean h;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.a implements d {
        public final h e;
        public final /* synthetic */ LiveData f;

        @Override // a.j.f
        public void a(h hVar, e.a aVar) {
            if (((i) this.e.a()).f569b == e.b.DESTROYED) {
                this.f.a(this.f718a);
            } else {
                a(((i) this.e.a()).f569b.a(e.b.STARTED));
            }
        }
    }

    /* loaded from: classes.dex */
    public abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final n<? super T> f718a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f719b;

        /* renamed from: c, reason: collision with root package name */
        public int f720c;
        public final /* synthetic */ LiveData d;

        public void a(boolean z) {
            if (z == this.f719b) {
                return;
            }
            this.f719b = z;
            boolean z2 = this.d.f717c == 0;
            this.d.f717c += this.f719b ? 1 : -1;
            if (z2 && this.f719b) {
                this.d.a();
            }
            LiveData liveData = this.d;
            if (liveData.f717c == 0 && !this.f719b) {
                liveData.b();
            }
            if (this.f719b) {
                this.d.b(this);
            }
        }
    }

    public void a() {
    }

    public final void a(LiveData<T>.a aVar) {
        if (aVar.f719b) {
            if (!((i) ((LifecycleBoundObserver) aVar).e.a()).f569b.a(e.b.STARTED)) {
                aVar.a(false);
                return;
            }
            int i2 = aVar.f720c;
            int i3 = this.f;
            if (i2 >= i3) {
                return;
            }
            aVar.f720c = i3;
            aVar.f718a.a((Object) this.d);
        }
    }

    public void b() {
    }

    public void b(LiveData<T>.a aVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (aVar != null) {
                a(aVar);
                aVar = null;
            } else {
                b<n<? super T>, LiveData<T>.a>.d a2 = this.f716b.a();
                while (a2.hasNext()) {
                    a((a) ((Map.Entry) a2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            }
        } while (this.h);
        this.g = false;
    }

    public void a(n<? super T> nVar) {
        a("removeObserver");
        LiveData<T>.a remove = this.f716b.remove(nVar);
        if (remove == null) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = (LifecycleBoundObserver) remove;
        ((i) lifecycleBoundObserver.e.a()).f568a.remove(lifecycleBoundObserver);
        remove.a(false);
    }

    public static void a(String str) {
        if (a.c.a.a.a.b().f296a.a()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }
}
