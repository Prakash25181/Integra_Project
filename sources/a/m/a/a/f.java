package a.m.a.a;

import a.b.k.r;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PathInterpolatorCompat.java */
/* loaded from: classes.dex */
public class f implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public float[] f598a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f599b;

    public f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray a2 = r.a(context.getResources(), context.getTheme(), attributeSet, a.l);
        if (r.a(xmlPullParser, "pathData")) {
            String a3 = r.a(a2, xmlPullParser, "pathData", 4);
            Path b2 = r.b(a3);
            if (b2 != null) {
                a(b2);
            } else {
                throw new InflateException(b.a.a.a.a.a("The path is null, which is created from ", a3));
            }
        } else if (r.a(xmlPullParser, "controlX1")) {
            if (r.a(xmlPullParser, "controlY1")) {
                float a4 = r.a(a2, xmlPullParser, "controlX1", 0, 0.0f);
                float a5 = r.a(a2, xmlPullParser, "controlY1", 1, 0.0f);
                boolean a6 = r.a(xmlPullParser, "controlX2");
                if (a6 != r.a(xmlPullParser, "controlY2")) {
                    throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
                }
                if (!a6) {
                    Path path = new Path();
                    path.moveTo(0.0f, 0.0f);
                    path.quadTo(a4, a5, 1.0f, 1.0f);
                    a(path);
                } else {
                    float a7 = r.a(a2, xmlPullParser, "controlX2", 2, 0.0f);
                    float a8 = r.a(a2, xmlPullParser, "controlY2", 3, 0.0f);
                    Path path2 = new Path();
                    path2.moveTo(0.0f, 0.0f);
                    path2.cubicTo(a4, a5, a7, a8, 1.0f, 1.0f);
                    a(path2);
                }
            } else {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        a2.recycle();
    }

    public final void a(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f598a = new float[min];
            this.f599b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                this.f598a[i2] = fArr[0];
                this.f599b[i2] = fArr[1];
            }
            if (Math.abs(this.f598a[0]) <= 1.0E-5d && Math.abs(this.f599b[0]) <= 1.0E-5d) {
                int i3 = min - 1;
                if (Math.abs(this.f598a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f599b[i3] - 1.0f) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f598a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder a2 = b.a.a.a.a.a("The Path must start at (0,0) and end at (1,1) start: ");
            a2.append(this.f598a[0]);
            a2.append(",");
            a2.append(this.f599b[0]);
            a2.append(" end:");
            int i6 = min - 1;
            a2.append(this.f598a[i6]);
            a2.append(",");
            a2.append(this.f599b[i6]);
            throw new IllegalArgumentException(a2.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f598a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f598a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f598a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f599b[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f599b;
        float f4 = fArr2[i];
        return ((fArr2[length] - f4) * f3) + f4;
    }
}
