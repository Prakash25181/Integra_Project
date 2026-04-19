package a.b.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources.java */
/* loaded from: classes.dex */
public class w0 extends o0 {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<Context> f271b;

    public w0(Context context, Resources resources) {
        super(resources);
        this.f271b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f230a.getDrawable(i);
        Context context = this.f271b.get();
        if (drawable != null && context != null) {
            n0.a().a(context, i, drawable);
        }
        return drawable;
    }
}
