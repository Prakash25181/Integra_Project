package b.b.a.a.b;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NetworkServiceList.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.e.d<b.b.a.a.b.o.f> f741a;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.o.f f742b;

    /* renamed from: c, reason: collision with root package name */
    public b.b.a.a.b.o.f f743c;

    /* compiled from: NetworkServiceList.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f744a;

        static {
            int[] iArr = new int[b.b.a.a.b.o.e.values().length];
            f744a = iArr;
            try {
                b.b.a.a.b.o.e eVar = b.b.a.a.b.o.e.NET_TOP;
                iArr[24] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f744a;
                b.b.a.a.b.o.e eVar2 = b.b.a.a.b.o.e.THIS_DEVICE;
                iArr2[27] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: NetworkServiceList.java */
    /* loaded from: classes.dex */
    public static class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public b.b.a.a.b.o.e f745b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f746c;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    public i(b.b.a.a.b.o.c cVar) {
        this.f741a = new b.b.a.a.e.d<>(cVar.R);
        this.f742b = cVar.S;
        this.f743c = cVar.T;
    }

    public b.b.a.a.b.o.f a(b.b.a.a.b.o.e eVar) {
        int ordinal = eVar.ordinal();
        if (ordinal == 24) {
            return this.f742b;
        }
        if (ordinal != 27) {
            Iterator<b.b.a.a.b.o.f> it = this.f741a.f1137b.iterator();
            while (it.hasNext()) {
                b.b.a.a.b.o.f next = it.next();
                if (next.f808a == eVar) {
                    return next;
                }
            }
            return null;
        }
        return this.f743c;
    }

    public void a(ObjectOutput objectOutput) {
        ArrayList arrayList = new ArrayList();
        Iterator<b.b.a.a.b.o.f> it = this.f741a.f1137b.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.f next = it.next();
            b bVar = new b(null);
            bVar.f745b = next.f808a;
            bVar.f746c = this.f741a.a(next);
            arrayList.add(bVar);
        }
        try {
            objectOutput.writeObject(arrayList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(ObjectInput objectInput) {
        ArrayList arrayList;
        try {
            arrayList = (ArrayList) objectInput.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            arrayList = null;
        }
        if (arrayList != null) {
            int i = 0;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                b.b.a.a.b.o.f a2 = a(bVar.f745b);
                if (a2 != null) {
                    b.b.a.a.e.d<b.b.a.a.b.o.f> dVar = this.f741a;
                    dVar.a(dVar.f1137b.indexOf(a2), i);
                    this.f741a.a((b.b.a.a.e.d<b.b.a.a.b.o.f>) a2, bVar.f746c);
                    i++;
                }
            }
        }
    }
}
