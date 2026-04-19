package a.h.a;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f485c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ArrayList f;

    public a0(d0 d0Var, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f484b = i;
        this.f485c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i = 0; i < this.f484b; i++) {
            a.e.k.n.a((View) this.f485c.get(i), (String) this.d.get(i));
            a.e.k.n.a((View) this.e.get(i), (String) this.f.get(i));
        }
    }
}
