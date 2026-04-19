package a.b.p;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f233a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f234b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f235c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.f235c = i;
        this.d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f233a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f234b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f233a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f234b = i2;
        }
    }
}
