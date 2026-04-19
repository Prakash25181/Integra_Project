package b.b.a.a.f.k0.u;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.r.v;
import b.b.a.a.d.a;
import b.b.a.a.f.c0;
import b.b.a.a.f.g0;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.ScrollLabel;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: NetUsbPlaybackPage.java */
/* loaded from: classes.dex */
public class o extends n implements v.c {
    public v A;
    public Drawable B;
    public Drawable C;
    public Drawable D;
    public Drawable E;
    public a.c F;
    public g0 G;
    public boolean H;
    public boolean I;
    public StepSlideBar.a J;
    public View.OnClickListener K;
    public View.OnTouchListener L;
    public View.OnTouchListener M;
    public View e;
    public ImageView f;
    public View g;
    public View h;
    public ImageButton i;
    public ImageButton j;
    public ImageButton k;
    public ScrollLabel l;
    public ScrollLabel m;
    public ScrollLabel n;
    public View o;
    public TextView p;
    public TextView q;
    public StepSlideBar r;
    public StepSlideBar s;
    public ImageButton t;
    public ImageButton u;
    public ImageButton v;
    public ImageButton w;
    public ImageButton x;
    public ImageButton y;
    public b.b.a.a.b.r.l z;

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            o oVar = o.this;
            oVar.p.setText(oVar.A.a(i));
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
            o oVar = o.this;
            v vVar = oVar.A;
            int userValue = oVar.r.getUserValue();
            b.b.a.a.b.p.d dVar = vVar.r;
            if (dVar.f852c.G) {
                int i = userValue / 3600;
                dVar.a(b.b.a.a.b.p.v.a.NTS, String.format("%02d:%02d:%02d", Integer.valueOf(i), Integer.valueOf((userValue - (i * 3600)) / 60), Integer.valueOf(userValue % 60)));
            } else {
                dVar.a(b.b.a.a.b.p.v.a.NTS, String.format("%02d:%02d", Integer.valueOf(userValue / 60), Integer.valueOf(userValue % 60)));
            }
            vVar.B = System.currentTimeMillis();
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v vVar = o.this.A;
            if (vVar.f1010b == v.h.PLAY) {
                if (!vVar.b()) {
                    o.this.A.s.a("PAUSE");
                    return;
                } else {
                    o.this.A.f();
                    return;
                }
            }
            vVar.s.a("PLAY");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                o.a(o.this, false);
            } else if (action == 1) {
                o.a(o.this, true, false);
            } else if (action == 3) {
                o.a(o.this, false, false);
            }
            return false;
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                o.a(o.this, true);
            } else if (action == 1) {
                o.a(o.this, true, true);
            } else if (action == 3) {
                o.a(o.this, false, true);
            }
            return false;
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o oVar = o.this;
            if (oVar.h.getVisibility() != 0) {
                oVar.G.a(0);
                if (oVar.g.getVisibility() == 0) {
                    b.b.a.a.f.c.a(oVar.g, 8);
                }
                b.b.a.a.f.c.a(oVar.h);
                b.b.a.a.f.c.a(oVar.s, 4);
                b.b.a.a.f.c.c(oVar.o, 0, null);
                b.b.a.a.f.c.a(oVar.w, oVar.A.f1011c != v.f.DISABLE);
                b.b.a.a.f.c.a(oVar.x, oVar.A.d != v.e.DISABLE);
                b.b.a.a.f.c.a(oVar.y, 4);
            }
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o oVar = o.this;
            if (oVar.h.getVisibility() == 0) {
                b.b.a.a.f.c.a(oVar.h, 4);
                b.b.a.a.f.c.a(oVar.s);
                View view2 = oVar.o;
                b.b.a.a.f.c.c(view2, view2.getHeight(), null);
                b.b.a.a.f.c.a(oVar.w, 4);
                b.b.a.a.f.c.a(oVar.x, 4);
                b.b.a.a.f.c.a(oVar.y, oVar.z.b());
            }
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.A.s.a("REPEAT");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.A.s.a("RANDOM");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class i implements View.OnClickListener {
        public i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.A.r.a(b.b.a.a.b.p.v.a.NTC, "F1");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.A.r.a(b.b.a.a.b.p.v.a.NTC, "F2");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.A.r.a(b.b.a.a.b.p.v.a.NTC, "MENU");
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class l implements View.OnClickListener {
        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o oVar = o.this;
            if (oVar.z.g() == b.b.a.a.b.o.e.SPOTIFY) {
                try {
                    Intent launchIntentForPackage = oVar.f1597b.getPackageManager().getLaunchIntentForPackage("com.spotify.music");
                    if (launchIntentForPackage != null) {
                        oVar.f1597b.startActivity(launchIntentForPackage);
                    } else {
                        oVar.f1597b.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.spotify.music")));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* compiled from: NetUsbPlaybackPage.java */
    /* loaded from: classes.dex */
    public class m implements i0 {

        /* compiled from: NetUsbPlaybackPage.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.b.a.a.f.c.a(o.this.g, 8);
            }
        }

        /* compiled from: NetUsbPlaybackPage.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.a(true);
            }
        }

        public m() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            int height = (int) (o.this.d.getHeight() - TypedValue.applyDimension(1, 100.0f, o.this.f1597b.getResources().getDisplayMetrics()));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) o.this.e.getLayoutParams();
            layoutParams.width = o.this.d.getWidth();
            layoutParams.height = Math.min(o.this.d.getWidth(), height);
            o.this.e.setLayoutParams(layoutParams);
            o.this.o.setTranslationY(r0.getHeight());
            b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
            if (a2 != null) {
                if (a2.a(b.b.a.a.d.a.f1116b.f)) {
                    b.b.a.a.d.a a3 = b.b.a.a.d.a.a();
                    if (a3 != null) {
                        a3.a(b.b.a.a.d.a.f1116b.f, false);
                        o.this.g.setVisibility(0);
                        o.this.G.a(0, 5000, new a());
                    } else {
                        throw null;
                    }
                } else {
                    o.this.g.setVisibility(8);
                }
                o.this.G.a(1, 1000, new b());
                o oVar = o.this;
                oVar.a(oVar.A.f1010b);
                oVar.g();
                oVar.c();
                oVar.l.setText(oVar.A.g);
                oVar.m.setText(oVar.A.f);
                oVar.n.setText(oVar.A.e);
                Bitmap bitmap = oVar.A.l;
                if (bitmap != null) {
                    oVar.f.setImageBitmap(bitmap);
                } else {
                    oVar.f.setImageDrawable(oVar.E);
                }
                oVar.a(v.a.SEEK_CAPABILITY);
                oVar.a(v.a.MENU_STATUS);
                return;
            }
            throw null;
        }
    }

    public o(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.J = new a();
        this.K = new b();
        this.L = new c();
        this.M = new d();
        b.b.a.a.b.r.l lVar = dVar.q;
        this.z = lVar;
        this.A = lVar.k();
        this.G = new g0(new Handler(), 3);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.A.f1009a.a((v.d) this);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_playback);
        this.e = (FrameLayout) a2.findViewById(R.id.album_art_frame);
        this.f = (ImageView) a2.findViewById(R.id.album_art_view);
        this.g = a2.findViewById(R.id.artwork_tap_tips_view);
        this.h = a2.findViewById(R.id.info_frame);
        this.i = (ImageButton) a2.findViewById(R.id.track_menu_button);
        this.j = (ImageButton) a2.findViewById(R.id.menu1_button);
        this.k = (ImageButton) a2.findViewById(R.id.menu2_button);
        this.l = (ScrollLabel) a2.findViewById(R.id.artist_label);
        this.m = (ScrollLabel) a2.findViewById(R.id.album_label);
        this.n = (ScrollLabel) a2.findViewById(R.id.title_label);
        this.o = a2.findViewById(R.id.time_frame);
        this.p = (TextView) a2.findViewById(R.id.time_label);
        this.q = (TextView) a2.findViewById(R.id.dur_label);
        this.r = (StepSlideBar) a2.findViewById(R.id.seek_bar);
        this.s = (StepSlideBar) a2.findViewById(R.id.progress_bar);
        this.t = (ImageButton) a2.findViewById(R.id.play_button);
        this.u = (ImageButton) a2.findViewById(R.id.prev_button);
        this.v = (ImageButton) a2.findViewById(R.id.next_button);
        this.w = (ImageButton) a2.findViewById(R.id.repeat_button);
        this.x = (ImageButton) a2.findViewById(R.id.random_button);
        this.y = (ImageButton) a2.findViewById(R.id.app_link_button);
        Resources resources = this.f1597b.getResources();
        this.B = resources.getDrawable(R.drawable.control_play);
        this.C = resources.getDrawable(R.drawable.control_pause);
        this.D = resources.getDrawable(R.drawable.control_stop);
        Drawable drawable = resources.getDrawable(R.drawable.jct_album_art);
        this.E = drawable;
        this.f.setImageDrawable(drawable);
        if (this.z.b() && this.z.f() != null) {
            this.y.setImageDrawable(this.z.f().f);
            this.y.setVisibility(0);
        } else {
            this.y.setVisibility(4);
            c0 c0Var = c0.h;
            c0Var.f1172b.remove(a.c.f);
        }
        this.f.setOnClickListener(new e());
        this.h.setVisibility(4);
        this.h.setOnClickListener(new f());
        this.r.setDelegate(this.J);
        this.t.setOnClickListener(this.K);
        this.u.setOnTouchListener(this.L);
        this.v.setOnTouchListener(this.M);
        this.w.setOnClickListener(new g());
        this.x.setOnClickListener(new h());
        this.j.setOnClickListener(new i());
        this.k.setOnClickListener(new j());
        this.i.setOnClickListener(new k());
        this.y.setOnClickListener(new l());
        a.b.k.r.a(a2, (i0) new m());
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.b.r.v.c
    public void c() {
        Resources resources = this.f1597b.getResources();
        v.f fVar = this.A.f1011c;
        if (fVar != v.f.DISABLE) {
            int ordinal = fVar.ordinal();
            int i2 = R.drawable.repeat_off;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i2 = R.drawable.repeat_all;
                } else if (ordinal == 2) {
                    i2 = R.drawable.repeat_folder;
                } else if (ordinal == 3) {
                    i2 = R.drawable.repeat_one;
                }
            }
            this.w.setImageDrawable(resources.getDrawable(i2));
            this.w.setVisibility(this.h.getVisibility() == 0 ? 0 : 4);
        } else {
            this.w.setVisibility(4);
        }
        v.e eVar = this.A.d;
        if (eVar != v.e.DISABLE) {
            int ordinal2 = eVar.ordinal();
            int i3 = R.drawable.random_off;
            if (ordinal2 != 0 && (ordinal2 == 1 || ordinal2 == 2 || ordinal2 == 3)) {
                i3 = R.drawable.random_all;
            }
            this.x.setImageDrawable(resources.getDrawable(i3));
            this.x.setVisibility(this.h.getVisibility() != 0 ? 4 : 0);
            return;
        }
        this.x.setVisibility(4);
    }

    public void g() {
        int i2;
        int i3;
        v vVar = this.A;
        if ((vVar.b() || vVar.i == -1) ? false : true) {
            i2 = this.A.i;
            if (i2 == -1) {
                i2 = 0;
            }
            if (!this.r.p) {
                TextView textView = this.p;
                v vVar2 = this.A;
                textView.setText(vVar2.a(vVar2.i));
            }
            this.p.setVisibility(0);
        } else {
            this.p.setVisibility(4);
            i2 = 0;
        }
        v vVar3 = this.A;
        if ((vVar3.b() || vVar3.h == -1) ? false : true) {
            i3 = this.A.h;
            if (i3 == -1) {
                i3 = 0;
            }
            TextView textView2 = this.q;
            v vVar4 = this.A;
            textView2.setText(vVar4.a(vVar4.h));
            this.q.setVisibility(0);
        } else {
            this.q.setVisibility(4);
            i3 = 0;
        }
        this.r.a(0, i3, 1.0f);
        this.s.a(0, i3, 1.0f);
        this.s.setValue(i2);
        StepSlideBar stepSlideBar = this.r;
        if (stepSlideBar.p) {
            return;
        }
        stepSlideBar.setValue(i2);
    }

    public final void a(boolean z) {
        a.c cVar = (this.z.b() && this.z.f() != null && this.z.g() == b.b.a.a.b.o.e.SPOTIFY) ? a.c.f : null;
        c0 c0Var = c0.h;
        if (z) {
            if (cVar != null) {
                this.F = cVar;
                c0Var.f1172b.put(cVar, this.y);
                c0Var.a();
                c0Var.a(cVar, true);
                return;
            }
            return;
        }
        a.c cVar2 = this.F;
        if (cVar2 != null) {
            c0Var.a(cVar2, false);
            c0Var.f1172b.remove(this.F);
            this.F = null;
        }
    }

    public static /* synthetic */ void a(o oVar, boolean z) {
        oVar.G.a(2);
        oVar.H = true;
        v vVar = oVar.A;
        if (vVar.r.f852c.f801c < 2016 && !vVar.b()) {
            oVar.I = false;
            oVar.G.a(2, 750, new p(oVar, z));
        }
    }

    public static /* synthetic */ void a(o oVar, boolean z, boolean z2) {
        oVar.G.a(2);
        if (oVar.H) {
            oVar.H = false;
            if (z) {
                if (z2) {
                    oVar.A.s.a("TRUP");
                } else {
                    oVar.A.s.a("TRDN");
                }
            }
        } else if (oVar.I) {
            oVar.A.s.a("PLAY");
        }
        oVar.u.setEnabled(true);
        oVar.v.setEnabled(true);
    }

    @Override // b.b.a.a.b.r.v.c
    public void a(v.h hVar) {
        this.v.setSelected(hVar == v.h.FF);
        this.u.setSelected(hVar == v.h.REW);
        if (hVar == v.h.PLAY) {
            if (!this.A.b()) {
                this.t.setImageDrawable(this.C);
                this.r.a();
                return;
            } else {
                this.t.setImageDrawable(this.D);
                return;
            }
        }
        this.t.setImageDrawable(this.B);
        this.r.a();
    }

    @Override // b.b.a.a.b.r.v.c
    public void a(v.a aVar) {
        switch (aVar) {
            case CONTENT_CHANGE:
                this.l.setText("");
                this.m.setText("");
                this.n.setText("");
                this.r.setValue(0);
                this.s.setValue(0);
                this.f.setImageDrawable(this.E);
                return;
            case ARTIST:
                this.l.setText(this.A.g);
                return;
            case ALBUM:
                this.m.setText(this.A.f);
                return;
            case TITLE:
                this.n.setText(this.A.e);
                return;
            case TIME:
            case DURATION:
                g();
                return;
            case TRACK:
            default:
                return;
            case JACKET_IMAGE:
                Bitmap bitmap = this.A.l;
                if (bitmap != null) {
                    this.f.setImageBitmap(bitmap);
                    return;
                } else {
                    this.f.setImageDrawable(this.E);
                    return;
                }
            case SEEK_CAPABILITY:
                int i2 = this.A.o == v.i.ELLAPSE_TOTAL ? 0 : 4;
                this.r.setEnabled(this.A.n == v.g.POSSIBLE);
                this.r.setVisibility(i2);
                this.s.setVisibility(this.h.getVisibility() != 0 ? i2 : 4);
                return;
            case MENU_STATUS:
                a(this.j, this.A.p);
                a(this.k, this.A.q);
                this.i.setVisibility(this.A.m ? 0 : 4);
                return;
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.G.a();
        this.A.f1009a.b(this);
        a(false);
    }

    public final void a(ImageButton imageButton, v.b bVar) {
        Drawable c2 = bVar != v.b.NONE ? a.b.k.r.c(String.format("ic_rating_0x%02x", Integer.valueOf(bVar.f1015b))) : null;
        if (c2 != null) {
            imageButton.setVisibility(0);
            imageButton.setImageDrawable(c2);
        } else {
            imageButton.setVisibility(4);
        }
    }
}
