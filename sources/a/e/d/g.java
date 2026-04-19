package a.e.d;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Notification.Builder f351a;

    /* renamed from: b, reason: collision with root package name */
    public final f f352b;

    /* renamed from: c, reason: collision with root package name */
    public RemoteViews f353c;
    public RemoteViews d;
    public final List<Bundle> e = new ArrayList();
    public final Bundle f = new Bundle();
    public int g;
    public RemoteViews h;

    public g(f fVar) {
        ArrayList<String> arrayList;
        this.f352b = fVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f351a = new Notification.Builder(fVar.f348a, fVar.H);
        } else {
            this.f351a = new Notification.Builder(fVar.f348a);
        }
        Notification notification = fVar.M;
        this.f351a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.d).setContentText(fVar.e).setContentInfo(fVar.j).setContentIntent(fVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.g, (notification.flags & 128) != 0).setLargeIcon(fVar.i).setNumber(fVar.k).setProgress(fVar.q, fVar.r, fVar.s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f351a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f351a.setSubText(fVar.o).setUsesChronometer(fVar.n).setPriority(fVar.l);
            Iterator<e> it = fVar.f349b.iterator();
            while (it.hasNext()) {
                e next = it.next();
                int i = Build.VERSION.SDK_INT;
                if (i >= 20) {
                    if (next != null) {
                        Notification.Action.Builder builder = new Notification.Action.Builder(0, (CharSequence) null, (PendingIntent) null);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("android.support.allowGeneratedReplies", false);
                        if (Build.VERSION.SDK_INT >= 24) {
                            builder.setAllowGeneratedReplies(false);
                        }
                        bundle.putInt("android.support.action.semanticAction", 0);
                        if (Build.VERSION.SDK_INT >= 28) {
                            builder.setSemanticAction(0);
                        }
                        bundle.putBoolean("android.support.action.showsUserInterface", false);
                        builder.addExtras(bundle);
                        this.f351a.addAction(builder.build());
                    } else {
                        throw null;
                    }
                } else if (i >= 16) {
                    this.e.add(h.a(this.f351a, next));
                }
            }
            Bundle bundle2 = fVar.A;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (fVar.w) {
                    this.f.putBoolean("android.support.localOnly", true);
                }
                String str = fVar.t;
                if (str != null) {
                    this.f.putString("android.support.groupKey", str);
                    if (fVar.u) {
                        this.f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = fVar.v;
                if (str2 != null) {
                    this.f.putString("android.support.sortKey", str2);
                }
            }
            this.f353c = fVar.E;
            this.d = fVar.F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f351a.setShowWhen(fVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = fVar.N) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = fVar.N;
                bundle3.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f351a.setLocalOnly(fVar.w).setGroup(fVar.t).setGroupSummary(fVar.u).setSortKey(fVar.v);
            this.g = fVar.L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f351a.setCategory(fVar.z).setColor(fVar.B).setVisibility(fVar.C).setPublicVersion(fVar.D).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = fVar.N.iterator();
            while (it2.hasNext()) {
                this.f351a.addPerson(it2.next());
            }
            this.h = fVar.G;
            if (fVar.f350c.size() > 0) {
                if (fVar.A == null) {
                    fVar.A = new Bundle();
                }
                Bundle bundle4 = fVar.A.getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int i2 = 0; i2 < fVar.f350c.size(); i2++) {
                    bundle5.putBundle(Integer.toString(i2), h.a(fVar.f350c.get(i2)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                if (fVar.A == null) {
                    fVar.A = new Bundle();
                }
                fVar.A.putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f351a.setExtras(fVar.A).setRemoteInputHistory(fVar.p);
            RemoteViews remoteViews = fVar.E;
            if (remoteViews != null) {
                this.f351a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = fVar.F;
            if (remoteViews2 != null) {
                this.f351a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = fVar.G;
            if (remoteViews3 != null) {
                this.f351a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f351a.setBadgeIconType(fVar.I).setShortcutId(fVar.J).setTimeoutAfter(fVar.K).setGroupAlertBehavior(fVar.L);
            if (fVar.y) {
                this.f351a.setColorized(fVar.x);
            }
            if (TextUtils.isEmpty(fVar.H)) {
                return;
            }
            this.f351a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    public final void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i = notification.defaults & (-2);
        notification.defaults = i;
        notification.defaults = i & (-3);
    }
}
