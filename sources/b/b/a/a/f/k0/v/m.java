package b.b.a.a.f.k0.v;

import a.b.k.r;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.u.d;
import b.b.a.a.c.d;
import b.b.a.a.f.g0;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.ScrollLabel;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: UpnpPlaybackPage.java */
/* loaded from: classes.dex */
public class m extends b.b.a.a.f.k0.v.e implements d.c {
    public Drawable A;
    public Drawable B;
    public Drawable C;
    public g0 D;
    public AlertDialog E;
    public StepSlideBar.a F;
    public b.b.a.a.c.c G;
    public View f;
    public ImageView g;
    public View h;
    public View i;
    public ScrollLabel j;
    public ScrollLabel k;
    public ScrollLabel l;
    public View m;
    public TextView n;
    public TextView o;
    public StepSlideBar p;
    public StepSlideBar q;
    public ImageButton r;
    public ImageButton s;
    public ImageButton t;
    public ImageButton u;
    public ImageButton v;
    public View w;
    public b.b.a.a.b.p.d x;
    public b.b.a.a.b.u.d y;
    public d.g z;

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class a implements b.b.a.a.c.c {
        public a() {
        }

        @Override // b.b.a.a.c.c
        public void a(Drawable drawable) {
            m.this.g.setImageDrawable(drawable);
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m mVar = m.this;
            if (mVar.i.getVisibility() != 0) {
                mVar.D.a(0);
                if (mVar.h.getVisibility() == 0) {
                    b.b.a.a.f.c.a(mVar.h, 8);
                }
                b.b.a.a.f.c.a(mVar.i);
                b.b.a.a.f.c.a(mVar.q, 4);
                b.b.a.a.f.c.c(mVar.m, 0, null);
                b.b.a.a.f.c.a(mVar.u);
                b.b.a.a.f.c.a(mVar.v);
            }
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m mVar = m.this;
            if (mVar.i.getVisibility() == 0) {
                b.b.a.a.f.c.a(mVar.i, 4);
                b.b.a.a.f.c.a(mVar.q);
                View view2 = mVar.m;
                b.b.a.a.f.c.c(view2, view2.getHeight(), null);
                b.b.a.a.f.c.a(mVar.u, 4);
                b.b.a.a.f.c.a(mVar.v, 4);
            }
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int c2 = m.this.y.c();
            if (c2 == 1) {
                m.this.x.u.a();
                return;
            }
            if (c2 == 3) {
                b.b.a.a.b.u.d dVar = m.this.y;
                if (dVar != null) {
                    Log.v("UPnP", "Resume");
                    dVar.e = false;
                    dVar.f1068a.restart(null);
                    return;
                }
                throw null;
            }
            if (c2 != 4) {
                return;
            }
            b.b.a.a.b.u.d dVar2 = m.this.y;
            if (dVar2 != null) {
                Log.v("UPnP", "Pause");
                dVar2.e = false;
                dVar2.f1068a.pause();
                return;
            }
            throw null;
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.u.d dVar = m.this.y;
            if (dVar != null) {
                Log.v("UPnP", "previousTrack");
                if (dVar.f == null) {
                    return;
                }
                dVar.stop();
                dVar.e = true;
                if (dVar.d == 0) {
                    int i = dVar.g;
                    if (i > 0) {
                        dVar.b(i - 1);
                    } else {
                        dVar.b(((b.b.a.a.c.g) dVar.f).a() - 1);
                    }
                } else {
                    dVar.a(0, true);
                    dVar.b(0);
                }
                int i2 = dVar.f1069b;
                if (i2 == 1 || i2 == 0) {
                    dVar.b();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.u.d dVar = m.this.y;
            if (dVar != null) {
                Log.v("UPnP", "nextTrack");
                if (dVar.f == null) {
                    return;
                }
                dVar.stop();
                dVar.e = true;
                if (dVar.g < ((b.b.a.a.c.g) dVar.f).a() - 1) {
                    dVar.b(dVar.g + 1);
                } else {
                    dVar.a(0, true);
                    dVar.b(0);
                }
                int i = dVar.f1069b;
                if (i == 1 || i == 0) {
                    dVar.b();
                    return;
                }
                return;
            }
            throw null;
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.u.d dVar = m.this.y;
            int i = dVar.f1070c;
            if (i == 0) {
                dVar.c(1);
            } else if (i == 1) {
                dVar.c(2);
            } else if (i == 2) {
                dVar.c(0);
            }
            m.this.h();
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.u.d dVar = m.this.y;
            int i = dVar.d == 0 ? 1 : 0;
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("invalid random mode");
            }
            if (dVar.d != i) {
                dVar.d = i;
                b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
                int i2 = dVar.d;
                if (a2 != null) {
                    a2.a(b.b.a.a.d.a.f1116b.f1121c, i2);
                    if (dVar.f != null) {
                        dVar.a(dVar.g, false);
                    }
                } else {
                    throw null;
                }
            }
            m.this.g();
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class i implements i0 {

        /* compiled from: UpnpPlaybackPage.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.b.a.a.f.c.a(m.this.h, 8);
            }
        }

        public i() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            int height = (int) (m.this.d.getHeight() - TypedValue.applyDimension(1, 100.0f, m.this.f1597b.getResources().getDisplayMetrics()));
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m.this.f.getLayoutParams();
            layoutParams.width = m.this.d.getWidth();
            layoutParams.height = Math.min(m.this.d.getWidth(), height);
            m.this.f.setLayoutParams(layoutParams);
            m.this.m.setTranslationY(r0.getHeight());
            b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
            if (a2 != null) {
                if (a2.a(b.b.a.a.d.a.f1116b.f)) {
                    b.b.a.a.d.a a3 = b.b.a.a.d.a.a();
                    if (a3 != null) {
                        a3.a(b.b.a.a.d.a.f1116b.f, false);
                        m.this.h.setVisibility(0);
                        m.this.D.a(0, 5000, new a());
                        return;
                    }
                    throw null;
                }
                m.this.h.setVisibility(8);
                return;
            }
            throw null;
        }
    }

    /* compiled from: UpnpPlaybackPage.java */
    /* loaded from: classes.dex */
    public class j implements StepSlideBar.a {
        public j() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            m mVar = m.this;
            TextView textView = mVar.n;
            d.g gVar = mVar.y.h;
            textView.setText(gVar != null ? gVar.a(i) : "");
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
            m mVar = m.this;
            b.b.a.a.b.u.d dVar = mVar.y;
            int userValue = mVar.p.getUserValue();
            dVar.k = userValue;
            dVar.f1068a.seekTo(userValue);
        }
    }

    public m(Context context, b.b.a.a.b.p.d dVar) {
        super(context, null);
        this.F = new j();
        this.G = new a();
        this.x = dVar;
        this.y = dVar.u;
        this.D = new g0(new Handler(), 1);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        b.b.a.a.b.u.d dVar = this.y;
        if (dVar.m == null) {
            dVar.m = this;
        } else {
            Log.w("UPnP", "UpnpPlayer.addDelegate is ignored");
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_upnp_playback);
        this.f = a2.findViewById(R.id.album_art_frame);
        this.g = (ImageView) a2.findViewById(R.id.album_art_view);
        this.h = a2.findViewById(R.id.artwork_tap_tips_view);
        this.i = a2.findViewById(R.id.info_frame);
        this.j = (ScrollLabel) a2.findViewById(R.id.artist_label);
        this.k = (ScrollLabel) a2.findViewById(R.id.album_label);
        this.l = (ScrollLabel) a2.findViewById(R.id.title_label);
        this.m = a2.findViewById(R.id.time_frame);
        this.n = (TextView) a2.findViewById(R.id.time_label);
        this.o = (TextView) a2.findViewById(R.id.dur_label);
        this.p = (StepSlideBar) a2.findViewById(R.id.seek_bar);
        this.q = (StepSlideBar) a2.findViewById(R.id.progress_bar);
        this.r = (ImageButton) a2.findViewById(R.id.play_button);
        this.s = (ImageButton) a2.findViewById(R.id.prev_button);
        this.t = (ImageButton) a2.findViewById(R.id.next_button);
        this.u = (ImageButton) a2.findViewById(R.id.repeat_button);
        this.v = (ImageButton) a2.findViewById(R.id.random_button);
        this.w = a2.findViewById(R.id.connecting_indicator);
        Resources resources = this.f1597b.getResources();
        this.A = resources.getDrawable(R.drawable.control_play);
        this.B = resources.getDrawable(R.drawable.control_pause);
        Drawable drawable = resources.getDrawable(R.drawable.jct_album_art);
        this.C = drawable;
        this.g.setImageDrawable(drawable);
        this.g.setOnClickListener(new b());
        this.i.setVisibility(4);
        this.i.setOnClickListener(new c());
        this.p.setDelegate(this.F);
        this.r.setOnClickListener(new d());
        this.s.setOnClickListener(new e());
        this.t.setOnClickListener(new f());
        this.u.setOnClickListener(new g());
        this.v.setOnClickListener(new h());
        h();
        g();
        a(this.y.h);
        r.a(a2, (i0) new i());
        this.d = a2;
        return a2;
    }

    public void c(int i2) {
        if (i2 == 2) {
            this.w.setVisibility(0);
        } else {
            this.w.setVisibility(4);
        }
        d.g gVar = this.z;
        if (gVar != null && i2 != 0) {
            this.p.setEnabled(i2 == 4 && gVar.g > 0);
            this.r.setEnabled(i2 != 2);
            this.t.setEnabled(i2 == 4 || i2 == 3);
            this.s.setEnabled(i2 == 4 || i2 == 3);
        } else {
            this.p.setEnabled(false);
            this.r.setEnabled(false);
            this.t.setEnabled(false);
            this.s.setEnabled(false);
        }
        if (i2 == 4) {
            this.r.setImageDrawable(this.B);
        } else {
            this.r.setImageDrawable(this.A);
        }
        d(this.y.e());
    }

    public void d(int i2) {
        if ((this.y.c() == 4 || this.y.c() == 3) && this.z != null) {
            StepSlideBar stepSlideBar = this.p;
            if (stepSlideBar.p) {
                return;
            }
            stepSlideBar.setValue(i2);
            this.q.setValue(i2);
            TextView textView = this.n;
            b.b.a.a.b.u.d dVar = this.y;
            textView.setText(dVar.d(dVar.e()));
            return;
        }
        this.p.setValue(0);
        this.q.setValue(0);
        this.n.setText("");
    }

    public final void g() {
        int i2 = this.y.d;
        this.v.setImageDrawable(this.f1597b.getResources().getDrawable((i2 == 0 || i2 != 1) ? R.drawable.random_off : R.drawable.random_all));
    }

    public final void h() {
        int i2;
        int i3 = this.y.f1070c;
        if (i3 != 0) {
            if (i3 == 1) {
                i2 = R.drawable.repeat_one;
            } else if (i3 == 2) {
                i2 = R.drawable.repeat_all;
            }
            this.u.setImageDrawable(this.f1597b.getResources().getDrawable(i2));
        }
        i2 = R.drawable.repeat_off;
        this.u.setImageDrawable(this.f1597b.getResources().getDrawable(i2));
    }

    public final void a(d.g gVar) {
        d.g gVar2 = this.z;
        if (gVar2 != null) {
            gVar2.b(this.G);
        }
        this.z = gVar;
        if (gVar != null) {
            b.b.a.a.c.c cVar = this.G;
            b.b.a.a.c.a aVar = gVar.i;
            if (aVar != null) {
                aVar.a(cVar);
            } else {
                cVar.a(b.b.a.a.c.d.this.d.l);
            }
            this.j.setText(gVar.f1095c);
            this.k.setText(gVar.d);
            this.l.setText(gVar.f1094b);
            TextView textView = this.n;
            b.b.a.a.b.u.d dVar = this.y;
            textView.setText(dVar.d(dVar.e()));
            TextView textView2 = this.o;
            b.b.a.a.b.u.d dVar2 = this.y;
            d.g gVar3 = dVar2.h;
            textView2.setText(dVar2.d(gVar3 != null ? gVar3.g : 0));
            this.p.a(0, gVar.g, 1.0f);
            this.q.a(0, gVar.g, 1.0f);
        } else {
            this.g.setImageDrawable(this.C);
            this.j.setText("");
            this.k.setText("");
            this.l.setText("");
            this.o.setText("");
            this.n.setText("");
            this.p.a(0, 0, 1.0f);
            this.q.a(0, 0, 1.0f);
        }
        c(this.y.c());
        d(this.y.e());
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        d.g gVar = this.z;
        if (gVar != null) {
            gVar.b(this.G);
        }
        this.D.a();
        b.b.a.a.b.u.d dVar = this.y;
        if (dVar.m == this) {
            dVar.m = null;
        }
        AlertDialog alertDialog = this.E;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.E = null;
        }
    }
}
