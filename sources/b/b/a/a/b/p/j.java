package b.b.a.a.b.p;

import b.b.a.a.b.p.i;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;
import java.util.ArrayList;

/* compiled from: IscpDiscovery.java */
/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f886b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f887c;

    public j(i iVar, g gVar) {
        this.f887c = iVar;
        this.f886b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int indexOf;
        b.b.a.a.f.l0.k kVar;
        i iVar = this.f887c;
        if (iVar.d && (indexOf = iVar.f.indexOf(this.f886b)) != -1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(indexOf));
            i iVar2 = this.f887c;
            i iVar3 = iVar2.f880a;
            i.c cVar = iVar2.f882c;
            if (cVar == null || !iVar2.d || (kVar = ConnectionActivity.this.v) == null) {
                return;
            }
            kVar.c(iVar3, arrayList);
        }
    }
}
