package b.b.a.a.f.k0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import b.b.a.a.f.m0.n0;
import b.b.a.a.f.m0.u0;
import b.b.a.a.f.m0.z0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import java.util.Iterator;

/* compiled from: RadioTunerControlPage.java */
/* loaded from: classes.dex */
public class q extends b.b.a.a.f.k0.g implements d.k {
    public TextView e;
    public TextView f;
    public Button g;
    public View h;
    public Button i;
    public TextView j;
    public Button k;
    public b.b.a.a.b.p.d l;
    public b.b.a.a.b.t.c m;
    public z0 n;

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l lVar = q.this.m.f1052b;
            lVar.f754a.a(lVar.f756c.f, "DOWN");
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l lVar = q.this.m.f1052b;
            lVar.f754a.a(lVar.f756c.f, "UP");
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q qVar = q.this;
            n0 n0Var = new n0(qVar.getActivity(), qVar.l, qVar.m);
            n0Var.u = new r(qVar);
            Button button = qVar.g;
            MainActivity mainActivity = (MainActivity) qVar.getActivity();
            qVar.n = n0Var;
            mainActivity.a(button, n0Var, new p(qVar));
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l lVar = q.this.m.f1052b;
            lVar.f754a.a(lVar.f756c.g, "DOWN");
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l lVar = q.this.m.f1052b;
            lVar.f754a.a(lVar.f756c.g, "UP");
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (q.this == null) {
                throw null;
            }
        }
    }

    /* compiled from: RadioTunerControlPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            q qVar = q.this;
            u0 u0Var = new u0(qVar.getActivity());
            u0Var.a(1, qVar.l.l.f1056b);
            u0Var.l = new s(qVar);
            MainActivity mainActivity = (MainActivity) qVar.getActivity();
            qVar.n = u0Var;
            mainActivity.a(null, u0Var, new p(qVar));
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.l = b2;
        this.m = b2.b().o;
        ((ImageButton) view.findViewById(R.id.tuning_down_button)).setOnClickListener(new a());
        ((ImageButton) view.findViewById(R.id.tuning_up_button)).setOnClickListener(new b());
        Button button = (Button) view.findViewById(R.id.direct_tuning_button);
        this.g = button;
        button.setOnClickListener(new c());
        this.e = (TextView) view.findViewById(R.id.freq_label);
        this.f = (TextView) view.findViewById(R.id.unit_label);
        ((ImageButton) view.findViewById(R.id.preset_down_button)).setOnClickListener(new d());
        ((ImageButton) view.findViewById(R.id.preset_up_button)).setOnClickListener(new e());
        Button button2 = (Button) view.findViewById(R.id.preset_input_button);
        this.i = button2;
        button2.setOnClickListener(new f());
        this.h = view.findViewById(R.id.preset_parent_frame);
        this.j = (TextView) view.findViewById(R.id.preset_name_label);
        Button button3 = (Button) view.findViewById(R.id.memory_button);
        this.k = button3;
        button3.setOnClickListener(new g());
        h();
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        this.l.x.b(this);
        if (this.n != null) {
            ((MainActivity) getActivity()).k();
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        this.l.x.a((d.m) this);
    }

    @Override // b.b.a.a.f.k0.g
    public void h() {
        i();
        b.b.a.a.b.p.d dVar = this.l;
        if (dVar.l.f1056b == 0) {
            this.k.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            this.k.setVisibility(dVar.f851b == b.b.a.a.b.o.r.MAIN ? 0 : 8);
            this.h.setVisibility(0);
        }
        this.i.setEnabled(false);
    }

    public final void i() {
        String format;
        b.b.a.a.b.t.c cVar = this.m;
        int i = cVar.e;
        b.b.a.a.b.o.o oVar = null;
        if (i != 0) {
            b.b.a.a.b.o.c cVar2 = cVar.f1051a.f852c;
            if (cVar2 != null) {
                if ((cVar2.f801c >= 2014) && cVar.e > 0 && b.b.a.a.b.o.i.c(cVar.f1051a.b().d())) {
                    b.b.a.a.b.t.e eVar = cVar.f1051a.l;
                    int i2 = cVar.e - 1;
                    if (eVar != null) {
                        if (i2 >= 0 && i2 < eVar.f1057c.size()) {
                            int i3 = i2 + 1;
                            Iterator<b.b.a.a.b.o.o> it = eVar.f1057c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                b.b.a.a.b.o.o next = it.next();
                                if (next.f831a == i3) {
                                    oVar = next;
                                    break;
                                }
                            }
                        }
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        TextView textView = this.e;
        b.b.a.a.b.t.c cVar3 = this.m;
        int i4 = cVar3.d;
        textView.setText(i4 == 0 ? "" : cVar3.a(cVar3.f1053c, i4));
        this.f.setText(b.b.a.a.b.t.c.b(this.m.f1053c));
        if (i != 0) {
            if (oVar != null) {
                String str = oVar.f832b;
                format = (str == null || str.length() <= 0) ? String.format("%2d", Integer.valueOf(oVar.f831a)) : String.format("%2d %s", Integer.valueOf(oVar.f831a), oVar.f832b);
            } else {
                format = String.format("%2d", Integer.valueOf(i));
            }
            this.j.setText(format);
            this.j.setTextColor(getResources().getColor(R.color.ctrl_panel_tuner_preset));
            return;
        }
        this.j.setText(getResources().getString(R.string.ctrlTunerNoPreset));
        this.j.setTextColor(getResources().getColor(R.color.ctrl_panel_tuner_no_preset));
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_radio_tuner, viewGroup, false);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (z) {
            if (fVar == d.f.ZONE) {
                this.m = this.l.b().o;
            }
            if (fVar == d.f.RADIO_TUNING || fVar == d.f.TUNER_PRESET || fVar == d.f.TUNER_PRESET_LIST) {
                i();
            }
        }
    }
}
