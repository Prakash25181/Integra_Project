package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: AppCompatEditText.java */
/* loaded from: classes.dex */
public class k extends EditText implements a.e.k.m {

    /* renamed from: b, reason: collision with root package name */
    public final e f209b;

    /* renamed from: c, reason: collision with root package name */
    public final y f210c;
    public final x d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.editTextStyle
            android.content.Context r2 = a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.f209b = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.f210c = r2
            r2.a(r3, r0)
            a.b.p.y r2 = r1.f210c
            r2.a()
            a.b.p.x r2 = new a.b.p.x
            r2.<init>(r1)
            r1.d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.k.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f209b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f210c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f209b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f209b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.d) != null) {
            return xVar.a();
        }
        return super.getTextClassifier();
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
        e eVar = this.f209b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f209b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b.k.r.a((TextView) this, callback));
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f209b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f209b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f210c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.d) != null) {
            xVar.f273b = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
