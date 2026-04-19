package b.b.a.a.f.k0.u;

import android.view.View;

/* compiled from: NetUsbOverlayPopup.java */
/* loaded from: classes.dex */
public class j implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f1314b;

    public j(m mVar) {
        this.f1314b = mVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1314b.e.a(0);
    }
}
