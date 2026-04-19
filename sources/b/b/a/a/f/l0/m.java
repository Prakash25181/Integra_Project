package b.b.a.a.f.l0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: NoWifiFragment.java */
/* loaded from: classes.dex */
public class m extends k {

    /* compiled from: NoWifiFragment.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((ConnectionActivity) m.this.getActivity()).a((b.b.a.a.b.p.g) new b.b.a.a.b.n.b(), false);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_no_wifi, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((Button) view.findViewById(R.id.demo_mode_button)).setOnClickListener(new a());
    }
}
