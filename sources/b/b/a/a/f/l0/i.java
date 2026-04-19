package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class i implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1386b;

    public i(ConnectionActivity connectionActivity) {
        this.f1386b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ConnectionActivity connectionActivity = this.f1386b;
        connectionActivity.D = null;
        connectionActivity.r.c();
        ConnectionActivity.b(this.f1386b);
    }
}
