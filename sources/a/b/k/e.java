package a.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f9b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10c;
    public final /* synthetic */ AlertController d;

    public e(AlertController alertController, View view, View view2) {
        this.d = alertController;
        this.f9b = view;
        this.f10c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.a(this.d.g, this.f9b, this.f10c);
    }
}
