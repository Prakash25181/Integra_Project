package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import b.b.a.a.b.p.g;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.GlowButton;
import com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView;

/* compiled from: TvRemoteControllerView.java */
/* loaded from: classes.dex */
public class l2 extends b1 implements d.k {
    public View e;
    public b.b.a.a.f.o0.a f;
    public TextView g;
    public b.b.a.a.b.p.d h;
    public b.b.a.a.b.l i;
    public b.b.a.a.b.m.f j;

    public l2(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.h = dVar;
        b.b.a.a.b.l b2 = dVar.b();
        this.i = b2;
        this.j = new b.b.a.a.b.m.f(dVar, b2.f755b.f839b);
        a(R.layout.layout_remote_tv);
    }

    @Override // b.b.a.a.f.m0.b1
    public void a(View view) {
        a();
        b();
        this.h.x.a((d.m) this);
    }

    @Override // b.b.a.a.f.m0.b1
    public void b(View view) {
        GlowButton[] glowButtonArr = {(GlowButton) view.findViewById(R.id.color_a_button), (GlowButton) view.findViewById(R.id.color_b_button), (GlowButton) view.findViewById(R.id.color_c_button), (GlowButton) view.findViewById(R.id.color_d_button)};
        if (!this.j.f772a.b().q.y) {
            glowButtonArr[0].setVisibility(4);
            glowButtonArr[1].setVisibility(4);
            glowButtonArr[2].setVisibility(4);
            glowButtonArr[3].setVisibility(4);
        } else {
            int[] iArr = {R.drawable.rc_color_b, R.drawable.rc_color_r, R.drawable.rc_color_g, R.drawable.rc_color_y};
            int[] iArr2 = {R.drawable.rc_color_b_glow, R.drawable.rc_color_r_glow, R.drawable.rc_color_g_glow, R.drawable.rc_color_y_glow};
            b.b.a.a.b.m.f fVar = this.j;
            g.b bVar = this.h.f852c.e;
            if (fVar == null) {
                throw null;
            }
            int[] a2 = b.b.a.a.b.m.c.a(bVar);
            int i = 0;
            for (int i2 = 4; i < i2; i2 = 4) {
                glowButtonArr[i].setBackgroundDrawable(this.f1403b.getResources().getDrawable(iArr[a2[i]]));
                glowButtonArr[i].setGlowDrawable(this.f1403b.getResources().getDrawable(iArr2[a2[i]]));
                i++;
            }
            b.b.a.a.b.m.f fVar2 = this.j;
            g.b bVar2 = this.h.f852c.e;
            if (fVar2 != null) {
                b.b.a.a.b.m.c.a(bVar2);
            } else {
                throw null;
            }
        }
        this.e = view.findViewById(R.id.rc_scroll_view);
        b.b.a.a.f.o0.a aVar = new b.b.a.a.f.o0.a(this.f1403b, this.h, this.i.f755b.f839b == b.b.a.a.b.o.r.MAIN, true);
        this.f = aVar;
        ((FrameLayout) view).addView(aVar.b());
        this.f.m = new r1(this);
        this.g = (TextView) view.findViewById(R.id.cec_route_label);
        ((SwipeCursorView) view.findViewById(R.id.cursor_input)).setDelegate(new c2(this));
        a(R.id.power_button, new e2(this));
        a(R.id.guide_button, new f2(this));
        a(R.id.setup_button, new g2(this));
        a(R.id.display_button, new h2(this));
        a(R.id.prev_ch_button, new i2(this));
        a(R.id.return_button, new j2(this));
        a(R.id.input_button, new k2(this));
        a(R.id.ch_up_button, new h1(this));
        a(R.id.ch_down_button, new i1(this));
        a(R.id.vol_up_button, new j1(this));
        a(R.id.volume_down_button, new k1(this));
        a(R.id.mute_button, new l1(this));
        a(R.id.color_a_button, new m1(this));
        a(R.id.color_b_button, new n1(this));
        a(R.id.color_c_button, new o1(this));
        a(R.id.color_d_button, new p1(this));
        a(R.id.num_0_button, new q1(this));
        a(R.id.num_1_button, new s1(this));
        a(R.id.num_2_button, new t1(this));
        a(R.id.num_3_button, new u1(this));
        a(R.id.num_4_button, new v1(this));
        a(R.id.num_5_button, new w1(this));
        a(R.id.num_6_button, new x1(this));
        a(R.id.num_7_button, new y1(this));
        a(R.id.num_8_button, new z1(this));
        a(R.id.num_9_button, new a2(this));
        a(R.id.num_0_button, new b2(this));
        a(R.id.clear_button, new d2(this));
    }

    @Override // b.b.a.a.f.m0.b1
    public void c(View view) {
        this.h.x.b(this);
    }

    public final void a() {
        if (this.f.l) {
            this.e.setVisibility(0);
            this.f.d.setVisibility(8);
        } else {
            this.e.setVisibility(4);
            this.f.d.setVisibility(0);
        }
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (fVar == d.f.CEC_ENABLE || fVar == d.f.CEC_ROUTE) {
            b();
        }
    }

    public final void b() {
        if (this.i.q.A) {
            this.g.setVisibility(0);
            this.g.setText(this.h.j.f858b + " TV");
            return;
        }
        this.g.setVisibility(8);
    }
}
