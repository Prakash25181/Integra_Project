package a.d;

/* compiled from: SparseArrayCompat.java */
/* loaded from: classes.dex */
public class i<E> implements Cloneable {
    public static final Object f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f331b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f332c;
    public Object[] d;
    public int e;

    public i() {
        this(10);
    }

    public E a(int i) {
        return b(i, null);
    }

    public E b(int i, E e) {
        int a2 = d.a(this.f332c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            if (objArr[a2] != f) {
                return (E) objArr[a2];
            }
        }
        return e;
    }

    public void c(int i) {
        int a2 = d.a(this.f332c, this.e, i);
        if (a2 >= 0) {
            Object[] objArr = this.d;
            Object obj = objArr[a2];
            Object obj2 = f;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.f331b = true;
            }
        }
    }

    public E d(int i) {
        if (this.f331b) {
            a();
        }
        return (E) this.d[i];
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            E d = d(i);
            if (d != this) {
                sb.append(d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public i(int i) {
        this.f331b = false;
        if (i == 0) {
            this.f332c = d.f311a;
            this.d = d.f313c;
        } else {
            int b2 = d.b(i);
            this.f332c = new int[b2];
            this.d = new Object[b2];
        }
    }

    public final void a() {
        int i = this.e;
        int[] iArr = this.f332c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f331b = false;
        this.e = i2;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public i<E> m1clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f332c = (int[]) this.f332c.clone();
            iVar.d = (Object[]) this.d.clone();
            return iVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public int b() {
        if (this.f331b) {
            a();
        }
        return this.e;
    }

    public void c(int i, E e) {
        int a2 = d.a(this.f332c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = e;
            return;
        }
        int i2 = a2 ^ (-1);
        if (i2 < this.e) {
            Object[] objArr = this.d;
            if (objArr[i2] == f) {
                this.f332c[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f331b && this.e >= this.f332c.length) {
            a();
            i2 = d.a(this.f332c, this.e, i) ^ (-1);
        }
        int i3 = this.e;
        if (i3 >= this.f332c.length) {
            int b2 = d.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr2 = new Object[b2];
            int[] iArr2 = this.f332c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f332c = iArr;
            this.d = objArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.f332c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            Object[] objArr4 = this.d;
            System.arraycopy(objArr4, i2, objArr4, i5, this.e - i2);
        }
        this.f332c[i2] = i;
        this.d[i2] = e;
        this.e++;
    }

    public int b(int i) {
        if (this.f331b) {
            a();
        }
        return this.f332c[i];
    }

    public void a(int i, E e) {
        int i2 = this.e;
        if (i2 != 0 && i <= this.f332c[i2 - 1]) {
            c(i, e);
            return;
        }
        if (this.f331b && this.e >= this.f332c.length) {
            a();
        }
        int i3 = this.e;
        if (i3 >= this.f332c.length) {
            int b2 = d.b(i3 + 1);
            int[] iArr = new int[b2];
            Object[] objArr = new Object[b2];
            int[] iArr2 = this.f332c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f332c = iArr;
            this.d = objArr;
        }
        this.f332c[i3] = i;
        this.d[i3] = e;
        this.e = i3 + 1;
    }
}
