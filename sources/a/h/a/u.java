package a.h.a;

import a.h.a.v;
import android.graphics.Rect;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.d.a f540c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ v.a e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ View g;
    public final /* synthetic */ Fragment h;
    public final /* synthetic */ Fragment i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ArrayList k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Rect m;

    public u(d0 d0Var, a.d.a aVar, Object obj, v.a aVar2, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f539b = d0Var;
        this.f540c = aVar;
        this.d = obj;
        this.e = aVar2;
        this.f = arrayList;
        this.g = view;
        this.h = fragment;
        this.i = fragment2;
        this.j = z;
        this.k = arrayList2;
        this.l = obj2;
        this.m = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        a.d.a<String, View> a2 = v.a(this.f539b, (a.d.a<String, String>) this.f540c, this.d, this.e);
        if (a2 != null) {
            this.f.addAll(a2.values());
            this.f.add(this.g);
        }
        v.a(this.h, this.i, this.j, a2, false);
        Object obj = this.d;
        if (obj != null) {
            d0 d0Var = this.f539b;
            ArrayList<View> arrayList = this.k;
            ArrayList<View> arrayList2 = this.f;
            y yVar = (y) d0Var;
            if (yVar != null) {
                TransitionSet transitionSet = (TransitionSet) obj;
                transitionSet.getTargets().clear();
                transitionSet.getTargets().addAll(arrayList2);
                yVar.a(transitionSet, arrayList, arrayList2);
                View a3 = v.a(a2, this.e, this.l, this.j);
                if (a3 != null) {
                    this.f539b.a(a3, this.m);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
