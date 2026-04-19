package a.b.k;

import android.view.View;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class p extends a.e.k.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f38a;

    public p(k kVar) {
        this.f38a = kVar;
    }

    @Override // a.e.k.t
    public void a(View view) {
        this.f38a.p.setAlpha(1.0f);
        this.f38a.s.a((a.e.k.t) null);
        this.f38a.s = null;
    }

    @Override // a.e.k.u, a.e.k.t
    public void b(View view) {
        this.f38a.p.setVisibility(0);
        this.f38a.p.sendAccessibilityEvent(32);
        if (this.f38a.p.getParent() instanceof View) {
            a.e.k.n.l((View) this.f38a.p.getParent());
        }
    }
}
