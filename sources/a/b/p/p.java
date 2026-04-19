package a.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: AppCompatPopupWindow.java */
/* loaded from: classes.dex */
public class p extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f231b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f232a;

    static {
        f231b = Build.VERSION.SDK_INT < 21;
    }

    public p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.PopupWindow, i, i2);
        if (obtainStyledAttributes.hasValue(a.b.j.PopupWindow_overlapAnchor)) {
            boolean z = obtainStyledAttributes.getBoolean(a.b.j.PopupWindow_overlapAnchor, false);
            if (f231b) {
                this.f232a = z;
            } else {
                a.b.k.r.a(this, z);
            }
        }
        int i3 = a.b.j.PopupWindow_android_popupBackground;
        if (obtainStyledAttributes.hasValue(i3) && (resourceId = obtainStyledAttributes.getResourceId(i3, 0)) != 0) {
            drawable = a.b.l.a.a.c(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i3);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f231b && this.f232a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f231b && this.f232a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f231b && this.f232a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
