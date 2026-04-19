package b.b.a.a.f.m0;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: ToolbarPopup.java */
/* loaded from: classes.dex */
public abstract class g1 extends z0 {
    public g1(Context context) {
        super(context);
    }

    @Override // b.b.a.a.f.m0.z0
    public void a(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = 81;
    }

    @Override // b.b.a.a.f.m0.z0
    public void g() {
        View view = this.f;
        View view2 = this.g;
        Point point = new Point();
        int[] a2 = a(view, this.e);
        int[] a3 = a(view2, this.e);
        int height = a3[1] - this.e.getHeight();
        view.setTranslationY(height);
        point.x = ((view2.getWidth() / 2) + a3[0]) - a2[0];
        point.y = (a3[1] - a2[1]) - height;
        a(point);
    }

    public final int[] a(View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(r1);
        view2.getLocationInWindow(iArr);
        int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
        return iArr2;
    }
}
