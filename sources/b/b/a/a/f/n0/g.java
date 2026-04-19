package b.b.a.a.f.n0;

import android.widget.CompoundButton;
import com.onkyo.jp.onkyoremote.view.settings.NetworkServiceSettingsActivity;

/* compiled from: NetworkServiceSettingsActivity.java */
/* loaded from: classes.dex */
public class g implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.o.f f1567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NetworkServiceSettingsActivity.b f1568b;

    public g(NetworkServiceSettingsActivity.b bVar, b.b.a.a.b.o.f fVar) {
        this.f1568b = bVar;
        this.f1567a = fVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        b.b.a.a.b.i iVar = NetworkServiceSettingsActivity.this.t;
        iVar.f741a.a((b.b.a.a.e.d<b.b.a.a.b.o.f>) iVar.a(this.f1567a.f808a), z);
    }
}
