package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import b.b.a.a.a;

/* loaded from: classes.dex */
public class AutoScaleTextLabel extends TextView {

    /* renamed from: b, reason: collision with root package name */
    public float f1760b;

    public AutoScaleTextLabel(Context context) {
        super(context);
        this.f1760b = 0.0f;
    }

    public final void a(Context context, AttributeSet attributeSet) {
        float dimension = context.obtainStyledAttributes(attributeSet, a.AutoScaleTextLabel).getDimension(0, 0.0f);
        this.f1760b = dimension;
        if (dimension == 0.0f) {
            this.f1760b = getTextSize();
        }
        if (this.f1760b == 0.0f) {
            this.f1760b = TypedValue.applyDimension(2, 18.0f, getResources().getDisplayMetrics());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        a();
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        a();
    }

    @Override // android.widget.TextView
    public void setTextSize(float f) {
        super.setTextSize(f);
        this.f1760b = TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    public AutoScaleTextLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1760b = 0.0f;
        a(context, attributeSet);
    }

    public AutoScaleTextLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1760b = 0.0f;
        a(context, attributeSet);
    }

    public final void a() {
        if (this.f1760b == 0.0f) {
            this.f1760b = getTextSize();
        }
        CharSequence text = getText();
        int width = getWidth();
        if (text == null || text.length() == 0 || width == 0) {
            return;
        }
        Paint paint = new Paint(getPaint());
        float f = this.f1760b;
        while (true) {
            paint.setTextSize(f);
            float measureText = paint.measureText(text, 0, text.length());
            if (f <= 10.0f || measureText < width) {
                break;
            } else {
                f -= 1.0f;
            }
        }
        setTextSize(0, f);
    }
}
