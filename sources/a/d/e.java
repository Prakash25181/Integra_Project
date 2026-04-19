package a.d;

/* compiled from: LongSparseArray.java */
/* loaded from: classes.dex */
public class e<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f314b = false;

    /* renamed from: c, reason: collision with root package name */
    public long[] f315c;
    public Object[] d;
    public int e;

    public e() {
        int c2 = d.c(10);
        this.f315c = new long[c2];
        this.d = new Object[c2];
    }

    public final void a() {
        int i = this.e;
        long[] jArr = this.f315c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f314b = false;
        this.e = i2;
    }

    public E b(long j, E e) {
        int a2 = d.a(this.f315c, this.e, j);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public void c(long j, E e) {
        int a2 = d.a(this.f315c, this.e, j);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i = a2 ^ (-1);
        if (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] == f) {
                this.f315c[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f314b && this.e >= this.f315c.length) {
            a();
            i = d.a(this.f315c, this.e, j) ^ (-1);
        }
        int i2 = this.e;
        if (i2 >= this.f315c.length) {
            int c2 = d.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr2 = new Object[c2];
            long[] jArr2 = this.f315c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f315c = jArr;
            this.d = objArr2;
        }
        int i3 = this.e;
        if (i3 - i != 0) {
            long[] jArr3 = this.f315c;
            int i4 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i4, i3 - i);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i, objArr4, i4, this.e - i);
        }
        this.f315c[i] = j;
        this.d[i] = e;
        this.e++;
    }

    public String toString() {
        if (this.f314b) {
            a();
        }
        int i = this.e;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f314b) {
                a();
            }
            sb.append(this.f315c[i2]);
            sb.append('=');
            if (this.f314b) {
                a();
            }
            Object obj = this.d[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public e<E> m0clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f315c = (long[]) this.f315c.clone();
            eVar.d = (Object[]) this.d.clone();
            return eVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void a(long j, E e) {
        int i = this.e;
        if (i != 0 && j <= this.f315c[i - 1]) {
            c(j, e);
            return;
        }
        if (this.f314b && this.e >= this.f315c.length) {
            a();
        }
        int i2 = this.e;
        if (i2 >= this.f315c.length) {
            int c2 = d.c(i2 + 1);
            long[] jArr = new long[c2];
            Object[] objArr = new Object[c2];
            long[] jArr2 = this.f315c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f315c = jArr;
            this.d = objArr;
        }
        this.f315c[i2] = j;
        this.d[i2] = e;
        this.e = i2 + 1;
    }
}
