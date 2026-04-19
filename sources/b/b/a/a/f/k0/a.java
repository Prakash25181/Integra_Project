package b.b.a.a.f.k0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b.b.a.a.b.o.l;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: AudioControlPage.java */
/* loaded from: classes.dex */
public class a extends g implements d.k {
    public b.b.a.a.f.j0.e e;
    public b.b.a.a.f.j0.c f;
    public b.b.a.a.b.p.d g;
    public b.b.a.a.b.l h;

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.control_parent_frame);
        b.b.a.a.b.p.d b2 = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        this.g = b2;
        b.b.a.a.b.l b3 = b2.b();
        this.h = b3;
        b.b.a.a.b.o.l a2 = b3.a(l.a.FRONT);
        if (a2 != null) {
            b.b.a.a.f.j0.e eVar = new b.b.a.a.f.j0.e(getActivity(), this.h, a2);
            this.e = eVar;
            linearLayout.addView(eVar.b());
        }
        if (this.h.q.f757a) {
            b.b.a.a.f.j0.c cVar = new b.b.a.a.f.j0.c(getActivity(), this.g);
            this.f = cVar;
            linearLayout.addView(cVar.b());
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        b.b.a.a.f.j0.c cVar = this.f;
        if (cVar != null) {
            cVar.f.a(0);
        }
        this.g.x.b(this);
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        b.b.a.a.f.j0.c cVar = this.f;
        if (cVar != null) {
            cVar.f();
        }
        this.g.x.a((d.m) this);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_audio, viewGroup, false);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        b.b.a.a.f.j0.e eVar;
        b.b.a.a.b.l lVar = this.h;
        if (lVar == null || lVar.f755b.f839b != rVar || (eVar = this.e) == null) {
            return;
        }
        eVar.f();
    }
}
