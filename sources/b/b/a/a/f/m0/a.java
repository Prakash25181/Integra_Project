package b.b.a.a.f.m0;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.q.e;
import b.b.a.a.f.m0.t0;
import com.onkyo.integraRemote4A.R;

/* compiled from: AppPopupView.java */
/* loaded from: classes.dex */
public class a extends z0 {
    public b.b.a.a.b.q.a h;
    public t0 i;

    /* compiled from: AppPopupView.java */
    /* renamed from: b.b.a.a.f.m0.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0051a implements t0.a {
        public C0051a() {
        }

        @Override // b.b.a.a.f.m0.t0.a
        public void a() {
            b.b.a.a.b.q.a aVar = a.this.h;
            b.b.a.a.b.q.m mVar = aVar.f930b;
            if (mVar != null && mVar.g == e.b.DIALOG) {
                aVar.f929a.a(b.b.a.a.b.p.v.a.POP, b.b.a.a.b.q.n.a(aVar.f930b, "X---", aVar.f929a.f852c.f801c >= 2014 ? 1 : 0));
            }
            a.this.h();
        }
    }

    public a(Context context, b.b.a.a.b.q.a aVar) {
        super(context);
        this.h = aVar;
    }

    @Override // b.b.a.a.f.m0.z0
    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = 17;
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, this.f1597b.getResources().getDisplayMetrics());
        layoutParams.setMargins(applyDimension, applyDimension, applyDimension, applyDimension);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_ncp_popup);
        TextView textView = (TextView) a2.findViewById(R.id.title_label);
        LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.content_frame);
        t0 t0Var = new t0(this.f1597b, this.h.f930b);
        this.i = t0Var;
        t0Var.a(textView);
        this.i.a(linearLayout);
        this.i.e = new C0051a();
        return a2;
    }

    @Override // b.b.a.a.f.m0.z0
    public void h() {
        if (b.b.a.a.b.q.a.f928c == this.h) {
            b.b.a.a.b.q.a.f928c = null;
        }
        f();
    }
}
