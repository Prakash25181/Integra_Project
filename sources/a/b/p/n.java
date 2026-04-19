package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: AppCompatImageView.java */
/* loaded from: classes.dex */
public class n extends ImageView implements a.e.k.m, a.e.l.g {

    /* renamed from: b, reason: collision with root package name */
    public final e f223b;

    /* renamed from: c, reason: collision with root package name */
    public final m f224c;

    public n(Context context, AttributeSet attributeSet, int i) {
        super(u0.a(context), attributeSet, i);
        e eVar = new e(this);
        this.f223b = eVar;
        eVar.a(attributeSet, i);
        m mVar = new m(this);
        this.f224c = mVar;
        mVar.a(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f223b;
        if (eVar != null) {
            eVar.a();
        }
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f223b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f223b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.e.l.g
    public ColorStateList getSupportImageTintList() {
        v0 v0Var;
        m mVar = this.f224c;
        if (mVar == null || (v0Var = mVar.f221b) == null) {
            return null;
        }
        return v0Var.f256a;
    }

    @Override // a.e.l.g
    public PorterDuff.Mode getSupportImageTintMode() {
        v0 v0Var;
        m mVar = this.f224c;
        if (mVar == null || (v0Var = mVar.f221b) == null) {
            return null;
        }
        return v0Var.f257b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f224c.b() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f223b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f223b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f223b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f223b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // a.e.l.g
    public void setSupportImageTintList(ColorStateList colorStateList) {
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a(colorStateList);
        }
    }

    @Override // a.e.l.g
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        m mVar = this.f224c;
        if (mVar != null) {
            mVar.a(mode);
        }
    }
}
