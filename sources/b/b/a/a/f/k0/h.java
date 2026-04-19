package b.b.a.a.f.k0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import b.b.a.a.f.m0.u0;
import b.b.a.a.f.m0.z0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: DabTunerControlPage.java */
/* loaded from: classes.dex */
public class h extends g implements d.k {
    public TextView e;
    public TextView f;
    public b.b.a.a.b.p.d g;
    public b.b.a.a.b.t.b h;
    public z0 i;

    /* compiled from: DabTunerControlPage.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.h.b(false);
        }
    }

    /* compiled from: DabTunerControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.h.b(true);
        }
    }

    /* compiled from: DabTunerControlPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.h.a(false);
        }
    }

    /* compiled from: DabTunerControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.h.a(true);
        }
    }

    /* compiled from: DabTunerControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = h.this;
            u0 u0Var = new u0(hVar.getActivity());
            u0Var.a(1, hVar.h.f1048a.f852c.Q);
            u0Var.l = new i(hVar);
            MainActivity mainActivity = (MainActivity) hVar.getActivity();
            hVar.i = u0Var;
            mainActivity.a(null, u0Var, new j(hVar));
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.g = b2;
        this.h = b2.b().p;
        this.e = (TextView) view.findViewById(R.id.station_name_label);
        view.findViewById(R.id.tuning_down_button).setOnClickListener(new a());
        view.findViewById(R.id.tuning_up_button).setOnClickListener(new b());
        view.findViewById(R.id.preset_down_button).setOnClickListener(new c());
        view.findViewById(R.id.preset_up_button).setOnClickListener(new d());
        this.f = (TextView) view.findViewById(R.id.preset_name_label);
        view.findViewById(R.id.memory_button).setOnClickListener(new e());
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        this.g.x.b(this);
        if (this.i != null) {
            ((MainActivity) getActivity()).k();
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        this.g.x.a((d.m) this);
        this.e.setText(this.h.f1049b);
        i();
    }

    @Override // b.b.a.a.f.k0.g
    public void h() {
        this.e.setText(this.h.f1049b);
        i();
    }

    public void i() {
        int i = this.h.f1050c;
        if (i != 0) {
            this.f.setText(String.format("%d", Integer.valueOf(i)));
            this.f.setTextColor(getResources().getColor(R.color.ctrl_panel_tuner_preset));
        } else {
            this.f.setText("--");
            this.f.setTextColor(getResources().getColor(R.color.ctrl_panel_tuner_no_preset));
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_dab_tuner, viewGroup, false);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (z) {
            int ordinal = fVar.ordinal();
            if (ordinal == 19) {
                this.e.setText(this.h.f1049b);
            } else {
                if (ordinal != 20) {
                    return;
                }
                i();
            }
        }
    }
}
