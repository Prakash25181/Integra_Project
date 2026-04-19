package androidx.lifecycle;

import a.j.a;
import a.j.e;
import a.j.f;
import a.j.h;

/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f721a;

    /* renamed from: b, reason: collision with root package name */
    public final a.C0022a f722b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f721a = obj;
        this.f722b = a.f559c.a(obj.getClass());
    }

    @Override // a.j.f
    public void a(h hVar, e.a aVar) {
        a.C0022a c0022a = this.f722b;
        Object obj = this.f721a;
        a.C0022a.a(c0022a.f562a.get(aVar), hVar, aVar, obj);
        a.C0022a.a(c0022a.f562a.get(e.a.ON_ANY), hVar, aVar, obj);
    }
}
