package a.e.f;

import a.e.h.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* compiled from: TypefaceCompatApi26Impl.java */
/* loaded from: classes.dex */
public class f extends d {
    public final Class g;
    public final Constructor h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public f() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = a((Class) cls2);
            method4 = b((Class) cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = c((Class) cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder a2 = b.a.a.a.a.a("Unable to collect necessary methods for class ");
            a2.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a2.toString(), e);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method2;
        this.m = method;
    }

    private Object c() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean b() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public final boolean c(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method c(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Typeface b(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void a(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // a.e.f.d, a.e.f.h
    public Typeface a(Context context, a.e.e.b.c cVar, Resources resources, int i) {
        if (!b()) {
            return super.a(context, cVar, resources, i);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        for (a.e.e.b.d dVar : cVar.f362a) {
            if (!a(context, c2, dVar.f363a, dVar.e, dVar.f364b, dVar.f365c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d))) {
                a(c2);
                return null;
            }
        }
        if (c(c2)) {
            return b(c2);
        }
        return null;
    }

    public Method b(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // a.e.f.d, a.e.f.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        Typeface b2;
        boolean z;
        if (fVarArr.length < 1) {
            return null;
        }
        if (!b()) {
            b.f a2 = a(fVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a2.f403a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(a2.f405c).setItalic(a2.d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        } else {
            Map<Uri, ByteBuffer> a3 = a.e.h.b.a(context, fVarArr, cancellationSignal);
            Object c2 = c();
            if (c2 == null) {
                return null;
            }
            boolean z2 = false;
            for (b.f fVar : fVarArr) {
                ByteBuffer byteBuffer = a3.get(fVar.f403a);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.j.invoke(c2, byteBuffer, Integer.valueOf(fVar.f404b), null, Integer.valueOf(fVar.f405c), Integer.valueOf(fVar.d ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        a(c2);
                        return null;
                    }
                    z2 = true;
                }
            }
            if (!z2) {
                a(c2);
                return null;
            }
            if (c(c2) && (b2 = b(c2)) != null) {
                return Typeface.create(b2, i);
            }
            return null;
        }
    }

    @Override // a.e.f.h
    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        if (!b()) {
            return super.a(context, resources, i, str, i2);
        }
        Object c2 = c();
        if (c2 == null) {
            return null;
        }
        if (!a(context, c2, str, 0, -1, -1, null)) {
            a(c2);
            return null;
        }
        if (c(c2)) {
            return b(c2);
        }
        return null;
    }

    public Method a(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }
}
