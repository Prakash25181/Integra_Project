package b.b.a.a.f.k0.v;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: UpnpMediaDirectoryBase.java */
/* loaded from: classes.dex */
public class i implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1351a;

    public i(k kVar) {
        this.f1351a = kVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        k kVar = this.f1351a;
        kVar.k.setFastScrollAlwaysVisible(kVar.l.a());
        k kVar2 = this.f1351a;
        kVar2.k.setFastScrollEnabled(kVar2.l.a());
        this.f1351a.f();
        return true;
    }
}
