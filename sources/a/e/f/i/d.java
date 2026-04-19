package a.e.f.i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
/* loaded from: classes.dex */
public class d extends c {
    public static Method i;

    public d(Drawable drawable) {
        super(drawable);
        c();
    }

    @Override // a.e.f.i.c
    public boolean b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void c() {
        if (i == null) {
            try {
                i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.g;
        if (drawable != null && (method = i) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.g.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.g.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // a.e.f.i.c, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // a.e.f.i.c, android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTint(int i2) {
        if (b()) {
            super.setTint(i2);
        } else {
            this.g.setTint(i2);
        }
    }

    @Override // a.e.f.i.c, android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        if (b()) {
            this.e.f388c = colorStateList;
            a(getState());
        } else {
            this.g.setTintList(colorStateList);
        }
    }

    @Override // a.e.f.i.c, android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        if (b()) {
            this.e.d = mode;
            a(getState());
        } else {
            this.g.setTintMode(mode);
        }
    }

    public d(e eVar, Resources resources) {
        super(eVar, resources);
        c();
    }
}
