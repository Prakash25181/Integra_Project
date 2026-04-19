package androidx.lifecycle;

import a.j.b;
import a.j.e;
import a.j.f;
import a.j.h;

/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements f {

    /* renamed from: a, reason: collision with root package name */
    public final b f713a;

    /* renamed from: b, reason: collision with root package name */
    public final f f714b;

    public FullLifecycleObserverAdapter(b bVar, f fVar) {
        this.f713a = bVar;
        this.f714b = fVar;
    }

    @Override // a.j.f
    public void a(h hVar, e.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f713a.e(hVar);
                break;
            case ON_START:
                this.f713a.f(hVar);
                break;
            case ON_RESUME:
                this.f713a.a(hVar);
                break;
            case ON_PAUSE:
                this.f713a.b(hVar);
                break;
            case ON_STOP:
                this.f713a.d(hVar);
                break;
            case ON_DESTROY:
                this.f713a.c(hVar);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        f fVar = this.f714b;
        if (fVar != null) {
            fVar.a(hVar, aVar);
        }
    }
}
