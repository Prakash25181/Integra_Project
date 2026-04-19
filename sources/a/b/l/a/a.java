package a.b.l.a;

import a.b.k.r;
import a.b.p.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* compiled from: AppCompatResources.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f59a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0002a>> f60b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f61c = new Object();

    /* compiled from: AppCompatResources.java */
    /* renamed from: a.b.l.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0002a {

        /* renamed from: a, reason: collision with root package name */
        public final ColorStateList f62a;

        /* renamed from: b, reason: collision with root package name */
        public final Configuration f63b;

        public C0002a(ColorStateList colorStateList, Configuration configuration) {
            this.f62a = colorStateList;
            this.f63b = configuration;
        }
    }

    public static ColorStateList a(Context context, int i) {
        C0002a c0002a;
        synchronized (f61c) {
            SparseArray<C0002a> sparseArray = f60b.get(context);
            if (sparseArray != null && sparseArray.size() > 0 && (c0002a = sparseArray.get(i)) != null) {
                if (c0002a.f63b.equals(context.getResources().getConfiguration())) {
                    return c0002a.f62a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList b(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList a2 = a(context, i);
        if (a2 != null) {
            return a2;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = f59a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f59a.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        boolean z = i2 >= 28 && i2 <= 31;
        ColorStateList colorStateList = null;
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = r.a(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList != null) {
            a(context, i, colorStateList);
            return colorStateList;
        }
        return a.e.e.a.a(context, i);
    }

    public static Drawable c(Context context, int i) {
        return n0.a().b(context, i);
    }

    public static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f61c) {
            SparseArray<C0002a> sparseArray = f60b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                f60b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0002a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
