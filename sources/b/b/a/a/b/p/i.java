package b.b.a.a.b.p;

import android.os.Handler;
import android.util.Log;
import com.onkyo.jp.upnp.UpnpAdvDevice;
import com.onkyo.jp.upnp.UpnpClient;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

/* compiled from: IscpDiscovery.java */
/* loaded from: classes.dex */
public final class i {
    public static char p = 'x';

    /* renamed from: c, reason: collision with root package name */
    public c f882c;
    public int e;
    public boolean g;
    public String h;
    public Timer i;
    public Thread j;
    public DatagramSocket k;
    public UpnpClient m;
    public f l = new f();
    public Runnable n = new a();
    public UpnpClient.Delegate o = new b();

    /* renamed from: a, reason: collision with root package name */
    public i f880a = this;

    /* renamed from: b, reason: collision with root package name */
    public Handler f881b = new Handler();
    public boolean d = false;
    public List<g> f = new ArrayList();

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread currentThread = Thread.currentThread();
                DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
                while (!currentThread.isInterrupted()) {
                    try {
                        i.this.k.receive(datagramPacket);
                        i.a(i.this, datagramPacket);
                    } catch (SocketTimeoutException unused) {
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public class b implements UpnpClient.Delegate {

        /* compiled from: IscpDiscovery.java */
        /* loaded from: classes.dex */
        public class a implements d {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f885a;

            public a(b bVar, String str) {
                this.f885a = str;
            }

            @Override // b.b.a.a.b.p.i.d
            public boolean a(g gVar) {
                return gVar.g.equalsIgnoreCase(this.f885a);
            }
        }

        public b() {
        }

        @Override // com.onkyo.jp.upnp.UpnpClient.Delegate
        public void onDeviceDiscovered(UpnpAdvDevice upnpAdvDevice) {
            i.this.a(upnpAdvDevice);
        }

        @Override // com.onkyo.jp.upnp.UpnpClient.Delegate
        public void onDeviceLost(UpnpAdvDevice upnpAdvDevice) {
            String a2;
            if (!i.this.d || upnpAdvDevice.descriptor() == null) {
                return;
            }
            String modelName = upnpAdvDevice.descriptor().modelName();
            String udn = upnpAdvDevice.descriptor().udn();
            if (modelName == null || !b.b.a.a.b.g.a().a(modelName) || (a2 = u.a(udn)) == null) {
                return;
            }
            i iVar = i.this;
            iVar.f881b.post(new m(iVar, new a(this, a2)));
        }
    }

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public interface d {
        boolean a(g gVar);
    }

    /* compiled from: IscpDiscovery.java */
    /* loaded from: classes.dex */
    public class e extends g {
        public /* synthetic */ e(i iVar, h hVar) {
        }
    }

    public i(UpnpClient upnpClient, c cVar) {
        this.f882c = cVar;
        this.m = upnpClient;
    }

    public void a() {
        if (this.d) {
            this.d = false;
            this.m.removeObserver(this.o);
            try {
                this.j.interrupt();
                this.j.join();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            }
            this.j = null;
            this.i.cancel();
            this.i = null;
            this.k.close();
            this.k = null;
        }
    }

    public static /* synthetic */ b.b.a.a.b.p.v.b a(i iVar, DatagramPacket datagramPacket) {
        int i;
        h hVar = null;
        if (iVar != null) {
            b.b.a.a.b.p.v.b a2 = b.b.a.a.b.p.v.c.a(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength(), datagramPacket.getAddress());
            if (a2 != null) {
                if (a2.f912b != b.b.a.a.b.p.v.a.nul) {
                    StringBuilder a3 = b.a.a.a.a.a("rcv ");
                    a3.append(a2.f912b.f910b);
                    a3.append(a2.f913c.f915a);
                    Log.i("ISCP Discovery", a3.toString());
                } else {
                    StringBuilder a4 = b.a.a.a.a.a("rcv <NOT REGIST> ");
                    a4.append(a2.f);
                    a4.append(a2.f913c.f915a);
                    Log.i("ISCP Discovery", a4.toString());
                }
            }
            if (a2 != null && a2.f912b == b.b.a.a.b.p.v.a.ECN && !a2.f913c.f915a.equals("QSTN")) {
                e eVar = new e(iVar, hVar);
                InetAddress address = datagramPacket.getAddress();
                f fVar = iVar.l;
                boolean z = false;
                if (a2.f912b == b.b.a.a.b.p.v.a.ECN) {
                    String[] split = a2.f913c.f915a.split("/");
                    if (split.length == 4) {
                        eVar.f873b = a2.f911a;
                        eVar.f874c = split[0];
                        eVar.d = Integer.parseInt(split[1]);
                        eVar.f = split[2];
                        String str = split[3];
                        eVar.g = str;
                        if (str.charAt(str.length() - 1) == 25) {
                            String str2 = eVar.g;
                            eVar.g = str2.substring(0, str2.length() - 1);
                        }
                        eVar.i = System.currentTimeMillis();
                        eVar.j = address;
                        if (eVar.f874c.equals("CD-P800NT") || eVar.f874c.equals("C-N7050")) {
                            eVar.f873b = '4';
                        }
                        if (eVar.f874c.length() > 0 && 1024 <= (i = eVar.d) && i <= 65535 && eVar.g.length() > 0) {
                            String b2 = b.b.a.a.d.a.a().b(eVar.g);
                            if (b2 != null && b2.length() > 0) {
                                eVar.h = b2;
                            } else {
                                eVar.h = eVar.f874c;
                            }
                            eVar.e = b.b.a.a.b.p.v.c.a(eVar.f);
                            eVar.k = fVar.a(eVar.g);
                            z = true;
                        }
                    }
                }
                if (z) {
                    iVar.f881b.post(new k(iVar, eVar));
                }
            }
            return a2;
        }
        throw null;
    }

    public final void a(UpnpAdvDevice upnpAdvDevice) {
        String modelName;
        if (!this.d || upnpAdvDevice.descriptor() == null || (modelName = upnpAdvDevice.descriptor().modelName()) == null || !b.b.a.a.b.g.a().a(modelName)) {
            return;
        }
        u uVar = upnpAdvDevice.descriptor() == null ? null : new u(upnpAdvDevice);
        if (uVar != null) {
            this.f881b.post(new k(this, uVar));
        }
    }
}
