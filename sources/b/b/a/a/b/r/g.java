package b.b.a.a.b.r;

import b.b.a.a.b.r.l;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: NetTopDirectory.java */
/* loaded from: classes.dex */
public class g extends i {
    public g(ArrayList<b.b.a.a.b.o.f> arrayList) {
        super("Network", 0, l.e.LIST, 0);
        Iterator<b.b.a.a.b.o.f> it = arrayList.iterator();
        while (it.hasNext()) {
            this.e.add(new f(it.next()));
        }
        this.f = arrayList.size();
        this.g = true;
    }

    @Override // b.b.a.a.b.r.i
    public void a(ArrayList<h> arrayList, int i) {
    }
}
