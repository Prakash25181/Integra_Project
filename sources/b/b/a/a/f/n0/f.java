package b.b.a.a.f.n0;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;

/* compiled from: CellReorderManager.java */
/* loaded from: classes.dex */
public class f<T> {

    /* renamed from: a, reason: collision with root package name */
    public Activity f1564a;

    /* renamed from: b, reason: collision with root package name */
    public ListView f1565b;

    /* renamed from: c, reason: collision with root package name */
    public DisplayMetrics f1566c;
    public ImageView d;
    public FrameLayout e;
    public boolean f;
    public int g;
    public int h;
    public a i;

    /* compiled from: CellReorderManager.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i, int i2);
    }

    public f(Activity activity, ListView listView, a aVar) {
        this.f1564a = activity;
        this.f1565b = listView;
        this.i = aVar;
        this.f1566c = activity.getResources().getDisplayMetrics();
    }

    public final void a(View view, MotionEvent motionEvent) {
        int[] a2 = a(this.e, view, (int) motionEvent.getX(), (int) motionEvent.getY());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams.leftMargin = this.g;
        layoutParams.topMargin = a2[1] + this.h;
        this.d.setLayoutParams(layoutParams);
    }

    public final int[] a(View view, View view2, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        view2.getLocationInWindow(r0);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        iArr2[0] = iArr2[0] + i;
        iArr2[1] = iArr2[1] + i2;
        return iArr2;
    }
}
