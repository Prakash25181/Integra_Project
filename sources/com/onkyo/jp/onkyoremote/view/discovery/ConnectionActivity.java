package com.onkyo.jp.onkyoremote.view.discovery;

import a.b.k.r;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import b.b.a.a.b.p.d;
import b.b.a.a.b.p.i;
import b.b.a.a.b.p.r;
import b.b.a.a.b.p.s;
import b.b.a.a.e.e;
import b.b.a.a.f.g0;
import b.b.a.a.f.l0.k;
import b.b.a.a.f.l0.l;
import b.b.a.a.f.l0.m;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;
import com.onkyo.jp.upnp.UpnpAdvDevice;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;

/* loaded from: classes.dex */
public class ConnectionActivity extends a.b.k.h {
    public boolean A;
    public g0 B;
    public AlertDialog C;
    public AlertDialog D;
    public d.g E = new d();
    public BroadcastReceiver F = new e();
    public d.g G = new g();
    public i.c H = new a();
    public WifiManager p;
    public boolean q;
    public b.b.a.a.b.p.d r;
    public h s;
    public boolean t;
    public i u;
    public k v;
    public String w;
    public String x;
    public b.b.a.a.b.p.g y;
    public boolean z;

    /* loaded from: classes.dex */
    public class a implements i.c {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConnectionActivity.a(ConnectionActivity.this, false);
            ConnectionActivity.this.k();
            ConnectionActivity.this.C = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ConnectionActivity connectionActivity = ConnectionActivity.this;
            connectionActivity.a(connectionActivity.y, connectionActivity.z);
            ConnectionActivity.this.C = null;
        }
    }

    /* loaded from: classes.dex */
    public class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
                if (((NetworkInfo) intent.getParcelableExtra("networkInfo")).isConnected()) {
                    Log.v("WiFi", "NETWORK_STATE_CHANGED_ACTION  Connected");
                    ConnectionActivity connectionActivity = ConnectionActivity.this;
                    if (connectionActivity.s == h.NO_WIFI) {
                        connectionActivity.l();
                        ConnectionActivity.this.n();
                        return;
                    }
                    return;
                }
                Log.v("WiFi", "NETWORK_STATE_CHANGED_ACTION  Disconnected");
                ConnectionActivity connectionActivity2 = ConnectionActivity.this;
                if (connectionActivity2.s != h.NO_WIFI) {
                    connectionActivity2.l();
                    i iVar = ConnectionActivity.this.u;
                    if (iVar != null) {
                        iVar.a();
                        iVar.f.clear();
                        iVar.g = false;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            boolean z2 = true;
            if (!ConnectionActivity.this.i()) {
                ConnectionActivity.this.b(true);
                return;
            }
            b.b.a.a.b.p.d dVar = ConnectionActivity.this.r;
            if (dVar.s.start()) {
                dVar.s.startDiscovery();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ConnectionActivity.this.B.a(0);
                ConnectionActivity connectionActivity = ConnectionActivity.this;
                if (connectionActivity.u == null) {
                    connectionActivity.u = new i(((RemoteApplication) connectionActivity.getApplication()).c(), connectionActivity.H);
                }
                i iVar = connectionActivity.u;
                if (iVar.d) {
                    return;
                }
                iVar.e = 10000;
                try {
                    DatagramSocket datagramSocket = new DatagramSocket((SocketAddress) null);
                    iVar.k = datagramSocket;
                    datagramSocket.setBroadcast(true);
                    iVar.k.setReuseAddress(true);
                    iVar.k.setSoTimeout(1000);
                    iVar.k.bind(new InetSocketAddress(60128));
                    iVar.d = true;
                    Thread thread = new Thread(iVar.n);
                    iVar.j = thread;
                    thread.start();
                    Timer timer = new Timer(true);
                    iVar.i = timer;
                    timer.schedule(new b.b.a.a.b.p.h(iVar), 0L, iVar.e);
                } catch (SocketException e) {
                    e.printStackTrace();
                    z2 = false;
                }
                if (z2) {
                    iVar.m.addObserver(iVar.o);
                    for (UpnpAdvDevice upnpAdvDevice : iVar.m.copyDevices()) {
                        iVar.a(upnpAdvDevice);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public enum h {
        NO_WIFI,
        AUTO_CONNECT,
        DEVICE_SELECT
    }

    public final void b(boolean z) {
        this.B.a(0);
        if (z) {
            this.r.s.stop();
        }
        i iVar = this.u;
        if (iVar != null) {
            iVar.a();
        }
    }

    public boolean i() {
        WifiInfo connectionInfo;
        return (this.p.getWifiState() != 3 || (connectionInfo = this.p.getConnectionInfo()) == null || connectionInfo.getIpAddress() == 0) ? false : true;
    }

    public final String j() {
        if (b.b.a.a.b.f.f == b.b.a.a.b.f.integra) {
            return "com.onkyo.jp.integracontroller";
        }
        if (b.b.a.a.b.f.f == b.b.a.a.b.f.onkyo) {
            return "com.onkyo.jp.onkyocontroller";
        }
        if (b.b.a.a.b.f.f == b.b.a.a.b.f.pioneer) {
            return "com.onkyo.pioneer.pioneerremote";
        }
        throw new UnsupportedOperationException();
    }

    public void k() {
        if (this.s == h.AUTO_CONNECT) {
            this.t = false;
            l();
        }
    }

    public final void l() {
        if (!i()) {
            a(h.NO_WIFI, new m(), null);
            b(true);
            return;
        }
        if (this.t) {
            b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
            if (a2 != null) {
                this.w = a2.c(b.b.a.a.d.a.f1116b.f1120b);
                String c2 = a2.c(b.b.a.a.d.a.f1116b.f1119a);
                this.x = c2;
                if (c2 != null && !c2.isEmpty()) {
                    a(h.AUTO_CONNECT, new b.b.a.a.f.l0.b(), null);
                } else {
                    this.t = false;
                }
            } else {
                throw null;
            }
        }
        if (this.t) {
            return;
        }
        a(h.DEVICE_SELECT, new l(), getResources().getString(R.string.serverSelectDialogTitle));
    }

    public final void m() {
        Log.v("ConnectionActivity", "startConnection");
        this.s = null;
        this.t = getIntent().getBooleanExtra("autoConnect", false);
        l();
        if (this.s != h.NO_WIFI) {
            n();
        }
    }

    public final void n() {
        this.B.a(0, 0, 3000, new f());
    }

    @Override // a.b.k.h, a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r.b(this);
        setContentView(R.layout.activity_connection);
        this.B = new g0(new Handler(), 1);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return false;
    }

    @Override // a.h.a.d, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onPause() {
        Log.v("ConnectionActivity", "onPause");
        if (this.r != null) {
            b(false);
            this.u = null;
            b.b.a.a.b.p.d dVar = this.r;
            dVar.y.b(this.G);
        }
        this.v = null;
        if (this.q) {
            unregisterReceiver(this.F);
            this.q = false;
        }
        AlertDialog alertDialog = this.C;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.C = null;
        }
        AlertDialog alertDialog2 = this.D;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
            this.D = null;
        }
        super.onPause();
    }

    @Override // a.h.a.d, android.app.Activity
    public void onResume() {
        super.onResume();
        Log.v("ConnectionActivity", "onResume");
        ((RemoteApplication) getApplication()).a(new RemoteApplication.c() { // from class: b.b.a.a.f.l0.a
            @Override // com.onkyo.jp.onkyoremote.app.RemoteApplication.c
            public final void a(boolean z) {
                ConnectionActivity.this.a(z);
            }
        });
    }

    public /* synthetic */ void a(boolean z) {
        if (z) {
            b.b.a.a.b.p.d b2 = ((RemoteApplication) getApplication()).b();
            this.r = b2;
            if (b2 != null) {
                this.p = (WifiManager) getApplicationContext().getSystemService("wifi");
                registerReceiver(this.F, new IntentFilter("android.net.wifi.STATE_CHANGE"));
                boolean z2 = true;
                this.q = true;
                b.b.a.a.b.p.d dVar = this.r;
                dVar.y.a((d.h) this.G);
                d.j jVar = this.r.e;
                if (jVar != d.j.WAIT_NRI && jVar != d.j.WAIT_INITIAL_ZONE_POWER && jVar != d.j.WAIT_INITIAL_ZONE_INFO && jVar != d.j.QUERY_COMPLETED && jVar != d.j.CONNECTED) {
                    z2 = false;
                }
                if (z2) {
                    Log.v("ConnectionActivity", "disconnect");
                    b.b.a.a.b.p.d dVar2 = this.r;
                    dVar2.y.a((d.h) this.E);
                    this.r.c();
                    return;
                }
                m();
                return;
            }
        }
        RemoteApplication.a(this);
    }

    /* loaded from: classes.dex */
    public class g implements d.g {
        public g() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(d.i iVar) {
            int ordinal = iVar.ordinal();
            if (ordinal == 1) {
                ConnectionActivity connectionActivity = ConnectionActivity.this;
                connectionActivity.a(connectionActivity.getString(R.string.connectFailedMessage));
            } else {
                if (ordinal != 2) {
                    return;
                }
                ConnectionActivity connectionActivity2 = ConnectionActivity.this;
                connectionActivity2.a(connectionActivity2.getString(R.string.connectTimeoutMessage));
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x015f  */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
        @Override // b.b.a.a.b.p.d.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b() {
            /*
                Method dump skipped, instructions count: 357
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity.g.b():void");
        }

        @Override // b.b.a.a.b.p.d.g
        public void f() {
            a(false);
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(boolean z) {
            AlertDialog alertDialog = ConnectionActivity.this.D;
            if (alertDialog != null) {
                alertDialog.dismiss();
                ConnectionActivity connectionActivity = ConnectionActivity.this;
                connectionActivity.D = null;
                connectionActivity.k();
            }
            ConnectionActivity.a(ConnectionActivity.this, false);
        }
    }

    /* loaded from: classes.dex */
    public class d implements d.g {

        /* renamed from: b, reason: collision with root package name */
        public Handler f1729b = new Handler();

        public d() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(d.i iVar) {
            ConnectionActivity connectionActivity = ConnectionActivity.this;
            b.b.a.a.b.p.d dVar = connectionActivity.r;
            dVar.y.b(connectionActivity.E);
            this.f1729b.post(new b.b.a.a.f.l0.d(this));
        }

        @Override // b.b.a.a.b.p.d.g
        public void b() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void f() {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(boolean z) {
            ConnectionActivity connectionActivity = ConnectionActivity.this;
            b.b.a.a.b.p.d dVar = connectionActivity.r;
            dVar.y.b(connectionActivity.E);
            this.f1729b.post(new b.b.a.a.f.l0.d(this));
        }
    }

    public static /* synthetic */ void b(ConnectionActivity connectionActivity) {
        String j = connectionActivity.j();
        try {
            Intent launchIntentForPackage = connectionActivity.getPackageManager().getLaunchIntentForPackage(j);
            if (launchIntentForPackage != null) {
                connectionActivity.startActivity(launchIntentForPackage);
                return;
            }
        } catch (ActivityNotFoundException unused) {
        }
        try {
            connectionActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + j)));
        } catch (ActivityNotFoundException unused2) {
            connectionActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + j)));
        }
    }

    public final void a(h hVar, k kVar, String str) {
        h hVar2 = this.s;
        if (hVar != hVar2) {
            int i = hVar2 == null ? 0 : 4099;
            if (hVar == h.DEVICE_SELECT) {
                h().e();
            } else {
                h().d();
            }
            this.s = hVar;
            this.v = kVar;
            if (str == null) {
                str = "";
            }
            setTitle(str);
            getFragmentManager().beginTransaction().disallowAddToBackStack().setTransition(i).replace(R.id.fragment_container, kVar).commit();
        }
    }

    public static /* synthetic */ void a(ConnectionActivity connectionActivity) {
        if (connectionActivity != null) {
            connectionActivity.startActivity(new Intent(connectionActivity, (Class<?>) MainActivity.class));
            return;
        }
        throw null;
    }

    public void a(b.b.a.a.b.p.g gVar, boolean z) {
        b.b.a.a.b.p.r sVar;
        boolean z2 = false;
        b(false);
        if (gVar.b()) {
            this.A = true;
            this.v.a();
            this.y = gVar;
            this.z = z;
            b.b.a.a.b.p.d dVar = this.r;
            boolean z3 = !z;
            if (dVar != null) {
                StringBuilder a2 = b.a.a.a.a.a("REQ-CONNECT  ");
                a2.append(gVar.a());
                Log.d("ISCP Connect", a2.toString());
                if (dVar.f850a != null) {
                    Log.e("ISCP Connect", "ALREADY-REQ-CONNECT");
                } else {
                    if (z3) {
                        dVar.f851b = b.b.a.a.b.o.r.MAIN;
                    }
                    if (gVar.b()) {
                        dVar.e = d.j.WAIT_CONNECT;
                        b.b.a.a.e.e a3 = b.b.a.a.e.e.a((e.b) new b.b.a.a.b.p.c(dVar), true);
                        dVar.D = a3;
                        a3.a(false, 15000);
                        r.a aVar = dVar.z;
                        if (gVar instanceof b.b.a.a.b.n.b) {
                            sVar = new b.b.a.a.b.n.g(gVar, aVar);
                        } else {
                            sVar = new s(gVar, aVar);
                        }
                        sVar.f.clear();
                        Thread thread = new Thread(sVar.d);
                        sVar.f902c = thread;
                        thread.setName("ISCP IO");
                        sVar.f902c.start();
                        dVar.f850a = sVar;
                        z2 = true;
                    }
                }
                if (z2) {
                    return;
                }
                a(getString(R.string.connectFailedMessage));
                return;
            }
            throw null;
        }
        this.C = new AlertDialog.Builder(this).setMessage(String.format(getString(R.string.unsupportedDeviceMessage), gVar.h)).setPositiveButton(getString(R.string.ok), new b.b.a.a.f.l0.e(this)).setCancelable(false).show();
    }

    public static /* synthetic */ void a(ConnectionActivity connectionActivity, boolean z) {
        connectionActivity.A = false;
        k kVar = connectionActivity.v;
        if (kVar != null) {
            kVar.a(z);
        }
        if (z) {
            return;
        }
        connectionActivity.n();
    }

    public final void a(String str) {
        if (i()) {
            this.C = new AlertDialog.Builder(this).setTitle(getString(R.string.connectFailedTitle)).setMessage(str).setNegativeButton(getString(R.string.reconnect), new c()).setPositiveButton(getString(R.string.selectServer), new b()).setCancelable(false).show();
        }
    }
}
