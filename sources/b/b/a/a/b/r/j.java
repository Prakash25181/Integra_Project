package b.b.a.a.b.r;

import java.util.ArrayList;

/* compiled from: NetUsbDirectoryRequestManager.java */
/* loaded from: classes.dex */
public class j {
    public static final int[] f = {0, 1, 0, 2, 0, 1, 0, 3, 0, 1, 0, 2, 0, 1, 0};

    /* renamed from: a, reason: collision with root package name */
    public i f970a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<Integer> f971b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<Integer> f972c = new ArrayList<>();
    public int d;
    public int e;

    /* compiled from: NetUsbDirectoryRequestManager.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f973a;

        /* renamed from: b, reason: collision with root package name */
        public int f974b;

        public a(j jVar, int i, int i2) {
            this.f973a = i;
            this.f974b = i2;
        }
    }

    public j(i iVar) {
        this.f970a = iVar;
        int a2 = ((iVar.a() + 20) - 1) / 20;
        this.d = a2;
        this.e = (a2 + 7) / 8;
        for (int i = 0; i < this.e; i++) {
            this.f971b.add(0);
            this.f972c.add(0);
        }
    }

    public void a(boolean z, int i, ArrayList<h> arrayList) {
        int i2 = i / 20;
        int i3 = i2 >> 3;
        int i4 = 1 << (i2 & 7);
        if (i3 < this.e) {
            this.f972c.set(i3, Integer.valueOf(this.f972c.get(i3).intValue() & (i4 ^ (-1)) & 255));
            if (z) {
                this.f971b.set(i3, Integer.valueOf((i4 | this.f971b.get(i3).intValue()) & 255));
            }
        }
        if (z) {
            this.f970a.a(arrayList, i);
        }
    }
}
