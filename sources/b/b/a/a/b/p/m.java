package b.b.a.a.b.p;

import b.b.a.a.b.p.i;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;
import java.util.ArrayList;

/* compiled from: IscpDiscovery.java */
/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i.d f893b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f894c;

    public m(i iVar, i.d dVar) {
        this.f894c = iVar;
        this.f893b = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.b.a.a.f.l0.k kVar;
        i iVar = this.f894c;
        if (iVar.d) {
            ArrayList arrayList = null;
            int size = iVar.f.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                g gVar = this.f894c.f.get(size);
                if (this.f893b.a(gVar)) {
                    this.f894c.f.remove(size);
                    i iVar2 = this.f894c;
                    if (iVar2.g && gVar.g.compareToIgnoreCase(iVar2.h) == 0) {
                        this.f894c.g = false;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(Integer.valueOf(size));
                }
            }
            if (arrayList != null) {
                i iVar3 = this.f894c;
                i iVar4 = iVar3.f880a;
                i.c cVar = iVar3.f882c;
                if (cVar == null || !iVar3.d || (kVar = ConnectionActivity.this.v) == null) {
                    return;
                }
                kVar.b(iVar4, arrayList);
            }
        }
    }
}
