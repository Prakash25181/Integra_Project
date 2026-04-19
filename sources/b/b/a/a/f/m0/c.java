package b.b.a.a.f.m0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import b.b.a.a.b.l;
import b.b.a.a.b.o.j;
import b.b.a.a.b.o.l;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: AudioSettingsView.java */
/* loaded from: classes.dex */
public class c extends b.b.a.a.f.o0.b implements d.k {
    public b.b.a.a.b.p.d d;
    public b.b.a.a.b.l e;
    public StepSlideBar f;
    public b.b.a.a.f.j0.a[] g;
    public b.b.a.a.f.j0.a[] h;
    public Switch i;
    public Switch j;
    public Switch k;
    public b.b.a.a.f.g0 l;

    /* compiled from: AudioSettingsView.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            b.b.a.a.b.l lVar = c.this.e;
            if (lVar.q.m) {
                b.b.a.a.b.p.d dVar = lVar.f754a;
                b.b.a.a.b.p.v.a aVar = lVar.f756c.e;
                dVar.a(aVar, aVar, b.b.a.a.b.p.v.d.a(i));
            }
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    /* compiled from: AudioSettingsView.java */
    /* loaded from: classes.dex */
    public class b implements StepSlideBar.c {
        public b(c cVar) {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.c
        public String a(int i) {
            return i == 0 ? " C " : i < 0 ? String.format("L%2d", Integer.valueOf(-i)) : String.format("R%2d", Integer.valueOf(i));
        }
    }

    /* compiled from: AudioSettingsView.java */
    /* renamed from: b.b.a.a.f.m0.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0053c implements CompoundButton.OnCheckedChangeListener {

        /* compiled from: AudioSettingsView.java */
        /* renamed from: b.b.a.a.f.m0.c$c$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.i.setChecked(cVar.e.c());
            }
        }

        public C0053c() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (c.this.e.c() != z) {
                c.this.e.b(z);
                c.this.l.a(0, 3000, new a());
            }
        }
    }

    /* compiled from: AudioSettingsView.java */
    /* loaded from: classes.dex */
    public class d implements CompoundButton.OnCheckedChangeListener {

        /* compiled from: AudioSettingsView.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.j.setChecked(cVar.e.g());
            }
        }

        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (c.this.e.g() != z) {
                c.this.e.d(z);
                c.this.l.a(1, 3000, new a());
            }
        }
    }

    /* compiled from: AudioSettingsView.java */
    /* loaded from: classes.dex */
    public class e implements CompoundButton.OnCheckedChangeListener {

        /* compiled from: AudioSettingsView.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.k.setChecked(cVar.e.a());
            }
        }

        public e() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (c.this.e.a() != z) {
                c.this.e.a(z);
                c.this.l.a(2, 3000, new a());
            }
        }
    }

    public c(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.g = new b.b.a.a.f.j0.a[7];
        this.h = new b.b.a.a.f.j0.a[3];
        this.d = dVar;
        this.l = new b.b.a.a.f.g0(new Handler(), 3);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.d.x.a((d.m) this);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        int i;
        b.b.a.a.f.j0.a eVar;
        View a2 = a(R.layout.layout_popup_audio_settings_frame);
        b.b.a.a.b.l b2 = this.d.b();
        this.e = b2;
        l.a aVar = b2.q;
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.audio_settings_parent);
        if (aVar.m) {
            a2.findViewById(R.id.sp_balance).setVisibility(0);
            StepSlideBar stepSlideBar = (StepSlideBar) a2.findViewById(R.id.sp_balance_seekbar);
            this.f = stepSlideBar;
            stepSlideBar.a(-10, 10, 1.0f);
            this.f.setValue(this.e.l);
            this.f.setDelegate(new a());
            this.f.setValueIndicator(new b(this));
            i = 1;
        } else {
            a2.findViewById(R.id.sp_balance).setVisibility(8);
            i = 0;
        }
        l.a[] a3 = l.a.a();
        int i2 = aVar.F;
        int i3 = 0;
        for (int i4 = 0; i4 < a3.length; i4++) {
            b.b.a.a.b.o.l a4 = this.e.a(a3[i4]);
            if (a4 != null && ((1 << i4) & i2) != 0 && this.g[i4] == null) {
                if (a3[i4] == l.a.SUBWOOFER) {
                    eVar = new b.b.a.a.f.j0.b(this.f1597b, this.e, a4);
                } else {
                    eVar = new b.b.a.a.f.j0.e(this.f1597b, this.e, a4);
                }
                linearLayout.addView(eVar.b(), i3);
                i++;
                this.g[i4] = eVar;
                i3++;
            }
        }
        j.a[] a5 = j.a.a();
        int i5 = aVar.G;
        for (int i6 = 0; i6 < a5.length; i6++) {
            b.b.a.a.b.o.j jVar = this.e.g.get(a5[i6].f819b);
            if (jVar != null && ((1 << i6) & i5) != 0 && this.h[i6] == null) {
                b.b.a.a.f.j0.d dVar = new b.b.a.a.f.j0.d(this.f1597b, this.e, jVar);
                linearLayout.addView(dVar.b(), i3);
                i++;
                this.h[i6] = dVar;
                i3++;
            }
        }
        if (aVar.i) {
            a2.findViewById(R.id.pmb).setVisibility(0);
            Switch r2 = (Switch) a2.findViewById(R.id.pmb_switch);
            this.i = r2;
            r2.setChecked(this.e.c());
            this.i.setOnCheckedChangeListener(new C0053c());
            i++;
        } else {
            a2.findViewById(R.id.pmb).setVisibility(8);
        }
        if (aVar.j) {
            a2.findViewById(R.id.tone_direct).setVisibility(0);
            Switch r22 = (Switch) a2.findViewById(R.id.tone_direct_switch);
            this.j = r22;
            r22.setChecked(this.e.g());
            this.j.setOnCheckedChangeListener(new d());
            i++;
        } else {
            a2.findViewById(R.id.tone_direct).setVisibility(8);
        }
        if (aVar.k) {
            a2.findViewById(R.id.music_opt).setVisibility(0);
            Switch r1 = (Switch) a2.findViewById(R.id.music_opt_switch);
            this.k = r1;
            r1.setChecked(this.e.a());
            this.k.setOnCheckedChangeListener(new e());
            i++;
        } else {
            a2.findViewById(R.id.music_opt).setVisibility(8);
        }
        if (i > 0) {
            a2.findViewById(R.id.no_tone_control).setVisibility(8);
        } else {
            a2.findViewById(R.id.no_tone_control).setVisibility(0);
        }
        this.e.h();
        return a2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        int i = 0;
        switch (fVar.ordinal()) {
            case 6:
                StepSlideBar stepSlideBar = this.f;
                if (stepSlideBar != null) {
                    stepSlideBar.setValue(this.e.l);
                    return;
                }
                return;
            case 7:
                while (i < 7) {
                    b.b.a.a.f.j0.a[] aVarArr = this.g;
                    if (aVarArr[i] != null) {
                        aVarArr[i].f();
                    }
                    i++;
                }
                return;
            case 8:
                while (i < 3) {
                    b.b.a.a.f.j0.a[] aVarArr2 = this.h;
                    if (aVarArr2[i] != null) {
                        aVarArr2[i].f();
                    }
                    i++;
                }
                return;
            case 9:
                this.l.a(0);
                Switch r1 = this.i;
                if (r1 != null) {
                    r1.setChecked(this.e.c());
                    return;
                }
                return;
            case 10:
                this.l.a(1);
                Switch r12 = this.j;
                if (r12 != null) {
                    r12.setChecked(this.e.g());
                    return;
                }
                return;
            case 11:
                this.l.a(2);
                Switch r13 = this.k;
                if (r13 != null) {
                    r13.setChecked(this.e.a());
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.l.a();
        this.d.x.b(this);
    }
}
