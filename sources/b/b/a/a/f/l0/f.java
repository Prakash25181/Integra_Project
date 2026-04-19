package b.b.a.a.f.l0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: ConnectionActivity.java */
/* loaded from: classes.dex */
public class f implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionActivity f1383b;

    public f(ConnectionActivity connectionActivity) {
        this.f1383b = connectionActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1383b.D = null;
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        a2.a(a2.a(this.f1383b.r.f852c.f799a.g).d, false);
        this.f1383b.r.c();
        ConnectionActivity.b(this.f1383b);
    }
}
