package b.b.a.a.f.o0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import b.b.a.a.b.o.r;
import b.b.a.a.b.p.d;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;

/* compiled from: CecUncontrollableCoverView.java */
/* loaded from: classes.dex */
public class a extends b.b.a.a.f.o0.b implements d.k {
    public View d;
    public TextView e;
    public Switch f;
    public TextView g;
    public b.b.a.a.b.p.d h;
    public boolean i;
    public boolean j;
    public g0 k;
    public boolean l;
    public b m;

    /* compiled from: CecUncontrollableCoverView.java */
    /* renamed from: b.b.a.a.f.o0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0055a implements CompoundButton.OnCheckedChangeListener {

        /* compiled from: CecUncontrollableCoverView.java */
        /* renamed from: b.b.a.a.f.o0.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0056a implements Runnable {
            public RunnableC0056a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f.setEnabled(true);
                a aVar = a.this;
                aVar.f.setChecked(aVar.h.a());
            }
        }

        public C0055a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z || a.this.h.a()) {
                return;
            }
            a.this.f.setEnabled(false);
            b.b.a.a.b.p.d dVar = a.this.h;
            if (dVar.f852c.a()) {
                dVar.a(b.b.a.a.b.p.v.a.CEC, b.b.a.a.b.p.v.d.a(true));
                dVar.a(b.b.a.a.b.p.v.a.CEC);
            }
            a.this.k.a(0, 3000, new RunnableC0056a());
        }
    }

    /* compiled from: CecUncontrollableCoverView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    public a(Context context, b.b.a.a.b.p.d dVar, boolean z, boolean z2) {
        super(context);
        this.h = dVar;
        this.i = z;
        this.j = z2;
        this.k = new g0(new Handler(), 1);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.h.x.a((d.m) this);
        f();
        b.b.a.a.b.p.d dVar = this.h;
        if (dVar.f852c.a()) {
            dVar.a(b.b.a.a.b.p.v.a.CEC);
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_control_cec_uncontrollable_cover);
        this.d = a2;
        this.e = (TextView) a2.findViewById(R.id.cec_route_message_label);
        this.f = (Switch) this.d.findViewById(R.id.cec_switch);
        this.g = (TextView) this.d.findViewById(R.id.cec_label);
        this.f.setOnCheckedChangeListener(new C0055a());
        f();
        return this.d;
    }

    public void f() {
        boolean a2 = this.h.a();
        d.e eVar = this.h.j;
        if (eVar != null) {
            boolean z = (eVar == d.e.MAIN || eVar == d.e.SUB) == this.i;
            boolean z2 = a2 && z;
            this.f.setChecked(z && a2);
            this.f.setVisibility(z ? 0 : 8);
            this.g.setVisibility(z ? 0 : 8);
            if (a2) {
                if (!z) {
                    if (this.i) {
                        this.e.setText(this.f1597b.getText(R.string.cecRouteIsNotMain));
                    } else {
                        this.e.setText(String.format((String) this.f1597b.getText(R.string.cecRouteIsNotZone2), this.h.j.f858b));
                    }
                }
            } else if (this.j) {
                this.e.setText(this.f1597b.getText(R.string.tvRemoteControlCecIsOff));
            } else {
                this.e.setText(this.f1597b.getText(R.string.playerRemoteControlCecIsOff));
            }
            if (z2 != this.l) {
                this.l = z2;
                b bVar = this.m;
                if (bVar != null) {
                    bVar.a(z2);
                    return;
                }
                return;
            }
            return;
        }
        throw null;
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, r rVar) {
        if (fVar == d.f.CEC_ENABLE) {
            this.k.a(0);
            this.f.setEnabled(true);
            f();
        }
        if (fVar == d.f.CEC_ROUTE) {
            f();
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.k.a();
        this.h.x.b(this);
    }
}
