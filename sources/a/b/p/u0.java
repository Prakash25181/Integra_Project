package a.b.p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper.java */
/* loaded from: classes.dex */
public class u0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f253c = new Object();
    public static ArrayList<WeakReference<u0>> d;

    /* renamed from: a, reason: collision with root package name */
    public final Resources f254a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f255b;

    public u0(Context context) {
        super(context);
        c1.a();
        this.f254a = new w0(this, context.getResources());
        this.f255b = null;
    }

    public static Context a(Context context) {
        boolean z = false;
        if (!(context instanceof u0) && !(context.getResources() instanceof w0) && !(context.getResources() instanceof c1)) {
            if (Build.VERSION.SDK_INT >= 21) {
                c1.a();
            } else {
                z = true;
            }
        }
        if (!z) {
            return context;
        }
        synchronized (f253c) {
            if (d == null) {
                d = new ArrayList<>();
            } else {
                for (int size = d.size() - 1; size >= 0; size--) {
                    WeakReference<u0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<u0> weakReference2 = d.get(size2);
                    u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            d.add(new WeakReference<>(u0Var2));
            return u0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f254a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f254a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f255b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f255b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
