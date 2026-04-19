package a.b.o.i;

import a.b.o.i.m;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* compiled from: MenuPopupHelper.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f145a;

    /* renamed from: b, reason: collision with root package name */
    public final g f146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f147c;
    public final int d;
    public final int e;
    public View f;
    public boolean h;
    public m.a i;
    public k j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new a();

    /* compiled from: MenuPopupHelper.java */
    /* loaded from: classes.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.c();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.f145a = context;
        this.f146b = gVar;
        this.f = view;
        this.f147c = z;
        this.d = i;
        this.e = i2;
    }

    public k a() {
        k qVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f145a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealSize(point);
            } else {
                defaultDisplay.getSize(point);
            }
            if (Math.min(point.x, point.y) >= this.f145a.getResources().getDimensionPixelSize(a.b.d.abc_cascading_menus_min_smallest_width)) {
                qVar = new d(this.f145a, this.f, this.d, this.e, this.f147c);
            } else {
                qVar = new q(this.f145a, this.f146b, this.f, this.d, this.e, this.f147c);
            }
            qVar.a(this.f146b);
            qVar.a(this.l);
            qVar.a(this.f);
            qVar.a(this.i);
            qVar.b(this.h);
            qVar.a(this.g);
            this.j = qVar;
        }
        return this.j;
    }

    public boolean b() {
        k kVar = this.j;
        return kVar != null && kVar.a();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean d() {
        if (b()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        a(0, 0, false, false);
        return true;
    }

    public final void a(int i, int i2, boolean z, boolean z2) {
        k a2 = a();
        a2.c(z2);
        if (z) {
            if ((a.b.k.r.a(this.g, a.e.k.n.c(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.b(i);
            a2.c(i2);
            int i3 = (int) ((this.f145a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f144b = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        a2.e();
    }

    public void a(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.a(aVar);
        }
    }
}
