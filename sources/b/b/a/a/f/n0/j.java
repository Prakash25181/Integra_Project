package b.b.a.a.f.n0;

import android.widget.CompoundButton;
import com.onkyo.jp.onkyoremote.view.settings.SelectorSettingsActivity;

/* compiled from: SelectorSettingsActivity.java */
/* loaded from: classes.dex */
public class j implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.o.i f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SelectorSettingsActivity.b f1575b;

    public j(SelectorSettingsActivity.b bVar, b.b.a.a.b.o.i iVar) {
        this.f1575b = bVar;
        this.f1574a = iVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b.b.a.a.b.j jVar = SelectorSettingsActivity.this.u;
        jVar.f747a.a((b.b.a.a.e.d<b.b.a.a.b.o.i>) jVar.a(this.f1574a.f817b), z);
    }
}
