package a.b.k;

/* compiled from: TwilightCalculator.java */
/* loaded from: classes.dex */
public class s {
    public static s d;

    /* renamed from: a, reason: collision with root package name */
    public long f45a;

    /* renamed from: b, reason: collision with root package name */
    public long f46b;

    /* renamed from: c, reason: collision with root package name */
    public int f47c;

    public void a(long j, double d2, double d3) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        double d4 = (0.01720197f * f) + 6.24006f;
        double sin = Math.sin(d4) * 0.03341960161924362d;
        Double.isNaN(d4);
        double sin2 = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + sin + d4 + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double d6 = f - 9.0E-4f;
        Double.isNaN(d6);
        double round = ((float) Math.round(d6 - d5)) + 9.0E-4f;
        Double.isNaN(round);
        double sin3 = (Math.sin(2.0d * sin2) * (-0.0069d)) + (Math.sin(d4) * 0.0053d) + round + d5;
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin2));
        double d7 = 0.01745329238474369d * d2;
        double sin4 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d7))) / (Math.cos(asin) * Math.cos(d7));
        if (sin4 >= 1.0d) {
            this.f47c = 1;
            this.f45a = -1L;
            this.f46b = -1L;
            return;
        }
        if (sin4 <= -1.0d) {
            this.f47c = 0;
            this.f45a = -1L;
            this.f46b = -1L;
            return;
        }
        double acos = (float) (Math.acos(sin4) / 6.283185307179586d);
        Double.isNaN(acos);
        this.f45a = Math.round((sin3 + acos) * 8.64E7d) + 946728000000L;
        Double.isNaN(acos);
        long round2 = Math.round((sin3 - acos) * 8.64E7d) + 946728000000L;
        this.f46b = round2;
        if (round2 < j && this.f45a > j) {
            this.f47c = 0;
        } else {
            this.f47c = 1;
        }
    }
}
