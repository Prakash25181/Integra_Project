package b.b.a.a.f.k0.u;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import b.b.a.a.b.r.x;
import b.b.a.a.f.c;
import b.b.a.a.f.g0;
import b.b.a.a.f.m0.t0;

/* compiled from: NetUsbOverlayPopup.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public Context f1318a;

    /* renamed from: b, reason: collision with root package name */
    public x f1319b;

    /* renamed from: c, reason: collision with root package name */
    public t0 f1320c;
    public View d;
    public g0 e = new g0(new Handler(), 1);
    public b f;
    public ViewGroup g;

    /* compiled from: NetUsbOverlayPopup.java */
    /* loaded from: classes.dex */
    public class a implements c.g {
        public a() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            m.this.a();
        }
    }

    /* compiled from: NetUsbOverlayPopup.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    public m(Context context, x xVar) {
        this.f1318a = context;
        this.f1319b = xVar;
    }

    public void a(boolean z) {
        this.e.a(0);
        if (z) {
            b.b.a.a.f.c.a(this.d, 0.0f, (c.g) new a());
        } else {
            a();
        }
    }

    public final void a() {
        this.g.removeView(this.d);
        b bVar = this.f;
        if (bVar != null) {
            s sVar = s.this;
            if (this == sVar.j) {
                sVar.j = null;
            }
        }
    }
}
