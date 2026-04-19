package b.b.a.a.f.n0;

import android.view.View;
import android.widget.ListView;
import b.b.a.a.f.n0.m;
import com.onkyo.jp.onkyoremote.view.settings.SelectorSettingsActivity;

/* compiled from: SelectorSettingsActivity.java */
/* loaded from: classes.dex */
public class i implements m.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.o.i f1571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1572b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectorSettingsActivity f1573c;

    public i(SelectorSettingsActivity selectorSettingsActivity, b.b.a.a.b.o.i iVar, int i) {
        this.f1573c = selectorSettingsActivity;
        this.f1571a = iVar;
        this.f1572b = i;
    }

    @Override // b.b.a.a.f.n0.m.d
    public void a(String str) {
        this.f1571a.a(str);
        ListView listView = this.f1573c.s;
        View childAt = listView.getChildAt(this.f1572b - listView.getFirstVisiblePosition());
        if (childAt != null) {
            SelectorSettingsActivity selectorSettingsActivity = this.f1573c;
            selectorSettingsActivity.w.getView(this.f1572b, childAt, selectorSettingsActivity.s);
        }
    }
}
