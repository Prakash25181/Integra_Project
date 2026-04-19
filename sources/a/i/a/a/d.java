package a.i.a.a;

import android.view.animation.Interpolator;

/* compiled from: LookupTableInterpolator.java */
/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f557a;

    /* renamed from: b, reason: collision with root package name */
    public final float f558b;

    public d(float[] fArr) {
        this.f557a = fArr;
        this.f558b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f557a;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f558b;
        float f3 = (f - (min * f2)) / f2;
        float[] fArr2 = this.f557a;
        return ((fArr2[min + 1] - fArr2[min]) * f3) + fArr2[min];
    }
}
