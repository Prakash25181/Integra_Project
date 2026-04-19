package a.e.k;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static Field f438a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f439b;

    /* renamed from: c, reason: collision with root package name */
    public static WeakHashMap<View, String> f440c;
    public static WeakHashMap<View, s> d;
    public static Field e;
    public static boolean f;

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f441a;

        public a(k kVar) {
            this.f441a = kVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            w wVar = windowInsets == null ? null : new w(windowInsets);
            a.b.k.l lVar = (a.b.k.l) this.f441a;
            if (lVar == null) {
                throw null;
            }
            if (wVar != null) {
                int systemWindowInsetTop = Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) wVar.f457a).getSystemWindowInsetTop() : 0;
                int f = lVar.f33a.f(systemWindowInsetTop);
                if (systemWindowInsetTop != f) {
                    wVar = Build.VERSION.SDK_INT >= 20 ? new w(((WindowInsets) wVar.f457a).replaceSystemWindowInsets(Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) wVar.f457a).getSystemWindowInsetLeft() : 0, f, Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) wVar.f457a).getSystemWindowInsetRight() : 0, Build.VERSION.SDK_INT >= 20 ? ((WindowInsets) wVar.f457a).getSystemWindowInsetBottom() : 0)) : null;
                }
                w a2 = n.a(view, wVar);
                return (WindowInsets) (a2 != null ? a2.f457a : null);
            }
            throw null;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        d = null;
        f = false;
        new WeakHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r4, a.e.k.a r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L37
            boolean r1 = a.e.k.n.f
            if (r1 == 0) goto L8
            goto L2d
        L8:
            java.lang.reflect.Field r1 = a.e.k.n.e
            r2 = 1
            if (r1 != 0) goto L1e
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r3 = "mAccessibilityDelegate"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L1b
            a.e.k.n.e = r1     // Catch: java.lang.Throwable -> L1b
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1e
        L1b:
            a.e.k.n.f = r2
            goto L2d
        L1e:
            java.lang.reflect.Field r1 = a.e.k.n.e     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r1 instanceof android.view.View.AccessibilityDelegate     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L2d
            android.view.View$AccessibilityDelegate r1 = (android.view.View.AccessibilityDelegate) r1     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            a.e.k.n.f = r2
        L2d:
            r1 = r0
        L2e:
            boolean r1 = r1 instanceof a.e.k.a.C0017a
            if (r1 == 0) goto L37
            a.e.k.a r5 = new a.e.k.a
            r5.<init>()
        L37:
            if (r5 != 0) goto L3a
            goto L3c
        L3a:
            android.view.View$AccessibilityDelegate r0 = r5.f425b
        L3c:
            r4.setAccessibilityDelegate(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.k.n.a(android.view.View, a.e.k.a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ColorStateList b(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof m) {
            return ((m) view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f439b) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f438a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f439b = true;
        }
        Field field = f438a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static String e(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f440c;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    public static int f(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static boolean g(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean h(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean i(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean j(View view) {
        Boolean b2 = new o(a.e.b.tag_screen_reader_focusable, Boolean.class, 28).b(view);
        if (b2 == null) {
            return false;
        }
        return b2.booleanValue();
    }

    public static void k(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void l(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof e) {
            ((e) view).stopNestedScroll();
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f442a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<T> f443b;

        /* renamed from: c, reason: collision with root package name */
        public final int f444c;

        public b(int i, Class<T> cls, int i2) {
            this.f442a = i;
            this.f443b = cls;
            this.f444c = i2;
        }

        public abstract T a(View view);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.f444c) {
                return a(view);
            }
            if (!(Build.VERSION.SDK_INT >= 19)) {
                return null;
            }
            T t = (T) view.getTag(this.f442a);
            if (this.f443b.isInstance(t)) {
                return t;
            }
            return null;
        }

        public b(int i, Class<T> cls, int i2, int i3) {
            this.f442a = i;
            this.f443b = cls;
            this.f444c = i3;
        }
    }

    /* compiled from: ViewCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap<View, Boolean> f445a = null;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray<WeakReference<View>> f446b = null;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference<KeyEvent> f447c = null;

        public static d a(View view) {
            d dVar = (d) view.getTag(a.e.b.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(a.e.b.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.e.b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f445a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final void a() {
            WeakHashMap<View, Boolean> weakHashMap = this.f445a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (d.isEmpty()) {
                return;
            }
            synchronized (d) {
                if (this.f445a == null) {
                    this.f445a = new WeakHashMap<>();
                }
                for (int size = d.size() - 1; size >= 0; size--) {
                    View view = d.get(size).get();
                    if (view == null) {
                        d.remove(size);
                    } else {
                        this.f445a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f445a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        WeakReference<KeyEvent> weakReference = a2.f447c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.f447c = new WeakReference<>(keyEvent);
        WeakReference<View> weakReference2 = null;
        if (a2.f446b == null) {
            a2.f446b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = a2.f446b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = weakReference2.get();
        if (view2 != null && h(view2)) {
            a2.b(view2, keyEvent);
        }
        return true;
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    public static s a(View view) {
        if (d == null) {
            d = new WeakHashMap<>();
        }
        s sVar = d.get(view);
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(view);
        d.put(view, sVar2);
        return sVar2;
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f440c == null) {
            f440c = new WeakHashMap<>();
        }
        f440c.put(view, str);
    }

    public static void a(View view, k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (kVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(kVar));
            }
        }
    }

    public static w a(View view, w wVar) {
        if (Build.VERSION.SDK_INT < 21) {
            return wVar;
        }
        WindowInsets windowInsets = (WindowInsets) (wVar == null ? null : wVar.f457a);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        if (windowInsets == null) {
            return null;
        }
        return new w(windowInsets);
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof m) {
            ((m) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background == null || !z) {
                    return;
                }
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
                return;
            }
            return;
        }
        if (view instanceof m) {
            ((m) view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (a2 != null) {
            if (keyEvent.getAction() == 0) {
                a2.a();
            }
            View a3 = a2.a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (a2.f446b == null) {
                        a2.f446b = new SparseArray<>();
                    }
                    a2.f446b.put(keyCode, new WeakReference<>(a3));
                }
            }
            return a3 != null;
        }
        throw null;
    }
}
