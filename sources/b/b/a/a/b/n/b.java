package b.b.a.a.b.n;

import a.b.k.r;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b.b.a.a.b.p.f;
import b.b.a.a.b.p.g;
import java.net.InetAddress;

/* compiled from: DemoIscpDeviceInfo.java */
/* loaded from: classes.dex */
public class b extends b.b.a.a.b.p.g {
    public b() {
        this.f873b = '1';
        this.f874c = "AVR-DEMO";
        this.d = 60128;
        this.e = g.b.NORTH_AMERICA;
        this.f = "DX";
        this.g = "DEMO";
        this.h = "Demo Device";
        try {
            this.j = InetAddress.getByName("192.168.0.0");
        } catch (Exception unused) {
        }
        Drawable c2 = r.c("ic_demo_avr");
        if (c2 != null) {
            this.k = ((BitmapDrawable) c2).getBitmap();
        }
    }

    @Override // b.b.a.a.b.p.g
    public void a(b.b.a.a.b.p.f fVar, f.b bVar) {
        bVar.a(this.k);
    }

    @Override // b.b.a.a.b.p.g
    public boolean a(long j) {
        return false;
    }

    @Override // b.b.a.a.b.p.g
    public boolean b() {
        return true;
    }
}
