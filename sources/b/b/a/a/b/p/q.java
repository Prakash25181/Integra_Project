package b.b.a.a.b.p;

import b.b.a.a.b.p.r;

/* compiled from: IscpIo.java */
/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.p.v.b f898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f899c;

    public q(r rVar, b.b.a.a.b.p.v.b bVar) {
        this.f899c = rVar;
        this.f898b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f899c.c()) {
            r.a aVar = this.f899c.f900a;
            d.this.a(this.f898b);
        }
    }
}
