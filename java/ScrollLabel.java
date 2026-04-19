package com.onkyo.jp.onkyoremote.view.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Handler;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public class ScrollLabel extends View {

    /* renamed from: b, reason: collision with root package name */
    public TextPaint f1767b;

    /* renamed from: c, reason: collision with root package name */
    public String f1768c;
    public Bitmap d;
    public int e;
    public int f;
    public float g;
    public int h;
    public ValueAnimator i;
    public Handler j;
    public int k;
    public Runnable l;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: com.onkyo.jp.onkyoremote.view.widget.ScrollLabel$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0063a implements ValueAnimator.AnimatorUpdateListener {
            public C0063a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScrollLabel.this.g = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ScrollLabel.this.postInvalidate();
            }
        }

        /* loaded from: classes.dex */
        public class b implements Animator.AnimatorListener {
            public b() {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ScrollLabel scrollLabel = ScrollLabel.this;
                scrollLabel.i = null;
                scrollLabel.g = 0.0f;
                scrollLabel.postInvalidate();
                scrollLabel.j.postDelayed(scrollLabel.l, 15000L);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollLabel.this.getResources().getDisplayMetrics();
            ScrollLabel scrollLabel = ScrollLabel.this;
            int applyDimension = scrollLabel.e + ((int) TypedValue.applyDimension(1, 32.0f, scrollLabel.getResources().getDisplayMetrics()));
            int applyDimension2 = (int) ((applyDimension * 1000) / TypedValue.applyDimension(1, 50.0f, ScrollLabel.this.getResources().getDisplayMetrics()));
            ScrollLabel.this.i = new ValueAnimator();
            ScrollLabel.this.i.setInterpolator(new LinearInterpolator());
            ScrollLabel.this.i.setDuration(applyDimension2);
            ScrollLabel.this.i.setIntValues(0, applyDimension);
            ScrollLabel.this.i.addUpdateListener(new C0063a());
            ScrollLabel.this.i.addListener(new b());
            ScrollLabel.this.i.start();
        }
    }

    public ScrollLabel(Context context) {
        super(context);
        this.j = new Handler();
        this.l = new a();
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TextPaint textPaint = new TextPaint();
        this.f1767b = textPaint;
        textPaint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.a.a.a.ScrollLabel);
            this.f1767b.setTextSize(obtainStyledAttributes.getDimension(3, a(16.0f)));
            this.f1767b.setColor(obtainStyledAttributes.getColor(2, -16777216));
            this.h = obtainStyledAttributes.getInt(0, 51);
            this.f1768c = obtainStyledAttributes.getString(1);
        } else {
            this.f1767b.setTextSize(a(16.0f));
        }
        a(true);
    }

    public String getText() {
        return this.f1768c;
    }

    public int getTextColor() {
        return this.f1767b.getColor();
    }

    public float getTextSize() {
        return this.f1767b.getTextSize() / getResources().getDisplayMetrics().scaledDensity;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float paddingTop;
        int paddingLeft;
        int paddingTop2;
        if (this.d != null) {
            int i = this.h & 112;
            float f = 0.0f;
            if (i != 16) {
                if (i == 48) {
                    paddingTop2 = getPaddingTop();
                } else if (i != 80) {
                    paddingTop = 0.0f;
                } else {
                    paddingTop2 = (getHeight() - getPaddingBottom()) - this.f;
                }
                paddingTop = paddingTop2;
            } else {
                paddingTop = getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.f) / 2.0f);
            }
            if (this.e < getWidth()) {
                int i2 = this.h & 7;
                if (i2 != 1) {
                    if (i2 == 3) {
                        paddingLeft = getPaddingLeft();
                    } else if (i2 == 5) {
                        paddingLeft = (getWidth() - getPaddingRight()) - this.e;
                    }
                    f = paddingLeft;
                } else {
                    f = ((((getWidth() - getPaddingRight()) - getPaddingLeft()) - this.e) / 2.0f) + getPaddingLeft();
                }
            } else {
                f = -this.g;
            }
            canvas.drawBitmap(this.d, f, paddingTop, (Paint) null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        if (i5 != this.k) {
            this.k = i5;
            a();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        a();
    }

    public void setText(String str) {
        if (this.f1768c != str) {
            this.f1768c = str;
            a(true);
        }
    }

    public void setTextColor(int i) {
        this.f1767b.setColor(i);
        a(false);
    }

    public void setTextSize(float f) {
        this.f1767b.setTextSize(a(f));
        a(true);
    }

    public ScrollLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = new Handler();
        this.l = new a();
        a(context, attributeSet);
    }

    public ScrollLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new Handler();
        this.l = new a();
        a(context, attributeSet);
    }

    public final void a(boolean z) {
        String str = this.f1768c;
        if (str != null && str.length() != 0) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Paint.FontMetrics fontMetrics = this.f1767b.getFontMetrics();
            if (z || this.d == null) {
                int ceil = (int) Math.ceil(this.f1767b.measureText(this.f1768c));
                int ceil2 = (int) Math.ceil(Math.abs(fontMetrics.top) + fontMetrics.bottom);
                Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                this.d = createBitmap;
                createBitmap.setDensity(displayMetrics.densityDpi);
                this.e = ceil;
                this.f = ceil2;
            }
            new Canvas(this.d).drawText(this.f1768c, 0.0f, Math.abs(fontMetrics.ascent), this.f1767b);
            a();
            invalidate();
            return;
        }
        if (this.d != null) {
            this.d = null;
            this.e = 0;
            this.f = 0;
            invalidate();
        }
    }

    public final void a() {
        this.j.removeCallbacks(this.l);
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        this.g = 0.0f;
        if (getVisibility() != 0 || getParent() == null) {
            return;
        }
        if (getWidth() != 0 && this.e >= getWidth()) {
            this.g = 0.0f;
            postInvalidate();
            this.j.postDelayed(this.l, 15000L);
            return;
        }
        invalidate();
    }

    public final float a(float f) {
        return TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }
}
