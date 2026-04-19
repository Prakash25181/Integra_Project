package a.h.a;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public class x implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f549b;

    public x(y yVar, View view, ArrayList arrayList) {
        this.f548a = view;
        this.f549b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f548a.setVisibility(8);
        int size = this.f549b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f549b.get(i)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
    }
}
