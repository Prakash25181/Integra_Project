package b.b.a.a.f.k0;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import b.b.a.a.f.o0.a;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: HdmiTvControlPage.java */
/* loaded from: classes.dex */
public class m extends b.b.a.a.f.k0.g implements d.k {
    public b.b.a.a.f.o0.a e;
    public TextView f;
    public b.b.a.a.b.p.d g;
    public b.b.a.a.b.l h;
    public b.b.a.a.b.m.f i;

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // b.b.a.a.f.o0.a.b
        public void a(boolean z) {
            m.this.i();
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "INPUT");
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "CHUP");
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "CHDN");
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "VLUP");
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "VLDN");
        }
    }

    /* compiled from: HdmiTvControlPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.f fVar = m.this.i;
            fVar.f772a.a(fVar.f773b, "MUTE");
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.g = b2;
        b.b.a.a.b.l b3 = b2.b();
        this.h = b3;
        this.i = new b.b.a.a.b.m.f(this.g, b3.f755b.f839b);
        b.b.a.a.f.o0.a aVar = new b.b.a.a.f.o0.a(getActivity(), this.g, this.h.f755b.f839b == b.b.a.a.b.o.r.MAIN, true);
        this.e = aVar;
        ((FrameLayout) view).addView(aVar.b());
        this.e.d.setBackgroundDrawable(new ColorDrawable(view.getResources().getColor(R.color.app_bkgnd)));
        this.e.m = new a();
        this.f = (TextView) view.findViewById(R.id.title_label);
        a(view, R.id.input_button, new b());
        a(view, R.id.ch_up_button, new c());
        a(view, R.id.ch_down_button, new d());
        a(view, R.id.vol_up_button, new e());
        a(view, R.id.volume_down_button, new f());
        a(view, R.id.mute_button, new g());
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        this.g.x.b(this);
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        i();
        j();
        this.g.x.a((d.m) this);
    }

    public final void i() {
        b.b.a.a.f.o0.a aVar = this.e;
        if (aVar.l) {
            aVar.d.setVisibility(8);
        } else {
            aVar.d.setVisibility(0);
        }
    }

    public final void j() {
        if (this.h.q.A) {
            this.f.setText(String.format(getResources().getString(R.string.ctrlHdmiTvMultiDsTitle), this.g.j.f858b));
        } else {
            this.f.setText(getResources().getString(R.string.ctrlHdmiTvTitle));
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_tv, viewGroup, false);
    }

    public void a(View view, int i, View.OnClickListener onClickListener) {
        View findViewById = view.findViewById(i);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(onClickListener);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (fVar == d.f.CEC_ENABLE || fVar == d.f.CEC_ROUTE) {
            j();
        }
    }
}
