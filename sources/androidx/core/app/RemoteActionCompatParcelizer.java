package androidx.core.app;

import a.n.a;
import a.n.b;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f696a;
        if (aVar.a(1)) {
            obj = aVar.c();
        }
        remoteActionCompat.f696a = (IconCompat) obj;
        remoteActionCompat.f697b = aVar.a(remoteActionCompat.f697b, 2);
        remoteActionCompat.f698c = aVar.a(remoteActionCompat.f698c, 3);
        remoteActionCompat.d = (PendingIntent) aVar.a((a) remoteActionCompat.d, 4);
        remoteActionCompat.e = aVar.a(remoteActionCompat.e, 5);
        remoteActionCompat.f = aVar.a(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        if (aVar != null) {
            IconCompat iconCompat = remoteActionCompat.f696a;
            aVar.b(1);
            aVar.a(iconCompat);
            CharSequence charSequence = remoteActionCompat.f697b;
            aVar.b(2);
            b bVar = (b) aVar;
            TextUtils.writeToParcel(charSequence, bVar.e, 0);
            CharSequence charSequence2 = remoteActionCompat.f698c;
            aVar.b(3);
            TextUtils.writeToParcel(charSequence2, bVar.e, 0);
            aVar.b(remoteActionCompat.d, 4);
            boolean z = remoteActionCompat.e;
            aVar.b(5);
            bVar.e.writeInt(z ? 1 : 0);
            boolean z2 = remoteActionCompat.f;
            aVar.b(6);
            bVar.e.writeInt(z2 ? 1 : 0);
            return;
        }
        throw null;
    }
}
