package a.e.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;

/* compiled from: TypefaceCompat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final h f377a;

    /* renamed from: b, reason: collision with root package name */
    public static final a.d.f<String, Typeface> f378b;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            f377a = new g();
        } else if (i >= 26) {
            f377a = new f();
        } else {
            if (i >= 24) {
                if (e.d == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (e.d != null) {
                    f377a = new e();
                }
            }
            if (Build.VERSION.SDK_INT >= 21) {
                f377a = new d();
            } else {
                f377a = new h();
            }
        }
        f378b = new a.d.f<>(16);
    }

    public static String a(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface a(Context context, a.e.e.b.b bVar, Resources resources, int i, int i2, a.e.e.b.g gVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof a.e.e.b.e) {
            a.e.e.b.e eVar = (a.e.e.b.e) bVar;
            boolean z2 = false;
            if (!z ? gVar == null : eVar.f368c == 0) {
                z2 = true;
            }
            a2 = a.e.h.b.a(context, eVar.f366a, gVar, handler, z2, z ? eVar.f367b : -1, i2);
        } else {
            a2 = f377a.a(context, (a.e.e.b.c) bVar, resources, i2);
            if (gVar != null) {
                if (a2 != null) {
                    gVar.a(a2, handler);
                } else {
                    gVar.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            f378b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a2 = f377a.a(context, resources, i, str, i2);
        if (a2 != null) {
            f378b.a(a(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        if (context != null) {
            if (Build.VERSION.SDK_INT < 21) {
                h hVar = f377a;
                if (hVar != null) {
                    long a2 = h.a(typeface);
                    a.e.e.b.c cVar = a2 == 0 ? null : hVar.f383a.get(Long.valueOf(a2));
                    Typeface a3 = cVar != null ? f377a.a(context, cVar, context.getResources(), i) : null;
                    if (a3 != null) {
                        return a3;
                    }
                } else {
                    throw null;
                }
            }
            return Typeface.create(typeface, i);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
}
