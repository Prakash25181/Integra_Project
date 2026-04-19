package b.b.a.a.f;

import android.content.DialogInterface;
import android.widget.ImageButton;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class u implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.l f1633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageButton f1634c;
    public final /* synthetic */ s d;

    public u(s sVar, b.b.a.a.b.l lVar, ImageButton imageButton) {
        this.d = sVar;
        this.f1633b = lVar;
        this.f1634c = imageButton;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.d.p = null;
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        a2.a(a2.a(this.d.o.f852c.f799a.g).f1126b, false);
        this.d.a(this.f1633b, this.f1634c, false);
    }
}
