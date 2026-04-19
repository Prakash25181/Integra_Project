package a.b.p;

import a.b.k.g;
import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public class w extends Spinner implements a.e.k.m {
    public static final int[] j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final a.b.p.e f259b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f260c;
    public h0 d;
    public SpinnerAdapter e;
    public final boolean f;
    public f g;
    public int h;
    public final Rect i;

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().a()) {
                w.this.a();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public a.b.k.g f262b;

        /* renamed from: c, reason: collision with root package name */
        public ListAdapter f263c;
        public CharSequence d;

        public b() {
        }

        @Override // a.b.p.w.f
        public boolean a() {
            a.b.k.g gVar = this.f262b;
            if (gVar != null) {
                return gVar.isShowing();
            }
            return false;
        }

        @Override // a.b.p.w.f
        public CharSequence b() {
            return this.d;
        }

        @Override // a.b.p.w.f
        public int c() {
            return 0;
        }

        @Override // a.b.p.w.f
        public void c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.f
        public void dismiss() {
            a.b.k.g gVar = this.f262b;
            if (gVar != null) {
                gVar.dismiss();
                this.f262b = null;
            }
        }

        @Override // a.b.p.w.f
        public int f() {
            return 0;
        }

        @Override // a.b.p.w.f
        public Drawable g() {
            return null;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            w.this.setSelection(i);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick(null, i, this.f263c.getItemId(i));
            }
            a.b.k.g gVar = this.f262b;
            if (gVar != null) {
                gVar.dismiss();
                this.f262b = null;
            }
        }

        @Override // a.b.p.w.f
        public void a(ListAdapter listAdapter) {
            this.f263c = listAdapter;
        }

        @Override // a.b.p.w.f
        public void b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.f
        public void a(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // a.b.p.w.f
        public void a(int i, int i2) {
            if (this.f263c == null) {
                return;
            }
            g.a aVar = new g.a(w.this.getPopupContext());
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                aVar.f13a.f = charSequence;
            }
            ListAdapter listAdapter = this.f263c;
            int selectedItemPosition = w.this.getSelectedItemPosition();
            AlertController.b bVar = aVar.f13a;
            bVar.l = listAdapter;
            bVar.m = this;
            bVar.p = selectedItemPosition;
            bVar.o = true;
            a.b.k.g a2 = aVar.a();
            this.f262b = a2;
            ListView listView = a2.d.g;
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
            }
            this.f262b.show();
        }

        @Override // a.b.p.w.f
        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // a.b.p.w.f
        public void a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b, reason: collision with root package name */
        public SpinnerAdapter f264b;

        /* renamed from: c, reason: collision with root package name */
        public ListAdapter f265c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f264b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f265c = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                        return;
                    }
                    return;
                }
                if (spinnerAdapter instanceof t0) {
                    t0 t0Var = (t0) spinnerAdapter;
                    if (t0Var.getDropDownViewTheme() == null) {
                        t0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f265c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f264b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f265c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f264b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public class d extends k0 implements f {
        public CharSequence G;
        public ListAdapter H;
        public final Rect I;
        public int J;

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                w.this.setSelection(i);
                if (w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    w.this.performItemClick(view, i, dVar.H.getItemId(i));
                }
                d.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                d dVar = d.this;
                w wVar = w.this;
                if (dVar != null) {
                    if (!(a.e.k.n.h(wVar) && wVar.getGlobalVisibleRect(dVar.I))) {
                        d.this.dismiss();
                        return;
                    } else {
                        d.this.h();
                        d.super.e();
                        return;
                    }
                }
                throw null;
            }
        }

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f268b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f268b = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f268b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i, 0);
            this.I = new Rect();
            this.s = w.this;
            a(true);
            this.q = 0;
            this.t = new a(w.this);
        }

        @Override // a.b.p.w.f
        public CharSequence b() {
            return this.G;
        }

        @Override // a.b.p.w.f
        public void c(int i) {
            this.J = i;
        }

        public void h() {
            int i;
            Drawable g = g();
            int i2 = 0;
            if (g != null) {
                g.getPadding(w.this.i);
                i2 = d1.a(w.this) ? w.this.i.right : -w.this.i.left;
            } else {
                Rect rect = w.this.i;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i3 = wVar.h;
            if (i3 == -2) {
                int a2 = wVar.a((SpinnerAdapter) this.H, g());
                int i4 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.i;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a2 > i5) {
                    a2 = i5;
                }
                d(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                d((width - paddingLeft) - paddingRight);
            } else {
                d(i3);
            }
            if (d1.a(w.this)) {
                i = (((width - paddingRight) - this.f) - this.J) + i2;
            } else {
                i = paddingLeft + this.J + i2;
            }
            this.g = i;
        }

        @Override // a.b.p.k0, a.b.p.w.f
        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.H = listAdapter;
        }

        @Override // a.b.p.w.f
        public void a(CharSequence charSequence) {
            this.G = charSequence;
        }

        @Override // a.b.p.w.f
        public void a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            h();
            this.C.setInputMethodMode(2);
            super.e();
            f0 f0Var = this.d;
            f0Var.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                f0Var.setTextDirection(i);
                f0Var.setTextAlignment(i2);
            }
            int selectedItemPosition = w.this.getSelectedItemPosition();
            f0 f0Var2 = this.d;
            if (a() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (a2 || (viewTreeObserver = w.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.C.setOnDismissListener(new c(bVar));
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public boolean f270b;

        /* compiled from: AppCompatSpinner.java */
        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f270b ? (byte) 1 : (byte) 0);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f270b = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(int i);

        void a(int i, int i2);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        boolean a();

        CharSequence b();

        void b(int i);

        int c();

        void c(int i);

        void dismiss();

        int f();

        Drawable g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
    
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.i = r0
            int[] r0 = a.b.j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            a.b.p.e r2 = new a.b.p.e
            r2.<init>(r8)
            r8.f259b = r2
            int r2 = a.b.j.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L28
            a.b.o.c r3 = new a.b.o.c
            r3.<init>(r9, r2)
            r8.f260c = r3
            goto L2a
        L28:
            r8.f260c = r9
        L2a:
            r2 = 0
            r3 = -1
            int[] r4 = a.b.p.w.j     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            boolean r5 = r4.hasValue(r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            if (r5 == 0) goto L52
            int r3 = r4.getInt(r1, r1)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L41
            goto L52
        L3d:
            r9 = move-exception
            r2 = r4
            goto Ld1
        L41:
            r5 = move-exception
            goto L49
        L43:
            r9 = move-exception
            goto Ld1
        L46:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L49:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L55
        L52:
            r4.recycle()
        L55:
            r4 = 1
            if (r3 == 0) goto L95
            if (r3 == r4) goto L5b
            goto La5
        L5b:
            a.b.p.w$d r3 = new a.b.p.w$d
            android.content.Context r5 = r8.f260c
            r3.<init>(r5, r10, r11)
            android.content.Context r5 = r8.f260c
            int[] r6 = a.b.j.Spinner
            a.b.p.x0 r1 = a.b.p.x0.a(r5, r10, r6, r11, r1)
            int r5 = a.b.j.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.d(r5, r6)
            r8.h = r5
            int r5 = a.b.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.b(r5)
            android.widget.PopupWindow r6 = r3.C
            r6.setBackgroundDrawable(r5)
            int r5 = a.b.j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.G = r5
            android.content.res.TypedArray r1 = r1.f275b
            r1.recycle()
            r8.g = r3
            a.b.p.v r1 = new a.b.p.v
            r1.<init>(r8, r8, r3)
            r8.d = r1
            goto La5
        L95:
            a.b.p.w$b r1 = new a.b.p.w$b
            r1.<init>()
            r8.g = r1
            int r3 = a.b.j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r1.a(r3)
        La5:
            int r1 = a.b.j.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto Lbd
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r5, r1)
            int r9 = a.b.g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r9)
            r8.setAdapter(r3)
        Lbd:
            r0.recycle()
            r8.f = r4
            android.widget.SpinnerAdapter r9 = r8.e
            if (r9 == 0) goto Lcb
            r8.setAdapter(r9)
            r8.e = r2
        Lcb:
            a.b.p.e r9 = r8.f259b
            r9.a(r10, r11)
            return
        Ld1:
            if (r2 == 0) goto Ld6
            r2.recycle()
        Ld6:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.w.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        f fVar = this.g;
        if (fVar != null) {
            return fVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        f fVar = this.g;
        if (fVar != null) {
            return fVar.f();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.g != null) {
            return this.h;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public final f getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        f fVar = this.g;
        if (fVar != null) {
            return fVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f260c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        f fVar = this.g;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    @Override // a.e.k.m
    public ColorStateList getSupportBackgroundTintList() {
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    @Override // a.e.k.m
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.g;
        if (fVar == null || !fVar.a()) {
            return;
        }
        this.g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (!eVar.f270b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.g;
        eVar.f270b = fVar != null && fVar.a();
        return eVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.d;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        f fVar = this.g;
        if (fVar != null) {
            if (fVar.a()) {
                return true;
            }
            a();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            eVar.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.c(i);
            this.g.a(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.b(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(a.b.l.a.a.c(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        f fVar = this.g;
        if (fVar != null) {
            fVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    @Override // a.e.k.m
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        a.b.p.e eVar = this.f259b;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f) {
            this.e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f260c;
            if (context == null) {
                context = getContext();
            }
            this.g.a(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.g.a(getTextDirection(), getTextAlignment());
        } else {
            this.g.a(-1, -1);
        }
    }
}
