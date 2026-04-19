package a.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: AppCompatTextHelper.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f277a;

    /* renamed from: b, reason: collision with root package name */
    public v0 f278b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f279c;
    public v0 d;
    public v0 e;
    public v0 f;
    public v0 g;
    public v0 h;
    public final a0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* compiled from: AppCompatTextHelper.java */
    /* loaded from: classes.dex */
    public static class a extends a.e.e.b.g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<y> f280a;

        /* renamed from: b, reason: collision with root package name */
        public final int f281b;

        /* renamed from: c, reason: collision with root package name */
        public final int f282c;

        /* compiled from: AppCompatTextHelper.java */
        /* renamed from: a.b.p.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0009a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final WeakReference<y> f283b;

            /* renamed from: c, reason: collision with root package name */
            public final Typeface f284c;

            public RunnableC0009a(a aVar, WeakReference<y> weakReference, Typeface typeface) {
                this.f283b = weakReference;
                this.f284c = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                y yVar = this.f283b.get();
                if (yVar == null) {
                    return;
                }
                Typeface typeface = this.f284c;
                if (yVar.m) {
                    yVar.f277a.setTypeface(typeface);
                    yVar.l = typeface;
                }
            }
        }

        public a(y yVar, int i, int i2) {
            this.f280a = new WeakReference<>(yVar);
            this.f281b = i;
            this.f282c = i2;
        }

        @Override // a.e.e.b.g
        public void a(Typeface typeface) {
            int i;
            y yVar = this.f280a.get();
            if (yVar == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f281b) != -1) {
                typeface = Typeface.create(typeface, i, (this.f282c & 2) != 0);
            }
            yVar.f277a.post(new RunnableC0009a(this, this.f280a, typeface));
        }
    }

    public y(TextView textView) {
        this.f277a = textView;
        this.i = new a0(this.f277a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0265  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.y.a(android.util.AttributeSet, int):void");
    }

    public boolean b() {
        a0 a0Var = this.i;
        return a0Var.d() && a0Var.f157a != 0;
    }

    public final void a(Context context, x0 x0Var) {
        String d;
        this.j = x0Var.c(a.b.j.TextAppearance_android_textStyle, this.j);
        if (Build.VERSION.SDK_INT >= 28) {
            int c2 = x0Var.c(a.b.j.TextAppearance_android_textFontWeight, -1);
            this.k = c2;
            if (c2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!x0Var.f(a.b.j.TextAppearance_android_fontFamily) && !x0Var.f(a.b.j.TextAppearance_fontFamily)) {
            if (x0Var.f(a.b.j.TextAppearance_android_typeface)) {
                this.m = false;
                int c3 = x0Var.c(a.b.j.TextAppearance_android_typeface, 1);
                if (c3 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (c3 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (c3 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i = x0Var.f(a.b.j.TextAppearance_fontFamily) ? a.b.j.TextAppearance_fontFamily : a.b.j.TextAppearance_android_fontFamily;
        int i2 = this.k;
        int i3 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface a2 = x0Var.a(i, this.j, new a(this, i2, i3));
                if (a2 != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
                        this.l = Typeface.create(Typeface.create(a2, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = a2;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (d = x0Var.d(i)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && this.k != -1) {
            this.l = Typeface.create(Typeface.create(d, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(d, this.j);
        }
    }

    public void a(Context context, int i) {
        String d;
        ColorStateList a2;
        x0 x0Var = new x0(context, context.obtainStyledAttributes(i, a.b.j.TextAppearance));
        if (x0Var.f(a.b.j.TextAppearance_textAllCaps)) {
            this.f277a.setAllCaps(x0Var.a(a.b.j.TextAppearance_textAllCaps, false));
        }
        if (Build.VERSION.SDK_INT < 23 && x0Var.f(a.b.j.TextAppearance_android_textColor) && (a2 = x0Var.a(a.b.j.TextAppearance_android_textColor)) != null) {
            this.f277a.setTextColor(a2);
        }
        if (x0Var.f(a.b.j.TextAppearance_android_textSize) && x0Var.b(a.b.j.TextAppearance_android_textSize, -1) == 0) {
            this.f277a.setTextSize(0, 0.0f);
        }
        a(context, x0Var);
        if (Build.VERSION.SDK_INT >= 26 && x0Var.f(a.b.j.TextAppearance_fontVariationSettings) && (d = x0Var.d(a.b.j.TextAppearance_fontVariationSettings)) != null) {
            this.f277a.setFontVariationSettings(d);
        }
        x0Var.f275b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f277a.setTypeface(typeface, this.j);
        }
    }

    public void a() {
        if (this.f278b != null || this.f279c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.f277a.getCompoundDrawables();
            a(compoundDrawables[0], this.f278b);
            a(compoundDrawables[1], this.f279c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f277a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public final void a(Drawable drawable, v0 v0Var) {
        if (drawable == null || v0Var == null) {
            return;
        }
        j.a(drawable, v0Var, this.f277a.getDrawableState());
    }

    public static v0 a(Context context, j jVar, int i) {
        ColorStateList b2 = jVar.b(context, i);
        if (b2 == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.d = true;
        v0Var.f256a = b2;
        return v0Var;
    }

    public void a(int i) {
        a0 a0Var = this.i;
        if (a0Var.d()) {
            if (i == 0) {
                a0Var.f157a = 0;
                a0Var.d = -1.0f;
                a0Var.e = -1.0f;
                a0Var.f159c = -1.0f;
                a0Var.f = new int[0];
                a0Var.f158b = false;
                return;
            }
            if (i == 1) {
                DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                a0Var.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (a0Var.b()) {
                    a0Var.a();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Unknown auto-size text type: " + i);
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        a0 a0Var = this.i;
        if (a0Var.d()) {
            DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
            a0Var.a(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }

    public void a(int[] iArr, int i) {
        a0 a0Var = this.i;
        if (a0Var.d()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = a0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                a0Var.f = a0Var.a(iArr2);
                if (!a0Var.c()) {
                    StringBuilder a2 = b.a.a.a.a.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                a0Var.g = false;
            }
            if (a0Var.b()) {
                a0Var.a();
            }
        }
    }
}
