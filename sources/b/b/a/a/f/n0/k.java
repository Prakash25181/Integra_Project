package b.b.a.a.f.n0;

import android.view.View;
import com.onkyo.jp.onkyoremote.view.settings.SelectorSettingsActivity;

/* compiled from: SelectorSettingsActivity.java */
/* loaded from: classes.dex */
public class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.o.i f1576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SelectorSettingsActivity.b f1577c;

    public k(SelectorSettingsActivity.b bVar, b.b.a.a.b.o.i iVar) {
        this.f1577c = bVar;
        this.f1576b = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        SelectorSettingsActivity.a(SelectorSettingsActivity.this, this.f1576b);
    }
}
