package a.b.k;

import a.b.k.t;
import a.b.o.a;
import a.b.o.i.g;
import a.b.o.i.m;
import a.b.p.c0;
import a.b.p.d1;
import a.b.p.g0;
import a.b.p.x0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.Thread;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

/* compiled from: AppCompatDelegateImpl.java */
/* loaded from: classes.dex */
public class k extends a.b.k.j implements g.a, LayoutInflater.Factory2 {
    public static final Map<Class<?>, Integer> a0 = new a.d.a();
    public static final boolean b0;
    public static final int[] c0;
    public static boolean d0;
    public static final boolean e0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public j[] G;
    public j H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public boolean Q;
    public g R;
    public g S;
    public boolean T;
    public int U;
    public boolean W;
    public Rect X;
    public Rect Y;
    public AppCompatViewInflater Z;
    public final Object d;
    public final Context e;
    public Window f;
    public e g;
    public final a.b.k.i h;
    public a.b.k.a i;
    public MenuInflater j;
    public CharSequence k;
    public c0 l;
    public c m;
    public C0001k n;
    public a.b.o.a o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public boolean u;
    public ViewGroup v;
    public TextView w;
    public View x;
    public boolean y;
    public boolean z;
    public a.e.k.s s = null;
    public boolean t = true;
    public final Runnable V = new b();

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f17a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f17a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            String message;
            boolean z = false;
            if ((th instanceof Resources.NotFoundException) && (message = th.getMessage()) != null && (message.contains("drawable") || message.contains("Drawable"))) {
                z = true;
            }
            if (z) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f17a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f17a.uncaughtException(thread, th);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            if ((kVar.U & 1) != 0) {
                kVar.c(0);
            }
            k kVar2 = k.this;
            if ((kVar2.U & 4096) != 0) {
                kVar2.c(108);
            }
            k kVar3 = k.this;
            kVar3.T = false;
            kVar3.U = 0;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class d implements a.InterfaceC0005a {

        /* renamed from: a, reason: collision with root package name */
        public a.InterfaceC0005a f20a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends a.e.k.u {
            public a() {
            }

            @Override // a.e.k.t
            public void a(View view) {
                k.this.p.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.p.getParent() instanceof View) {
                    a.e.k.n.l((View) k.this.p.getParent());
                }
                k.this.p.removeAllViews();
                k.this.s.a((a.e.k.t) null);
                k.this.s = null;
            }
        }

        public d(a.InterfaceC0005a interfaceC0005a) {
            this.f20a = interfaceC0005a;
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean a(a.b.o.a aVar, Menu menu) {
            return this.f20a.a(aVar, menu);
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean b(a.b.o.a aVar, Menu menu) {
            return this.f20a.b(aVar, menu);
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean a(a.b.o.a aVar, MenuItem menuItem) {
            return this.f20a.a(aVar, menuItem);
        }

        @Override // a.b.o.a.InterfaceC0005a
        public void a(a.b.o.a aVar) {
            this.f20a.a(aVar);
            k kVar = k.this;
            if (kVar.q != null) {
                kVar.f.getDecorView().removeCallbacks(k.this.r);
            }
            k kVar2 = k.this;
            if (kVar2.p != null) {
                kVar2.e();
                k kVar3 = k.this;
                a.e.k.s a2 = a.e.k.n.a(kVar3.p);
                a2.a(0.0f);
                kVar3.s = a2;
                k.this.s.a(new a());
            }
            k kVar4 = k.this;
            a.b.k.i iVar = kVar4.h;
            if (iVar != null) {
                iVar.b(kVar4.o);
            }
            k.this.o = null;
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class f extends g {

        /* renamed from: c, reason: collision with root package name */
        public final PowerManager f24c;

        public f(Context context) {
            super();
            this.f24c = (PowerManager) context.getSystemService("power");
        }

        @Override // a.b.k.k.g
        public IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // a.b.k.k.g
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !this.f24c.isPowerSaveMode()) ? 1 : 2;
        }

        @Override // a.b.k.k.g
        public void d() {
            k.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f25a;

        /* compiled from: AppCompatDelegateImpl.java */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                g.this.d();
            }
        }

        public g() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f25a;
            if (broadcastReceiver != null) {
                try {
                    k.this.e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f25a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 == null || b2.countActions() == 0) {
                return;
            }
            if (this.f25a == null) {
                this.f25a = new a();
            }
            k.this.e.registerReceiver(this.f25a, b2);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class h extends g {

        /* renamed from: c, reason: collision with root package name */
        public final t f28c;

        public h(t tVar) {
            super();
            this.f28c = tVar;
        }

        @Override // a.b.k.k.g
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // a.b.k.k.g
        public int c() {
            boolean z;
            long j;
            t tVar = this.f28c;
            t.a aVar = tVar.f50c;
            if (aVar.f52b > System.currentTimeMillis()) {
                z = aVar.f51a;
            } else {
                Location a2 = r.a(tVar.f48a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? tVar.a("network") : null;
                Location a3 = r.a(tVar.f48a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? tVar.a("gps") : null;
                if (a3 == null || a2 == null ? a3 != null : a3.getTime() > a2.getTime()) {
                    a2 = a3;
                }
                if (a2 != null) {
                    t.a aVar2 = tVar.f50c;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (s.d == null) {
                        s.d = new s();
                    }
                    s sVar = s.d;
                    sVar.a(currentTimeMillis - 86400000, a2.getLatitude(), a2.getLongitude());
                    sVar.a(currentTimeMillis, a2.getLatitude(), a2.getLongitude());
                    boolean z2 = sVar.f47c == 1;
                    long j2 = sVar.f46b;
                    long j3 = sVar.f45a;
                    sVar.a(currentTimeMillis + 86400000, a2.getLatitude(), a2.getLongitude());
                    long j4 = sVar.f46b;
                    if (j2 == -1 || j3 == -1) {
                        j = 43200000 + currentTimeMillis;
                    } else {
                        j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
                    }
                    aVar2.f51a = z2;
                    aVar2.f52b = j;
                    z = aVar.f51a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // a.b.k.k.g
        public void d() {
            k.this.d();
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class i extends ContentFrameLayout {
        public i(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    k kVar = k.this;
                    kVar.a(kVar.d(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.b.l.a.a.c(getContext(), i));
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public static final class j {

        /* renamed from: a, reason: collision with root package name */
        public int f29a;

        /* renamed from: b, reason: collision with root package name */
        public int f30b;

        /* renamed from: c, reason: collision with root package name */
        public int f31c;
        public int d;
        public int e;
        public int f;
        public ViewGroup g;
        public View h;
        public View i;
        public a.b.o.i.g j;
        public a.b.o.i.e k;
        public Context l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        public boolean q = false;
        public boolean r;
        public Bundle s;

        public j(int i) {
            this.f29a = i;
        }

        public void a(a.b.o.i.g gVar) {
            a.b.o.i.e eVar;
            a.b.o.i.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.a(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.a(eVar, gVar.f128a);
        }
    }

    static {
        boolean z = false;
        b0 = Build.VERSION.SDK_INT < 21;
        c0 = new int[]{R.attr.windowBackground};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21 && i2 <= 25) {
            z = true;
        }
        e0 = z;
        if (!b0 || d0) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        d0 = true;
    }

    public k(Context context, Window window, a.b.k.i iVar, Object obj) {
        Integer num;
        a.b.k.h hVar = null;
        this.N = -100;
        this.e = context;
        this.h = iVar;
        this.d = obj;
        if (this.N == -100 && (obj instanceof Dialog)) {
            while (true) {
                if (context != null) {
                    if (context instanceof a.b.k.h) {
                        hVar = (a.b.k.h) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (hVar != null) {
                this.N = ((k) hVar.g()).N;
            }
        }
        if (this.N == -100 && (num = a0.get(this.d.getClass())) != null) {
            this.N = num.intValue();
            a0.remove(this.d.getClass());
        }
        if (window != null) {
            a(window);
        }
        a.b.p.j.b();
    }

    @Override // a.b.k.j
    public void a(Bundle bundle) {
        this.J = true;
        a(false);
        g();
        Object obj = this.d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = r.b(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a.b.k.a aVar = this.i;
                if (aVar == null) {
                    this.W = true;
                } else {
                    aVar.b(true);
                }
            }
        }
        this.K = true;
    }

    @Override // a.b.k.j
    public void b() {
        j();
        a.b.k.a aVar = this.i;
        e(0);
    }

    @Override // a.b.k.j
    public void c() {
        this.L = false;
        a.b.k.j.b(this);
        j();
        a.b.k.a aVar = this.i;
        if (aVar != null) {
            aVar.d(false);
        }
        if (this.d instanceof Dialog) {
            g gVar = this.R;
            if (gVar != null) {
                gVar.a();
            }
            g gVar2 = this.S;
            if (gVar2 != null) {
                gVar2.a();
            }
        }
    }

    public j d(int i2) {
        j[] jVarArr = this.G;
        if (jVarArr == null || jVarArr.length <= i2) {
            j[] jVarArr2 = new j[i2 + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.G = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i2];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(i2);
        jVarArr[i2] = jVar2;
        return jVar2;
    }

    public void e() {
        a.e.k.s sVar = this.s;
        if (sVar != null) {
            sVar.a();
        }
    }

    public final void f() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (this.u) {
            return;
        }
        TypedArray obtainStyledAttributes = this.e.obtainStyledAttributes(a.b.j.AppCompatTheme);
        if (obtainStyledAttributes.hasValue(a.b.j.AppCompatTheme_windowActionBar)) {
            if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowNoTitle, false)) {
                a(1);
            } else if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBar, false)) {
                a(108);
            }
            if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionBarOverlay, false)) {
                a(109);
            }
            if (obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_windowActionModeOverlay, false)) {
                a(10);
            }
            this.D = obtainStyledAttributes.getBoolean(a.b.j.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            g();
            this.f.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.e);
            if (!this.E) {
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(a.b.g.abc_dialog_title_material, (ViewGroup) null);
                    this.B = false;
                    this.A = false;
                } else if (this.A) {
                    TypedValue typedValue = new TypedValue();
                    this.e.getTheme().resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new a.b.o.c(this.e, typedValue.resourceId);
                    } else {
                        context = this.e;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(a.b.g.abc_screen_toolbar, (ViewGroup) null);
                    c0 c0Var = (c0) viewGroup.findViewById(a.b.f.decor_content_parent);
                    this.l = c0Var;
                    c0Var.setWindowCallback(i());
                    if (this.B) {
                        this.l.a(109);
                    }
                    if (this.y) {
                        this.l.a(2);
                    }
                    if (this.z) {
                        this.l.a(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                if (this.C) {
                    viewGroup = (ViewGroup) from.inflate(a.b.g.abc_screen_simple_overlay_action_mode, (ViewGroup) null);
                } else {
                    viewGroup = (ViewGroup) from.inflate(a.b.g.abc_screen_simple, (ViewGroup) null);
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    a.e.k.n.a(viewGroup, new l(this));
                } else {
                    ((g0) viewGroup).setOnFitSystemWindowsListener(new m(this));
                }
            }
            if (viewGroup != null) {
                if (this.l == null) {
                    this.w = (TextView) viewGroup.findViewById(a.b.f.title);
                }
                d1.b(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.b.f.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f.findViewById(R.id.content);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(R.id.content);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new n(this));
                this.v = viewGroup;
                Object obj = this.d;
                if (obj instanceof Activity) {
                    charSequence = ((Activity) obj).getTitle();
                } else {
                    charSequence = this.k;
                }
                if (!TextUtils.isEmpty(charSequence)) {
                    c0 c0Var2 = this.l;
                    if (c0Var2 != null) {
                        c0Var2.setWindowTitle(charSequence);
                    } else {
                        a.b.k.a aVar = this.i;
                        if (aVar != null) {
                            aVar.a(charSequence);
                        } else {
                            TextView textView = this.w;
                            if (textView != null) {
                                textView.setText(charSequence);
                            }
                        }
                    }
                }
                ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.v.findViewById(R.id.content);
                View decorView = this.f.getDecorView();
                contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                if (a.e.k.n.i(contentFrameLayout2)) {
                    contentFrameLayout2.requestLayout();
                }
                TypedArray obtainStyledAttributes2 = this.e.obtainStyledAttributes(a.b.j.AppCompatTheme);
                obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
                obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
                if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMajor)) {
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMajor, contentFrameLayout2.getFixedWidthMajor());
                }
                if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedWidthMinor)) {
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedWidthMinor, contentFrameLayout2.getFixedWidthMinor());
                }
                if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMajor)) {
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMajor, contentFrameLayout2.getFixedHeightMajor());
                }
                if (obtainStyledAttributes2.hasValue(a.b.j.AppCompatTheme_windowFixedHeightMinor)) {
                    obtainStyledAttributes2.getValue(a.b.j.AppCompatTheme_windowFixedHeightMinor, contentFrameLayout2.getFixedHeightMinor());
                }
                obtainStyledAttributes2.recycle();
                contentFrameLayout2.requestLayout();
                this.u = true;
                j d2 = d(0);
                if (this.M) {
                    return;
                }
                if (d2 == null || d2.j == null) {
                    e(108);
                    return;
                }
                return;
            }
            StringBuilder a2 = b.a.a.a.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
            a2.append(this.A);
            a2.append(", windowActionBarOverlay: ");
            a2.append(this.B);
            a2.append(", android:windowIsFloating: ");
            a2.append(this.D);
            a2.append(", windowActionModeOverlay: ");
            a2.append(this.C);
            a2.append(", windowNoTitle: ");
            a2.append(this.E);
            a2.append(" }");
            throw new IllegalArgumentException(a2.toString());
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public final void g() {
        if (this.f == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                a(((Activity) obj).getWindow());
            }
        }
        if (this.f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final g h() {
        if (this.R == null) {
            Context context = this.e;
            if (t.d == null) {
                Context applicationContext = context.getApplicationContext();
                t.d = new t(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.R = new h(t.d);
        }
        return this.R;
    }

    public final Window.Callback i() {
        return this.f.getCallback();
    }

    public final void j() {
        f();
        if (this.A && this.i == null) {
            Object obj = this.d;
            if (obj instanceof Activity) {
                this.i = new u((Activity) this.d, this.B);
            } else if (obj instanceof Dialog) {
                this.i = new u((Dialog) this.d);
            }
            a.b.k.a aVar = this.i;
            if (aVar != null) {
                aVar.b(this.W);
            }
        }
    }

    public final boolean k() {
        ViewGroup viewGroup;
        return this.u && (viewGroup = this.v) != null && a.e.k.n.i(viewGroup);
    }

    public final void l() {
        if (this.u) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        if (((org.xmlpull.v1.XmlPullParser) r12).getDepth() > 1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public final class c implements m.a {
        public c() {
        }

        @Override // a.b.o.i.m.a
        public boolean a(a.b.o.i.g gVar) {
            Window.Callback i = k.this.i();
            if (i == null) {
                return true;
            }
            i.onMenuOpened(108, gVar);
            return true;
        }

        @Override // a.b.o.i.m.a
        public void a(a.b.o.i.g gVar, boolean z) {
            k.this.b(gVar);
        }
    }

    public final void e(int i2) {
        this.U = (1 << i2) | this.U;
        if (this.T) {
            return;
        }
        a.e.k.n.a(this.f.getDecorView(), this.V);
        this.T = true;
    }

    @Override // a.b.k.j
    public void b(int i2) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.e).inflate(i2, viewGroup);
        this.g.f104b.onContentChanged();
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* loaded from: classes.dex */
    public class e extends a.b.o.h {
        public e(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                Method dump skipped, instructions count: 433
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.e.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        @Override // android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.a(keyEvent) || this.f104b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        
            if (r6 != false) goto L8;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
        @Override // android.view.Window.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r6) {
            /*
                r5 = this;
                android.view.Window$Callback r0 = r5.f104b
                boolean r0 = r0.dispatchKeyShortcutEvent(r6)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L4f
                a.b.k.k r0 = a.b.k.k.this
                int r3 = r6.getKeyCode()
                r0.j()
                a.b.k.a r4 = r0.i
                if (r4 == 0) goto L1f
                boolean r3 = r4.a(r3, r6)
                if (r3 == 0) goto L1f
            L1d:
                r6 = 1
                goto L4d
            L1f:
                a.b.k.k$j r3 = r0.H
                if (r3 == 0) goto L34
                int r4 = r6.getKeyCode()
                boolean r3 = r0.a(r3, r4, r6, r2)
                if (r3 == 0) goto L34
                a.b.k.k$j r6 = r0.H
                if (r6 == 0) goto L1d
                r6.n = r2
                goto L1d
            L34:
                a.b.k.k$j r3 = r0.H
                if (r3 != 0) goto L4c
                a.b.k.k$j r3 = r0.d(r1)
                r0.b(r3, r6)
                int r4 = r6.getKeyCode()
                boolean r6 = r0.a(r3, r4, r6, r2)
                r3.m = r1
                if (r6 == 0) goto L4c
                goto L1d
            L4c:
                r6 = 0
            L4d:
                if (r6 == 0) goto L50
            L4f:
                r1 = 1
            L50:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.e.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof a.b.o.i.g)) {
                return this.f104b.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f104b.onMenuOpened(i, menu);
            k kVar = k.this;
            if (kVar == null) {
                throw null;
            }
            if (i == 108) {
                kVar.j();
                a.b.k.a aVar = kVar.i;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f104b.onPanelClosed(i, menu);
            k kVar = k.this;
            if (kVar == null) {
                throw null;
            }
            if (i == 108) {
                kVar.j();
                a.b.k.a aVar = kVar.i;
                if (aVar != null) {
                    aVar.a(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                j d = kVar.d(i);
                if (d.o) {
                    kVar.a(d, false);
                }
            }
        }

        @Override // android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            a.b.o.i.g gVar = menu instanceof a.b.o.i.g ? (a.b.o.i.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.y = true;
            }
            boolean onPreparePanel = this.f104b.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.y = false;
            }
            return onPreparePanel;
        }

        @Override // android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            a.b.o.i.g gVar;
            j d = k.this.d(0);
            if (d != null && (gVar = d.j) != null) {
                this.f104b.onProvideKeyboardShortcuts(list, gVar, i);
            } else {
                this.f104b.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            if (k.this.t) {
                return a(callback);
            }
            return this.f104b.onWindowStartingActionMode(callback);
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (k.this.t && i == 0) {
                return a(callback);
            }
            return this.f104b.onWindowStartingActionMode(callback, i);
        }
    }

    /* compiled from: AppCompatDelegateImpl.java */
    /* renamed from: a.b.k.k$k, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0001k implements m.a {
        public C0001k() {
        }

        @Override // a.b.o.i.m.a
        public void a(a.b.o.i.g gVar, boolean z) {
            a.b.o.i.g c2 = gVar.c();
            boolean z2 = c2 != gVar;
            k kVar = k.this;
            if (z2) {
                gVar = c2;
            }
            j a2 = kVar.a((Menu) gVar);
            if (a2 != null) {
                if (z2) {
                    k.this.a(a2.f29a, a2, c2);
                    k.this.a(a2, true);
                } else {
                    k.this.a(a2, z);
                }
            }
        }

        @Override // a.b.o.i.m.a
        public boolean a(a.b.o.i.g gVar) {
            Window.Callback i;
            if (gVar != null) {
                return true;
            }
            k kVar = k.this;
            if (!kVar.A || (i = kVar.i()) == null || k.this.M) {
                return true;
            }
            i.onMenuOpened(108, gVar);
            return true;
        }
    }

    public boolean d() {
        return a(true);
    }

    @Override // a.b.k.j
    public void b(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.f104b.onContentChanged();
    }

    public void c(int i2) {
        j d2;
        j d3 = d(i2);
        if (d3.j != null) {
            Bundle bundle = new Bundle();
            d3.j.b(bundle);
            if (bundle.size() > 0) {
                d3.s = bundle;
            }
            d3.j.j();
            d3.j.clear();
        }
        d3.r = true;
        d3.q = true;
        if ((i2 != 108 && i2 != 0) || this.l == null || (d2 = d(0)) == null) {
            return;
        }
        d2.m = false;
        b(d2, (KeyEvent) null);
    }

    @Override // a.b.k.j
    public void a(View view) {
        f();
        ViewGroup viewGroup = (ViewGroup) this.v.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.f104b.onContentChanged();
    }

    public final boolean b(j jVar, KeyEvent keyEvent) {
        c0 c0Var;
        Resources.Theme theme;
        c0 c0Var2;
        c0 c0Var3;
        if (this.M) {
            return false;
        }
        if (jVar.m) {
            return true;
        }
        j jVar2 = this.H;
        if (jVar2 != null && jVar2 != jVar) {
            a(jVar2, false);
        }
        Window.Callback i2 = i();
        if (i2 != null) {
            jVar.i = i2.onCreatePanelView(jVar.f29a);
        }
        int i3 = jVar.f29a;
        boolean z = i3 == 0 || i3 == 108;
        if (z && (c0Var3 = this.l) != null) {
            c0Var3.c();
        }
        if (jVar.i == null) {
            if (jVar.j == null || jVar.r) {
                if (jVar.j == null) {
                    Context context = this.e;
                    int i4 = jVar.f29a;
                    if ((i4 == 0 || i4 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(a.b.a.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(a.b.a.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            a.b.o.c cVar = new a.b.o.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    a.b.o.i.g gVar = new a.b.o.i.g(context);
                    gVar.e = this;
                    jVar.a(gVar);
                    if (jVar.j == null) {
                        return false;
                    }
                }
                if (z && this.l != null) {
                    if (this.m == null) {
                        this.m = new c();
                    }
                    this.l.a(jVar.j, this.m);
                }
                jVar.j.j();
                if (!i2.onCreatePanelMenu(jVar.f29a, jVar.j)) {
                    jVar.a(null);
                    if (z && (c0Var = this.l) != null) {
                        c0Var.a(null, this.m);
                    }
                    return false;
                }
                jVar.r = false;
            }
            jVar.j.j();
            Bundle bundle = jVar.s;
            if (bundle != null) {
                jVar.j.a(bundle);
                jVar.s = null;
            }
            if (!i2.onPreparePanel(0, jVar.i, jVar.j)) {
                if (z && (c0Var2 = this.l) != null) {
                    c0Var2.a(null, this.m);
                }
                jVar.j.i();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            jVar.p = z2;
            jVar.j.setQwertyMode(z2);
            jVar.j.i();
        }
        jVar.m = true;
        jVar.n = false;
        this.H = jVar;
        return true;
    }

    @Override // a.b.k.j
    public void a(View view, ViewGroup.LayoutParams layoutParams) {
        f();
        ((ViewGroup) this.v.findViewById(R.id.content)).addView(view, layoutParams);
        this.g.f104b.onContentChanged();
    }

    public final void a(Window window) {
        if (this.f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof e)) {
                e eVar = new e(callback);
                this.g = eVar;
                window.setCallback(eVar);
                x0 a2 = x0.a(this.e, (AttributeSet) null, c0);
                Drawable c2 = a2.c(0);
                if (c2 != null) {
                    window.setBackgroundDrawable(c2);
                }
                a2.f275b.recycle();
                this.f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    @Override // a.b.k.j
    public final void a(CharSequence charSequence) {
        this.k = charSequence;
        c0 c0Var = this.l;
        if (c0Var != null) {
            c0Var.setWindowTitle(charSequence);
            return;
        }
        a.b.k.a aVar = this.i;
        if (aVar != null) {
            aVar.a(charSequence);
            return;
        }
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // a.b.o.i.g.a
    public boolean a(a.b.o.i.g gVar, MenuItem menuItem) {
        j a2;
        Window.Callback i2 = i();
        if (i2 == null || this.M || (a2 = a((Menu) gVar.c())) == null) {
            return false;
        }
        return i2.onMenuItemSelected(a2.f29a, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.a(android.view.KeyEvent):boolean");
    }

    public void b(a.b.o.i.g gVar) {
        if (this.F) {
            return;
        }
        this.F = true;
        this.l.g();
        Window.Callback i2 = i();
        if (i2 != null && !this.M) {
            i2.onPanelClosed(108, gVar);
        }
        this.F = false;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // a.b.k.j
    public void a() {
        LayoutInflater from = LayoutInflater.from(this.e);
        if (from.getFactory() == null) {
            r.b(from, this);
        } else {
            if (from.getFactory2() instanceof k) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x015c, code lost:
    
        if (r4 != null) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(a.b.k.k.j r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.a(a.b.k.k$j, android.view.KeyEvent):void");
    }

    public int f(int i2) {
        boolean z;
        boolean z2;
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.X == null) {
                    this.X = new Rect();
                    this.Y = new Rect();
                }
                Rect rect = this.X;
                Rect rect2 = this.Y;
                rect.set(0, i2, 0, 0);
                d1.a(this.v, rect, rect2);
                if (marginLayoutParams.topMargin != (rect2.top == 0 ? i2 : 0)) {
                    marginLayoutParams.topMargin = i2;
                    View view = this.x;
                    if (view == null) {
                        View view2 = new View(this.e);
                        this.x = view2;
                        view2.setBackgroundColor(this.e.getResources().getColor(a.b.c.abc_input_method_navigation_guard));
                        this.v.addView(this.x, -1, new ViewGroup.LayoutParams(-1, i2));
                    } else {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams.height != i2) {
                            layoutParams.height = i2;
                            this.x.setLayoutParams(layoutParams);
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                r3 = this.x != null;
                if (!this.C && r3) {
                    i2 = 0;
                }
                boolean z3 = r3;
                r3 = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                r3 = false;
            }
            if (r3) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view3 = this.x;
        if (view3 != null) {
            view3.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    @Override // a.b.o.i.g.a
    public void a(a.b.o.i.g gVar) {
        c0 c0Var = this.l;
        if (c0Var != null && c0Var.e() && (!ViewConfiguration.get(this.e).hasPermanentMenuKey() || this.l.b())) {
            Window.Callback i2 = i();
            if (this.l.d()) {
                this.l.f();
                if (this.M) {
                    return;
                }
                i2.onPanelClosed(108, d(0).j);
                return;
            }
            if (i2 == null || this.M) {
                return;
            }
            if (this.T && (1 & this.U) != 0) {
                this.f.getDecorView().removeCallbacks(this.V);
                this.V.run();
            }
            j d2 = d(0);
            a.b.o.i.g gVar2 = d2.j;
            if (gVar2 == null || d2.r || !i2.onPreparePanel(0, d2.i, gVar2)) {
                return;
            }
            i2.onMenuOpened(108, d2.j);
            this.l.a();
            return;
        }
        j d3 = d(0);
        d3.q = true;
        a(d3, false);
        a(d3, (KeyEvent) null);
    }

    public void a(j jVar, boolean z) {
        ViewGroup viewGroup;
        c0 c0Var;
        if (z && jVar.f29a == 0 && (c0Var = this.l) != null && c0Var.d()) {
            b(jVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager != null && jVar.o && (viewGroup = jVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                a(jVar.f29a, jVar, null);
            }
        }
        jVar.m = false;
        jVar.n = false;
        jVar.o = false;
        jVar.h = null;
        jVar.q = true;
        if (this.H == jVar) {
            this.H = null;
        }
    }

    public void a(int i2, j jVar, Menu menu) {
        if (menu == null) {
            if (jVar == null && i2 >= 0) {
                j[] jVarArr = this.G;
                if (i2 < jVarArr.length) {
                    jVar = jVarArr[i2];
                }
            }
            if (jVar != null) {
                menu = jVar.j;
            }
        }
        if ((jVar == null || jVar.o) && !this.M) {
            this.g.f104b.onPanelClosed(i2, menu);
        }
    }

    public j a(Menu menu) {
        j[] jVarArr = this.G;
        int length = jVarArr != null ? jVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            j jVar = jVarArr[i2];
            if (jVar != null && jVar.j == menu) {
                return jVar;
            }
        }
        return null;
    }

    public final boolean a(j jVar, int i2, KeyEvent keyEvent, int i3) {
        a.b.o.i.g gVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.m || b(jVar, keyEvent)) && (gVar = jVar.j) != null) {
            z = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (z && (i3 & 1) == 0 && this.l == null) {
            a(jVar, true);
        }
        return z;
    }

    @Override // a.b.k.j
    public boolean a(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.E && i2 == 108) {
            return false;
        }
        if (this.A && i2 == 1) {
            this.A = false;
        }
        if (i2 == 1) {
            l();
            this.E = true;
            return true;
        }
        if (i2 == 2) {
            l();
            this.y = true;
            return true;
        }
        if (i2 == 5) {
            l();
            this.z = true;
            return true;
        }
        if (i2 == 10) {
            l();
            this.C = true;
            return true;
        }
        if (i2 == 108) {
            l();
            this.A = true;
            return true;
        }
        if (i2 != 109) {
            return this.f.requestFeature(i2);
        }
        l();
        this.B = true;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:5|(1:7)|8|(2:(1:(1:(1:(3:15|(1:17)|18)(2:19|20)))(2:21|(1:25)))|26)|27|(1:(1:30)(1:200))(1:201)|31|(2:35|(11:37|38|(4:181|182|183|184)|41|(2:52|(1:54))|55|(1:173)(5:58|(2:62|(4:64|(3:92|93|94)|66|(3:68|69|(6:71|(3:83|84|85)|73|(3:78|79|(1:77))|75|(0))))(2:98|(6:100|(3:112|113|114)|102|(3:107|108|(1:106))|104|(0))(2:118|(4:120|(3:131|132|133)|122|(3:124|125|(1:127))))))|137|(2:139|(1:141))|(2:143|(2:145|(2:147|(1:149))(2:150|(1:152)))))|(2:154|(1:158))|(1:160)(2:170|(1:172))|(3:162|(1:164)|165)(2:167|(1:169))|166)(4:188|189|(1:196)(1:193)|194))|199|38|(0)|175|177|179|181|182|183|184|41|(4:46|48|52|(0))|55|(0)|173|(0)|(0)(0)|(0)(0)|166) */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x00e7, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x00e8, code lost:
    
        android.util.Log.e("AppCompatDelegate", "updateForNightMode. Calling applyOverrideConfiguration() failed with an exception. Will fall back to using Resources.updateConfiguration()", r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(boolean r14) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.k.a(boolean):boolean");
    }
}
