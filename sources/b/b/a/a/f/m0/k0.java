package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import b.b.a.a.b.l;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView;

/* compiled from: DeviceRemoteControllerView.java */
/* loaded from: classes.dex */
public class k0 extends b1 {
    public b.b.a.a.b.p.d e;
    public b.b.a.a.b.m.d f;

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class a implements SwipeCursorView.c {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView.c
        public void a(int i) {
            if (i == 1) {
                k0.this.f.f();
                return;
            }
            if (i == 2) {
                k0.this.f.d();
                return;
            }
            if (i == 3) {
                k0.this.f.a();
            } else if (i == 4) {
                k0.this.f.b();
            } else {
                if (i != 5) {
                    return;
                }
                k0.this.f.c();
            }
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f.g();
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f.h();
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.b.a.a.b.m.d dVar = k0.this.f;
            if (dVar.f770a.b().q.p) {
                dVar.f770a.a(b.b.a.a.b.p.v.a.OSD, "QUICK");
            }
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f.e();
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f.f770a.a(b.b.a.a.b.p.v.a.DIM, "DIM");
        }
    }

    /* compiled from: DeviceRemoteControllerView.java */
    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k0.this.f.i();
        }
    }

    public k0(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.e = dVar;
        this.f = new b.b.a.a.b.m.d(dVar);
        a(R.layout.layout_remote_device);
    }

    @Override // b.b.a.a.f.m0.b1
    public void b(View view) {
        ((SwipeCursorView) view.findViewById(R.id.cursor_input)).setDelegate(new a());
        l.a aVar = this.e.b().q;
        a(R.id.home_button, aVar.o, null, new b());
        a(R.id.menu_button, aVar.r || aVar.q, aVar.r ? "SETUP" : "MENU", new c());
        a(R.id.quick_button, aVar.p, null, new d());
        a(R.id.display_button, aVar.s, this.e.f852c.f801c >= 2016 ? "INFO" : "DISPLAY", new e());
        a(R.id.dimmer_button, true, null, new f());
        a(R.id.return_button, true, null, new g());
    }
}
