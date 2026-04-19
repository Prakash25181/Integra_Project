package a.e.f.i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: WrappedDrawableState.java */
/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f386a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f387b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f388c;
    public PorterDuff.Mode d;

    public e(e eVar) {
        this.f388c = null;
        this.d = c.h;
        if (eVar != null) {
            this.f386a = eVar.f386a;
            this.f387b = eVar.f387b;
            this.f388c = eVar.f388c;
            this.d = eVar.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i = this.f386a;
        Drawable.ConstantState constantState = this.f387b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new d(this, resources);
        }
        return new c(this, resources);
    }
}
