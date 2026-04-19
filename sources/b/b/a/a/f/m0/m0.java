package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.onkyo.integraRemote4A.R;

/* compiled from: DirectInputPopup.java */
/* loaded from: classes.dex */
public class m0 extends z0 {
    public TextView h;
    public Button[] i;
    public ImageButton j;
    public Button k;
    public d l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public View.OnClickListener r;
    public View.OnClickListener s;
    public View.OnClickListener t;

    /* compiled from: DirectInputPopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0 m0Var = m0.this;
            m0Var.o = ((Integer) view.getTag()).intValue() + (m0Var.o * 10);
            m0 m0Var2 = m0.this;
            m0Var2.p++;
            m0Var2.j();
        }
    }

    /* compiled from: DirectInputPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0 m0Var = m0.this;
            int i = m0Var.o;
            if (i > 0) {
                m0Var.o = i / 10;
                m0Var.p--;
                m0Var.j();
                return;
            }
            m0Var.h();
        }
    }

    /* compiled from: DirectInputPopup.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m0 m0Var = m0.this;
            if (m0Var.p > 0) {
                int i = m0Var.o;
                m0Var.o = i;
                m0Var.q = true;
                d dVar = m0Var.l;
                if (dVar != null) {
                    dVar.a(i);
                }
                m0Var.h();
            }
        }
    }

    /* compiled from: DirectInputPopup.java */
    /* loaded from: classes.dex */
    public interface d {
        void a();

        void a(int i);
    }

    public m0(Context context) {
        super(context);
        this.r = new a();
        this.s = new b();
        this.t = new c();
    }

    public void a(int i, int i2) {
        this.m = i;
        this.n = i2;
        int i3 = this.o;
        if (i3 < i || i2 < i3) {
            int i4 = this.m;
            this.o = Math.max(i4, Math.min(this.o, i4));
            if (this.f != null) {
                j();
            }
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_popup_direct_input);
        this.h = (TextView) a2.findViewById(R.id.value_label);
        this.i = new Button[10];
        int[] iArr = {R.id.num_0_button, R.id.num_1_button, R.id.num_2_button, R.id.num_3_button, R.id.num_4_button, R.id.num_5_button, R.id.num_6_button, R.id.num_7_button, R.id.num_8_button, R.id.num_9_button};
        for (int i = 0; i < 10; i++) {
            this.i[i] = (Button) a2.findViewById(iArr[i]);
            this.i[i].setTag(Integer.valueOf(i));
            this.i[i].setOnClickListener(this.r);
        }
        ImageButton imageButton = (ImageButton) a2.findViewById(R.id.back_button);
        this.j = imageButton;
        imageButton.setOnClickListener(this.s);
        Button button = (Button) a2.findViewById(R.id.set_button);
        this.k = button;
        button.setOnClickListener(this.t);
        this.o = 0;
        this.p = 0;
        this.q = false;
        j();
        return a2;
    }

    @Override // b.b.a.a.f.m0.z0
    public void h() {
        d dVar;
        if (!this.q && (dVar = this.l) != null) {
            dVar.a();
        }
        f();
    }

    public final void j() {
        TextView textView = this.h;
        StringBuilder a2 = b.a.a.a.a.a("");
        a2.append(this.o);
        textView.setText(a2.toString());
        int i = this.o;
        if (i * 10 > this.n) {
            this.o = i;
            this.q = true;
            d dVar = this.l;
            if (dVar != null) {
                dVar.a(i);
            }
            h();
            return;
        }
        for (int i2 = 0; i2 < 10; i2++) {
            this.i[i2].setEnabled((this.o * 10) + i2 <= this.n);
        }
        this.j.setEnabled(this.p > 0);
        this.k.setEnabled(this.p > 0 && this.o >= this.m);
    }
}
