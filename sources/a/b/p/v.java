package a.b.p;

import a.b.p.w;
import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: AppCompatSpinner.java */
/* loaded from: classes.dex */
public class v extends h0 {
    public final /* synthetic */ w.d k;
    public final /* synthetic */ w l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, View view, w.d dVar) {
        super(view);
        this.l = wVar;
        this.k = dVar;
    }

    @Override // a.b.p.h0
    public a.b.o.i.p b() {
        return this.k;
    }

    @Override // a.b.p.h0
    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.l.getInternalPopup().a()) {
            return true;
        }
        this.l.a();
        return true;
    }
}
