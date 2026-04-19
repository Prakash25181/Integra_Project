package a.b.o;

import a.e.k.s;
import a.e.k.t;
import a.e.k.u;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewPropertyAnimatorCompatSet.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f100c;
    public t d;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public long f99b = -1;
    public final u f = new a();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<s> f98a = new ArrayList<>();

    /* compiled from: ViewPropertyAnimatorCompatSet.java */
    /* loaded from: classes.dex */
    public class a extends u {

        /* renamed from: a, reason: collision with root package name */
        public boolean f101a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f102b = 0;

        public a() {
        }

        @Override // a.e.k.t
        public void a(View view) {
            int i = this.f102b + 1;
            this.f102b = i;
            if (i == g.this.f98a.size()) {
                t tVar = g.this.d;
                if (tVar != null) {
                    tVar.a(null);
                }
                this.f102b = 0;
                this.f101a = false;
                g.this.e = false;
            }
        }

        @Override // a.e.k.u, a.e.k.t
        public void b(View view) {
            if (this.f101a) {
                return;
            }
            this.f101a = true;
            t tVar = g.this.d;
            if (tVar != null) {
                tVar.b(null);
            }
        }
    }

    public void a() {
        if (this.e) {
            Iterator<s> it = this.f98a.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.e = false;
        }
    }

    public void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator<s> it = this.f98a.iterator();
        while (it.hasNext()) {
            s next = it.next();
            long j = this.f99b;
            if (j >= 0) {
                next.a(j);
            }
            Interpolator interpolator = this.f100c;
            if (interpolator != null && (view = next.f448a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                next.a(this.f);
            }
            View view2 = next.f448a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
