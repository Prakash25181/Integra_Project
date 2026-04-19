package a.b.k;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* compiled from: AlertController.java */
/* loaded from: classes.dex */
public class d implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f8b;

    public d(AlertController alertController, View view, View view2) {
        this.f7a = view;
        this.f8b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.a(absListView, this.f7a, this.f8b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
