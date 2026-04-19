package b.b.a.a.f.n0;

import b.b.a.a.f.n0.m;
import com.onkyo.jp.onkyoremote.view.settings.RootSettingsActivity;

/* compiled from: RootSettingsActivity.java */
/* loaded from: classes.dex */
public class h implements m.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RootSettingsActivity f1570b;

    public h(RootSettingsActivity rootSettingsActivity, int i) {
        this.f1570b = rootSettingsActivity;
        this.f1569a = i;
    }

    @Override // b.b.a.a.f.n0.m.d
    public void a(String str) {
        b.b.a.a.b.p.d dVar = this.f1570b.q;
        if (dVar.f852c != null) {
            dVar.f = str;
            b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
            a2.a(a2.a(dVar.f852c.f799a.g).f1125a, str);
            a2.a(b.b.a.a.d.a.f1116b.f1120b, dVar.h());
        }
        RootSettingsActivity.c cVar = (RootSettingsActivity.c) this.f1570b.r.getAdapter().getItem(this.f1569a);
        cVar.f1749b.setText(RootSettingsActivity.this.q.h());
    }
}
