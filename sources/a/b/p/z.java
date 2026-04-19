package a.b.p;

import a.e.i.a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView.java */
/* loaded from: classes.dex */
public class z extends TextView implements a.e.k.m, a.e.l.f, a.e.l.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f287b;

    /* renamed from: c, reason: collision with root package name */
    public final y f288c;
    public final x d;
    public Future<a.e.i.a> e;

    public z(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f287b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f288c;
        if (yVar != null) {
            return Math.round(yVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f288c;
        if (yVar != null) {
            return Math.round(yVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f288c;
        if (yVar != null) {
            return Math.round(yVar.i.f159c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f288c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f288c;
        if (yVar != null) {
            return yVar.i.f157a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f287b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f287b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f288c.h;
        if (v0Var != null) {
            return v0Var.f256a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f288c.h;
        if (v0Var != null) {
            return v0Var.f257b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<a.e.i.a> future = this.e;
        if (future != null) {
            try {
                this.e = null;
                a.b.k.r.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT < 28 && (xVar = this.d) != null) {
            return xVar.a();
        }
        return super.getTextClassifier();
    }

    public a.C0016a getTextMetricsParamsCompat() {
        return a.b.k.r.a((TextView) this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.k.r.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f288c;
        if (yVar == null || a.e.l.b.f473a) {
            return;
        }
        yVar.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<a.e.i.a> future = this.e;
        if (future != null) {
            try {
                this.e = null;
                a.b.k.r.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f288c;
        if (yVar == null || a.e.l.b.f473a || !yVar.b()) {
            return;
        }
        this.f288c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a.e.l.b.f473a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (a.e.l.b.f473a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (a.e.l.b.f473a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f287b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f287b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b.k.r.a((TextView) this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            a.b.k.r.a(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            a.b.k.r.b(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        a.b.k.r.c(this, i);
    }

    public void setPrecomputedText(a.e.i.a aVar) {
        a.b.k.r.a((TextView) this, aVar);
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f287b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f287b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // a.e.l.f
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        y yVar = this.f288c;
        if (yVar.h == null) {
            yVar.h = new v0();
        }
        v0 v0Var = yVar.h;
        v0Var.f256a = colorStateList;
        v0Var.d = colorStateList != null;
        v0 v0Var2 = yVar.h;
        yVar.f278b = v0Var2;
        yVar.f279c = v0Var2;
        yVar.d = v0Var2;
        yVar.e = v0Var2;
        yVar.f = v0Var2;
        yVar.g = v0Var2;
        this.f288c.a();
    }

    @Override // a.e.l.f
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        y yVar = this.f288c;
        if (yVar.h == null) {
            yVar.h = new v0();
        }
        v0 v0Var = yVar.h;
        v0Var.f257b = mode;
        v0Var.f258c = mode != null;
        v0 v0Var2 = yVar.h;
        yVar.f278b = v0Var2;
        yVar.f279c = v0Var2;
        yVar.d = v0Var2;
        yVar.e = v0Var2;
        yVar.f = v0Var2;
        yVar.g = v0Var2;
        this.f288c.a();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f288c;
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

    public void setTextFuture(Future<a.e.i.a> future) {
        this.e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(a.C0016a c0016a) {
        if (Build.VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = c0016a.f419b;
            int i = 1;
            if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i = 7;
                }
            }
            setTextDirection(i);
        }
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = c0016a.f418a.getTextScaleX();
            getPaint().set(c0016a.f418a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(c0016a.f418a);
        setBreakStrategy(c0016a.f420c);
        setHyphenationFrequency(c0016a.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = a.e.l.b.f473a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f288c;
        if (yVar == null || z || yVar.b()) {
            return;
        }
        yVar.i.a(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : a.e.f.c.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(u0.a(context), attributeSet, i);
        e eVar = new e(this);
        this.f287b = eVar;
        eVar.a(attributeSet, i);
        y yVar = new y(this);
        this.f288c = yVar;
        yVar.a(attributeSet, i);
        this.f288c.a();
        this.d = new x(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? a.b.l.a.a.c(context, i) : null, i2 != 0 ? a.b.l.a.a.c(context, i2) : null, i3 != 0 ? a.b.l.a.a.c(context, i3) : null, i4 != 0 ? a.b.l.a.a.c(context, i4) : null);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? a.b.l.a.a.c(context, i) : null, i2 != 0 ? a.b.l.a.a.c(context, i2) : null, i3 != 0 ? a.b.l.a.a.c(context, i3) : null, i4 != 0 ? a.b.l.a.a.c(context, i4) : null);
        y yVar = this.f288c;
        if (yVar != null) {
            yVar.a();
        }
    }
}
