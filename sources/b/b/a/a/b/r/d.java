package b.b.a.a.b.r;

import b.b.a.a.e.e;

/* compiled from: IscpImageReceiver.java */
/* loaded from: classes.dex */
public class d implements e.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f954b;

    public d(e eVar, String str) {
        this.f954b = eVar;
        this.f953a = str;
    }

    @Override // b.b.a.a.e.e.b
    public void run() {
        e eVar = this.f954b;
        String str = this.f953a;
        b.b.a.a.e.e eVar2 = eVar.i;
        if (eVar2 != null) {
            eVar2.a();
            eVar.i = null;
        }
        if (str != null) {
            eVar.h = null;
            eVar.g.a(str, new a(eVar, str));
        }
    }
}
