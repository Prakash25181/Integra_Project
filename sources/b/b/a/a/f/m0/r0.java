package b.b.a.a.f.m0;

import android.widget.CompoundButton;
import b.b.a.a.b.q.i;

/* compiled from: NcpPopupContent.java */
/* loaded from: classes.dex */
public class r0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.q.i f1526a;

    public r0(t0 t0Var, b.b.a.a.b.q.i iVar) {
        this.f1526a = iVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b.b.a.a.b.q.i iVar = this.f1526a;
        b.b.a.a.b.q.j jVar = (b.b.a.a.b.q.j) iVar.f931a;
        if (!jVar.g) {
            if (!z || iVar.h) {
                return;
            }
            b.b.a.a.b.q.i iVar2 = (b.b.a.a.b.q.i) jVar.f932b;
            while (iVar2 != null) {
                boolean z2 = iVar2 == iVar;
                if (z2 != iVar2.h) {
                    iVar2.h = z2;
                    i.a aVar = iVar2.e;
                    if (aVar != null) {
                        ((s0) aVar).f1529a.setChecked(z2);
                    }
                }
                iVar2 = (b.b.a.a.b.q.i) iVar2.f933c;
            }
            return;
        }
        if (z != iVar.h) {
            iVar.h = z;
            i.a aVar2 = iVar.e;
            if (aVar2 != null) {
                ((s0) aVar2).f1529a.setChecked(z);
            }
        }
    }
}
