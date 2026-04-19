package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class h implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1385b;

    public h(ConnectionActivity connectionActivity) {
        this.f1385b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        ConnectionActivity connectionActivity = this.f1385b;
        connectionActivity.D = null;
        connectionActivity.k();
        this.f1385b.r.c();
    }
}
