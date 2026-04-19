package b.b.a.a.f.k0;

import b.b.a.a.f.k0.c;

/* compiled from: CdPlayerControlPage.java */
/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f1216b;

    public b(c cVar) {
        this.f1216b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1216b.w.a(1);
        c cVar = this.f1216b;
        if (cVar.v == c.k.SEEK_WAIT) {
            cVar.v = c.k.NONE;
            cVar.i();
        }
    }
}
