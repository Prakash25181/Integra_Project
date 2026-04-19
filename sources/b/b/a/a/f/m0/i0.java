package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b.b.a.a.b.p.g;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.GlowButton;
import com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView;

/* compiled from: BdDvdPlayerRemoteControllerView.java */
/* loaded from: classes.dex */
public class i0 extends b1 {
    public View e;
    public b.b.a.a.f.o0.a f;
    public b.b.a.a.b.p.d g;
    public b.b.a.a.b.l h;
    public b.b.a.a.b.m.a i;

    public i0(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.g = dVar;
        b.b.a.a.b.l b2 = dVar.b();
        this.h = b2;
        this.i = new b.b.a.a.b.m.a(dVar, b2.f755b.f839b);
        a(R.layout.layout_remote_bd_dvd_player);
    }

    @Override // b.b.a.a.f.m0.b1
    public void a(View view) {
        a();
    }

    @Override // b.b.a.a.f.m0.b1
    public void b(View view) {
        GlowButton[] glowButtonArr = {(GlowButton) view.findViewById(R.id.color_a_button), (GlowButton) view.findViewById(R.id.color_b_button), (GlowButton) view.findViewById(R.id.color_c_button), (GlowButton) view.findViewById(R.id.color_d_button)};
        if (!this.i.f764a.b().q.y) {
            glowButtonArr[0].setVisibility(4);
            glowButtonArr[1].setVisibility(4);
            glowButtonArr[2].setVisibility(4);
            glowButtonArr[3].setVisibility(4);
        } else {
            int[] iArr = {R.drawable.rc_color_b, R.drawable.rc_color_r, R.drawable.rc_color_g, R.drawable.rc_color_y};
            int[] iArr2 = {R.drawable.rc_color_b_glow, R.drawable.rc_color_r_glow, R.drawable.rc_color_g_glow, R.drawable.rc_color_y_glow};
            b.b.a.a.b.m.a aVar = this.i;
            g.b bVar = this.g.f852c.e;
            if (aVar == null) {
                throw null;
            }
            int[] a2 = b.b.a.a.b.m.c.a(bVar);
            int i = 0;
            for (int i2 = 4; i < i2; i2 = 4) {
                glowButtonArr[i].setBackgroundDrawable(this.f1403b.getResources().getDrawable(iArr[a2[i]]));
                glowButtonArr[i].setGlowDrawable(this.f1403b.getResources().getDrawable(iArr2[a2[i]]));
                i++;
            }
            b.b.a.a.b.m.a aVar2 = this.i;
            g.b bVar2 = this.g.f852c.e;
            if (aVar2 != null) {
                b.b.a.a.b.m.c.a(bVar2);
            } else {
                throw null;
            }
        }
        this.e = view.findViewById(R.id.rc_scroll_view);
        b.b.a.a.f.o0.a aVar3 = new b.b.a.a.f.o0.a(this.f1403b, this.g, this.h.f755b.f839b == b.b.a.a.b.o.r.MAIN, false);
        this.f = aVar3;
        ((FrameLayout) view).addView(aVar3.b());
        this.f.m = new n(this);
        ((SwipeCursorView) view.findViewById(R.id.cursor_input)).setDelegate(new y(this));
        a(R.id.power_button, new b0(this));
        a(R.id.top_menu_button, new c0(this));
        a(R.id.setup_button, new d0(this));
        a(R.id.display_button, new e0(this));
        a(R.id.menu_button, new f0(this));
        a(R.id.return_button, new g0(this));
        a(R.id.stop_button, new h0(this));
        a(R.id.pause_button, new d(this));
        a(R.id.play_button, new e(this));
        a(R.id.prev_button, new f(this));
        a(R.id.fr_button, new g(this));
        a(R.id.ff_button, new h(this));
        a(R.id.next_button, new i(this));
        a(R.id.color_a_button, new j(this));
        a(R.id.color_b_button, new k(this));
        a(R.id.color_c_button, new l(this));
        a(R.id.color_d_button, new m(this));
        a(R.id.num_0_button, new o(this));
        a(R.id.num_1_button, new p(this));
        a(R.id.num_2_button, new q(this));
        a(R.id.num_3_button, new r(this));
        a(R.id.num_4_button, new s(this));
        a(R.id.num_5_button, new t(this));
        a(R.id.num_6_button, new u(this));
        a(R.id.num_7_button, new v(this));
        a(R.id.num_8_button, new w(this));
        a(R.id.num_9_button, new x(this));
        a(R.id.num_0_button, new z(this));
        a(R.id.clear_button, new a0(this));
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
}
