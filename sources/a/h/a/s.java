package a.h.a;

import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class s implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f535b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f536c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Fragment e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ ArrayList g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ Object i;

    public s(Object obj, d0 d0Var, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f535b = obj;
        this.f536c = d0Var;
        this.d = view;
        this.e = fragment;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
        this.i = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj = this.f535b;
        if (obj != null) {
            d0 d0Var = this.f536c;
            View view = this.d;
            if (((y) d0Var) != null) {
                if (obj != null) {
                    ((Transition) obj).removeTarget(view);
                }
                this.g.addAll(v.a(this.f536c, this.f535b, this.e, (ArrayList<View>) this.f, this.d));
            } else {
                throw null;
            }
        }
        if (this.h != null) {
            if (this.i != null) {
                ArrayList<View> arrayList = new ArrayList<>();
                arrayList.add(this.d);
                this.f536c.a(this.i, this.h, arrayList);
            }
            this.h.clear();
            this.h.add(this.d);
        }
    }
}
