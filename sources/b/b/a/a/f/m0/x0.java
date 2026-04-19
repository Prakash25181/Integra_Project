package b.b.a.a.f.m0;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PopupRootFrame.java */
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f1547a;

    /* renamed from: b, reason: collision with root package name */
    public z0 f1548b;

    /* renamed from: c, reason: collision with root package name */
    public View f1549c;
    public a d;

    /* compiled from: PopupRootFrame.java */
    /* loaded from: classes.dex */
    public class a extends FrameLayout {
        public a(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            KeyEvent.DispatcherState keyDispatcherState;
            if (keyEvent.getKeyCode() == 4) {
                if (getKeyDispatcherState() == null) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                    x0.this.a();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            }
            return super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int x2 = (int) x0.this.f1549c.getX();
                int y2 = (int) x0.this.f1549c.getY();
                if (!new Rect(x2, y2, x0.this.f1549c.getWidth() + x2, x0.this.f1549c.getHeight() + y2).contains(x, y)) {
                    x0.this.a();
                }
                return true;
            }
            if (motionEvent.getAction() == 4) {
                x0.this.a();
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
        public void sendAccessibilityEvent(int i) {
            View view = x0.this.f1549c;
            if (view != null) {
                view.sendAccessibilityEvent(i);
            } else {
                super.sendAccessibilityEvent(i);
            }
        }
    }

    public x0(Context context, z0 z0Var) {
        this.f1547a = context;
        this.f1548b = z0Var;
    }

    public void a() {
        z0 z0Var = this.f1548b;
        if (z0Var != null) {
            z0Var.h();
        }
    }
}
