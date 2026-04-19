package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class j implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1387b;

    public j(ConnectionActivity connectionActivity) {
        this.f1387b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ConnectionActivity connectionActivity = this.f1387b;
        connectionActivity.D = null;
        connectionActivity.k();
        this.f1387b.r.c();
    }
}
