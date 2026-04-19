package b.b.a.a.b.p;

import android.os.AsyncTask;
import android.util.Log;
import b.b.a.a.b.p.g;
import b.b.a.a.b.p.r;
import b.b.a.a.b.u.b;
import b.b.a.a.b.u.d;
import b.b.a.a.e.e;
import com.onkyo.jp.upnp.UpnpAdvDevice;
import com.onkyo.jp.upnp.UpnpClient;
import com.onkyo.jp.upnp.UpnpControl;
import com.onkyo.jp.upnp.UpnpControlImpl;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Iscp.java */
/* loaded from: classes.dex */
public class d {
    public b.b.a.a.e.e B;
    public b.b.a.a.e.e C;
    public b.b.a.a.e.e D;
    public int E;
    public int F;

    /* renamed from: a, reason: collision with root package name */
    public r f850a;

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.o.r f851b;

    /* renamed from: c, reason: collision with root package name */
    public b.b.a.a.b.o.c f852c;
    public HashMap<b.b.a.a.b.o.r, b.b.a.a.b.l> d;
    public j e;
    public String f;
    public Boolean i;
    public e j;
    public Boolean k;
    public b.b.a.a.b.t.e l;
    public int m;
    public int n;
    public b.b.a.a.b.s.a o;
    public b.b.a.a.b.i p;
    public b.b.a.a.b.r.l q;
    public boolean r;
    public UpnpClient s;
    public UpnpControl t;
    public b.b.a.a.b.u.d u;
    public b.b.a.a.b.u.b v;
    public d.InterfaceC0034d w;
    public m x;
    public h y;
    public final List<b.b.a.a.b.p.v.a> g = Collections.synchronizedList(new ArrayList());
    public final List<b.b.a.a.b.p.v.b> h = new ArrayList();
    public r.a z = new a();
    public UpnpClient.Delegate A = new b();

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public class a implements r.a {
        public a() {
        }
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public class b implements UpnpClient.Delegate {
        public b() {
        }

        @Override // com.onkyo.jp.upnp.UpnpClient.Delegate
        public void onDeviceDiscovered(UpnpAdvDevice upnpAdvDevice) {
            b.b.a.a.b.p.g gVar;
            d dVar = d.this;
            r rVar = dVar.f850a;
            if (rVar == null || dVar.t != null || (gVar = rVar.f901b) == null || !upnpAdvDevice.isEqualIpAddress(gVar.j)) {
                return;
            }
            d.this.a(upnpAdvDevice);
        }

        @Override // com.onkyo.jp.upnp.UpnpClient.Delegate
        public void onDeviceLost(UpnpAdvDevice upnpAdvDevice) {
            b.b.a.a.b.p.g gVar;
            r rVar = d.this.f850a;
            if (rVar == null || (gVar = rVar.f901b) == null || !upnpAdvDevice.isEqualIpAddress(gVar.j)) {
                return;
            }
            d.this.g();
            d.this.n();
        }
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public class c implements e.b {
        public c() {
        }

        @Override // b.b.a.a.e.e.b
        public void run() {
            d.this.m();
        }
    }

    /* compiled from: Iscp.java */
    /* renamed from: b.b.a.a.b.p.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0029d implements e.b {
        public C0029d() {
        }

        @Override // b.b.a.a.e.e.b
        public void run() {
            d dVar = d.this;
            int i = dVar.F + 1;
            dVar.F = i;
            int i2 = dVar.E + 1;
            dVar.E = i2;
            if (i >= 5) {
                dVar.B.a();
                d.this.f();
            } else if (i2 >= 10) {
                dVar.B.a();
            } else {
                dVar.f850a.a(b.b.a.a.b.p.v.a.PWR);
            }
        }
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public enum e {
        MAIN("Main"),
        SUB("Sub"),
        ZONE2("Zone2");


        /* renamed from: b, reason: collision with root package name */
        public String f858b;

        e(String str) {
            this.f858b = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f858b;
        }
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public enum f {
        NONE,
        ZONE,
        POWER,
        MUTE,
        VOLUME,
        SELECTOR,
        BALANCE,
        TONE,
        SP_LEVEL,
        PMB,
        TONE_DIRECT,
        MUSIC_OPTIMIZER,
        LISTENING_MODE,
        LISTENING_MODE_DISPLAY_NAME,
        CEC_ENABLE,
        CEC_ROUTE,
        AUDIO_INFO_UPDATED,
        VIDEO_INFO_UPDATED,
        RADIO_TUNING,
        RADIO_STATION,
        TUNER_PRESET,
        TUNER_PRESET_LIST,
        NET_STANDBY,
        UPNP_RENDERER_DISCOVERED,
        UPNP_RENDERER_LOST
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public interface g {
        void a(i iVar);

        void a(boolean z);

        void b();

        void f();
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public enum i {
        SUCCESS,
        COULD_NOT_CONNECT,
        REPLY_TIMEOUT
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public enum j {
        DISCONNECTED,
        WAIT_DISCONNECT,
        WAIT_DISCONNECT_AT_ERR,
        WAIT_DISCONNECT_AT_PAUSE,
        WAIT_RECONNECT,
        WAIT_CONNECT,
        WAIT_NRI,
        WAIT_INITIAL_ZONE_POWER,
        WAIT_INITIAL_ZONE_INFO,
        QUERY_COMPLETED,
        CONNECTED
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public interface k {
        void a(f fVar, boolean z, b.b.a.a.b.o.r rVar);
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public interface l extends k {
        void a(b.b.a.a.b.q.a aVar);
    }

    public d(UpnpClient upnpClient, d.InterfaceC0034d interfaceC0034d) {
        b.b.a.a.b.p.c cVar = null;
        this.x = new m(this, cVar);
        this.y = new h(this, cVar);
        Log.v("ISCP", "Iscp construct");
        this.e = j.DISCONNECTED;
        this.f851b = b.b.a.a.b.o.r.MAIN;
        this.i = null;
        this.j = e.MAIN;
        this.k = null;
        this.d = new HashMap<>();
        this.r = true;
        this.s = upnpClient;
        upnpClient.addObserver(this.A);
        this.w = interfaceC0034d;
        this.v = new b.b.a.a.b.u.b();
    }

    public final void a(UpnpAdvDevice upnpAdvDevice) {
        b.b.a.a.b.u.b bVar = this.v;
        if (bVar != null) {
            try {
                b.a aVar = bVar.f1063c;
                boolean z = false;
                if (((aVar.f1643c == null || aVar.e == null) ? false : true) && !aVar.f1643c.isClosed() && aVar.e.isAlive()) {
                    z = true;
                }
                if (!z) {
                    bVar.f1063c.b();
                    Log.v("UPnP", "HTTP Server Started");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            UpnpControlImpl upnpControlImpl = new UpnpControlImpl(this.s, upnpAdvDevice);
            this.t = upnpControlImpl;
            this.u = new b.b.a.a.b.u.d(upnpControlImpl, this.v, this.w);
            Log.v("UPnP", "connectUpnp  Device Connected!!");
            a(f.UPNP_RENDERER_DISCOVERED, this.f851b);
            return;
        }
        throw null;
    }

    public void b(b.b.a.a.b.o.r rVar) {
        if (this.f852c.P && k()) {
            return;
        }
        boolean z = false;
        Iterator<Map.Entry<b.b.a.a.b.o.r, b.b.a.a.b.l>> it = this.d.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<b.b.a.a.b.o.r, b.b.a.a.b.l> next = it.next();
            if (next.getKey() != rVar && next.getValue().h) {
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        n();
    }

    public void c() {
        Log.d("ISCP Connect", "REQ-DISCONNECT");
        if (p()) {
            this.e = j.WAIT_DISCONNECT;
            this.f850a.a();
        }
    }

    public final void d() {
        Log.d("ISCP Connect", "REQ-DISCONNECT(ERR)");
        if (p()) {
            this.e = j.WAIT_DISCONNECT_AT_ERR;
            this.f850a.a();
        }
    }

    public void e() {
        if (p()) {
            Log.d("ISCP Connect", "REQ-DISCONNECT(FOR PAUSE)");
            this.e = j.WAIT_DISCONNECT_AT_PAUSE;
            this.f850a.a();
        }
    }

    public final void f() {
        Log.d("ISCP Connect", "REQ-DISCONNECT(FOR RECONNECT)");
        if (p()) {
            this.e = j.WAIT_RECONNECT;
            this.f850a.a();
        }
    }

    public final void g() {
        boolean z = this.u != null;
        if (this.u != null) {
            b.b.a.a.b.r.l lVar = this.q;
            if (lVar != null && lVar.g() == b.b.a.a.b.o.e.THIS_DEVICE) {
                this.u.stop();
            }
            this.u.dispose();
            this.u = null;
        }
        UpnpControl upnpControl = this.t;
        if (upnpControl != null) {
            upnpControl.dispose();
            this.t = null;
        }
        b.b.a.a.b.u.b bVar = this.v;
        if (bVar != null) {
            if (bVar != null) {
                Log.v("UPnP", "Queue HTTP Server Stop Request");
                AsyncTask.execute(new b.b.a.a.b.u.a(bVar));
            } else {
                throw null;
            }
        }
        if (z) {
            a(f.UPNP_RENDERER_LOST, this.f851b);
        }
    }

    public String h() {
        String str = this.f;
        if (str != null && str.length() > 0) {
            return this.f;
        }
        b.b.a.a.b.o.c cVar = this.f852c;
        return cVar != null ? cVar.d : "";
    }

    public boolean i() {
        return this.e == j.CONNECTED;
    }

    public final boolean j() {
        return p() && this.e != j.WAIT_CONNECT;
    }

    public boolean k() {
        Boolean bool = this.k;
        return bool != null && bool.booleanValue();
    }

    public final void l() {
        Log.d("ISCP Connect", "WAIT_INITIAL_ZONE_POWER");
        this.e = j.WAIT_INITIAL_ZONE_POWER;
        b.b.a.a.e.e eVar = this.C;
        if (eVar != null) {
            eVar.a();
        }
        this.g.clear();
        Iterator<b.b.a.a.b.l> it = this.d.values().iterator();
        while (it.hasNext()) {
            this.g.add(it.next().f756c.f751a);
        }
        m();
        b.b.a.a.e.e a2 = b.b.a.a.e.e.a((e.b) new c(), true);
        this.C = a2;
        a2.a(true, 2500);
    }

    public final void m() {
        Iterator<b.b.a.a.b.p.v.a> it = this.g.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final void n() {
        this.F = 0;
        this.E = 0;
        if (this.B == null) {
            this.B = b.b.a.a.e.e.a((e.b) new C0029d(), false);
        }
        this.B.a(true, 1000);
    }

    public final void o() {
        b.b.a.a.e.e eVar = this.C;
        if (eVar != null) {
            eVar.a();
            this.C = null;
        }
        b.b.a.a.e.e eVar2 = this.D;
        if (eVar2 != null) {
            eVar2.a();
            this.D = null;
        }
    }

    public final boolean p() {
        j jVar = this.e;
        return (jVar == j.DISCONNECTED || jVar == j.WAIT_DISCONNECT || jVar == j.WAIT_DISCONNECT_AT_ERR || jVar == j.WAIT_DISCONNECT_AT_PAUSE || jVar == j.WAIT_RECONNECT) ? false : true;
    }

    public int q() {
        return this.d.size();
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public class h extends b.b.a.a.e.b<g> implements g {
        public /* synthetic */ h(d dVar, b.b.a.a.b.p.c cVar) {
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(i iVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(iVar);
            }
        }

        @Override // b.b.a.a.b.p.d.g
        public void b() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((g) it.next()).b();
            }
        }

        @Override // b.b.a.a.b.p.d.g
        public void f() {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((g) it.next()).f();
            }
        }

        @Override // b.b.a.a.b.p.d.g
        public void a(boolean z) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(z);
            }
        }
    }

    /* compiled from: Iscp.java */
    /* loaded from: classes.dex */
    public class m extends b.b.a.a.e.b<k> implements l {
        public /* synthetic */ m(d dVar, b.b.a.a.b.p.c cVar) {
        }

        @Override // b.b.a.a.b.p.d.k
        public void a(f fVar, boolean z, b.b.a.a.b.o.r rVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((k) it.next()).a(fVar, z, rVar);
            }
        }

        @Override // b.b.a.a.b.p.d.l
        public void a(b.b.a.a.b.q.a aVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar instanceof l) {
                    ((l) kVar).a(aVar);
                }
            }
        }
    }

    public b.b.a.a.b.l b() {
        return this.d.get(this.f851b);
    }

    public void a(b.b.a.a.b.p.v.a aVar, String str) {
        b.b.a.a.b.p.v.a aVar2;
        if (!j() || aVar == (aVar2 = b.b.a.a.b.p.v.a.nul)) {
            return;
        }
        r rVar = this.f850a;
        if (rVar == null) {
            throw null;
        }
        rVar.a(aVar2, aVar.f910b + str);
    }

    public void a(b.b.a.a.b.p.v.a aVar, b.b.a.a.b.p.v.a aVar2, String str) {
        if (!j() || aVar2 == b.b.a.a.b.p.v.a.nul) {
            return;
        }
        r rVar = this.f850a;
        if (rVar == null) {
            throw null;
        }
        rVar.a(aVar, aVar2.f910b + str);
    }

    public void a(b.b.a.a.b.p.v.a aVar) {
        if (!j() || aVar == b.b.a.a.b.p.v.a.nul) {
            return;
        }
        this.f850a.a(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x03c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(b.b.a.a.b.p.v.b r11) {
        /*
            Method dump skipped, instructions count: 1288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.d.a(b.b.a.a.b.p.v.b):void");
    }

    public final boolean a(String str) {
        String format;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        b.b.a.a.b.l lVar;
        b.b.a.a.b.o.c a2 = b.b.a.a.b.o.c.a(this.f850a.f901b, str);
        this.f852c = a2;
        if (a2 == null) {
            return false;
        }
        FileInputStream fileInputStream3 = null;
        this.i = a2.a() ? null : r4;
        this.j = e.MAIN;
        this.k = a2.P ? null : true;
        if (a2.N) {
            b.b.a.a.b.t.e eVar = new b.b.a.a.b.t.e(this);
            eVar.f1056b = eVar.f1055a.f852c.X;
            eVar.f1057c = new ArrayList<>(eVar.f1056b);
            b.b.a.a.b.o.c cVar = eVar.f1055a.f852c;
            if (cVar != null) {
                eVar.d = false;
                if (cVar.f801c >= 2014) {
                    Iterator<b.b.a.a.b.o.o> it = eVar.f1055a.f852c.W.iterator();
                    while (it.hasNext()) {
                        eVar.a(it.next());
                    }
                }
                this.l = eVar;
            } else {
                throw null;
            }
        }
        int ordinal = this.f852c.e.ordinal();
        if (ordinal == 0) {
            this.m = 1;
            this.n = 50;
        } else if (ordinal == 1) {
            this.m = 1;
            this.n = 50;
        } else if (ordinal != 2) {
            this.m = 1;
            this.n = 50;
        } else {
            this.m = 9;
            this.n = 100;
        }
        b.b.a.a.b.o.n a3 = this.f852c.a(b.b.a.a.b.o.m.FM);
        if (a3 != null) {
            this.n = a3.f830c;
        }
        b.b.a.a.b.o.n a4 = this.f852c.a(b.b.a.a.b.o.m.AM);
        if (a4 != null) {
            this.m = a4.f830c;
        }
        if (this.d.size() != 0) {
            Iterator<b.b.a.a.b.l> it2 = this.d.values().iterator();
            while (it2.hasNext()) {
                b.b.a.a.b.t.b bVar = it2.next().p;
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
        this.d.clear();
        Iterator<b.b.a.a.b.o.s> it3 = a2.U.iterator();
        while (it3.hasNext()) {
            b.b.a.a.b.o.s next = it3.next();
            if (next.f839b == b.b.a.a.b.o.r.MAIN) {
                lVar = new b.b.a.a.b.h(a2, b.b.a.a.b.o.s.a(next), this);
            } else {
                lVar = new b.b.a.a.b.l(a2, b.b.a.a.b.o.s.a(next), this);
            }
            this.d.put(next.f839b, lVar);
        }
        if (this.d.get(this.f851b) == null) {
            this.f851b = b.b.a.a.b.o.r.MAIN;
        }
        this.p = new b.b.a.a.b.i(a2);
        switch (a2.f801c) {
            case 2008:
            case 2009:
                Log.d("<NetUsbList_2008_09>", "create()");
                this.q = new b.b.a.a.b.r.o(this);
                break;
            case 2010:
                Log.d("<NetUsbList_2010>", "create()");
                this.q = new b.b.a.a.b.r.p(this);
                break;
            case 2011:
                Log.d("<NetUsbList_2011>", "create()");
                this.q = new b.b.a.a.b.r.q(this);
                break;
            default:
                this.q = b.b.a.a.b.r.s.a(this);
                break;
        }
        if (this.d.get(b.b.a.a.b.o.r.MAIN).q.v) {
            this.o = new b.b.a.a.b.s.a(this);
        } else {
            this.o = null;
        }
        if (this.f852c != null) {
            b.b.a.a.d.a a5 = b.b.a.a.d.a.a();
            try {
                format = String.format("serialize_%s_selector.dat", this.f852c.f799a.g);
            } catch (Exception unused) {
            }
            if (a5 != null) {
                try {
                    fileInputStream = a5.f1118a.openFileInput(format);
                } catch (IOException unused2) {
                    fileInputStream = null;
                }
                try {
                    this.p.a(new ObjectInputStream(fileInputStream));
                    fileInputStream.close();
                } catch (Exception unused3) {
                    fileInputStream3 = fileInputStream;
                }
                for (Map.Entry<b.b.a.a.b.o.r, b.b.a.a.b.l> entry : this.d.entrySet()) {
                    try {
                        fileInputStream2 = a5.f1118a.openFileInput(String.format("serialize_%s_zone%d.dat", this.f852c.f799a.g, Integer.valueOf(entry.getKey().f836b)));
                    } catch (IOException unused4) {
                        fileInputStream2 = null;
                    }
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream2);
                        b.b.a.a.b.l value = entry.getValue();
                        if (value != null) {
                            try {
                                value.f755b.a((String) objectInputStream.readObject());
                                value.e.a(objectInputStream);
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            }
                            fileInputStream2.close();
                        } else {
                            throw null;
                        }
                    } catch (Exception unused5) {
                        fileInputStream3 = fileInputStream2;
                    }
                    fileInputStream3 = fileInputStream2;
                    if (fileInputStream3 != null) {
                        try {
                            fileInputStream3.close();
                        } catch (Exception unused6) {
                        }
                    }
                }
            } else {
                throw null;
            }
        }
        if (!(this.f850a.f901b instanceof b.b.a.a.b.n.b)) {
            b.b.a.a.d.a a6 = b.b.a.a.d.a.a();
            this.f = a6.b(a2.f799a.g);
            a6.a(b.b.a.a.d.a.f1116b.f1119a, a2.f799a.g);
            a6.a(b.b.a.a.d.a.f1116b.f1120b, h());
        }
        return true;
    }

    public b.b.a.a.b.t.f a(b.b.a.a.b.o.m mVar) {
        b.b.a.a.b.t.f fVar = new b.b.a.a.b.t.f();
        b.b.a.a.b.o.n a2 = this.f852c.a(mVar);
        if (a2 != null) {
            return a2.f829b;
        }
        int ordinal = mVar.ordinal();
        if (ordinal == 1) {
            g.b bVar = this.f852c.e;
            if (bVar == g.b.JAPAN) {
                fVar.f1058a = 76000;
                fVar.f1059b = 90000;
            } else if (bVar == g.b.NORTH_AMERICA) {
                fVar.f1058a = 87500;
                fVar.f1059b = 108000;
            } else {
                fVar.f1058a = 87500;
                fVar.f1059b = 108000;
            }
        } else if (ordinal == 2) {
            int i2 = this.m;
            if (i2 == 1) {
                fVar.f1058a = 522;
                fVar.f1059b = 1710;
            } else if (i2 == 9) {
                if (this.f852c.e == g.b.JAPAN) {
                    fVar.f1058a = 522;
                    fVar.f1059b = 1629;
                } else {
                    fVar.f1058a = 522;
                    fVar.f1059b = 1611;
                }
            } else {
                fVar.f1058a = 530;
                fVar.f1059b = 1710;
            }
        } else if (ordinal != 3) {
            fVar.f1058a = 0;
            fVar.f1059b = 0;
        } else {
            fVar.f1058a = 0;
            fVar.f1059b = 255;
        }
        return fVar;
    }

    public boolean a() {
        Boolean bool = this.i;
        return bool != null && bool.booleanValue();
    }

    public b.b.a.a.b.l a(b.b.a.a.b.o.r rVar) {
        return this.d.get(rVar);
    }

    public void a(f fVar, b.b.a.a.b.o.r rVar) {
        b.b.a.a.b.o.r rVar2;
        b.b.a.a.b.u.c cVar;
        b.b.a.a.b.t.e eVar;
        if (fVar == f.SELECTOR && (rVar2 = this.f851b) == rVar) {
            b.b.a.a.b.l lVar = this.d.get(rVar2);
            if (lVar.q.v && lVar.d() == b.b.a.a.b.o.h.TV_CD) {
                b.b.a.a.b.s.a aVar = this.o;
                aVar.j.a(b.b.a.a.b.p.v.a.DST);
                aVar.j.a(b.b.a.a.b.p.v.a.CFS);
                aVar.j.a(b.b.a.a.b.p.v.a.CTS);
                aVar.j.a(b.b.a.a.b.p.v.a.CST);
                aVar.j.a(b.b.a.a.b.p.v.a.CTM);
            }
            if (b.b.a.a.b.o.i.c(lVar.d()) && (eVar = this.l) != null && eVar.f1055a.f852c == null) {
                throw null;
            }
            b.b.a.a.b.r.l lVar2 = this.q;
            b.b.a.a.b.o.h d = lVar.d();
            if (lVar2 != null) {
                if (d != b.b.a.a.b.o.h.NETWORK && d != b.b.a.a.b.o.h.MUSIC_SERVER && (cVar = b.b.a.a.b.u.c.i) != null) {
                    cVar.c();
                }
            } else {
                throw null;
            }
        }
        this.x.a(fVar, this.f851b == rVar, rVar);
        if (fVar == f.SELECTOR) {
            b.b.a.a.b.o.r rVar3 = this.f851b;
            b.b.a.a.b.o.r rVar4 = b.b.a.a.b.o.r.MAIN;
            if (rVar3 != rVar4 && rVar == rVar4 && b().e() == b.b.a.a.b.o.h.SOURCE) {
                this.x.a(f.SELECTOR, true, this.f851b);
            }
        }
    }
}
