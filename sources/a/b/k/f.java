package a.b.k;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class f implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f11b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f12c;

    public f(AlertController.b bVar, AlertController alertController) {
        this.f12c = bVar;
        this.f11b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f12c.m.onClick(this.f11b.f634b, i);
        if (this.f12c.o) {
            return;
        }
        this.f11b.f634b.dismiss();
    }
}
