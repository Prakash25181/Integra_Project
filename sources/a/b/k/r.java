package a.b.k;

import a.b.p.a1;
import a.b.p.e1;
import a.e.i.a;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AppOpsManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.ActionMode;
import android.view.Gravity;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CompoundButton;
import android.widget.PopupWindow;
import android.widget.TextView;
import b.b.a.a.b.o.s;
import b.b.a.a.f.h0;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourcesFlusher.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static Field f42a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f43b;

    /* renamed from: c, reason: collision with root package name */
    public static Class<?> f44c;
    public static boolean d;
    public static Field e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Method i;
    public static boolean j;
    public static Method k;
    public static boolean l;
    public static Field m;
    public static boolean n;
    public static Field o;
    public static boolean p;
    public static Method q;
    public static boolean r;
    public static Field s;
    public static boolean t;
    public static Context u;

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                }
                if (parent instanceof e1) {
                    editorInfo.hintText = ((e1) parent).a();
                    break;
                }
                parent = parent.getParent();
            }
        }
        return inputConnection;
    }

    public static Path b(String str) {
        Path path = new Path();
        a.e.f.b[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        try {
            a.e.f.b.a(a2, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(b.a.a.a.a.a("Error in parsing ", str), e2);
        }
    }

    public static Drawable c(String str) {
        int identifier = u.getResources().getIdentifier(str, "drawable", u.getPackageName());
        if (identifier != 0) {
            return u.getResources().getDrawable(identifier);
        }
        return null;
    }

    public static boolean c(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    public static String d(int i2) {
        return u.getString(i2);
    }

    public static Drawable c(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        return i2 >= 23 ? drawable : i2 >= 21 ? !(drawable instanceof a.e.f.i.a) ? new a.e.f.i.d(drawable) : drawable : !(drawable instanceof a.e.f.i.a) ? new a.e.f.i.c(drawable) : drawable;
    }

    public static boolean b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    public static void a(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(lastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !a(xmlPullParser, str) ? i3 : typedArray.getInt(i2, i3);
    }

    public static Drawable b(int i2) {
        if (41 > i2 || i2 > 70) {
            return null;
        }
        return c(String.format("ic_list_0x%02x", Integer.valueOf(i2)));
    }

    public static void c(TextView textView, int i2) {
        a(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void b(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float f2 = displayMetrics.widthPixels;
        float f3 = displayMetrics.density;
        if (Math.min((int) (f2 / f3), (int) (displayMetrics.heightPixels / f3)) >= 520) {
            activity.setRequestedOrientation(-1);
        } else {
            activity.setRequestedOrientation(1);
        }
    }

    public static String a(b.b.a.a.b.o.s sVar, boolean z, int i2) {
        if (sVar == null) {
            return "";
        }
        if (z) {
            return d(R.string.muting);
        }
        if (!sVar.d) {
            return "";
        }
        if (i2 == sVar.e) {
            return d(R.string.volumeMin);
        }
        if (i2 == sVar.f) {
            return d(R.string.volumeMax);
        }
        if (sVar.g == s.a.ONE_DB) {
            return String.format("%d", Integer.valueOf(i2));
        }
        double d2 = i2;
        Double.isNaN(d2);
        return String.format("%.1f", Double.valueOf(d2 / 2.0d));
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }

    public static String b(Context context, ComponentName componentName) {
        String string;
        String str;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 640);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        a1 a1Var = a1.k;
        if (a1Var != null && a1Var.f160b == view) {
            a1.a((a1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            a1 a1Var2 = a1.l;
            if (a1Var2 != null && a1Var2.f160b == view) {
                a1Var2.b();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new a1(view, charSequence);
    }

    public static void b(TextView textView, int i2) {
        int i3;
        a(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT >= 16 && !textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.descent;
        } else {
            i3 = fontMetricsInt.bottom;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static float[] a(float[] fArr, int i2, int i3) {
        if (i2 <= i3) {
            int length = fArr.length;
            if (i2 >= 0 && i2 <= length) {
                int i4 = i3 - i2;
                int min = Math.min(i4, length - i2);
                float[] fArr2 = new float[i4];
                System.arraycopy(fArr, i2, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static boolean a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static Drawable a(b.b.a.a.b.o.e eVar, boolean z) {
        if (eVar == b.b.a.a.b.o.e.DEMO) {
            eVar = b.b.a.a.b.o.e.NET_TOP;
        }
        if (z) {
            switch (eVar.ordinal()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    return c(String.format("ic_service_0x%02x", Integer.valueOf(eVar.f807b)));
                case 26:
                default:
                    return null;
                case 27:
                    return c("ic_selector_dap");
            }
        }
        if (eVar.ordinal() != 20) {
            return null;
        }
        return c(String.format("ic_service_0x%02x_db", Integer.valueOf(eVar.f807b)));
    }

    public static File a(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder a2 = b.a.a.a.a.a(".font");
        a2.append(Process.myPid());
        a2.append("-");
        a2.append(Process.myTid());
        a2.append("-");
        String sb = a2.toString();
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, sb + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static void a(View view, i0 i0Var) {
        if (view == null || i0Var == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new h0(i0Var, view));
    }

    public static Interpolator a(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator(context, i2);
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                if (i2 == 17563663) {
                    return new a.i.a.a.a();
                }
                if (i2 == 17563661) {
                    return new a.i.a.a.b();
                }
                if (i2 == 17563662) {
                    return new a.i.a.a.c();
                }
                XmlResourceParser animation = context.getResources().getAnimation(i2);
                context.getResources();
                context.getTheme();
                Interpolator a2 = a(context, (XmlPullParser) animation);
                animation.close();
                return a2;
            } catch (IOException e2) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e2);
                throw notFoundException;
            } catch (XmlPullParserException e3) {
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
                notFoundException2.initCause(e3);
                throw notFoundException2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, float f2) {
        return !a(xmlPullParser, str) ? f2 : typedArray.getFloat(i2, f2);
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!n) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                m = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                StringBuilder a2 = b.a.a.a.a.a("forceSetFactory2 Could not find field 'mFactory2' on class ");
                a2.append(LayoutInflater.class.getName());
                a2.append("; inflation may have unexpected results.");
                Log.e("LayoutInflaterCompatHC", a2.toString(), e2);
            }
            n = true;
        }
        Field field = m;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e3) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e3);
            }
        }
    }

    public static void a(Drawable drawable, boolean z) {
        if (Build.VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    public static <T> T a(T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static void a(PopupWindow popupWindow, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            popupWindow.setOverlapAnchor(z);
            return;
        }
        if (i2 >= 21) {
            if (!t) {
                try {
                    Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    s = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e2);
                }
                t = true;
            }
            Field field = s;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e3) {
                    Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e3);
                }
            }
        }
    }

    public static int a(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Arrays.hashCode(objArr);
        }
        return Arrays.hashCode(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008a, code lost:
    
        if (r16 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: NumberFormatException -> 0x00b8, LOOP:3: B:29:0x006e->B:39:0x0097, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009d A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[Catch: NumberFormatException -> 0x00b8, TryCatch #0 {NumberFormatException -> 0x00b8, blocks: (B:26:0x005a, B:29:0x006e, B:31:0x0074, B:35:0x0080, B:39:0x0097, B:43:0x009d, B:48:0x00ad, B:59:0x00b2), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.e.f.b[] a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.r.a(java.lang.String):a.e.f.b[]");
    }

    public static ByteBuffer a(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                }
                return null;
            }
            try {
                try {
                    FileChannel channel = new FileInputStream(openFileDescriptor.getFileDescriptor()).getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00c6, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.animation.Interpolator a(android.content.Context r4, org.xmlpull.v1.XmlPullParser r5) {
        /*
            int r0 = r5.getDepth()
            r1 = 0
        L5:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L12
            int r3 = r5.getDepth()
            if (r3 <= r0) goto Lc6
        L12:
            r3 = 1
            if (r2 == r3) goto Lc6
            r3 = 2
            if (r2 == r3) goto L19
            goto L5
        L19:
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r5)
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "linearInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2f
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            goto L5
        L2f:
            java.lang.String r3 = "accelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3e
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>(r4, r1)
        L3c:
            r1 = r2
            goto L5
        L3e:
            java.lang.String r3 = "decelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4c
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L4c:
            java.lang.String r3 = "accelerateDecelerateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L5a
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            goto L5
        L5a:
            java.lang.String r3 = "cycleInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L68
            android.view.animation.CycleInterpolator r2 = new android.view.animation.CycleInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L68:
            java.lang.String r3 = "anticipateInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L76
            android.view.animation.AnticipateInterpolator r2 = new android.view.animation.AnticipateInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L76:
            java.lang.String r3 = "overshootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L84
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L84:
            java.lang.String r3 = "anticipateOvershootInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L92
            android.view.animation.AnticipateOvershootInterpolator r2 = new android.view.animation.AnticipateOvershootInterpolator
            r2.<init>(r4, r1)
            goto L3c
        L92:
            java.lang.String r3 = "bounceInterpolator"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto La1
            android.view.animation.BounceInterpolator r1 = new android.view.animation.BounceInterpolator
            r1.<init>()
            goto L5
        La1:
            java.lang.String r3 = "pathInterpolator"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Laf
            a.m.a.a.f r2 = new a.m.a.a.f
            r2.<init>(r4, r1, r5)
            goto L3c
        Laf:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r0 = "Unknown interpolator name: "
            java.lang.StringBuilder r0 = b.a.a.a.a.a(r0)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
            throw r4
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.r.a(android.content.Context, org.xmlpull.v1.XmlPullParser):android.view.animation.Interpolator");
    }

    public static void a(Drawable drawable, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f2, f3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.lang.Object[], java.lang.Object] */
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        TypedArray obtainStyledAttributes;
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            int i2 = 1;
            int depth2 = xmlPullParser.getDepth() + 1;
            int[][] iArr = new int[20];
            int[] iArr2 = new int[20];
            int i3 = 0;
            while (true) {
                int next = xmlPullParser.next();
                if (next == i2 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                    break;
                }
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                    int[] iArr3 = a.e.c.ColorStateListItem;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr3);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr3, 0, 0);
                    }
                    int color = obtainStyledAttributes.getColor(a.e.c.ColorStateListItem_android_color, -65281);
                    float f2 = 1.0f;
                    if (obtainStyledAttributes.hasValue(a.e.c.ColorStateListItem_android_alpha)) {
                        f2 = obtainStyledAttributes.getFloat(a.e.c.ColorStateListItem_android_alpha, 1.0f);
                    } else if (obtainStyledAttributes.hasValue(a.e.c.ColorStateListItem_alpha)) {
                        f2 = obtainStyledAttributes.getFloat(a.e.c.ColorStateListItem_alpha, 1.0f);
                    }
                    obtainStyledAttributes.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr4 = new int[attributeCount];
                    int i4 = 0;
                    for (int i5 = 0; i5 < attributeCount; i5++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != a.e.a.alpha) {
                            int i6 = i4 + 1;
                            if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr4[i4] = attributeNameResource;
                            i4 = i6;
                        }
                    }
                    int[] trimStateSet = StateSet.trimStateSet(iArr4, i4);
                    int round = (Math.round(Color.alpha(color) * f2) << 24) | (color & 16777215);
                    int i7 = i3 + 1;
                    if (i7 > iArr2.length) {
                        int[] iArr5 = new int[i3 <= 4 ? 8 : i3 * 2];
                        System.arraycopy(iArr2, 0, iArr5, 0, i3);
                        iArr2 = iArr5;
                    }
                    iArr2[i3] = round;
                    if (i7 > iArr.length) {
                        ?? r8 = (Object[]) Array.newInstance(iArr.getClass().getComponentType(), i3 > 4 ? i3 * 2 : 8);
                        System.arraycopy(iArr, 0, r8, 0, i3);
                        iArr = r8;
                    }
                    iArr[i3] = trimStateSet;
                    iArr = iArr;
                    i3 = i7;
                }
                i2 = 1;
            }
            int[] iArr6 = new int[i3];
            int[][] iArr7 = new int[i3];
            System.arraycopy(iArr2, 0, iArr6, 0, i3);
            System.arraycopy(iArr, 0, iArr7, 0, i3);
            return new ColorStateList(iArr7, iArr6);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2, int i3) {
        return !a(xmlPullParser, str) ? i3 : typedArray.getColor(i2, i3);
    }

    public static a.e.f.b[] a(a.e.f.b[] bVarArr) {
        if (bVarArr == null) {
            return null;
        }
        a.e.f.b[] bVarArr2 = new a.e.f.b[bVarArr.length];
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            bVarArr2[i2] = new a.e.f.b(bVarArr[i2]);
        }
        return bVarArr2;
    }

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        if (!p) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e2);
            }
            p = true;
        }
        Field field = o;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e3) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e3);
                o = null;
            }
        }
        return null;
    }

    public static void a(Drawable drawable, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public static Intent a(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        try {
            String b2 = b(activity, activity.getComponentName());
            if (b2 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b2);
            try {
                if (b(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b2 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static int a(Context context, String str) {
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String permissionToOp = Build.VERSION.SDK_INT >= 23 ? AppOpsManager.permissionToOp(str) : null;
        if (permissionToOp != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            if ((Build.VERSION.SDK_INT >= 23 ? ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName) : 1) != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(i2);
        } else if (drawable instanceof a.e.f.i.a) {
            ((a.e.f.i.a) drawable).setTint(i2);
        }
    }

    public static int a(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static a.e.e.b.a a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2, int i3) {
        a.e.e.b.a aVar;
        if (a(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i4 = typedValue.type;
            if (i4 >= 28 && i4 <= 31) {
                return new a.e.e.b.a(null, null, typedValue.data);
            }
            try {
                aVar = a.e.e.b.a.a(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new a.e.e.b.a(null, null, i3);
    }

    public static boolean a(a.e.f.b[] bVarArr, a.e.f.b[] bVarArr2) {
        if (bVarArr == null || bVarArr2 == null || bVarArr.length != bVarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            if (bVarArr[i2].f375a != bVarArr2[i2].f375a || bVarArr[i2].f376b.length != bVarArr2[i2].f376b.length) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static int a(int i2, int i3) {
        return Build.VERSION.SDK_INT >= 17 ? Gravity.getAbsoluteGravity(i2, i3) : i2 & (-8388609);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof a.e.f.i.a) {
            ((a.e.f.i.a) drawable).setTintList(colorStateList);
        }
    }

    public static void a(PopupWindow popupWindow, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i2);
            return;
        }
        if (!r) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                q = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            r = true;
        }
        Method method = q;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i2));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof a.e.f.i.a) {
            ((a.e.f.i.a) drawable).setTintMode(mode);
        }
    }

    public static void a(Object obj) {
        if (!d) {
            try {
                f44c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            d = true;
        }
        Class<?> cls = f44c;
        if (cls == null) {
            return;
        }
        if (!f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
            }
            f = true;
        }
        Field field = e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e4) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static boolean a(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean a2 = a(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return a2;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static a.e.e.b.b a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.e.c.FontFamily);
                String string = obtainAttributes.getString(a.e.c.FontFamily_fontProviderAuthority);
                String string2 = obtainAttributes.getString(a.e.c.FontFamily_fontProviderPackage);
                String string3 = obtainAttributes.getString(a.e.c.FontFamily_fontProviderQuery);
                int resourceId = obtainAttributes.getResourceId(a.e.c.FontFamily_fontProviderCerts, 0);
                int integer = obtainAttributes.getInteger(a.e.c.FontFamily_fontProviderFetchStrategy, 1);
                int integer2 = obtainAttributes.getInteger(a.e.c.FontFamily_fontProviderFetchTimeout, 500);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlPullParser.next() != 3) {
                        a(xmlPullParser);
                    }
                    return new a.e.e.b.e(new a.e.h.a(string, string2, string3, a(resources, resourceId)), integer, integer2);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlPullParser.next() != 3) {
                    if (xmlPullParser.getEventType() == 2) {
                        if (xmlPullParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.e.c.FontFamilyFont);
                            int i2 = obtainAttributes2.getInt(obtainAttributes2.hasValue(a.e.c.FontFamilyFont_fontWeight) ? a.e.c.FontFamilyFont_fontWeight : a.e.c.FontFamilyFont_android_fontWeight, 400);
                            boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(a.e.c.FontFamilyFont_fontStyle) ? a.e.c.FontFamilyFont_fontStyle : a.e.c.FontFamilyFont_android_fontStyle, 0);
                            int i3 = obtainAttributes2.hasValue(a.e.c.FontFamilyFont_ttcIndex) ? a.e.c.FontFamilyFont_ttcIndex : a.e.c.FontFamilyFont_android_ttcIndex;
                            String string4 = obtainAttributes2.getString(obtainAttributes2.hasValue(a.e.c.FontFamilyFont_fontVariationSettings) ? a.e.c.FontFamilyFont_fontVariationSettings : a.e.c.FontFamilyFont_android_fontVariationSettings);
                            int i4 = obtainAttributes2.getInt(i3, 0);
                            int i5 = obtainAttributes2.hasValue(a.e.c.FontFamilyFont_font) ? a.e.c.FontFamilyFont_font : a.e.c.FontFamilyFont_android_font;
                            int resourceId2 = obtainAttributes2.getResourceId(i5, 0);
                            String string5 = obtainAttributes2.getString(i5);
                            obtainAttributes2.recycle();
                            while (xmlPullParser.next() != 3) {
                                a(xmlPullParser);
                            }
                            arrayList.add(new a.e.e.b.d(string5, i2, z, string4, i4, resourceId2));
                        } else {
                            a(xmlPullParser);
                        }
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new a.e.e.b.c((a.e.e.b.d[]) arrayList.toArray(new a.e.e.b.d[arrayList.size()]));
            }
            a(xmlPullParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static Intent a(Context context, ComponentName componentName) {
        String b2 = b(context, componentName);
        if (b2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b2);
        if (b(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static PropertyValuesHolder a(TypedArray typedArray, int i2, int i3, int i4, String str) {
        int i5;
        PropertyValuesHolder ofInt;
        int i6;
        int i7;
        float f2;
        float f3;
        float f4;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i3);
        boolean z = peekValue != null;
        int i8 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i4);
        boolean z2 = peekValue2 != null;
        int i9 = z2 ? peekValue2.type : 0;
        if (i2 == 4) {
            i2 = ((z && c(i8)) || (z2 && c(i9))) ? 3 : 0;
        }
        boolean z3 = i2 == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i2 == 2) {
            String string = typedArray.getString(i3);
            String string2 = typedArray.getString(i4);
            a.e.f.b[] a2 = a(string);
            a.e.f.b[] a3 = a(string2);
            if (a2 == null && a3 == null) {
                return null;
            }
            if (a2 == null) {
                if (a3 != null) {
                    return PropertyValuesHolder.ofObject(str, new a.m.a.a.d(), a3);
                }
                return null;
            }
            a.m.a.a.d dVar = new a.m.a.a.d();
            if (a3 != null) {
                if (a(a2, a3)) {
                    ofObject = PropertyValuesHolder.ofObject(str, dVar, a2, a3);
                } else {
                    throw new InflateException(" Can't morph from " + string + " to " + string2);
                }
            } else {
                ofObject = PropertyValuesHolder.ofObject(str, dVar, a2);
            }
            return ofObject;
        }
        a.m.a.a.e eVar = i2 == 3 ? a.m.a.a.e.f597a : null;
        if (z3) {
            if (z) {
                if (i8 == 5) {
                    f3 = typedArray.getDimension(i3, 0.0f);
                } else {
                    f3 = typedArray.getFloat(i3, 0.0f);
                }
                if (z2) {
                    if (i9 == 5) {
                        f4 = typedArray.getDimension(i4, 0.0f);
                    } else {
                        f4 = typedArray.getFloat(i4, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f3, f4);
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, f3);
                }
            } else {
                if (i9 == 5) {
                    f2 = typedArray.getDimension(i4, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i4, 0.0f);
                }
                ofInt = PropertyValuesHolder.ofFloat(str, f2);
            }
        } else {
            if (!z) {
                if (z2) {
                    if (i9 == 5) {
                        i5 = (int) typedArray.getDimension(i4, 0.0f);
                    } else if (c(i9)) {
                        i5 = typedArray.getColor(i4, 0);
                    } else {
                        i5 = typedArray.getInt(i4, 0);
                    }
                    ofInt = PropertyValuesHolder.ofInt(str, i5);
                }
                if (propertyValuesHolder == null && eVar != null) {
                    propertyValuesHolder.setEvaluator(eVar);
                    return propertyValuesHolder;
                }
            }
            if (i8 == 5) {
                i6 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (c(i8)) {
                i6 = typedArray.getColor(i3, 0);
            } else {
                i6 = typedArray.getInt(i3, 0);
            }
            if (z2) {
                if (i9 == 5) {
                    i7 = (int) typedArray.getDimension(i4, 0.0f);
                } else if (c(i9)) {
                    i7 = typedArray.getColor(i4, 0);
                } else {
                    i7 = typedArray.getInt(i4, 0);
                }
                ofInt = PropertyValuesHolder.ofInt(str, i6, i7);
            } else {
                ofInt = PropertyValuesHolder.ofInt(str, i6);
            }
        }
        propertyValuesHolder = ofInt;
        return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
    }

    public static String a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i2) {
        if (a(xmlPullParser, str)) {
            return typedArray.getString(i2);
        }
        return null;
    }

    public static List<List<byte[]>> a(Resources resources, int i2) {
        int i3;
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (Build.VERSION.SDK_INT >= 21) {
                i3 = obtainTypedArray.getType(0);
            } else {
                TypedValue typedValue = new TypedValue();
                obtainTypedArray.getValue(0, typedValue);
                i3 = typedValue.type;
            }
            if (i3 == 1) {
                for (int i4 = 0; i4 < obtainTypedArray.length(); i4++) {
                    int resourceId = obtainTypedArray.getResourceId(i4, 0);
                    if (resourceId != 0) {
                        arrayList.add(a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(a(resources.getStringArray(i2)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static List<byte[]> a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static void a(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int i2, int i3, int[] iArr, int i4) {
        if (viewParent instanceof a.e.k.g) {
            ((a.e.k.g) viewParent).a(view, i2, i3, iArr, i4);
            return;
        }
        if (i4 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i2, i3, iArr);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e2);
                    return;
                }
            }
            if (viewParent instanceof a.e.k.i) {
                ((a.e.k.i) viewParent).onNestedPreScroll(view, i2, i3, iArr);
            }
        }
    }

    public static int a(Drawable drawable) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i2 >= 17) {
            if (!l) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    k = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
                }
                l = true;
            }
            Method method = k;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e3) {
                    Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                    k = null;
                }
            }
        }
        return 0;
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f2, f3, z);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e2);
                return false;
            }
        }
        if (viewParent instanceof a.e.k.i) {
            return ((a.e.k.i) viewParent).onNestedFling(view, f2, f3, z);
        }
        return false;
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f2, f3);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e2);
                return false;
            }
        }
        if (viewParent instanceof a.e.k.i) {
            return ((a.e.k.i) viewParent).onNestedPreFling(view, f2, f3);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0340, code lost:
    
        if (r2.hasNext() == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0342, code lost:
    
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x034e, code lost:
    
        if (r28 != 0) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0350, code lost:
    
        r27.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0354, code lost:
    
        r27.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0357, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x032d, code lost:
    
        if (r27 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x032f, code lost:
    
        if (r13 == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0331, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, org.xmlpull.v1.XmlPullParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28, float r29) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.r.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static ActionMode.Callback a(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof a.e.l.d)) ? callback : new a.e.l.d(callback, textView);
    }

    public static void a(TextView textView, int i2) {
        int i3;
        a(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (Build.VERSION.SDK_INT >= 16 && !textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.ascent;
        } else {
            i3 = fontMetricsInt.top;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 - (-i3), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static Keyframe a(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    public static a.C0016a a(TextView textView) {
        int i2;
        int i3;
        TextDirectionHeuristic textDirectionHeuristic;
        if (Build.VERSION.SDK_INT >= 28) {
            return new a.C0016a(textView.getTextMetricsParams());
        }
        TextPaint textPaint = new TextPaint(textView.getPaint());
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 1;
            i3 = 1;
        } else {
            i2 = 0;
            i3 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic2 = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = textView.getBreakStrategy();
            i3 = textView.getHyphenationFrequency();
        }
        if (Build.VERSION.SDK_INT >= 18) {
            if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            } else if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
                if (directionality != 1 && directionality != 2) {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                }
            } else {
                boolean z = textView.getLayoutDirection() == 1;
                switch (textView.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        } else {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            break;
                        }
                }
            }
            textDirectionHeuristic2 = textDirectionHeuristic;
        }
        return new a.C0016a(textPaint, textDirectionHeuristic2, i2, i3);
    }

    public static void a(TextView textView, a.e.i.a aVar) {
        a.C0016a a2 = a(textView);
        if (aVar != null) {
            if (a2.a(null)) {
                textView.setText(aVar);
                return;
            }
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
        throw null;
    }

    public static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray a2 = a(resources, theme, attributeSet, a.m.a.a.a.g);
        TypedArray a3 = a(resources, theme, attributeSet, a.m.a.a.a.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long b2 = b(a2, xmlPullParser, "duration", 1, 300);
        int i2 = 0;
        long b3 = b(a2, xmlPullParser, "startOffset", 2, 0);
        int b4 = b(a2, xmlPullParser, "valueType", 7, 4);
        if (a(xmlPullParser, "valueFrom") && a(xmlPullParser, "valueTo")) {
            if (b4 == 4) {
                TypedValue peekValue = a2.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = a2.peekValue(6);
                boolean z2 = peekValue2 != null;
                b4 = ((z && c(i3)) || (z2 && c(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder a4 = a(a2, b4, 5, 6, "");
            if (a4 != null) {
                valueAnimator4.setValues(a4);
            }
        }
        valueAnimator4.setDuration(b2);
        valueAnimator4.setStartDelay(b3);
        valueAnimator4.setRepeatCount(b(a2, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator4.setRepeatMode(b(a2, xmlPullParser, "repeatMode", 4, 1));
        if (a3 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String a5 = a(a3, xmlPullParser, "pathData", 1);
            if (a5 != null) {
                String a6 = a(a3, xmlPullParser, "propertyXName", 2);
                String a7 = a(a3, xmlPullParser, "propertyYName", 3);
                if (a6 == null && a7 == null) {
                    throw new InflateException(a3.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path b5 = b(a5);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(b5, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    f4 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f4));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(b5, false);
                int min = Math.min(100, ((int) (f4 / f3)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f5 = f4 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                int i4 = 0;
                float f6 = 0.0f;
                while (true) {
                    if (i2 >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f6 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i2] = fArr3[0];
                    fArr2[i2] = fArr3[1];
                    f6 += f5;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f6 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i2++;
                    min = i5;
                }
                PropertyValuesHolder ofFloat = a6 != null ? PropertyValuesHolder.ofFloat(a6, fArr) : null;
                PropertyValuesHolder ofFloat2 = a7 != null ? PropertyValuesHolder.ofFloat(a7, fArr2) : null;
                if (ofFloat == null) {
                    i2 = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i2 = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = a2;
                objectAnimator.setPropertyName(a(a3, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = a2;
        }
        if (a(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i2 = typedArray2.getResourceId(i2, i2);
        } else {
            typedArray2 = typedArray;
        }
        if (i2 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(a(context, i2));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator3;
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return a.e.d.h.a(notification);
        }
        return null;
    }
}
