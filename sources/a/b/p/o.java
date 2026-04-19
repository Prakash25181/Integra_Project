package a.b.p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: AppCompatMultiAutoCompleteTextView.java */
/* loaded from: classes.dex */
public class o extends MultiAutoCompleteTextView implements a.e.k.m {
    public static final int[] d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final e f228b;

    /* renamed from: c, reason: collision with root package name */
    public final y f229c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = a.b.a.autoCompleteTextViewStyle
            android.content.Context r4 = a.b.p.u0.a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            int[] r1 = a.b.p.o.d
            r2 = 0
            a.b.p.x0 r4 = a.b.p.x0.a(r4, r5, r1, r0, r2)
            boolean r1 = r4.f(r2)
            if (r1 == 0) goto L21
            android.graphics.drawable.Drawable r1 = r4.b(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L21:
            android.content.res.TypedArray r4 = r4.f275b
            r4.recycle()
            a.b.p.e r4 = new a.b.p.e
            r4.<init>(r3)
            r3.f228b = r4
            r4.a(r5, r0)
            a.b.p.y r4 = new a.b.p.y
            r4.<init>(r3)
            r3.f229c = r4
            r4.a(r5, r0)
            a.b.p.y r4 = r3.f229c
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.o.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f228b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f229c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f228b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f228b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.k.r.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f228b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f228b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.b.l.a.a.c(getContext(), i));
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f228b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f228b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f229c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
