package a.h.a;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentManagerImpl.java */
/* loaded from: classes.dex */
public class k implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f512a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f513b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f514c;

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.this.f513b.g() != null) {
                k.this.f513b.a((View) null);
                k kVar = k.this;
                j jVar = kVar.f514c;
                Fragment fragment = kVar.f513b;
                jVar.a(fragment, fragment.p(), 0, 0, false);
            }
        }
    }

    public k(j jVar, ViewGroup viewGroup, Fragment fragment) {
        this.f514c = jVar;
        this.f512a = viewGroup;
        this.f513b = fragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f512a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
