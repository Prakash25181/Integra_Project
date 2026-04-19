package b.b.a.a.f.k0;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b.b.a.a.f.o0.a;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: HdmiPlayerControlPage.java */
/* loaded from: classes.dex */
public class l extends b.b.a.a.f.k0.g {
    public b.b.a.a.f.o0.a e;
    public b.b.a.a.b.p.d f;
    public b.b.a.a.b.l g;
    public b.b.a.a.b.m.a h;

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // b.b.a.a.f.o0.a.b
        public void a(boolean z) {
            l.this.i();
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "STOP");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "PAUSE");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "PLAY");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "SKIP.R");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "REW");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "FF");
        }
    }

    /* compiled from: HdmiPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.a aVar = l.this.h;
            aVar.f764a.a(aVar.f765b, "SKIP.F");
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.f = b2;
        b.b.a.a.b.l b3 = b2.b();
        this.g = b3;
        this.h = new b.b.a.a.b.m.a(this.f, b3.f755b.f839b);
        b.b.a.a.f.o0.a aVar = new b.b.a.a.f.o0.a(getActivity(), this.f, this.g.f755b.f839b == b.b.a.a.b.o.r.MAIN, false);
        this.e = aVar;
        ((FrameLayout) view).addView(aVar.b());
        this.e.d.setBackgroundDrawable(new ColorDrawable(view.getResources().getColor(R.color.app_bkgnd)));
        this.e.m = new a();
        a(view, R.id.stop_button, new b());
        a(view, R.id.pause_button, new c());
        a(view, R.id.play_button, new d());
        a(view, R.id.prev_button, new e());
        a(view, R.id.fr_button, new f());
        a(view, R.id.ff_button, new g());
        a(view, R.id.next_button, new h());
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        i();
    }

    public final void i() {
        b.b.a.a.f.o0.a aVar = this.e;
        if (aVar.l) {
            aVar.d.setVisibility(8);
        } else {
            aVar.d.setVisibility(0);
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_player, viewGroup, false);
    }

    public void a(View view, int i, View.OnClickListener onClickListener) {
        View findViewById = view.findViewById(i);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(onClickListener);
    }
}
