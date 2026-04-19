package b.b.a.a.b.r;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NetUsbPopupNew.java */
/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public b f1027a = new b(this);

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.q.m f1028b;

    /* compiled from: NetUsbPopupNew.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* compiled from: NetUsbPopupNew.java */
    /* loaded from: classes.dex */
    public class b extends b.b.a.a.e.b<a> implements a {
        public b(x xVar) {
        }

        @Override // b.b.a.a.b.r.x.a
        public void a() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
        }
    }

    public void a() {
    }
}
