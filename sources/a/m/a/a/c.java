package a.m.a.a;

import a.b.k.r;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: AnimatedVectorDrawableCompat.java */
/* loaded from: classes.dex */
public class c extends g implements a.m.a.a.b {

    /* renamed from: c, reason: collision with root package name */
    public b f590c;
    public Context d;
    public ArgbEvaluator e;
    public final Drawable.Callback f;

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public int f592a;

        /* renamed from: b, reason: collision with root package name */
        public h f593b;

        /* renamed from: c, reason: collision with root package name */
        public AnimatorSet f594c;
        public ArrayList<Animator> d;
        public a.d.a<Animator, String> e;

        public b(b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f592a = bVar.f592a;
                h hVar = bVar.f593b;
                if (hVar != null) {
                    Drawable.ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f593b = (h) constantState.newDrawable(resources);
                    } else {
                        this.f593b = (h) constantState.newDrawable();
                    }
                    h hVar2 = this.f593b;
                    hVar2.mutate();
                    this.f593b = hVar2;
                    hVar2.setCallback(callback);
                    this.f593b.setBounds(bVar.f593b.getBounds());
                    this.f593b.g = false;
                }
                ArrayList<Animator> arrayList = bVar.d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.d = new ArrayList<>(size);
                    this.e = new a.d.a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.d.get(i);
                        Animator clone = animator.clone();
                        String orDefault = bVar.e.getOrDefault(animator, null);
                        clone.setTarget(this.f593b.f601c.f612b.p.getOrDefault(orDefault, null));
                        this.d.add(clone);
                        this.e.put(clone, orDefault);
                    }
                    if (this.f594c == null) {
                        this.f594c = new AnimatorSet();
                    }
                    this.f594c.playTogether(this.d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f592a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public c() {
        this(null, null, null);
    }

    public final void a(Animator animator) {
        ArrayList<Animator> childAnimations;
        if ((animator instanceof AnimatorSet) && (childAnimations = ((AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                a(childAnimations.get(i));
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.e == null) {
                    this.e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.e);
            }
        }
    }

    @Override // a.m.a.a.g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f600b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        drawable.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f600b;
        if (drawable == null || Build.VERSION.SDK_INT < 21) {
            return false;
        }
        return drawable.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f590c.f593b.draw(canvas);
        if (this.f590c.f594c.isStarted()) {
            invalidateSelf();
        }
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
        return this.f590c.f593b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f590c.f592a;
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
        return this.f590c.f593b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f600b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0025c(this.f600b.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f590c.f593b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f590c.f593b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f590c.f593b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String str;
        XmlResourceParser xmlResourceParser;
        Animator a2;
        Drawable drawable = this.f600b;
        if (drawable != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.inflate(resources, xmlPullParser, attributeSet, theme);
                return;
            } else {
                drawable.inflate(resources, xmlPullParser, attributeSet);
                return;
            }
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a3 = r.a(resources, theme, attributeSet, a.m.a.a.a.e);
                    int resourceId = a3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        h a4 = h.a(resources, resourceId, theme);
                        a4.g = false;
                        a4.setCallback(this.f);
                        h hVar = this.f590c.f593b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f590c.f593b = a4;
                    }
                    a3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.m.a.a.a.f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(i, 0);
                    if (resourceId2 != 0) {
                        Context context = this.d;
                        if (context != null) {
                            if (Build.VERSION.SDK_INT >= 24) {
                                a2 = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        xmlResourceParser = resources2.getAnimation(resourceId2);
                                        try {
                                            try {
                                                str = "Can't load animation resource ID #0x";
                                            } catch (Throwable th) {
                                                th = th;
                                                if (xmlResourceParser != null) {
                                                    xmlResourceParser.close();
                                                }
                                                throw th;
                                            }
                                        } catch (IOException e) {
                                            e = e;
                                            str = "Can't load animation resource ID #0x";
                                        } catch (XmlPullParserException e2) {
                                            e = e2;
                                            str = "Can't load animation resource ID #0x";
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        xmlResourceParser = null;
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    str = "Can't load animation resource ID #0x";
                                } catch (XmlPullParserException e4) {
                                    e = e4;
                                    str = "Can't load animation resource ID #0x";
                                }
                                try {
                                    a2 = r.a(context, resources2, theme2, xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), null, 0, 1.0f);
                                    xmlResourceParser.close();
                                } catch (IOException e5) {
                                    e = e5;
                                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                    notFoundException.initCause(e);
                                    throw notFoundException;
                                } catch (XmlPullParserException e6) {
                                    e = e6;
                                    Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(str + Integer.toHexString(resourceId2));
                                    notFoundException2.initCause(e);
                                    throw notFoundException2;
                                }
                            }
                            a2.setTarget(this.f590c.f593b.f601c.f612b.p.getOrDefault(string, null));
                            if (Build.VERSION.SDK_INT < 21) {
                                a(a2);
                            }
                            b bVar = this.f590c;
                            if (bVar.d == null) {
                                bVar.d = new ArrayList<>();
                                this.f590c.e = new a.d.a<>();
                            }
                            this.f590c.d.add(a2);
                            this.f590c.e.put(a2, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f590c;
        if (bVar2.f594c == null) {
            bVar2.f594c = new AnimatorSet();
        }
        bVar2.f594c.playTogether(bVar2.d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return r.b(drawable);
        }
        return this.f590c.f593b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f590c.f594c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f590c.f593b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f590c.f593b.setBounds(rect);
        }
    }

    @Override // a.m.a.a.g, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f590c.f593b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f590c.f593b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f590c.f593b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, z);
            return;
        }
        h hVar = this.f590c.f593b;
        Drawable drawable2 = hVar.f600b;
        if (drawable2 != null) {
            r.a(drawable2, z);
        } else {
            hVar.f601c.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        h hVar = this.f590c.f593b;
        Drawable drawable2 = hVar.f600b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            hVar.e = colorFilter;
            hVar.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTint(int i) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, i);
        } else {
            this.f590c.f593b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, colorStateList);
        } else {
            this.f590c.f593b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, a.e.f.i.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            r.a(drawable, mode);
        } else {
            this.f590c.f593b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f590c.f593b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f590c.f594c.isStarted()) {
                return;
            }
            this.f590c.f594c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f600b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f590c.f594c.end();
        }
    }

    public c(Context context, b bVar, Resources resources) {
        this.e = null;
        this.f = new a();
        this.d = context;
        if (bVar != null) {
            this.f590c = bVar;
        } else {
            this.f590c = new b(bVar, this.f, resources);
        }
    }

    /* compiled from: AnimatedVectorDrawableCompat.java */
    /* renamed from: a.m.a.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0025c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f595a;

        public C0025c(Drawable.ConstantState constantState) {
            this.f595a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f595a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f595a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f595a.newDrawable();
            cVar.f600b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f595a.newDrawable(resources);
            cVar.f600b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c(null, null, null);
            Drawable newDrawable = this.f595a.newDrawable(resources, theme);
            cVar.f600b = newDrawable;
            newDrawable.setCallback(cVar.f);
            return cVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
