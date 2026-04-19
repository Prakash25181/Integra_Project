package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class FakeEditText extends TextView {

    /* renamed from: b, reason: collision with root package name */
    public Paint f1761b;

    /* renamed from: c, reason: collision with root package name */
    public int f1762c;

    public FakeEditText(Context context) {
        super(context);
        this.f1761b = null;
        this.f1762c = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1762c == 0) {
            this.f1762c = (int) TypedValue.applyDimension(1, 1.0f, getContext().getResources().getDisplayMetrics());
        }
        int compoundPaddingLeft = getCompoundPaddingLeft();
        int width = getWidth() - getCompoundPaddingRight();
        int height = (getHeight() - getCompoundPaddingBottom()) - this.f1762c;
        if (this.f1761b == null) {
            Paint paint = new Paint();
            this.f1761b = paint;
            paint.setColor(getResources().getColor(R.color.fake_edit_text_line));
            this.f1761b.setStrokeWidth(this.f1762c);
        }
        float f = height;
        canvas.drawLine(compoundPaddingLeft, f, width, f, this.f1761b);
    }

    public FakeEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1761b = null;
        this.f1762c = 0;
    }

    public FakeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1761b = null;
        this.f1762c = 0;
    }
}
