package a.b.m.a;

import a.b.m.a.b;
import a.b.m.a.d;
import a.d.i;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.StateSet;

/* compiled from: AnimatedStateListDrawableCompat.java */
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends a.b.m.a.d implements a.e.f.i.a {
    public c p;
    public g q;
    public int r;
    public int s;
    public boolean t;

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        public final Animatable f64a;

        public b(Animatable animatable) {
            super(null);
            this.f64a = animatable;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f64a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f64a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        public a.d.e<Long> K;
        public i<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new a.d.e<>();
                this.L = new i<>(10);
            }
        }

        public static long a(int i, int i2) {
            return i2 | (i << 32);
        }

        public int a(int i, int i2, Drawable drawable, boolean z) {
            int a2 = super.a(drawable);
            long a3 = a(i, i2);
            long j = z ? 8589934592L : 0L;
            long j2 = a2;
            this.K.a(a3, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a2;
        }

        public int b(int[] iArr) {
            int a2 = super.a(iArr);
            return a2 >= 0 ? a2 : super.a(StateSet.WILD_CARD);
        }

        @Override // a.b.m.a.d.a, a.b.m.a.b.c
        public void d() {
            this.K = this.K.m0clone();
            this.L = this.L.m1clone();
        }

        @Override // a.b.m.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // a.b.m.a.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }

        public int b(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.b(i, 0).intValue();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        public final a.m.a.a.c f65a;

        public d(a.m.a.a.c cVar) {
            super(null);
            this.f65a = cVar;
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f65a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f65a.stop();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        public final ObjectAnimator f66a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f67b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.f70c);
            ofInt.setInterpolator(fVar);
            this.f67b = z2;
            this.f66a = ofInt;
        }

        @Override // a.b.m.a.a.g
        public boolean a() {
            return this.f67b;
        }

        @Override // a.b.m.a.a.g
        public void b() {
            this.f66a.reverse();
        }

        @Override // a.b.m.a.a.g
        public void c() {
            this.f66a.start();
        }

        @Override // a.b.m.a.a.g
        public void d() {
            this.f66a.cancel();
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        public int[] f68a;

        /* renamed from: b, reason: collision with root package name */
        public int f69b;

        /* renamed from: c, reason: collision with root package name */
        public int f70c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f69b = numberOfFrames;
            int[] iArr = this.f68a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f68a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f68a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f70c = i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.f70c) + 0.5f);
            int i2 = this.f69b;
            int[] iArr = this.f68a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.f70c : 0.0f);
        }
    }

    /* compiled from: AnimatedStateListDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class g {
        public /* synthetic */ g(C0003a c0003a) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0208, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x020f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        r6 = r20.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f7, code lost:
    
        if (r6 != 4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fb, code lost:
    
        if (r6 != 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
    
        if (r20.getName().equals("vector") == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
    
        r6 = a.m.a.a.h.createFromXmlInner(r19, r20, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0112, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 21) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0114, code lost:
    
        r6 = android.graphics.drawable.Drawable.createFromXmlInner(r19, r20, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0119, code lost:
    
        r6 = android.graphics.drawable.Drawable.createFromXmlInner(r19, r20, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012c, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(b.a.a.a.a.a(r20, new java.lang.StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012d, code lost:
    
        if (r6 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012f, code lost:
    
        r9 = r5.p;
        r6 = r9.a(r6);
        r9.J[r6] = r8;
        r9.L.c(r6, java.lang.Integer.valueOf(r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0152, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(b.a.a.a.a.a(r20, new java.lang.StringBuilder(), ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(b.a.a.a.a.a(r20, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.b.m.a.a a(android.content.Context r18, android.content.res.Resources r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21, android.content.res.Resources.Theme r22) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.a.a(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):a.b.m.a.a");
    }

    @Override // a.b.m.a.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.q;
        if (gVar != null) {
            gVar.d();
            this.q = null;
            a(this.r);
            this.r = -1;
            this.s = -1;
        }
    }

    @Override // a.b.m.a.d, a.b.m.a.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.t) {
            super.mutate();
            if (this == this) {
                this.p.d();
                this.t = true;
            }
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00e2  */
    @Override // a.b.m.a.d, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.m.a.a.onStateChange(int[]):boolean");
    }

    @Override // a.b.m.a.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.q != null && (visible || z2)) {
            if (z) {
                this.q.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.r = -1;
        this.s = -1;
        c cVar2 = new c(cVar, this, resources);
        super.a(cVar2);
        this.p = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public b.c a() {
        return new c(this.p, this, null);
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public d.a a() {
        return new c(this.p, this, null);
    }

    @Override // a.b.m.a.d, a.b.m.a.b
    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof c) {
            this.p = (c) cVar;
        }
    }
}
