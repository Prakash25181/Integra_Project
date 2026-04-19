package b.b.a.a.b.u;

import b.b.a.a.c.d;
import b.b.a.a.c.g;
import b.b.a.a.c.h;
import b.b.a.a.f.k0.v.e;
import b.b.a.a.f.k0.v.m;
import b.b.a.a.f.k0.v.p;
import b.b.a.a.f.k0.v.q;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: UpnpMediaLibrary.java */
/* loaded from: classes.dex */
public class c {
    public static c i;

    /* renamed from: a, reason: collision with root package name */
    public a f1065a;
    public Stack<Integer> e;
    public Stack<d.m> f;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.c.d f1066b = b.b.a.a.c.d.e;
    public boolean h = false;
    public h g = null;

    /* renamed from: c, reason: collision with root package name */
    public Stack<Integer> f1067c = new Stack<>();
    public Stack<d.m> d = new Stack<>();

    /* compiled from: UpnpMediaLibrary.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public c() {
        d.a aVar = null;
        this.f1067c.push(0);
        Stack<d.m> stack = this.d;
        b.b.a.a.c.d dVar = this.f1066b;
        if (dVar.f1092c == null) {
            dVar.f1092c = new d.r(aVar);
        }
        stack.push(dVar.f1092c);
        this.d.lastElement().a(true);
    }

    public boolean a() {
        if (this.h) {
            b(this.d);
            this.f1067c = (Stack) this.e.clone();
            Stack<d.m> stack = (Stack) this.f.clone();
            a(stack);
            this.d = stack;
            this.h = false;
            return true;
        }
        if (this.d.size() <= 1) {
            return false;
        }
        this.d.lastElement().c();
        this.d.pop();
        this.f1067c.pop();
        return true;
    }

    public d.m b() {
        return this.d.lastElement();
    }

    public void c() {
        this.h = false;
        this.g = null;
        b(this.f);
        this.e = null;
        this.f = null;
    }

    public final Stack<d.m> b(Stack<d.m> stack) {
        if (stack != null) {
            Iterator<d.m> it = stack.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
        return stack;
    }

    public boolean a(int i2) {
        d.m b2 = b();
        this.f1067c.pop();
        this.f1067c.push(Integer.valueOf(i2));
        if (!b2.e) {
            d.m a2 = b2.a(i2);
            if (a2 != null) {
                this.f1067c.push(0);
                this.d.push(a2);
                this.d.lastElement().a(true);
                this.h = false;
            }
            return false;
        }
        b(this.f);
        this.e = (Stack) this.f1067c.clone();
        Stack<d.m> stack = (Stack) this.d.clone();
        a(stack);
        this.f = stack;
        this.h = true;
        h e = b2.e();
        this.g = e;
        p pVar = (p) this.f1065a;
        m mVar = new m(pVar.getActivity(), pVar.e);
        pVar.a((e) mVar, true);
        d dVar = pVar.e.u;
        dVar.stop();
        dVar.l = null;
        dVar.f = e;
        dVar.l = new short[((g) e).a()];
        h hVar = dVar.f;
        if (hVar != null) {
            if (i2 >= 0 && ((g) hVar).a() > i2) {
                dVar.a(i2, false);
                if (dVar.d != 0) {
                    i2 = 0;
                }
                dVar.b(i2);
                pVar.g.a(1, 350, new q(pVar, mVar));
                return true;
            }
            throw new IllegalArgumentException();
        }
        throw null;
    }

    public final Stack<d.m> a(Stack<d.m> stack) {
        if (stack != null) {
            Iterator<d.m> it = stack.iterator();
            while (it.hasNext()) {
                it.next().a(true);
            }
        }
        return stack;
    }
}
