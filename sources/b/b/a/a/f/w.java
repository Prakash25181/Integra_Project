package b.b.a.a.f;

import android.content.DialogInterface;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class w implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1636b;

    public w(s sVar) {
        this.f1636b = sVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f1636b.p = null;
    }
}
