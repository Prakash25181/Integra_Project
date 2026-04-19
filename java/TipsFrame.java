package com.onkyo.jp.onkyoremote.view.widget;

import a.b.k.r;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b.b.a.a.f.c;
import b.b.a.a.f.i0;

/* loaded from: classes.dex */
public class TipsFrame extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public c f1784b;

    /* renamed from: c, reason: collision with root package name */
    public int f1785c;
    public int d;
    public boolean e;
    public boolean f;

    /* loaded from: classes.dex */
    public class a implements i0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f1786a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f1787b;

        /* renamed from: com.onkyo.jp.onkyoremote.view.widget.TipsFrame$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0064a implements i0 {
            public C0064a() {
            }

            @Override // b.b.a.a.f.i0
            public void a() {
                TipsFrame.a(TipsFrame.this);
            }
        }

        public a(FrameLayout frameLayout, View view) {
            this.f1786a = frameLayout;
            this.f1787b = view;
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            TipsFrame.a(TipsFrame.this, this.f1786a, this.f1787b);
            r.a((View) TipsFrame.this, (i0) new C0064a());
        }
    }

    /* loaded from: classes.dex */
    public class b implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f1790a;

        public b(boolean z) {
            this.f1790a = z;
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            TipsFrame tipsFrame = TipsFrame.this;
            boolean z2 = this.f1790a;
            c cVar = tipsFrame.f1784b;
            if (cVar != null) {
                cVar.a(tipsFrame, z2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(TipsFrame tipsFrame, boolean z);
    }

    public TipsFrame(Context context) {
        super(context);
        this.f1785c = -1;
    }

    public void a(FrameLayout frameLayout, View view) {
        if (getParent() == null) {
            frameLayout.addView(this, new FrameLayout.LayoutParams(-2, -2));
        }
        setVisibility(4);
        r.a((View) frameLayout, (i0) new a(frameLayout, view));
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f1785c = i;
    }

    public void setDelegate(c cVar) {
        this.f1784b = cVar;
    }

    public TipsFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1785c = -1;
        if (attributeSet != null) {
            this.f1785c = context.obtainStyledAttributes(attributeSet, b.b.a.a.a.TipsFrame).getInt(0, 0);
        }
    }

    public static /* synthetic */ void a(TipsFrame tipsFrame, FrameLayout frameLayout, View view) {
        int height;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, tipsFrame.getContext().getResources().getDisplayMetrics());
        view.getLocationOnScreen(iArr);
        frameLayout.getLocationOnScreen(iArr2);
        int i = 0;
        int width = ((view.getWidth() / 2) + (iArr[0] - iArr2[0])) - (tipsFrame.getWidth() / 2);
        int i2 = iArr[1] - iArr2[1];
        if (width < 0) {
            width = 0;
        }
        if (tipsFrame.getWidth() + width > frameLayout.getWidth()) {
            width = frameLayout.getWidth() - tipsFrame.getWidth();
        }
        tipsFrame.d = ((view.getWidth() / 2) + (iArr[0] - iArr2[0])) - width;
        if (i2 >= tipsFrame.getHeight() + applyDimension) {
            tipsFrame.e = false;
            height = i2 - (tipsFrame.getHeight() + applyDimension);
            tipsFrame.setPadding(tipsFrame.getPaddingLeft(), tipsFrame.getPaddingTop(), tipsFrame.getPaddingRight(), tipsFrame.getPaddingBottom() + applyDimension);
        } else {
            tipsFrame.e = true;
            height = i2 + view.getHeight();
            tipsFrame.setPadding(tipsFrame.getPaddingLeft(), tipsFrame.getPaddingTop() + applyDimension, tipsFrame.getPaddingRight(), tipsFrame.getPaddingBottom());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tipsFrame.getLayoutParams();
        layoutParams.leftMargin = width;
        layoutParams.topMargin = height;
        tipsFrame.setLayoutParams(layoutParams);
        Resources resources = tipsFrame.getContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int applyDimension2 = (int) TypedValue.applyDimension(1, 8.0f, displayMetrics);
        int applyDimension3 = (int) TypedValue.applyDimension(1, 4.0f, displayMetrics);
        int width2 = tipsFrame.getWidth();
        int height2 = tipsFrame.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width2, height2, Bitmap.Config.ARGB_8888);
        createBitmap.setDensity(displayMetrics.densityDpi);
        if (tipsFrame.e) {
            i = applyDimension;
        } else {
            height2 -= applyDimension;
        }
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setColor(tipsFrame.f1785c);
        float f = i;
        float f2 = height2;
        float f3 = applyDimension2;
        canvas.drawRoundRect(new RectF(0.0f, f, width2, f2), f3, f3, paint);
        Path path = new Path();
        if (tipsFrame.e) {
            path.moveTo(tipsFrame.d - applyDimension3, f);
            path.lineTo(tipsFrame.d, i - applyDimension);
            path.lineTo(tipsFrame.d + applyDimension3, f);
        } else {
            path.lineTo(tipsFrame.d + applyDimension3, f2);
            path.lineTo(tipsFrame.d, height2 + applyDimension);
            path.lineTo(tipsFrame.d - applyDimension3, f2);
        }
        path.close();
        canvas.drawPath(path, paint);
        tipsFrame.setBackgroundDrawable(new BitmapDrawable(resources, createBitmap));
    }

    public TipsFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1785c = -1;
        if (attributeSet != null) {
            this.f1785c = context.obtainStyledAttributes(attributeSet, b.b.a.a.a.TipsFrame).getInt(0, 0);
        }
    }

    public static /* synthetic */ void a(TipsFrame tipsFrame) {
        tipsFrame.setVisibility(0);
        tipsFrame.setScaleX(0.0f);
        tipsFrame.setScaleY(0.0f);
        tipsFrame.setTranslationX(tipsFrame.d - (tipsFrame.getWidth() / 2));
        if (tipsFrame.e) {
            tipsFrame.setTranslationY((-tipsFrame.getHeight()) / 2);
        } else {
            tipsFrame.setTranslationY(tipsFrame.getHeight() / 2);
        }
        tipsFrame.setAlpha(0.0f);
        b.b.a.a.f.c cVar = new b.b.a.a.f.c(tipsFrame);
        cVar.f1155b.setDuration(250);
        cVar.f1155b.setInterpolator(new OvershootInterpolator());
        cVar.a(1.0f);
        cVar.b(1.0f);
        cVar.a(0, 0);
        cVar.a((c.g) null);
    }

    public void a(boolean z, boolean z2) {
        int height;
        if (this.f) {
            return;
        }
        this.f = true;
        int width = this.d - (getWidth() / 2);
        if (this.e) {
            height = (-getHeight()) / 2;
        } else {
            height = getHeight() / 2;
        }
        if (z2) {
            b.b.a.a.f.c cVar = new b.b.a.a.f.c(this);
            cVar.f1155b.setDuration(250);
            cVar.f1155b.setInterpolator(new DecelerateInterpolator());
            cVar.a(0.0f);
            cVar.b(0.0f);
            cVar.a(width, height);
            cVar.a(new b(z));
            return;
        }
        c cVar2 = this.f1784b;
        if (cVar2 != null) {
            cVar2.a(this, z);
        }
    }
}
