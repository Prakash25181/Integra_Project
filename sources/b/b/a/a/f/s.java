package b.b.a.a.f;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import b.b.a.a.f.m0.j0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import java.util.ArrayList;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class s extends Fragment implements d.k {

    /* renamed from: b, reason: collision with root package name */
    public ImageView f1618b;

    /* renamed from: c, reason: collision with root package name */
    public TextView f1619c;
    public TextView d;
    public ImageButton e;
    public ScrollView f;
    public LinearLayout g;
    public View h;
    public Switch i;
    public View j;
    public View k;
    public Button l;
    public ArrayList<f> m;
    public g0 n;
    public b.b.a.a.b.p.d o;
    public AlertDialog p;

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageButton f1620b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b.b.a.a.b.l f1621c;

        public a(s sVar, ImageButton imageButton, b.b.a.a.b.l lVar) {
            this.f1620b = imageButton;
            this.f1621c = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1620b.setSelected(this.f1621c.h);
        }
    }

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = (MainActivity) s.this.getActivity();
            if (mainActivity.b0.a()) {
                mainActivity.k();
                mainActivity.a(null, new j0(mainActivity, mainActivity.W), null);
            }
        }
    }

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class c implements CompoundButton.OnCheckedChangeListener {

        /* compiled from: SidebarFragment.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                s sVar = s.this;
                sVar.i.setChecked(sVar.o.k());
            }
        }

        public c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            g0 g0Var = s.this.n;
            if (g0Var != null) {
                g0Var.a(4);
            }
            s sVar = s.this;
            if (sVar.o == null || sVar.i.isChecked() == s.this.o.k()) {
                return;
            }
            s sVar2 = s.this;
            b.b.a.a.b.p.d dVar = sVar2.o;
            boolean isChecked = sVar2.i.isChecked();
            if (dVar.f852c.P) {
                dVar.a(b.b.a.a.b.p.v.a.NSB, isChecked ? "ON" : "OFF");
            }
            s.this.n.a(4, 3000, new a());
        }
    }

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {

        /* compiled from: SidebarFragment.java */
        /* loaded from: classes.dex */
        public class a implements DialogInterface.OnCancelListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                s.this.p = null;
            }
        }

        /* compiled from: SidebarFragment.java */
        /* loaded from: classes.dex */
        public class b implements DialogInterface.OnClickListener {
            public b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                s.this.p = null;
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s.this.p = new AlertDialog.Builder(view.getContext()).setTitle(a.b.k.r.d(R.string.whatIsNetStandbyTitle)).setMessage(a.b.k.r.d(R.string.whatIsNetStandbyMessage)).setPositiveButton(a.b.k.r.d(R.string.close), new b()).setOnCancelListener(new a()).show();
        }
    }

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MainActivity mainActivity = (MainActivity) s.this.getActivity();
            if (mainActivity.b0.a()) {
                mainActivity.W.c();
            }
        }
    }

    /* compiled from: SidebarFragment.java */
    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a, reason: collision with root package name */
        public b.b.a.a.b.l f1629a;

        /* renamed from: b, reason: collision with root package name */
        public View f1630b;

        /* renamed from: c, reason: collision with root package name */
        public View f1631c;
        public View d;
        public ImageButton e;
        public TextView f;
        public TextView g;
        public boolean h;

        public f() {
        }

        public final void a() {
            if (this.f1630b != null) {
                boolean z = s.this.o.f851b == this.f1629a.f755b.f839b || this.h;
                this.f1630b.setSelected(z);
                this.f.setSelected(z);
                this.g.setSelected(z);
                this.d.setSelected(z);
                this.e.setSelected(this.f1629a.h);
            }
        }

        public void b() {
            b.b.a.a.b.l lVar = this.f1629a;
            if (lVar == null) {
                return;
            }
            this.f.setText(lVar.f755b.f840c);
            b.b.a.a.b.l lVar2 = this.f1629a;
            b.b.a.a.b.o.i iVar = lVar2.k;
            if (lVar2.h && iVar != null) {
                this.g.setVisibility(0);
                this.g.setText(iVar.d);
            } else {
                this.g.setVisibility(4);
            }
            a();
        }
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        int i = rVar.f836b;
        int ordinal = fVar.ordinal();
        if (ordinal == 2 || ordinal == 5) {
            this.m.get(i).b();
        } else {
            if (ordinal != 22) {
                return;
            }
            b.b.a.a.b.p.d dVar = this.o;
            if (dVar.f852c.P) {
                this.i.setChecked(dVar.k());
            }
        }
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_sidebar, viewGroup, false);
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.n.a();
        b.b.a.a.b.p.d dVar = this.o;
        if (dVar != null) {
            dVar.x.b(this);
        }
        AlertDialog alertDialog = this.p;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.p = null;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f1618b = (ImageView) view.findViewById(R.id.device_icon);
        this.f1619c = (TextView) view.findViewById(R.id.device_name_label);
        this.d = (TextView) view.findViewById(R.id.model_name_label);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.info_button);
        this.e = imageButton;
        imageButton.setOnClickListener(new b());
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.sidebar_scroll_view);
        this.f = scrollView;
        this.g = (LinearLayout) scrollView.findViewById(R.id.sidebar_item_parent_frame);
        View findViewById = view.findViewById(R.id.net_standby_switch_cell);
        this.h = findViewById;
        Switch r7 = (Switch) findViewById.findViewById(R.id.net_standby_switch);
        this.i = r7;
        r7.setOnCheckedChangeListener(new c());
        this.j = view.findViewById(R.id.net_standby_notify_cell);
        View findViewById2 = view.findViewById(R.id.about_net_standby_cell);
        this.k = findViewById2;
        ((Button) findViewById2.findViewById(R.id.about_net_standby_button)).setOnClickListener(new d());
        Button button = (Button) view.findViewById(R.id.change_device_button);
        this.l = button;
        button.setOnClickListener(new e());
        this.n = new g0(new Handler(), 5);
        LayoutInflater layoutInflater = (LayoutInflater) view.getContext().getSystemService("layout_inflater");
        this.m = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            f fVar = new f();
            View inflate = layoutInflater.inflate(R.layout.layout_sidebar_zone, (ViewGroup) null);
            fVar.f1630b = inflate;
            fVar.f = (TextView) inflate.findViewById(R.id.zone_name_label);
            fVar.g = (TextView) inflate.findViewById(R.id.selector_name_label);
            View findViewById3 = inflate.findViewById(R.id.zone_name_frame);
            fVar.f1631c = findViewById3;
            findViewById3.setOnTouchListener(new y(fVar));
            fVar.d = inflate.findViewById(R.id.zone_power_separator);
            ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.zone_power_button);
            fVar.e = imageButton2;
            imageButton2.setOnClickListener(new z(fVar));
            fVar.h = false;
            fVar.b();
            this.g.addView(inflate, i);
            this.m.add(fVar);
        }
    }

    public static /* synthetic */ void a(s sVar, b.b.a.a.b.l lVar) {
        if (sVar != null) {
            b.b.a.a.b.o.r rVar = lVar.f755b.f839b;
            b.b.a.a.b.p.d dVar = sVar.o;
            if (rVar != dVar.f851b && dVar.d.containsKey(rVar)) {
                if (dVar.q.g() == b.b.a.a.b.o.e.THIS_DEVICE) {
                    b.b.a.a.b.l b2 = dVar.b();
                    if (b2.h) {
                        b2.a(b2.k);
                    } else {
                        dVar.u.stop();
                        if (b2.k.f817b == b.b.a.a.b.o.h.NETWORK) {
                            dVar.q.a(dVar.p.a(b.b.a.a.b.o.e.NET_TOP), false);
                        }
                        dVar.q.a(b2.k.f817b, b2, true);
                    }
                }
                dVar.f851b = rVar;
                b.b.a.a.b.l b3 = dVar.b();
                if (!b3.h) {
                    b3.r = true;
                } else {
                    b3.f();
                }
                dVar.a(d.f.ZONE, dVar.f851b);
                if (dVar.f852c.E) {
                    dVar.a(b.b.a.a.b.p.v.a.CCM);
                }
                if (dVar.q.g() == b.b.a.a.b.o.e.THIS_DEVICE && !dVar.b().q.E) {
                    if (dVar.f852c.f801c <= 2010) {
                        dVar.q.a(dVar.p.a(b.b.a.a.b.o.e.DLNA), true);
                    } else {
                        dVar.q.a(dVar.p.a(b.b.a.a.b.o.e.NET_TOP), true);
                    }
                }
            }
            MainActivity mainActivity = (MainActivity) sVar.getActivity();
            if (mainActivity != null) {
                mainActivity.k();
                return;
            }
            return;
        }
        throw null;
    }

    public static /* synthetic */ void a(s sVar, b.b.a.a.b.l lVar, ImageButton imageButton) {
        if (sVar == null) {
            throw null;
        }
        if (lVar != null) {
            boolean z = !lVar.h;
            if (!z && lVar.f755b.f839b == b.b.a.a.b.o.r.MAIN) {
                b.b.a.a.b.p.d dVar = sVar.o;
                b.b.a.a.b.o.c cVar = dVar.f852c;
                if (cVar.O) {
                    if (cVar.P && !dVar.k()) {
                        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
                        if (a2.a(a2.a(sVar.o.f852c.f799a.g).f1126b)) {
                            sVar.p = new AlertDialog.Builder(sVar.getActivity()).setTitle(sVar.getString(R.string.netStandbyOffTitle)).setMessage(sVar.getString(R.string.netStandbyOffMessage)).setNegativeButton(sVar.getString(R.string.cancel), new v(sVar)).setPositiveButton(sVar.getString(R.string.standbyAndDoNotShowAgain), new u(sVar, lVar, imageButton)).setOnCancelListener(new t(sVar)).show();
                            return;
                        }
                    }
                    sVar.a(lVar, imageButton, false);
                    return;
                }
                b.b.a.a.d.a a3 = b.b.a.a.d.a.a();
                if (a3.a(a3.a(sVar.o.f852c.f799a.g).f1126b)) {
                    sVar.p = new AlertDialog.Builder(sVar.getActivity()).setMessage(sVar.getString(R.string.netStandbyUnsupportedNotify)).setNegativeButton(sVar.getString(R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(sVar.getString(R.string.standbyAndDoNotShowAgain), new x(sVar, lVar, imageButton)).setOnCancelListener(new w(sVar)).show();
                    return;
                } else {
                    sVar.a(lVar, imageButton, false);
                    return;
                }
            }
            sVar.a(lVar, imageButton, z);
        }
    }

    public final void a(b.b.a.a.b.l lVar, ImageButton imageButton, boolean z) {
        lVar.c(z);
        imageButton.setSelected(z);
        this.n.a(lVar.f755b.f839b.f836b + 0, 3000, new a(this, imageButton, lVar));
    }
}
