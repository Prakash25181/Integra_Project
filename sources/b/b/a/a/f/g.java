package b.b.a.a.f;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import b.b.a.a.f.c;
import java.util.ArrayList;

/* compiled from: AppAnimation.java */
/* loaded from: classes.dex */
public class g implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f1188a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f1189b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1190c;
    public final /* synthetic */ c.g d;

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class a implements c.g {
        public a() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            g gVar = g.this;
            gVar.f1189b.removeView(gVar.f1188a);
        }
    }

    /* compiled from: AppAnimation.java */
    /* loaded from: classes.dex */
    public class b implements c.g {
        public b() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            c.g gVar = g.this.d;
            if (gVar != null) {
                gVar.a(z);
            }
        }
    }

    public g(View view, FrameLayout frameLayout, View view2, c.g gVar) {
        this.f1188a = view;
        this.f1189b = frameLayout;
        this.f1190c = view2;
        this.d = gVar;
    }

    @Override // b.b.a.a.f.i0
    public void a() {
        View view = this.f1188a;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(c.a(view, 200, 0.0f, (c.g) null));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getScaleX(), 0.9f);
        ofFloat.addUpdateListener(new d(ofFloat, view));
        c.a(ofFloat, 200, (c.g) null);
        arrayList.add(ofFloat);
        animatorSet.addListener(new c.f(new a()));
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        View view2 = this.f1190c;
        AnimatorSet animatorSet2 = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList(5);
        arrayList2.add(c.a(view2, 200, 1.0f, (c.g) null));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(view2.getScaleX(), 1.0f);
        ofFloat2.addUpdateListener(new d(ofFloat2, view2));
        c.a(ofFloat2, 200, (c.g) null);
        arrayList2.add(ofFloat2);
        animatorSet2.addListener(new c.f(new b()));
        animatorSet2.playTogether(arrayList2);
        animatorSet2.start();
    }
}
