package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f274a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f275b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f276c;

    public x0(Context context, TypedArray typedArray) {
        this.f274a = context;
        this.f275b = typedArray;
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public Drawable b(int i) {
        int resourceId;
        if (this.f275b.hasValue(i) && (resourceId = this.f275b.getResourceId(i, 0)) != 0) {
            return a.b.l.a.a.c(this.f274a, resourceId);
        }
        return this.f275b.getDrawable(i);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f275b.hasValue(i) || (resourceId = this.f275b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.a().a(this.f274a, resourceId, true);
    }

    public String d(int i) {
        return this.f275b.getString(i);
    }

    public CharSequence e(int i) {
        return this.f275b.getText(i);
    }

    public boolean f(int i) {
        return this.f275b.hasValue(i);
    }

    public static x0 a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public int d(int i, int i2) {
        return this.f275b.getLayoutDimension(i, i2);
    }

    public int e(int i, int i2) {
        return this.f275b.getResourceId(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface a(int r13, int r14, a.e.e.b.g r15) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.x0.a(int, int, a.e.e.b.g):android.graphics.Typeface");
    }

    public int c(int i, int i2) {
        return this.f275b.getInt(i, i2);
    }

    public int b(int i, int i2) {
        return this.f275b.getDimensionPixelSize(i, i2);
    }

    public boolean a(int i, boolean z) {
        return this.f275b.getBoolean(i, z);
    }

    public ColorStateList a(int i) {
        int resourceId;
        ColorStateList b2;
        return (!this.f275b.hasValue(i) || (resourceId = this.f275b.getResourceId(i, 0)) == 0 || (b2 = a.b.l.a.a.b(this.f274a, resourceId)) == null) ? this.f275b.getColorStateList(i) : b2;
    }

    public int a(int i, int i2) {
        return this.f275b.getDimensionPixelOffset(i, i2);
    }
}
