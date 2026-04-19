package b.b.a.a.b.r;

import b.b.a.a.b.r.l;
import java.util.ArrayList;

/* compiled from: NetUsbDirectory.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public a f967a;

    /* renamed from: b, reason: collision with root package name */
    public String f968b;

    /* renamed from: c, reason: collision with root package name */
    public int f969c;
    public l.e d;
    public ArrayList<h> e;
    public int f;
    public boolean g;

    /* compiled from: NetUsbDirectory.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar, int i, int i2, float f);

        void b(i iVar);
    }

    public i(String str, int i, l.e eVar, int i2) {
        this.f968b = str;
        this.f969c = i;
        this.d = eVar;
        this.g = i2 == 0;
        this.e = new ArrayList<>();
        for (int i3 = 0; i3 < i2; i3++) {
            this.e.add(null);
        }
        this.f = 0;
    }

    public int a() {
        return this.e.size();
    }

    public boolean b() {
        return this.g;
    }

    public h a(int i) {
        if (i < 0 || i >= this.e.size()) {
            return null;
        }
        return this.e.get(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if ((r6 != null && (r5 == r6 || (r5.f963b == r6.f963b && r5.f962a.equals(r6.f962a)))) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.ArrayList<b.b.a.a.b.r.h> r10, int r11) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r10.size()
            r4 = 1
            if (r1 >= r3) goto L7a
            int r3 = r11 + r1
            java.util.ArrayList<b.b.a.a.b.r.h> r5 = r9.e
            int r5 = r5.size()
            if (r3 <= r5) goto L15
            goto L7a
        L15:
            java.util.ArrayList<b.b.a.a.b.r.h> r5 = r9.e
            int r5 = r5.size()
            if (r3 != r5) goto L2f
            int r2 = r9.f
            int r2 = r2 + r4
            r9.f = r2
            java.util.ArrayList<b.b.a.a.b.r.h> r2 = r9.e
            java.lang.Object r3 = r10.get(r1)
            b.b.a.a.b.r.h r3 = (b.b.a.a.b.r.h) r3
            r2.add(r3)
            r2 = 1
            goto L77
        L2f:
            java.util.ArrayList<b.b.a.a.b.r.h> r5 = r9.e
            java.lang.Object r5 = r5.get(r3)
            if (r5 != 0) goto L3e
            int r2 = r9.f
            int r2 = r2 + r4
            r9.f = r2
        L3c:
            r2 = 1
            goto L6c
        L3e:
            if (r2 != 0) goto L6c
            java.util.ArrayList<b.b.a.a.b.r.h> r5 = r9.e
            java.lang.Object r5 = r5.get(r3)
            b.b.a.a.b.r.h r5 = (b.b.a.a.b.r.h) r5
            java.lang.Object r6 = r10.get(r1)
            b.b.a.a.b.r.h r6 = (b.b.a.a.b.r.h) r6
            if (r5 == 0) goto L6a
            if (r6 == 0) goto L66
            if (r5 == r6) goto L64
            int r7 = r5.f963b
            int r8 = r6.f963b
            if (r7 != r8) goto L66
            java.lang.String r5 = r5.f962a
            java.lang.String r6 = r6.f962a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L66
        L64:
            r5 = 1
            goto L67
        L66:
            r5 = 0
        L67:
            if (r5 != 0) goto L6c
            goto L3c
        L6a:
            r10 = 0
            throw r10
        L6c:
            java.util.ArrayList<b.b.a.a.b.r.h> r4 = r9.e
            java.lang.Object r5 = r10.get(r1)
            b.b.a.a.b.r.h r5 = (b.b.a.a.b.r.h) r5
            r4.set(r3, r5)
        L77:
            int r1 = r1 + 1
            goto L3
        L7a:
            int r1 = r9.f
            java.util.ArrayList<b.b.a.a.b.r.h> r3 = r9.e
            int r3 = r3.size()
            if (r1 != r3) goto L85
            r0 = 1
        L85:
            r9.g = r0
            if (r2 == 0) goto La6
            b.b.a.a.b.r.i$a r0 = r9.f967a
            if (r0 == 0) goto La6
            int r10 = r10.size()
            int r1 = r9.f
            double r1 = (double) r1
            java.util.ArrayList<b.b.a.a.b.r.h> r3 = r9.e
            int r3 = r3.size()
            double r3 = (double) r3
            java.lang.Double.isNaN(r1)
            java.lang.Double.isNaN(r3)
            double r1 = r1 / r3
            float r1 = (float) r1
            r0.a(r9, r11, r10, r1)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.r.i.a(java.util.ArrayList, int):void");
    }
}
