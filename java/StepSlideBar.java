package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import b.b.a.a.f.d0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import java.util.Timer;

/* loaded from: classes.dex */
public class StepSlideBar extends View {

    /* renamed from: b, reason: collision with root package name */
    public Drawable f1774b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f1775c;
    public Drawable d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public a j;
    public d k;
    public int l;
    public Rect m;
    public Rect n;
    public int o;
    public boolean p;
    public int q;
    public Handler r;
    public Timer s;
    public int t;
    public GestureDetector u;
    public b v;
    public boolean w;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);

        void b();
    }

    /* loaded from: classes.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public /* synthetic */ b(b.b.a.a.f.o0.c cVar) {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            StepSlideBar.a(StepSlideBar.this, (int) motionEvent.getX());
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        String a(int i);
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public c f1777a;

        /* renamed from: b, reason: collision with root package name */
        public d0 f1778b = d0.f1176b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1779c;

        public d(c cVar) {
            this.f1777a = cVar;
        }
    }

    public StepSlideBar(Context context) {
        super(context);
        this.t = 3000;
        this.v = new b(null);
        this.w = false;
        a(context, (AttributeSet) null);
    }

    private void setUserValue(int i) {
        TipsFrame tipsFrame;
        TextView textView;
        int a2 = a(i);
        if (a2 != this.h) {
            this.h = a2;
            b();
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(this.h);
            }
            d dVar = this.k;
            if (dVar != null) {
                int i2 = this.h;
                if (dVar.f1779c) {
                    d0 d0Var = dVar.f1778b;
                    String a3 = dVar.f1777a.a(i2);
                    d0.a aVar2 = d0Var.f1177a;
                    if (aVar2 == null || (tipsFrame = MainActivity.this.c0) == null || (textView = (TextView) tipsFrame.findViewById(R.id.title_label)) == null) {
                        return;
                    }
                    textView.setText(a3);
                }
            }
        }
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.f1774b = a(context, attributeSet, "bar_drawable");
            this.f1775c = a(context, attributeSet, "value_drawable");
            this.d = a(context, attributeSet, "thumb_drawable");
            this.e = attributeSet.getAttributeIntValue(null, "min_value", 0);
            this.f = attributeSet.getAttributeIntValue(null, "max_value", 0);
            int attributeIntValue = attributeSet.getAttributeIntValue(null, "value", 0);
            this.g = attributeIntValue;
            this.g = a(attributeIntValue);
            this.w = attributeSet.getAttributeBooleanValue(null, "auto_reset", false);
        }
        this.r = new Handler();
        this.u = new GestureDetector(context, this.v, this.r);
    }

    public final int b(int i) {
        int i2 = this.e;
        int i3 = this.f;
        if (i2 >= i3) {
            return 0;
        }
        if (i2 == 0) {
            float width = this.m.width();
            int i4 = this.f;
            int i5 = (((int) (width / (i4 / this.i))) / 2) + i;
            Rect rect = this.m;
            return ((i5 - rect.left) * i4) / rect.width();
        }
        if (i3 == 0) {
            float width2 = this.m.width();
            int i6 = this.e;
            int i7 = (int) (width2 / ((-i6) / this.i));
            Rect rect2 = this.m;
            return (((rect2.right - i) - i7) * i6) / rect2.width();
        }
        int centerX = this.m.centerX();
        if (i < centerX) {
            int i8 = this.m.left;
            int i9 = this.e;
            return ((centerX - ((((int) ((centerX - i8) / (i9 / this.i))) / 2) + i)) * i9) / (centerX - i8);
        }
        int i10 = this.m.right;
        int i11 = this.f;
        return ((((((int) ((i10 - centerX) / (i11 / this.i))) / 2) + i) - centerX) * i11) / (i10 - centerX);
    }

    public Drawable getBarDrawable() {
        return this.f1774b;
    }

    public int getHoldTime() {
        return this.t;
    }

    public int getMax() {
        return this.f;
    }

    public int getMin() {
        return this.e;
    }

    public Drawable getThumb() {
        return this.d;
    }

    public int getUserValue() {
        return (this.p || this.s != null) ? this.h : this.g;
    }

    public int getValue() {
        return this.g;
    }

    public Drawable getValueDrawable() {
        return this.f1775c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.n == null) {
            Drawable drawable = this.f1774b;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        } else {
            if (this.f1774b != null) {
                canvas.save();
                canvas.clipRect(this.n, Region.Op.DIFFERENCE);
                this.f1774b.draw(canvas);
                canvas.restore();
            }
            if (this.f1775c != null) {
                canvas.save();
                canvas.clipRect(this.n, Region.Op.INTERSECT);
                this.f1775c.draw(canvas);
                canvas.restore();
            }
        }
        if (this.d == null || !isEnabled()) {
            return;
        }
        this.d.draw(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        b();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.u.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int x = (int) motionEvent.getX();
                    if (this.p) {
                        setUserValue(b(x - this.q));
                    }
                    return true;
                }
                if (action != 3 && action != 4) {
                    return super.onTouchEvent(motionEvent);
                }
            }
            int x2 = (int) motionEvent.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.p) {
                this.p = false;
                Timer timer = this.s;
                if (timer != null) {
                    timer.cancel();
                    this.s = null;
                }
                if (this.t > 0) {
                    Timer timer2 = new Timer();
                    this.s = timer2;
                    timer2.schedule(new b.b.a.a.f.o0.c(this), this.t);
                }
                setUserValue(b(x2 - this.q));
                a aVar = this.j;
                if (aVar != null) {
                    aVar.b();
                }
                d dVar = this.k;
                if (dVar != null && dVar.f1779c) {
                    dVar.f1778b.a();
                    dVar.f1779c = false;
                }
            }
            return true;
        }
        int x3 = (int) motionEvent.getX();
        getParent().requestDisallowInterceptTouchEvent(true);
        if (isEnabled() && this.d != null && Math.abs(x3 - this.o) <= this.l / 2) {
            this.q = x3 - this.o;
            this.h = this.g;
            this.p = true;
            Timer timer3 = this.s;
            if (timer3 != null) {
                timer3.cancel();
                this.s = null;
            }
            a aVar2 = this.j;
            if (aVar2 != null) {
                aVar2.a();
            }
            d dVar2 = this.k;
            if (dVar2 != null) {
                int userValue = getUserValue();
                d0 d0Var = dVar2.f1778b;
                String a2 = dVar2.f1777a.a(userValue);
                d0.b bVar = d0.b.ValueIndicator;
                d0.a aVar3 = d0Var.f1177a;
                if (aVar3 != null) {
                    MainActivity.a(MainActivity.this, this, a2, bVar);
                }
                dVar2.f1779c = true;
            }
        }
        return true;
    }

    public void setAutoReset(boolean z) {
        this.w = z;
    }

    public void setBarDrawable(Drawable drawable) {
        if (this.f1774b != drawable) {
            this.f1774b = drawable;
            b();
        }
    }

    public void setDelegate(a aVar) {
        this.j = aVar;
    }

    public void setHoldTime(int i) {
        this.t = i;
    }

    public void setThumb(Drawable drawable) {
        if (this.d != drawable) {
            this.d = drawable;
            b();
        }
    }

    public void setValue(int i) {
        int a2 = a(i);
        if (a2 != this.g) {
            this.g = a2;
            b();
        }
    }

    public void setValueDrawable(Drawable drawable) {
        if (this.f1775c != drawable) {
            this.f1775c = drawable;
            b();
        }
    }

    public void setValueIndicator(c cVar) {
        this.k = new d(cVar);
    }

    public void setValueIndicator(d dVar) {
        this.k = dVar;
    }

    public StepSlideBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = 3000;
        this.v = new b(null);
        this.w = false;
        a(context, attributeSet);
    }

    public StepSlideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = 3000;
        this.v = new b(null);
        this.w = false;
        a(context, attributeSet);
    }

    public final Drawable a(Context context, AttributeSet attributeSet, String str) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, str, 0);
        if (attributeResourceValue != 0) {
            return context.getResources().getDrawable(attributeResourceValue);
        }
        return null;
    }

    public final void b() {
        int i;
        if (this.f1774b == null || this.f1775c == null) {
            return;
        }
        if (this.s == null && !this.p) {
            i = this.g;
        } else {
            i = this.h;
        }
        Rect rect = new Rect();
        getDrawingRect(rect);
        if (rect.width() == 0 || rect.height() == 0) {
            return;
        }
        if (this.d != null) {
            this.l = (int) TypedValue.applyDimension(1, 44.0f, getResources().getDisplayMetrics());
        } else {
            this.l = 0;
        }
        Rect rect2 = new Rect(rect);
        this.m = rect2;
        int i2 = rect2.left;
        int i3 = this.l;
        rect2.left = (i3 / 2) + i2;
        rect2.right -= i3 / 2;
        int intrinsicHeight = this.f1774b.getIntrinsicHeight();
        this.m.top = (rect.height() - intrinsicHeight) / 2;
        Rect rect3 = this.m;
        rect3.bottom = rect3.top + intrinsicHeight;
        if (this.e == 0 && this.f == 0) {
            this.o = rect3.centerX();
        } else if (this.e == 0) {
            Rect rect4 = this.m;
            this.o = ((rect4.width() * i) / this.f) + rect4.left;
        } else if (this.f == 0) {
            Rect rect5 = this.m;
            this.o = rect5.right - ((rect5.width() * i) / this.e);
        } else if (i < 0) {
            this.o = this.m.centerX() - (((this.m.width() / 2) * i) / this.e);
        } else {
            this.o = (((this.m.width() / 2) * i) / this.f) + this.m.centerX();
        }
        if (i != 0 && this.e != this.f) {
            Rect rect6 = new Rect(this.m);
            this.n = rect6;
            if (this.e == 0) {
                rect6.left = this.m.left;
                rect6.right = this.o;
            } else if (this.f == 0) {
                rect6.left = this.o;
                rect6.right = this.m.right;
            } else if (i < 0) {
                rect6.left = this.o;
                rect6.right = this.m.centerX();
            } else {
                rect6.left = this.m.centerX();
                this.n.right = this.o;
            }
            Drawable drawable = this.f1774b;
            Rect rect7 = this.m;
            drawable.setBounds(rect7.left, rect7.top, rect7.right, rect7.bottom);
            Drawable drawable2 = this.f1775c;
            Rect rect8 = this.m;
            drawable2.setBounds(rect8.left, rect8.top, rect8.right, rect8.bottom);
        } else {
            this.n = null;
            Drawable drawable3 = this.f1774b;
            Rect rect9 = this.m;
            drawable3.setBounds(rect9.left, rect9.top, rect9.right, rect9.bottom);
        }
        if (this.d != null) {
            Rect rect10 = new Rect();
            int intrinsicWidth = this.d.getIntrinsicWidth();
            int intrinsicHeight2 = this.d.getIntrinsicHeight();
            int i4 = this.o - (intrinsicWidth / 2);
            rect10.left = i4;
            rect10.right = i4 + intrinsicWidth;
            int centerY = this.m.centerY() - (intrinsicHeight2 / 2);
            rect10.top = centerY;
            int i5 = intrinsicHeight2 + centerY;
            rect10.bottom = i5;
            this.d.setBounds(rect10.left, centerY, rect10.right, i5);
        }
        invalidate();
    }

    public void a(int i, int i2, float f) {
        if (!(i == this.e && i2 == this.f && f == this.i) && i <= i2 && i <= 0 && i2 >= 0) {
            if (f == 0.5f || f == 1.0f || f == 2.0f) {
                this.e = i;
                this.f = i2;
                this.i = f;
                setValue(a(this.g));
                b();
            }
        }
    }

    public final int a(int i) {
        int i2 = this.e;
        if (i <= i2) {
            return i2;
        }
        int i3 = this.f;
        if (i >= i3) {
            return i3;
        }
        float f = this.i;
        return f > 1.0f ? (i / ((int) f)) * ((int) f) : i;
    }

    public void a() {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (this.p) {
            this.p = false;
            Timer timer = this.s;
            if (timer != null) {
                timer.cancel();
                this.s = null;
            }
            setUserValue(this.g);
        }
    }

    public static /* synthetic */ void a(StepSlideBar stepSlideBar, int i) {
        if (!stepSlideBar.w || Math.abs(i - stepSlideBar.o) > stepSlideBar.l / 2) {
            return;
        }
        stepSlideBar.setUserValue(0);
    }
}
