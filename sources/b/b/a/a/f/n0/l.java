package b.b.a.a.f.n0;

import android.view.View;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.settings.SelectorSettingsActivity;

/* compiled from: SelectorSettingsActivity.java */
/* loaded from: classes.dex */
public class l implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.o.i f1578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1579c;
    public final /* synthetic */ SelectorSettingsActivity.b d;

    public l(SelectorSettingsActivity.b bVar, b.b.a.a.b.o.i iVar, int i) {
        this.d = bVar;
        this.f1578b = iVar;
        this.f1579c = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        r3.a(r3.getString(R.string.stg_inputSelector), r0.d, r0.a(), new i(SelectorSettingsActivity.this, this.f1578b, this.f1579c));
    }
}
