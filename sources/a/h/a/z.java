package a.h.a;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: FragmentTransitionCompat21.java */
/* loaded from: classes.dex */
public class z extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f553a;

    public z(y yVar, Rect rect) {
        this.f553a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f553a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f553a;
    }
}
