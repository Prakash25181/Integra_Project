package androidx.appcompat.widget;

import a.b.o.i.g;
import a.b.o.i.i;
import a.b.o.i.m;
import a.b.o.i.n;
import a.b.p.c;
import a.b.p.d1;
import a.b.p.i0;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class ActionMenuView extends i0 implements g.b, n {
    public int A;
    public e B;
    public g q;
    public Context r;
    public int s;
    public boolean t;
    public a.b.p.c u;
    public m.a v;
    public g.a w;
    public boolean x;
    public int y;
    public int z;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // a.b.o.i.m.a
        public void a(g gVar, boolean z) {
        }

        @Override // a.b.o.i.m.a
        public boolean a(g gVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i0.a {

        /* renamed from: c, reason: collision with root package name */
        @ViewDebug.ExportedProperty
        public boolean f660c;

        @ViewDebug.ExportedProperty
        public int d;

        @ViewDebug.ExportedProperty
        public int e;

        @ViewDebug.ExportedProperty
        public boolean f;

        @ViewDebug.ExportedProperty
        public boolean g;
        public boolean h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f660c = cVar.f660c;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.f660c = false;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = actionMenuItemView != null && actionMenuItemView.d();
        int i5 = 2;
        if (i2 <= 0 || (z && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z || i6 >= 2) {
                i5 = i6;
            }
        }
        cVar.f = !cVar.f660c && z;
        cVar.d = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    public boolean b(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).b();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).a();
    }

    @Override // a.b.p.i0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.q == null) {
            Context context = getContext();
            g gVar = new g(context);
            this.q = gVar;
            gVar.e = new d();
            a.b.p.c cVar = new a.b.p.c(context);
            this.u = cVar;
            cVar.m = true;
            cVar.n = true;
            m.a aVar = this.v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f = aVar;
            this.q.a(this.u, this.r);
            a.b.p.c cVar2 = this.u;
            cVar2.i = this;
            this.q = cVar2.d;
        }
        return this.q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        a.b.p.c cVar = this.u;
        c.d dVar = cVar.j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.l) {
            return cVar.k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.a(false);
            if (this.u.e()) {
                this.u.c();
                this.u.f();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a.b.p.c cVar = this.u;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // a.b.p.i0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.x) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = d1.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f660c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (b(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    b(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f660c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f660c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // a.b.p.i0, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        ?? r3;
        g gVar;
        boolean z3 = this.x;
        boolean z4 = View.MeasureSpec.getMode(i) == 1073741824;
        this.x = z4;
        if (z3 != z4) {
            this.y = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.x && (gVar = this.q) != null && size != this.y) {
            this.y = size;
            gVar.b(true);
        }
        int childCount = getChildCount();
        if (this.x && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i7 = size2 - paddingRight;
            int i8 = this.z;
            int i9 = i7 / i8;
            int i10 = i7 % i8;
            if (i9 == 0) {
                setMeasuredDimension(i7, 0);
                return;
            }
            int i11 = (i10 / i9) + i8;
            int childCount2 = getChildCount();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            boolean z5 = false;
            long j = 0;
            while (i16 < childCount2) {
                View childAt = getChildAt(i16);
                int i17 = size3;
                int i18 = i7;
                if (childAt.getVisibility() != 8) {
                    boolean z6 = childAt instanceof ActionMenuItemView;
                    int i19 = i12 + 1;
                    if (z6) {
                        int i20 = this.A;
                        i6 = i19;
                        r3 = 0;
                        childAt.setPadding(i20, 0, i20, 0);
                    } else {
                        i6 = i19;
                        r3 = 0;
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.h = r3;
                    cVar.e = r3;
                    cVar.d = r3;
                    cVar.f = r3;
                    ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r3;
                    ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r3;
                    cVar.g = z6 && ((ActionMenuItemView) childAt).d();
                    int a2 = a(childAt, i11, cVar.f660c ? 1 : i9, childMeasureSpec, paddingBottom);
                    i14 = Math.max(i14, a2);
                    if (cVar.f) {
                        i15++;
                    }
                    if (cVar.f660c) {
                        z5 = true;
                    }
                    i9 -= a2;
                    i13 = Math.max(i13, childAt.getMeasuredHeight());
                    if (a2 == 1) {
                        j |= 1 << i16;
                    }
                    i12 = i6;
                }
                i16++;
                size3 = i17;
                i7 = i18;
            }
            int i21 = i7;
            int i22 = size3;
            boolean z7 = z5 && i12 == 2;
            boolean z8 = false;
            while (i15 > 0 && i9 > 0) {
                int i23 = Integer.MAX_VALUE;
                int i24 = 0;
                int i25 = 0;
                long j2 = 0;
                while (i24 < childCount2) {
                    int i26 = i13;
                    c cVar2 = (c) getChildAt(i24).getLayoutParams();
                    boolean z9 = z8;
                    if (cVar2.f) {
                        int i27 = cVar2.d;
                        if (i27 < i23) {
                            j2 = 1 << i24;
                            i23 = i27;
                            i25 = 1;
                        } else if (i27 == i23) {
                            i25++;
                            j2 |= 1 << i24;
                        }
                    }
                    i24++;
                    z8 = z9;
                    i13 = i26;
                }
                i3 = i13;
                z = z8;
                j |= j2;
                if (i25 > i9) {
                    break;
                }
                int i28 = i23 + 1;
                int i29 = 0;
                while (i29 < childCount2) {
                    View childAt2 = getChildAt(i29);
                    c cVar3 = (c) childAt2.getLayoutParams();
                    int i30 = i15;
                    long j3 = 1 << i29;
                    if ((j2 & j3) == 0) {
                        if (cVar3.d == i28) {
                            j |= j3;
                        }
                        z2 = z7;
                    } else {
                        if (z7 && cVar3.g && i9 == 1) {
                            int i31 = this.A;
                            z2 = z7;
                            childAt2.setPadding(i31 + i11, 0, i31, 0);
                        } else {
                            z2 = z7;
                        }
                        cVar3.d++;
                        cVar3.h = true;
                        i9--;
                    }
                    i29++;
                    i15 = i30;
                    z7 = z2;
                }
                i13 = i3;
                z8 = true;
            }
            i3 = i13;
            z = z8;
            boolean z10 = !z5 && i12 == 1;
            if (i9 > 0 && j != 0 && (i9 < i12 - 1 || z10 || i14 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z10) {
                    if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                    int i32 = childCount2 - 1;
                    if ((j & (1 << i32)) != 0 && !((c) getChildAt(i32).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                }
                int i33 = bitCount > 0.0f ? (int) ((i9 * i11) / bitCount) : 0;
                for (int i34 = 0; i34 < childCount2; i34++) {
                    if ((j & (1 << i34)) != 0) {
                        View childAt3 = getChildAt(i34);
                        c cVar4 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar4.e = i33;
                            cVar4.h = true;
                            if (i34 == 0 && !cVar4.g) {
                                ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i33) / 2;
                            }
                        } else if (cVar4.f660c) {
                            cVar4.e = i33;
                            cVar4.h = true;
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i33) / 2;
                        } else {
                            if (i34 != 0) {
                                ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i33 / 2;
                            }
                            if (i34 != childCount2 - 1) {
                                ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i33 / 2;
                            }
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                for (int i35 = 0; i35 < childCount2; i35++) {
                    View childAt4 = getChildAt(i35);
                    c cVar5 = (c) childAt4.getLayoutParams();
                    if (cVar5.h) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.d * i11) + cVar5.e, 1073741824), childMeasureSpec);
                    }
                }
            }
            if (mode != 1073741824) {
                i5 = i21;
                i4 = i3;
            } else {
                i4 = i22;
                i5 = i21;
            }
            setMeasuredDimension(i5, i4);
            return;
        }
        for (int i36 = 0; i36 < childCount; i36++) {
            c cVar6 = (c) getChildAt(i36).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar6).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar6).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.u.r = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        a.b.p.c cVar = this.u;
        c.d dVar = cVar.j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            cVar.l = true;
            cVar.k = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.t = z;
    }

    public void setPopupTheme(int i) {
        if (this.s != i) {
            this.s = i;
            if (i == 0) {
                this.r = getContext();
            } else {
                this.r = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(a.b.p.c cVar) {
        this.u = cVar;
        cVar.i = this;
        this.q = cVar.d;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.z = (int) (56.0f * f);
        this.A = (int) (f * 4.0f);
        this.r = context;
        this.s = 0;
    }

    @Override // a.b.p.i0, android.view.ViewGroup
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f201b = 16;
        return cVar;
    }

    @Override // a.b.p.i0, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* loaded from: classes.dex */
    public class d implements g.a {
        public d() {
        }

        @Override // a.b.o.i.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.B;
            if (eVar == null) {
                return false;
            }
            Toolbar.f fVar = Toolbar.this.H;
            return fVar != null ? fVar.onMenuItemClick(menuItem) : false;
        }

        @Override // a.b.o.i.g.a
        public void a(g gVar) {
            g.a aVar = ActionMenuView.this.w;
            if (aVar != null) {
                aVar.a(gVar);
            }
        }
    }

    @Override // a.b.p.i0, android.view.ViewGroup
    public i0.a generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // a.b.p.i0, android.view.ViewGroup
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.f201b <= 0) {
                cVar.f201b = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    @Override // a.b.o.i.g.b
    public boolean a(i iVar) {
        return this.q.a(iVar, (m) null, 0);
    }

    @Override // a.b.o.i.n
    public void a(g gVar) {
        this.q = gVar;
    }
}
