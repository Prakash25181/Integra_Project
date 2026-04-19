package a.b.p;

import android.R;
import android.view.View;
import android.view.Window;

/* compiled from: ToolbarWidgetWrapper.java */
/* loaded from: classes.dex */
public class y0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final a.b.o.i.a f285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f286c;

    public y0(z0 z0Var) {
        this.f286c = z0Var;
        this.f285b = new a.b.o.i.a(this.f286c.f289a.getContext(), 0, R.id.home, 0, 0, this.f286c.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        z0 z0Var = this.f286c;
        Window.Callback callback = z0Var.l;
        if (callback == null || !z0Var.m) {
            return;
        }
        callback.onMenuItemSelected(0, this.f285b);
    }
}
