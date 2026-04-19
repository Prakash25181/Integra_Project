package b.b.a.a.f.n0;

import android.view.View;
import com.onkyo.jp.onkyoremote.view.settings.ZoneNameSettingsActivity;

/* compiled from: ZoneNameSettingsActivity.java */
/* loaded from: classes.dex */
public class s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.l f1592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1593c;
    public final /* synthetic */ ZoneNameSettingsActivity.a d;

    public s(ZoneNameSettingsActivity.a aVar, b.b.a.a.b.l lVar, int i) {
        this.d = aVar;
        this.f1592b = lVar;
        this.f1593c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ZoneNameSettingsActivity.a(ZoneNameSettingsActivity.this, this.f1592b, this.f1593c);
    }
}
