package a.h.a;

import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: Fragment.java */
/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f490a;

    public c(Fragment fragment) {
        this.f490a = fragment;
    }

    @Override // a.h.a.e
    public View a(int i) {
        View view = this.f490a.H;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // a.h.a.e
    public boolean e() {
        return this.f490a.H != null;
    }
}
