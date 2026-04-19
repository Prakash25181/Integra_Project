package b.b.a.a.f.o0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: ControlBase.java */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: b, reason: collision with root package name */
    public Context f1597b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnAttachStateChangeListener f1598c = new a();

    /* compiled from: ControlBase.java */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.this.a(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            b.this.b(view);
        }
    }

    public b(Context context) {
        this.f1597b = context;
    }

    public View a(int i) {
        View inflate = ((LayoutInflater) this.f1597b.getSystemService("layout_inflater")).inflate(i, (ViewGroup) null);
        inflate.addOnAttachStateChangeListener(this.f1598c);
        return inflate;
    }

    public void a(View view) {
    }

    public abstract View b();

    public void b(View view) {
    }
}
