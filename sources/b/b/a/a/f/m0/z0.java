package b.b.a.a.f.m0;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.b.a.a.f.c;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import java.util.ArrayList;

/* compiled from: PopupView.java */
/* loaded from: classes.dex */
public abstract class z0 extends b.b.a.a.f.o0.b {
    public a d;
    public ViewGroup e;
    public View f;
    public View g;

    /* compiled from: PopupView.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public z0(Context context) {
        super(context);
    }

    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = 17;
    }

    public void f() {
        View view = this.f;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList(5);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getScaleX(), 0.0f);
        ofFloat.addUpdateListener(new b.b.a.a.f.d(ofFloat, view));
        b.b.a.a.f.c.a(ofFloat, 200, (c.g) null);
        arrayList.add(ofFloat);
        arrayList.add(b.b.a.a.f.c.a(view, 200, 0.0f, (c.g) null));
        animatorSet.addListener(new c.f(new y0(this)));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }

    public void g() {
        View view = this.f;
        a(new Point(view.getWidth() / 2, view.getHeight() / 2));
    }

    public void h() {
        f();
    }

    public void i() {
        MainActivity.l lVar = (MainActivity.l) this.d;
        MainActivity.this.S.removeView(lVar.f1689a.d);
        MainActivity mainActivity = MainActivity.this;
        if (mainActivity.T == lVar.f1689a) {
            mainActivity.T = null;
            mainActivity.S.setVisibility(4);
        }
        View view = lVar.f1690b;
        if (view != null) {
            view.setSelected(false);
        }
        v0 v0Var = lVar.f1691c;
        if (v0Var != null) {
            v0Var.a();
        }
    }

    public void a(Point point) {
        View view = this.f;
        view.setPivotX(point.x);
        view.setPivotY(point.y);
        view.setScaleX(0.0f);
        view.setScaleY(0.0f);
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList(5);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getScaleX(), 1.0f);
        ofFloat.addUpdateListener(new b.b.a.a.f.d(ofFloat, view));
        b.b.a.a.f.c.a(ofFloat, 200, (c.g) null);
        arrayList.add(ofFloat);
        arrayList.add(b.b.a.a.f.c.a(view, 200, 1.0f, (c.g) null));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
    }
}
