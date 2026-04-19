package b.b.a.a.f.k0;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: PowerOffControlPage.java */
/* loaded from: classes.dex */
public class o extends g {
    public b.b.a.a.b.p.d e;
    public g0 f;
    public ImageButton g;

    /* compiled from: PowerOffControlPage.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* compiled from: PowerOffControlPage.java */
        /* renamed from: b.b.a.a.f.k0.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0042a implements Runnable {
            public RunnableC0042a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.g.setSelected(false);
                o.this.g.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            o.this.g.setEnabled(false);
            o.this.g.setSelected(true);
            o.this.f.a(0, 3000, new RunnableC0042a());
            o.this.e.b().c(true);
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void a(View view, Bundle bundle) {
        this.e = ((RemoteApplication) view.getContext().getApplicationContext()).b();
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.power_on_button);
        this.g = imageButton;
        imageButton.setOnClickListener(new a());
    }

    @Override // b.b.a.a.f.k0.g
    public void e() {
        g0 g0Var = this.f;
        if (g0Var != null) {
            g0Var.a();
            this.f = null;
        }
    }

    @Override // b.b.a.a.f.k0.g
    public void f() {
        this.f = new g0(new Handler(), 1);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_cp_power_off, viewGroup, false);
    }
}
