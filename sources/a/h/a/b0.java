package a.h.a;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: FragmentTransitionImpl.java */
/* loaded from: classes.dex */
public class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f489c;

    public b0(d0 d0Var, ArrayList arrayList, Map map) {
        this.f488b = arrayList;
        this.f489c = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        int size = this.f488b.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f488b.get(i);
            String e = a.e.k.n.e(view);
            if (e != null) {
                Iterator it = this.f489c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (e.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                a.e.k.n.a(view, str);
            }
        }
    }
}
