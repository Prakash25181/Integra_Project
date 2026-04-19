package a.h.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public class c0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f492c;

    public c0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f491b = arrayList;
        this.f492c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size = this.f491b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f491b.get(i);
            a.e.k.n.a(view, (String) this.f492c.get(a.e.k.n.e(view)));
        }
    }
}
