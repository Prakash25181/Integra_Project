package a.b.p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: AppCompatTextViewAutoSizeHelper.java */
/* loaded from: classes.dex */
public class a0 {
    public static final RectF k = new RectF();
    public static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, Field> m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public int f157a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f158b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f159c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public TextPaint h;
    public final TextView i;
    public final Context j;

    public a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    public final int[] a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final boolean b() {
        if (d() && this.f157a == 1) {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.e - this.d) / this.f159c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f159c) + this.d);
                }
                this.f = a(iArr);
            }
            this.f158b = true;
        } else {
            this.f158b = false;
        }
        return this.f158b;
    }

    public final boolean c() {
        boolean z = this.f.length > 0;
        this.g = z;
        if (z) {
            this.f157a = 1;
            int[] iArr = this.f;
            this.d = iArr[0];
            this.e = iArr[r0 - 1];
            this.f159c = -1.0f;
        }
        return this.g;
    }

    public final boolean d() {
        return !(this.i instanceof k);
    }

    public static <T> T b(Object obj, String str, T t) {
        try {
            return (T) b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    public final void a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 > 0.0f) {
            this.f157a = 1;
            this.d = f;
            this.e = f2;
            this.f159c = f3;
            this.g = false;
            return;
        }
        throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
    }

    public static Method b(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public void a(int i, float f) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.f158b = false;
                try {
                    Method b2 = b("nullLayouts");
                    if (b2 != null) {
                        b2.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    public final int a(RectF rectF) {
        int i;
        StaticLayout staticLayout;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 0;
            int i4 = 1;
            int i5 = 0;
            while (i4 <= i2) {
                int i6 = (i4 + i2) / 2;
                int i7 = this.f[i6];
                CharSequence text = this.i.getText();
                TransformationMethod transformationMethod = this.i.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.i)) != null) {
                    text = transformation;
                }
                int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
                TextPaint textPaint = this.h;
                if (textPaint == null) {
                    this.h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.h.set(this.i.getPaint());
                this.h.setTextSize(i7);
                Layout.Alignment alignment = (Layout.Alignment) b(this.i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 23) {
                    StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, i3, text.length(), this.h, round);
                    obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                    try {
                        if (Build.VERSION.SDK_INT >= 29) {
                            textDirectionHeuristic = this.i.getTextDirectionHeuristic();
                        } else {
                            textDirectionHeuristic = (TextDirectionHeuristic) b(this.i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                        }
                        obtain.setTextDirection(textDirectionHeuristic);
                    } catch (ClassCastException unused) {
                        Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                    staticLayout = obtain.build();
                    i = -1;
                } else if (i8 >= 16) {
                    i = -1;
                    staticLayout = new StaticLayout(text, this.h, round, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
                } else {
                    i = -1;
                    staticLayout = new StaticLayout(text, this.h, round, alignment, ((Float) a(this.i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, "mIncludePad", true)).booleanValue());
                }
                if ((maxLines == i || (staticLayout.getLineCount() <= maxLines && staticLayout.getLineEnd(staticLayout.getLineCount() - 1) == text.length())) && ((float) staticLayout.getHeight()) <= rectF.bottom) {
                    int i9 = i6 + 1;
                    i3 = 0;
                    i5 = i4;
                    i4 = i9;
                } else {
                    i5 = i6 - 1;
                    i2 = i5;
                    i3 = 0;
                }
            }
            return this.f[i5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static <T> T a(Object obj, String str, T t) {
        try {
            Field a2 = a(str);
            return a2 == null ? t : (T) a2.get(obj);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return t;
        }
    }

    public static Field a(String str) {
        try {
            Field field = m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }

    public void a() {
        boolean booleanValue;
        if (d() && this.f157a != 0) {
            if (this.f158b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    booleanValue = this.i.isHorizontallyScrollable();
                } else {
                    booleanValue = ((Boolean) b(this.i, "getHorizontallyScrolling", false)).booleanValue();
                }
                int measuredWidth = booleanValue ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                synchronized (k) {
                    k.setEmpty();
                    k.right = measuredWidth;
                    k.bottom = height;
                    float a2 = a(k);
                    if (a2 != this.i.getTextSize()) {
                        a(0, a2);
                    }
                }
            }
            this.f158b = true;
        }
    }
}
