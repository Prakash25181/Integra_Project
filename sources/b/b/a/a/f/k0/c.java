package b.b.a.a.f.k0;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import b.b.a.a.b.s.a;
import b.b.a.a.f.g0;
import b.b.a.a.f.m0.m0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: CdPlayerControlPage.java */
/* loaded from: classes.dex */
public class c extends b.b.a.a.f.k0.g implements a.InterfaceC0030a {
    public StepSlideBar.a A = new a();
    public View e;
    public View f;
    public View g;
    public TextView h;
    public View i;
    public TextView j;
    public TextView k;
    public TextView l;
    public StepSlideBar m;
    public ImageButton n;
    public ImageButton o;
    public ImageButton p;
    public ImageButton q;
    public ImageButton r;
    public ImageButton s;
    public b.b.a.a.b.p.d t;
    public b.b.a.a.b.s.a u;
    public k v;
    public g0 w;
    public m0 x;
    public Drawable y;
    public Drawable z;

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            m0 m0Var = new m0(cVar.getActivity());
            m0Var.a(1, 499);
            m0Var.l = new b.b.a.a.f.k0.d(cVar);
            View view2 = cVar.g;
            MainActivity mainActivity = (MainActivity) cVar.getActivity();
            cVar.x = m0Var;
            mainActivity.a(view2, m0Var, new b.b.a.a.f.k0.f(cVar));
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* renamed from: b.b.a.a.f.k0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0041c implements View.OnClickListener {
        public ViewOnClickListenerC0041c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            m0 m0Var = new m0(cVar.getActivity());
            m0Var.a(1, 99);
            m0Var.l = new b.b.a.a.f.k0.e(cVar);
            View view2 = cVar.i;
            MainActivity mainActivity = (MainActivity) cVar.getActivity();
            cVar.x = m0Var;
            mainActivity.a(view2, m0Var, new b.b.a.a.f.k0.f(cVar));
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int ordinal = c.this.u.f1035b.ordinal();
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal == 4) {
                    c.this.u.j.a(b.b.a.a.b.p.v.a.CCD, "PAUSE");
                    return;
                } else if (ordinal != 5 && ordinal != 6) {
                    return;
                }
            }
            c.this.u.j.a(b.b.a.a.b.p.v.a.CCD, "PLAY");
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.u.j.a(b.b.a.a.b.p.v.a.CCD, "STOP");
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                c.this.a(false);
                return false;
            }
            if (action == 1) {
                c.a(c.this, false);
                return false;
            }
            if (action != 3) {
                return false;
            }
            c.a(c.this, true);
            return false;
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnTouchListener {
        public g() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                c.this.a(true);
                return false;
            }
            if (action == 1) {
                c.a(c.this, false);
                return false;
            }
            if (action != 3) {
                return false;
            }
            c.a(c.this, true);
            return false;
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.u.j.a(b.b.a.a.b.p.v.a.CCD, "REPEAT");
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.u.j.a(b.b.a.a.b.p.v.a.CCD, "RANDOM");
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            k kVar = cVar.v;
            if (kVar == k.FF_WAIT) {
                cVar.u.j.a(b.b.a.a.b.p.v.a.CCD, "FF");
            } else if (kVar == k.FR_WAIT) {
                cVar.u.j.a(b.b.a.a.b.p.v.a.CCD, "REW");
            }
        }
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public enum k {
        NONE,
        FF_WAIT,
        FR_WAIT,
        FF,
        FR,
        TIME_TRACK,
        SEEK_WAIT
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        this.e = view.findViewById(R.id.player_frame);
        this.f = view.findViewById(R.id.no_disc_frame);
        View findViewById = view.findViewById(R.id.folder_frame);
        this.g = findViewById;
        findViewById.setOnClickListener(new b());
        this.h = (TextView) view.findViewById(R.id.folder_label);
        View findViewById2 = view.findViewById(R.id.track_frame);
        this.i = findViewById2;
        findViewById2.setOnClickListener(new ViewOnClickListenerC0041c());
        this.j = (TextView) view.findViewById(R.id.track_label);
        this.k = (TextView) view.findViewById(R.id.time_label);
        this.l = (TextView) view.findViewById(R.id.dur_label);
        StepSlideBar stepSlideBar = (StepSlideBar) view.findViewById(R.id.time_slider);
        this.m = stepSlideBar;
        stepSlideBar.setDelegate(this.A);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.play_button);
        this.n = imageButton;
        imageButton.setOnClickListener(new d());
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.stop_button);
        this.o = imageButton2;
        imageButton2.setOnClickListener(new e());
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.prev_button);
        this.q = imageButton3;
        imageButton3.setOnTouchListener(new f());
        ImageButton imageButton4 = (ImageButton) view.findViewById(R.id.next_button);
        this.p = imageButton4;
        imageButton4.setOnTouchListener(new g());
        ImageButton imageButton5 = (ImageButton) view.findViewById(R.id.repeat_button);
        this.r = imageButton5;
        imageButton5.setOnClickListener(new h());
        ImageButton imageButton6 = (ImageButton) view.findViewById(R.id.random_button);
        this.s = imageButton6;
        imageButton6.setOnClickListener(new i());
        this.y = getResources().getDrawable(R.drawable.control_play);
        this.z = getResources().getDrawable(R.drawable.control_pause);
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.t = b2;
        this.u = b2.o;
        this.w = new g0(new Handler(), 2);
    }

    public void b(b.b.a.a.b.s.a aVar) {
        int ordinal = this.u.d.ordinal();
        int i2 = ordinal != 0 ? ordinal != 1 ? 0 : R.drawable.random_all : R.drawable.random_off;
        if (i2 != 0) {
            this.s.setImageDrawable(getResources().getDrawable(i2));
        } else {
            this.s.setImageDrawable(null);
        }
    }

    public void c(b.b.a.a.b.s.a aVar) {
        int ordinal = this.u.f1036c.ordinal();
        int i2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? 0 : R.drawable.repeat_all : R.drawable.repeat_one : R.drawable.repeat_off;
        if (i2 != 0) {
            this.r.setImageDrawable(getResources().getDrawable(i2));
        } else {
            this.r.setImageDrawable(null);
        }
    }

    public void d(b.b.a.a.b.s.a aVar) {
        k kVar = this.v;
        if (kVar == k.FF_WAIT) {
            if (this.u.f1035b == a.e.CD_PLAYER_FF) {
                this.v = k.FF;
            }
        } else if (kVar == k.FR_WAIT && this.u.f1035b == a.e.CD_PLAYER_FR) {
            this.v = k.FR;
        }
        if (this.u.f1035b == a.e.CD_PLAYER_PLAY) {
            this.n.setImageDrawable(this.z);
        } else {
            this.n.setImageDrawable(this.y);
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        b.b.a.a.b.s.a aVar = this.u;
        if (this == aVar.k) {
            aVar.k = null;
        }
        m0 m0Var = this.x;
        if (m0Var != null) {
            m0Var.h();
        }
        this.w.a();
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        a(this.u);
        d(this.u);
        e(this.u);
        i();
        c(this.u);
        b(this.u);
        this.u.k = this;
    }

    public final void i() {
        b.b.a.a.b.s.a aVar = this.u;
        int i2 = aVar.h;
        int i3 = aVar.i;
        if (i3 > 0) {
            this.m.setVisibility(0);
            if (i3 != this.m.getMax()) {
                this.m.a(0, i3, 1.0f);
            }
            this.l.setText(a(i3));
            k kVar = this.v;
            if (kVar == k.TIME_TRACK || kVar == k.SEEK_WAIT) {
                return;
            }
            this.m.setValue(i2);
            this.k.setText(a(i2));
            return;
        }
        this.m.setVisibility(4);
        a.e eVar = this.u.f1035b;
        if (eVar != a.e.CD_PLAYER_STOP && eVar != a.e.CD_PLAYER_UNKNOWN && eVar != a.e.CD_PLAYER_NODISK) {
            this.k.setText(a(i2));
        } else {
            this.k.setText("");
        }
        this.l.setText("");
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_cd_player, viewGroup, false);
    }

    public void e(b.b.a.a.b.s.a aVar) {
        int ordinal = this.u.f1034a.ordinal();
        if (ordinal == 2) {
            TextView textView = this.j;
            StringBuilder a2 = b.a.a.a.a.a("");
            a2.append(this.u.f);
            textView.setText(a2.toString());
            this.i.setVisibility(0);
            this.g.setVisibility(8);
            return;
        }
        if (ordinal != 3) {
            this.i.setVisibility(8);
            this.g.setVisibility(8);
            return;
        }
        TextView textView2 = this.h;
        StringBuilder a3 = b.a.a.a.a.a("");
        a3.append(this.u.e);
        textView2.setText(a3.toString());
        TextView textView3 = this.j;
        StringBuilder a4 = b.a.a.a.a.a("");
        a4.append(this.u.f);
        textView3.setText(a4.toString());
        this.i.setVisibility(0);
        this.g.setVisibility(0);
    }

    /* compiled from: CdPlayerControlPage.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
            c cVar = c.this;
            if (cVar.v == k.SEEK_WAIT) {
                cVar.w.a(1);
                c.this.v = k.NONE;
            }
            c cVar2 = c.this;
            if (cVar2.v == k.NONE) {
                cVar2.v = k.TIME_TRACK;
            }
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
            c.a(c.this, false);
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            c cVar = c.this;
            if (cVar.v == k.TIME_TRACK) {
                cVar.k.setText(cVar.a(cVar.m.getUserValue()));
            }
        }
    }

    public void a(boolean z) {
        if (this.v == k.SEEK_WAIT) {
            this.w.a(1);
            this.v = k.NONE;
        }
        if (this.v == k.NONE) {
            this.v = z ? k.FF_WAIT : k.FR_WAIT;
            this.w.a(0, 1500, new j());
        }
    }

    public static /* synthetic */ void a(c cVar, boolean z) {
        cVar.w.a(0);
        if (!z) {
            k kVar = cVar.v;
            if (kVar == k.FF_WAIT) {
                cVar.u.j.a(b.b.a.a.b.p.v.a.CCD, "SKIP.F");
            } else if (kVar == k.FR_WAIT) {
                cVar.u.j.a(b.b.a.a.b.p.v.a.CCD, "SKIP.R");
            } else if (kVar == k.TIME_TRACK) {
                b.b.a.a.b.s.a aVar = cVar.u;
                int userValue = cVar.m.getUserValue();
                if (aVar.g == a.f.CD_TIME_SEEKABLE) {
                    aVar.j.a(b.b.a.a.b.p.v.a.SCE, String.format("%02d:%02d", Integer.valueOf(userValue / 60), Integer.valueOf(userValue % 60)));
                }
            }
        }
        k kVar2 = cVar.v;
        if (kVar2 == k.FF || kVar2 == k.FR) {
            cVar.u.j.a(b.b.a.a.b.p.v.a.CCD, "PLAY");
        }
        if (!z && cVar.v == k.TIME_TRACK) {
            cVar.v = k.SEEK_WAIT;
            cVar.w.a(1, 1500, new b.b.a.a.f.k0.b(cVar));
        } else {
            cVar.v = k.NONE;
        }
    }

    public void a(b.b.a.a.b.s.a aVar) {
        a.b bVar = this.u.f1034a;
        if (bVar != a.b.CD_DISC_UNKNOWN) {
            if (bVar == a.b.CD_DISC_NONE) {
                m0 m0Var = this.x;
                if (m0Var != null) {
                    m0Var.h();
                }
                this.i.setVisibility(8);
                this.g.setVisibility(8);
                this.k.setText("");
                this.l.setText("");
                this.e.setVisibility(4);
                this.f.setVisibility(0);
                return;
            }
            this.e.setVisibility(0);
            this.f.setVisibility(4);
        }
    }

    public final String a(int i2) {
        return String.format("%2d:%02d", Integer.valueOf(i2 / 60), Integer.valueOf(i2 % 60));
    }
}
