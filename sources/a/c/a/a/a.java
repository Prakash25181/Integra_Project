package a.c.a.a;

/* compiled from: ArchTaskExecutor.java */
/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f295c;

    /* renamed from: a, reason: collision with root package name */
    public c f296a;

    /* renamed from: b, reason: collision with root package name */
    public c f297b;

    public a() {
        b bVar = new b();
        this.f297b = bVar;
        this.f296a = bVar;
    }

    public static a b() {
        if (f295c != null) {
            return f295c;
        }
        synchronized (a.class) {
            if (f295c == null) {
                f295c = new a();
            }
        }
        return f295c;
    }

    @Override // a.c.a.a.c
    public boolean a() {
        return this.f296a.a();
    }
}
