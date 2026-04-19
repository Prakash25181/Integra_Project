package b.b.a.a.f;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: AppAnimation.java */
/* loaded from: classes.dex */
public class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f1185b;

    public f(View view, ValueAnimator valueAnimator) {
        this.f1184a = view;
        this.f1185b = valueAnimator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1184a.setBackgroundColor(((Integer) this.f1185b.getAnimatedValue()).intValue());
    }
}
