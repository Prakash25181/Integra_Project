package a.b.p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;

/* compiled from: TooltipCompatHandler.java */
/* loaded from: classes.dex */
public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static a1 k;
    public static a1 l;

    /* renamed from: b, reason: collision with root package name */
    public final View f160b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f161c;
    public final int d;
    public final Runnable e = new a();
    public final Runnable f = new b();
    public int g;
    public int h;
    public b1 i;
    public boolean j;

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.a(false);
        }
    }

    /* compiled from: TooltipCompatHandler.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.b();
        }
    }

    public a1(View view, CharSequence charSequence) {
        this.f160b = view;
        this.f161c = charSequence;
        this.d = a.e.k.r.a(ViewConfiguration.get(view.getContext()));
        a();
        this.f160b.setOnLongClickListener(this);
        this.f160b.setOnHoverListener(this);
    }

    public void a(boolean z) {
        int height;
        int i;
        long j;
        int longPressTimeout;
        long j2;
        if (a.e.k.n.h(this.f160b)) {
            a((a1) null);
            a1 a1Var = l;
            if (a1Var != null) {
                a1Var.b();
            }
            l = this;
            this.j = z;
            b1 b1Var = new b1(this.f160b.getContext());
            this.i = b1Var;
            View view = this.f160b;
            int i2 = this.g;
            int i3 = this.h;
            boolean z2 = this.j;
            CharSequence charSequence = this.f161c;
            if (b1Var.f167b.getParent() != null) {
                b1Var.a();
            }
            b1Var.f168c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = b1Var.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = b1Var.f166a.getResources().getDimensionPixelOffset(a.b.d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i2 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = b1Var.f166a.getResources().getDimensionPixelOffset(a.b.d.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = b1Var.f166a.getResources().getDimensionPixelOffset(z2 ? a.b.d.tooltip_y_offset_touch : a.b.d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(b1Var.e);
                Rect rect = b1Var.e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = b1Var.f166a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    b1Var.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(b1Var.g);
                view.getLocationOnScreen(b1Var.f);
                int[] iArr = b1Var.f;
                int i4 = iArr[0];
                int[] iArr2 = b1Var.g;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                b1Var.f167b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = b1Var.f167b.getMeasuredHeight();
                int[] iArr3 = b1Var.f;
                int i5 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i6 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i5 >= 0) {
                        layoutParams.y = i5;
                    } else {
                        layoutParams.y = i6;
                    }
                } else if (measuredHeight + i6 <= b1Var.e.height()) {
                    layoutParams.y = i6;
                } else {
                    layoutParams.y = i5;
                }
            }
            ((WindowManager) b1Var.f166a.getSystemService("window")).addView(b1Var.f167b, b1Var.d);
            this.f160b.addOnAttachStateChangeListener(this);
            if (this.j) {
                j2 = 2500;
            } else {
                if ((a.e.k.n.f(this.f160b) & 1) == 1) {
                    j = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j - longPressTimeout;
            }
            this.f160b.removeCallbacks(this.f);
            this.f160b.postDelayed(this.f, j2);
        }
    }

    public void b() {
        if (l == this) {
            l = null;
            b1 b1Var = this.i;
            if (b1Var != null) {
                b1Var.a();
                this.i = null;
                a();
                this.f160b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            a((a1) null);
        }
        this.f160b.removeCallbacks(this.f);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f160b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f160b.isEnabled() && this.i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.g) > this.d || Math.abs(y - this.h) > this.d) {
                this.g = x;
                this.h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        a(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }

    public static void a(a1 a1Var) {
        a1 a1Var2 = k;
        if (a1Var2 != null) {
            a1Var2.f160b.removeCallbacks(a1Var2.e);
        }
        k = a1Var;
        if (a1Var != null) {
            a1Var.f160b.postDelayed(a1Var.e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }
}
