package com.onkyo.jp.onkyoremote.app;

import a.b.k.r;
import a.e.d.f;
import a.e.d.g;
import a.e.d.h;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import android.widget.RemoteViews;
import b.b.a.a.b.p.d;
import b.b.a.a.b.u.d;
import b.b.a.a.e.e;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplicationService;
import com.onkyo.jp.upnp.UpnpClient;

/* loaded from: classes.dex */
public class RemoteApplicationService extends Service {
    public UpnpClient f;
    public d g;

    /* renamed from: b */
    public b f1674b = new b();

    /* renamed from: c */
    public String f1675c = null;
    public boolean d = false;
    public Handler e = new Handler();
    public boolean h = false;

    /* loaded from: classes.dex */
    public class a implements d.InterfaceC0034d {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Binder {
        public b() {
        }
    }

    public static /* synthetic */ void a(RemoteApplicationService remoteApplicationService) {
        Notification notification;
        if (remoteApplicationService == null) {
            throw null;
        }
        Log.v("Service", "streamSessionStarted");
        remoteApplicationService.d = true;
        f fVar = new f(remoteApplicationService, remoteApplicationService.f1675c);
        CharSequence string = remoteApplicationService.getString(R.string.full_app_name);
        if (string != null && string.length() > 5120) {
            string = string.subSequence(0, 5120);
        }
        fVar.d = string;
        CharSequence string2 = remoteApplicationService.getString(R.string.thisDeviceService);
        if (string2 != null && string2.length() > 5120) {
            string2 = string2.subSequence(0, 5120);
        }
        fVar.e = string2;
        fVar.M.icon = R.drawable.ic_stat_notify;
        g gVar = new g(fVar);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            notification = gVar.f351a.build();
        } else if (i >= 24) {
            notification = gVar.f351a.build();
            if (gVar.g != 0) {
                if (notification.getGroup() != null && (notification.flags & 512) != 0 && gVar.g == 2) {
                    gVar.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && gVar.g == 1) {
                    gVar.a(notification);
                }
            }
        } else if (i >= 21) {
            gVar.f351a.setExtras(gVar.f);
            notification = gVar.f351a.build();
            RemoteViews remoteViews = gVar.f353c;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = gVar.d;
            if (remoteViews2 != null) {
                notification.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = gVar.h;
            if (remoteViews3 != null) {
                notification.headsUpContentView = remoteViews3;
            }
            if (gVar.g != 0) {
                if (notification.getGroup() != null && (notification.flags & 512) != 0 && gVar.g == 2) {
                    gVar.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && gVar.g == 1) {
                    gVar.a(notification);
                }
            }
        } else if (i >= 20) {
            gVar.f351a.setExtras(gVar.f);
            notification = gVar.f351a.build();
            RemoteViews remoteViews4 = gVar.f353c;
            if (remoteViews4 != null) {
                notification.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = gVar.d;
            if (remoteViews5 != null) {
                notification.bigContentView = remoteViews5;
            }
            if (gVar.g != 0) {
                if (notification.getGroup() != null && (notification.flags & 512) != 0 && gVar.g == 2) {
                    gVar.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && gVar.g == 1) {
                    gVar.a(notification);
                }
            }
        } else if (i >= 19) {
            SparseArray<Bundle> a2 = h.a(gVar.e);
            if (a2 != null) {
                gVar.f.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            gVar.f351a.setExtras(gVar.f);
            notification = gVar.f351a.build();
            RemoteViews remoteViews6 = gVar.f353c;
            if (remoteViews6 != null) {
                notification.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = gVar.d;
            if (remoteViews7 != null) {
                notification.bigContentView = remoteViews7;
            }
        } else if (i >= 16) {
            notification = gVar.f351a.build();
            Bundle a3 = r.a(notification);
            Bundle bundle = new Bundle(gVar.f);
            for (String str : gVar.f.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = h.a(gVar.e);
            if (a4 != null) {
                r.a(notification).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = gVar.f353c;
            if (remoteViews8 != null) {
                notification.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = gVar.d;
            if (remoteViews9 != null) {
                notification.bigContentView = remoteViews9;
            }
        } else {
            notification = gVar.f351a.getNotification();
        }
        RemoteViews remoteViews10 = gVar.f352b.E;
        if (remoteViews10 != null) {
            notification.contentView = remoteViews10;
        }
        remoteApplicationService.startForeground(1, notification);
    }

    public /* synthetic */ void b() {
        if (Build.VERSION.SDK_INT >= 26) {
            Log.v("Service", "streamSessionStopped");
            if (Build.VERSION.SDK_INT >= 24) {
                stopForeground(1);
            } else {
                stopForeground(true);
            }
        }
        if (!((RemoteApplication) getApplication()).a() && !this.d) {
            if (this.h) {
                return;
            }
            Log.v("Service", "No more activity and not in stream session, disconnect iscp and stop self.");
            b.b.a.a.b.p.d dVar = this.g;
            if (dVar != null) {
                dVar.e();
                b.b.a.a.b.p.d dVar2 = this.g;
                if (dVar2 != null) {
                    Log.d("ISCP", "disposing");
                    dVar2.c();
                    dVar2.e = d.j.DISCONNECTED;
                    dVar2.o();
                    e eVar = dVar2.B;
                    if (eVar != null) {
                        eVar.a();
                    }
                    dVar2.g();
                    dVar2.v = null;
                    Log.d("ISCP", "disposed");
                    this.g = null;
                } else {
                    throw null;
                }
            }
            UpnpClient upnpClient = this.f;
            if (upnpClient != null) {
                upnpClient.dispose();
                this.f = null;
            }
            this.h = true;
            stopSelf();
            return;
        }
        Log.v("Service", "Continue service");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.v("Service", "onBind");
        return this.f1674b;
    }

    @Override // android.app.Service
    public void onCreate() {
        Log.v("Service", "onCreate");
        this.h = false;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("dlna_playback_channel", getString(R.string.thisDeviceService), 2);
            notificationChannel.setDescription("DLNA Playback");
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
            this.f1675c = notificationChannel.getId();
        }
        UpnpClient upnpClient = new UpnpClient();
        this.f = upnpClient;
        this.g = new b.b.a.a.b.p.d(upnpClient, new a());
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.v("Service", "onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        Log.v("Service", "onRebind");
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        super.onUnbind(intent);
        Log.v("Service", "onUnbind");
        this.e.post(new Runnable() { // from class: b.b.a.a.b.a
            @Override // java.lang.Runnable
            public final void run() {
                RemoteApplicationService.this.a();
            }
        });
        return true;
    }

    public final void a() {
        if (!((RemoteApplication) getApplication()).a() && !this.d) {
            if (this.h) {
                return;
            }
            Log.v("Service", "No more activity and not in stream session, disconnect iscp and stop self.");
            b.b.a.a.b.p.d dVar = this.g;
            if (dVar != null) {
                dVar.e();
                b.b.a.a.b.p.d dVar2 = this.g;
                if (dVar2 != null) {
                    Log.d("ISCP", "disposing");
                    dVar2.c();
                    dVar2.e = d.j.DISCONNECTED;
                    dVar2.o();
                    e eVar = dVar2.B;
                    if (eVar != null) {
                        eVar.a();
                    }
                    dVar2.g();
                    dVar2.v = null;
                    Log.d("ISCP", "disposed");
                    this.g = null;
                } else {
                    throw null;
                }
            }
            UpnpClient upnpClient = this.f;
            if (upnpClient != null) {
                upnpClient.dispose();
                this.f = null;
            }
            this.h = true;
            stopSelf();
            return;
        }
        Log.v("Service", "Continue service");
    }
}
