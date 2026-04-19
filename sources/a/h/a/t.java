package a.h.a;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f537b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f538c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a.d.a e;
    public final /* synthetic */ View f;
    public final /* synthetic */ d0 g;
    public final /* synthetic */ Rect h;

    public t(Fragment fragment, Fragment fragment2, boolean z, a.d.a aVar, View view, d0 d0Var, Rect rect) {
        this.f537b = fragment;
        this.f538c = fragment2;
        this.d = z;
        this.e = aVar;
        this.f = view;
        this.g = d0Var;
        this.h = rect;
    }

    @Override // java.lang.Runnable
    public void run() {
        v.a(this.f537b, this.f538c, this.d, (a.d.a<String, View>) this.e, false);
        View view = this.f;
        if (view != null) {
            this.g.a(view, this.h);
        }
    }
}
