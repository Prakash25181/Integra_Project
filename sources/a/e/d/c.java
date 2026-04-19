package a.e.d;

import android.util.Log;

/* compiled from: ActivityRecreator.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f345b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f346c;

    public c(Object obj, Object obj2) {
        this.f345b = obj;
        this.f346c = obj2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (b.d != null) {
                b.d.invoke(this.f345b, this.f346c, false, "AppCompat recreation");
            } else {
                b.e.invoke(this.f345b, this.f346c, false);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
