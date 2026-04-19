package androidx.savedstate;

import a.j.d;
import a.j.e;
import a.j.h;
import a.j.i;
import a.l.a;
import a.l.c;
import android.annotation.SuppressLint;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements d {

    /* renamed from: a, reason: collision with root package name */
    public final c f724a;

    public Recreator(c cVar) {
        this.f724a = cVar;
    }

    @Override // a.j.f
    public void a(h hVar, e.a aVar) {
        if (aVar == e.a.ON_CREATE) {
            ((i) hVar.a()).f568a.remove(this);
            a c2 = this.f724a.c();
            if (c2.f584c) {
                Bundle bundle = c2.f583b;
                Bundle bundle2 = null;
                if (bundle != null) {
                    Bundle bundle3 = bundle.getBundle("androidx.savedstate.Restarter");
                    c2.f583b.remove("androidx.savedstate.Restarter");
                    if (c2.f583b.isEmpty()) {
                        c2.f583b = null;
                    }
                    bundle2 = bundle3;
                }
                if (bundle2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0024a.class);
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.InterfaceC0024a) declaredConstructor.newInstance(new Object[0])).a(this.f724a);
                                } catch (Exception e) {
                                    throw new RuntimeException(b.a.a.a.a.a("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder a2 = b.a.a.a.a.a("Class");
                                a2.append(asSubclass.getSimpleName());
                                a2.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(a2.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException("Class " + next + " wasn't found", e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
