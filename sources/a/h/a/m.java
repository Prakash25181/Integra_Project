package a.h.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentManagerImpl.java */
/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f519a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f520b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f521c;

    public m(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.f519a = viewGroup;
        this.f520b = view;
        this.f521c = fragment;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f519a.endViewTransition(this.f520b);
        animator.removeListener(this);
        Fragment fragment = this.f521c;
        View view = fragment.H;
        if (view == null || !fragment.z) {
            return;
        }
        view.setVisibility(8);
    }
}
