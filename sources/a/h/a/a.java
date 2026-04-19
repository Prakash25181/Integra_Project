package a.h.a;

import a.h.a.q;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* loaded from: classes.dex */
public final class a extends q {
    public final j r;
    public int s = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    public void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(false);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.f529b != 0 || this.f530c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f529b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f530c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.j != 0 || this.k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.k);
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.m);
            }
        }
        if (this.f528a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f528a.size();
        for (int i = 0; i < size; i++) {
            q.a aVar = this.f528a.get(i);
            switch (aVar.f531a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    StringBuilder a2 = b.a.a.a.a.a("cmd=");
                    a2.append(aVar.f531a);
                    str2 = a2.toString();
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f532b);
            if (z) {
                if (aVar.f533c != 0 || aVar.d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f533c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.d));
                }
                if (aVar.e != 0 || aVar.f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f));
                }
            }
        }
    }

    public boolean b(int i) {
        int size = this.f528a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f528a.get(i2).f532b;
            int i3 = fragment != null ? fragment.x : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    public void a(int i) {
        if (this.h) {
            if (j.G) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f528a.size();
            for (int i2 = 0; i2 < size; i2++) {
                q.a aVar = this.f528a.get(i2);
                Fragment fragment = aVar.f532b;
                if (fragment != null) {
                    fragment.r += i;
                    if (j.G) {
                        StringBuilder a2 = b.a.a.a.a.a("Bump nesting of ");
                        a2.append(aVar.f532b);
                        a2.append(" to ");
                        a2.append(aVar.f532b.r);
                        Log.v("FragmentManager", a2.toString());
                    }
                }
            }
        }
    }

    public boolean a(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f528a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f528a.get(i4).f532b;
            int i5 = fragment != null ? fragment.x : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f528a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f528a.get(i7).f532b;
                        if ((fragment2 != null ? fragment2.x : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public void a() {
        int size = this.f528a.size();
        for (int i = 0; i < size; i++) {
            q.a aVar = this.f528a.get(i);
            Fragment fragment = aVar.f532b;
            if (fragment != null) {
                int i2 = this.f;
                int i3 = this.g;
                if (fragment.L != null || i2 != 0 || i3 != 0) {
                    fragment.f();
                    Fragment.b bVar = fragment.L;
                    bVar.e = i2;
                    bVar.f = i3;
                }
            }
            switch (aVar.f531a) {
                case 1:
                    fragment.a(aVar.f533c);
                    this.r.a(fragment, false);
                    break;
                case 2:
                default:
                    StringBuilder a2 = b.a.a.a.a.a("Unknown cmd: ");
                    a2.append(aVar.f531a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.a(aVar.d);
                    this.r.h(fragment);
                    break;
                case 4:
                    fragment.a(aVar.d);
                    if (this.r != null) {
                        if (!fragment.z) {
                            fragment.z = true;
                            fragment.N = !fragment.N;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 5:
                    fragment.a(aVar.f533c);
                    if (this.r != null) {
                        if (fragment.z) {
                            fragment.z = false;
                            fragment.N = !fragment.N;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 6:
                    fragment.a(aVar.d);
                    this.r.b(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f533c);
                    this.r.a(fragment);
                    break;
                case 8:
                    this.r.j(fragment);
                    break;
                case 9:
                    this.r.j(null);
                    break;
                case 10:
                    this.r.a(fragment, aVar.h);
                    break;
            }
            if (!this.p && aVar.f531a != 1 && fragment != null) {
                this.r.g(fragment);
            }
        }
        if (this.p) {
            return;
        }
        j jVar = this.r;
        jVar.a(jVar.o, true);
    }

    public void a(boolean z) {
        for (int size = this.f528a.size() - 1; size >= 0; size--) {
            q.a aVar = this.f528a.get(size);
            Fragment fragment = aVar.f532b;
            if (fragment != null) {
                int d = j.d(this.f);
                int i = this.g;
                if (fragment.L != null || d != 0 || i != 0) {
                    fragment.f();
                    Fragment.b bVar = fragment.L;
                    bVar.e = d;
                    bVar.f = i;
                }
            }
            switch (aVar.f531a) {
                case 1:
                    fragment.a(aVar.f);
                    this.r.h(fragment);
                    break;
                case 2:
                default:
                    StringBuilder a2 = b.a.a.a.a.a("Unknown cmd: ");
                    a2.append(aVar.f531a);
                    throw new IllegalArgumentException(a2.toString());
                case 3:
                    fragment.a(aVar.e);
                    this.r.a(fragment, false);
                    break;
                case 4:
                    fragment.a(aVar.e);
                    if (this.r != null) {
                        if (fragment.z) {
                            fragment.z = false;
                            fragment.N = !fragment.N;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 5:
                    fragment.a(aVar.f);
                    if (this.r != null) {
                        if (!fragment.z) {
                            fragment.z = true;
                            fragment.N = !fragment.N;
                            break;
                        }
                    } else {
                        throw null;
                    }
                    break;
                case 6:
                    fragment.a(aVar.e);
                    this.r.a(fragment);
                    break;
                case 7:
                    fragment.a(aVar.f);
                    this.r.b(fragment);
                    break;
                case 8:
                    this.r.j(null);
                    break;
                case 9:
                    this.r.j(fragment);
                    break;
                case 10:
                    this.r.a(fragment, aVar.g);
                    break;
            }
            if (!this.p && aVar.f531a != 3 && fragment != null) {
                this.r.g(fragment);
            }
        }
        if (this.p || !z) {
            return;
        }
        j jVar = this.r;
        jVar.a(jVar.o, true);
    }

    public static boolean a(q.a aVar) {
        Fragment fragment = aVar.f532b;
        if (fragment == null || !fragment.l || fragment.H == null || fragment.A || fragment.z) {
            return false;
        }
        Fragment.b bVar = fragment.L;
        return bVar == null ? false : bVar.q;
    }
}
