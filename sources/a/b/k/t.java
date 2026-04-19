package a.b.k;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
public class t {
    public static t d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f48a;

    /* renamed from: b, reason: collision with root package name */
    public final LocationManager f49b;

    /* renamed from: c, reason: collision with root package name */
    public final a f50c = new a();

    /* compiled from: TwilightManager.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f51a;

        /* renamed from: b, reason: collision with root package name */
        public long f52b;
    }

    public t(Context context, LocationManager locationManager) {
        this.f48a = context;
        this.f49b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f49b.isProviderEnabled(str)) {
                return this.f49b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
