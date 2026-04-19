package b.b.a.a.f.l0;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: AutoConnectFragment.java */
/* loaded from: classes.dex */
public class b extends k {

    /* renamed from: b, reason: collision with root package name */
    public TextView f1377b;

    /* renamed from: c, reason: collision with root package name */
    public Button f1378c;
    public g0 d;

    /* compiled from: AutoConnectFragment.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ConnectionActivity) b.this.getActivity()).k();
        }
    }

    @Override // b.b.a.a.f.l0.k
    public void a() {
        g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.a();
        }
        this.f1378c.setEnabled(false);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_auto_connect, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.d.a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f1377b.setText(((ConnectionActivity) getActivity()).w);
        g0 g0Var = new g0(new Handler(), 1);
        this.d = g0Var;
        g0Var.a(0, 23000, new c(this));
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f1377b = (TextView) view.findViewById(R.id.device_name_label);
        Button button = (Button) view.findViewById(R.id.other_device_button);
        this.f1378c = button;
        button.setOnClickListener(new a());
        if (((ConnectionActivity) getActivity()).A) {
            g0 g0Var = this.d;
            if (g0Var != null) {
                g0Var.a();
            }
            this.f1378c.setEnabled(false);
        }
    }

    @Override // b.b.a.a.f.l0.k
    public void a(boolean z) {
        if (z) {
            return;
        }
        this.d.a(0, 23000, new c(this));
        this.f1378c.setEnabled(true);
    }
}
