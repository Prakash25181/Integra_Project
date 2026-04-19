package a.e.d;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class f {
    public Bundle A;
    public Notification D;
    public RemoteViews E;
    public RemoteViews F;
    public RemoteViews G;
    public String H;
    public String J;
    public long K;
    public Notification M;

    @Deprecated
    public ArrayList<String> N;

    /* renamed from: a, reason: collision with root package name */
    public Context f348a;
    public CharSequence d;
    public CharSequence e;
    public PendingIntent f;
    public PendingIntent g;
    public RemoteViews h;
    public Bitmap i;
    public CharSequence j;
    public int k;
    public int l;
    public boolean n;
    public CharSequence o;
    public CharSequence[] p;
    public int q;
    public int r;
    public boolean s;
    public String t;
    public boolean u;
    public String v;
    public boolean x;
    public boolean y;
    public String z;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<e> f349b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<e> f350c = new ArrayList<>();
    public boolean m = true;
    public boolean w = false;
    public int B = 0;
    public int C = 0;
    public int I = 0;
    public int L = 0;

    public f(Context context, String str) {
        Notification notification = new Notification();
        this.M = notification;
        this.f348a = context;
        this.H = str;
        notification.when = System.currentTimeMillis();
        this.M.audioStreamType = -1;
        this.l = 0;
        this.N = new ArrayList<>();
    }
}
