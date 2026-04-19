package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ScrollView;

/* loaded from: classes.dex */
public class ScrollViewWidthMaxSize extends ScrollView {

    /* renamed from: b, reason: collision with root package name */
    public int f1772b;

    /* renamed from: c, reason: collision with root package name */
    public int f1773c;

    public ScrollViewWidthMaxSize(Context context) {
        super(context);
        this.f1772b = -1;
        this.f1773c = -1;
    }

    public final void a(AttributeSet attributeSet) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f1772b = Math.max(-1, attributeSet.getAttributeIntValue(null, "maxWidth", -1));
        this.f1773c = Math.max(-1, attributeSet.getAttributeIntValue(null, "maxHeight", -1));
        int i = this.f1772b;
        if (i != -1) {
            this.f1772b = (int) TypedValue.applyDimension(1, i, displayMetrics);
        }
        int i2 = this.f1773c;
        if (i2 != -1) {
            this.f1773c = (int) TypedValue.applyDimension(1, i2, displayMetrics);
        }
    }

    public int getMaxHeight() {
        return this.f1773c;
    }

    public int getMaxWidth() {
        return this.f1772b;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            try {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                if (this.f1772b != -1 && size > this.f1772b) {
                    size = this.f1772b;
                }
                if (this.f1773c != -1 && size2 > this.f1773c) {
                    size2 = this.f1773c;
                }
                getLayoutParams().width = size;
                getLayoutParams().height = size2;
                i = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                i2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxHeight(int i) {
        this.f1773c = Math.max(-1, i);
    }

    public void setMaxWidth(int i) {
        this.f1772b = Math.max(-1, i);
    }

    public ScrollViewWidthMaxSize(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1772b = -1;
        this.f1773c = -1;
        a(attributeSet);
    }

    public ScrollViewWidthMaxSize(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1772b = -1;
        this.f1773c = -1;
        a(attributeSet);
    }
}
