package b.b.a.a.b.p;

import android.graphics.Bitmap;
import b.b.a.a.b.p.f;

/* compiled from: IscpDiscovery.java */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f888b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f889c;

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f890a;

        public a(g gVar) {
            this.f890a = gVar;
        }

        @Override // b.b.a.a.b.p.f.b
        public void a(Bitmap bitmap) {
            i iVar = k.this.f889c;
            iVar.f881b.post(new j(iVar, this.f890a));
        }
    }

    public k(i iVar, g gVar) {
        this.f889c = iVar;
        this.f888b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r7 != null) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.k.run():void");
    }
}
