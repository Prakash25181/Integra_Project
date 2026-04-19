package b.b.a.a.f;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public class h0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f1200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1201c;

    public h0(i0 i0Var, View view) {
        this.f1200b = i0Var;
        this.f1201c = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f1200b.a();
        if (Build.VERSION.SDK_INT >= 16) {
            this.f1201c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else {
            this.f1201c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }
}
