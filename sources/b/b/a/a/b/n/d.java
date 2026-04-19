package b.b.a.a.b.n;

import b.b.a.a.b.o.m;
import b.b.a.a.b.o.r;
import java.io.CharConversionException;

/* compiled from: DemoTuner.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.n.a f786a;

    /* renamed from: b, reason: collision with root package name */
    public m f787b = m.FM;

    /* renamed from: c, reason: collision with root package name */
    public a[] f788c;
    public int[] d;
    public int e;

    /* compiled from: DemoTuner.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f789a;

        /* renamed from: b, reason: collision with root package name */
        public int f790b;

        /* renamed from: c, reason: collision with root package name */
        public int f791c;
        public int d;

        public a(d dVar, int i, int i2, int i3, int i4) {
            this.f789a = i;
            this.f790b = i2;
            this.f791c = i3;
            this.d = i4;
        }
    }

    public d(b.b.a.a.b.n.a aVar) {
        this.f786a = aVar;
        a[] aVarArr = new a[2];
        this.f788c = aVarArr;
        aVarArr[0] = new a(this, 87500, 107900, 200, 87500);
        this.f788c[1] = new a(this, 522, 1710, 9, 522);
        this.d = new int[b()];
        for (int i = 0; i < b(); i++) {
            this.d[i] = 0;
        }
        this.e = 0;
    }

    public void a(m mVar) {
        if (this.f787b != mVar) {
            int ordinal = mVar.ordinal();
            if (ordinal == 1 || ordinal == 2) {
                this.f787b = mVar;
                this.f786a.a(mVar);
                c();
            }
        }
    }

    public final int b(m mVar) {
        return mVar.ordinal() != 1 ? 1 : 0;
    }

    public final void c() {
        d(255);
        int a2 = a();
        if (this.e != a2) {
            this.e = a2;
            c(255);
        }
    }

    public final void d(int i) {
        int i2 = this.f788c[b(this.f787b)].d;
        if (this.f787b == m.FM) {
            i2 /= 10;
        }
        String format = String.format("%05d", Integer.valueOf(i2));
        if ((i & 1) != 0) {
            this.f786a.a(b.b.a.a.b.p.v.a.TUN, format);
        }
        if ((i & 2) != 0 && this.f786a.f775b.U.size() >= 2) {
            this.f786a.a(b.b.a.a.b.p.v.a.TUZ, format);
        }
        if ((i & 4) != 0 && this.f786a.f775b.U.size() >= 3) {
            this.f786a.a(b.b.a.a.b.p.v.a.TU3, format);
        }
        if ((i & 8) == 0 || this.f786a.f775b.U.size() < 4) {
            return;
        }
        this.f786a.a(b.b.a.a.b.p.v.a.TU4, format);
    }

    public final void e(int i) {
        a aVar = this.f788c[b(this.f787b)];
        int i2 = (i * aVar.f791c) + aVar.d;
        aVar.d = i2;
        int i3 = aVar.f789a;
        if (i2 < i3) {
            aVar.d = aVar.f790b;
        } else if (i2 > aVar.f790b) {
            aVar.d = i3;
        }
        c();
    }

    public int b() {
        return this.f786a.f775b.X;
    }

    public final void b(b.b.a.a.b.p.v.b bVar, r rVar) {
        if (bVar.a()) {
            d(rVar.f837c);
            return;
        }
        if (bVar.f913c.f915a.equals("UP")) {
            e(1);
            return;
        }
        if (bVar.f913c.f915a.equals("DOWN")) {
            e(-1);
            return;
        }
        try {
            int b2 = bVar.f913c.b();
            a aVar = this.f788c[b(this.f787b)];
            if (this.f787b == m.FM) {
                b2 *= 10;
            }
            int i = aVar.f789a;
            if (i > b2 || b2 > aVar.f790b) {
                return;
            }
            int i2 = aVar.f791c;
            aVar.d = (((b2 - i) / i2) * i2) + i;
            c();
        } catch (CharConversionException unused) {
        }
    }

    public final int a() {
        int i = this.f788c[b(this.f787b)].d;
        for (int i2 = 0; i2 < b(); i2++) {
            if (this.d[i2] == i) {
                return i2 + 1;
            }
        }
        return 0;
    }

    public final void c(int i) {
        String format = String.format("%02X", Integer.valueOf(a()));
        if ((i & 1) != 0) {
            this.f786a.a(b.b.a.a.b.p.v.a.PRS, format);
        }
        if ((i & 2) != 0 && this.f786a.f775b.U.size() >= 2) {
            this.f786a.a(b.b.a.a.b.p.v.a.PRZ, format);
        }
        if ((i & 4) != 0 && this.f786a.f775b.U.size() >= 3) {
            this.f786a.a(b.b.a.a.b.p.v.a.PR3, format);
        }
        if ((i & 8) == 0 || this.f786a.f775b.U.size() < 4) {
            return;
        }
        this.f786a.a(b.b.a.a.b.p.v.a.PR4, format);
    }

    public final void a(b.b.a.a.b.p.v.b bVar, r rVar) {
        if (bVar.a()) {
            c(rVar.f837c);
            return;
        }
        if (bVar.f913c.f915a.equals("UP")) {
            a(1);
        } else if (bVar.f913c.f915a.equals("DOWN")) {
            a(-1);
        } else {
            try {
                b(bVar.f913c.b());
            } catch (CharConversionException unused) {
            }
        }
    }

    public final void a(int i) {
        int i2;
        int i3 = this.e;
        if (i3 == 0) {
            i2 = i > 0 ? 1 : b();
        } else {
            i2 = i3 + i;
        }
        for (int i4 = 0; i4 < b(); i4++) {
            if (i2 <= 0) {
                i2 = b();
            } else if (i2 > b()) {
                i2 = 1;
            }
            if (this.d[i2 - 1] != 0) {
                b(i2);
                return;
            }
            i2 += i;
        }
    }

    public final void b(int i) {
        m mVar;
        if (1 > i || i > b()) {
            return;
        }
        int[] iArr = this.d;
        int i2 = i - 1;
        if (iArr[i2] != 0) {
            int i3 = iArr[i2];
            a[] aVarArr = this.f788c;
            if (aVarArr[0].f789a <= i3 && i3 <= aVarArr[0].f790b) {
                mVar = m.FM;
            } else {
                a[] aVarArr2 = this.f788c;
                if (aVarArr2[1].f789a > i3 || i3 > aVarArr2[1].f790b) {
                    return;
                } else {
                    mVar = m.AM;
                }
            }
            this.f788c[b(mVar)].d = i3;
            if (this.f787b == mVar) {
                c();
                return;
            }
            this.f787b = mVar;
            this.f786a.a(mVar);
            c();
        }
    }
}
