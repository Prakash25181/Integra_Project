package a.b.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: AppCompatButton.java */
/* loaded from: classes.dex */
public class f extends Button implements a.e.k.m, a.e.l.b {

    /* renamed from: b, reason: collision with root package name */
    public final e f181b;

    /* renamed from: c, reason: collision with root package name */
    public final y f182c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.buttonStyle
            android.content.Context r2 = a.b.p.u0.a(r2)
            r1.<init>(r2, r3, r0)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r1)
            r1.f181b = r2
            r2.a(r3, r0)
            a.b.p.y r2 = new a.b.p.y
            r2.<init>(r1)
            r1.f182c = r2
            r2.a(r3, r0)
            a.b.p.y r2 = r1.f182c
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.f.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f181b;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f182c;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f182c;
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
        y yVar = this.f182c;
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
        y yVar = this.f182c;
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
        y yVar = this.f182c;
        return yVar != null ? yVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (a.e.l.b.f473a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        y yVar = this.f182c;
        if (yVar != null) {
            return yVar.i.f157a;
        }
        return 0;
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f181b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f181b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.f182c;
        if (yVar == null || a.e.l.b.f473a) {
            return;
        }
        yVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.f182c;
        if (yVar == null || a.e.l.b.f473a || !yVar.b()) {
            return;
        }
        this.f182c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (a.e.l.b.f473a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.f182c;
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
        y yVar = this.f182c;
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
        y yVar = this.f182c;
        if (yVar != null) {
            yVar.a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f181b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f181b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b.k.r.a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f182c;
        if (yVar != null) {
            yVar.f277a.setAllCaps(z);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f181b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f181b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f182c;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = a.e.l.b.f473a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.f182c;
        if (yVar == null || z || yVar.b()) {
            return;
        }
        yVar.i.a(i, f);
    }
}
