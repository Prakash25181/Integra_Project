package a.b.k;

import a.b.k.a;
import a.b.o.a;
import a.b.o.i.g;
import a.b.p.d0;
import a.b.p.q0;
import a.e.k.v;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: WindowDecorActionBar.java */
/* loaded from: classes.dex */
public class u extends a.b.k.a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new AccelerateInterpolator();
    public static final Interpolator B = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f53a;

    /* renamed from: b, reason: collision with root package name */
    public Context f54b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f55c;
    public ActionBarContainer d;
    public d0 e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public a.b.o.a j;
    public a.InterfaceC0005a k;
    public boolean l;
    public ArrayList<a.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public a.b.o.g u;
    public boolean v;
    public boolean w;
    public final a.e.k.t x;
    public final a.e.k.t y;
    public final v z;

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class a extends a.e.k.u {
        public a() {
        }

        @Override // a.e.k.t
        public void a(View view) {
            View view2;
            u uVar = u.this;
            if (uVar.p && (view2 = uVar.g) != null) {
                view2.setTranslationY(0.0f);
                u.this.d.setTranslationY(0.0f);
            }
            u.this.d.setVisibility(8);
            u.this.d.setTransitioning(false);
            u uVar2 = u.this;
            uVar2.u = null;
            a.InterfaceC0005a interfaceC0005a = uVar2.k;
            if (interfaceC0005a != null) {
                interfaceC0005a.a(uVar2.j);
                uVar2.j = null;
                uVar2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = u.this.f55c;
            if (actionBarOverlayLayout != null) {
                a.e.k.n.l(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class b extends a.e.k.u {
        public b() {
        }

        @Override // a.e.k.t
        public void a(View view) {
            u uVar = u.this;
            uVar.u = null;
            uVar.d.requestLayout();
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class c implements v {
        public c() {
        }
    }

    /* compiled from: WindowDecorActionBar.java */
    /* loaded from: classes.dex */
    public class d extends a.b.o.a implements g.a {
        public final Context d;
        public final a.b.o.i.g e;
        public a.InterfaceC0005a f;
        public WeakReference<View> g;

        public d(Context context, a.InterfaceC0005a interfaceC0005a) {
            this.d = context;
            this.f = interfaceC0005a;
            a.b.o.i.g gVar = new a.b.o.i.g(context);
            gVar.l = 1;
            this.e = gVar;
            gVar.e = this;
        }

        @Override // a.b.o.a
        public void a(boolean z) {
            this.f80c = z;
            u.this.f.setTitleOptional(z);
        }

        @Override // a.b.o.a
        public void b(CharSequence charSequence) {
            u.this.f.setTitle(charSequence);
        }

        @Override // a.b.o.a
        public Menu c() {
            return this.e;
        }

        @Override // a.b.o.a
        public MenuInflater d() {
            return new a.b.o.f(this.d);
        }

        @Override // a.b.o.a
        public CharSequence e() {
            return u.this.f.getSubtitle();
        }

        @Override // a.b.o.a
        public CharSequence f() {
            return u.this.f.getTitle();
        }

        @Override // a.b.o.a
        public void g() {
            if (u.this.i != this) {
                return;
            }
            this.e.j();
            try {
                this.f.a(this, this.e);
            } finally {
                this.e.i();
            }
        }

        @Override // a.b.o.a
        public boolean h() {
            return u.this.f.s;
        }

        @Override // a.b.o.a
        public void b(int i) {
            u.this.f.setTitle(u.this.f53a.getResources().getString(i));
        }

        @Override // a.b.o.a
        public void a() {
            u uVar = u.this;
            if (uVar.i != this) {
                return;
            }
            if (!((uVar.q || uVar.r) ? false : true)) {
                u uVar2 = u.this;
                uVar2.j = this;
                uVar2.k = this.f;
            } else {
                this.f.a(this);
            }
            this.f = null;
            u.this.e(false);
            ActionBarContextView actionBarContextView = u.this.f;
            if (actionBarContextView.l == null) {
                actionBarContextView.b();
            }
            u.this.e.k().sendAccessibilityEvent(32);
            u uVar3 = u.this;
            uVar3.f55c.setHideOnContentScrollEnabled(uVar3.w);
            u.this.i = null;
        }

        @Override // a.b.o.a
        public View b() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.b.o.a
        public void a(View view) {
            u.this.f.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // a.b.o.a
        public void a(CharSequence charSequence) {
            u.this.f.setSubtitle(charSequence);
        }

        @Override // a.b.o.a
        public void a(int i) {
            u.this.f.setSubtitle(u.this.f53a.getResources().getString(i));
        }

        @Override // a.b.o.i.g.a
        public boolean a(a.b.o.i.g gVar, MenuItem menuItem) {
            a.InterfaceC0005a interfaceC0005a = this.f;
            if (interfaceC0005a != null) {
                return interfaceC0005a.a(this, menuItem);
            }
            return false;
        }

        @Override // a.b.o.i.g.a
        public void a(a.b.o.i.g gVar) {
            if (this.f == null) {
                return;
            }
            g();
            a.b.p.c cVar = u.this.f.e;
            if (cVar != null) {
                cVar.f();
            }
        }
    }

    public u(Activity activity, boolean z) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new a();
        this.y = new b();
        this.z = new c();
        View decorView = activity.getWindow().getDecorView();
        a(decorView);
        if (z) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public final void a(View view) {
        d0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.b.f.decor_content_parent);
        this.f55c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(a.b.f.action_bar);
        if (findViewById instanceof d0) {
            wrapper = (d0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a2 = b.a.a.a.a.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(a.b.f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.b.f.action_bar_container);
        this.d = actionBarContainer;
        d0 d0Var = this.e;
        if (d0Var != null && this.f != null && actionBarContainer != null) {
            this.f53a = d0Var.m();
            boolean z = (this.e.h() & 4) != 0;
            if (z) {
                this.h = true;
            }
            Context context = this.f53a;
            this.e.a((context.getApplicationInfo().targetSdkVersion < 14) || z);
            f(context.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f53a.obtainStyledAttributes(null, a.b.j.ActionBar, a.b.a.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(a.b.j.ActionBar_hideOnContentScroll, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f55c;
                if (actionBarOverlayLayout2.i) {
                    this.w = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(a.b.j.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                a.e.k.n.a(this.d, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(u.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    @Override // a.b.k.a
    public int b() {
        return this.e.h();
    }

    @Override // a.b.k.a
    public void c(boolean z) {
        int i = z ? 4 : 0;
        int h = this.e.h();
        this.h = true;
        this.e.c((i & 4) | ((-5) & h));
    }

    @Override // a.b.k.a
    public void d(boolean z) {
        a.b.o.g gVar;
        this.v = z;
        if (z || (gVar = this.u) == null) {
            return;
        }
        gVar.a();
    }

    @Override // a.b.k.a
    public void e() {
        if (this.q) {
            this.q = false;
            g(false);
        }
    }

    public final void f(boolean z) {
        this.n = z;
        if (!z) {
            this.e.a((q0) null);
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.a((q0) null);
        }
        boolean z2 = this.e.n() == 2;
        this.e.b(!this.n && z2);
        this.f55c.setHasNonEmbeddedTabs(!this.n && z2);
    }

    public final void g(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.s || !(this.q || this.r)) {
            if (this.t) {
                return;
            }
            this.t = true;
            a.b.o.g gVar = this.u;
            if (gVar != null) {
                gVar.a();
            }
            this.d.setVisibility(0);
            if (this.o == 0 && (this.v || z)) {
                this.d.setTranslationY(0.0f);
                float f = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f -= r9[1];
                }
                this.d.setTranslationY(f);
                a.b.o.g gVar2 = new a.b.o.g();
                a.e.k.s a2 = a.e.k.n.a(this.d);
                a2.b(0.0f);
                a2.a(this.z);
                if (!gVar2.e) {
                    gVar2.f98a.add(a2);
                }
                if (this.p && (view3 = this.g) != null) {
                    view3.setTranslationY(f);
                    a.e.k.s a3 = a.e.k.n.a(this.g);
                    a3.b(0.0f);
                    if (!gVar2.e) {
                        gVar2.f98a.add(a3);
                    }
                }
                Interpolator interpolator = B;
                if (!gVar2.e) {
                    gVar2.f100c = interpolator;
                }
                if (!gVar2.e) {
                    gVar2.f99b = 250L;
                }
                a.e.k.t tVar = this.y;
                if (!gVar2.e) {
                    gVar2.d = tVar;
                }
                this.u = gVar2;
                gVar2.b();
            } else {
                this.d.setAlpha(1.0f);
                this.d.setTranslationY(0.0f);
                if (this.p && (view2 = this.g) != null) {
                    view2.setTranslationY(0.0f);
                }
                this.y.a(null);
            }
            ActionBarOverlayLayout actionBarOverlayLayout = this.f55c;
            if (actionBarOverlayLayout != null) {
                a.e.k.n.l(actionBarOverlayLayout);
                return;
            }
            return;
        }
        if (this.t) {
            this.t = false;
            a.b.o.g gVar3 = this.u;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.o == 0 && (this.v || z)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                a.b.o.g gVar4 = new a.b.o.g();
                float f2 = -this.d.getHeight();
                if (z) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r9[1];
                }
                a.e.k.s a4 = a.e.k.n.a(this.d);
                a4.b(f2);
                a4.a(this.z);
                if (!gVar4.e) {
                    gVar4.f98a.add(a4);
                }
                if (this.p && (view = this.g) != null) {
                    a.e.k.s a5 = a.e.k.n.a(view);
                    a5.b(f2);
                    if (!gVar4.e) {
                        gVar4.f98a.add(a5);
                    }
                }
                Interpolator interpolator2 = A;
                if (!gVar4.e) {
                    gVar4.f100c = interpolator2;
                }
                if (!gVar4.e) {
                    gVar4.f99b = 250L;
                }
                a.e.k.t tVar2 = this.x;
                if (!gVar4.e) {
                    gVar4.d = tVar2;
                }
                this.u = gVar4;
                gVar4.b();
                return;
            }
            this.x.a(null);
        }
    }

    @Override // a.b.k.a
    public void b(boolean z) {
        if (this.h) {
            return;
        }
        c(z);
    }

    @Override // a.b.k.a
    public Context c() {
        if (this.f54b == null) {
            TypedValue typedValue = new TypedValue();
            this.f53a.getTheme().resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f54b = new ContextThemeWrapper(this.f53a, i);
            } else {
                this.f54b = this.f53a;
            }
        }
        return this.f54b;
    }

    @Override // a.b.k.a
    public void d() {
        if (this.q) {
            return;
        }
        this.q = true;
        g(false);
    }

    public void e(boolean z) {
        a.e.k.s a2;
        a.e.k.s a3;
        if (z) {
            if (!this.s) {
                this.s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f55c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.s) {
            this.s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f55c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        if (!a.e.k.n.i(this.d)) {
            if (z) {
                this.e.a(4);
                this.f.setVisibility(0);
                return;
            } else {
                this.e.a(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z) {
            a3 = this.e.a(4, 100L);
            a2 = this.f.a(0, 200L);
        } else {
            a2 = this.e.a(0, 200L);
            a3 = this.f.a(8, 100L);
        }
        a.b.o.g gVar = new a.b.o.g();
        gVar.f98a.add(a3);
        View view = a3.f448a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = a2.f448a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        gVar.f98a.add(a2);
        gVar.b();
    }

    public u(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.t = true;
        this.x = new a();
        this.y = new b();
        this.z = new c();
        a(dialog.getWindow().getDecorView());
    }

    @Override // a.b.k.a
    public void a(Configuration configuration) {
        f(this.f53a.getResources().getBoolean(a.b.b.abc_action_bar_embed_tabs));
    }

    @Override // a.b.k.a
    public void a(boolean z) {
        if (z == this.l) {
            return;
        }
        this.l = z;
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i).a(z);
        }
    }

    @Override // a.b.k.a
    public void a(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // a.b.k.a
    public a.b.o.a a(a.InterfaceC0005a interfaceC0005a) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a();
        }
        this.f55c.setHideOnContentScrollEnabled(false);
        this.f.b();
        d dVar2 = new d(this.f.getContext(), interfaceC0005a);
        dVar2.e.j();
        try {
            if (!dVar2.f.b(dVar2, dVar2.e)) {
                return null;
            }
            this.i = dVar2;
            dVar2.g();
            this.f.a(dVar2);
            e(true);
            this.f.sendAccessibilityEvent(32);
            return dVar2;
        } finally {
            dVar2.e.i();
        }
    }

    @Override // a.b.k.a
    public boolean a() {
        d0 d0Var = this.e;
        if (d0Var == null || !d0Var.j()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // a.b.k.a
    public boolean a(int i, KeyEvent keyEvent) {
        a.b.o.i.g gVar;
        d dVar = this.i;
        if (dVar == null || (gVar = dVar.e) == null) {
            return false;
        }
        gVar.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return gVar.performShortcut(i, keyEvent, 0);
    }
}
