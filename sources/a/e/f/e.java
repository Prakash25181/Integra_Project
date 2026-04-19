package a.e.f;

import a.b.k.r;
import a.e.h.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl.java */
/* loaded from: classes.dex */
public class e extends h {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f381b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f382c;
    public static final Method d;
    public static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f382c = constructor;
        f381b = cls;
        d = method2;
        e = method;
    }

    @Override // a.e.f.h
    public Typeface a(Context context, a.e.e.b.c cVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f382c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (a.e.e.b.d dVar : cVar.f362a) {
            int i2 = dVar.f;
            File a2 = r.a(context);
            if (a2 != null) {
                try {
                    if (r.a(a2, resources, i2)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(a2);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                    break;
                                } catch (Throwable th2) {
                                    try {
                                        fileInputStream.close();
                                    } catch (Throwable unused2) {
                                    }
                                    throw th2;
                                    break;
                                }
                            }
                        } catch (IOException unused3) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !a(obj, mappedByteBuffer, dVar.e, dVar.f364b, dVar.f365c)) {
                            return null;
                        }
                    }
                } finally {
                    a2.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return a(obj);
    }

    @Override // a.e.f.h
    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        Object obj;
        try {
            obj = f382c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        a.d.h hVar = new a.d.h();
        for (b.f fVar : fVarArr) {
            Uri uri = fVar.f403a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = r.a(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !a(obj, byteBuffer, fVar.f404b, fVar.f405c, fVar.d)) {
                return null;
            }
        }
        Typeface a2 = a(obj);
        if (a2 == null) {
            return null;
        }
        return Typeface.create(a2, i);
    }

    public static boolean a(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f381b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
