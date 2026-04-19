package a.m.a.a;

import a.b.k.r;
import android.animation.TypeEvaluator;

/* compiled from: AnimatorInflaterCompat.java */
/* loaded from: classes.dex */
public class d implements TypeEvaluator<a.e.f.b[]> {

    /* renamed from: a, reason: collision with root package name */
    public a.e.f.b[] f596a;

    @Override // android.animation.TypeEvaluator
    public a.e.f.b[] evaluate(float f, a.e.f.b[] bVarArr, a.e.f.b[] bVarArr2) {
        a.e.f.b[] bVarArr3 = bVarArr;
        a.e.f.b[] bVarArr4 = bVarArr2;
        if (r.a(bVarArr3, bVarArr4)) {
            if (!r.a(this.f596a, bVarArr3)) {
                this.f596a = r.a(bVarArr3);
            }
            for (int i = 0; i < bVarArr3.length; i++) {
                a.e.f.b bVar = this.f596a[i];
                a.e.f.b bVar2 = bVarArr3[i];
                a.e.f.b bVar3 = bVarArr4[i];
                if (bVar != null) {
                    bVar.f375a = bVar2.f375a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = bVar2.f376b;
                        if (i2 < fArr.length) {
                            bVar.f376b[i2] = (bVar3.f376b[i2] * f) + ((1.0f - f) * fArr[i2]);
                            i2++;
                        }
                    }
                } else {
                    throw null;
                }
            }
            return this.f596a;
        }
        throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
    }
}
