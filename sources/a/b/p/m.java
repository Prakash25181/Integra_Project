package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageHelper.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f220a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f221b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f222c;

    public m(ImageView imageView) {
        this.f220a = imageView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int e;
        x0 a2 = x0.a(this.f220a.getContext(), attributeSet, a.b.j.AppCompatImageView, i, 0);
        try {
            Drawable drawable3 = this.f220a.getDrawable();
            if (drawable3 == null && (e = a2.e(a.b.j.AppCompatImageView_srcCompat, -1)) != -1 && (drawable3 = a.b.l.a.a.c(this.f220a.getContext(), e)) != null) {
                this.f220a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                e0.b(drawable3);
            }
            if (a2.f(a.b.j.AppCompatImageView_tint)) {
                ImageView imageView = this.f220a;
                ColorStateList a3 = a2.a(a.b.j.AppCompatImageView_tint);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView.setImageTintList(a3);
                    if (Build.VERSION.SDK_INT == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                        if (drawable2.isStateful()) {
                            drawable2.setState(imageView.getDrawableState());
                        }
                        imageView.setImageDrawable(drawable2);
                    }
                } else if (imageView instanceof a.e.l.g) {
                    ((a.e.l.g) imageView).setSupportImageTintList(a3);
                }
            }
            if (a2.f(a.b.j.AppCompatImageView_tintMode)) {
                ImageView imageView2 = this.f220a;
                PorterDuff.Mode a4 = e0.a(a2.c(a.b.j.AppCompatImageView_tintMode, -1), null);
                if (Build.VERSION.SDK_INT >= 21) {
                    imageView2.setImageTintMode(a4);
                    if (Build.VERSION.SDK_INT == 21 && (drawable = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                        if (drawable.isStateful()) {
                            drawable.setState(imageView2.getDrawableState());
                        }
                        imageView2.setImageDrawable(drawable);
                    }
                } else if (imageView2 instanceof a.e.l.g) {
                    ((a.e.l.g) imageView2).setSupportImageTintMode(a4);
                }
            }
            a2.f275b.recycle();
        } catch (Throwable th) {
            a2.f275b.recycle();
            throw th;
        }
    }

    public boolean b() {
        return Build.VERSION.SDK_INT < 21 || !(this.f220a.getBackground() instanceof RippleDrawable);
    }

    public void a(int i) {
        if (i != 0) {
            Drawable c2 = a.b.l.a.a.c(this.f220a.getContext(), i);
            if (c2 != null) {
                e0.b(c2);
            }
            this.f220a.setImageDrawable(c2);
        } else {
            this.f220a.setImageDrawable(null);
        }
        a();
    }

    public void a(ColorStateList colorStateList) {
        if (this.f221b == null) {
            this.f221b = new v0();
        }
        v0 v0Var = this.f221b;
        v0Var.f256a = colorStateList;
        v0Var.d = true;
        a();
    }

    public void a(PorterDuff.Mode mode) {
        if (this.f221b == null) {
            this.f221b = new v0();
        }
        v0 v0Var = this.f221b;
        v0Var.f257b = mode;
        v0Var.f258c = true;
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a() {
        ColorStateList supportImageTintList;
        Drawable drawable = this.f220a.getDrawable();
        if (drawable != null) {
            e0.b(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z = true;
            if (i <= 21 && i == 21) {
                if (this.f222c == null) {
                    this.f222c = new v0();
                }
                v0 v0Var = this.f222c;
                PorterDuff.Mode mode = null;
                v0Var.f256a = null;
                v0Var.d = false;
                v0Var.f257b = null;
                v0Var.f258c = false;
                ImageView imageView = this.f220a;
                if (Build.VERSION.SDK_INT >= 21) {
                    supportImageTintList = imageView.getImageTintList();
                } else {
                    supportImageTintList = imageView instanceof a.e.l.g ? ((a.e.l.g) imageView).getSupportImageTintList() : null;
                }
                if (supportImageTintList != null) {
                    v0Var.d = true;
                    v0Var.f256a = supportImageTintList;
                }
                ImageView imageView2 = this.f220a;
                if (Build.VERSION.SDK_INT >= 21) {
                    mode = imageView2.getImageTintMode();
                } else if (imageView2 instanceof a.e.l.g) {
                    mode = ((a.e.l.g) imageView2).getSupportImageTintMode();
                }
                if (mode != null) {
                    v0Var.f258c = true;
                    v0Var.f257b = mode;
                }
                if (v0Var.d || v0Var.f258c) {
                    j.a(drawable, v0Var, this.f220a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            v0 v0Var2 = this.f221b;
            if (v0Var2 != null) {
                j.a(drawable, v0Var2, this.f220a.getDrawableState());
            }
        }
    }
}
