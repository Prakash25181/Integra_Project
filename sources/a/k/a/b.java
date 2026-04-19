package a.k.a;

import a.b.k.r;
import a.d.i;
import a.j.h;
import a.j.m;
import a.j.n;
import a.j.q;
import a.j.s;
import a.j.t;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManagerImpl.java */
/* loaded from: classes.dex */
public class b extends a.k.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f578a;

    /* renamed from: b, reason: collision with root package name */
    public final c f579b;

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a<D> extends m<D> {
        public h j;
        public C0023b<D> k;

        @Override // androidx.lifecycle.LiveData
        public void a() {
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        public void b() {
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            r.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void a(n<? super D> nVar) {
            super.a((n) nVar);
            this.j = null;
            this.k = null;
        }

        @Override // a.j.m
        public void a(D d) {
            super.a((a<D>) d);
        }
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: a.k.a.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0023b<D> implements n<D> {
    }

    /* compiled from: LoaderManagerImpl.java */
    /* loaded from: classes.dex */
    public static class c extends q {

        /* renamed from: c, reason: collision with root package name */
        public static final a.j.r f580c = new a();

        /* renamed from: b, reason: collision with root package name */
        public i<a> f581b = new i<>(10);

        /* compiled from: LoaderManagerImpl.java */
        /* loaded from: classes.dex */
        public static class a implements a.j.r {
            @Override // a.j.r
            public <T extends q> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // a.j.q
        public void b() {
            if (this.f581b.b() > 0) {
                if (this.f581b.d(0) != null) {
                    throw null;
                }
                throw null;
            }
            i<a> iVar = this.f581b;
            int i = iVar.e;
            Object[] objArr = iVar.d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            iVar.e = 0;
            iVar.f331b = false;
        }
    }

    public b(h hVar, t tVar) {
        q a2;
        this.f578a = hVar;
        a.j.r rVar = c.f580c;
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName != null) {
            String a3 = b.a.a.a.a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            q qVar = tVar.f577a.get(a3);
            if (!c.class.isInstance(qVar)) {
                if (rVar instanceof s) {
                    a2 = ((s) rVar).a(a3, c.class);
                } else {
                    a2 = rVar.a(c.class);
                }
                qVar = a2;
                q put = tVar.f577a.put(a3, qVar);
                if (put != null) {
                    put.b();
                }
            }
            this.f579b = (c) qVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // a.k.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f579b;
        if (cVar.f581b.b() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            if (cVar.f581b.b() <= 0) {
                return;
            }
            a d = cVar.f581b.d(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f581b.b(0));
            printWriter.print(": ");
            printWriter.println(d.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            throw null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        r.a((Object) this.f578a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
