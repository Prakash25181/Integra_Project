package b.b.a.a.f.k0.u;

import android.view.View;
import b.b.a.a.b.r.y;

/* compiled from: NetUsbPopupPage.java */
/* loaded from: classes.dex */
public class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f1340c;

    public q(r rVar, int i) {
        this.f1340c = rVar;
        this.f1339b = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        y yVar = this.f1340c.i;
        int i = this.f1339b;
        int i2 = yVar.i;
        if (i != i2) {
            if (i < i2) {
                b.b.a.a.b.p.d dVar = yVar.f1029a;
                dVar.a(dVar.b().b(), "UP");
            } else {
                b.b.a.a.b.p.d dVar2 = yVar.f1029a;
                dVar2.a(dVar2.b().b(), "DOWN");
            }
        }
        b.b.a.a.b.p.d dVar3 = yVar.f1029a;
        dVar3.a(dVar3.b().b(), "SELECT");
    }
}
