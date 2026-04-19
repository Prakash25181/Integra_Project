package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: AppCompatBackgroundHelper.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f176a;
    public v0 d;
    public v0 e;
    public v0 f;

    /* renamed from: c, reason: collision with root package name */
    public int f178c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final j f177b = j.a();

    public e(View view) {
        this.f176a = view;
    }

    public void a(AttributeSet attributeSet, int i) {
        x0 a2 = x0.a(this.f176a.getContext(), attributeSet, a.b.j.ViewBackgroundHelper, i, 0);
        try {
            if (a2.f(a.b.j.ViewBackgroundHelper_android_background)) {
                this.f178c = a2.e(a.b.j.ViewBackgroundHelper_android_background, -1);
                ColorStateList b2 = this.f177b.b(this.f176a.getContext(), this.f178c);
                if (b2 != null) {
                    a(b2);
                }
            }
            if (a2.f(a.b.j.ViewBackgroundHelper_backgroundTint)) {
                a.e.k.n.a(this.f176a, a2.a(a.b.j.ViewBackgroundHelper_backgroundTint));
            }
            if (a2.f(a.b.j.ViewBackgroundHelper_backgroundTintMode)) {
                a.e.k.n.a(this.f176a, e0.a(a2.c(a.b.j.ViewBackgroundHelper_backgroundTintMode, -1), null));
            }
        } finally {
            a2.f275b.recycle();
        }
    }

    public void b(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f256a = colorStateList;
        v0Var.d = true;
        a();
    }

    public PorterDuff.Mode c() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f257b;
        }
        return null;
    }

    public void d() {
        this.f178c = -1;
        a((ColorStateList) null);
        a();
    }

    public ColorStateList b() {
        v0 v0Var = this.e;
        if (v0Var != null) {
            return v0Var.f256a;
        }
        return null;
    }

    public void a(int i) {
        this.f178c = i;
        j jVar = this.f177b;
        a(jVar != null ? jVar.b(this.f176a.getContext(), i) : null);
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new v0();
        }
        v0 v0Var = this.e;
        v0Var.f257b = mode;
        v0Var.f258c = true;
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        Drawable background = this.f176a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 ? i == 21 : this.d != null) {
                if (this.f == null) {
                    this.f = new v0();
                }
                v0 v0Var = this.f;
                PorterDuff.Mode mode = null;
                v0Var.f256a = null;
                v0Var.d = false;
                v0Var.f257b = null;
                v0Var.f258c = false;
                ColorStateList b2 = a.e.k.n.b(this.f176a);
                if (b2 != null) {
                    v0Var.d = true;
                    v0Var.f256a = b2;
                }
                View view = this.f176a;
                if (Build.VERSION.SDK_INT >= 21) {
                    mode = view.getBackgroundTintMode();
                } else if (view instanceof a.e.k.m) {
                    mode = ((a.e.k.m) view).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    v0Var.f258c = true;
                    v0Var.f257b = mode;
                }
                if (v0Var.d || v0Var.f258c) {
                    j.a(background, v0Var, this.f176a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.e;
            if (v0Var2 != null) {
                j.a(background, v0Var2, this.f176a.getDrawableState());
                return;
            }
            v0 v0Var3 = this.d;
            if (v0Var3 != null) {
                j.a(background, v0Var3, this.f176a.getDrawableState());
            }
        }
    }

    public void a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new v0();
            }
            v0 v0Var = this.d;
            v0Var.f256a = colorStateList;
            v0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }
}
