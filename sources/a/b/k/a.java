package a.b.k;

import a.b.o.a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;

/* compiled from: ActionBar.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: ActionBar.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z);
    }

    /* compiled from: ActionBar.java */
    @Deprecated
    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();
    }

    public abstract a.b.o.a a(a.InterfaceC0005a interfaceC0005a);

    public abstract void a(Configuration configuration);

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract boolean a();

    public abstract boolean a(int i, KeyEvent keyEvent);

    public abstract int b();

    public abstract void b(boolean z);

    public abstract Context c();

    public abstract void c(boolean z);

    public abstract void d();

    public abstract void d(boolean z);

    public abstract void e();

    /* compiled from: ActionBar.java */
    /* renamed from: a.b.k.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2a;

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.b.j.ActionBarLayout);
            this.f2a = obtainStyledAttributes.getInt(a.b.j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f2a = 0;
            this.f2a = 8388627;
        }

        public C0000a(C0000a c0000a) {
            super((ViewGroup.MarginLayoutParams) c0000a);
            this.f2a = 0;
            this.f2a = c0000a.f2a;
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2a = 0;
        }
    }
}
