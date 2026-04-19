package com.onkyo.jp.onkyoremote.view;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.l;
import b.b.a.a.b.p.d;
import b.b.a.a.b.r.l;
import b.b.a.a.b.r.x;
import b.b.a.a.d.a;
import b.b.a.a.f.c;
import b.b.a.a.f.c0;
import b.b.a.a.f.d0;
import b.b.a.a.f.g0;
import b.b.a.a.f.i0;
import b.b.a.a.f.m0.a1;
import b.b.a.a.f.m0.c1;
import b.b.a.a.f.m0.f1;
import b.b.a.a.f.m0.m2;
import b.b.a.a.f.m0.v0;
import b.b.a.a.f.m0.w0;
import b.b.a.a.f.m0.x0;
import b.b.a.a.f.m0.z0;
import b.b.a.a.f.s;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.settings.RootSettingsActivity;
import com.onkyo.jp.onkyoremote.view.widget.TipsFrame;
import java.util.HashSet;
import java.util.Hashtable;

/* loaded from: classes.dex */
public class MainActivity extends a.b.k.h implements l.c {
    public static final v[] v0 = {new v(R.color.cell_tips_bkgnd, R.color.cell_tips_text, 14.0f), new v(R.color.step_value_popup_bkgnd, R.color.step_value_popup_text, 18.0f)};
    public TextView A;
    public ImageView B;
    public View C;
    public b.b.a.a.f.h D;
    public FrameLayout E;
    public b.b.a.a.f.r F;
    public View G;
    public TextView H;
    public b.b.a.a.f.h I;
    public boolean J;
    public View K;
    public TextView L;
    public b.b.a.a.f.h M;
    public Button N;
    public Button O;
    public Button P;
    public FrameLayout Q;
    public b.b.a.a.f.s R;
    public FrameLayout S;
    public x0 T;
    public g0 V;
    public b.b.a.a.b.p.d W;
    public b.b.a.a.b.r.l X;
    public b.b.a.a.b.o.h Y;
    public b.b.a.a.b.o.h Z;
    public b.b.a.a.f.k0.g b0;
    public TipsFrame c0;
    public boolean e0;
    public long f0;
    public int g0;
    public int h0;
    public AlertDialog i0;
    public FrameLayout p;
    public ImageButton q;
    public ImageButton r;
    public TextView s;
    public TextView t;
    public View u;
    public View v;
    public b.b.a.a.f.h w;
    public ImageButton x;
    public Button y;
    public Button z;
    public Handler U = new Handler();
    public t a0 = t.NONE;
    public u d0 = u.NONE;
    public View.OnClickListener j0 = new s();
    public View.OnClickListener k0 = new a();
    public View.OnClickListener l0 = new b();
    public View.OnClickListener m0 = new c();
    public View.OnTouchListener n0 = new d();
    public View.OnClickListener o0 = new e();
    public View.OnClickListener p0 = new f();
    public View.OnClickListener q0 = new g();
    public View.OnClickListener r0 = new h();
    public d.g s0 = new m();
    public d.l t0 = new n();
    public d0.a u0 = new o();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.b0.a()) {
                mainActivity.k();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) RootSettingsActivity.class));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.b0.b();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.b0.g();
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MainActivity.this.w.c();
                return false;
            }
            if (action != 1 && action != 3 && action != 4) {
                return false;
            }
            MainActivity.this.w.b();
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.F == null) {
                if (mainActivity.b0.a() && mainActivity.F == null) {
                    mainActivity.E.setVisibility(0);
                    mainActivity.D.b();
                    mainActivity.F = new b.b.a.a.f.r(new b.b.a.a.f.i(mainActivity));
                    mainActivity.getFragmentManager().beginTransaction().setTransition(4097).replace(R.id.selector_list_parent, mainActivity.F, "selectorList").disallowAddToBackStack().commit();
                    return;
                }
                return;
            }
            mainActivity.l();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.showRemoteControlPopup(view);
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.showVolumePopup(view);
        }
    }

    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.showAudioSettingPopup(view);
        }
    }

    /* loaded from: classes.dex */
    public class i implements c.g {
        public i() {
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            MainActivity.this.Q.setVisibility(4);
        }
    }

    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity.this.m();
        }
    }

    /* loaded from: classes.dex */
    public class k implements v0 {
        public k() {
        }

        @Override // b.b.a.a.f.m0.v0
        public void a() {
            MainActivity.this.J = false;
        }
    }

    /* loaded from: classes.dex */
    public class l implements z0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x0 f1689a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f1690b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v0 f1691c;

        public l(x0 x0Var, View view, v0 v0Var) {
            this.f1689a = x0Var;
            this.f1690b = view;
            this.f1691c = v0Var;
        }
    }

    /* loaded from: classes.dex */
    public class m implements d.g {
        public m() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(d.i iVar) {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(boolean z) {
            if (((RemoteApplication) MainActivity.this.getApplication()).a()) {
                Log.v("Main", "notifyDisconnected");
                RemoteApplication.a(MainActivity.this, z);
            }
        }

        @Override // b.b.a.a.b.p.d.g
        public void b() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void f() {
            if (((RemoteApplication) MainActivity.this.getApplication()).a()) {
                RemoteApplication.a(MainActivity.this, false);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o implements d0.a {
        public o() {
        }
    }

    /* loaded from: classes.dex */
    public class p implements i0 {
        public p() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            b.b.a.a.b.q.a aVar = b.b.a.a.b.q.a.f928c;
            if (aVar != null) {
                MainActivity mainActivity = MainActivity.this;
                mainActivity.a(null, new b.b.a.a.f.m0.a(mainActivity, aVar), null);
            }
        }
    }

    /* loaded from: classes.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.q();
        }
    }

    /* loaded from: classes.dex */
    public class r implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.b.a.a.b.l f1697b;

        public r(b.b.a.a.b.l lVar) {
            this.f1697b = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            MainActivity.this.a(this.f1697b);
        }
    }

    /* loaded from: classes.dex */
    public class s implements View.OnClickListener {
        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.b0.a()) {
                mainActivity.k();
                b.b.a.a.f.s sVar = mainActivity.R;
                b.b.a.a.b.p.d dVar = sVar.o;
                if (dVar != null) {
                    dVar.x.b(sVar);
                }
                b.b.a.a.b.p.d b2 = ((RemoteApplication) sVar.getActivity().getApplication()).b();
                sVar.o = b2;
                b2.x.a((d.m) sVar);
                sVar.f1618b.setImageBitmap(sVar.o.f852c.f799a.k);
                sVar.f1619c.setText(sVar.o.h());
                if (sVar.o.h().equals(sVar.o.f852c.d)) {
                    sVar.d.setVisibility(8);
                } else {
                    sVar.d.setText(sVar.o.f852c.d);
                    sVar.d.setVisibility(0);
                }
                b.b.a.a.b.o.c cVar = sVar.o.f852c;
                if (!(!cVar.H) && !(!cVar.I)) {
                    sVar.e.setVisibility(8);
                } else {
                    sVar.e.setVisibility(0);
                }
                int q = sVar.o.q();
                for (int i = 0; i < 4; i++) {
                    s.f fVar = sVar.m.get(i);
                    if (i < q) {
                        fVar.f1629a = sVar.o.a(b.b.a.a.b.o.r.a(i));
                        fVar.b();
                        fVar.f1630b.setVisibility(0);
                    } else {
                        fVar.f1630b.setVisibility(8);
                    }
                }
                b.b.a.a.b.o.c cVar2 = sVar.o.f852c;
                if (cVar2.O) {
                    if (cVar2.P) {
                        sVar.h.setVisibility(0);
                        sVar.i.setChecked(sVar.o.k());
                        sVar.j.setVisibility(8);
                        b.b.a.a.b.p.d dVar2 = sVar.o;
                        if (dVar2.f852c.P) {
                            dVar2.a(b.b.a.a.b.p.v.a.NSB);
                        }
                    } else {
                        sVar.h.setVisibility(8);
                        sVar.j.setVisibility(0);
                    }
                    sVar.k.setVisibility(0);
                } else {
                    sVar.h.setVisibility(8);
                    sVar.j.setVisibility(8);
                    sVar.k.setVisibility(8);
                }
                mainActivity.Q.setVisibility(0);
                b.b.a.a.f.c.a((View) mainActivity.Q, mainActivity.getResources().getColor(R.color.sidebar_popup_bkgnd), (c.g) null);
                View view2 = mainActivity.R.getView();
                if (view2 != null) {
                    view2.setX(-view2.getWidth());
                    b.b.a.a.f.c.b(view2, 0, (c.g) null);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public enum t {
        NONE,
        POWER_OFF,
        AUDIO,
        HDMI_PLAYER,
        TV,
        TUNER,
        DAB,
        CD_INTERNAL,
        CD_RI,
        UPNP,
        NET_SERVICE,
        USB,
        NET_OLD
    }

    /* loaded from: classes.dex */
    public enum u {
        NONE,
        NEXT_UPDOWN,
        WAIT_RESPONSE,
        IGNORE,
        RI
    }

    /* loaded from: classes.dex */
    public static final class v {

        /* renamed from: a, reason: collision with root package name */
        public int f1704a;

        /* renamed from: b, reason: collision with root package name */
        public int f1705b;

        /* renamed from: c, reason: collision with root package name */
        public float f1706c;

        public v(int i, int i2, float f) {
            this.f1704a = i;
            this.f1705b = i2;
            this.f1706c = f;
        }
    }

    public static /* synthetic */ void d(MainActivity mainActivity) {
        mainActivity.V.a(0);
        if (mainActivity.J) {
            return;
        }
        TextView textView = mainActivity.H;
        b.b.a.a.b.l b2 = mainActivity.W.b();
        textView.setText(b2 != null ? a.b.k.r.a(b2.f755b, b2.i, b2.j) : "");
        mainActivity.I.c();
        mainActivity.V.a(0, 3000, new b.b.a.a.f.j(mainActivity));
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(b.b.a.a.b.r.i iVar) {
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.e eVar, l.a aVar) {
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(l.f fVar) {
    }

    @Override // b.b.a.a.b.r.l.c
    public void a(x xVar) {
    }

    public boolean b(boolean z) {
        boolean z2;
        b.b.a.a.f.o0.g gVar = c0.h.d;
        if (gVar != null) {
            gVar.f1607c.a(true, true);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && !z) {
            return true;
        }
        if (this.Q.getVisibility() == 0) {
            m();
            if (!z) {
                return true;
            }
        }
        x0 x0Var = this.T;
        if (x0Var != null) {
            x0Var.a();
            if (!z) {
                return true;
            }
        }
        if (this.F != null) {
            l();
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        n();
        Button button = this.O;
        b.b.a.a.b.h hVar = (b.b.a.a.b.h) this.W.a(b.b.a.a.b.o.r.MAIN);
        button.setEnabled((hVar.f755b.d || hVar.q.t) && this.W.b().h);
        b.b.a.a.b.o.h hVar2 = b.b.a.a.b.o.h.UNKNOWN;
        this.Y = hVar2;
        this.Z = hVar2;
        o();
        b.b.a.a.b.l b2 = this.W.b();
        if (b2.h) {
            l.a aVar = b2.q;
            if (aVar.f757a || aVar.l || aVar.m || aVar.i || aVar.j) {
                this.P.setEnabled(true);
                return;
            }
        }
        this.P.setEnabled(false);
    }

    public final void j() {
        this.s.setText(this.W.h());
        if (this.W.q() == 1) {
            this.t.setVisibility(8);
        } else {
            this.t.setVisibility(0);
            this.t.setText(this.W.b().f755b.f840c);
        }
        i();
    }

    public boolean k() {
        return b(true);
    }

    public void l() {
        if (this.F != null) {
            this.D.c();
            getFragmentManager().beginTransaction().setTransition(8194).remove(this.F).commit();
            this.F = null;
        }
    }

    public final void m() {
        if (this.Q.getVisibility() == 0) {
            b.b.a.a.f.c.a((View) this.Q, 0, (c.g) new i());
            View view = this.R.getView();
            if (view != null) {
                b.b.a.a.f.c.b(view, -view.getWidth(), (c.g) null);
            }
        }
    }

    public final void n() {
        this.V.a(0);
        this.I.a();
    }

    public final void o() {
        b.b.a.a.f.k0.g oVar;
        b.b.a.a.b.l b2 = this.W.b();
        if (b2.s) {
            return;
        }
        p();
        this.Y = b2.d();
        this.Z = b2.e();
        t b3 = b(b2);
        t tVar = this.a0;
        t tVar2 = t.UPNP;
        if (tVar == tVar2 && b3 == tVar2) {
            return;
        }
        t tVar3 = this.a0;
        t tVar4 = t.TUNER;
        if (tVar3 == tVar4 && b3 == tVar4) {
            this.b0.h();
            return;
        }
        a(false, false);
        switch (b3.ordinal()) {
            case 1:
                oVar = new b.b.a.a.f.k0.o();
                break;
            case 2:
                oVar = new b.b.a.a.f.k0.a();
                break;
            case 3:
                oVar = new b.b.a.a.f.k0.l();
                break;
            case 4:
                oVar = new b.b.a.a.f.k0.m();
                break;
            case 5:
                oVar = new b.b.a.a.f.k0.q();
                break;
            case 6:
                oVar = new b.b.a.a.f.k0.h();
                break;
            case 7:
                oVar = new b.b.a.a.f.k0.c();
                break;
            case 8:
                oVar = new b.b.a.a.f.k0.t();
                break;
            case 9:
                oVar = new b.b.a.a.f.k0.v.p();
                break;
            case 10:
                oVar = new b.b.a.a.f.k0.u.s();
                break;
            case 11:
                oVar = new b.b.a.a.f.k0.u.s();
                break;
            case 12:
                oVar = new b.b.a.a.f.k0.n();
                break;
            default:
                b3 = t.NONE;
                oVar = new b.b.a.a.f.k0.k();
                break;
        }
        this.a0 = b3;
        this.b0 = oVar;
        oVar.f1233c = new b.b.a.a.f.l(this);
        getFragmentManager().beginTransaction().disallowAddToBackStack().setTransition(4099).replace(R.id.control_page_container, oVar, "cp").commit();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (b(false)) {
            return;
        }
        this.b0.b();
    }

    @Override // a.b.k.h, a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        Log.v("Main", "onCreate");
        super.onCreate(bundle);
        a.b.k.r.b(this);
        requestWindowFeature(1);
        getWindow().setSoftInputMode(35);
        setContentView(R.layout.activity_main);
        h().d();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.main_root_frame);
        this.p = frameLayout;
        c0 c0Var = c0.h;
        c0Var.e = this;
        c0Var.f = frameLayout;
        c0Var.f1171a = 1;
        c0Var.f1172b = new Hashtable<>();
        c0Var.f1173c = new HashSet<>();
        ImageButton imageButton = (ImageButton) findViewById(R.id.sidebar_button);
        this.q = imageButton;
        imageButton.setOnClickListener(this.j0);
        ImageButton imageButton2 = (ImageButton) findViewById(R.id.settings_button);
        this.r = imageButton2;
        imageButton2.setOnClickListener(this.k0);
        this.s = (TextView) findViewById(R.id.device_name_label);
        this.t = (TextView) findViewById(R.id.zone_name_label);
        this.u = findViewById(R.id.selector_bkgnd_layout);
        View findViewById = findViewById(R.id.selector_bkgnd_prs);
        this.v = findViewById;
        this.w = new b.b.a.a.f.h(findViewById, 0, 300);
        ImageButton imageButton3 = (ImageButton) findViewById(R.id.back_button);
        this.x = imageButton3;
        imageButton3.setOnClickListener(this.l0);
        Button button = (Button) findViewById(R.id.now_playing_button);
        this.y = button;
        button.setOnClickListener(this.m0);
        Button button2 = (Button) findViewById(R.id.selector_button);
        this.z = button2;
        button2.setOnTouchListener(this.n0);
        this.z.setOnClickListener(this.o0);
        TextView textView = (TextView) findViewById(R.id.selector_name);
        this.A = textView;
        if (b.b.a.a.b.f.f == b.b.a.a.b.f.pioneer) {
            textView.setTypeface(Typeface.create("sans-serif-light", 0));
        }
        this.B = (ImageView) findViewById(R.id.selector_icon);
        View findViewById2 = findViewById(R.id.selector_down_mark);
        this.C = findViewById2;
        this.D = new b.b.a.a.f.h(findViewById2, 300, 300);
        this.E = (FrameLayout) findViewById(R.id.selector_list_parent);
        View findViewById3 = findViewById(R.id.volume_value_frame);
        this.G = findViewById3;
        findViewById3.setVisibility(8);
        this.H = (TextView) findViewById(R.id.volume_value_label);
        this.I = new b.b.a.a.f.h(this.G, 300, 300);
        View findViewById4 = findViewById(R.id.zone_popup_frame);
        this.K = findViewById4;
        findViewById4.setVisibility(8);
        this.L = (TextView) findViewById(R.id.zone_popup_label);
        this.M = new b.b.a.a.f.h(this.K, 300, 300);
        Button button3 = (Button) findViewById(R.id.remote_tb_button);
        this.N = button3;
        button3.setOnClickListener(this.p0);
        Button button4 = (Button) findViewById(R.id.volume_tb_button);
        this.O = button4;
        button4.setOnClickListener(this.q0);
        Button button5 = (Button) findViewById(R.id.audio_tb_button);
        this.P = button5;
        button5.setOnClickListener(this.r0);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.sidebar_parent_frame);
        this.Q = frameLayout2;
        frameLayout2.setBackgroundColor(0);
        this.Q.setOnClickListener(new j());
        this.R = new b.b.a.a.f.s();
        getFragmentManager().beginTransaction().replace(R.id.sidebar_parent_frame, this.R, "sidebar").disallowAddToBackStack().commit();
        this.S = (FrameLayout) findViewById(R.id.popup_parent_frame);
        this.V = new g0(this.U, 4);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // a.b.k.h, a.h.a.d, android.app.Activity
    public void onDestroy() {
        Log.v("Main", "onDestroy");
        super.onDestroy();
    }

    @Override // a.b.k.h, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 24) {
            c(true);
            return true;
        }
        if (i2 == 25) {
            c(false);
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 24 && i2 != 25) {
            return super.onKeyUp(i2, keyEvent);
        }
        a(false);
        return true;
    }

    @Override // a.h.a.d, android.app.Activity
    public void onPause() {
        Log.v("Main", "onPause");
        super.onPause();
        b(true);
        TipsFrame tipsFrame = this.c0;
        if (tipsFrame != null) {
            tipsFrame.a(true, false);
        }
        this.V.a();
        b.b.a.a.b.r.l lVar = this.X;
        if (lVar != null) {
            lVar.f980a.b(this);
        }
        b.b.a.a.b.p.d dVar = this.W;
        if (dVar != null) {
            dVar.x.b(this.t0);
        }
        d0.f1176b.f1177a = null;
        AlertDialog alertDialog = this.i0;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.i0 = null;
        }
        b.b.a.a.b.p.d dVar2 = this.W;
        if (dVar2 != null) {
            dVar2.y.b(this.s0);
        }
    }

    @Override // a.b.k.h, a.h.a.d, android.app.Activity
    public void onPostResume() {
        b.b.a.a.b.p.d dVar = this.W;
        if (dVar != null) {
            boolean z = false;
            if (dVar.f852c.f801c <= 2011) {
                b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
                if (a2.a(a2.a(this.W.f852c.f799a.g).f1127c)) {
                    a2.a(a2.a(this.W.f852c.f799a.g).f1127c, false);
                    this.i0 = new AlertDialog.Builder(this).setMessage(getString(R.string.restrictionMessage)).setNegativeButton(getString(R.string.close), new b.b.a.a.f.p(this)).setPositiveButton(getString(R.string.restrictionConfirm), new b.b.a.a.f.o(this)).setOnCancelListener(new b.b.a.a.f.n(this)).show();
                    z = true;
                }
            }
            if (!z) {
                this.V.a(2, 250, new q());
            }
        }
        super.onPostResume();
    }

    @Override // a.h.a.d, android.app.Activity, a.e.d.a.b
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (i2 == 1) {
            if (iArr[0] == 0) {
                this.W.b().a(this.W.p.a(b.b.a.a.b.o.e.THIS_DEVICE));
            } else {
                new AlertDialog.Builder(this).setTitle(R.string.accessStorage_title).setMessage(getString(R.string.accessStorage_message1) + "\n" + getString(R.string.accessStorage_message2)).setNegativeButton(R.string.close, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.goto_appinfo, new DialogInterface.OnClickListener() { // from class: b.b.a.a.f.b
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        MainActivity.this.a(dialogInterface, i3);
                    }
                }).setCancelable(false).show();
            }
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onResume() {
        Log.v("Main", "onResume");
        super.onResume();
        final RemoteApplication remoteApplication = (RemoteApplication) getApplication();
        remoteApplication.a(new RemoteApplication.c() { // from class: b.b.a.a.f.a
            @Override // com.onkyo.jp.onkyoremote.app.RemoteApplication.c
            public final void a(boolean z) {
                MainActivity.this.a(remoteApplication, z);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0045, code lost:
    
        if (r6.X.g() == b.b.a.a.b.o.e.THIS_DEVICE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0080, code lost:
    
        if (r6.X.g() != b.b.a.a.b.o.e.USB_REAR) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a0, code lost:
    
        if (r6.X.g() != b.b.a.a.b.o.e.THIS_DEVICE) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00bb, code lost:
    
        if (r6.X.g() != b.b.a.a.b.o.e.THIS_DEVICE) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r6.X.g() == b.b.a.a.b.o.e.THIS_DEVICE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d7, code lost:
    
        if (r6.X.g() == b.b.a.a.b.o.e.NET_TOP) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onkyo.jp.onkyoremote.view.MainActivity.p():void");
    }

    public final void q() {
        c0 c0Var = c0.h;
        c0Var.a(a.c.d, this.u);
        c0Var.a(a.c.e, this.q);
        c0Var.a(a.c.d, true);
        c0Var.a(a.c.e, true);
        c0Var.b();
    }

    public void showAudioSettingPopup(View view) {
        k();
        a(view, new b.b.a.a.f.m0.b(this, this.W), null);
    }

    public void showRemoteControlPopup(View view) {
        k();
        a(view, new c1(this, this.W), null);
    }

    public void showVolumePopup(View view) {
        z0 z0Var;
        b.b.a.a.b.h hVar = (b.b.a.a.b.h) this.W.a(b.b.a.a.b.o.r.MAIN);
        k();
        n();
        if (hVar.f755b.d) {
            this.J = true;
            if (this.W.b().f755b.d) {
                z0Var = new m2(this, this.U, this.W);
            } else {
                z0Var = new a1(this, this.U, this.W);
            }
        } else if (hVar.q.t) {
            this.J = true;
            z0Var = new f1(this, this.W);
        } else {
            z0Var = null;
        }
        if (z0Var != null) {
            a(view, z0Var, new k());
        }
    }

    public final void c(boolean z) {
        b.b.a.a.b.p.d dVar = this.W;
        if (dVar == null || this.d0 != u.NONE) {
            return;
        }
        b.b.a.a.b.l b2 = dVar.b();
        b.b.a.a.b.o.s sVar = b2.f755b;
        if (sVar.d) {
            this.d0 = u.NEXT_UPDOWN;
            this.e0 = z;
            this.f0 = 0L;
            a(b2);
            if (this.d0 == u.WAIT_RESPONSE) {
                this.g0 = 500;
                this.V.a(3, 50, 50, new r(b2));
                return;
            }
            return;
        }
        if (sVar.f839b == b.b.a.a.b.o.r.MAIN && b2.q.t) {
            b.b.a.a.b.m.e eVar = new b.b.a.a.b.m.e(this.W);
            this.d0 = u.RI;
            if (z) {
                eVar.a("MVLUP");
            } else {
                eVar.a("MVLDOWN");
            }
            this.V.a(3, 500, 250, new b.b.a.a.f.q(this, z, eVar));
            return;
        }
        this.d0 = u.IGNORE;
    }

    public /* synthetic */ void a(RemoteApplication remoteApplication, boolean z) {
        if (z) {
            b.b.a.a.b.p.d b2 = remoteApplication.b();
            this.W = b2;
            if (b2 != null) {
                if (!b2.i()) {
                    RemoteApplication.a(this, false);
                    return;
                }
                remoteApplication.c().startDiscovery();
                b.b.a.a.b.p.d dVar = this.W;
                dVar.y.a((d.h) this.s0);
                d0.f1176b.f1177a = this.u0;
                b.b.a.a.b.o.h hVar = b.b.a.a.b.o.h.UNKNOWN;
                this.Y = hVar;
                this.Z = hVar;
                this.X = this.W.q;
                j();
                this.d0 = u.NONE;
                this.f0 = 0L;
                this.g0 = 0;
                b.b.a.a.b.p.d dVar2 = this.W;
                dVar2.x.a((d.m) this.t0);
                this.X.f980a.a((l.d) this);
                a.b.k.r.a((View) this.p, (i0) new p());
                return;
            }
        }
        RemoteApplication.a(this);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0056. Please report as an issue. */
    public final t b(b.b.a.a.b.l lVar) {
        int i2;
        if (!lVar.h) {
            return t.POWER_OFF;
        }
        if (lVar.f755b.f839b != b.b.a.a.b.o.r.MAIN && (((i2 = this.W.f852c.f801c) == 2010 || i2 == 2011) && ((b.b.a.a.b.o.i.b(lVar.d()) || b.b.a.a.b.o.i.d(lVar.d())) && this.X.g() != b.b.a.a.b.o.e.THIS_DEVICE))) {
            return t.NONE;
        }
        t tVar = t.AUDIO;
        int ordinal = lVar.d().ordinal();
        if (ordinal != 10) {
            if (ordinal != 12) {
                if (ordinal != 32) {
                    switch (ordinal) {
                        case 16:
                            l.a aVar = lVar.q;
                            if (aVar.v) {
                                return t.CD_INTERNAL;
                            }
                            if (aVar.z) {
                                if (this.W.f852c.K) {
                                    return t.AUDIO;
                                }
                                return t.TV;
                            }
                            if (aVar.u) {
                                return t.CD_RI;
                            }
                            break;
                        case 17:
                        case 18:
                            return t.TUNER;
                        default:
                            switch (ordinal) {
                                case 20:
                                    if (this.X.g() == b.b.a.a.b.o.e.THIS_DEVICE) {
                                        return t.UPNP;
                                    }
                                    if (this.W.f852c.f801c <= 2009) {
                                        return t.NET_OLD;
                                    }
                                    return t.NET_SERVICE;
                                case 21:
                                    if (this.W.f852c.f801c <= 2009) {
                                        return t.NET_OLD;
                                    }
                                    return t.NET_SERVICE;
                                case 22:
                                case 23:
                                case 25:
                                    if (this.W.f852c.f801c <= 2009) {
                                        return t.NET_OLD;
                                    }
                                    return t.USB;
                                case 24:
                                    int ordinal2 = this.X.g().ordinal();
                                    if (ordinal2 == 26) {
                                        return t.NONE;
                                    }
                                    if (ordinal2 != 27) {
                                        return t.NET_SERVICE;
                                    }
                                    return t.UPNP;
                            }
                    }
                } else {
                    return t.DAB;
                }
            } else if (lVar.q.z) {
                return t.TV;
            }
        } else if (lVar.q.x) {
            return t.AUDIO;
        }
        return tVar;
    }

    public final void a(b.b.a.a.b.l lVar) {
        if (this.W == null) {
            return;
        }
        if (this.d0 == u.WAIT_RESPONSE && System.currentTimeMillis() > this.f0 + 1500) {
            Log.v("Volume", "No Response");
            this.d0 = u.NEXT_UPDOWN;
            this.f0 = 0L;
            this.g0 = 0;
        }
        if (this.d0 == u.NEXT_UPDOWN) {
            if (this.f0 == 0 || System.currentTimeMillis() - this.f0 >= this.g0) {
                StringBuilder a2 = b.a.a.a.a.a("Volume ");
                a2.append(this.e0 ? "Up" : "Down");
                Log.v("Volume", a2.toString());
                this.d0 = u.WAIT_RESPONSE;
                this.f0 = System.currentTimeMillis();
                this.h0 = lVar.j;
                if (this.e0) {
                    lVar.f754a.a(lVar.f756c.f753c, "UP");
                } else {
                    lVar.f754a.a(lVar.f756c.f753c, "DOWN");
                }
                if (this.e0) {
                    int i2 = lVar.j + 1;
                    b.b.a.a.b.o.s sVar = lVar.f755b;
                    if (i2 >= (sVar.f + sVar.e) / 2) {
                        this.d0 = u.IGNORE;
                        return;
                    }
                }
                this.g0 = 250;
            }
        }
    }

    /* loaded from: classes.dex */
    public class n implements d.l {
        public n() {
        }

        @Override // b.b.a.a.b.p.d.k
        public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
            if (z) {
                int ordinal = fVar.ordinal();
                if (ordinal == 1) {
                    MainActivity.this.a(true);
                    MainActivity.this.j();
                    MainActivity mainActivity = MainActivity.this;
                    if (mainActivity.W.q() > 1) {
                        mainActivity.L.setText(mainActivity.W.b().f755b.f840c);
                        mainActivity.M.c();
                        mainActivity.V.a(1, 1000, new b.b.a.a.f.k(mainActivity));
                        return;
                    }
                    return;
                }
                if (ordinal == 2) {
                    MainActivity.this.i();
                    return;
                }
                if (ordinal == 3) {
                    MainActivity.d(MainActivity.this);
                    return;
                }
                if (ordinal == 4) {
                    MainActivity mainActivity2 = MainActivity.this;
                    if (mainActivity2.d0 == u.WAIT_RESPONSE) {
                        if (Math.abs(mainActivity2.W.b().j - MainActivity.this.h0) <= 1) {
                            MainActivity.this.d0 = u.NEXT_UPDOWN;
                        } else {
                            MainActivity.this.a(true);
                        }
                    }
                    MainActivity.d(MainActivity.this);
                    return;
                }
                if (ordinal != 5) {
                    return;
                }
                b.b.a.a.b.o.h d = MainActivity.this.W.b().d();
                MainActivity mainActivity3 = MainActivity.this;
                if (d == mainActivity3.Y && mainActivity3.W.b().e() == MainActivity.this.Z) {
                    return;
                }
                MainActivity.this.o();
            }
        }

        @Override // b.b.a.a.b.p.d.l
        public void a(b.b.a.a.b.q.a aVar) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.a(null, new b.b.a.a.f.m0.a(mainActivity, aVar), null);
        }
    }

    public final void a(boolean z) {
        if (this.d0 != u.NONE) {
            Log.v("Volume", "HW Volume cancelled");
        }
        this.V.a(3);
        this.d0 = (this.d0 == u.NONE || !z) ? u.NONE : u.IGNORE;
        this.f0 = 0L;
        this.g0 = 0;
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        try {
            startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + getPackageName())));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static /* synthetic */ void b(MainActivity mainActivity, boolean z) {
        if (z) {
            if (mainActivity.b0.a()) {
                mainActivity.k();
                mainActivity.startActivity(new Intent(mainActivity, (Class<?>) RootSettingsActivity.class));
                return;
            }
            return;
        }
        mainActivity.q();
    }

    public void a(View view, z0 z0Var, v0 v0Var) {
        x0 x0Var = this.T;
        if (x0Var != null) {
            z0 z0Var2 = x0Var.f1548b;
            if (z0Var2 != null) {
                z0Var2.h();
            }
            this.T = null;
        }
        if (view != null) {
            view.setSelected(true);
        }
        x0 x0Var2 = new x0(this, z0Var);
        this.T = x0Var2;
        z0Var.g = view;
        z0Var.d = new l(x0Var2, view, v0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        FrameLayout frameLayout = this.S;
        x0.a aVar = new x0.a(x0Var2.f1547a);
        x0Var2.d = aVar;
        aVar.setBackgroundColor(0);
        z0 z0Var3 = x0Var2.f1548b;
        x0.a aVar2 = x0Var2.d;
        View b2 = z0Var3.b();
        z0Var3.f = b2;
        z0Var3.e = aVar2;
        x0Var2.f1549c = b2;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        x0Var2.f1548b.a(layoutParams2);
        x0Var2.d.addView(x0Var2.f1549c, layoutParams2);
        a.b.k.r.a((View) x0Var2.d, (i0) new w0(x0Var2));
        frameLayout.addView(x0Var2.d, layoutParams);
        this.S.setVisibility(0);
    }

    public void a(boolean z, boolean z2) {
        this.x.setVisibility(z ? 0 : 4);
        this.y.setVisibility(z2 ? 0 : 4);
    }

    public static /* synthetic */ void a(MainActivity mainActivity, View view, String str, d0.b bVar) {
        if (mainActivity != null) {
            v vVar = v0[bVar.f1179b];
            int applyDimension = (int) TypedValue.applyDimension(1, 10.0f, mainActivity.getResources().getDisplayMetrics());
            TipsFrame tipsFrame = mainActivity.c0;
            if (tipsFrame != null) {
                tipsFrame.a(true, true);
                mainActivity.c0 = null;
            }
            TipsFrame tipsFrame2 = new TipsFrame(mainActivity);
            mainActivity.c0 = tipsFrame2;
            tipsFrame2.setOrientation(1);
            mainActivity.c0.setBackgroundColor(mainActivity.getResources().getColor(vVar.f1704a));
            mainActivity.c0.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
            mainActivity.c0.setDelegate(new b.b.a.a.f.m(mainActivity));
            TextView textView = new TextView(mainActivity);
            textView.setId(R.id.title_label);
            textView.setText(str);
            textView.setTextColor(mainActivity.getResources().getColor(vVar.f1705b));
            textView.setTextSize(vVar.f1706c);
            mainActivity.c0.addView(textView, new LinearLayout.LayoutParams(-2, -2));
            mainActivity.c0.a(mainActivity.p, view);
            return;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r6.f808a == r2) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // b.b.a.a.b.r.l.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(b.b.a.a.b.o.f r5, b.b.a.a.b.o.f r6) {
        /*
            r4 = this;
            b.b.a.a.b.p.d r0 = r4.W
            b.b.a.a.b.l r0 = r0.b()
            b.b.a.a.b.o.h r0 = r0.d()
            boolean r0 = b.b.a.a.b.o.i.a(r0)
            if (r0 == 0) goto L43
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L16
        L14:
            r0 = 1
            goto L3a
        L16:
            b.b.a.a.b.p.d r2 = r4.W
            b.b.a.a.b.l r2 = r2.b()
            com.onkyo.jp.onkyoremote.view.MainActivity$t r2 = r4.b(r2)
            com.onkyo.jp.onkyoremote.view.MainActivity$t r3 = r4.a0
            if (r2 == r3) goto L25
            goto L14
        L25:
            b.b.a.a.b.o.e r2 = r5.f808a
            b.b.a.a.b.o.e r3 = b.b.a.a.b.o.e.THIS_DEVICE
            if (r2 != r3) goto L2f
            b.b.a.a.b.o.e r2 = r6.f808a
            if (r2 != r3) goto L14
        L2f:
            b.b.a.a.b.o.e r5 = r5.f808a
            b.b.a.a.b.o.e r2 = b.b.a.a.b.o.e.THIS_DEVICE
            if (r5 == r2) goto L3a
            b.b.a.a.b.o.e r5 = r6.f808a
            if (r5 != r2) goto L3a
            goto L14
        L3a:
            if (r0 == 0) goto L40
            r4.o()
            goto L43
        L40:
            r4.p()
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onkyo.jp.onkyoremote.view.MainActivity.a(b.b.a.a.b.o.f, b.b.a.a.b.o.f):void");
    }
}
