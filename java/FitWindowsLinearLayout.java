package androidx.appcompat.widget;

import a.b.k.m;
import a.b.p.g0;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements g0 {

    /* renamed from: b, reason: collision with root package name */
    public g0.a f668b;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        g0.a aVar = this.f668b;
        if (aVar != null) {
            rect.top = ((m) aVar).f34a.f(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // a.b.p.g0
    public void setOnFitSystemWindowsListener(g0.a aVar) {
        this.f668b = aVar;
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
