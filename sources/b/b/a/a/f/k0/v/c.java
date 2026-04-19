package b.b.a.a.f.k0.v;

import android.view.View;
import b.b.a.a.f.c;
import b.b.a.a.f.i0;
import com.onkyo.jp.onkyoremote.view.controlpage.upnp.UpnpAlbumCell;

/* compiled from: UpnpAlbumCell.java */
/* loaded from: classes.dex */
public class c implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UpnpAlbumCell.d f1345a;

    public c(UpnpAlbumCell.d dVar) {
        this.f1345a = dVar;
    }

    @Override // b.b.a.a.f.i0
    public void a() {
        UpnpAlbumCell.d dVar = this.f1345a;
        dVar.setTranslationY((-dVar.getHeight()) / 2);
        dVar.setScaleY(0.0f);
        b.b.a.a.f.c.b((View) dVar, 1.0f, (c.g) null);
        b.b.a.a.f.c.c(dVar, 0, null);
    }
}
