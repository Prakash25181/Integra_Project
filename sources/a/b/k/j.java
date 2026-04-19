package a.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate.java */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: b, reason: collision with root package name */
    public static final a.d.c<WeakReference<j>> f15b = new a.d.c<>();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16c = new Object();

    public static j a(Activity activity, i iVar) {
        return new k(activity, null, iVar, activity);
    }

    public static void b(j jVar) {
        synchronized (f16c) {
            c(jVar);
        }
    }

    public static void c(j jVar) {
        synchronized (f16c) {
            Iterator<WeakReference<j>> it = f15b.iterator();
            while (it.hasNext()) {
                j jVar2 = it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i);

    public abstract void b();

    public abstract void b(int i);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public static j a(Dialog dialog, i iVar) {
        return new k(dialog.getContext(), dialog.getWindow(), iVar, dialog);
    }

    public static void a(j jVar) {
        synchronized (f16c) {
            c(jVar);
            f15b.add(new WeakReference<>(jVar));
        }
    }
}
