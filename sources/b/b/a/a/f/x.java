package b.b.a.a.f;

import android.content.DialogInterface;
import android.widget.ImageButton;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class x implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.l f1637b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageButton f1638c;
    public final /* synthetic */ s d;

    public x(s sVar, b.b.a.a.b.l lVar, ImageButton imageButton) {
        this.d = sVar;
        this.f1637b = lVar;
        this.f1638c = imageButton;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.d.p = null;
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        a2.a(a2.a(this.d.o.f852c.f799a.g).f1126b, false);
        this.d.a(this.f1637b, this.f1638c, false);
    }
}
