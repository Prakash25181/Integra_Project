package b.b.a.a.f.k0.u;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.r.x;
import b.b.a.a.f.c;
import b.b.a.a.f.m0.t0;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbCustomPopupPage.java */
/* loaded from: classes.dex */
public class b extends n implements x.a {
    public x e;
    public t0 f;
    public View g;
    public TextView h;

    /* compiled from: NetUsbCustomPopupPage.java */
    /* loaded from: classes.dex */
    public class a implements t0.a {
        public a() {
        }

        @Override // b.b.a.a.f.m0.t0.a
        public void a() {
            b.this.e.a();
        }
    }

    /* compiled from: NetUsbCustomPopupPage.java */
    /* renamed from: b.b.a.a.f.k0.u.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0045b implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1281a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t0 f1282b;

        public C0045b(View view, t0 t0Var) {
            this.f1281a = view;
            this.f1282b = t0Var;
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            ((FrameLayout) b.this.d).removeView(this.f1281a);
            b bVar = b.this;
            if (bVar.g == this.f1281a) {
                bVar.g = null;
            }
            b bVar2 = b.this;
            if (bVar2.f == this.f1282b) {
                bVar2.f = null;
            }
        }
    }

    public b(Context context, x xVar) {
        super(context);
        this.e = xVar;
    }

    public void a(FrameLayout frameLayout) {
        View inflate = ((LayoutInflater) this.f1597b.getSystemService("layout_inflater")).inflate(R.layout.layout_ncp_popup, (ViewGroup) frameLayout, false);
        this.g = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title_label);
        LinearLayout linearLayout = (LinearLayout) this.g.findViewById(R.id.content_frame);
        t0 t0Var = new t0(this.f1597b, this.e.f1028b);
        this.f = t0Var;
        t0Var.a(textView);
        this.h = this.f.a(linearLayout);
        this.f.e = new a();
        frameLayout.addView(this.g);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_custom_popup);
        a((FrameLayout) a2);
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.e.f1027a.b(this);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.e.f1027a.a(this);
        TextView textView = this.h;
        if (textView != null) {
            textView.requestFocus();
            this.h = null;
        }
    }

    @Override // b.b.a.a.b.r.x.a
    public void a() {
        View view = this.g;
        if (view != null) {
            b.b.a.a.f.c.a(view, 0.0f, (c.g) new C0045b(view, this.f));
        }
        a((FrameLayout) this.d);
        this.g.setAlpha(0.0f);
        b.b.a.a.f.c.a(this.g, 1.0f, (c.g) null);
        TextView textView = this.h;
        if (textView != null) {
            textView.requestFocus();
            this.h = null;
        }
    }
}
