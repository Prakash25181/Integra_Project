package a.b.o.i;

import a.b.o.i.m;
import a.b.p.l0;
import a.b.p.m0;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: CascadingMenuPopup.java */
/* loaded from: classes.dex */
public final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int C = a.b.g.abc_cascading_menu_item_layout;
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c, reason: collision with root package name */
    public final Context f113c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final Handler h;
    public View p;
    public View q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public boolean x;
    public m.a y;
    public ViewTreeObserver z;
    public final List<g> i = new ArrayList();
    public final List<C0006d> j = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener k = new a();
    public final View.OnAttachStateChangeListener l = new b();
    public final l0 m = new c();
    public int n = 0;
    public int o = 0;
    public boolean w = false;

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.a() || d.this.j.size() <= 0 || d.this.j.get(0).f119a.B) {
                return;
            }
            View view = d.this.q;
            if (view != null && view.isShown()) {
                Iterator<C0006d> it = d.this.j.iterator();
                while (it.hasNext()) {
                    it.next().f119a.e();
                }
                return;
            }
            d.this.dismiss();
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.z = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.z.removeGlobalOnLayoutListener(dVar.k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* loaded from: classes.dex */
    public class c implements l0 {

        /* compiled from: CascadingMenuPopup.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C0006d f117b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuItem f118c;
            public final /* synthetic */ g d;

            public a(C0006d c0006d, MenuItem menuItem, g gVar) {
                this.f117b = c0006d;
                this.f118c = menuItem;
                this.d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0006d c0006d = this.f117b;
                if (c0006d != null) {
                    d.this.B = true;
                    c0006d.f120b.a(false);
                    d.this.B = false;
                }
                if (this.f118c.isEnabled() && this.f118c.hasSubMenu()) {
                    this.d.a(this.f118c, 4);
                }
            }
        }

        public c() {
        }

        @Override // a.b.p.l0
        public void a(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(null);
            int size = d.this.j.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.j.get(i).f120b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            d.this.h.postAtTime(new a(i2 < d.this.j.size() ? d.this.j.get(i2) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // a.b.p.l0
        public void b(g gVar, MenuItem menuItem) {
            d.this.h.removeCallbacksAndMessages(gVar);
        }
    }

    /* compiled from: CascadingMenuPopup.java */
    /* renamed from: a.b.o.i.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0006d {

        /* renamed from: a, reason: collision with root package name */
        public final m0 f119a;

        /* renamed from: b, reason: collision with root package name */
        public final g f120b;

        /* renamed from: c, reason: collision with root package name */
        public final int f121c;

        public C0006d(m0 m0Var, g gVar, int i) {
            this.f119a = m0Var;
            this.f120b = gVar;
            this.f121c = i;
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f113c = context;
        this.p = view;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.r = a.e.k.n.c(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.b.d.abc_config_prefDialogWidth));
        this.h = new Handler();
    }

    @Override // a.b.o.i.k
    public void a(g gVar) {
        gVar.a(this, this.f113c);
        if (a()) {
            c(gVar);
        } else {
            this.i.add(gVar);
        }
    }

    @Override // a.b.o.i.k
    public void b(boolean z) {
        this.w = z;
    }

    @Override // a.b.o.i.m
    public boolean b() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(a.b.o.i.g r17) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.d.c(a.b.o.i.g):void");
    }

    @Override // a.b.o.i.k
    public boolean c() {
        return false;
    }

    @Override // a.b.o.i.p
    public ListView d() {
        if (this.j.isEmpty()) {
            return null;
        }
        return this.j.get(r0.size() - 1).f119a.d;
    }

    @Override // a.b.o.i.p
    public void dismiss() {
        int size = this.j.size();
        if (size > 0) {
            C0006d[] c0006dArr = (C0006d[]) this.j.toArray(new C0006d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0006d c0006d = c0006dArr[i];
                if (c0006d.f119a.a()) {
                    c0006d.f119a.dismiss();
                }
            }
        }
    }

    @Override // a.b.o.i.p
    public void e() {
        if (a()) {
            return;
        }
        Iterator<g> it = this.i.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
        this.i.clear();
        View view = this.p;
        this.q = view;
        if (view != null) {
            boolean z = this.z == null;
            ViewTreeObserver viewTreeObserver = this.q.getViewTreeObserver();
            this.z = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.k);
            }
            this.q.addOnAttachStateChangeListener(this.l);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0006d c0006d;
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0006d = null;
                break;
            }
            c0006d = this.j.get(i);
            if (!c0006d.f119a.a()) {
                break;
            } else {
                i++;
            }
        }
        if (c0006d != null) {
            c0006d.f120b.a(false);
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

    @Override // a.b.o.i.k
    public void b(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // a.b.o.i.p
    public boolean a() {
        return this.j.size() > 0 && this.j.get(0).f119a.a();
    }

    @Override // a.b.o.i.m
    public void a(boolean z) {
        Iterator<C0006d> it = this.j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = it.next().f119a.d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((f) adapter).notifyDataSetChanged();
        }
    }

    @Override // a.b.o.i.m
    public void a(m.a aVar) {
        this.y = aVar;
    }

    @Override // a.b.o.i.m
    public boolean a(r rVar) {
        for (C0006d c0006d : this.j) {
            if (rVar == c0006d.f120b) {
                c0006d.f119a.d.requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        rVar.a(this, this.f113c);
        if (a()) {
            c(rVar);
        } else {
            this.i.add(rVar);
        }
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(rVar);
        }
        return true;
    }

    @Override // a.b.o.i.m
    public void a(g gVar, boolean z) {
        int size = this.j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (gVar == this.j.get(i).f120b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.j.size()) {
            this.j.get(i2).f120b.a(false);
        }
        C0006d remove = this.j.remove(i);
        remove.f120b.a(this);
        if (this.B) {
            m0 m0Var = remove.f119a;
            if (m0Var != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    m0Var.C.setExitTransition(null);
                }
                remove.f119a.C.setAnimationStyle(0);
            } else {
                throw null;
            }
        }
        remove.f119a.dismiss();
        int size2 = this.j.size();
        if (size2 > 0) {
            this.r = this.j.get(size2 - 1).f121c;
        } else {
            this.r = a.e.k.n.c(this.p) == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                this.j.get(0).f120b.a(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.z.removeGlobalOnLayoutListener(this.k);
            }
            this.z = null;
        }
        this.q.removeOnAttachStateChangeListener(this.l);
        this.A.onDismiss();
    }

    @Override // a.b.o.i.k
    public void a(int i) {
        if (this.n != i) {
            this.n = i;
            this.o = a.b.k.r.a(i, a.e.k.n.c(this.p));
        }
    }

    @Override // a.b.o.i.k
    public void a(View view) {
        if (this.p != view) {
            this.p = view;
            this.o = a.b.k.r.a(this.n, a.e.k.n.c(view));
        }
    }

    @Override // a.b.o.i.k
    public void a(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    @Override // a.b.o.i.k
    public void c(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // a.b.o.i.k
    public void c(boolean z) {
        this.x = z;
    }
}
