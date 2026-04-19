package a.j;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: ViewModelStore.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, q> f577a = new HashMap<>();

    public final void a() {
        Iterator<q> it = this.f577a.values().iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f577a.clear();
    }
}
