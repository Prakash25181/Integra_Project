package b.b.a.a.f.m0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;

/* compiled from: PreoutVolumePopup.java */
/* loaded from: classes.dex */
public class a1 extends g1 implements d.k {
    public View h;
    public ImageButton i;
    public b.b.a.a.b.p.d j;
    public b.b.a.a.f.g0 k;

    /* compiled from: PreoutVolumePopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* compiled from: PreoutVolumePopup.java */
        /* renamed from: b.b.a.a.f.m0.a1$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0052a implements Runnable {
            public RunnableC0052a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a1 a1Var = a1.this;
                a1Var.i.setSelected(a1Var.j.b().i);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.l b2 = a1.this.j.b();
            boolean z = !b2.i;
            b2.f754a.a(b2.f756c.f752b, b.b.a.a.b.p.v.d.a(z));
            a1.this.i.setSelected(z);
            a1.this.k.a(0, 3000, new RunnableC0052a());
        }
    }

    public a1(Context context, Handler handler, b.b.a.a.b.p.d dVar) {
        super(context);
        this.j = dVar;
        this.k = new b.b.a.a.f.g0(handler, 1);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.j.x.a((d.m) this);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_popup_volume_preout);
        this.h = a2;
        ImageButton imageButton = (ImageButton) a2.findViewById(R.id.mute_button);
        this.i = imageButton;
        imageButton.setOnClickListener(new a());
        return this.h;
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        if (z && fVar == d.f.MUTE) {
            this.k.a(0);
            this.i.setSelected(this.j.b().i);
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.k.a();
        this.j.x.b(this);
    }
}
