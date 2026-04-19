package a.d;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: SimpleArrayMap.java */
/* loaded from: classes.dex */
public class h<K, V> {
    public static Object[] e;
    public static int f;
    public static Object[] g;
    public static int h;

    /* renamed from: b, reason: collision with root package name */
    public int[] f329b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f330c;
    public int d;

    public h() {
        this.f329b = d.f311a;
        this.f330c = d.f313c;
        this.d = 0;
    }

    public int a(Object obj, int i) {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f329b, i2, i);
            if (a2 < 0 || obj.equals(this.f330c[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f329b[i3] == i) {
                if (obj.equals(this.f330c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f329b[i4] == i; i4--) {
                if (obj.equals(this.f330c[i4 << 1])) {
                    return i4;
                }
            }
            return i3 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int b(Object obj) {
        int i = this.d * 2;
        Object[] objArr = this.f330c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V c(int i) {
        Object[] objArr = this.f330c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.d;
        int i4 = 0;
        if (i3 <= 1) {
            a(this.f329b, objArr, i3);
            this.f329b = d.f311a;
            this.f330c = d.f313c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f329b;
            if (iArr.length > 8 && i3 < iArr.length / 3) {
                int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr2 = this.f329b;
                Object[] objArr2 = this.f330c;
                a(i6);
                if (i3 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr2, 0, this.f329b, 0, i);
                    System.arraycopy(objArr2, 0, this.f330c, 0, i2);
                }
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr2, i7, this.f329b, i, i8);
                    System.arraycopy(objArr2, i7 << 1, this.f330c, i2, i8 << 1);
                }
            } else {
                if (i < i5) {
                    int[] iArr3 = this.f329b;
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr3, i9, iArr3, i, i10);
                    Object[] objArr3 = this.f330c;
                    System.arraycopy(objArr3, i9 << 1, objArr3, i2, i10 << 1);
                }
                Object[] objArr4 = this.f330c;
                int i11 = i5 << 1;
                objArr4[i11] = null;
                objArr4[i11 + 1] = null;
            }
            i4 = i5;
        }
        if (i3 == this.d) {
            this.d = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.d;
        if (i > 0) {
            int[] iArr = this.f329b;
            Object[] objArr = this.f330c;
            this.f329b = d.f311a;
            this.f330c = d.f313c;
            this.d = 0;
            a(iArr, objArr, i);
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        return (V) this.f330c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.d != hVar.d) {
                return false;
            }
            for (int i = 0; i < this.d; i++) {
                try {
                    K b2 = b(i);
                    V d = d(i);
                    Object obj2 = hVar.get(b2);
                    if (d == null) {
                        if (obj2 != null || !hVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.d; i2++) {
                try {
                    K b3 = b(i2);
                    V d2 = d(i2);
                    Object obj3 = map.get(b3);
                    if (d2 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!d2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? (V) this.f330c[(a2 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f329b;
        Object[] objArr = this.f330c;
        int i = this.d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public boolean isEmpty() {
        return this.d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int a2;
        int i2 = this.d;
        if (k == null) {
            a2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            a2 = a(k, hashCode);
        }
        if (a2 >= 0) {
            int i3 = (a2 << 1) + 1;
            Object[] objArr = this.f330c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = a2 ^ (-1);
        if (i2 >= this.f329b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f329b;
            Object[] objArr2 = this.f330c;
            a(i5);
            if (i2 == this.d) {
                int[] iArr2 = this.f329b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr2, 0, this.f330c, 0, objArr2.length);
                }
                a(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.f329b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f330c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.d - i4) << 1);
        }
        int i7 = this.d;
        if (i2 == i7) {
            int[] iArr4 = this.f329b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f330c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return c(a2);
        }
        return null;
    }

    public V replace(K k, V v) {
        int a2 = a(k);
        if (a2 >= 0) {
            return a(a2, (int) v);
        }
        return null;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        for (int i = 0; i < this.d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d = d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 < 0) {
            return false;
        }
        V d = d(a2);
        if (obj2 != d && (obj2 == null || !obj2.equals(d))) {
            return false;
        }
        c(a2);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int a2 = a(k);
        if (a2 < 0) {
            return false;
        }
        V d = d(a2);
        if (d != v && (v == null || !v.equals(d))) {
            return false;
        }
        a(a2, (int) v2);
        return true;
    }

    public h(int i) {
        if (i == 0) {
            this.f329b = d.f311a;
            this.f330c = d.f313c;
        } else {
            a(i);
        }
        this.d = 0;
    }

    public K b(int i) {
        return (K) this.f330c[i << 1];
    }

    public int a() {
        int i = this.d;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f329b, i, 0);
            if (a2 < 0 || this.f330c[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f329b[i2] == 0) {
                if (this.f330c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.f329b[i3] == 0; i3--) {
                if (this.f330c[i3 << 1] == null) {
                    return i3;
                }
            }
            return i2 ^ (-1);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (h.class) {
                if (g != null) {
                    Object[] objArr = g;
                    this.f330c = objArr;
                    g = (Object[]) objArr[0];
                    this.f329b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (h.class) {
                if (e != null) {
                    Object[] objArr2 = e;
                    this.f330c = objArr2;
                    e = (Object[]) objArr2[0];
                    this.f329b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f--;
                    return;
                }
            }
        }
        this.f329b = new int[i];
        this.f330c = new Object[i << 1];
    }

    public static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (h.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (h.class) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        }
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f330c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }
}
