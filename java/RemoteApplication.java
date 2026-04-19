package com.onkyo.jp.onkyoremote.app;

import a.b.k.r;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import b.b.a.a.b.f;
import b.b.a.a.b.g;
import b.b.a.a.b.p.i;
import b.b.a.a.d.a;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.StartupMainActivity;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;
import com.onkyo.jp.upnp.UpnpClient;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class RemoteApplication extends Application {

    /* renamed from: b, reason: collision with root package name */
    public Timer f1662b;
    public e e;
    public Handler f;

    /* renamed from: c, reason: collision with root package name */
    public AtomicInteger f1663c = new AtomicInteger(0);
    public AtomicInteger d = new AtomicInteger(0);
    public Application.ActivityLifecycleCallbacks g = new a();

    /* loaded from: classes.dex */
    public class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: com.onkyo.jp.onkyoremote.app.RemoteApplication$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0060a implements Runnable {
            public RunnableC0060a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                UpnpClient c2;
                if (RemoteApplication.this.f1663c.get() == 0 && RemoteApplication.this.e.a() && (c2 = RemoteApplication.this.c()) != null) {
                    c2.stopDiscovery();
                }
            }
        }

        /* loaded from: classes.dex */
        public class b extends TimerTask {

            /* renamed from: com.onkyo.jp.onkyoremote.app.RemoteApplication$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0061a implements Runnable {
                public RunnableC0061a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RemoteApplication.this.e.a()) {
                        e eVar = RemoteApplication.this.e;
                        if (eVar.f1672b) {
                            Log.v("<RemoteApplication>", "unbindService");
                            RemoteApplication.this.unbindService(eVar);
                            eVar.f1672b = false;
                        }
                    }
                }
            }

            public b() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (RemoteApplication.this.e.a()) {
                    RemoteApplication.this.f.post(new RunnableC0061a());
                }
                RemoteApplication.this.f1662b.cancel();
                RemoteApplication.this.f1662b = null;
            }
        }

        public a() {
        }

        public /* synthetic */ void a() {
            b.b.a.a.b.p.d dVar;
            if (RemoteApplication.this.e.a()) {
                RemoteApplicationService remoteApplicationService = RemoteApplication.this.e.f1671a;
                if (remoteApplicationService != null) {
                    Log.v("Service", "noMoreActivity");
                    if (!remoteApplicationService.d && (dVar = remoteApplicationService.g) != null) {
                        dVar.e();
                    }
                }
                e eVar = RemoteApplication.this.e;
                if (eVar.f1672b) {
                    Log.v("<RemoteApplication>", "unbindService");
                    RemoteApplication.this.unbindService(eVar);
                    eVar.f1672b = false;
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Log.d("<RemoteApplication>", "onActivityCreated(" + activity + ", " + bundle + ")");
            RemoteApplication.this.d.incrementAndGet();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Log.d("<RemoteApplication>", "onActivityDestroyed(" + activity + ")");
            if (RemoteApplication.this.d.decrementAndGet() == 0) {
                Log.d("<RemoteApplication>", "No more activity");
                Timer timer = RemoteApplication.this.f1662b;
                if (timer != null) {
                    timer.cancel();
                    RemoteApplication.this.f1662b = null;
                }
                if (RemoteApplication.this.e.a()) {
                    RemoteApplication.this.f.post(new Runnable() { // from class: b.b.a.a.b.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            RemoteApplication.a.this.a();
                        }
                    });
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Log.d("<RemoteApplication>", "onActivityPaused(" + activity + ")");
            if (RemoteApplication.this.f1663c.decrementAndGet() == 0) {
                RemoteApplication.this.f.postDelayed(new RunnableC0060a(), 500L);
                RemoteApplication.this.f1662b = new Timer();
                RemoteApplication.this.f1662b.schedule(new b(), 30000L, 30000L);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Log.d("<RemoteApplication>", "onActivityResumed(" + activity + ")");
            RemoteApplication.this.f1663c.incrementAndGet();
            Timer timer = RemoteApplication.this.f1662b;
            if (timer != null) {
                timer.cancel();
                RemoteApplication.this.f1662b = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Log.d("<RemoteApplication>", "onActivitySaveInstanceState(" + activity + ", " + bundle + ")");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Log.d("<RemoteApplication>", "onActivityStarted(" + activity + ")");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Log.d("<RemoteApplication>", "onActivityStopped(" + activity + ")");
        }
    }

    /* loaded from: classes.dex */
    public class b implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        public Context f1668a;

        /* renamed from: b, reason: collision with root package name */
        public Thread.UncaughtExceptionHandler f1669b = Thread.getDefaultUncaughtExceptionHandler();

        public /* synthetic */ b(Context context, a aVar) {
            this.f1668a = context;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            try {
                PackageManager packageManager = this.f1668a.getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(RemoteApplication.this.getPackageName(), 128);
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                File externalFilesDir = RemoteApplication.this.getExternalFilesDir(null);
                if (externalFilesDir != null) {
                    externalFilesDir.mkdirs();
                    PrintWriter printWriter = new PrintWriter(new FileOutputStream(new File(externalFilesDir, ((Object) applicationLabel) + "-crash.log"), true));
                    printWriter.append((CharSequence) String.format("%s  %d/%d %2d:%02d:%02d\r", packageInfo.versionName, Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
                    th.printStackTrace(printWriter);
                    printWriter.append("\r");
                    printWriter.flush();
                    printWriter.close();
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e2) {
                e2.printStackTrace();
            }
            this.f1669b.uncaughtException(thread, th);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(boolean z);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(boolean z);
    }

    public void a(final c cVar) {
        final e eVar = this.e;
        if (eVar.f1671a == null && eVar.f1672b) {
            Log.v("<RemoteApplication>", "Service was disconnected, call unbindService");
            RemoteApplication.this.unbindService(eVar);
            eVar.f1672b = false;
        }
        if (!eVar.f1672b) {
            Log.v("<RemoteApplication>", "bindService");
            eVar.b(0, new d() { // from class: b.b.a.a.b.d
                @Override // com.onkyo.jp.onkyoremote.app.RemoteApplication.d
                public final void a(boolean z) {
                    RemoteApplication.e.this.a(cVar, z);
                }
            });
        } else if (cVar != null) {
            cVar.a(true);
        }
    }

    public b.b.a.a.b.p.d b() {
        RemoteApplicationService remoteApplicationService = this.e.f1671a;
        if (remoteApplicationService != null) {
            return remoteApplicationService.g;
        }
        return null;
    }

    public UpnpClient c() {
        RemoteApplicationService remoteApplicationService = this.e.f1671a;
        if (remoteApplicationService != null) {
            return remoteApplicationService.f;
        }
        return null;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Log.d("<RemoteApplication>", "onCreate()");
        Thread.setDefaultUncaughtExceptionHandler(new b(getApplicationContext(), null));
        r.u = this;
        String d2 = r.d(R.string.appModel);
        if (f.f == null) {
            f fVar = f.g.get(d2);
            f.f = fVar;
            if (fVar == null) {
                throw new RuntimeException("unknown model");
            }
        }
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        a2.f1118a = this;
        b.b.a.a.d.a.f1116b = new a.b(a2, this, null);
        b.b.a.a.d.a.f1117c = new HashMap<>();
        g a3 = g.a();
        if (a3 == null) {
            throw null;
        }
        AssetManager assets = getResources().getAssets();
        a3.f737a = assets;
        char c2 = 1;
        try {
            String[] list = assets.list("devicelist");
            int length = list.length;
            int i = 0;
            while (i < length) {
                String str = list[i];
                Object[] objArr = new Object[2];
                objArr[0] = "devicelist";
                objArr[c2] = str;
                String format = String.format("%s/%s", objArr);
                for (String str2 : a3.f737a.list(format)) {
                    a3.f738b.put(str2, String.format("%s/%s", format, str2));
                }
                i++;
                c2 = 1;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String d3 = r.d(R.string.unitCode);
        if (d3 != null && d3.length() == 1) {
            i.p = d3.charAt(0);
        }
        registerActivityLifecycleCallbacks(this.g);
        if (b.b.a.a.c.d.e == null) {
            b.b.a.a.c.d.e = new b.b.a.a.c.d(this);
        }
        this.f = new Handler();
        this.e = new e();
    }

    @Override // android.app.Application
    public void onTerminate() {
        Log.d("<RemoteApplication>", "onTerminate()");
        super.onTerminate();
    }

    /* loaded from: classes.dex */
    public class e implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public RemoteApplicationService f1671a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1672b;

        /* renamed from: c, reason: collision with root package name */
        public c f1673c;

        public e() {
        }

        public /* synthetic */ void a(c cVar, boolean z) {
            if (z) {
                boolean bindService = RemoteApplication.this.bindService(new Intent(RemoteApplication.this, (Class<?>) RemoteApplicationService.class), this, 0);
                this.f1672b = bindService;
                if (bindService) {
                    this.f1673c = cVar;
                    return;
                }
                Log.e("<RemoteApplication>", "bindService failed");
                if (cVar != null) {
                    cVar.a(false);
                    return;
                }
                return;
            }
            Log.e("<RemoteApplication>", "startService failed");
            if (cVar != null) {
                cVar.a(false);
            }
        }

        public final void b(final int i, final d dVar) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
            boolean z = false;
            if (i >= 10) {
                dVar.a(false);
                return;
            }
            ActivityManager activityManager = (ActivityManager) RemoteApplication.this.getSystemService("activity");
            if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && runningAppProcesses.size() > 0 && runningAppProcesses.get(0).importance <= 100) {
                z = true;
            }
            if (!z) {
                new Handler().postDelayed(new Runnable() { // from class: b.b.a.a.b.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        RemoteApplication.e.this.a(i, dVar);
                    }
                }, 100L);
            } else {
                RemoteApplication.this.startService(new Intent(RemoteApplication.this, (Class<?>) RemoteApplicationService.class));
                dVar.a(true);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.v("<RemoteApplication>", "onServiceConnected");
            this.f1671a = RemoteApplicationService.this;
            c cVar = this.f1673c;
            if (cVar != null) {
                cVar.a(true);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.v("<RemoteApplication>", "onServiceDisconnected");
            this.f1671a = null;
        }

        public /* synthetic */ void a(int i, d dVar) {
            b(i + 1, dVar);
        }

        public boolean a() {
            return this.f1671a != null;
        }
    }

    public static void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) StartupMainActivity.class);
        intent.setFlags(67108864);
        context.startActivity(intent);
    }

    public static void a(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) ConnectionActivity.class);
        intent.setFlags(67108864);
        intent.putExtra("autoConnect", !z);
        context.startActivity(intent);
    }

    public boolean a() {
        return this.f1663c.get() > 0;
    }
}
