package a.b.p;

import a.b.p.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class n0 {
    public static n0 i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, a.d.i<ColorStateList>> f225a;

    /* renamed from: b, reason: collision with root package name */
    public a.d.a<String, d> f226b;

    /* renamed from: c, reason: collision with root package name */
    public a.d.i<String> f227c;
    public final WeakHashMap<Context, a.d.e<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    public TypedValue e;
    public boolean f;
    public e g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final c j = new c(6);

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements d {
        @Override // a.b.p.n0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.b.m.a.a.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements d {
        @Override // a.b.p.n0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                a.m.a.a.c cVar = new a.m.a.a.c(context, null, null);
                cVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return cVar;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends a.d.f<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class f implements d {
        @Override // a.b.p.n0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return a.m.a.a.h.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    public static synchronized n0 a() {
        n0 n0Var;
        synchronized (n0.class) {
            if (i == null) {
                n0 n0Var2 = new n0();
                i = n0Var2;
                if (Build.VERSION.SDK_INT < 24) {
                    n0Var2.a("vector", new f());
                    n0Var2.a("animated-vector", new b());
                    n0Var2.a("animated-selector", new a());
                }
            }
            n0Var = i;
        }
        return n0Var;
    }

    public synchronized Drawable b(Context context, int i2) {
        return a(context, i2, false);
    }

    public synchronized ColorStateList c(Context context, int i2) {
        ColorStateList b2;
        a.d.i<ColorStateList> iVar;
        WeakHashMap<Context, a.d.i<ColorStateList>> weakHashMap = this.f225a;
        ColorStateList colorStateList = null;
        b2 = (weakHashMap == null || (iVar = weakHashMap.get(context)) == null) ? null : iVar.b(i2, null);
        if (b2 == null) {
            if (this.g != null) {
                colorStateList = ((j.a) this.g).b(context, i2);
            }
            if (colorStateList != null) {
                if (this.f225a == null) {
                    this.f225a = new WeakHashMap<>();
                }
                a.d.i<ColorStateList> iVar2 = this.f225a.get(context);
                if (iVar2 == null) {
                    iVar2 = new a.d.i<>(10);
                    this.f225a.put(context, iVar2);
                }
                iVar2.a(i2, colorStateList);
            }
            b2 = colorStateList;
        }
        return b2;
    }

    public final Drawable d(Context context, int i2) {
        int next;
        a.d.a<String, d> aVar = this.f226b;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        a.d.i<String> iVar = this.f227c;
        if (iVar != null) {
            String b2 = iVar.b(i2, null);
            if ("appcompat_skip_skip".equals(b2) || (b2 != null && this.f226b.getOrDefault(b2, null) == null)) {
                return null;
            }
        } else {
            this.f227c = new a.d.i<>(10);
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable a2 = a(context, j2);
        if (a2 != null) {
            return a2;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f227c.a(i2, name);
                    d dVar = this.f226b.get(name);
                    if (dVar != null) {
                        a2 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a2 != null) {
                        a2.setChangingConfigurations(typedValue.changingConfigurations);
                        a(context, j2, a2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (a2 == null) {
            this.f227c.a(i2, "appcompat_skip_skip");
        }
        return a2;
    }

    public synchronized void a(e eVar) {
        this.g = eVar;
    }

    public synchronized void a(Context context) {
        a.d.e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
        if (eVar != null) {
            int i2 = eVar.e;
            Object[] objArr = eVar.d;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            eVar.e = 0;
            eVar.f314b = false;
        }
    }

    public final Drawable a(Context context, int i2) {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable a2 = a(context, j2);
        if (a2 != null) {
            return a2;
        }
        e eVar = this.g;
        LayerDrawable layerDrawable = null;
        if (eVar != null) {
            if (i2 == a.b.e.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{b(context, a.b.e.abc_cab_background_internal_bg), b(context, a.b.e.abc_cab_background_top_mtrl_alpha)});
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            a(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList c2 = c(context, i2);
        PorterDuff.Mode mode = null;
        if (c2 != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable c3 = a.b.k.r.c(drawable);
            a.b.k.r.a(c3, c2);
            e eVar = this.g;
            if (eVar != null) {
                if (i2 == a.b.e.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return c3;
            }
            a.b.k.r.a(c3, mode);
            return c3;
        }
        e eVar2 = this.g;
        if (eVar2 != null) {
            j.a aVar = (j.a) eVar2;
            if (aVar != null) {
                boolean z2 = true;
                if (i2 == a.b.e.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    aVar.a(layerDrawable.findDrawableByLayerId(R.id.background), s0.b(context, a.b.a.colorControlNormal), j.f202b);
                    aVar.a(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), s0.b(context, a.b.a.colorControlNormal), j.f202b);
                    aVar.a(layerDrawable.findDrawableByLayerId(R.id.progress), s0.b(context, a.b.a.colorControlActivated), j.f202b);
                } else if (i2 == a.b.e.abc_ratingbar_material || i2 == a.b.e.abc_ratingbar_indicator_material || i2 == a.b.e.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    aVar.a(layerDrawable2.findDrawableByLayerId(R.id.background), s0.a(context, a.b.a.colorControlNormal), j.f202b);
                    aVar.a(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), s0.b(context, a.b.a.colorControlActivated), j.f202b);
                    aVar.a(layerDrawable2.findDrawableByLayerId(R.id.progress), s0.b(context, a.b.a.colorControlActivated), j.f202b);
                } else {
                    z2 = false;
                }
                if (z2) {
                    return drawable;
                }
            } else {
                throw null;
            }
        }
        if (a(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    public final synchronized Drawable a(Context context, long j2) {
        a.d.e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> b2 = eVar.b(j2, null);
        if (b2 != null) {
            Drawable.ConstantState constantState = b2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int a2 = a.d.d.a(eVar.f315c, eVar.e, j2);
            if (a2 >= 0) {
                Object[] objArr = eVar.d;
                Object obj = objArr[a2];
                Object obj2 = a.d.e.f;
                if (obj != obj2) {
                    objArr[a2] = obj2;
                    eVar.f314b = true;
                }
            }
        }
        return null;
    }

    public final synchronized boolean a(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        a.d.e<WeakReference<Drawable.ConstantState>> eVar = this.d.get(context);
        if (eVar == null) {
            eVar = new a.d.e<>();
            this.d.put(context, eVar);
        }
        eVar.c(j2, new WeakReference<>(constantState));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            a.b.p.n0$e r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L6f
            a.b.p.j$a r0 = (a.b.p.j.a) r0
            if (r0 == 0) goto L6d
            android.graphics.PorterDuff$Mode r3 = a.b.p.j.f202b
            int[] r4 = r0.f205a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1b
            int r5 = a.b.a.colorControlNormal
            goto L44
        L1b:
            int[] r4 = r0.f207c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L26
            int r5 = a.b.a.colorControlActivated
            goto L44
        L26:
            int[] r4 = r0.d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L31
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L44
        L31:
            int r0 = a.b.e.abc_list_divider_mtrl_alpha
            if (r9 != r0) goto L40
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L46
        L40:
            int r0 = a.b.e.abc_dialog_material_background
            if (r9 != r0) goto L48
        L44:
            r9 = r5
            r0 = -1
        L46:
            r4 = 1
            goto L4b
        L48:
            r9 = 0
            r0 = -1
            r4 = 0
        L4b:
            if (r4 == 0) goto L69
            boolean r4 = a.b.p.e0.a(r10)
            if (r4 == 0) goto L57
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L57:
            int r8 = a.b.p.s0.b(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = a.b.p.j.a(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L67
            r10.setAlpha(r0)
        L67:
            r8 = 1
            goto L6a
        L69:
            r8 = 0
        L6a:
            if (r8 == 0) goto L6f
            goto L70
        L6d:
            r8 = 0
            throw r8
        L6f:
            r1 = 0
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.n0.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    public final void a(String str, d dVar) {
        if (this.f226b == null) {
            this.f226b = new a.d.a<>();
        }
        this.f226b.put(str, dVar);
    }

    public static void a(Drawable drawable, v0 v0Var, int[] iArr) {
        if (e0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (!v0Var.d && !v0Var.f258c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            ColorStateList colorStateList = v0Var.d ? v0Var.f256a : null;
            PorterDuff.Mode mode = v0Var.f258c ? v0Var.f257b : h;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = a(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public static synchronized PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (n0.class) {
            c cVar = j;
            if (cVar != null) {
                int i3 = (i2 + 31) * 31;
                a2 = cVar.a((c) Integer.valueOf(mode.hashCode() + i3));
                if (a2 == null) {
                    a2 = new PorterDuffColorFilter(i2, mode);
                    c cVar2 = j;
                    if (cVar2 != null) {
                        cVar2.a(Integer.valueOf(mode.hashCode() + i3), a2);
                    } else {
                        throw null;
                    }
                }
            } else {
                throw null;
            }
        }
        return a2;
    }

    public synchronized Drawable a(Context context, int i2, boolean z) {
        Drawable d2;
        if (!this.f) {
            boolean z2 = true;
            this.f = true;
            Drawable b2 = b(context, a.b.n.a.abc_vector_test);
            if (b2 != null) {
                if (!(b2 instanceof a.m.a.a.h) && !"android.graphics.drawable.VectorDrawable".equals(b2.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        d2 = d(context, i2);
        if (d2 == null) {
            d2 = a(context, i2);
        }
        if (d2 == null) {
            d2 = a.e.e.a.b(context, i2);
        }
        if (d2 != null) {
            d2 = a(context, i2, z, d2);
        }
        if (d2 != null) {
            e0.b(d2);
        }
        return d2;
    }
}
