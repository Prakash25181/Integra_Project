package androidx.appcompat.widget;

import a.b.j;
import a.b.k.a;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.r;
import a.b.p.d0;
import a.b.p.l;
import a.b.p.p0;
import a.b.p.x0;
import a.b.p.z;
import a.b.p.z0;
import a.e.k.n;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public f H;
    public final ActionMenuView.e I;
    public z0 J;
    public a.b.p.c K;
    public d L;
    public boolean M;
    public final Runnable N;

    /* renamed from: b, reason: collision with root package name */
    public ActionMenuView f686b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f687c;
    public TextView d;
    public ImageButton e;
    public ImageView f;
    public Drawable g;
    public CharSequence h;
    public ImageButton i;
    public View j;
    public Context k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public p0 u;
    public int v;
    public int w;
    public int x;
    public CharSequence y;
    public CharSequence z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.L;
            i iVar = dVar == null ? null : dVar.f692c;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new a.b.o.f(getContext());
    }

    public void a() {
        if (this.i == null) {
            l lVar = new l(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            this.i = lVar;
            lVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388611 | (this.o & 112);
            generateDefaultLayoutParams.f693b = 2;
            this.i.setLayoutParams(generateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public final int b(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final void c() {
        d();
        ActionMenuView actionMenuView = this.f686b;
        if (actionMenuView.q == null) {
            a.b.o.i.g gVar = (a.b.o.i.g) actionMenuView.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f686b.setExpandedActionViewsExclusive(true);
            gVar.a(this.L, this.k);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.f686b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f686b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f686b.setOnMenuItemClickListener(this.I);
            ActionMenuView actionMenuView2 = this.f686b;
            actionMenuView2.v = null;
            actionMenuView2.w = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388613 | (this.o & 112);
            this.f686b.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.f686b, false);
        }
    }

    public final void e() {
        if (this.e == null) {
            this.e = new l(getContext(), null, a.b.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f2a = 8388611 | (this.o & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.f686b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f686b;
        if (actionMenuView != null) {
            a.b.p.c cVar = actionMenuView.u;
            if (cVar != null && cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f233a : p0Var.f234b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f233a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.f234b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.g ? p0Var.f234b : p0Var.f233a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        a.b.o.i.g gVar;
        ActionMenuView actionMenuView = this.f686b;
        if ((actionMenuView == null || (gVar = actionMenuView.q) == null || !gVar.hasVisibleItems()) ? false : true) {
            return Math.max(getContentInsetEnd(), Math.max(this.w, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (n.c(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (n.c(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.v, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        c();
        return this.f686b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public a.b.p.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        c();
        return this.f686b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    public final TextView getSubtitleTextView() {
        return this.d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    public final TextView getTitleTextView() {
        return this.f687c;
    }

    public d0 getWrapper() {
        if (this.J == null) {
            this.J = new z0(this, true);
        }
        return this.J;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.N);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x029f A[LOOP:0: B:40:0x029d->B:41:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c1 A[LOOP:1: B:44:0x02bf->B:45:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e6 A[LOOP:2: B:48:0x02e4->B:49:0x02e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0338 A[LOOP:3: B:57:0x0336->B:58:0x0338, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0225  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0296  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f483b);
        ActionMenuView actionMenuView = this.f686b;
        a.b.o.i.g gVar2 = actionMenuView != null ? actionMenuView.q : null;
        int i = gVar.d;
        if (i != 0 && this.L != null && gVar2 != null && (findItem = gVar2.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (gVar.e) {
            removeCallbacks(this.N);
            post(this.N);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        b();
        p0 p0Var = this.u;
        boolean z = i == 1;
        if (z == p0Var.g) {
            return;
        }
        p0Var.g = z;
        if (!p0Var.h) {
            p0Var.f233a = p0Var.e;
            p0Var.f234b = p0Var.f;
            return;
        }
        if (z) {
            int i2 = p0Var.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = p0Var.e;
            }
            p0Var.f233a = i2;
            int i3 = p0Var.f235c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = p0Var.f;
            }
            p0Var.f234b = i3;
            return;
        }
        int i4 = p0Var.f235c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = p0Var.e;
        }
        p0Var.f233a = i4;
        int i5 = p0Var.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = p0Var.f;
        }
        p0Var.f234b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (iVar = dVar.f692c) != null) {
            gVar.d = iVar.f133a;
        }
        gVar.e = f();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.b.l.a.a.c(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.M = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(a.b.l.a.a.c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.b.l.a.a.c(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        e();
        this.e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        c();
        this.f686b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0000a {

        /* renamed from: b, reason: collision with root package name */
        public int f693b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f693b = 0;
        }

        public e(int i, int i2) {
            super(i, i2);
            this.f693b = 0;
            this.f2a = 8388627;
        }

        public e(e eVar) {
            super((a.C0000a) eVar);
            this.f693b = 0;
            this.f693b = eVar.f693b;
        }

        public e(a.C0000a c0000a) {
            super(c0000a);
            this.f693b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f693b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f693b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.b.a.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            a();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            a();
            this.i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f == null) {
                this.f = new a.b.p.n(getContext(), null, 0);
            }
            if (!c(this.f)) {
                a((View) this.f, true);
            }
        } else {
            ImageView imageView = this.f;
            if (imageView != null && c(imageView)) {
                removeView(this.f);
                this.F.remove(this.f);
            }
        }
        ImageView imageView2 = this.f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f == null) {
            this.f = new a.b.p.n(getContext(), null, 0);
        }
        ImageView imageView = this.f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            if (!c(this.e)) {
                a((View) this.e, true);
            }
        } else {
            ImageButton imageButton = this.e;
            if (imageButton != null && c(imageButton)) {
                removeView(this.e);
                this.F.remove(this.e);
            }
        }
        ImageButton imageButton2 = this.e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.d == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.d = zVar;
                zVar.setSingleLine();
                this.d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.d.setTextColor(colorStateList);
                }
            }
            if (!c(this.d)) {
                a((View) this.d, true);
            }
        } else {
            TextView textView = this.d;
            if (textView != null && c(textView)) {
                removeView(this.d);
                this.F.remove(this.d);
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f687c == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f687c = zVar;
                zVar.setSingleLine();
                this.f687c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f687c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f687c.setTextColor(colorStateList);
                }
            }
            if (!c(this.f687c)) {
                a((View) this.f687c, true);
            }
        } else {
            TextView textView = this.f687c;
            if (textView != null && c(textView)) {
                removeView(this.f687c);
                this.F.remove(this.f687c);
            }
        }
        TextView textView2 = this.f687c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f687c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* loaded from: classes.dex */
    public class d implements m {

        /* renamed from: b, reason: collision with root package name */
        public a.b.o.i.g f691b;

        /* renamed from: c, reason: collision with root package name */
        public i f692c;

        public d() {
        }

        @Override // a.b.o.i.m
        public void a(a.b.o.i.g gVar, boolean z) {
        }

        @Override // a.b.o.i.m
        public void a(m.a aVar) {
        }

        @Override // a.b.o.i.m
        public void a(Context context, a.b.o.i.g gVar) {
            i iVar;
            a.b.o.i.g gVar2 = this.f691b;
            if (gVar2 != null && (iVar = this.f692c) != null) {
                gVar2.a(iVar);
            }
            this.f691b = gVar;
        }

        @Override // a.b.o.i.m
        public boolean a(r rVar) {
            return false;
        }

        @Override // a.b.o.i.m
        public boolean b() {
            return false;
        }

        @Override // a.b.o.i.m
        public boolean b(a.b.o.i.g gVar, i iVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.b.o.b) {
                ((a.b.o.b) callback).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.F.get(size));
                } else {
                    toolbar3.F.clear();
                    this.f692c = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.n.b(false);
                    return true;
                }
            }
        }

        @Override // a.b.o.i.m
        public void a(boolean z) {
            if (this.f692c != null) {
                a.b.o.i.g gVar = this.f691b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (this.f691b.getItem(i) == this.f692c) {
                            z2 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (z2) {
                    return;
                }
                b(this.f691b, this.f692c);
            }
        }

        @Override // a.b.o.i.m
        public boolean a(a.b.o.i.g gVar, i iVar) {
            Toolbar.this.a();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f692c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f2a = 8388611 | (toolbar4.o & 112);
                generateDefaultLayoutParams.f693b = 2;
                toolbar4.j.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f693b != 2 && childAt != toolbar6.f686b) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.n.b(false);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.b.o.b) {
                ((a.b.o.b) callback).a();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends a.g.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int d;
        public boolean e;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readInt();
            this.e = parcel.readInt() != 0;
        }

        @Override // a.g.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f483b, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.N = new b();
        x0 a2 = x0.a(getContext(), attributeSet, j.Toolbar, i, 0);
        this.m = a2.e(j.Toolbar_titleTextAppearance, 0);
        this.n = a2.e(j.Toolbar_subtitleTextAppearance, 0);
        this.x = a2.f275b.getInteger(j.Toolbar_android_gravity, this.x);
        this.o = a2.f275b.getInteger(j.Toolbar_buttonGravity, 48);
        int a3 = a2.a(j.Toolbar_titleMargin, 0);
        a3 = a2.f(j.Toolbar_titleMargins) ? a2.a(j.Toolbar_titleMargins, a3) : a3;
        this.t = a3;
        this.s = a3;
        this.r = a3;
        this.q = a3;
        int a4 = a2.a(j.Toolbar_titleMarginStart, -1);
        if (a4 >= 0) {
            this.q = a4;
        }
        int a5 = a2.a(j.Toolbar_titleMarginEnd, -1);
        if (a5 >= 0) {
            this.r = a5;
        }
        int a6 = a2.a(j.Toolbar_titleMarginTop, -1);
        if (a6 >= 0) {
            this.s = a6;
        }
        int a7 = a2.a(j.Toolbar_titleMarginBottom, -1);
        if (a7 >= 0) {
            this.t = a7;
        }
        this.p = a2.b(j.Toolbar_maxButtonHeight, -1);
        int a8 = a2.a(j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int a9 = a2.a(j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int b2 = a2.b(j.Toolbar_contentInsetLeft, 0);
        int b3 = a2.b(j.Toolbar_contentInsetRight, 0);
        b();
        p0 p0Var = this.u;
        p0Var.h = false;
        if (b2 != Integer.MIN_VALUE) {
            p0Var.e = b2;
            p0Var.f233a = b2;
        }
        if (b3 != Integer.MIN_VALUE) {
            p0Var.f = b3;
            p0Var.f234b = b3;
        }
        if (a8 != Integer.MIN_VALUE || a9 != Integer.MIN_VALUE) {
            this.u.a(a8, a9);
        }
        this.v = a2.a(j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.w = a2.a(j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.g = a2.b(j.Toolbar_collapseIcon);
        this.h = a2.e(j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.k = getContext();
        setPopupTheme(a2.e(j.Toolbar_popupTheme, 0));
        Drawable b4 = a2.b(j.Toolbar_navigationIcon);
        if (b4 != null) {
            setNavigationIcon(b4);
        }
        CharSequence e4 = a2.e(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b5 = a2.b(j.Toolbar_logo);
        if (b5 != null) {
            setLogo(b5);
        }
        CharSequence e5 = a2.e(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.f(j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(j.Toolbar_titleTextColor));
        }
        if (a2.f(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(j.Toolbar_subtitleTextColor));
        }
        if (a2.f(j.Toolbar_menu)) {
            getMenuInflater().inflate(a2.e(j.Toolbar_menu, 0), getMenu());
        }
        a2.f275b.recycle();
    }

    @Override // android.view.ViewGroup
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0000a) {
            return new e((a.C0000a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean c(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public final void a(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f693b = 1;
        if (z && this.j != null) {
            view.setLayoutParams(eVar);
            this.F.add(view);
        } else {
            addView(view, eVar);
        }
    }

    public final void b() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    public final boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void a(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int a(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int a2 = a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int a(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = eVar.f2a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.x & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 != 80) {
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i4 < i5) {
                i4 = i5;
            } else {
                int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i6 < i7) {
                    i4 = Math.max(0, i4 - (i7 - i6));
                }
            }
            return paddingTop + i4;
        }
        return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
    }

    public final void a(List<View> list, int i) {
        boolean z = n.c(this) == 1;
        int childCount = getChildCount();
        int a2 = a.b.k.r.a(i, n.c(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f693b == 0 && d(childAt) && a(eVar.f2a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f693b == 0 && d(childAt2) && a(eVar2.f2a) == a2) {
                list.add(childAt2);
            }
        }
    }

    public final int a(int i) {
        int c2 = n.c(this);
        int a2 = a.b.k.r.a(i, c2) & 7;
        return (a2 == 1 || a2 == 3 || a2 == 5) ? a2 : c2 == 1 ? 5 : 3;
    }

    public final int a(View view) {
        int i;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (Build.VERSION.SDK_INT >= 17) {
            i = marginLayoutParams.getMarginStart();
        } else {
            i = marginLayoutParams.leftMargin;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            i2 = marginLayoutParams.getMarginEnd();
        } else {
            i2 = marginLayoutParams.rightMargin;
        }
        return i + i2;
    }
}
