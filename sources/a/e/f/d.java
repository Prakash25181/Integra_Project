package a.e.f;

import a.b.k.r;
import a.e.h.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: TypefaceCompatApi21Impl.java */
/* loaded from: classes.dex */
public class d extends h {

    /* renamed from: b, reason: collision with root package name */
    public static Class f379b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f380c = null;
    public static Method d = null;
    public static Method e = null;
    public static boolean f = false;

    public static void a() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f) {
            return;
        }
        f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f380c = constructor;
        f379b = cls;
        d = method2;
        e = method;
    }

    @Override // a.e.f.h
    public Typeface a(Context context, a.e.e.b.c cVar, Resources resources, int i) {
        a();
        try {
            Object newInstance = f380c.newInstance(new Object[0]);
            for (a.e.e.b.d dVar : cVar.f362a) {
                File a2 = r.a(context);
                if (a2 == null) {
                    return null;
                }
                try {
                    if (!r.a(a2, resources, dVar.f)) {
                        return null;
                    }
                    if (!a(newInstance, a2.getPath(), dVar.f364b, dVar.f365c)) {
                        return null;
                    }
                    a2.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    a2.delete();
                }
            }
            a();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f379b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static boolean a(Object obj, String str, int i, boolean z) {
        a();
        try {
            return ((Boolean) d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // a.e.f.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        File file;
        String readlink;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(a(fVarArr, i).f403a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    Typeface a2 = super.a(context, new FileInputStream(openFileDescriptor.getFileDescriptor()));
                    openFileDescriptor.close();
                    return a2;
                }
                Typeface a22 = super.a(context, new FileInputStream(openFileDescriptor.getFileDescriptor()));
                openFileDescriptor.close();
                return a22;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
