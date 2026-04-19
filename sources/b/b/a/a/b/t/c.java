package b.b.a.a.b.t;

import b.b.a.a.b.l;
import b.b.a.a.b.o.m;
import b.b.a.a.b.o.o;
import b.b.a.a.b.p.g;

/* compiled from: Tuner.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f1051a;

    /* renamed from: b, reason: collision with root package name */
    public l f1052b;

    /* renamed from: c, reason: collision with root package name */
    public m f1053c = m.NONE;
    public int d;
    public int e;
    public o f;

    public c(l lVar, b.b.a.a.b.p.d dVar) {
        this.f1051a = dVar;
        this.f1052b = lVar;
    }

    public static String b(m mVar) {
        int ordinal = mVar.ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? "" : "ch" : "KHz" : "MHz";
    }

    public f a(m mVar) {
        return this.f1051a.a(mVar);
    }

    public String a(m mVar, int i) {
        int ordinal = mVar.ordinal();
        if (ordinal != 1) {
            return (ordinal == 2 || ordinal == 3) ? String.format("%d", Integer.valueOf(i)) : "";
        }
        if ((!this.f1051a.f852c.d() && this.f1051a.f852c.e == g.b.EU_or_ASIA) || this.f1051a.n == 50) {
            double d = i;
            Double.isNaN(d);
            Double.isNaN(d);
            return String.format("%.2f", Double.valueOf(d / 1000.0d));
        }
        double d2 = i;
        Double.isNaN(d2);
        Double.isNaN(d2);
        return String.format("%.1f", Double.valueOf(d2 / 1000.0d));
    }
}
