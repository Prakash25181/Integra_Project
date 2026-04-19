package a.h.a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel.java */
/* loaded from: classes.dex */
public class o extends a.j.q {
    public static final a.j.r h = new a();
    public final boolean e;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet<Fragment> f524b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, o> f525c = new HashMap<>();
    public final HashMap<String, a.j.t> d = new HashMap<>();
    public boolean f = false;
    public boolean g = false;

    /* compiled from: FragmentManagerViewModel.java */
    /* loaded from: classes.dex */
    public static class a implements a.j.r {
        @Override // a.j.r
        public <T extends a.j.q> T a(Class<T> cls) {
            return new o(true);
        }
    }

    public o(boolean z) {
        this.e = z;
    }

    public boolean a(Fragment fragment) {
        if (!this.f524b.contains(fragment)) {
            return true;
        }
        if (this.e) {
            return this.f;
        }
        return !this.g;
    }

    @Override // a.j.q
    public void b() {
        if (j.G) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return this.f524b.equals(oVar.f524b) && this.f525c.equals(oVar.f525c) && this.d.equals(oVar.d);
    }

    public int hashCode() {
        return this.d.hashCode() + ((this.f525c.hashCode() + (this.f524b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f524b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f525c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
