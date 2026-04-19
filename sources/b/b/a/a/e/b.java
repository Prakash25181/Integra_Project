package b.b.a.a.e;

import java.util.HashSet;

/* compiled from: GenericsObserver.java */
/* loaded from: classes.dex */
public class b<CLASS> {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<CLASS> f1132b = new HashSet<>();

    public void a(CLASS r3) {
        synchronized (this.f1132b) {
            this.f1132b.add(r3);
        }
    }

    public void b(CLASS r3) {
        synchronized (this.f1132b) {
            this.f1132b.remove(r3);
        }
    }

    public Iterable<CLASS> g() {
        return new HashSet(this.f1132b);
    }
}
