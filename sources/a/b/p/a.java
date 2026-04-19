package a.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final C0007a f152b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f153c;
    public ActionMenuView d;
    public c e;
    public int f;
    public a.e.k.s g;
    public boolean h;
    public boolean i;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: a.b.p.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0007a implements a.e.k.t {

        /* renamed from: a, reason: collision with root package name */
        public boolean f154a = false;

        /* renamed from: b, reason: collision with root package name */
        public int f155b;

        public C0007a() {
        }

        @Override // a.e.k.t
        public void a(View view) {
            if (this.f154a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f155b);
        }

        @Override // a.e.k.t
        public void b(View view) {
            a.super.setVisibility(0);
            this.f154a = false;
        }

        @Override // a.e.k.t
        public void c(View view) {
            this.f154a = true;
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public int getAnimatedVisibility() {
        if (this.g != null) {
            return this.f152b.f155b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.b.j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            Configuration configuration2 = cVar.f109c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            cVar.q = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            a.b.o.i.g gVar = cVar.d;
            if (gVar != null) {
                gVar.b(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.e.k.s sVar = this.g;
            if (sVar != null) {
                sVar.a();
            }
            super.setVisibility(i);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a.e.k.s a(int i, long j) {
        a.e.k.s sVar = this.g;
        if (sVar != null) {
            sVar.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            a.e.k.s a2 = a.e.k.n.a(this);
            a2.a(1.0f);
            a2.a(j);
            C0007a c0007a = this.f152b;
            a.this.g = a2;
            c0007a.f155b = i;
            a2.a(c0007a);
            return a2;
        }
        a.e.k.s a3 = a.e.k.n.a(this);
        a3.a(0.0f);
        a3.a(j);
        C0007a c0007a2 = this.f152b;
        a.this.g = a3;
        c0007a2.f155b = i;
        a3.a(c0007a2);
        return a3;
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f152b = new C0007a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(a.b.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f153c = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f153c = context;
        }
    }

    public int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int a(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
