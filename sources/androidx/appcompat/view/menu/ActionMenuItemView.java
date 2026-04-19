package androidx.appcompat.view.menu;

import a.b.j;
import a.b.k.r;
import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.n;
import a.b.o.i.p;
import a.b.p.c;
import a.b.p.h0;
import a.b.p.z;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;

/* loaded from: classes.dex */
public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {
    public i f;
    public CharSequence g;
    public Drawable h;
    public g.b i;
    public h0 j;
    public b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    /* loaded from: classes.dex */
    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // a.b.p.h0
        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.k;
            if (bVar == null || (aVar = c.this.v) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // a.b.p.h0
        public boolean c() {
            p b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.i;
            return bVar != null && bVar.a(actionMenuItemView.f) && (b2 = b()) != null && b2.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // a.b.o.i.n.a
    public void a(i iVar, int i) {
        CharSequence charSequence;
        this.f = iVar;
        setIcon(iVar.getIcon());
        if (c()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.e;
        }
        setTitle(charSequence);
        setId(iVar.f133a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d();
    }

    @Override // a.b.o.i.n.a
    public boolean c() {
        return true;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g);
        if (this.h != null) {
            if (!((this.f.y & 4) == 4) || (!this.l && !this.m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.g : null);
        CharSequence charSequence = this.f.q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z3 ? null : this.f.e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f.r;
        if (TextUtils.isEmpty(charSequence2)) {
            r.a((View) this, z3 ? null : this.f.e);
        } else {
            r.a((View) this, charSequence2);
        }
    }

    @Override // a.b.o.i.n.a
    public i getItemData() {
        return this.f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        g.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = e();
        f();
    }

    @Override // a.b.p.z, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean d = d();
        if (d && (i3 = this.o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (d || this.h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (this.f.hasSubMenu() && (h0Var = this.j) != null && h0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            i iVar = this.f;
            if (iVar != null) {
                iVar.n.h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            int i2 = this.p;
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (intrinsicWidth * (i2 / intrinsicHeight));
                intrinsicHeight = i2;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.g = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.l = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d() && this.f.getIcon() == null;
    }
}
