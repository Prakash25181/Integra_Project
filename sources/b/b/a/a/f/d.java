package b.b.a.a.f;

import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: AppAnimation.java */
/* loaded from: classes.dex */
public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f1174a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f1175b;

    public d(ValueAnimator valueAnimator, View view) {
        this.f1174a = valueAnimator;
        this.f1175b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) this.f1174a.getAnimatedValue()).floatValue();
        this.f1175b.setScaleX(floatValue);
        this.f1175b.setScaleY(floatValue);
    }
}
