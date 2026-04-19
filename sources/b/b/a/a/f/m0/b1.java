package b.b.a.a.f.m0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/* compiled from: RemoteControllerView.java */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: b, reason: collision with root package name */
    public Context f1403b;

    /* renamed from: c, reason: collision with root package name */
    public View f1404c;
    public View.OnAttachStateChangeListener d = new a();

    /* compiled from: RemoteControllerView.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b1.this.a(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b1.this.c(view);
        }
    }

    public b1(Context context) {
        this.f1403b = context;
    }

    public View a(int i) {
        View inflate = ((LayoutInflater) this.f1403b.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        this.f1404c = inflate;
        b(inflate);
        this.f1404c.addOnAttachStateChangeListener(this.d);
        return this.f1404c;
    }

    public void a(View view) {
    }

    public abstract void b(View view);

    public void c(View view) {
    }

    public void a(int i, View.OnClickListener onClickListener) {
        a(i, true, null, onClickListener);
    }

    public void a(int i, boolean z, String str, View.OnClickListener onClickListener) {
        View findViewById = this.f1404c.findViewById(i);
        if (str != null && (findViewById instanceof Button)) {
            ((Button) findViewById).setText(str);
        }
        findViewById.setVisibility(z ? 0 : 4);
        findViewById.setOnClickListener(onClickListener);
    }
}
