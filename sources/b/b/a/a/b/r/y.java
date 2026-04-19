package b.b.a.a.b.r;

import b.b.a.a.b.p.v.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: NetUsbPopupOld.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f1029a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1030b;

    /* renamed from: c, reason: collision with root package name */
    public String f1031c;
    public int d;
    public String e;
    public int g;
    public int i;
    public c j = new c(this);
    public a[] f = new a[6];
    public String[] h = new String[2];

    /* compiled from: NetUsbPopupOld.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public String f1032a;

        /* renamed from: b, reason: collision with root package name */
        public String f1033b;

        public a(y yVar, String str, String str2) {
            this.f1032a = str;
            this.f1033b = str2;
        }
    }

    /* compiled from: NetUsbPopupOld.java */
    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* compiled from: NetUsbPopupOld.java */
    /* loaded from: classes.dex */
    public class c extends b.b.a.a.e.b<b> implements b {
        public c(y yVar) {
        }

        @Override // b.b.a.a.b.r.y.b
        public void a() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
        }
    }

    public y(b.b.a.a.b.p.d dVar) {
        this.f1029a = dVar;
    }

    public boolean a(b.b.a.a.b.p.v.b bVar) {
        if (bVar.f912b != b.b.a.a.b.p.v.a.NPU) {
            return false;
        }
        b.b.a.a.b.p.v.e eVar = bVar.d;
        this.f1030b = eVar.f916a;
        this.f1031c = eVar.f917b;
        ArrayList<e.a> arrayList = eVar.d;
        this.d = arrayList != null ? arrayList.size() : 0;
        if (this.f1030b) {
            for (int i = 0; i < this.d; i++) {
                ArrayList<e.a> arrayList2 = eVar.d;
                e.a aVar = arrayList2 != null ? arrayList2.get(i) : null;
                this.f[i] = new a(this, aVar.f919a, aVar.f920b);
            }
        } else {
            this.e = eVar.f918c;
        }
        int i2 = eVar.e;
        this.g = i2;
        if (i2 == 1) {
            this.h[0] = eVar.f[0];
        } else {
            String[] strArr = this.h;
            String[] strArr2 = eVar.f;
            strArr[0] = strArr2[0];
            strArr[1] = strArr2[1];
        }
        this.i = eVar.g;
        this.j.a();
        return true;
    }
}
