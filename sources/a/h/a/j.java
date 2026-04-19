package a.h.a;

import a.h.a.q;
import a.j.e;
import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentManagerImpl.java */
/* loaded from: classes.dex */
public final class j extends i implements LayoutInflater.Factory2 {
    public static boolean G = false;
    public static final Interpolator H = new DecelerateInterpolator(2.5f);
    public static final Interpolator I = new DecelerateInterpolator(1.5f);
    public ArrayList<Fragment> A;
    public ArrayList<h> D;
    public o E;
    public boolean d;
    public ArrayList<a.h.a.a> h;
    public ArrayList<Fragment> i;
    public OnBackPressedDispatcher j;
    public ArrayList<a.h.a.a> l;
    public ArrayList<Integer> m;
    public a.h.a.h p;
    public a.h.a.e q;
    public Fragment r;
    public Fragment s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ArrayList<a.h.a.a> y;
    public ArrayList<Boolean> z;
    public int e = 0;
    public final ArrayList<Fragment> f = new ArrayList<>();
    public final HashMap<String, Fragment> g = new HashMap<>();
    public final a.a.b k = new a(false);
    public final CopyOnWriteArrayList<f> n = new CopyOnWriteArrayList<>();
    public int o = 0;
    public Bundle B = null;
    public SparseArray<Parcelable> C = null;
    public Runnable F = new b();

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class a extends a.a.b {
        public a(boolean z) {
            super(z);
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.g();
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public class c extends a.h.a.g {
        public c() {
        }

        @Override // a.h.a.g
        public Fragment a(ClassLoader classLoader, String str) {
            a.h.a.h hVar = j.this.p;
            Context context = hVar.f497c;
            if (hVar != null) {
                return Fragment.a(context, str, (Bundle) null);
            }
            throw null;
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f507a;
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a, reason: collision with root package name */
        public static final int[] f508a = {R.attr.name, R.attr.id, R.attr.tag};
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class h implements Fragment.d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f509a;

        /* renamed from: b, reason: collision with root package name */
        public final a.h.a.a f510b;

        /* renamed from: c, reason: collision with root package name */
        public int f511c;

        public h(a.h.a.a aVar, boolean z) {
            this.f509a = z;
            this.f510b = aVar;
        }

        public void a() {
            boolean z = this.f511c > 0;
            j jVar = this.f510b.r;
            int size = jVar.f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f.get(i);
                fragment.a((Fragment.d) null);
                if (z) {
                    Fragment.b bVar = fragment.L;
                    if (bVar == null ? false : bVar.q) {
                        fragment.u();
                    }
                }
            }
            a.h.a.a aVar = this.f510b;
            aVar.r.a(aVar, this.f509a, !z, true);
        }
    }

    public static int d(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    public final void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new a.e.j.a("FragmentManager"));
        a.h.a.h hVar = this.p;
        if (hVar != null) {
            try {
                a.h.a.d.this.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            a("  ", (FileDescriptor) null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    public void b(Fragment fragment) {
        if (fragment.A) {
            return;
        }
        fragment.A = true;
        if (fragment.l) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (d(fragment)) {
                this.t = true;
            }
            fragment.l = false;
        }
    }

    public void c(int i) {
        synchronized (this) {
            this.l.set(i, null);
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            this.m.add(Integer.valueOf(i));
        }
    }

    public void d() {
        this.u = false;
        this.v = false;
        a(1);
    }

    public boolean e(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.s;
        return fragment == jVar.s && e(jVar.r);
    }

    public void f(Fragment fragment) {
        if (this.g.get(fragment.f) != null) {
            return;
        }
        this.g.put(fragment.f, fragment);
        if (fragment.C) {
            if (fragment.B) {
                if (!i()) {
                    this.E.f524b.add(fragment);
                }
            } else if (!i()) {
                this.E.f524b.remove(fragment);
            }
            fragment.C = false;
        }
    }

    public void g(Fragment fragment) {
        Animator animator;
        if (fragment != null && this.g.containsKey(fragment.f)) {
            int i = this.o;
            if (fragment.m) {
                if (fragment.s()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, 0);
                }
            }
            a(fragment, i, fragment.m(), fragment.n(), false);
            View view = fragment.H;
            if (view != null) {
                ViewGroup viewGroup = fragment.G;
                Fragment fragment2 = null;
                if (viewGroup != null && view != null) {
                    int indexOf = this.f.indexOf(fragment);
                    while (true) {
                        indexOf--;
                        if (indexOf < 0) {
                            break;
                        }
                        Fragment fragment3 = this.f.get(indexOf);
                        if (fragment3.G == viewGroup && fragment3.H != null) {
                            fragment2 = fragment3;
                            break;
                        }
                    }
                }
                if (fragment2 != null) {
                    View view2 = fragment2.H;
                    ViewGroup viewGroup2 = fragment.G;
                    int indexOfChild = viewGroup2.indexOfChild(view2);
                    int indexOfChild2 = viewGroup2.indexOfChild(fragment.H);
                    if (indexOfChild2 < indexOfChild) {
                        viewGroup2.removeViewAt(indexOfChild2);
                        viewGroup2.addView(fragment.H, indexOfChild);
                    }
                }
                if (fragment.M && fragment.G != null) {
                    float f2 = fragment.O;
                    if (f2 > 0.0f) {
                        fragment.H.setAlpha(f2);
                    }
                    fragment.O = 0.0f;
                    fragment.M = false;
                    d a2 = a(fragment, fragment.m(), true, fragment.n());
                    if (a2 != null) {
                        Animation animation = a2.f503a;
                        if (animation != null) {
                            fragment.H.startAnimation(animation);
                        } else {
                            a2.f504b.setTarget(fragment.H);
                            a2.f504b.start();
                        }
                    }
                }
            }
            if (fragment.N) {
                if (fragment.H != null) {
                    d a3 = a(fragment, fragment.m(), !fragment.z, fragment.n());
                    if (a3 != null && (animator = a3.f504b) != null) {
                        animator.setTarget(fragment.H);
                        if (fragment.z) {
                            if (fragment.r()) {
                                fragment.a(false);
                            } else {
                                ViewGroup viewGroup3 = fragment.G;
                                View view3 = fragment.H;
                                viewGroup3.startViewTransition(view3);
                                a3.f504b.addListener(new m(this, viewGroup3, view3, fragment));
                            }
                        } else {
                            fragment.H.setVisibility(0);
                        }
                        a3.f504b.start();
                    } else {
                        if (a3 != null) {
                            fragment.H.startAnimation(a3.f503a);
                            a3.f503a.start();
                        }
                        fragment.H.setVisibility((!fragment.z || fragment.r()) ? 0 : 8);
                        if (fragment.r()) {
                            fragment.a(false);
                        }
                    }
                }
                if (fragment.l && d(fragment)) {
                    this.t = true;
                }
                fragment.N = false;
            }
        }
    }

    public a.h.a.g h() {
        if (this.f499b == null) {
            this.f499b = i.f498c;
        }
        if (this.f499b == i.f498c) {
            Fragment fragment = this.r;
            if (fragment != null) {
                return fragment.s.h();
            }
            this.f499b = new c();
        }
        if (this.f499b == null) {
            this.f499b = i.f498c;
        }
        return this.f499b;
    }

    public boolean i() {
        return this.u || this.v;
    }

    public void j() {
        this.u = false;
        this.v = false;
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.u.j();
            }
        }
    }

    public Parcelable k() {
        a.h.a.b[] bVarArr;
        ArrayList<String> arrayList;
        int size;
        Bundle bundle;
        if (this.D != null) {
            while (!this.D.isEmpty()) {
                this.D.remove(0).a();
            }
        }
        Iterator<Fragment> it = this.g.values().iterator();
        while (true) {
            bVarArr = null;
            if (!it.hasNext()) {
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                if (next.g() != null) {
                    int p = next.p();
                    View g2 = next.g();
                    Animation animation = g2.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        g2.clearAnimation();
                    }
                    next.a((View) null);
                    a(next, p, 0, 0, false);
                } else if (next.h() != null) {
                    next.h().end();
                }
            }
        }
        g();
        this.u = true;
        if (this.g.isEmpty()) {
            return null;
        }
        ArrayList<p> arrayList2 = new ArrayList<>(this.g.size());
        boolean z = false;
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (fragment.s == this) {
                    p pVar = new p(fragment);
                    arrayList2.add(pVar);
                    if (fragment.f705b > 0 && pVar.n == null) {
                        if (this.B == null) {
                            this.B = new Bundle();
                        }
                        Bundle bundle2 = this.B;
                        fragment.V.b(bundle2);
                        Parcelable k = fragment.u.k();
                        if (k != null) {
                            bundle2.putParcelable("android:support:fragments", k);
                        }
                        d(fragment, this.B, false);
                        if (this.B.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = this.B;
                            this.B = null;
                        }
                        if (fragment.H != null) {
                            i(fragment);
                        }
                        if (fragment.d != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", fragment.d);
                        }
                        if (!fragment.K) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", fragment.K);
                        }
                        pVar.n = bundle;
                        String str = fragment.i;
                        if (str != null) {
                            Fragment fragment2 = this.g.get(str);
                            if (fragment2 != null) {
                                if (pVar.n == null) {
                                    pVar.n = new Bundle();
                                }
                                Bundle bundle3 = pVar.n;
                                if (fragment2.s == this) {
                                    bundle3.putString("android:target_state", fragment2.f);
                                    int i = fragment.j;
                                    if (i != 0) {
                                        pVar.n.putInt("android:target_req_state", i);
                                    }
                                } else {
                                    a(new IllegalStateException("Fragment " + fragment2 + " is not currently in the FragmentManager"));
                                    throw null;
                                }
                            } else {
                                a(new IllegalStateException("Failure saving state: " + fragment + " has target not in fragment manager: " + fragment.i));
                                throw null;
                            }
                        }
                    } else {
                        pVar.n = fragment.f706c;
                    }
                    z = true;
                } else {
                    a(new IllegalStateException("Failure saving state: active " + fragment + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        }
        if (!z) {
            return null;
        }
        int size2 = this.f.size();
        if (size2 > 0) {
            arrayList = new ArrayList<>(size2);
            Iterator<Fragment> it2 = this.f.iterator();
            while (it2.hasNext()) {
                Fragment next2 = it2.next();
                arrayList.add(next2.f);
                if (next2.s != this) {
                    a(new IllegalStateException("Failure saving state: active " + next2 + " was removed from the FragmentManager"));
                    throw null;
                }
            }
        } else {
            arrayList = null;
        }
        ArrayList<a.h.a.a> arrayList3 = this.h;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            bVarArr = new a.h.a.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new a.h.a.b(this.h.get(i2));
            }
        }
        n nVar = new n();
        nVar.f522b = arrayList2;
        nVar.f523c = arrayList;
        nVar.d = bVarArr;
        Fragment fragment3 = this.s;
        if (fragment3 != null) {
            nVar.e = fragment3.f;
        }
        nVar.f = this.e;
        return nVar;
    }

    public void l() {
        synchronized (this) {
            if ((this.D == null || this.D.isEmpty()) ? false : true) {
                this.p.d.removeCallbacks(this.F);
                this.p.d.post(this.F);
                n();
            }
        }
    }

    public void m() {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.J) {
                if (this.d) {
                    this.x = true;
                } else {
                    fragment.J = false;
                    a(fragment, this.o, 0, 0, false);
                }
            }
        }
    }

    public final void n() {
        a.a.b bVar = this.k;
        ArrayList<a.h.a.a> arrayList = this.h;
        boolean z = false;
        if ((arrayList != null ? arrayList.size() : 0) > 0 && e(this.r)) {
            z = true;
        }
        bVar.f0a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        r2 = r11;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.View r14, java.lang.String r15, android.content.Context r16, android.util.AttributeSet r17) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.j.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.r;
        if (fragment != null) {
            a.b.k.r.a((Object) fragment, sb);
        } else {
            a.b.k.r.a((Object) this.p, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public void i(Fragment fragment) {
        if (fragment.I == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.C;
        if (sparseArray == null) {
            this.C = new SparseArray<>();
        } else {
            sparseArray.clear();
        }
        fragment.I.saveHierarchyState(this.C);
        if (this.C.size() > 0) {
            fragment.d = this.C;
            this.C = null;
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f503a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f504b;

        public d(Animation animation) {
            this.f503a = animation;
            this.f504b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public d(Animator animator) {
            this.f503a = null;
            this.f504b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    public void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.d(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void e() {
        this.w = true;
        g();
        a(0);
        this.p = null;
        this.q = null;
        this.r = null;
        if (this.j != null) {
            Iterator<a.a.a> it = this.k.f1b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.j = null;
        }
    }

    /* compiled from: FragmentManagerImpl.java */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f505b;

        /* renamed from: c, reason: collision with root package name */
        public final View f506c;
        public boolean d;
        public boolean e;
        public boolean f;

        public e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f = true;
            this.f505b = viewGroup;
            this.f506c = view;
            addAnimation(animation);
            this.f505b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.d = true;
                a.e.k.l.a(this.f505b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.d && this.f) {
                this.f = false;
                this.f505b.post(this);
            } else {
                this.f505b.endViewTransition(this.f506c);
                this.e = true;
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f = true;
            if (this.d) {
                return !this.e;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.d = true;
                a.e.k.l.a(this.f505b, this);
            }
            return true;
        }
    }

    public void j(Fragment fragment) {
        if (fragment != null && (this.g.get(fragment.f) != fragment || (fragment.t != null && fragment.s != this))) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        Fragment fragment2 = this.s;
        this.s = fragment;
        c(fragment2);
        c(this.s);
    }

    public final void c(boolean z) {
        if (!this.d) {
            if (this.p != null) {
                if (Looper.myLooper() == this.p.d.getLooper()) {
                    if (!z && i()) {
                        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                    }
                    if (this.y == null) {
                        this.y = new ArrayList<>();
                        this.z = new ArrayList<>();
                    }
                    this.d = true;
                    try {
                        a((ArrayList<a.h.a.a>) null, (ArrayList<Boolean>) null);
                        return;
                    } finally {
                        this.d = false;
                    }
                }
                throw new IllegalStateException("Must be called from main thread of fragment host");
            }
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public Fragment b(int i) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null && fragment.w == i) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.g.values()) {
            if (fragment2 != null && fragment2.w == i) {
                return fragment2;
            }
        }
        return null;
    }

    public void d(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.d(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    @Override // a.h.a.i
    public List<Fragment> a() {
        List<Fragment> list;
        if (this.f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f) {
            list = (List) this.f.clone();
        }
        return list;
    }

    public void f() {
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.F = true;
                fragment.u.f();
            }
        }
    }

    public void h(Fragment fragment) {
        boolean z = !fragment.s();
        if (!fragment.A || z) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (d(fragment)) {
                this.t = true;
            }
            fragment.l = false;
            fragment.m = true;
        }
    }

    @Override // a.h.a.i
    public boolean b() {
        boolean z;
        int size;
        if (!i()) {
            g();
            c(true);
            Fragment fragment = this.s;
            if (fragment != null && fragment.i().b()) {
                return true;
            }
            ArrayList<a.h.a.a> arrayList = this.y;
            ArrayList<Boolean> arrayList2 = this.z;
            ArrayList<a.h.a.a> arrayList3 = this.h;
            if (arrayList3 != null && (size = arrayList3.size() - 1) >= 0) {
                arrayList.add(this.h.remove(size));
                arrayList2.add(true);
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.d = true;
                try {
                    c(this.y, this.z);
                } finally {
                    c();
                }
            }
            n();
            if (this.x) {
                this.x = false;
                m();
            }
            this.g.values().removeAll(Collections.singleton(null));
            return z;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    public void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.e(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.f(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    @Override // a.h.a.i
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        String a2 = b.a.a.a.a.a(str, "    ");
        if (!this.g.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (Fragment fragment : this.g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    printWriter.print(a2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(fragment.w));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(fragment.x));
                    printWriter.print(" mTag=");
                    printWriter.println(fragment.y);
                    printWriter.print(a2);
                    printWriter.print("mState=");
                    printWriter.print(fragment.f705b);
                    printWriter.print(" mWho=");
                    printWriter.print(fragment.f);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(fragment.r);
                    printWriter.print(a2);
                    printWriter.print("mAdded=");
                    printWriter.print(fragment.l);
                    printWriter.print(" mRemoving=");
                    printWriter.print(fragment.m);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(fragment.n);
                    printWriter.print(" mInLayout=");
                    printWriter.println(fragment.o);
                    printWriter.print(a2);
                    printWriter.print("mHidden=");
                    printWriter.print(fragment.z);
                    printWriter.print(" mDetached=");
                    printWriter.print(fragment.A);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(fragment.E);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(a2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(fragment.B);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(fragment.K);
                    if (fragment.s != null) {
                        printWriter.print(a2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(fragment.s);
                    }
                    if (fragment.t != null) {
                        printWriter.print(a2);
                        printWriter.print("mHost=");
                        printWriter.println(fragment.t);
                    }
                    if (fragment.v != null) {
                        printWriter.print(a2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(fragment.v);
                    }
                    if (fragment.g != null) {
                        printWriter.print(a2);
                        printWriter.print("mArguments=");
                        printWriter.println(fragment.g);
                    }
                    if (fragment.f706c != null) {
                        printWriter.print(a2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(fragment.f706c);
                    }
                    if (fragment.d != null) {
                        printWriter.print(a2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(fragment.d);
                    }
                    Object obj = fragment.h;
                    if (obj == null) {
                        j jVar = fragment.s;
                        obj = (jVar == null || (str2 = fragment.i) == null) ? null : (Fragment) jVar.g.get(str2);
                    }
                    if (obj != null) {
                        printWriter.print(a2);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(fragment.j);
                    }
                    if (fragment.l() != 0) {
                        printWriter.print(a2);
                        printWriter.print("mNextAnim=");
                        printWriter.println(fragment.l());
                    }
                    if (fragment.G != null) {
                        printWriter.print(a2);
                        printWriter.print("mContainer=");
                        printWriter.println(fragment.G);
                    }
                    if (fragment.H != null) {
                        printWriter.print(a2);
                        printWriter.print("mView=");
                        printWriter.println(fragment.H);
                    }
                    if (fragment.I != null) {
                        printWriter.print(a2);
                        printWriter.print("mInnerView=");
                        printWriter.println(fragment.H);
                    }
                    if (fragment.g() != null) {
                        printWriter.print(a2);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(fragment.g());
                        printWriter.print(a2);
                        printWriter.print("mStateAfterAnimating=");
                        printWriter.println(fragment.p());
                    }
                    a.h.a.h hVar = fragment.t;
                    if ((hVar != null ? hVar.f497c : null) != null) {
                        a.k.a.a.a(fragment).a(a2, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(a2);
                    printWriter.println("Child " + fragment.u + ":");
                    fragment.u.a(b.a.a.a.a.a(a2, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size4 = this.f.size();
        if (size4 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size4; i++) {
                Fragment fragment2 = this.f.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.i;
        if (arrayList != null && (size3 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size3; i2++) {
                Fragment fragment3 = this.i.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<a.h.a.a> arrayList2 = this.h;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size2; i3++) {
                a.h.a.a aVar = this.h.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.a(a2, printWriter, true);
            }
        }
        synchronized (this) {
            if (this.l != null && (size = this.l.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj2 = (a.h.a.a) this.l.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(obj2);
                }
            }
            if (this.m != null && this.m.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.m.toArray()));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.q);
        if (this.r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public final boolean d(Fragment fragment) {
        boolean z;
        if (fragment.D && fragment.E) {
            return true;
        }
        j jVar = fragment.u;
        Iterator<Fragment> it = jVar.g.values().iterator();
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Fragment next = it.next();
            if (next != null) {
                z2 = jVar.d(next);
            }
            if (z2) {
                z = true;
                break;
            }
        }
        return z;
    }

    public void h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.h(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public final void c() {
        this.d = false;
        this.z.clear();
        this.y.clear();
    }

    public final void c(ArrayList<a.h.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
            a(arrayList, arrayList2);
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                if (!arrayList.get(i).p) {
                    if (i2 != i) {
                        a(arrayList, arrayList2, i2, i);
                    }
                    i2 = i + 1;
                    if (arrayList2.get(i).booleanValue()) {
                        while (i2 < size && arrayList2.get(i2).booleanValue() && !arrayList.get(i2).p) {
                            i2++;
                        }
                    }
                    a(arrayList, arrayList2, i, i2);
                    i = i2 - 1;
                }
                i++;
            }
            if (i2 != size) {
                a(arrayList, arrayList2, i2, size);
                return;
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    public final boolean b(ArrayList<a.h.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
        }
        return false;
    }

    public final void c(Fragment fragment) {
        if (fragment == null || this.g.get(fragment.f) != fragment) {
            return;
        }
        boolean e2 = fragment.s.e(fragment);
        Boolean bool = fragment.k;
        if (bool == null || bool.booleanValue() != e2) {
            fragment.k = Boolean.valueOf(e2);
            j jVar = fragment.u;
            jVar.n();
            jVar.c(jVar.s);
        }
    }

    public void b(boolean z) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.u.b(z);
            }
        }
    }

    public boolean b(Menu menu) {
        if (this.o < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z ? fragment.u.b(menu) | false : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.c(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public boolean b(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z && fragment.u.b(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.c(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void b(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.b(fragment, context, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public boolean g() {
        c(true);
        b(this.y, this.z);
        n();
        if (this.x) {
            this.x = false;
            m();
        }
        this.g.values().removeAll(Collections.singleton(null));
        return false;
    }

    public void b(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.b(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void g(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.g(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void b(Fragment fragment, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.b(fragment, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public static d a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(H);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(I);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new d(animationSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a.h.a.j.d a(androidx.fragment.app.Fragment r7, int r8, boolean r9, int r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.j.a(androidx.fragment.app.Fragment, int, boolean, int):a.h.a.j$d");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        if (r0 != 3) goto L346;
     */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(androidx.fragment.app.Fragment r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.j.a(androidx.fragment.app.Fragment, int, int, int, boolean):void");
    }

    public void a(int i, boolean z) {
        a.h.a.h hVar;
        if (this.p == null && i != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.o) {
            this.o = i;
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                g(this.f.get(i2));
            }
            for (Fragment fragment : this.g.values()) {
                if (fragment != null && (fragment.m || fragment.A)) {
                    if (!fragment.M) {
                        g(fragment);
                    }
                }
            }
            m();
            if (this.t && (hVar = this.p) != null && this.o == 4) {
                a.h.a.d.this.f();
                this.t = false;
            }
        }
    }

    public void a(Fragment fragment, boolean z) {
        f(fragment);
        if (fragment.A) {
            return;
        }
        if (!this.f.contains(fragment)) {
            synchronized (this.f) {
                this.f.add(fragment);
            }
            fragment.l = true;
            fragment.m = false;
            if (fragment.H == null) {
                fragment.N = false;
            }
            if (d(fragment)) {
                this.t = true;
            }
            if (z) {
                a(fragment, this.o, 0, 0, false);
                return;
            }
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void a(Fragment fragment) {
        if (fragment.A) {
            fragment.A = false;
            if (fragment.l) {
                return;
            }
            if (!this.f.contains(fragment)) {
                synchronized (this.f) {
                    this.f.add(fragment);
                }
                fragment.l = true;
                if (d(fragment)) {
                    this.t = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
    }

    public Fragment a(String str) {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (!str.equals(fragment.f)) {
                    fragment = fragment.u.a(str);
                }
                if (fragment != null) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public void a(int i, a.h.a.a aVar) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (i < size) {
                this.l.set(i, aVar);
            } else {
                while (size < i) {
                    this.l.add(null);
                    if (this.m == null) {
                        this.m = new ArrayList<>();
                    }
                    this.m.add(Integer.valueOf(size));
                    size++;
                }
                this.l.add(aVar);
            }
        }
    }

    public final void a(ArrayList<a.h.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<h> arrayList3 = this.D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            h hVar = this.D.get(i);
            if (arrayList != null && !hVar.f509a && (indexOf2 = arrayList.indexOf(hVar.f510b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                this.D.remove(i);
                i--;
                size--;
                a.h.a.a aVar = hVar.f510b;
                aVar.r.a(aVar, hVar.f509a, false, false);
            } else {
                if ((hVar.f511c == 0) || (arrayList != null && hVar.f510b.a(arrayList, 0, arrayList.size()))) {
                    this.D.remove(i);
                    i--;
                    size--;
                    if (arrayList != null && !hVar.f509a && (indexOf = arrayList.indexOf(hVar.f510b)) != -1 && arrayList2.get(indexOf).booleanValue()) {
                        a.h.a.a aVar2 = hVar.f510b;
                        aVar2.r.a(aVar2, hVar.f509a, false, false);
                    } else {
                        hVar.a();
                    }
                }
            }
            i++;
        }
    }

    public final void a(ArrayList<a.h.a.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        ArrayList<Boolean> arrayList3 = arrayList2;
        boolean z2 = arrayList.get(i).p;
        ArrayList<Fragment> arrayList4 = this.A;
        if (arrayList4 == null) {
            this.A = new ArrayList<>();
        } else {
            arrayList4.clear();
        }
        this.A.addAll(this.f);
        Fragment fragment = this.s;
        int i8 = i;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i2) {
                a.h.a.a aVar = arrayList.get(i8);
                int i10 = 3;
                if (!arrayList3.get(i8).booleanValue()) {
                    ArrayList<Fragment> arrayList5 = this.A;
                    int i11 = 0;
                    while (i11 < aVar.f528a.size()) {
                        q.a aVar2 = aVar.f528a.get(i11);
                        int i12 = aVar2.f531a;
                        if (i12 != i9) {
                            if (i12 == 2) {
                                Fragment fragment2 = aVar2.f532b;
                                int i13 = fragment2.x;
                                int size = arrayList5.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList5.get(size);
                                    if (fragment3.x != i13) {
                                        i7 = i13;
                                    } else if (fragment3 == fragment2) {
                                        i7 = i13;
                                        z4 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i7 = i13;
                                            aVar.f528a.add(i11, new q.a(9, fragment3));
                                            i11++;
                                            fragment = null;
                                        } else {
                                            i7 = i13;
                                        }
                                        q.a aVar3 = new q.a(3, fragment3);
                                        aVar3.f533c = aVar2.f533c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f = aVar2.f;
                                        aVar.f528a.add(i11, aVar3);
                                        arrayList5.remove(fragment3);
                                        i11++;
                                    }
                                    size--;
                                    i13 = i7;
                                }
                                if (z4) {
                                    aVar.f528a.remove(i11);
                                    i11--;
                                } else {
                                    i6 = 1;
                                    aVar2.f531a = 1;
                                    arrayList5.add(fragment2);
                                    i11 += i6;
                                    i10 = 3;
                                    i9 = 1;
                                }
                            } else if (i12 == i10 || i12 == 6) {
                                arrayList5.remove(aVar2.f532b);
                                Fragment fragment4 = aVar2.f532b;
                                if (fragment4 == fragment) {
                                    aVar.f528a.add(i11, new q.a(9, fragment4));
                                    i11++;
                                    fragment = null;
                                }
                            } else if (i12 != 7) {
                                if (i12 == 8) {
                                    aVar.f528a.add(i11, new q.a(9, fragment));
                                    i11++;
                                    fragment = aVar2.f532b;
                                }
                            }
                            i6 = 1;
                            i11 += i6;
                            i10 = 3;
                            i9 = 1;
                        }
                        i6 = 1;
                        arrayList5.add(aVar2.f532b);
                        i11 += i6;
                        i10 = 3;
                        i9 = 1;
                    }
                } else {
                    int i14 = 1;
                    ArrayList<Fragment> arrayList6 = this.A;
                    int size2 = aVar.f528a.size() - 1;
                    while (size2 >= 0) {
                        q.a aVar4 = aVar.f528a.get(size2);
                        int i15 = aVar4.f531a;
                        if (i15 != i14) {
                            if (i15 != 3) {
                                switch (i15) {
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.f532b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                                size2--;
                                i14 = 1;
                            }
                            arrayList6.add(aVar4.f532b);
                            size2--;
                            i14 = 1;
                        }
                        arrayList6.remove(aVar4.f532b);
                        size2--;
                        i14 = 1;
                    }
                }
                z3 = z3 || aVar.h;
                i8++;
                arrayList3 = arrayList2;
            } else {
                this.A.clear();
                if (!z2) {
                    v.a(this, arrayList, arrayList2, i, i2, false);
                }
                int i16 = i;
                while (i16 < i2) {
                    a.h.a.a aVar5 = arrayList.get(i16);
                    if (arrayList2.get(i16).booleanValue()) {
                        aVar5.a(-1);
                        aVar5.a(i16 == i2 + (-1));
                    } else {
                        aVar5.a(1);
                        aVar5.a();
                    }
                    i16++;
                }
                if (z2) {
                    a.d.c<Fragment> cVar = new a.d.c<>();
                    a(cVar);
                    i3 = i;
                    int i17 = i2;
                    for (int i18 = i2 - 1; i18 >= i3; i18--) {
                        a.h.a.a aVar6 = arrayList.get(i18);
                        boolean booleanValue = arrayList2.get(i18).booleanValue();
                        int i19 = 0;
                        while (true) {
                            if (i19 >= aVar6.f528a.size()) {
                                z = false;
                            } else if (a.h.a.a.a(aVar6.f528a.get(i19))) {
                                z = true;
                            } else {
                                i19++;
                            }
                        }
                        if (z && !aVar6.a(arrayList, i18 + 1, i2)) {
                            if (this.D == null) {
                                this.D = new ArrayList<>();
                            }
                            h hVar = new h(aVar6, booleanValue);
                            this.D.add(hVar);
                            for (int i20 = 0; i20 < aVar6.f528a.size(); i20++) {
                                q.a aVar7 = aVar6.f528a.get(i20);
                                if (a.h.a.a.a(aVar7)) {
                                    aVar7.f532b.a(hVar);
                                }
                            }
                            if (booleanValue) {
                                aVar6.a();
                            } else {
                                aVar6.a(false);
                            }
                            i17--;
                            if (i18 != i17) {
                                arrayList.remove(i18);
                                arrayList.add(i17, aVar6);
                            }
                            a(cVar);
                        }
                    }
                    int i21 = cVar.d;
                    for (int i22 = 0; i22 < i21; i22++) {
                        Fragment fragment5 = (Fragment) cVar.f310c[i22];
                        if (!fragment5.l) {
                            View t = fragment5.t();
                            fragment5.O = t.getAlpha();
                            t.setAlpha(0.0f);
                        }
                    }
                    i4 = i17;
                } else {
                    i3 = i;
                    i4 = i2;
                }
                if (i4 != i3 && z2) {
                    v.a(this, arrayList, arrayList2, i, i4, true);
                    a(this.o, true);
                }
                while (i3 < i2) {
                    a.h.a.a aVar8 = arrayList.get(i3);
                    if (arrayList2.get(i3).booleanValue() && (i5 = aVar8.s) >= 0) {
                        c(i5);
                        aVar8.s = -1;
                    }
                    if (aVar8.q != null) {
                        for (int i23 = 0; i23 < aVar8.q.size(); i23++) {
                            aVar8.q.get(i23).run();
                        }
                        aVar8.q = null;
                    }
                    i3++;
                }
                return;
            }
        }
    }

    public void a(a.h.a.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.a(z3);
        } else {
            aVar.a();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            v.a(this, (ArrayList<a.h.a.a>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.o, true);
        }
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.H != null && fragment.M && aVar.b(fragment.x)) {
                float f2 = fragment.O;
                if (f2 > 0.0f) {
                    fragment.H.setAlpha(f2);
                }
                if (z3) {
                    fragment.O = 0.0f;
                } else {
                    fragment.O = -1.0f;
                    fragment.M = false;
                }
            }
        }
    }

    public final void a(a.d.c<Fragment> cVar) {
        int i = this.o;
        if (i < 1) {
            return;
        }
        int min = Math.min(i, 3);
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment.f705b < min) {
                a(fragment, min, fragment.l(), fragment.m(), false);
                if (fragment.H != null && !fragment.z && fragment.M) {
                    cVar.add(fragment);
                }
            }
        }
    }

    public void a(Parcelable parcelable) {
        p pVar;
        if (parcelable == null) {
            return;
        }
        n nVar = (n) parcelable;
        if (nVar.f522b == null) {
            return;
        }
        for (Fragment fragment : this.E.f524b) {
            Iterator<p> it = nVar.f522b.iterator();
            while (true) {
                if (it.hasNext()) {
                    pVar = it.next();
                    if (pVar.f527c.equals(fragment.f)) {
                        break;
                    }
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar == null) {
                a(fragment, 1, 0, 0, false);
                fragment.m = true;
                a(fragment, 0, 0, 0, false);
            } else {
                pVar.o = fragment;
                fragment.d = null;
                fragment.r = 0;
                fragment.o = false;
                fragment.l = false;
                Fragment fragment2 = fragment.h;
                fragment.i = fragment2 != null ? fragment2.f : null;
                fragment.h = null;
                Bundle bundle = pVar.n;
                if (bundle != null) {
                    bundle.setClassLoader(this.p.f497c.getClassLoader());
                    fragment.d = pVar.n.getSparseParcelableArray("android:view_state");
                    fragment.f706c = pVar.n;
                }
            }
        }
        this.g.clear();
        Iterator<p> it2 = nVar.f522b.iterator();
        while (it2.hasNext()) {
            p next = it2.next();
            if (next != null) {
                ClassLoader classLoader = this.p.f497c.getClassLoader();
                a.h.a.g h2 = h();
                if (next.o == null) {
                    Bundle bundle2 = next.k;
                    if (bundle2 != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    Fragment a2 = h2.a(classLoader, next.f526b);
                    next.o = a2;
                    a2.b(next.k);
                    Bundle bundle3 = next.n;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                        next.o.f706c = next.n;
                    } else {
                        next.o.f706c = new Bundle();
                    }
                    Fragment fragment3 = next.o;
                    fragment3.f = next.f527c;
                    fragment3.n = next.d;
                    fragment3.p = true;
                    fragment3.w = next.e;
                    fragment3.x = next.f;
                    fragment3.y = next.g;
                    fragment3.B = next.h;
                    fragment3.m = next.i;
                    fragment3.A = next.j;
                    fragment3.z = next.l;
                    fragment3.R = e.b.values()[next.m];
                    if (G) {
                        StringBuilder a3 = b.a.a.a.a.a("Instantiated fragment ");
                        a3.append(next.o);
                        Log.v("FragmentManager", a3.toString());
                    }
                }
                Fragment fragment4 = next.o;
                fragment4.s = this;
                this.g.put(fragment4.f, fragment4);
                next.o = null;
            }
        }
        this.f.clear();
        ArrayList<String> arrayList = nVar.f523c;
        if (arrayList != null) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String next2 = it3.next();
                Fragment fragment5 = this.g.get(next2);
                if (fragment5 != null) {
                    fragment5.l = true;
                    if (!this.f.contains(fragment5)) {
                        synchronized (this.f) {
                            this.f.add(fragment5);
                        }
                    } else {
                        throw new IllegalStateException("Already added " + fragment5);
                    }
                } else {
                    a(new IllegalStateException("No instantiated fragment for (" + next2 + ")"));
                    throw null;
                }
            }
        }
        if (nVar.d != null) {
            this.h = new ArrayList<>(nVar.d.length);
            int i = 0;
            while (true) {
                a.h.a.b[] bVarArr = nVar.d;
                if (i >= bVarArr.length) {
                    break;
                }
                a.h.a.b bVar = bVarArr[i];
                if (bVar != null) {
                    a.h.a.a aVar = new a.h.a.a(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < bVar.f486b.length) {
                        q.a aVar2 = new q.a();
                        int i4 = i2 + 1;
                        aVar2.f531a = bVar.f486b[i2];
                        if (G) {
                            Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + bVar.f486b[i4]);
                        }
                        String str = bVar.f487c.get(i3);
                        if (str != null) {
                            aVar2.f532b = this.g.get(str);
                        } else {
                            aVar2.f532b = null;
                        }
                        aVar2.g = e.b.values()[bVar.d[i3]];
                        aVar2.h = e.b.values()[bVar.e[i3]];
                        int[] iArr = bVar.f486b;
                        int i5 = i4 + 1;
                        int i6 = iArr[i4];
                        aVar2.f533c = i6;
                        int i7 = i5 + 1;
                        int i8 = iArr[i5];
                        aVar2.d = i8;
                        int i9 = i7 + 1;
                        int i10 = iArr[i7];
                        aVar2.e = i10;
                        int i11 = iArr[i9];
                        aVar2.f = i11;
                        aVar.f529b = i6;
                        aVar.f530c = i8;
                        aVar.d = i10;
                        aVar.e = i11;
                        aVar.f528a.add(aVar2);
                        aVar2.f533c = aVar.f529b;
                        aVar2.d = aVar.f530c;
                        aVar2.e = aVar.d;
                        aVar2.f = aVar.e;
                        i3++;
                        i2 = i9 + 1;
                    }
                    aVar.f = bVar.f;
                    aVar.g = bVar.g;
                    aVar.i = bVar.h;
                    aVar.s = bVar.i;
                    aVar.h = true;
                    aVar.j = bVar.j;
                    aVar.k = bVar.k;
                    aVar.l = bVar.l;
                    aVar.m = bVar.m;
                    aVar.n = bVar.n;
                    aVar.o = bVar.o;
                    aVar.p = bVar.p;
                    aVar.a(1);
                    this.h.add(aVar);
                    int i12 = aVar.s;
                    if (i12 >= 0) {
                        a(i12, aVar);
                    }
                    i++;
                } else {
                    throw null;
                }
            }
        } else {
            this.h = null;
        }
        String str2 = nVar.e;
        if (str2 != null) {
            Fragment fragment6 = this.g.get(str2);
            this.s = fragment6;
            c(fragment6);
        }
        this.e = nVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(a.h.a.h hVar, a.h.a.e eVar, Fragment fragment) {
        a.j.q a2;
        if (this.p == null) {
            this.p = hVar;
            this.q = eVar;
            this.r = fragment;
            if (fragment != null) {
                n();
            }
            if (hVar instanceof a.a.c) {
                a.a.c cVar = (a.a.c) hVar;
                this.j = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                OnBackPressedDispatcher onBackPressedDispatcher = this.j;
                a.a.b bVar = this.k;
                if (onBackPressedDispatcher != null) {
                    a.j.e a3 = fragment2.a();
                    if (((a.j.i) a3).f569b != e.b.DESTROYED) {
                        bVar.f1b.add(new OnBackPressedDispatcher.LifecycleOnBackPressedCancellable(a3, bVar));
                    }
                } else {
                    throw null;
                }
            }
            if (fragment != null) {
                o oVar = fragment.s.E;
                o oVar2 = oVar.f525c.get(fragment.f);
                if (oVar2 == null) {
                    oVar2 = new o(oVar.e);
                    oVar.f525c.put(fragment.f, oVar2);
                }
                this.E = oVar2;
                return;
            }
            if (hVar instanceof a.j.u) {
                a.j.t d2 = ((a.j.u) hVar).d();
                a.j.r rVar = o.h;
                String canonicalName = o.class.getCanonicalName();
                if (canonicalName != null) {
                    String a4 = b.a.a.a.a.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    a.j.q qVar = d2.f577a.get(a4);
                    if (!o.class.isInstance(qVar)) {
                        if (rVar instanceof a.j.s) {
                            a2 = ((a.j.s) rVar).a(a4, o.class);
                        } else {
                            a2 = rVar.a(o.class);
                        }
                        qVar = a2;
                        a.j.q put = d2.f577a.put(a4, qVar);
                        if (put != null) {
                            put.b();
                        }
                    }
                    this.E = (o) qVar;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.E = new o(false);
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    public final void a(int i) {
        try {
            this.d = true;
            a(i, false);
            this.d = false;
            g();
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public void a(boolean z) {
        int size = this.f.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.u.a(z);
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                fragment.F = true;
                fragment.u.a(configuration);
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z ? fragment.u.a(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(fragment);
                    z = true;
                }
            }
        }
        if (this.i != null) {
            for (int i2 = 0; i2 < this.i.size(); i2++) {
                Fragment fragment2 = this.i.get(i2);
                if ((arrayList == null || !arrayList.contains(fragment2)) && fragment2 == null) {
                    throw null;
                }
            }
        }
        this.i = arrayList;
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.o < 1) {
            return false;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null) {
                if (!fragment.z && fragment.u.a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(Menu menu) {
        if (this.o < 1) {
            return;
        }
        for (int i = 0; i < this.f.size(); i++) {
            Fragment fragment = this.f.get(i);
            if (fragment != null && !fragment.z) {
                fragment.u.a(menu);
            }
        }
    }

    public void a(Fragment fragment, e.b bVar) {
        if (this.g.get(fragment.f) == fragment && (fragment.t == null || fragment.s == this)) {
            fragment.R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void a(Fragment fragment, Context context, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.a(fragment, context, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.a(fragment, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }

    public void a(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.r;
        if (fragment2 != null) {
            j jVar = fragment2.s;
            if (jVar instanceof j) {
                jVar.a(fragment, view, bundle, true);
            }
        }
        Iterator<f> it = this.n.iterator();
        while (it.hasNext()) {
            f next = it.next();
            if (!z || next.f507a) {
                throw null;
            }
        }
    }
}
