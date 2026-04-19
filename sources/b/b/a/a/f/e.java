package b.b.a.a.f;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: AppAnimation.java */
/* loaded from: classes.dex */
public class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f1180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1181b;

    public e(ValueAnimator valueAnimator, View view) {
        this.f1180a = valueAnimator;
        this.f1181b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1181b.setScaleY(((Float) this.f1180a.getAnimatedValue()).floatValue());
    }
}
