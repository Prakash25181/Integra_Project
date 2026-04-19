package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import com.onkyo.integraRemote4A.R;

/* compiled from: RiAmpRemoteControllerView.java */
/* loaded from: classes.dex */
public class d1 extends b1 {
    public b.b.a.a.b.m.e e;

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("PWRTG");
        }
    }

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("SLIUP");
        }
    }

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("SLIDOWN");
        }
    }

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("MVLUP");
        }
    }

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("MVLDOWN");
        }
    }

    /* compiled from: RiAmpRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d1.this.e.a("AMTTG");
        }
    }

    public d1(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.e = new b.b.a.a.b.m.e(dVar);
        a(R.layout.layout_remote_ri_amp);
    }

    @Override // b.b.a.a.f.m0.b1
    public void b(View view) {
        a(R.id.power_button, new a());
        a(R.id.input_up_button, new b());
        a(R.id.input_down_button, new c());
        a(R.id.vol_up_button, new d());
        a(R.id.volume_down_button, new e());
        a(R.id.mute_button, new f());
    }
}
