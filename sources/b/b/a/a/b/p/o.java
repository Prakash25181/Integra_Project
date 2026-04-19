package b.b.a.a.b.p;

import android.util.Log;
import b.b.a.a.b.p.d;
import b.b.a.a.b.p.g;
import b.b.a.a.b.p.r;
import com.onkyo.jp.upnp.UpnpAdvDevice;

/* compiled from: IscpIo.java */
/* loaded from: classes.dex */
public class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f896b;

    public o(r rVar) {
        this.f896b = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        r rVar = this.f896b;
        r.a aVar = rVar.f900a;
        g gVar = rVar.f901b;
        d.a aVar2 = (d.a) aVar;
        if (d.this.e == d.j.WAIT_CONNECT) {
            Log.d("ISCP Connect", "WAIT_NRI");
            d dVar = d.this;
            dVar.e = d.j.WAIT_NRI;
            dVar.h.clear();
            b.b.a.a.b.g a2 = b.b.a.a.b.g.a();
            String str = gVar.f874c;
            g.b bVar = gVar.e;
            if (a2 != null) {
                if (a2.a(str, bVar.f878b) != null) {
                    String b2 = a2.b(a2.a(gVar.f874c, gVar.e.f878b));
                    if (b2 == null) {
                        d.this.d();
                    }
                    d.this.a(b2);
                    d.this.l();
                } else {
                    d.this.f850a.a(b.b.a.a.b.p.v.a.NRI);
                }
                d dVar2 = d.this;
                g gVar2 = dVar2.f850a.f901b;
                if (gVar2 == null) {
                    return;
                }
                if (gVar2 instanceof b.b.a.a.b.n.b) {
                    b.b.a.a.b.n.e eVar = new b.b.a.a.b.n.e();
                    dVar2.t = eVar;
                    dVar2.u = new b.b.a.a.b.u.d(eVar, dVar2.v, null);
                    dVar2.a(d.f.UPNP_RENDERER_DISCOVERED, dVar2.f851b);
                    return;
                }
                UpnpAdvDevice findDeviceByIpAddress = dVar2.s.findDeviceByIpAddress(gVar2.a());
                if (findDeviceByIpAddress != null && findDeviceByIpAddress.descriptor() != null) {
                    dVar2.a(findDeviceByIpAddress);
                    return;
                }
                StringBuilder a3 = b.a.a.a.a.a("connectUpnp  device not found : ");
                a3.append(gVar2.a());
                Log.v("UPnP", a3.toString());
                return;
            }
            throw null;
        }
    }
}
