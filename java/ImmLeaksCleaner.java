package androidx.activity;

import a.j.e;
import a.j.f;
import a.j.h;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements f {

    /* renamed from: b, reason: collision with root package name */
    public static int f623b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f624c;
    public static Field d;
    public static Field e;

    /* renamed from: a, reason: collision with root package name */
    public Activity f625a;

    public ImmLeaksCleaner(Activity activity) {
        this.f625a = activity;
    }

    @Override // a.j.f
    public void a(h hVar, e.a aVar) {
        if (aVar != e.a.ON_DESTROY) {
            return;
        }
        if (f623b == 0) {
            try {
                f623b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f624c = declaredField3;
                declaredField3.setAccessible(true);
                f623b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f623b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f625a.getSystemService("input_method");
            try {
                Object obj = f624c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
