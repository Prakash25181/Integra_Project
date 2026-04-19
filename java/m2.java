package b.b.a.a.f.m0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: VolumePopup.java */
/* loaded from: classes.dex */
public class m2 extends g1 implements d.k {
    public View h;
    public ImageButton i;
    public ImageButton j;
    public ImageButton k;
    public StepSlideBar l;
    public TextView m;
    public b.b.a.a.b.p.d n;
    public b.b.a.a.f.g0 o;

    /* compiled from: VolumePopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* compiled from: VolumePopup.java */
        /* renamed from: b.b.a.a.f.m0.m2$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0054a implements Runnable {
            public RunnableC0054a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                m2 m2Var = m2.this;
                m2Var.i.setSelected(m2Var.n.b().i);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l b2 = m2.this.n.b();
            boolean z = !b2.i;
            b2.f754a.a(b2.f756c.f752b, b.b.a.a.b.p.v.d.a(z));
            m2.this.i.setSelected(z);
            m2.this.o.a(0, 3000, new RunnableC0054a());
        }
    }

    /* compiled from: VolumePopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l b2 = m2.this.n.b();
            b2.f754a.a(b2.f756c.f753c, "DOWN");
        }
    }

    /* compiled from: VolumePopup.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l b2 = m2.this.n.b();
            b2.f754a.a(b2.f756c.f753c, "UP");
        }
    }

    /* compiled from: VolumePopup.java */
    /* loaded from: classes.dex */
    public class d implements StepSlideBar.a {
        public d() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            b.b.a.a.b.l b2 = m2.this.n.b();
            b.b.a.a.b.o.s sVar = b2.f755b;
            if (sVar.d && sVar.e <= i && i <= sVar.f) {
                b.b.a.a.b.p.d dVar = b2.f754a;
                b.b.a.a.b.p.v.a aVar = b2.f756c.f753c;
                dVar.a(aVar, aVar, String.format("%02X", Integer.valueOf(i)));
            }
            m2.this.m.setText(a.b.k.r.a(b2.f755b, b2.i, i));
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    public m2(Context context, Handler handler, b.b.a.a.b.p.d dVar) {
        super(context);
        this.n = dVar;
        this.o = new b.b.a.a.f.g0(handler, 1);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.n.x.a((d.m) this);
        j();
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_popup_volume);
        this.h = a2;
        ImageButton imageButton = (ImageButton) a2.findViewById(R.id.mute_button);
        this.i = imageButton;
        imageButton.setOnClickListener(new a());
        this.m = (TextView) this.h.findViewById(R.id.volume_value_label);
        ImageButton imageButton2 = (ImageButton) this.h.findViewById(R.id.volume_down_button);
        this.j = imageButton2;
        imageButton2.setOnClickListener(new b());
        ImageButton imageButton3 = (ImageButton) this.h.findViewById(R.id.volume_up_button);
        this.k = imageButton3;
        imageButton3.setOnClickListener(new c());
        b.b.a.a.b.l b2 = this.n.b();
        StepSlideBar stepSlideBar = (StepSlideBar) this.h.findViewById(R.id.volume_slider);
        this.l = stepSlideBar;
        b.b.a.a.b.o.s sVar = b2.f755b;
        stepSlideBar.a(sVar.e, sVar.f, 1.0f);
        this.l.setValue(b2.j);
        this.l.setDelegate(new d());
        return this.h;
    }

    public final void j() {
        b.b.a.a.b.l b2 = this.n.b();
        boolean z = b2.h;
        this.i.setEnabled(z);
        this.i.setSelected(b2.i);
        this.m.setText(a.b.k.r.a(b2.f755b, b2.i, b2.j));
        boolean z2 = false;
        this.j.setEnabled(z && b2.j > b2.f755b.e);
        this.k.setEnabled(z && b2.j < b2.f755b.f);
        StepSlideBar stepSlideBar = this.l;
        if (z && !b2.i) {
            z2 = true;
        }
        stepSlideBar.setEnabled(z2);
        this.l.setValue(b2.j);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (z) {
            int ordinal = fVar.ordinal();
            if (ordinal == 3) {
                this.o.a(0);
                j();
            } else {
                if (ordinal != 4) {
                    return;
                }
                j();
            }
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.o.a();
        this.n.x.b(this);
    }
}
