package a.h.a;

import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransition.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f541a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f542b;

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f543c;

    /* compiled from: FragmentTransition.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f544a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f545b;

        /* renamed from: c, reason: collision with root package name */
        public a.h.a.a f546c;
        public Fragment d;
        public boolean e;
        public a.h.a.a f;
    }

    static {
        d0 d0Var = null;
        f542b = Build.VERSION.SDK_INT >= 21 ? new y() : null;
        try {
            d0Var = (d0) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        f543c = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0235  */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.d.h] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(a.h.a.j r39, java.util.ArrayList<a.h.a.a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 1192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.v.a(a.h.a.j, java.util.ArrayList, java.util.ArrayList, int, int, boolean):void");
    }

    public static a.d.a<String, View> b(d0 d0Var, a.d.a<String, String> aVar, Object obj, a aVar2) {
        ArrayList<String> arrayList;
        if (!aVar.isEmpty() && obj != null) {
            Fragment fragment = aVar2.d;
            a.d.a<String, View> aVar3 = new a.d.a<>();
            d0Var.a(aVar3, fragment.t());
            a.h.a.a aVar4 = aVar2.f;
            if (aVar2.e) {
                arrayList = aVar4.o;
            } else {
                arrayList = aVar4.n;
            }
            a.d.g.a((Map) aVar3, (Collection<?>) arrayList);
            a.d.g.a((Map) aVar, (Collection<?>) aVar3.keySet());
            return aVar3;
        }
        aVar.clear();
        return null;
    }

    public static Object b(d0 d0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.h) == Fragment.W) {
                obj = fragment.j();
            }
        } else {
            obj = fragment.k();
        }
        return d0Var.a(obj);
    }

    public static d0 a(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object k = fragment.k();
            if (k != null) {
                arrayList.add(k);
            }
            Fragment.b bVar = fragment.L;
            if (bVar == null) {
                obj2 = null;
            } else {
                obj2 = bVar.h;
                if (obj2 == Fragment.W) {
                    obj2 = fragment.j();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            Fragment.b bVar2 = fragment.L;
            if (bVar2 == null) {
                obj3 = null;
            } else {
                obj3 = bVar2.l;
                if (obj3 == Fragment.W) {
                    obj3 = fragment.o();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object j = fragment2.j();
            if (j != null) {
                arrayList.add(j);
            }
            Fragment.b bVar3 = fragment2.L;
            if (bVar3 == null) {
                obj = null;
            } else {
                obj = bVar3.j;
                if (obj == Fragment.W) {
                    obj = fragment2.k();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object o = fragment2.o();
            if (o != null) {
                arrayList.add(o);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        d0 d0Var = f542b;
        if (d0Var != null && a(d0Var, arrayList)) {
            return f542b;
        }
        d0 d0Var2 = f543c;
        if (d0Var2 != null && a(d0Var2, arrayList)) {
            return f543c;
        }
        if (f542b == null && f543c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static boolean a(d0 d0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (((y) d0Var) == null) {
                throw null;
            }
            if (!(obj instanceof Transition)) {
                return false;
            }
        }
        return true;
    }

    public static void a(ArrayList<View> arrayList, a.d.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.d - 1; i >= 0; i--) {
            View d = aVar.d(i);
            if (collection.contains(a.e.k.n.e(d))) {
                arrayList.add(d);
            }
        }
    }

    public static a.d.a<String, View> a(d0 d0Var, a.d.a<String, String> aVar, Object obj, a aVar2) {
        ArrayList<String> arrayList;
        View view = aVar2.f544a.H;
        if (!aVar.isEmpty() && obj != null && view != null) {
            a.d.a<String, View> aVar3 = new a.d.a<>();
            d0Var.a(aVar3, view);
            a.h.a.a aVar4 = aVar2.f546c;
            if (aVar2.f545b) {
                arrayList = aVar4.n;
            } else {
                arrayList = aVar4.o;
            }
            if (arrayList != null) {
                a.d.g.a((Map) aVar3, (Collection<?>) arrayList);
                a.d.g.a((Map) aVar3, (Collection<?>) aVar.values());
            }
            int i = aVar.d;
            while (true) {
                i--;
                if (i < 0) {
                    return aVar3;
                }
                if (!aVar3.containsKey(aVar.d(i))) {
                    aVar.c(i);
                }
            }
        } else {
            aVar.clear();
            return null;
        }
    }

    public static View a(a.d.a<String, View> aVar, a aVar2, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a.h.a.a aVar3 = aVar2.f546c;
        if (obj == null || aVar == null || (arrayList = aVar3.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar3.n.get(0);
        } else {
            str = aVar3.o.get(0);
        }
        return aVar.get(str);
    }

    public static void a(d0 d0Var, Object obj, Object obj2, a.d.a<String, View> aVar, boolean z, a.h.a.a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (z) {
            str = aVar2.o.get(0);
        } else {
            str = aVar2.n.get(0);
        }
        View view = aVar.get(str);
        y yVar = (y) d0Var;
        if (yVar == null) {
            throw null;
        }
        if (view != null) {
            Rect rect = new Rect();
            yVar.a(view, rect);
            ((Transition) obj).setEpicenterCallback(new w(yVar, rect));
        }
        if (obj2 == null || view == null) {
            return;
        }
        Rect rect2 = new Rect();
        yVar.a(view, rect2);
        ((Transition) obj2).setEpicenterCallback(new w(yVar, rect2));
    }

    public static ArrayList<View> a(d0 d0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.H;
        if (view2 != null) {
            d0Var.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        d0Var.a(obj, arrayList2);
        return arrayList2;
    }

    public static void a(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0088, code lost:
    
        if (r6.z == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0038, code lost:
    
        if (r6.l != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008a, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0076, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(a.h.a.a r11, a.h.a.q.a r12, android.util.SparseArray<a.h.a.v.a> r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.v.a(a.h.a.a, a.h.a.q$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static Object a(d0 d0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.L;
            if (bVar != null && (obj = bVar.j) == Fragment.W) {
                obj = fragment.k();
            }
        } else {
            obj = fragment.j();
        }
        return d0Var.a(obj);
    }

    public static Object a(d0 d0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object o;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment2.L;
            if (bVar == null) {
                o = null;
            } else {
                o = bVar.l;
                if (o == Fragment.W) {
                    o = fragment2.o();
                }
            }
        } else {
            o = fragment.o();
        }
        Object a2 = d0Var.a(o);
        if (a2 == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) a2);
        return transitionSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(a.h.a.d0 r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, androidx.fragment.app.Fragment r5, boolean r6) {
        /*
            r0 = 1
            if (r2 == 0) goto L25
            if (r3 == 0) goto L25
            if (r5 == 0) goto L25
            if (r6 == 0) goto L17
            androidx.fragment.app.Fragment$b r5 = r5.L
            if (r5 == 0) goto L25
            java.lang.Boolean r5 = r5.m
            if (r5 != 0) goto L12
            goto L25
        L12:
            boolean r5 = r5.booleanValue()
            goto L26
        L17:
            androidx.fragment.app.Fragment$b r5 = r5.L
            if (r5 == 0) goto L25
            java.lang.Boolean r5 = r5.n
            if (r5 != 0) goto L20
            goto L25
        L20:
            boolean r5 = r5.booleanValue()
            goto L26
        L25:
            r5 = 1
        L26:
            r6 = 0
            if (r5 == 0) goto L49
            a.h.a.y r1 = (a.h.a.y) r1
            if (r1 == 0) goto L48
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r3 == 0) goto L39
            android.transition.Transition r3 = (android.transition.Transition) r3
            r1.addTransition(r3)
        L39:
            if (r2 == 0) goto L40
            android.transition.Transition r2 = (android.transition.Transition) r2
            r1.addTransition(r2)
        L40:
            if (r4 == 0) goto L81
            android.transition.Transition r4 = (android.transition.Transition) r4
            r1.addTransition(r4)
            goto L81
        L48:
            throw r6
        L49:
            a.h.a.y r1 = (a.h.a.y) r1
            if (r1 == 0) goto L82
            android.transition.Transition r3 = (android.transition.Transition) r3
            android.transition.Transition r2 = (android.transition.Transition) r2
            android.transition.Transition r4 = (android.transition.Transition) r4
            if (r3 == 0) goto L69
            if (r2 == 0) goto L69
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            android.transition.TransitionSet r1 = r1.addTransition(r3)
            android.transition.TransitionSet r1 = r1.addTransition(r2)
            android.transition.TransitionSet r6 = r1.setOrdering(r0)
            goto L70
        L69:
            if (r3 == 0) goto L6d
            r6 = r3
            goto L70
        L6d:
            if (r2 == 0) goto L70
            r6 = r2
        L70:
            if (r4 == 0) goto L80
            android.transition.TransitionSet r1 = new android.transition.TransitionSet
            r1.<init>()
            if (r6 == 0) goto L7c
            r1.addTransition(r6)
        L7c:
            r1.addTransition(r4)
            goto L81
        L80:
            r1 = r6
        L81:
            return r1
        L82:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.h.a.v.a(a.h.a.d0, java.lang.Object, java.lang.Object, java.lang.Object, androidx.fragment.app.Fragment, boolean):java.lang.Object");
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z, a.d.a<String, View> aVar, boolean z2) {
        if (z) {
            Fragment.b bVar = fragment2.L;
        } else {
            Fragment.b bVar2 = fragment.L;
        }
    }
}
