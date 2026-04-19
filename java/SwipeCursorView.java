package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class SwipeCursorView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public LayerDrawable f1780b;

    /* renamed from: c, reason: collision with root package name */
    public TransitionDrawable[] f1781c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public TextView j;
    public g0 k;
    public c l;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SwipeCursorView swipeCursorView = SwipeCursorView.this;
            swipeCursorView.k.a(1);
            swipeCursorView.g = 0;
            swipeCursorView.h = 0;
            swipeCursorView.c();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SwipeCursorView.a(SwipeCursorView.this);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public interface d extends c {
        void a();

        void b();
    }

    public SwipeCursorView(Context context) {
        super(context);
        b();
    }

    public final void a() {
        this.k.a(0);
        c cVar = this.l;
        if (cVar != null && (cVar instanceof d)) {
            ((d) cVar).a();
        }
        if (this.g == 2) {
            this.k.a(1, 150, new a());
            return;
        }
        this.k.a(1);
        this.g = 0;
        this.h = 0;
        c();
    }

    public final boolean a(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5;
    }

    public final void b() {
        this.k = new g0(new Handler(), 2);
        if (isInEditMode()) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            ColorDrawable colorDrawable = new ColorDrawable(Color.rgb(222, 255, 222));
            Rect bounds = colorDrawable.getBounds();
            int applyDimension = (int) TypedValue.applyDimension(1, 144.0f, displayMetrics);
            colorDrawable.setBounds(bounds.left, bounds.top, applyDimension, applyDimension);
            this.f1780b = new LayerDrawable(new Drawable[]{colorDrawable});
        } else {
            LayerDrawable layerDrawable = (LayerDrawable) getContext().getResources().getDrawable(R.drawable.swipe_cursor);
            this.f1780b = layerDrawable;
            this.f1781c = new TransitionDrawable[]{(TransitionDrawable) layerDrawable.getDrawable(1), (TransitionDrawable) this.f1780b.getDrawable(2), (TransitionDrawable) this.f1780b.getDrawable(3), (TransitionDrawable) this.f1780b.getDrawable(4), (TransitionDrawable) this.f1780b.getDrawable(5)};
        }
        super.setBackgroundDrawable(this.f1780b);
        DisplayMetrics displayMetrics2 = getResources().getDisplayMetrics();
        this.e = (int) TypedValue.applyDimension(1, 28.0f, displayMetrics2);
        this.d = (int) TypedValue.applyDimension(1, 32.0f, displayMetrics2);
        this.g = 0;
        this.h = 0;
        this.i = 0;
        TextView textView = new TextView(getContext());
        this.j = textView;
        textView.setText("ENTER");
        this.j.setTextColor(getResources().getColor(R.color.rc_button_text));
        this.j.setTextSize(12.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        addView(this.j, layoutParams);
    }

    public final void c() {
        int i = this.i;
        if (i != this.h && i != 0) {
            this.f1781c[i - 1].reverseTransition(300);
        }
        int i2 = this.g;
        if (i2 == 0) {
            this.i = 0;
        } else if (i2 == 1) {
            this.i = 1;
        } else {
            this.i = this.h;
        }
        int i3 = this.i;
        if (i3 != 0) {
            this.f1781c[i3 - 1].startTransition(0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (isInEditMode()) {
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = i5 < i6 ? i5 : i6;
        this.f1780b.getDrawable(0);
        this.f1780b.setLayerInset(0, 0, 0, i5 - i7, i6 - i7);
        Drawable drawable = this.f1780b.getDrawable(1);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i8 = (i7 - intrinsicWidth) / 2;
        int i9 = (i7 - intrinsicHeight) / 2;
        this.f1780b.setLayerInset(1, i8, i9, (i5 - i8) - intrinsicWidth, (i6 - i9) - intrinsicHeight);
        Drawable drawable2 = this.f1780b.getDrawable(2);
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        int i10 = (i7 - intrinsicWidth2) / 2;
        this.f1780b.setLayerInset(2, i10, 0, (i5 - i10) - intrinsicWidth2, (i6 + 0) - drawable2.getIntrinsicHeight());
        Drawable drawable3 = this.f1780b.getDrawable(3);
        int intrinsicWidth3 = drawable3.getIntrinsicWidth();
        int intrinsicHeight2 = drawable3.getIntrinsicHeight();
        int i11 = (i7 - intrinsicWidth3) / 2;
        int i12 = i7 - intrinsicHeight2;
        this.f1780b.setLayerInset(3, i11, i12, (i5 - i11) - intrinsicWidth3, (i6 - i12) - intrinsicHeight2);
        Drawable drawable4 = this.f1780b.getDrawable(4);
        int intrinsicWidth4 = drawable4.getIntrinsicWidth();
        int intrinsicHeight3 = drawable4.getIntrinsicHeight();
        int i13 = (i7 - intrinsicHeight3) / 2;
        this.f1780b.setLayerInset(4, 0, i13, (i5 + 0) - intrinsicWidth4, (i6 - i13) - intrinsicHeight3);
        Drawable drawable5 = this.f1780b.getDrawable(5);
        int intrinsicWidth5 = drawable5.getIntrinsicWidth();
        int intrinsicHeight4 = drawable5.getIntrinsicHeight();
        int i14 = i7 - intrinsicWidth5;
        int i15 = (i7 - intrinsicHeight4) / 2;
        this.f1780b.setLayerInset(5, i14, i15, (i5 - i14) - intrinsicWidth5, (i6 - i15) - intrinsicHeight4);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (this.g == 0) {
                this.k.a(1);
                int a2 = a(x, y);
                if (a2 == 1) {
                    this.g = 1;
                    c();
                } else if (a(a2)) {
                    a(a2, true);
                    c();
                }
                c cVar = this.l;
                if (cVar != null && (cVar instanceof d)) {
                    ((d) cVar).b();
                }
            }
            return true;
        }
        if (action == 1) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (this.g == 1 && a(x2, y2) == 1) {
                a(1, false);
            }
            a();
            return true;
        }
        if (action != 2) {
            if (action != 3 && action != 4) {
                return false;
            }
            a();
            return true;
        }
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (this.g == 1) {
            int a3 = a(x3, y3);
            if (a(a3)) {
                a(a3, true);
                c();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setDelegate(c cVar) {
        this.l = cVar;
    }

    public SwipeCursorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public SwipeCursorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }

    public final void a(int i, boolean z) {
        this.g = 2;
        this.h = i;
        c cVar = this.l;
        if (cVar != null) {
            cVar.a(i);
        }
        if (z) {
            this.f = 0;
            this.k.a(0, 500, new b());
        }
    }

    public static /* synthetic */ void a(SwipeCursorView swipeCursorView) {
        if (swipeCursorView.g == 0) {
            swipeCursorView.k.a(0);
            return;
        }
        c cVar = swipeCursorView.l;
        if (cVar != null) {
            cVar.a(swipeCursorView.h);
        }
        if (swipeCursorView.f == 0) {
            swipeCursorView.k.a(0, 250, 250, new b.b.a.a.f.o0.d(swipeCursorView));
        }
        swipeCursorView.f++;
    }

    public final int a(int i, int i2) {
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int sqrt = (int) Math.sqrt(Math.pow(i2 - height, 2.0d) + Math.pow(i - width, 2.0d));
        int i3 = this.d;
        if (sqrt < i3) {
            return sqrt < this.e ? 1 : 0;
        }
        double d2 = i3;
        double cos = Math.cos(0.7853981633974483d);
        Double.isNaN(d2);
        int i4 = (int) (cos * d2);
        if (width - i4 <= i && i <= width + i4) {
            return i2 < height ? 2 : 3;
        }
        if (height - i4 > i2 || i2 > height + i4) {
            return 0;
        }
        return i < width ? 4 : 5;
    }
}
