package b.b.a.a.f;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public class o implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1594b;

    public o(MainActivity mainActivity) {
        this.f1594b = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        MainActivity mainActivity = this.f1594b;
        mainActivity.i0 = null;
        MainActivity.b(mainActivity, true);
    }
}
