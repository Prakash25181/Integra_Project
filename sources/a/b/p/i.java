package a.b.p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;

/* compiled from: AppCompatCompoundButtonHelper.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f195a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f196b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f197c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public i(CompoundButton compoundButton) {
        this.f195a = compoundButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x000d, B:5:0x0015, B:8:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x005a, B:20:0x0066, B:21:0x006a, B:23:0x006e, B:24:0x0073, B:26:0x007b, B:28:0x008d, B:29:0x0091, B:31:0x0095), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x000d, B:5:0x0015, B:8:0x001d, B:11:0x0031, B:13:0x0039, B:15:0x0041, B:16:0x0050, B:18:0x005a, B:20:0x0066, B:21:0x006a, B:23:0x006e, B:24:0x0073, B:26:0x007b, B:28:0x008d, B:29:0x0091, B:31:0x0095), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f195a
            android.content.Context r0 = r0.getContext()
            int[] r1 = a.b.j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = a.b.j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L2e
            int r5 = a.b.j.CompoundButton_buttonCompat     // Catch: java.lang.Throwable -> L9e
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L2e
            android.widget.CompoundButton r0 = r3.f195a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L9e
            android.widget.CompoundButton r1 = r3.f195a     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L9e
            android.content.Context r1 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L9e
            android.graphics.drawable.Drawable r5 = a.b.l.a.a.c(r1, r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L9e
            r0.setButtonDrawable(r5)     // Catch: android.content.res.Resources.NotFoundException -> L2e java.lang.Throwable -> L9e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            if (r5 != 0) goto L50
            int r5 = a.b.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L50
            int r5 = a.b.j.CompoundButton_android_button     // Catch: java.lang.Throwable -> L9e
            int r5 = r4.getResourceId(r5, r2)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L50
            android.widget.CompoundButton r0 = r3.f195a     // Catch: java.lang.Throwable -> L9e
            android.widget.CompoundButton r1 = r3.f195a     // Catch: java.lang.Throwable -> L9e
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L9e
            android.graphics.drawable.Drawable r5 = a.b.l.a.a.c(r1, r5)     // Catch: java.lang.Throwable -> L9e
            r0.setButtonDrawable(r5)     // Catch: java.lang.Throwable -> L9e
        L50:
            int r5 = a.b.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L9e
            r0 = 21
            if (r5 == 0) goto L73
            android.widget.CompoundButton r5 = r3.f195a     // Catch: java.lang.Throwable -> L9e
            int r1 = a.b.j.CompoundButton_buttonTint     // Catch: java.lang.Throwable -> L9e
            android.content.res.ColorStateList r1 = r4.getColorStateList(r1)     // Catch: java.lang.Throwable -> L9e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9e
            if (r2 < r0) goto L6a
            r5.setButtonTintList(r1)     // Catch: java.lang.Throwable -> L9e
            goto L73
        L6a:
            boolean r2 = r5 instanceof a.e.l.e     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L73
            a.e.l.e r5 = (a.e.l.e) r5     // Catch: java.lang.Throwable -> L9e
            r5.setSupportButtonTintList(r1)     // Catch: java.lang.Throwable -> L9e
        L73:
            int r5 = a.b.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L9e
            boolean r5 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L9a
            android.widget.CompoundButton r5 = r3.f195a     // Catch: java.lang.Throwable -> L9e
            int r1 = a.b.j.CompoundButton_buttonTintMode     // Catch: java.lang.Throwable -> L9e
            r2 = -1
            int r1 = r4.getInt(r1, r2)     // Catch: java.lang.Throwable -> L9e
            r2 = 0
            android.graphics.PorterDuff$Mode r1 = a.b.p.e0.a(r1, r2)     // Catch: java.lang.Throwable -> L9e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9e
            if (r2 < r0) goto L91
            r5.setButtonTintMode(r1)     // Catch: java.lang.Throwable -> L9e
            goto L9a
        L91:
            boolean r0 = r5 instanceof a.e.l.e     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L9a
            a.e.l.e r5 = (a.e.l.e) r5     // Catch: java.lang.Throwable -> L9e
            r5.setSupportButtonTintMode(r1)     // Catch: java.lang.Throwable -> L9e
        L9a:
            r4.recycle()
            return
        L9e:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.i.a(android.util.AttributeSet, int):void");
    }

    public void a() {
        Drawable a2 = a.b.k.r.a(this.f195a);
        if (a2 != null) {
            if (this.d || this.e) {
                Drawable mutate = a.b.k.r.c(a2).mutate();
                if (this.d) {
                    a.b.k.r.a(mutate, this.f196b);
                }
                if (this.e) {
                    a.b.k.r.a(mutate, this.f197c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f195a.getDrawableState());
                }
                this.f195a.setButtonDrawable(mutate);
            }
        }
    }

    public int a(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = a.b.k.r.a(this.f195a)) == null) ? i : i + a2.getIntrinsicWidth();
    }
}
