package b.b.a.a.b.n;

import b.b.a.a.b.k;
import b.b.a.a.b.o.h;
import b.b.a.a.b.o.r;
import b.b.a.a.b.o.s;
import java.lang.reflect.Array;

/* compiled from: DemoZone.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public a f792a;

    /* renamed from: b, reason: collision with root package name */
    public k f793b;

    /* renamed from: c, reason: collision with root package name */
    public s f794c;
    public boolean d;
    public boolean e;
    public int f;
    public h g;
    public int[] h;
    public int[][] i;

    public f(a aVar, s sVar) {
        this.f792a = aVar;
        this.f794c = sVar;
        r rVar = sVar.f839b;
        this.f793b = k.m[rVar.f836b];
        this.d = rVar == r.MAIN;
        this.e = false;
        s sVar2 = this.f794c;
        this.f = (sVar2.f + sVar2.e) / 2;
        if (sVar2.f839b == r.MAIN) {
            this.g = this.f792a.f775b.V.get(0).f817b;
        } else {
            this.g = h.SOURCE;
        }
        this.h = new int[3];
        for (int i = 0; i < 3; i++) {
            this.h[i] = 0;
        }
        this.i = (int[][]) Array.newInstance((Class<?>) int.class, 7, 2);
        for (int i2 = 0; i2 < 7; i2++) {
            int[][] iArr = this.i;
            int[] iArr2 = iArr[i2];
            iArr[i2][1] = 0;
            iArr2[0] = 0;
        }
    }

    public final void a(h hVar) {
        if (hVar != this.g) {
            this.g = hVar;
            this.f792a.a(this.f793b.d, String.format("%02X", Integer.valueOf(hVar.f815b)));
        }
    }
}
