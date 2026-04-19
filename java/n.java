package b.b.a.a.f;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public class n implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1557b;

    public n(MainActivity mainActivity) {
        this.f1557b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        MainActivity mainActivity = this.f1557b;
        mainActivity.i0 = null;
        MainActivity.b(mainActivity, false);
    }
}
