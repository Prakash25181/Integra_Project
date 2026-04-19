package a.e.k;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f436b;

    /* renamed from: c, reason: collision with root package name */
    public ViewTreeObserver f437c;
    public final Runnable d;

    public l(View view, Runnable runnable) {
        this.f436b = view;
        this.f437c = view.getViewTreeObserver();
        this.d = runnable;
    }

    public static l a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable != null) {
            l lVar = new l(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(lVar);
            view.addOnAttachStateChangeListener(lVar);
            return lVar;
        }
        throw new NullPointerException("runnable == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f437c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }

    public void a() {
        if (this.f437c.isAlive()) {
            this.f437c.removeOnPreDrawListener(this);
        } else {
            this.f436b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f436b.removeOnAttachStateChangeListener(this);
    }
}
