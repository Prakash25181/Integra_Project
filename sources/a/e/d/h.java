package a.e.d;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: NotificationCompatJellybean.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f354a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static Field f355b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f356c;

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle a(Notification notification) {
        synchronized (f354a) {
            if (f356c) {
                return null;
            }
            try {
                if (f355b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f356c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f355b = declaredField;
                }
                Bundle bundle = (Bundle) f355b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f355b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f356c = true;
                return null;
            } catch (NoSuchFieldException e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f356c = true;
                return null;
            }
        }
    }

    public static Bundle a(Notification.Builder builder, e eVar) {
        if (eVar != null) {
            builder.addAction(0, null, null);
            Bundle bundle = new Bundle((Bundle) null);
            bundle.putBoolean("android.support.allowGeneratedReplies", false);
            return bundle;
        }
        throw null;
    }

    public static Bundle a(e eVar) {
        Bundle bundle = new Bundle();
        if (eVar != null) {
            bundle.putInt("icon", 0);
            bundle.putCharSequence("title", null);
            bundle.putParcelable("actionIntent", null);
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", false);
            bundle.putBundle("extras", bundle2);
            bundle.putParcelableArray("remoteInputs", a((i[]) null));
            bundle.putBoolean("showsUserInterface", false);
            bundle.putInt("semanticAction", 0);
            return bundle;
        }
        throw null;
    }

    public static Bundle[] a(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[iVarArr.length];
        if (iVarArr.length <= 0) {
            return bundleArr;
        }
        i iVar = iVarArr[0];
        new Bundle();
        throw null;
    }
}
