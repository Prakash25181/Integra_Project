package b.b.a.a.b.m;

import b.b.a.a.b.p.g;

/* compiled from: ColorKey.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f767a = {0, 1, 2, 3};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f768b = {1, 2, 0, 3};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f769c = {1, 2, 3, 0};

    public static int[] a(g.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return f768b;
        }
        if (ordinal == 1) {
            return f769c;
        }
        if (ordinal != 2) {
            return f768b;
        }
        return f767a;
    }
}
