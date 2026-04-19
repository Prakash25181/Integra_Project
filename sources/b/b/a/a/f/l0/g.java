package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class g implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1384b;

    public g(ConnectionActivity connectionActivity) {
        this.f1384b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1384b.D = null;
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        a2.a(a2.a(this.f1384b.r.f852c.f799a.g).d, false);
        ConnectionActivity.a(this.f1384b);
    }
}
