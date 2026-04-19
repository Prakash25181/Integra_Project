package a.e.f;

import a.b.k.r;
import a.e.h.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<Long, a.e.e.b.c> f383a = new ConcurrentHashMap<>();

    public b.f a(b.f[] fVarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        b.f fVar = null;
        int i3 = Integer.MAX_VALUE;
        for (b.f fVar2 : fVarArr) {
            int abs = (Math.abs(fVar2.f405c - i2) * 2) + (fVar2.d == z ? 0 : 1);
            if (fVar == null || i3 > abs) {
                fVar = fVar2;
                i3 = abs;
            }
        }
        return fVar;
    }

    public static long a(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public Typeface a(Context context, InputStream inputStream) {
        File a2 = r.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (r.a(a2, inputStream)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(a(fVarArr, i).f403a);
            try {
                Typeface a2 = a(context, inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return a2;
            } catch (IOException unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public Typeface a(Context context, a.e.e.b.c cVar, Resources resources, int i) {
        a.e.e.b.d[] dVarArr = cVar.f362a;
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        int i3 = Integer.MAX_VALUE;
        a.e.e.b.d dVar = null;
        for (a.e.e.b.d dVar2 : dVarArr) {
            int abs = (Math.abs(dVar2.f364b - i2) * 2) + (dVar2.f365c == z ? 0 : 1);
            if (dVar == null || i3 > abs) {
                dVar = dVar2;
                i3 = abs;
            }
        }
        if (dVar == null) {
            return null;
        }
        Typeface a2 = c.a(context, resources, dVar.f, dVar.f363a, i);
        long a3 = a(a2);
        if (a3 != 0) {
            this.f383a.put(Long.valueOf(a3), cVar);
        }
        return a2;
    }

    public Typeface a(Context context, Resources resources, int i, String str, int i2) {
        File a2 = r.a(context);
        if (a2 == null) {
            return null;
        }
        try {
            if (r.a(a2, resources, i)) {
                return Typeface.createFromFile(a2.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            a2.delete();
        }
    }
}
