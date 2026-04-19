package a.b.k;

import android.view.View;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f36b;

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class a extends a.e.k.u {
        public a() {
        }

        @Override // a.e.k.t
        public void a(View view) {
            o.this.f36b.p.setAlpha(1.0f);
            o.this.f36b.s.a((a.e.k.t) null);
            o.this.f36b.s = null;
        }

        @Override // a.e.k.u, a.e.k.t
        public void b(View view) {
            o.this.f36b.p.setVisibility(0);
        }
    }

    public o(k kVar) {
        this.f36b = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k kVar = this.f36b;
        kVar.q.showAtLocation(kVar.p, 55, 0, 0);
        this.f36b.e();
        if (this.f36b.k()) {
            this.f36b.p.setAlpha(0.0f);
            k kVar2 = this.f36b;
            a.e.k.s a2 = a.e.k.n.a(kVar2.p);
            a2.a(1.0f);
            kVar2.s = a2;
            this.f36b.s.a(new a());
            return;
        }
        this.f36b.p.setAlpha(1.0f);
        this.f36b.p.setVisibility(0);
    }
}
