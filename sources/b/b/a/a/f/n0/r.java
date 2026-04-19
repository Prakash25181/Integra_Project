package b.b.a.a.f.n0;

import android.view.View;
import android.widget.ListView;
import b.b.a.a.f.n0.m;
import com.onkyo.jp.onkyoremote.view.settings.ZoneNameSettingsActivity;

/* compiled from: ZoneNameSettingsActivity.java */
/* loaded from: classes.dex */
public class r implements m.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.l f1589a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZoneNameSettingsActivity f1591c;

    public r(ZoneNameSettingsActivity zoneNameSettingsActivity, b.b.a.a.b.l lVar, int i) {
        this.f1591c = zoneNameSettingsActivity;
        this.f1589a = lVar;
        this.f1590b = i;
    }

    @Override // b.b.a.a.f.n0.m.d
    public void a(String str) {
        this.f1589a.f755b.a(str);
        ListView listView = this.f1591c.s;
        View childAt = listView.getChildAt(this.f1590b - listView.getFirstVisiblePosition());
        if (childAt != null) {
            this.f1591c.s.getAdapter().getView(this.f1590b, childAt, this.f1591c.s);
        }
    }
}
