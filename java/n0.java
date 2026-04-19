package b.b.a.a.f.m0;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import b.b.a.a.b.p.g;

/* compiled from: DirectTuningPopup.java */
/* loaded from: classes.dex */
public class n0 extends z0 {
    public TextView h;
    public TextView i;
    public Button[] j;
    public ImageButton k;
    public Button l;
    public b.b.a.a.b.p.d m;
    public b.b.a.a.b.t.c n;
    public e o;
    public b.b.a.a.b.o.m p;
    public b.b.a.a.b.t.f q;
    public int r;
    public int s;
    public boolean t;
    public d u;
    public View.OnClickListener v;
    public View.OnClickListener w;
    public View.OnClickListener x;

    /* compiled from: DirectTuningPopup.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n0 n0Var = n0.this;
            n0Var.r = ((Integer) view.getTag()).intValue() + (n0Var.r * 10);
            n0 n0Var2 = n0.this;
            n0Var2.s++;
            n0Var2.j();
        }
    }

    /* compiled from: DirectTuningPopup.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n0 n0Var = n0.this;
            int i = n0Var.r;
            if (i > 0) {
                n0Var.r = i / 10;
                n0Var.s--;
                n0Var.j();
                return;
            }
            n0Var.h();
        }
    }

    /* compiled from: DirectTuningPopup.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n0 n0Var = n0.this;
            if (n0Var.s > 0) {
                int k = n0Var.k();
                Log.v("Tuner", "" + k);
                n0.this.b(k);
            }
        }
    }

    /* compiled from: DirectTuningPopup.java */
    /* loaded from: classes.dex */
    public interface d {
    }

    /* compiled from: DirectTuningPopup.java */
    /* loaded from: classes.dex */
    public enum e {
        AmFree,
        AmStep9,
        AmStep10,
        FmFree,
        FmStep50,
        FmStep100,
        FmStep200,
        SeriusXm
    }

    public n0(Context context, b.b.a.a.b.p.d dVar, b.b.a.a.b.t.c cVar) {
        super(context);
        this.v = new a();
        this.w = new b();
        this.x = new c();
        this.m = dVar;
        this.n = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    @Override // b.b.a.a.f.o0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View b() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.f.m0.n0.b():android.view.View");
    }

    @Override // b.b.a.a.f.m0.z0
    public void h() {
        d dVar;
        if (!this.t && (dVar = this.u) != null) {
            ((b.b.a.a.f.k0.r) dVar).f1266a.i();
        }
        f();
    }

    public final void j() {
        int i;
        int i2;
        int i3;
        int i4 = this.r;
        boolean z = false;
        if (i4 == 0) {
            e eVar = this.o;
            if (eVar == e.SeriusXm) {
                i = 1023;
            } else if (eVar == e.AmFree || eVar == e.AmStep9 || eVar == e.AmStep10) {
                i = 994;
            } else {
                int i5 = this.q.f1058a / 10000;
                int i6 = 0;
                while (true) {
                    i3 = this.q.f1059b;
                    if (i5 >= i3 / 10000 && i5 >= 10) {
                        break;
                    }
                    i6 |= 1 << i5;
                    i5++;
                }
                i = i3 >= 100000 ? i6 | 2 : i6;
            }
        } else {
            int i7 = i4 * 10;
            int i8 = 1;
            while (true) {
                int i9 = i7 * 10;
                if (i9 > this.q.f1059b) {
                    break;
                }
                i8 *= 10;
                i7 = i9;
            }
            int i10 = 0;
            for (int i11 = 0; i11 < 10; i11++) {
                b.b.a.a.b.t.f fVar = this.q;
                int i12 = (i11 * i8) + i7;
                if (fVar.f1058a <= (i12 + i8) - 1 && i12 <= fVar.f1059b) {
                    switch (this.o) {
                        case AmStep9:
                            if (i8 == 1 && ((i7 + i11) - this.q.f1058a) % 9 != 0) {
                                break;
                            }
                            break;
                        case FmStep50:
                            if (i8 == 10 && i11 != 0 && i11 != 5) {
                                break;
                            }
                            break;
                        case FmStep200:
                            if (i8 == 100 && ((this.q.f1058a / 100) & 1) != (i11 & 1)) {
                                break;
                            }
                            break;
                    }
                    i10 |= 1 << i11;
                }
            }
            i = i10;
        }
        for (int i13 = 0; i13 < 10; i13++) {
            this.j[i13].setEnabled(((1 << i13) & i) != 0);
        }
        this.k.setEnabled(this.s > 0);
        int k = k();
        Button button = this.l;
        if (this.s > 0) {
            b.b.a.a.b.t.f fVar2 = this.q;
            if (fVar2.f1058a <= k && k <= fVar2.f1059b) {
                z = true;
            }
        }
        button.setEnabled(z);
        this.h.setText(this.n.a(this.p, k()));
        switch (this.o) {
            case AmFree:
            case AmStep9:
                b.b.a.a.b.t.f fVar3 = this.q;
                int i14 = fVar3.f1058a;
                int i15 = this.r;
                if (i14 > i15 || i15 > fVar3.f1059b) {
                    return;
                }
                b(i15);
                return;
            case AmStep10:
                b.b.a.a.b.t.f fVar4 = this.q;
                int i16 = fVar4.f1058a;
                int i17 = this.r;
                if (i16 > i17 * 10 || i17 * 10 > fVar4.f1059b) {
                    return;
                }
                b(i17 * 10);
                return;
            case FmFree:
                int i18 = this.m.f852c.e != g.b.JAPAN ? 10 : 100;
                b.b.a.a.b.t.f fVar5 = this.q;
                int i19 = fVar5.f1058a;
                int i20 = this.r;
                if (i19 > i20 * i18 || i20 * i18 > fVar5.f1059b) {
                    return;
                }
                b(i20 * i18);
                return;
            case FmStep50:
                b.b.a.a.b.t.f fVar6 = this.q;
                int i21 = fVar6.f1058a;
                int i22 = this.r;
                if (i21 > i22 * 10 || i22 * 10 > fVar6.f1059b) {
                    return;
                }
                b(i22 * 10);
                return;
            case FmStep100:
            case FmStep200:
                b.b.a.a.b.t.f fVar7 = this.q;
                int i23 = fVar7.f1058a;
                int i24 = this.r;
                if (i23 > i24 * 100 || i24 * 100 > fVar7.f1059b) {
                    return;
                }
                b(i24 * 100);
                return;
            case SeriusXm:
                b.b.a.a.b.t.f fVar8 = this.q;
                int i25 = fVar8.f1058a;
                int i26 = this.r;
                if (i25 > i26 || i26 > (i2 = fVar8.f1059b) || i26 * 10 <= i2) {
                    return;
                }
                b(i26);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0031, code lost:
    
        if ((r0 / 100) == 1) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int k() {
        /*
            r4 = this;
            int r0 = r4.r
            b.b.a.a.f.m0.n0$e r1 = r4.o
            b.b.a.a.f.m0.n0$e r2 = b.b.a.a.f.m0.n0.e.FmFree
            if (r1 == r2) goto L14
            b.b.a.a.f.m0.n0$e r2 = b.b.a.a.f.m0.n0.e.FmStep50
            if (r1 == r2) goto L14
            b.b.a.a.f.m0.n0$e r2 = b.b.a.a.f.m0.n0.e.FmStep100
            if (r1 == r2) goto L14
            b.b.a.a.f.m0.n0$e r2 = b.b.a.a.f.m0.n0.e.FmStep200
            if (r1 != r2) goto L41
        L14:
            int r1 = r4.s
            r2 = 1
            if (r1 != r2) goto L22
            if (r0 != r2) goto L1f
            r0 = 100000(0x186a0, float:1.4013E-40)
            goto L41
        L1f:
            int r0 = r0 * 1000
            goto L41
        L22:
            r3 = 2
            if (r1 != r3) goto L2c
            int r1 = r0 / 10
            if (r1 != r2) goto L1f
            int r0 = r0 * 10000
            goto L41
        L2c:
            r3 = 3
            if (r1 != r3) goto L37
            int r1 = r0 / 100
            if (r1 != r2) goto L34
            goto L1f
        L34:
            int r0 = r0 * 100
            goto L41
        L37:
            r3 = 4
            if (r1 != r3) goto L41
            int r1 = r0 / 1000
            if (r1 != r2) goto L3f
            goto L34
        L3f:
            int r0 = r0 * 10
        L41:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.f.m0.n0.k():int");
    }

    public final void b(int i) {
        b.b.a.a.b.o.i a2;
        this.r = i;
        this.t = true;
        b.b.a.a.b.t.c cVar = this.n;
        b.b.a.a.b.o.m mVar = this.p;
        b.b.a.a.b.l lVar = cVar.f1052b;
        b.b.a.a.b.t.f a3 = lVar.f754a.a(mVar);
        int i2 = a3.f1058a;
        int i3 = a3.f1059b;
        if (i > i3) {
            i = i3;
        }
        if (i >= i2) {
            i2 = i;
        }
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            b.b.a.a.b.o.i a4 = lVar.e.a(b.b.a.a.b.o.h.TUNER_FM);
            if (a4 != null) {
                if (lVar.d() != a4.f817b) {
                    lVar.a(a4);
                }
                lVar.f754a.a(lVar.f756c.f, String.format("%05d", Integer.valueOf(i2 / 10)));
            }
        } else if (ordinal == 2) {
            b.b.a.a.b.o.i a5 = lVar.e.a(b.b.a.a.b.o.h.TUNER_AM);
            if (a5 != null) {
                if (lVar.d() != a5.f817b) {
                    lVar.a(a5);
                }
                lVar.f754a.a(lVar.f756c.f, String.format("%05d", Integer.valueOf(i2)));
            }
        } else if (ordinal == 3 && (a2 = lVar.e.a(b.b.a.a.b.o.h.TUNER_XM)) != null) {
            if (lVar.d() != a2.f817b) {
                lVar.a(a2);
            }
            lVar.f754a.a(lVar.f756c.f, String.format("%05d", Integer.valueOf(i2)));
        }
        d dVar = this.u;
        if (dVar != null) {
            ((b.b.a.a.f.k0.r) dVar).f1266a.i();
        }
        h();
    }
}
