package b.b.a.a.b.p;

import android.util.Log;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.TimerTask;

/* compiled from: IscpDiscovery.java */
/* loaded from: classes.dex */
public class h extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f879b;

    public h(i iVar) {
        this.f879b = iVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        i iVar = this.f879b;
        if (iVar.d) {
            if (iVar != null) {
                iVar.f881b.post(new m(iVar, new l(iVar, System.currentTimeMillis())));
                i iVar2 = this.f879b;
                if (iVar2 != null) {
                    try {
                        Log.d("ISCP Discovery", "send ECNQSTN");
                        byte[] a2 = b.b.a.a.b.p.v.c.a(i.p, "ECNQSTN");
                        iVar2.k.send(new DatagramPacket(a2, a2.length, InetAddress.getByName("255.255.255.255"), 60128));
                        return;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                }
                throw null;
            }
            throw null;
        }
    }
}
