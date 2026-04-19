package a.b.o;

import a.b.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* compiled from: ContextThemeWrapper.java */
/* loaded from: classes.dex */
public class c extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f81a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f82b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f83c;
    public Resources d;

    public c() {
        super(null);
    }

    public final void a() {
        if (this.f82b == null) {
            this.f82b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f82b.setTo(theme);
            }
        }
        this.f82b.applyStyle(this.f81a, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f83c == null) {
                this.f83c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f83c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f82b;
        if (theme != null) {
            return theme;
        }
        if (this.f81a == 0) {
            this.f81a = i.Theme_AppCompat_Light;
        }
        a();
        return this.f82b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f81a != i) {
            this.f81a = i;
            a();
        }
    }

    public c(Context context, int i) {
        super(context);
        this.f81a = i;
    }
}
