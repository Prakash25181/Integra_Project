package b.b.a.a.f.n0;

import android.content.DialogInterface;
import com.onkyo.jp.onkyoremote.view.settings.AppSettingsActivity;

/* compiled from: AppSettingsActivity.java */
/* loaded from: classes.dex */
public class b implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppSettingsActivity f1559b;

    public b(AppSettingsActivity appSettingsActivity) {
        this.f1559b = appSettingsActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f1559b.s = null;
    }
}
