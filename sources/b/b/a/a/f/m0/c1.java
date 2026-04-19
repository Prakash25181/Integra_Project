package b.b.a.a.f.m0;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b.b.a.a.b.l;
import b.b.a.a.f.c;
import java.util.ArrayList;

/* compiled from: RemotePopup.java */
/* loaded from: classes.dex */
public class c1 extends g1 {
    public FrameLayout h;
    public LinearLayout i;
    public b.b.a.a.b.p.d j;
    public int k;
    public ArrayList<Button> l;
    public b1 m;

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            c1Var.a((Button) view, new i0(c1Var.f1597b, c1Var.j));
        }
    }

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            c1Var.a((Button) view, new e1(c1Var.f1597b, c1Var.j));
        }
    }

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1.this.a((Button) view);
        }
    }

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            c1Var.a((Button) view, new l2(c1Var.f1597b, c1Var.j));
        }
    }

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c1 c1Var = c1.this;
            c1Var.a((Button) view, new d1(c1Var.f1597b, c1Var.j));
        }
    }

    /* compiled from: RemotePopup.java */
    /* loaded from: classes.dex */
    public class f implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f1420a;

        public f(View view) {
            this.f1420a = view;
        }

        @Override // b.b.a.a.f.c.g
        public void a(boolean z) {
            c1.this.h.removeView(this.f1420a);
        }
    }

    public c1(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.j = dVar;
    }

    public final void a(int i, int i2, String str, View.OnClickListener onClickListener) {
        Drawable drawable;
        Context context = this.f1597b;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Button button = new Button(context, null, R.attr.borderlessButtonStyle);
        int applyDimension = (int) TypedValue.applyDimension(1, 27.0f, displayMetrics);
        if (i2 == 1) {
            drawable = this.f1597b.getResources().getDrawable(com.onkyo.integraRemote4A.R.drawable.segment_1);
        } else if (i == 0) {
            drawable = this.f1597b.getResources().getDrawable(com.onkyo.integraRemote4A.R.drawable.segment_left);
        } else if (i == i2 - 1) {
            drawable = this.f1597b.getResources().getDrawable(com.onkyo.integraRemote4A.R.drawable.segment_right);
        } else {
            drawable = this.f1597b.getResources().getDrawable(com.onkyo.integraRemote4A.R.drawable.segment_mid);
        }
        button.setBackgroundDrawable(drawable);
        button.setText(str);
        button.setTextColor(context.getResources().getColorStateList(com.onkyo.integraRemote4A.R.color.remote_segment_button_text));
        button.setAllCaps(false);
        button.setGravity(17);
        button.setTextSize(12.0f);
        button.setOnClickListener(onClickListener);
        button.setPadding(0, 0, 0, 0);
        button.setSingleLine();
        button.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, applyDimension);
        layoutParams.setMargins(0, 0, 0, 0);
        layoutParams.weight = 1.0f;
        this.i.addView(button, layoutParams);
        this.l.add(button);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(com.onkyo.integraRemote4A.R.layout.layout_popup_remote);
        this.h = (FrameLayout) a2.findViewById(com.onkyo.integraRemote4A.R.id.remote_parent_parent);
        this.i = (LinearLayout) a2.findViewById(com.onkyo.integraRemote4A.R.id.segment_button_parent);
        this.k = -1;
        this.l = new ArrayList<>();
        b.b.a.a.b.l b2 = this.j.b();
        l.a aVar = b2.q;
        b2.d();
        int i = 0;
        int i2 = aVar.x ? 1 : 0;
        if (aVar.u) {
            i2++;
        }
        int i3 = i2 + 1;
        if (aVar.z) {
            i3++;
        }
        if (aVar.t) {
            i3++;
        }
        if (aVar.x) {
            a(0, i3, "PLAYER", new a());
            i = 1;
        }
        if (aVar.u) {
            a(i, i3, "CD(RI)", new b());
            i++;
        }
        int i4 = i + 1;
        a(i, i3, this.j.h(), new c());
        if (aVar.z) {
            a(i4, i3, "TV", new d());
            i4++;
        }
        if (aVar.t) {
            a(i4, i3, "AMP(RI)", new e());
        }
        a(this.l.get(i));
        return a2;
    }

    public final void a(Button button) {
        b.b.a.a.b.p.d dVar = this.j;
        if (dVar.f852c.f801c <= 2011) {
            a(button, new l0(this.f1597b, dVar));
        } else {
            a(button, new k0(this.f1597b, dVar));
        }
    }

    public final void a(Button button, b1 b1Var) {
        int width;
        int i;
        int indexOf = this.l.indexOf(button);
        int i2 = this.k;
        if (i2 != indexOf) {
            if (i2 != -1) {
                this.l.get(i2).setSelected(false);
            }
            this.l.get(indexOf).setSelected(true);
            int i3 = this.k;
            if (i3 == -1) {
                this.h.addView(b1Var.f1404c);
            } else {
                if (indexOf < i3) {
                    width = -this.h.getWidth();
                    i = this.h.getWidth();
                } else {
                    width = this.h.getWidth();
                    i = -this.h.getWidth();
                }
                b1 b1Var2 = this.m;
                if (b1Var2 != null) {
                    View view = b1Var2.f1404c;
                    b.b.a.a.f.c.b(view, i, (c.g) new f(view));
                }
                if (b1Var != null) {
                    View view2 = b1Var.f1404c;
                    view2.setX(width);
                    this.h.addView(view2);
                    b.b.a.a.f.c.b(view2, 0, (c.g) null);
                }
            }
            this.k = indexOf;
            this.m = b1Var;
        }
    }
}
