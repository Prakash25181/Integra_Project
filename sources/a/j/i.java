package a.j;

import a.c.a.b.b;
import a.j.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class i extends e {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference<h> f570c;

    /* renamed from: a, reason: collision with root package name */
    public a.c.a.b.a<g, a> f568a = new a.c.a.b.a<>();
    public int d = 0;
    public boolean e = false;
    public boolean f = false;
    public ArrayList<e.b> g = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public e.b f569b = e.b.INITIALIZED;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f571a;

        /* renamed from: b, reason: collision with root package name */
        public f f572b;

        public a(g gVar, e.b bVar) {
            this.f572b = k.a(gVar);
            this.f571a = bVar;
        }

        public void a(h hVar, e.a aVar) {
            e.b b2 = i.b(aVar);
            this.f571a = i.a(this.f571a, b2);
            this.f572b.a(hVar, aVar);
            this.f571a = b2;
        }
    }

    public i(h hVar) {
        this.f570c = new WeakReference<>(hVar);
    }

    public void a(e.a aVar) {
        a(b(aVar));
    }

    public final e.b b(g gVar) {
        a.c.a.b.a<g, a> aVar = this.f568a;
        e.b bVar = null;
        b.c<g, a> cVar = aVar.f.containsKey(gVar) ? aVar.f.get(gVar).e : null;
        e.b bVar2 = cVar != null ? cVar.getValue().f571a : null;
        if (!this.g.isEmpty()) {
            bVar = this.g.get(r0.size() - 1);
        }
        return a(a(this.f569b, bVar2), bVar);
    }

    public final void a(e.b bVar) {
        if (this.f569b == bVar) {
            return;
        }
        this.f569b = bVar;
        if (!this.e && this.d == 0) {
            this.e = true;
            b();
            this.e = false;
            return;
        }
        this.f = true;
    }

    public static e.b b(e.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return e.b.RESUMED;
                }
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return e.b.DESTROYED;
                        }
                        throw new IllegalArgumentException("Unexpected event value " + aVar);
                    }
                }
            }
            return e.b.STARTED;
        }
        return e.b.CREATED;
    }

    @Override // a.j.e
    public void a(g gVar) {
        h hVar;
        e.b bVar = this.f569b;
        e.b bVar2 = e.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = e.b.INITIALIZED;
        }
        a aVar = new a(gVar, bVar2);
        if (this.f568a.b(gVar, aVar) == null && (hVar = this.f570c.get()) != null) {
            boolean z = this.d != 0 || this.e;
            e.b b2 = b(gVar);
            this.d++;
            while (aVar.f571a.compareTo(b2) < 0 && this.f568a.f.containsKey(gVar)) {
                this.g.add(aVar.f571a);
                aVar.a(hVar, b(aVar.f571a));
                a();
                b2 = b(gVar);
            }
            if (!z) {
                b();
            }
            this.d--;
        }
    }

    public static e.a b(e.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return e.a.ON_CREATE;
        }
        if (ordinal == 2) {
            return e.a.ON_START;
        }
        if (ordinal == 3) {
            return e.a.ON_RESUME;
        }
        if (ordinal != 4) {
            throw new IllegalArgumentException("Unexpected state value " + bVar);
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0140 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.j.i.b():void");
    }

    public final void a() {
        this.g.remove(r0.size() - 1);
    }

    public static e.b a(e.b bVar, e.b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }
}
