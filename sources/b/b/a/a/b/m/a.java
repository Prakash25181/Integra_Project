package b.b.a.a.b.m;

import b.b.a.a.b.o.r;
import b.b.a.a.b.p.d;

/* compiled from: BdDvdRemoteController.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.p.d f764a;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.p.v.a f765b;

    public a(b.b.a.a.b.p.d dVar, r rVar) {
        this.f764a = dVar;
        if (rVar == r.MAIN) {
            this.f765b = b.b.a.a.b.p.v.a.CDV;
            d.e eVar = d.e.MAIN;
        } else {
            this.f765b = b.b.a.a.b.p.v.a.CD2;
            d.e eVar2 = d.e.ZONE2;
        }
    }

    public void a(int i) {
        if (!this.f764a.b().q.y || i < 0 || i > 3) {
            return;
        }
        a(String.format("%c", Character.valueOf((char) (i + 65))));
    }

    public void b(int i) {
        if (i < 0 || i > 9) {
            return;
        }
        a(String.format("%d", Integer.valueOf(i)));
    }

    public final void a(String str) {
        this.f764a.a(this.f765b, str);
    }
}
