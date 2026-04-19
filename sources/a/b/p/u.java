package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;
import java.lang.reflect.Method;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes.dex */
public class u extends q {
    public final SeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public u(SeekBar seekBar) {
        super(seekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = seekBar;
    }

    @Override // a.b.p.q
    public void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        x0 a2 = x0.a(this.d.getContext(), attributeSet, a.b.j.AppCompatSeekBar, i, 0);
        Drawable c2 = a2.c(a.b.j.AppCompatSeekBar_android_thumb);
        if (c2 != null) {
            this.d.setThumb(c2);
        }
        Drawable b2 = a2.b(a.b.j.AppCompatSeekBar_tickMark);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = b2;
        if (b2 != null) {
            b2.setCallback(this.d);
            int c3 = a.e.k.n.c(this.d);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                b2.setLayoutDirection(c3);
            } else if (i2 >= 17) {
                if (!a.b.k.r.j) {
                    try {
                        Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                        a.b.k.r.i = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                    }
                    a.b.k.r.j = true;
                }
                Method method = a.b.k.r.i;
                if (method != null) {
                    try {
                        method.invoke(b2, Integer.valueOf(c3));
                    } catch (Exception e2) {
                        Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                        a.b.k.r.i = null;
                    }
                }
            }
            if (b2.isStateful()) {
                b2.setState(this.d.getDrawableState());
            }
            a();
        }
        this.d.invalidate();
        if (a2.f(a.b.j.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.a(a2.c(a.b.j.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (a2.f(a.b.j.AppCompatSeekBar_tickMarkTint)) {
            this.f = a2.a(a.b.j.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        a2.f275b.recycle();
        a();
    }

    public final void a() {
        if (this.e != null) {
            if (this.h || this.i) {
                Drawable c2 = a.b.k.r.c(this.e.mutate());
                this.e = c2;
                if (this.h) {
                    a.b.k.r.a(c2, this.f);
                }
                if (this.i) {
                    a.b.k.r.a(this.e, this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void a(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
