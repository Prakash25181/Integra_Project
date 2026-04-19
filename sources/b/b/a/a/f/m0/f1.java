package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import com.onkyo.integraRemote4A.R;

/* compiled from: RiVolumePopup.java */
/* loaded from: classes.dex */
public class f1 extends g1 {
    public b.b.a.a.b.p.d h;
    public View i;
    public b.b.a.a.b.m.e j;

    /* compiled from: RiVolumePopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f1.this.j.a("AMTTG");
        }
    }

    /* compiled from: RiVolumePopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f1.this.j.a("MVLDOWN");
        }
    }

    /* compiled from: RiVolumePopup.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f1.this.j.a("MVLUP");
        }
    }

    public f1(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.h = dVar;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        this.i = a(R.layout.layout_popup_volume_ri);
        this.j = new b.b.a.a.b.m.e(this.h);
        ((ImageButton) this.i.findViewById(R.id.mute_button)).setOnClickListener(new a());
        ((ImageButton) this.i.findViewById(R.id.volume_down_button)).setOnClickListener(new b());
        ((ImageButton) this.i.findViewById(R.id.volume_up_button)).setOnClickListener(new c());
        return this.i;
    }
}
