package a.d;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public class b<E> extends g<E, E> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    @Override // a.d.g
    public Object a(int i, int i2) {
        return this.d.f310c[i];
    }

    @Override // a.d.g
    public int b(Object obj) {
        return this.d.a(obj);
    }

    @Override // a.d.g
    public int c() {
        return this.d.d;
    }

    @Override // a.d.g
    public int a(Object obj) {
        return this.d.a(obj);
    }

    @Override // a.d.g
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.d.g
    public void a(E e, E e2) {
        this.d.add(e);
    }

    @Override // a.d.g
    public E a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // a.d.g
    public void a(int i) {
        this.d.b(i);
    }

    @Override // a.d.g
    public void a() {
        this.d.clear();
    }
}
