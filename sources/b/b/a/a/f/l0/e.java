package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class e implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1382b;

    public e(ConnectionActivity connectionActivity) {
        this.f1382b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        ConnectionActivity connectionActivity = this.f1382b;
        connectionActivity.C = null;
        connectionActivity.n();
    }
}
