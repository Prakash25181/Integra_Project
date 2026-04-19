package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;

/* compiled from: AppCompatCheckBox.java */
/* loaded from: classes.dex */
public class g extends CheckBox implements a.e.l.e, a.e.k.m {

    /* renamed from: b, reason: collision with root package name */
    public final i f187b;

    /* renamed from: c, reason: collision with root package name */
    public final e f188c;
    public final y d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.checkboxStyle
            android.content.Context r2 = a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.i r2 = new a.b.p.i
            r2.<init>(r1)
            r1.f187b = r2
            r2.a(r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.f188c = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.d = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.g.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f188c;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.d;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.f187b;
        return iVar != null ? iVar.a(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f188c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f188c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.f187b;
        if (iVar != null) {
            return iVar.f196b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.f187b;
        if (iVar != null) {
            return iVar.f197c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f188c;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f188c;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.f187b;
        if (iVar != null) {
            if (iVar.f) {
                iVar.f = false;
            } else {
                iVar.f = true;
                iVar.a();
            }
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f188c;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f188c;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // a.e.l.e
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.f187b;
        if (iVar != null) {
            iVar.f196b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    @Override // a.e.l.e
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.f187b;
        if (iVar != null) {
            iVar.f197c = mode;
            iVar.e = true;
            iVar.a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(a.b.l.a.a.c(getContext(), i));
    }
}
