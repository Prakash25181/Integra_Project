package b.b.a.a.f.k0.u;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: NetUsbPage.java */
/* loaded from: classes.dex */
public abstract class n extends b.b.a.a.f.o0.b {
    public View d;

    public n(Context context) {
        super(context);
    }

    public void f() {
        Context context = this.f1597b;
        View view = this.d;
        ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 2);
        view.requestFocus();
    }
}
