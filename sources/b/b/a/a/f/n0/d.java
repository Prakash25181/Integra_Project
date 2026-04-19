package b.b.a.a.f.n0;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.settings.AppSettingsActivity;

/* compiled from: AppSettingsActivity.java */
/* loaded from: classes.dex */
public class d implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppSettingsActivity f1561b;

    public d(AppSettingsActivity appSettingsActivity) {
        this.f1561b = appSettingsActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        AppSettingsActivity appSettingsActivity = this.f1561b;
        appSettingsActivity.s = null;
        b.b.a.a.b.p.d b2 = ((RemoteApplication) appSettingsActivity.getApplication()).b();
        if (b2 == null) {
            throw null;
        }
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        SharedPreferences.Editor edit = a2.f1118a.getSharedPreferences("onkyo_remote_settings", 0).edit();
        edit.clear();
        edit.commit();
        for (String str : a2.f1118a.fileList()) {
            a2.f1118a.deleteFile(str);
        }
        b2.f();
    }
}
