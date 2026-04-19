package b.b.a.a.b;

import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SelectorList.java */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.e.d<b.b.a.a.b.o.i> f747a;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.o.i f748b;

    /* compiled from: SelectorList.java */
    /* loaded from: classes.dex */
    public static class b implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public b.b.a.a.b.o.h f749b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f750c;
        public String d;
        public String e;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    public b.b.a.a.b.o.i a(b.b.a.a.b.o.h hVar) {
        if (hVar == b.b.a.a.b.o.h.AIRPLAY) {
            if (this.f748b == null) {
                b.b.a.a.b.o.i iVar = new b.b.a.a.b.o.i();
                b.b.a.a.b.o.h hVar2 = b.b.a.a.b.o.h.AIRPLAY;
                iVar.f817b = hVar2;
                iVar.d = "Airplay";
                iVar.e = 255;
                iVar.f818c = b.b.a.a.b.o.g.a(b.b.a.a.b.o.g.d.get(Integer.valueOf(hVar2.f815b)));
                this.f748b = iVar;
            }
            return this.f748b;
        }
        Iterator<b.b.a.a.b.o.i> it = this.f747a.f1137b.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.i next = it.next();
            if (next.f817b == hVar) {
                return next;
            }
        }
        return null;
    }

    public void a(ObjectOutput objectOutput) {
        ArrayList arrayList = new ArrayList();
        Iterator<b.b.a.a.b.o.i> it = this.f747a.f1137b.iterator();
        while (it.hasNext()) {
            b.b.a.a.b.o.i next = it.next();
            b bVar = new b(null);
            bVar.f749b = next.f817b;
            bVar.f750c = this.f747a.a(next);
            bVar.d = next.f818c.f812a;
            if (next.d.equals(next.a())) {
                bVar.e = "";
            } else {
                bVar.e = next.d;
            }
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
                b.b.a.a.b.o.i a2 = a(bVar.f749b);
                if (a2 != null) {
                    a2.a(bVar.e);
                    a2.a(b.b.a.a.b.o.g.a(bVar.d));
                    b.b.a.a.e.d<b.b.a.a.b.o.i> dVar = this.f747a;
                    dVar.a(dVar.f1137b.indexOf(a2), i);
                    this.f747a.a((b.b.a.a.e.d<b.b.a.a.b.o.i>) a2, bVar.f750c);
                    i++;
                }
            }
        }
    }
}
