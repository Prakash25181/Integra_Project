package a.h.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentManagerImpl.java */
/* loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f518c;
    public final /* synthetic */ j d;

    public l(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.d = jVar;
        this.f516a = viewGroup;
        this.f517b = view;
        this.f518c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f516a.endViewTransition(this.f517b);
        Animator h = this.f518c.h();
        this.f518c.a((Animator) null);
        if (h == null || this.f516a.indexOfChild(this.f517b) >= 0) {
            return;
        }
        j jVar = this.d;
        Fragment fragment = this.f518c;
        jVar.a(fragment, fragment.p(), 0, 0, false);
    }
}
