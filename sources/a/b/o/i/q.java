package a.b.o.i;

import a.b.o.i.m;
import a.b.p.m0;
import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.PopupWindow;

/* compiled from: StandardMenuPopup.java */
/* loaded from: classes.dex */
public final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {
    public static final int w = a.b.g.abc_popup_menu_item_layout;

    /* renamed from: c, reason: collision with root package name */
    public final Context f149c;
    public final g d;
    public final f e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final m0 j;
    public PopupWindow.OnDismissListener m;
    public View n;
    public View o;
    public m.a p;
    public ViewTreeObserver q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean v;
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public int u = 0;

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (q.this.a()) {
                q qVar = q.this;
                if (qVar.j.B) {
                    return;
                }
                View view = qVar.o;
                if (view != null && view.isShown()) {
                    q.this.j.e();
                } else {
                    q.this.dismiss();
                }
            }
        }
    }

    /* compiled from: StandardMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.q = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.q.removeGlobalOnLayoutListener(qVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i, int i2, boolean z) {
        this.f149c = context;
        this.d = gVar;
        this.f = z;
        this.e = new f(gVar, LayoutInflater.from(context), this.f, w);
        this.h = i;
        this.i = i2;
        Resources resources = context.getResources();
        this.g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.abc_config_prefDialogWidth));
        this.n = view;
        this.j = new m0(this.f149c, null, this.h, this.i);
        gVar.a(this, context);
    }

    @Override // a.b.o.i.k
    public void a(int i) {
        this.u = i;
    }

    @Override // a.b.o.i.k
    public void a(g gVar) {
    }

    @Override // a.b.o.i.k
    public void b(boolean z) {
        this.e.d = z;
    }

    @Override // a.b.o.i.m
    public boolean b() {
        return false;
    }

    @Override // a.b.o.i.k
    public void c(int i) {
        m0 m0Var = this.j;
        m0Var.h = i;
        m0Var.j = true;
    }

    @Override // a.b.o.i.p
    public ListView d() {
        return this.j.d;
    }

    @Override // a.b.o.i.p
    public void dismiss() {
        if (a()) {
            this.j.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c9  */
    @Override // a.b.o.i.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lb
        L8:
            r1 = 1
            goto Lc6
        Lb:
            boolean r0 = r7.r
            if (r0 != 0) goto Lc6
            android.view.View r0 = r7.n
            if (r0 != 0) goto L15
            goto Lc6
        L15:
            r7.o = r0
            a.b.p.m0 r0 = r7.j
            android.widget.PopupWindow r0 = r0.C
            r0.setOnDismissListener(r7)
            a.b.p.m0 r0 = r7.j
            r0.t = r7
            r0.a(r2)
            android.view.View r0 = r7.o
            android.view.ViewTreeObserver r3 = r7.q
            if (r3 != 0) goto L2d
            r3 = 1
            goto L2e
        L2d:
            r3 = 0
        L2e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.q = r4
            if (r3 == 0) goto L3b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.k
            r4.addOnGlobalLayoutListener(r3)
        L3b:
            android.view.View$OnAttachStateChangeListener r3 = r7.l
            r0.addOnAttachStateChangeListener(r3)
            a.b.p.m0 r3 = r7.j
            r3.s = r0
            int r0 = r7.u
            r3.m = r0
            boolean r0 = r7.s
            r3 = 0
            if (r0 != 0) goto L5b
            a.b.o.i.f r0 = r7.e
            android.content.Context r4 = r7.f149c
            int r5 = r7.g
            int r0 = a.b.o.i.k.a(r0, r3, r4, r5)
            r7.t = r0
            r7.s = r2
        L5b:
            a.b.p.m0 r0 = r7.j
            int r4 = r7.t
            r0.d(r4)
            a.b.p.m0 r0 = r7.j
            r4 = 2
            android.widget.PopupWindow r0 = r0.C
            r0.setInputMethodMode(r4)
            a.b.p.m0 r0 = r7.j
            android.graphics.Rect r4 = r7.f144b
            if (r0 == 0) goto Lc5
            if (r4 == 0) goto L78
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L79
        L78:
            r5 = r3
        L79:
            r0.A = r5
            a.b.p.m0 r0 = r7.j
            r0.e()
            a.b.p.m0 r0 = r7.j
            a.b.p.f0 r0 = r0.d
            r0.setOnKeyListener(r7)
            boolean r4 = r7.v
            if (r4 == 0) goto Lb7
            a.b.o.i.g r4 = r7.d
            java.lang.CharSequence r4 = r4.m
            if (r4 == 0) goto Lb7
            android.content.Context r4 = r7.f149c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = a.b.g.abc_popup_menu_header_item_layout
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto Lb1
            a.b.o.i.g r6 = r7.d
            java.lang.CharSequence r6 = r6.m
            r5.setText(r6)
        Lb1:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        Lb7:
            a.b.p.m0 r0 = r7.j
            a.b.o.i.f r1 = r7.e
            r0.a(r1)
            a.b.p.m0 r0 = r7.j
            r0.e()
            goto L8
        Lc5:
            throw r3
        Lc6:
            if (r1 == 0) goto Lc9
            return
        Lc9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            goto Ld2
        Ld1:
            throw r0
        Ld2:
            goto Ld1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.q.e():void");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.r = true;
        this.d.a(true);
        ViewTreeObserver viewTreeObserver = this.q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.q = this.o.getViewTreeObserver();
            }
            this.q.removeGlobalOnLayoutListener(this.k);
            this.q = null;
        }
        this.o.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // a.b.o.i.p
    public boolean a() {
        return !this.r && this.j.a();
    }

    @Override // a.b.o.i.m
    public void a(boolean z) {
        this.s = false;
        f fVar = this.e;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.o.i.k
    public void b(int i) {
        this.j.g = i;
    }

    @Override // a.b.o.i.k
    public void c(boolean z) {
        this.v = z;
    }

    @Override // a.b.o.i.m
    public void a(m.a aVar) {
        this.p = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    @Override // a.b.o.i.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(a.b.o.i.r r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L76
            a.b.o.i.l r0 = new a.b.o.i.l
            android.content.Context r3 = r9.f149c
            android.view.View r5 = r9.o
            boolean r6 = r9.f
            int r7 = r9.h
            int r8 = r9.i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            a.b.o.i.m$a r2 = r9.p
            r0.a(r2)
            boolean r2 = a.b.o.i.k.b(r10)
            r0.h = r2
            a.b.o.i.k r3 = r0.j
            if (r3 == 0) goto L2a
            r3.b(r2)
        L2a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.m
            r0.k = r2
            r2 = 0
            r9.m = r2
            a.b.o.i.g r2 = r9.d
            r2.a(r1)
            a.b.p.m0 r2 = r9.j
            int r3 = r2.g
            boolean r4 = r2.j
            if (r4 != 0) goto L40
            r2 = 0
            goto L42
        L40:
            int r2 = r2.h
        L42:
            int r4 = r9.u
            android.view.View r5 = r9.n
            int r5 = a.e.k.n.c(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L5a
            android.view.View r4 = r9.n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L5a:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L62
            goto L6b
        L62:
            android.view.View r4 = r0.f
            if (r4 != 0) goto L68
            r0 = 0
            goto L6c
        L68:
            r0.a(r3, r2, r5, r5)
        L6b:
            r0 = 1
        L6c:
            if (r0 == 0) goto L76
            a.b.o.i.m$a r0 = r9.p
            if (r0 == 0) goto L75
            r0.a(r10)
        L75:
            return r5
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.q.a(a.b.o.i.r):boolean");
    }

    @Override // a.b.o.i.m
    public void a(g gVar, boolean z) {
        if (gVar != this.d) {
            return;
        }
        dismiss();
        m.a aVar = this.p;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    @Override // a.b.o.i.k
    public void a(View view) {
        this.n = view;
    }

    @Override // a.b.o.i.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }
}
