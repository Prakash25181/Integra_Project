package b.b.a.a.f.k0.v;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.b.a.a.b.o.r;
import b.b.a.a.b.p.d;
import b.b.a.a.b.u.c;
import b.b.a.a.c.d;
import b.b.a.a.f.c;
import b.b.a.a.f.g0;
import b.b.a.a.f.k0.g;
import b.b.a.a.f.k0.v.e;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.upnp.UpnpControl;
import java.util.Stack;

/* compiled from: UpnpSelectorControlPage.java */
/* loaded from: classes.dex */
public class p extends b.b.a.a.f.k0.g implements d.k, e.a, c.a {
    public b.b.a.a.b.p.d e;
    public b.b.a.a.b.u.c f;
    public g0 g;
    public e h;

    /* compiled from: UpnpSelectorControlPage.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.i();
        }
    }

    /* compiled from: UpnpSelectorControlPage.java */
    /* loaded from: classes.dex */
    public class b implements c.g {
        public b() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            p.this.k();
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        this.e = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        if (b.b.a.a.b.u.c.i == null) {
            b.b.a.a.b.u.c.i = new b.b.a.a.b.u.c();
        }
        b.b.a.a.b.u.c cVar = b.b.a.a.b.u.c.i;
        this.f = cVar;
        cVar.f1065a = this;
        this.g = new g0(new Handler(), 2);
        i();
    }

    @Override // b.b.a.a.f.k0.g
    public void b() {
        boolean z = this.f.h && (this.h instanceof m);
        if (this.f.a()) {
            e j = j();
            if (this.f.b().d == 7) {
                this.f.a();
                d dVar = (d) j;
                int intValue = this.f.f1067c.lastElement().intValue();
                int i = ((b.b.a.a.c.g) this.f.g).f1115b;
                dVar.s = intValue;
                dVar.t = i;
            } else if (z) {
                ((l) j).s = ((b.b.a.a.c.g) this.f.g).f1115b;
            } else {
                ((l) j).s = this.f.f1067c.lastElement().intValue();
            }
            a(j, false);
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        Thread thread;
        this.e.x.b(this);
        this.g.a();
        b.b.a.a.c.b bVar = this.f.f1066b.d;
        if (bVar == null || (thread = bVar.g) == null) {
            return;
        }
        bVar.h = false;
        thread.interrupt();
        try {
            bVar.g.join();
        } catch (InterruptedException unused) {
        }
        bVar.g = null;
        bVar.i = null;
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        b.b.a.a.c.d dVar = this.f.f1066b;
        if (dVar.d == null) {
            dVar.d = new b.b.a.a.c.b(dVar.f1090a);
        }
        b.b.a.a.c.b bVar = dVar.d;
        if (bVar.g == null) {
            bVar.h = true;
            bVar.i = new Handler();
            Thread thread = new Thread(bVar.m);
            bVar.g = thread;
            thread.start();
        }
        this.e.x.a((d.m) this);
        k();
        e eVar = this.h;
        if (eVar instanceof m) {
            m mVar = (m) eVar;
            mVar.a(mVar.y.h);
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void g() {
        boolean z;
        b.b.a.a.b.u.c cVar = this.f;
        if (cVar.f == null || cVar.h) {
            z = false;
        } else {
            cVar.h = true;
            cVar.b(cVar.d);
            cVar.f1067c = (Stack) cVar.e.clone();
            Stack<d.m> stack = (Stack) cVar.f.clone();
            cVar.a(stack);
            cVar.d = stack;
            z = true;
        }
        if (z) {
            a((e) new m(getActivity(), this.e), true);
        }
    }

    public void i() {
        e j;
        FrameLayout frameLayout = (FrameLayout) getView();
        e eVar = this.h;
        if (eVar != null) {
            frameLayout.removeView(eVar.d);
        }
        UpnpControl upnpControl = this.e.t;
        if (!(upnpControl != null && upnpControl.isConnecting())) {
            j = new f(getActivity());
        } else if (this.f.h) {
            j = new m(getActivity(), this.e);
        } else {
            j = j();
            if (this.f.b().d == 7) {
                this.f.a();
            }
        }
        frameLayout.addView(j.b(), 0, new FrameLayout.LayoutParams(-1, -1));
        this.h = j;
    }

    public final e j() {
        d.m b2 = this.f.b();
        if (b2.d == 7) {
            b2 = b2.f1099a;
        }
        int i = b2.d;
        if (i != 3 && i != 2 && i != 8) {
            l lVar = new l(getActivity(), this.e, this);
            lVar.f = b2;
            return lVar;
        }
        d dVar = new d(getActivity(), this.e, this);
        dVar.f = b2;
        return dVar;
    }

    public final void k() {
        b.b.a.a.b.u.c cVar = this.f;
        boolean z = false;
        boolean z2 = cVar.h || cVar.d.size() > 1;
        b.b.a.a.b.u.c cVar2 = this.f;
        if (!cVar2.h) {
            if (cVar2.f != null) {
                z = true;
            }
        }
        g.a aVar = this.f1233c;
        if (aVar != null) {
            MainActivity mainActivity = ((b.b.a.a.f.l) aVar).f1375a;
            if (this == mainActivity.b0) {
                mainActivity.a(z2, z);
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_upnp, viewGroup, false);
    }

    @Override // b.b.a.a.f.k0.g
    public boolean a() {
        this.h.f();
        return true;
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, r rVar) {
        if (fVar == d.f.UPNP_RENDERER_DISCOVERED || fVar == d.f.UPNP_RENDERER_LOST) {
            if (fVar == d.f.UPNP_RENDERER_LOST) {
                b.b.a.a.b.u.c cVar = this.f;
                cVar.c();
                cVar.b(cVar.d);
                cVar.f1067c.clear();
                cVar.d.clear();
                cVar.f1067c.push(0);
                Stack<d.m> stack = cVar.d;
                b.b.a.a.c.d dVar = cVar.f1066b;
                if (dVar.f1092c == null) {
                    dVar.f1092c = new d.r(null);
                }
                stack.add(dVar.f1092c);
                cVar.d.lastElement().a(true);
            }
            this.g.a(0, 500, new a());
        }
    }

    public final void a(e eVar, boolean z) {
        e eVar2 = this.h;
        if (eVar2 == eVar) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (eVar2 != null) {
            eVar2.f();
        }
        if (eVar != null) {
            frameLayout.addView(eVar.b(), 0, new FrameLayout.LayoutParams(-1, -1));
        }
        this.h = eVar;
        b.b.a.a.f.c.a((FrameLayout) getView(), eVar2.d, eVar.d, z, new b());
    }
}
