package a.e.h;

import a.b.k.r;
import a.d.h;
import a.e.h.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a.d.f<String, Typeface> f392a = new a.d.f<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final a.e.h.c f393b = new a.e.h.c("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f394c = new Object();
    public static final h<String, ArrayList<c.InterfaceC0015c<g>>> d = new h<>();
    public static final Comparator<byte[]> e = new d();

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class a implements Callable<g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f395a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.e.h.a f396b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f397c;
        public final /* synthetic */ String d;

        public a(Context context, a.e.h.a aVar, int i, String str) {
            this.f395a = context;
            this.f396b = aVar;
            this.f397c = i;
            this.d = str;
        }

        @Override // java.util.concurrent.Callable
        public g call() {
            g a2 = b.a(this.f395a, this.f396b, this.f397c);
            Typeface typeface = a2.f406a;
            if (typeface != null) {
                b.f392a.a(this.d, typeface);
            }
            return a2;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: a.e.h.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0014b implements c.InterfaceC0015c<g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.e.e.b.g f398a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Handler f399b;

        public C0014b(a.e.e.b.g gVar, Handler handler) {
            this.f398a = gVar;
            this.f399b = handler;
        }

        @Override // a.e.h.c.InterfaceC0015c
        public void a(g gVar) {
            g gVar2 = gVar;
            if (gVar2 == null) {
                this.f398a.a(1, this.f399b);
                return;
            }
            int i = gVar2.f407b;
            if (i == 0) {
                this.f398a.a(gVar2.f406a, this.f399b);
            } else {
                this.f398a.a(i, this.f399b);
            }
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class c implements c.InterfaceC0015c<g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f400a;

        public c(String str) {
            this.f400a = str;
        }

        @Override // a.e.h.c.InterfaceC0015c
        public void a(g gVar) {
            synchronized (b.f394c) {
                ArrayList<c.InterfaceC0015c<g>> arrayList = b.d.get(this.f400a);
                if (arrayList == null) {
                    return;
                }
                b.d.remove(this.f400a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(gVar);
                }
            }
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class d implements Comparator<byte[]> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i;
            int i2;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                i = bArr3.length;
                i2 = bArr4.length;
            } else {
                for (int i3 = 0; i3 < bArr3.length; i3++) {
                    if (bArr3[i3] != bArr4[i3]) {
                        i = bArr3[i3];
                        i2 = bArr4[i3];
                    }
                }
                return 0;
            }
            return i - i2;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f401a;

        /* renamed from: b, reason: collision with root package name */
        public final f[] f402b;

        public e(int i, f[] fVarArr) {
            this.f401a = i;
            this.f402b = fVarArr;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f403a;

        /* renamed from: b, reason: collision with root package name */
        public final int f404b;

        /* renamed from: c, reason: collision with root package name */
        public final int f405c;
        public final boolean d;
        public final int e;

        public f(Uri uri, int i, int i2, boolean z, int i3) {
            if (uri != null) {
                this.f403a = uri;
                this.f404b = i;
                this.f405c = i2;
                this.d = z;
                this.e = i3;
                return;
            }
            throw null;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f406a;

        /* renamed from: b, reason: collision with root package name */
        public final int f407b;

        public g(Typeface typeface, int i) {
            this.f406a = typeface;
            this.f407b = i;
        }
    }

    public static g a(Context context, a.e.h.a aVar, int i) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i2 = a2.f401a;
            if (i2 == 0) {
                Typeface a3 = a.e.f.c.f377a.a(context, (CancellationSignal) null, a2.f402b, i);
                return new g(a3, a3 != null ? 0 : -3);
            }
            return new g(null, i2 == 1 ? -2 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface a(Context context, a.e.h.a aVar, a.e.e.b.g gVar, Handler handler, boolean z, int i, int i2) {
        String str = aVar.f + "-" + i2;
        Typeface a2 = f392a.a((a.d.f<String, Typeface>) str);
        if (a2 != null) {
            if (gVar != null) {
                gVar.a(a2);
            }
            return a2;
        }
        if (z && i == -1) {
            g a3 = a(context, aVar, i2);
            if (gVar != null) {
                int i3 = a3.f407b;
                if (i3 == 0) {
                    gVar.a(a3.f406a, handler);
                } else {
                    gVar.a(i3, handler);
                }
            }
            return a3.f406a;
        }
        a aVar2 = new a(context, aVar, i2, str);
        if (z) {
            try {
                return ((g) f393b.a(aVar2, i)).f406a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0014b c0014b = gVar == null ? null : new C0014b(gVar, handler);
        synchronized (f394c) {
            ArrayList<c.InterfaceC0015c<g>> orDefault = d.getOrDefault(str, null);
            if (orDefault != null) {
                if (c0014b != null) {
                    orDefault.add(c0014b);
                }
                return null;
            }
            if (c0014b != null) {
                ArrayList<c.InterfaceC0015c<g>> arrayList = new ArrayList<>();
                arrayList.add(c0014b);
                d.put(str, arrayList);
            }
            a.e.h.c cVar = f393b;
            c cVar2 = new c(str);
            if (cVar != null) {
                cVar.b(new a.e.h.d(cVar, aVar2, new Handler(), cVar2));
                return null;
            }
            throw null;
        }
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.e == 0) {
                Uri uri = fVar.f403a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, r.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[LOOP:1: B:14:0x004d->B:28:0x0092, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096 A[EDGE_INSN: B:29:0x0096->B:30:0x0096 BREAK  A[LOOP:1: B:14:0x004d->B:28:0x0092], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.e.h.b.e a(android.content.Context r21, android.os.CancellationSignal r22, a.e.h.a r23) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.h.b.a(android.content.Context, android.os.CancellationSignal, a.e.h.a):a.e.h.b$e");
    }
}
