package b.b.a.a.f.m0;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;

/* compiled from: DeviceInfoPopup.java */
/* loaded from: classes.dex */
public class j0 extends z0 implements d.k {
    public View h;
    public View i;
    public TextView j;
    public View k;
    public TextView l;
    public View m;
    public View n;
    public TextView o;
    public View p;
    public TextView q;
    public View r;
    public b.b.a.a.b.p.d s;
    public b.b.a.a.b.h t;
    public b.b.a.a.f.g0 u;
    public boolean v;
    public boolean w;

    /* compiled from: DeviceInfoPopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0.this.f();
        }
    }

    /* compiled from: DeviceInfoPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1475a;

        public b(j0 j0Var, View view) {
            this.f1475a = view;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f1475a.setPivotX((i3 - i) / 2);
            this.f1475a.setPivotY((i4 - i2) / 2);
        }
    }

    /* compiled from: DeviceInfoPopup.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.b.a.a.b.h hVar = j0.this.t;
            if (hVar.q.D) {
                hVar.f754a.a(b.b.a.a.b.p.v.a.IFV);
            }
            j0.this.t.e(false);
        }
    }

    public j0(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.s = dVar;
        this.t = (b.b.a.a.b.h) dVar.a(b.b.a.a.b.o.r.MAIN);
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.s.x.a((d.m) this);
        b.b.a.a.b.h hVar = this.t;
        hVar.A = null;
        if (hVar.q.D) {
            hVar.f754a.a(b.b.a.a.b.p.v.a.IFV);
        }
        this.t.e(true);
        this.u.a(0, 5000, 5000, new c());
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_popup_device_info);
        this.h = a2.findViewById(R.id.audio_frame);
        this.i = a2.findViewById(R.id.audio_input_frame);
        this.j = (TextView) a2.findViewById(R.id.audio_input_data);
        this.k = a2.findViewById(R.id.audio_output_frame);
        this.l = (TextView) a2.findViewById(R.id.audio_output_data);
        this.m = a2.findViewById(R.id.video_frame);
        this.n = a2.findViewById(R.id.video_input_frame);
        this.o = (TextView) a2.findViewById(R.id.video_input_data);
        this.p = a2.findViewById(R.id.video_output_frame);
        this.q = (TextView) a2.findViewById(R.id.video_output_data);
        this.r = a2.findViewById(R.id.no_info_frame);
        this.u = new b.b.a.a.f.g0(new Handler(), 1);
        a2.setOnClickListener(new a());
        a2.addOnLayoutChangeListener(new b(this, a2));
        return a2;
    }

    public final void j() {
        if (!this.v && !this.w) {
            this.r.setVisibility(0);
        } else {
            this.r.setVisibility(8);
        }
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        if (fVar == d.f.AUDIO_INFO_UPDATED || fVar == d.f.VIDEO_INFO_UPDATED) {
            if (fVar == d.f.AUDIO_INFO_UPDATED) {
                b.b.a.a.b.o.a aVar = this.t.z;
                if (aVar != null) {
                    String str9 = aVar.f796a;
                    if ((str9 != null && str9.length() > 0) || ((str6 = aVar.f797b) != null && str6.length() > 0) || (((str7 = aVar.e) != null && str7.length() > 0) || ((str8 = aVar.d) != null && str8.length() > 0))) {
                        this.h.setVisibility(0);
                        StringBuilder sb = new StringBuilder();
                        a(sb, aVar.f796a);
                        a(sb, aVar.f797b);
                        a(sb, aVar.f798c);
                        if (sb.length() > 0) {
                            this.i.setVisibility(0);
                            this.j.setText(sb.toString());
                        } else {
                            this.i.setVisibility(8);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        a(sb2, aVar.e);
                        a(sb2, aVar.d);
                        if (sb2.length() > 0) {
                            this.k.setVisibility(0);
                            this.l.setText(sb2.toString());
                        } else {
                            this.k.setVisibility(8);
                        }
                        this.v = true;
                        j();
                    }
                }
                this.h.setVisibility(8);
                this.v = false;
                j();
            }
            if (fVar == d.f.VIDEO_INFO_UPDATED) {
                b.b.a.a.b.o.q qVar = this.t.A;
                if (qVar == null) {
                    String str10 = qVar.f833a;
                    if (!((str10 != null && str10.length() > 0) || ((str = qVar.f834b) != null && str.length() > 0) || (((str2 = qVar.f835c) != null && str2.length() > 0) || (((str3 = qVar.d) != null && str3.length() > 0) || (((str4 = qVar.e) != null && str4.length() > 0) || ((str5 = qVar.f) != null && str5.length() > 0)))))) {
                        this.m.setVisibility(8);
                        this.w = false;
                        j();
                    }
                }
                this.m.setVisibility(0);
                StringBuilder sb3 = new StringBuilder();
                a(sb3, qVar.f833a);
                a(sb3, qVar.f834b);
                a(sb3, qVar.f835c);
                if (sb3.length() > 0) {
                    this.n.setVisibility(0);
                    this.o.setText(sb3.toString());
                } else {
                    this.n.setVisibility(8);
                }
                StringBuilder sb4 = new StringBuilder();
                a(sb4, qVar.d);
                a(sb4, qVar.e);
                a(sb4, qVar.f);
                if (sb4.length() > 0) {
                    this.p.setVisibility(0);
                    this.q.setText(sb4.toString());
                } else {
                    this.p.setVisibility(8);
                }
                this.w = true;
                j();
            }
            this.f.forceLayout();
            this.e.requestLayout();
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.s.x.b(this);
        this.u.a();
    }

    public final void a(StringBuilder sb, String str) {
        if (str != null) {
            if (sb.length() > 0) {
                sb.append("\n");
            }
            sb.append(str);
        }
    }
}
