package b.b.a.a.f;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.onkyo.integraRemote4A.R;

/* compiled from: FadeController.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public View f1195a;

    /* renamed from: b, reason: collision with root package name */
    public Animation f1196b;

    /* renamed from: c, reason: collision with root package name */
    public Animation f1197c;
    public Animation d;
    public int e;

    /* compiled from: FadeController.java */
    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h hVar = h.this;
            if (hVar.d == hVar.f1196b) {
                hVar.d = null;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: FadeController.java */
    /* loaded from: classes.dex */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h hVar = h.this;
            hVar.f1195a.setVisibility(hVar.e);
            h hVar2 = h.this;
            if (hVar2.d == hVar2.f1197c) {
                hVar2.d = null;
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public h(View view, int i, int i2) {
        this.f1195a = view;
        this.e = view.getVisibility();
        this.f1196b = AnimationUtils.loadAnimation(view.getContext(), R.anim.abc_fade_in);
        this.f1197c = AnimationUtils.loadAnimation(view.getContext(), R.anim.abc_fade_out);
        this.f1196b.setDuration(i);
        this.f1197c.setDuration(i2);
        this.f1196b.setAnimationListener(new a());
        this.f1197c.setAnimationListener(new b());
    }

    public void a() {
        if (this.f1195a.getVisibility() != 8) {
            if (this.f1195a.getVisibility() == 0) {
                a(8);
            } else {
                this.f1195a.setVisibility(8);
            }
        }
    }

    public void b() {
        if (this.f1195a.getVisibility() != 4) {
            if (this.f1195a.getVisibility() == 0) {
                a(4);
            } else {
                this.f1195a.setVisibility(4);
            }
        }
    }

    public void c() {
        if (this.f1195a.getVisibility() != 0) {
            this.f1195a.setVisibility(0);
            a(0);
        }
    }

    public final void a(int i) {
        Animation animation = this.d;
        if (animation != null) {
            animation.cancel();
        }
        this.e = i;
        Animation animation2 = i == 0 ? this.f1196b : this.f1197c;
        this.d = animation2;
        this.f1195a.startAnimation(animation2);
    }
}
