package a.m.a.a;

import a.b.k.r;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class h extends a.m.a.a.g {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public C0026h f601c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        public b() {
        }

        @Override // a.m.a.a.h.f
        public boolean b() {
            return true;
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {
        public int[] e;
        public a.e.e.b.a f;
        public float g;
        public a.e.e.b.a h;
        public float i;
        public float j;
        public float k;
        public float l;
        public float m;
        public Paint.Cap n;
        public Paint.Join o;
        public float p;

        public c() {
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
        }

        @Override // a.m.a.a.h.e
        public boolean a() {
            return this.h.b() || this.f.b();
        }

        public float getFillAlpha() {
            return this.j;
        }

        public int getFillColor() {
            return this.h.f361c;
        }

        public float getStrokeAlpha() {
            return this.i;
        }

        public int getStrokeColor() {
            return this.f.f361c;
        }

        public float getStrokeWidth() {
            return this.g;
        }

        public float getTrimPathEnd() {
            return this.l;
        }

        public float getTrimPathOffset() {
            return this.m;
        }

        public float getTrimPathStart() {
            return this.k;
        }

        public void setFillAlpha(float f) {
            this.j = f;
        }

        public void setFillColor(int i) {
            this.h.f361c = i;
        }

        public void setStrokeAlpha(float f) {
            this.i = f;
        }

        public void setStrokeColor(int i) {
            this.f.f361c = i;
        }

        public void setStrokeWidth(float f) {
            this.g = f;
        }

        public void setTrimPathEnd(float f) {
            this.l = f;
        }

        public void setTrimPathOffset(float f) {
            this.m = f;
        }

        public void setTrimPathStart(float f) {
            this.k = f;
        }

        @Override // a.m.a.a.h.e
        public boolean a(int[] iArr) {
            return this.f.a(iArr) | this.h.a(iArr);
        }

        public c(c cVar) {
            super(cVar);
            this.g = 0.0f;
            this.i = 1.0f;
            this.j = 1.0f;
            this.k = 0.0f;
            this.l = 1.0f;
            this.m = 0.0f;
            this.n = Paint.Cap.BUTT;
            this.o = Paint.Join.MITER;
            this.p = 4.0f;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.i = cVar.i;
            this.h = cVar.h;
            this.f607c = cVar.f607c;
            this.j = cVar.j;
            this.k = cVar.k;
            this.l = cVar.l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean a(int[] iArr) {
            return false;
        }

        public /* synthetic */ e(a aVar) {
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: a.m.a.a.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0026h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f611a;

        /* renamed from: b, reason: collision with root package name */
        public g f612b;

        /* renamed from: c, reason: collision with root package name */
        public ColorStateList f613c;
        public PorterDuff.Mode d;
        public boolean e;
        public Bitmap f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public int i;
        public boolean j;
        public boolean k;
        public Paint l;

        public C0026h(C0026h c0026h) {
            this.f613c = null;
            this.d = h.k;
            if (c0026h != null) {
                this.f611a = c0026h.f611a;
                g gVar = new g(c0026h.f612b);
                this.f612b = gVar;
                if (c0026h.f612b.e != null) {
                    gVar.e = new Paint(c0026h.f612b.e);
                }
                if (c0026h.f612b.d != null) {
                    this.f612b.d = new Paint(c0026h.f612b.d);
                }
                this.f613c = c0026h.f613c;
                this.d = c0026h.d;
                this.e = c0026h.e;
            }
        }

        public void a(int i, int i2) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            g gVar = this.f612b;
            gVar.a(gVar.h, g.q, canvas, i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f611a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public boolean a() {
            g gVar = this.f612b;
            if (gVar.o == null) {
                gVar.o = Boolean.valueOf(gVar.h.a());
            }
            return gVar.o.booleanValue();
        }

        public C0026h() {
            this.f613c = null;
            this.d = h.k;
            this.f612b = new g();
        }
    }

    public h() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f601c = new C0026h();
    }

    public static h createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    public PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f600b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d9, code lost:
    
        if ((r1 == r7.getWidth() && r3 == r6.f.getHeight()) == false) goto L42;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.h.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                return drawable.getAlpha();
            }
            return 0;
        }
        return this.f601c.f612b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f601c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                return drawable.getColorFilter();
            }
            return null;
        }
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f600b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f600b.getConstantState());
        }
        this.f601c.f611a = getChangingConfigurations();
        return this.f601c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f601c.f612b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f601c.f612b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return r.b(drawable);
        }
        return this.f601c.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0026h c0026h;
        ColorStateList colorStateList;
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c0026h = this.f601c) != null && (c0026h.a() || ((colorStateList = this.f601c.f613c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            this.f601c = new C0026h(this.f601c);
            this.f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C0026h c0026h = this.f601c;
        ColorStateList colorStateList = c0026h.f613c;
        if (colorStateList != null && (mode = c0026h.d) != null) {
            this.d = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (c0026h.a()) {
            boolean a2 = c0026h.f612b.h.a(iArr);
            c0026h.k |= a2;
            if (a2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f601c.f612b.getRootAlpha() != i2) {
            this.f601c.f612b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, z);
        } else {
            this.f601c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTint(int i2) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, colorStateList);
            return;
        }
        C0026h c0026h = this.f601c;
        if (c0026h.f613c != colorStateList) {
            c0026h.f613c = colorStateList;
            this.d = a(colorStateList, c0026h.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, mode);
            return;
        }
        C0026h c0026h = this.f601c;
        if (c0026h.d != mode) {
            c0026h.d = mode;
            this.d = a(c0026h.f613c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f602a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList<e> f603b;

        /* renamed from: c, reason: collision with root package name */
        public float f604c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public final Matrix j;
        public int k;
        public int[] l;
        public String m;

        public d(d dVar, a.d.a<String, Object> aVar) {
            super(null);
            f bVar;
            this.f602a = new Matrix();
            this.f603b = new ArrayList<>();
            this.f604c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
            this.f604c = dVar.f604c;
            this.d = dVar.d;
            this.e = dVar.e;
            this.f = dVar.f;
            this.g = dVar.g;
            this.h = dVar.h;
            this.i = dVar.i;
            this.l = dVar.l;
            String str = dVar.m;
            this.m = str;
            this.k = dVar.k;
            if (str != null) {
                aVar.put(str, this);
            }
            this.j.set(dVar.j);
            ArrayList<e> arrayList = dVar.f603b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f603b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f603b.add(bVar);
                    String str2 = bVar.f606b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        @Override // a.m.a.a.h.e
        public boolean a() {
            for (int i = 0; i < this.f603b.size(); i++) {
                if (this.f603b.get(i).a()) {
                    return true;
                }
            }
            return false;
        }

        public final void b() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.f604c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.f604c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f) {
            if (f != this.d) {
                this.d = f;
                b();
            }
        }

        public void setPivotY(float f) {
            if (f != this.e) {
                this.e = f;
                b();
            }
        }

        public void setRotation(float f) {
            if (f != this.f604c) {
                this.f604c = f;
                b();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                b();
            }
        }

        public void setScaleY(float f) {
            if (f != this.g) {
                this.g = f;
                b();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.h) {
                this.h = f;
                b();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.i) {
                this.i = f;
                b();
            }
        }

        @Override // a.m.a.a.h.e
        public boolean a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f603b.size(); i++) {
                z |= this.f603b.get(i).a(iArr);
            }
            return z;
        }

        public d() {
            super(null);
            this.f602a = new Matrix();
            this.f603b = new ArrayList<>();
            this.f604c = 0.0f;
            this.d = 0.0f;
            this.e = 0.0f;
            this.f = 1.0f;
            this.g = 1.0f;
            this.h = 0.0f;
            this.i = 0.0f;
            this.j = new Matrix();
            this.m = null;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f614a;

        public i(Drawable.ConstantState constantState) {
            this.f614a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f614a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f614a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f600b = (VectorDrawable) this.f614a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f600b = (VectorDrawable) this.f614a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f600b = (VectorDrawable) this.f614a.newDrawable(resources, theme);
            return hVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        public a.e.f.b[] f605a;

        /* renamed from: b, reason: collision with root package name */
        public String f606b;

        /* renamed from: c, reason: collision with root package name */
        public int f607c;
        public int d;

        public f() {
            super(null);
            this.f605a = null;
            this.f607c = 0;
        }

        public boolean b() {
            return false;
        }

        public a.e.f.b[] getPathData() {
            return this.f605a;
        }

        public String getPathName() {
            return this.f606b;
        }

        public void setPathData(a.e.f.b[] bVarArr) {
            if (!r.a(this.f605a, bVarArr)) {
                this.f605a = r.a(bVarArr);
                return;
            }
            a.e.f.b[] bVarArr2 = this.f605a;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f375a = bVarArr[i].f375a;
                for (int i2 = 0; i2 < bVarArr[i].f376b.length; i2++) {
                    bVarArr2[i].f376b[i2] = bVarArr[i].f376b[i2];
                }
            }
        }

        public f(f fVar) {
            super(null);
            this.f605a = null;
            this.f607c = 0;
            this.f606b = fVar.f606b;
            this.d = fVar.d;
            this.f605a = r.a(fVar.f605a);
        }
    }

    public static h a(Resources resources, int i2, Resources.Theme theme) {
        int next;
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            if (Build.VERSION.SDK_INT >= 21) {
                drawable = resources.getDrawable(i2, theme);
            } else {
                drawable = resources.getDrawable(i2);
            }
            hVar.f600b = drawable;
            new i(hVar.f600b.getConstantState());
            return hVar;
        }
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
                return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        } catch (XmlPullParserException e3) {
            Log.e("VectorDrawableCompat", "parser error", e3);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00eb  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.m.a.a.h.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public h(C0026h c0026h) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f601c = c0026h;
        this.d = a(c0026h.f613c, c0026h.d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {
        public static final Matrix q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Path f608a;

        /* renamed from: b, reason: collision with root package name */
        public final Path f609b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f610c;
        public Paint d;
        public Paint e;
        public PathMeasure f;
        public int g;
        public final d h;
        public float i;
        public float j;
        public float k;
        public float l;
        public int m;
        public String n;
        public Boolean o;
        public final a.d.a<String, Object> p;

        public g() {
            this.f610c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            this.p = new a.d.a<>();
            this.h = new d();
            this.f608a = new Path();
            this.f609b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v11 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.f602a.set(matrix);
            dVar.f602a.preConcat(dVar.j);
            canvas.save();
            ?? r11 = 0;
            int i3 = 0;
            while (i3 < dVar.f603b.size()) {
                e eVar = dVar.f603b.get(i3);
                if (eVar instanceof d) {
                    a((d) eVar, dVar.f602a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof f) {
                    f fVar = (f) eVar;
                    float f = i / gVar2.k;
                    float f2 = i2 / gVar2.l;
                    float min = Math.min(f, f2);
                    Matrix matrix2 = dVar.f602a;
                    gVar2.f610c.set(matrix2);
                    gVar2.f610c.postScale(f, f2);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f3) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.f608a;
                        if (fVar != null) {
                            path.reset();
                            a.e.f.b[] bVarArr = fVar.f605a;
                            if (bVarArr != null) {
                                a.e.f.b.a(bVarArr, path);
                            }
                            Path path2 = gVar.f608a;
                            gVar.f609b.reset();
                            if (fVar.b()) {
                                gVar.f609b.setFillType(fVar.f607c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f609b.addPath(path2, gVar.f610c);
                                canvas.clipPath(gVar.f609b);
                            } else {
                                c cVar = (c) fVar;
                                if (cVar.k != 0.0f || cVar.l != 1.0f) {
                                    float f4 = cVar.k;
                                    float f5 = cVar.m;
                                    float f6 = (f4 + f5) % 1.0f;
                                    float f7 = (cVar.l + f5) % 1.0f;
                                    if (gVar.f == null) {
                                        gVar.f = new PathMeasure();
                                    }
                                    gVar.f.setPath(gVar.f608a, r11);
                                    float length = gVar.f.getLength();
                                    float f8 = f6 * length;
                                    float f9 = f7 * length;
                                    path2.reset();
                                    if (f8 > f9) {
                                        gVar.f.getSegment(f8, length, path2, true);
                                        gVar.f.getSegment(0.0f, f9, path2, true);
                                    } else {
                                        gVar.f.getSegment(f8, f9, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f609b.addPath(path2, gVar.f610c);
                                a.e.e.b.a aVar = cVar.h;
                                if (aVar.a() || aVar.f361c != 0) {
                                    a.e.e.b.a aVar2 = cVar.h;
                                    if (gVar.e == null) {
                                        Paint paint = new Paint(1);
                                        gVar.e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.e;
                                    if (aVar2.a()) {
                                        Shader shader = aVar2.f359a;
                                        shader.setLocalMatrix(gVar.f610c);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.j * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        paint2.setColor(h.a(aVar2.f361c, cVar.j));
                                    }
                                    paint2.setColorFilter(colorFilter);
                                    gVar.f609b.setFillType(cVar.f607c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(gVar.f609b, paint2);
                                }
                                a.e.e.b.a aVar3 = cVar.f;
                                if (aVar3.a() || aVar3.f361c != 0) {
                                    a.e.e.b.a aVar4 = cVar.f;
                                    if (gVar.d == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.d;
                                    Paint.Join join = cVar.o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.p);
                                    if (aVar4.a()) {
                                        Shader shader2 = aVar4.f359a;
                                        shader2.setLocalMatrix(gVar.f610c);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.i * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        paint4.setColor(h.a(aVar4.f361c, cVar.i));
                                    }
                                    paint4.setColorFilter(colorFilter);
                                    paint4.setStrokeWidth(cVar.g * abs * min);
                                    canvas.drawPath(gVar.f609b, paint4);
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.m;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.m = i;
        }

        public g(g gVar) {
            this.f610c = new Matrix();
            this.i = 0.0f;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 255;
            this.n = null;
            this.o = null;
            a.d.a<String, Object> aVar = new a.d.a<>();
            this.p = aVar;
            this.h = new d(gVar.h, aVar);
            this.f608a = new Path(gVar.f608a);
            this.f609b = new Path(gVar.f609b);
            this.i = gVar.i;
            this.j = gVar.j;
            this.k = gVar.k;
            this.l = gVar.l;
            this.g = gVar.g;
            this.m = gVar.m;
            this.n = gVar.n;
            String str = gVar.n;
            if (str != null) {
                this.p.put(str, this);
            }
            this.o = gVar.o;
        }
    }

    public static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }
}
