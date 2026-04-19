package b.b.a.a.f.m0;

import android.view.View;
import b.b.a.a.f.m0.t0;

/* compiled from: NcpPopupContent.java */
/* loaded from: classes.dex */
public class o0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.q.b f1515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t0 f1516c;

    public o0(t0 t0Var, b.b.a.a.b.q.b bVar) {
        this.f1516c = t0Var;
        this.f1515b = bVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1515b.h = true;
        t0.a aVar = this.f1516c.e;
        if (aVar != null) {
            aVar.a();
        }
    }
}
