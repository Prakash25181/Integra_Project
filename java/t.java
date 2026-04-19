package b.b.a.a.f.k0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: RiCdPlayerControlPage.java */
/* loaded from: classes.dex */
public class t extends b.b.a.a.f.k0.g {
    public b.b.a.a.b.p.d e;
    public b.b.a.a.b.m.b f;

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "STOP");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "PAUSE");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "PLAY");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "SKIP.R");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "REW");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "FF");
        }
    }

    /* compiled from: RiCdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f.f766a.a(b.b.a.a.b.p.v.a.CCD, "SKIP.F");
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.e = b2;
        this.f = new b.b.a.a.b.m.b(b2);
        a(view, R.id.stop_button, new a());
        a(view, R.id.pause_button, new b());
        a(view, R.id.play_button, new c());
        a(view, R.id.prev_button, new d());
        a(view, R.id.fr_button, new e());
        a(view, R.id.ff_button, new f());
        a(view, R.id.next_button, new g());
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_ri_cd_player, viewGroup, false);
    }

    public void a(View view, int i, View.OnClickListener onClickListener) {
        view.findViewById(i).setOnClickListener(onClickListener);
    }
}
