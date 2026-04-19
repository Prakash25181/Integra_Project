package androidx.lifecycle;

import a.j.c;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.l;

/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements f {

    /* renamed from: a, reason: collision with root package name */
    public final c[] f712a;

    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f712a = cVarArr;
    }

    @Override // a.j.f
    public void a(h hVar, e.a aVar) {
        l lVar = new l();
        for (c cVar : this.f712a) {
            cVar.a(hVar, aVar, false, lVar);
        }
        for (c cVar2 : this.f712a) {
            cVar2.a(hVar, aVar, true, lVar);
        }
    }
}
