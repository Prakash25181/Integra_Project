package b.b.a.a.f;

import android.content.DialogInterface;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class t implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f1632b;

    public t(s sVar) {
        this.f1632b = sVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f1632b.p = null;
    }
}
