package a.h.a;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public final class r implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f534b;

    public r(ArrayList arrayList) {
        this.f534b = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        v.a((ArrayList<View>) this.f534b, 4);
    }
}
