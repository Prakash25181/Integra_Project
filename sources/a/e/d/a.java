package a.e.d;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ActivityCompat.java */
/* loaded from: classes.dex */
public class a extends a.e.e.a {

    /* compiled from: ActivityCompat.java */
    /* renamed from: a.e.d.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0012a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String[] f333b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Activity f334c;
        public final /* synthetic */ int d;

        public RunnableC0012a(String[] strArr, Activity activity, int i) {
            this.f333b = strArr;
            this.f334c = activity;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f333b.length];
            PackageManager packageManager = this.f334c.getPackageManager();
            String packageName = this.f334c.getPackageName();
            int length = this.f333b.length;
            for (int i = 0; i < length; i++) {
                iArr[i] = packageManager.checkPermission(this.f333b[i], packageName);
            }
            ((b) this.f334c).onRequestPermissionsResult(this.d, this.f333b, iArr);
        }
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface b {
        void onRequestPermissionsResult(int i, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: ActivityCompat.java */
    /* loaded from: classes.dex */
    public interface d {
        void a(int i);
    }

    public static c a() {
        return null;
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            if (a.e.d.b.a(activity)) {
                return;
            }
            activity.recreate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Activity activity, String[] strArr, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).a(i);
            }
            activity.requestPermissions(strArr, i);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0012a(strArr, activity, i));
        }
    }
}
