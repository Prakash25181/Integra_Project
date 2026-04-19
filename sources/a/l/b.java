package a.l;

import a.j.d;
import a.j.e;
import a.j.h;
import a.j.i;
import a.l.a;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import java.util.Map;

/* compiled from: SavedStateRegistryController.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f585a;

    /* renamed from: b, reason: collision with root package name */
    public final a f586b = new a();

    public b(c cVar) {
        this.f585a = cVar;
    }

    public void a(Bundle bundle) {
        e a2 = this.f585a.a();
        if (((i) a2).f569b == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f585a));
            final a aVar = this.f586b;
            if (!aVar.f584c) {
                if (bundle != null) {
                    aVar.f583b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new d() { // from class: androidx.savedstate.SavedStateRegistry$1
                    @Override // a.j.f
                    public void a(h hVar, e.a aVar2) {
                        if (aVar2 == e.a.ON_START) {
                            a.this.d = true;
                        } else if (aVar2 == e.a.ON_STOP) {
                            a.this.d = false;
                        }
                    }
                });
                aVar.f584c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f586b;
        if (aVar == null) {
            throw null;
        }
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f583b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        a.c.a.b.b<String, a.b>.d a2 = aVar.f582a.a();
        while (a2.hasNext()) {
            Map.Entry entry = (Map.Entry) a2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
