package a.e.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<View> f448a;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f449b = null;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f450c = null;
    public int d = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f451a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f452b;

        public a(s sVar, t tVar, View view) {
            this.f451a = tVar;
            this.f452b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f451a.c(this.f452b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f451a.a(this.f452b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f451a.b(this.f452b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v f453a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f454b;

        public b(s sVar, v vVar, View view) {
            this.f453a = vVar;
            this.f454b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) a.b.k.u.this.d.getParent()).invalidate();
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes.dex */
    public static class c implements t {

        /* renamed from: a, reason: collision with root package name */
        public s f455a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f456b;

        public c(s sVar) {
            this.f455a = sVar;
        }

        @Override // a.e.k.t
        public void a(View view) {
            int i = this.f455a.d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f455a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f456b) {
                s sVar = this.f455a;
                Runnable runnable = sVar.f450c;
                if (runnable != null) {
                    sVar.f450c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                t tVar = tag instanceof t ? (t) tag : null;
                if (tVar != null) {
                    tVar.a(view);
                }
                this.f456b = true;
            }
        }

        @Override // a.e.k.t
        public void b(View view) {
            this.f456b = false;
            if (this.f455a.d > -1) {
                view.setLayerType(2, null);
            }
            s sVar = this.f455a;
            Runnable runnable = sVar.f449b;
            if (runnable != null) {
                sVar.f449b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                tVar.b(view);
            }
        }

        @Override // a.e.k.t
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            t tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                tVar.c(view);
            }
        }
    }

    public s(View view) {
        this.f448a = new WeakReference<>(view);
    }

    public s a(long j) {
        View view = this.f448a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public s b(float f) {
        View view = this.f448a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public s a(float f) {
        View view = this.f448a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public void a() {
        View view = this.f448a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public s a(t tVar) {
        View view = this.f448a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                a(view, tVar);
            } else {
                view.setTag(2113929216, tVar);
                a(view, new c(this));
            }
        }
        return this;
    }

    public final void a(View view, t tVar) {
        if (tVar != null) {
            view.animate().setListener(new a(this, tVar, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public s a(v vVar) {
        View view = this.f448a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(vVar != null ? new b(this, vVar, view) : null);
        }
        return this;
    }
}
