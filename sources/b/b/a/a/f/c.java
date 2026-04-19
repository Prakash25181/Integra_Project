package b.b.a.a.f;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: AppAnimation.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public View f1154a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f1155b = new AnimatorSet();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<Animator> f1156c = new ArrayList<>(5);

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1157a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1158b;

        public a(View view, int i) {
            this.f1157a = view;
            this.f1158b = i;
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            this.f1157a.setVisibility(this.f1158b);
            this.f1157a.setAlpha(1.0f);
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1159a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f1160b;

        public b(View view, ValueAnimator valueAnimator) {
            this.f1159a = view;
            this.f1160b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1159a.setTranslationX(((Integer) this.f1160b.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: AppAnimation.java */
    /* renamed from: b.b.a.a.f.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0039c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1161a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f1162b;

        public C0039c(View view, ValueAnimator valueAnimator) {
            this.f1161a = view;
            this.f1162b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1161a.setTranslationY(((Integer) this.f1162b.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1163a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ValueAnimator f1164b;

        public d(View view, ValueAnimator valueAnimator) {
            this.f1163a = view;
            this.f1164b = valueAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1163a.setAlpha(((Float) this.f1164b.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class e implements i0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1165a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1166b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f1167c;
        public final /* synthetic */ int d;
        public final /* synthetic */ FrameLayout e;
        public final /* synthetic */ g f;

        /* compiled from: AppAnimation.java */
        /* loaded from: classes.dex */
        public class a implements g {
            public a() {
            }

            @Override // b.b.a.a.f.c.g
            public void a(boolean z) {
                e eVar = e.this;
                eVar.e.removeView(eVar.f1167c);
            }
        }

        /* compiled from: AppAnimation.java */
        /* loaded from: classes.dex */
        public class b implements g {
            public b() {
            }

            @Override // b.b.a.a.f.c.g
            public void a(boolean z) {
                g gVar = e.this.f;
                if (gVar != null) {
                    gVar.a(z);
                }
            }
        }

        public e(View view, int i, View view2, int i2, FrameLayout frameLayout, g gVar) {
            this.f1165a = view;
            this.f1166b = i;
            this.f1167c = view2;
            this.d = i2;
            this.e = frameLayout;
            this.f = gVar;
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            this.f1165a.setX(this.f1166b);
            c.b(this.f1167c, this.d, (g) new a());
            c.b(this.f1165a, 0, (g) new b());
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public static class f implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public g f1170a;

        public f(g gVar) {
            this.f1170a = gVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1170a.a(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1170a.a(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(boolean z);
    }

    public c(View view) {
        this.f1154a = view;
    }

    public static void c(View view, int i, g gVar) {
        b(view, 200, i, gVar).start();
    }

    public c a(int i, int i2) {
        this.f1156c.add(a(this.f1154a, 200, i, (g) null));
        this.f1156c.add(b(this.f1154a, 200, i2, null));
        return this;
    }

    public c b(float f2) {
        View view = this.f1154a;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getScaleX(), f2);
        ofFloat.addUpdateListener(new b.b.a.a.f.d(ofFloat, view));
        a(ofFloat, 200, (g) null);
        this.f1156c.add(ofFloat);
        return this;
    }

    public c a(float f2) {
        this.f1156c.add(a(this.f1154a, 200, f2, (g) null));
        return this;
    }

    public static void b(View view, int i, g gVar) {
        a(view, 200, i, gVar).start();
    }

    public static Animator b(View view, int i, int i2, g gVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt((int) view.getTranslationY(), i2);
        ofInt.addUpdateListener(new C0039c(view, ofInt));
        a(ofInt, i, gVar);
        return ofInt;
    }

    public void a(g gVar) {
        if (gVar != null) {
            this.f1155b.addListener(new f(gVar));
        }
        this.f1155b.playTogether(this.f1156c);
        this.f1155b.start();
    }

    public static void a(View view, boolean z) {
        if (z) {
            a(view);
        } else {
            a(view, 4);
        }
    }

    public static void b(View view, float f2, g gVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getScaleY(), f2);
        ofFloat.addUpdateListener(new b.b.a.a.f.e(ofFloat, view));
        a(ofFloat, 200, gVar);
        ofFloat.start();
    }

    public static void a(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            a(view, 1.0f, (g) null);
        }
    }

    public static void a(View view, int i) {
        if (view.getVisibility() == 0) {
            a(view, 0.0f, (g) new a(view, i));
        }
    }

    public static Animator a(View view, int i, int i2, g gVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt((int) view.getTranslationX(), i2);
        ofInt.addUpdateListener(new b(view, ofInt));
        a(ofInt, i, gVar);
        return ofInt;
    }

    public static void a(View view, float f2, g gVar) {
        a(view, 200, f2, gVar).start();
    }

    public static Animator a(View view, int i, float f2, g gVar) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getAlpha(), f2);
        ofFloat.addUpdateListener(new d(view, ofFloat));
        a(ofFloat, i, gVar);
        return ofFloat;
    }

    public static void a(View view, int i, g gVar) {
        Drawable background = view.getBackground();
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(background.getClass().equals(ColorDrawable.class) ? ((ColorDrawable) background).getColor() : 0), Integer.valueOf(i));
        ofObject.addUpdateListener(new b.b.a.a.f.f(view, ofObject));
        a(ofObject, 200, gVar);
        ofObject.start();
    }

    public static void a(ValueAnimator valueAnimator, int i, g gVar) {
        if (gVar != null) {
            valueAnimator.addListener(new f(gVar));
        }
        valueAnimator.setDuration(i);
        valueAnimator.setInterpolator(new LinearInterpolator());
    }

    public static void a(FrameLayout frameLayout, View view, View view2, boolean z, g gVar) {
        int width = frameLayout.getWidth();
        if (z) {
            width = -width;
        }
        a.b.k.r.a(view2, (i0) new e(view2, z ? frameLayout.getWidth() : -frameLayout.getWidth(), view, width, frameLayout, gVar));
    }
}
