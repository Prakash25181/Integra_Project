package a.e.d;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f335a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f336b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f337c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f338b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f339c;

        public a(c cVar, Object obj) {
            this.f338b = cVar;
            this.f339c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f338b.f342a = this.f339c;
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* renamed from: a.e.d.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0013b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f340b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f341c;

        public RunnableC0013b(Application application, c cVar) {
            this.f340b = application;
            this.f341c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f340b.unregisterActivityLifecycleCallbacks(this.f341c);
        }
    }

    /* compiled from: ActivityRecreator.java */
    /* loaded from: classes.dex */
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f342a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f343b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f344c = false;
        public boolean d = false;
        public boolean e = false;

        public c(Activity activity) {
            this.f343b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f343b == activity) {
                this.f343b = null;
                this.d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.d || this.e || this.f344c) {
                return;
            }
            Object obj = this.f342a;
            boolean z = false;
            try {
                Object obj2 = b.f337c.get(activity);
                if (obj2 == obj) {
                    b.g.postAtFrontOfQueue(new a.e.d.c(b.f336b.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z) {
                this.e = true;
                this.f342a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f343b == activity) {
                this.f344c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            a.e.d.b.g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            a.e.d.b.f335a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            a.e.d.b.f336b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r2 = r0
        L33:
            a.e.d.b.f337c = r2
            java.lang.Class<?> r2 = a.e.d.b.f335a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L40
        L3e:
            r2 = r0
            goto L55
        L40:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r7[r1] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3e
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
        L55:
            a.e.d.b.d = r2
            java.lang.Class<?> r2 = a.e.d.b.f335a
            if (r2 != 0) goto L5d
        L5b:
            r2 = r0
            goto L6e
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5b
            r7[r1] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L5b
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
        L6e:
            a.e.d.b.e = r2
            java.lang.Class<?> r2 = a.e.d.b.f335a
            boolean r4 = a()
            if (r4 == 0) goto Lb3
            if (r2 != 0) goto L7b
            goto Lb3
        L7b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb3
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            r3 = 7
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            r3 = 8
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb3
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lb3
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Lb3
            r0 = r2
        Lb3:
            a.e.d.b.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.d.b.<clinit>():void");
    }

    public static boolean a(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (a() && f == null) {
            return false;
        }
        if (e == null && d == null) {
            return false;
        }
        try {
            Object obj2 = f337c.get(activity);
            if (obj2 == null || (obj = f336b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            c cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            g.post(new a(cVar, obj2));
            try {
                if (a()) {
                    f.invoke(obj, obj2, null, null, 0, false, null, null, false, false);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new RunnableC0013b(application, cVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
