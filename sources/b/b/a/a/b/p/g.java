package b.b.a.a.b.p;

import android.graphics.Bitmap;
import b.b.a.a.b.g;
import b.b.a.a.b.p.f;
import b.b.a.a.e.c;
import java.net.HttpURLConnection;
import java.net.InetAddress;

/* compiled from: IscpDeviceInfo.java */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public Boolean f872a;

    /* renamed from: b, reason: collision with root package name */
    public char f873b;

    /* renamed from: c, reason: collision with root package name */
    public String f874c;
    public int d;
    public b e;
    public String f;
    public String g;
    public String h;
    public long i;
    public InetAddress j;
    public Bitmap k;
    public boolean l;

    /* compiled from: IscpDeviceInfo.java */
    /* loaded from: classes.dex */
    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.b f875a;

        public a(f.b bVar) {
            this.f875a = bVar;
        }

        @Override // b.b.a.a.b.p.f.b
        public void a(Bitmap bitmap) {
            g gVar = g.this;
            gVar.l = false;
            gVar.k = bitmap;
            this.f875a.a(bitmap);
        }
    }

    /* compiled from: IscpDeviceInfo.java */
    /* loaded from: classes.dex */
    public enum b {
        NORTH_AMERICA("DX"),
        EU_or_ASIA("XX"),
        JAPAN("JJ"),
        UNKNOWN("");


        /* renamed from: b, reason: collision with root package name */
        public final String f878b;

        b(String str) {
            this.f878b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f878b;
        }
    }

    public String a() {
        InetAddress inetAddress = this.j;
        return inetAddress != null ? inetAddress.getHostAddress() : "";
    }

    public boolean b() {
        if (this.f872a == null) {
            this.f872a = true;
            b.b.a.a.b.g a2 = b.b.a.a.b.g.a();
            String str = this.f874c;
            if (a2 != null) {
                if (g.a.d1.get(str) != null) {
                    if (!(a2.a(this.f874c, this.e.f878b) != null)) {
                        this.f872a = false;
                    }
                }
            } else {
                throw null;
            }
        }
        return this.f872a.booleanValue();
    }

    public String toString() {
        return String.format("%s (%s)", this.f874c, this.g);
    }

    public boolean a(long j) {
        return j - this.i >= 35000;
    }

    public int a(g gVar) {
        int compareTo = this.f874c.compareTo(gVar.f874c);
        if (compareTo != 0) {
            return compareTo;
        }
        InetAddress inetAddress = this.j;
        byte[] address = inetAddress != null ? inetAddress.getAddress() : new byte[0];
        InetAddress inetAddress2 = gVar.j;
        byte[] address2 = inetAddress2 != null ? inetAddress2.getAddress() : new byte[0];
        if (address.length != address2.length) {
            compareTo = address.length < address2.length ? -1 : 1;
        } else {
            for (int i = 0; i < address.length && compareTo == 0; i++) {
                compareTo = address[i] - address2[i];
            }
        }
        return compareTo == 0 ? this.g.compareTo(gVar.g) : compareTo;
    }

    public void a(final f fVar, f.b bVar) {
        if (fVar.b(this.g)) {
            Bitmap a2 = fVar.a(this.g);
            this.k = a2;
            bVar.a(a2);
        } else {
            if (this.l) {
                return;
            }
            this.l = true;
            final String str = this.g;
            String format = String.format("http://%s:8888/upnp_descriptor_0", this.j.getHostAddress());
            final a aVar = new a(bVar);
            fVar.f866a.a(format, new c.a() { // from class: b.b.a.a.b.p.a
                @Override // b.b.a.a.e.c.a
                public final void a(HttpURLConnection httpURLConnection) {
                    f.this.b(str, aVar, httpURLConnection);
                }
            });
        }
    }
}
