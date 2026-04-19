package a.b.p;

import a.b.o.i.m;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class z0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f289a;

    /* renamed from: b, reason: collision with root package name */
    public int f290b;

    /* renamed from: c, reason: collision with root package name */
    public View f291c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public c n;
    public int o;
    public int p;
    public Drawable q;

    /* compiled from: ToolbarWidgetWrapper.java */
    /* loaded from: classes.dex */
    public class a extends a.e.k.u {

        /* renamed from: a, reason: collision with root package name */
        public boolean f292a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f293b;

        public a(int i) {
            this.f293b = i;
        }

        @Override // a.e.k.t
        public void a(View view) {
            if (this.f292a) {
                return;
            }
            z0.this.f289a.setVisibility(this.f293b);
        }

        @Override // a.e.k.u, a.e.k.t
        public void b(View view) {
            z0.this.f289a.setVisibility(0);
        }

        @Override // a.e.k.u, a.e.k.t
        public void c(View view) {
            this.f292a = true;
        }
    }

    public z0(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = a.b.h.abc_action_bar_up_description;
        this.o = 0;
        this.p = 0;
        this.f289a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        x0 a2 = x0.a(toolbar.getContext(), null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
        this.q = a2.b(a.b.j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a2.e(a.b.j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                this.h = true;
                this.i = e;
                if ((this.f290b & 8) != 0) {
                    this.f289a.setTitle(e);
                }
            }
            CharSequence e2 = a2.e(a.b.j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                this.j = e2;
                if ((this.f290b & 8) != 0) {
                    this.f289a.setSubtitle(e2);
                }
            }
            Drawable b2 = a2.b(a.b.j.ActionBar_logo);
            if (b2 != null) {
                this.f = b2;
                q();
            }
            Drawable b3 = a2.b(a.b.j.ActionBar_icon);
            if (b3 != null) {
                this.e = b3;
                q();
            }
            if (this.g == null && (drawable = this.q) != null) {
                this.g = drawable;
                p();
            }
            c(a2.c(a.b.j.ActionBar_displayOptions, 0));
            int e3 = a2.e(a.b.j.ActionBar_customNavigationLayout, 0);
            if (e3 != 0) {
                View inflate = LayoutInflater.from(this.f289a.getContext()).inflate(e3, (ViewGroup) this.f289a, false);
                View view = this.d;
                if (view != null && (this.f290b & 16) != 0) {
                    this.f289a.removeView(view);
                }
                this.d = inflate;
                if (inflate != null && (this.f290b & 16) != 0) {
                    this.f289a.addView(inflate);
                }
                c(this.f290b | 16);
            }
            int d = a2.d(a.b.j.ActionBar_height, 0);
            if (d > 0) {
                ViewGroup.LayoutParams layoutParams = this.f289a.getLayoutParams();
                layoutParams.height = d;
                this.f289a.setLayoutParams(layoutParams);
            }
            int a3 = a2.a(a.b.j.ActionBar_contentInsetStart, -1);
            int a4 = a2.a(a.b.j.ActionBar_contentInsetEnd, -1);
            if (a3 >= 0 || a4 >= 0) {
                Toolbar toolbar2 = this.f289a;
                int max = Math.max(a3, 0);
                int max2 = Math.max(a4, 0);
                toolbar2.b();
                toolbar2.u.a(max, max2);
            }
            int e4 = a2.e(a.b.j.ActionBar_titleTextStyle, 0);
            if (e4 != 0) {
                Toolbar toolbar3 = this.f289a;
                Context context = toolbar3.getContext();
                toolbar3.m = e4;
                TextView textView = toolbar3.f687c;
                if (textView != null) {
                    textView.setTextAppearance(context, e4);
                }
            }
            int e5 = a2.e(a.b.j.ActionBar_subtitleTextStyle, 0);
            if (e5 != 0) {
                Toolbar toolbar4 = this.f289a;
                Context context2 = toolbar4.getContext();
                toolbar4.n = e5;
                TextView textView2 = toolbar4.d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, e5);
                }
            }
            int e6 = a2.e(a.b.j.ActionBar_popupTheme, 0);
            if (e6 != 0) {
                this.f289a.setPopupTheme(e6);
            }
        } else {
            if (this.f289a.getNavigationIcon() != null) {
                i = 15;
                this.q = this.f289a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f290b = i;
        }
        a2.f275b.recycle();
        if (i2 != this.p) {
            this.p = i2;
            if (TextUtils.isEmpty(this.f289a.getNavigationContentDescription())) {
                int i3 = this.p;
                this.k = i3 != 0 ? m().getString(i3) : null;
                o();
            }
        }
        this.k = this.f289a.getNavigationContentDescription();
        this.f289a.setNavigationOnClickListener(new y0(this));
    }

    @Override // a.b.p.d0
    public void a(boolean z) {
    }

    @Override // a.b.p.d0
    public boolean a() {
        return this.f289a.g();
    }

    @Override // a.b.p.d0
    public void b(int i) {
        this.f = i != 0 ? a.b.l.a.a.c(m(), i) : null;
        q();
    }

    @Override // a.b.p.d0
    public void c() {
        this.m = true;
    }

    @Override // a.b.p.d0
    public void collapseActionView() {
        Toolbar.d dVar = this.f289a.L;
        a.b.o.i.i iVar = dVar == null ? null : dVar.f692c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    @Override // a.b.p.d0
    public boolean d() {
        return this.f289a.f();
    }

    @Override // a.b.p.d0
    public boolean e() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f289a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f686b) != null && actionMenuView.t;
    }

    @Override // a.b.p.d0
    public boolean f() {
        ActionMenuView actionMenuView = this.f289a.f686b;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.u;
        return cVar != null && cVar.c();
    }

    @Override // a.b.p.d0
    public void g() {
        c cVar;
        ActionMenuView actionMenuView = this.f289a.f686b;
        if (actionMenuView == null || (cVar = actionMenuView.u) == null) {
            return;
        }
        cVar.a();
    }

    @Override // a.b.p.d0
    public CharSequence getTitle() {
        return this.f289a.getTitle();
    }

    @Override // a.b.p.d0
    public int h() {
        return this.f290b;
    }

    @Override // a.b.p.d0
    public void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.p.d0
    public boolean j() {
        Toolbar.d dVar = this.f289a.L;
        return (dVar == null || dVar.f692c == null) ? false : true;
    }

    @Override // a.b.p.d0
    public ViewGroup k() {
        return this.f289a;
    }

    @Override // a.b.p.d0
    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // a.b.p.d0
    public Context m() {
        return this.f289a.getContext();
    }

    @Override // a.b.p.d0
    public int n() {
        return this.o;
    }

    public final void o() {
        if ((this.f290b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f289a.setNavigationContentDescription(this.p);
            } else {
                this.f289a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void p() {
        if ((this.f290b & 4) != 0) {
            Toolbar toolbar = this.f289a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f289a.setNavigationIcon((Drawable) null);
    }

    public final void q() {
        Drawable drawable;
        int i = this.f290b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f;
            if (drawable == null) {
                drawable = this.e;
            }
        } else {
            drawable = this.e;
        }
        this.f289a.setLogo(drawable);
    }

    @Override // a.b.p.d0
    public void setIcon(int i) {
        this.e = i != 0 ? a.b.l.a.a.c(m(), i) : null;
        q();
    }

    @Override // a.b.p.d0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // a.b.p.d0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        this.i = charSequence;
        if ((this.f290b & 8) != 0) {
            this.f289a.setTitle(charSequence);
        }
    }

    @Override // a.b.p.d0
    public void a(Menu menu, m.a aVar) {
        a.b.o.i.i iVar;
        if (this.n == null) {
            this.n = new c(this.f289a.getContext());
        }
        c cVar = this.n;
        cVar.f = aVar;
        Toolbar toolbar = this.f289a;
        a.b.o.i.g gVar = (a.b.o.i.g) menu;
        if (gVar == null && toolbar.f686b == null) {
            return;
        }
        toolbar.d();
        a.b.o.i.g gVar2 = toolbar.f686b.q;
        if (gVar2 == gVar) {
            return;
        }
        if (gVar2 != null) {
            gVar2.a(toolbar.K);
            gVar2.a(toolbar.L);
        }
        if (toolbar.L == null) {
            toolbar.L = new Toolbar.d();
        }
        cVar.r = true;
        if (gVar != null) {
            gVar.a(cVar, toolbar.k);
            gVar.a(toolbar.L, toolbar.k);
        } else {
            cVar.a(toolbar.k, (a.b.o.i.g) null);
            Toolbar.d dVar = toolbar.L;
            a.b.o.i.g gVar3 = dVar.f691b;
            if (gVar3 != null && (iVar = dVar.f692c) != null) {
                gVar3.a(iVar);
            }
            dVar.f691b = null;
            cVar.a(true);
            toolbar.L.a(true);
        }
        toolbar.f686b.setPopupTheme(toolbar.l);
        toolbar.f686b.setPresenter(cVar);
        toolbar.K = cVar;
    }

    @Override // a.b.p.d0
    public void c(int i) {
        View view;
        int i2 = this.f290b ^ i;
        this.f290b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    o();
                }
                p();
            }
            if ((i2 & 3) != 0) {
                q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f289a.setTitle(this.i);
                    this.f289a.setSubtitle(this.j);
                } else {
                    this.f289a.setTitle((CharSequence) null);
                    this.f289a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f289a.addView(view);
            } else {
                this.f289a.removeView(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // a.b.p.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f289a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f686b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L22
            a.b.p.c r0 = r0.u
            if (r0 == 0) goto L1e
            a.b.p.c$c r3 = r0.w
            if (r3 != 0) goto L19
            boolean r0 = r0.e()
            if (r0 == 0) goto L17
            goto L19
        L17:
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            if (r0 == 0) goto L22
            r1 = 1
        L22:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.z0.b():boolean");
    }

    @Override // a.b.p.d0
    public void setIcon(Drawable drawable) {
        this.e = drawable;
        q();
    }

    @Override // a.b.p.d0
    public void b(boolean z) {
        this.f289a.setCollapsible(z);
    }

    @Override // a.b.p.d0
    public void a(q0 q0Var) {
        View view = this.f291c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f289a;
            if (parent == toolbar) {
                toolbar.removeView(this.f291c);
            }
        }
        this.f291c = q0Var;
        if (q0Var == null || this.o != 2) {
            return;
        }
        this.f289a.addView(q0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f291c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f2a = 8388691;
        q0Var.setAllowCollapse(true);
    }

    @Override // a.b.p.d0
    public a.e.k.s a(int i, long j) {
        a.e.k.s a2 = a.e.k.n.a(this.f289a);
        a2.a(i == 0 ? 1.0f : 0.0f);
        a2.a(j);
        a2.a(new a(i));
        return a2;
    }

    @Override // a.b.p.d0
    public void a(int i) {
        this.f289a.setVisibility(i);
    }
}
