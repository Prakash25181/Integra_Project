package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    public c<K, V> f301b;

    /* renamed from: c, reason: collision with root package name */
    public c<K, V> f302c;
    public WeakHashMap<f<K, V>, Boolean> d = new WeakHashMap<>();
    public int e = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.e;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: a.c.a.b.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0010b<K, V> extends e<K, V> {
        public C0010b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public final K f303b;

        /* renamed from: c, reason: collision with root package name */
        public final V f304c;
        public c<K, V> d;
        public c<K, V> e;

        public c(K k, V v) {
            this.f303b = k;
            this.f304c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f303b.equals(cVar.f303b) && this.f304c.equals(cVar.f304c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f303b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f304c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f303b.hashCode() ^ this.f304c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f303b + "=" + this.f304c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f305b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f306c = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f305b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.e;
                this.f305b = cVar3;
                this.f306c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f306c) {
                return b.this.f301b != null;
            }
            c<K, V> cVar = this.f305b;
            return (cVar == null || cVar.d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f306c) {
                this.f306c = false;
                this.f305b = b.this.f301b;
            } else {
                c<K, V> cVar = this.f305b;
                this.f305b = cVar != null ? cVar.d : null;
            }
            return this.f305b;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b, reason: collision with root package name */
        public c<K, V> f307b;

        /* renamed from: c, reason: collision with root package name */
        public c<K, V> f308c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f307b = cVar2;
            this.f308c = cVar;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f307b == cVar && cVar == this.f308c) {
                this.f308c = null;
                this.f307b = null;
            }
            c<K, V> cVar3 = this.f307b;
            if (cVar3 == cVar) {
                this.f307b = b(cVar3);
            }
            c<K, V> cVar4 = this.f308c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f307b;
                if (cVar4 != cVar5 && cVar5 != null) {
                    cVar2 = c(cVar4);
                }
                this.f308c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f308c != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f308c;
            c<K, V> cVar2 = this.f307b;
            this.f308c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k) {
        c<K, V> cVar = this.f301b;
        while (cVar != null && !cVar.f303b.equals(k)) {
            cVar = cVar.d;
        }
        return cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((a.c.a.b.b.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof a.c.a.b.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.c.a.b.b r7 = (a.c.a.b.b) r7
            int r1 = r6.e
            int r3 = r7.e
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            a.c.a.b.b$e r3 = (a.c.a.b.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            a.c.a.b.b$e r4 = (a.c.a.b.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            a.c.a.b.b$e r7 = (a.c.a.b.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c.a.b.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f301b, this.f302c);
        this.d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.e--;
        if (!this.d.isEmpty()) {
            Iterator<f<K, V>> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(a2);
            }
        }
        c<K, V> cVar = a2.e;
        if (cVar != null) {
            cVar.d = a2.d;
        } else {
            this.f301b = a2.d;
        }
        c<K, V> cVar2 = a2.d;
        if (cVar2 != null) {
            cVar2.e = a2.e;
        } else {
            this.f302c = a2.e;
        }
        a2.d = null;
        a2.e = null;
        return a2.f304c;
    }

    public String toString() {
        StringBuilder a2 = b.a.a.a.a.a("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a2.append(", ");
                }
            } else {
                a2.append("]");
                return a2.toString();
            }
        }
    }

    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.e++;
        c<K, V> cVar2 = this.f302c;
        if (cVar2 == null) {
            this.f301b = cVar;
            this.f302c = cVar;
            return cVar;
        }
        cVar2.d = cVar;
        cVar.e = cVar2;
        this.f302c = cVar;
        return cVar;
    }

    public b<K, V>.d a() {
        b<K, V>.d dVar = new d();
        this.d.put(dVar, false);
        return dVar;
    }
}
