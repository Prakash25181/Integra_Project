package a.e.k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f431a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f432b;

    /* renamed from: c, reason: collision with root package name */
    public final View f433c;
    public boolean d;
    public int[] e;

    public f(View view) {
        this.f433c = view;
    }

    public final boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent a2;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (a2 = a(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f433c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f433c;
        if (a2 instanceof h) {
            ((h) a2).a(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (a2 instanceof g) {
                ((g) a2).a(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                if (Build.VERSION.SDK_INT >= 21) {
                    try {
                        a2.onNestedScroll(view, i, i2, i3, i4);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + a2 + " does not implement interface method onNestedScroll", e);
                    }
                } else if (a2 instanceof i) {
                    ((i) a2).onNestedScroll(view, i, i2, i3, i4);
                }
            }
        }
        if (iArr != null) {
            this.f433c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent a(int i) {
        if (i == 0) {
            return this.f431a;
        }
        if (i != 1) {
            return null;
        }
        return this.f432b;
    }
}
