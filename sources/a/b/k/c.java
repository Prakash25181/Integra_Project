package a.b.k;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f6c;
    public final /* synthetic */ AlertController d;

    public c(AlertController alertController, View view, View view2) {
        this.d = alertController;
        this.f5b = view;
        this.f6c = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.a(this.d.A, this.f5b, this.f6c);
    }
}
