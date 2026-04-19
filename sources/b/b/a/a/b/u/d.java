package b.b.a.a.b.u;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.os.Handler;
import android.util.Log;
import b.b.a.a.c.d;
import b.b.a.a.c.g;
import b.b.a.a.c.h;
import b.b.a.a.f.k0.v.m;
import b.b.a.a.f.k0.v.n;
import b.b.a.a.f.k0.v.o;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplicationService;
import com.onkyo.jp.upnp.Disposable;
import com.onkyo.jp.upnp.UpnpContent;
import com.onkyo.jp.upnp.UpnpControl;
import java.util.Random;

/* compiled from: UpnpPlayer.java */
/* loaded from: classes.dex */
public class d extends Disposable {

    /* renamed from: a, reason: collision with root package name */
    public UpnpControl f1068a;

    /* renamed from: c, reason: collision with root package name */
    public int f1070c;
    public int d;
    public boolean e;
    public h f;
    public int g;
    public d.g h;
    public short[] l;
    public c m;
    public boolean n;
    public InterfaceC0034d o;
    public b.b.a.a.b.u.b p;
    public UpnpControl.Delegate r;

    /* renamed from: b, reason: collision with root package name */
    public int f1069b = 0;
    public boolean i = false;
    public boolean j = false;
    public int k = 0;
    public Handler q = new Handler();

    /* compiled from: UpnpPlayer.java */
    /* loaded from: classes.dex */
    public class a implements UpnpControl.PlayCallback {

        /* compiled from: UpnpPlayer.java */
        /* renamed from: b.b.a.a.b.u.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0032a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1072b;

            public RunnableC0032a(int i) {
                this.f1072b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                String string;
                String str;
                c cVar = d.this.m;
                if (cVar != null) {
                    int i = this.f1072b;
                    m mVar = (m) cVar;
                    Resources resources = mVar.f1597b.getResources();
                    if (i != -1001) {
                        str = resources.getString(R.string.upnpPlayErrorTitle);
                        string = String.format(resources.getString(R.string.upnpPlayErrorMessageAndCode), Integer.valueOf(i));
                    } else {
                        string = resources.getString(R.string.upnpDemoModeMessage);
                        str = "";
                    }
                    mVar.E = new AlertDialog.Builder(mVar.f1597b).setTitle(str).setMessage(string).setPositiveButton(resources.getString(R.string.close), new o(mVar)).setOnCancelListener(new n(mVar)).show();
                    mVar.c(1);
                }
                d.this.d();
            }
        }

        public a() {
        }

        @Override // com.onkyo.jp.upnp.UpnpControl.PlayCallback
        public void onPlayResult(boolean z, int i) {
            if (z) {
                return;
            }
            d dVar = d.this;
            dVar.j = true;
            dVar.q.post(new RunnableC0032a(i));
        }
    }

    /* compiled from: UpnpPlayer.java */
    /* loaded from: classes.dex */
    public class b implements UpnpControl.Delegate {

        /* compiled from: UpnpPlayer.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1075b;

            public a(int i) {
                this.f1075b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.g gVar;
                int i;
                d dVar = d.this;
                int i2 = this.f1075b;
                c cVar = dVar.m;
                if (cVar != null) {
                    ((m) cVar).c(i2);
                }
                int i3 = dVar.f1069b;
                dVar.f1069b = i2;
                if (i2 == 1 && dVar.e) {
                    dVar.i = false;
                    dVar.b();
                } else if (i2 == 1 && !dVar.i && (gVar = dVar.h) != null && !dVar.j && ((gVar.g == 0 && dVar.k > 0) || ((i = dVar.h.g) > 0 && Math.abs(i - dVar.k) <= 3))) {
                    dVar.e = false;
                    int i4 = dVar.f1070c;
                    if (i4 == 0) {
                        int i5 = 0;
                        while (i5 < 30 && dVar.g != ((g) dVar.f).a() - 1) {
                            dVar.b(dVar.g + 1);
                            if (dVar.h.c() && dVar.a()) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (dVar.g == ((g) dVar.f).a() - 1 || i5 == 30) {
                            dVar.d();
                        }
                    } else if (i4 == 1) {
                        dVar.a();
                    } else if (i4 == 2) {
                        int i6 = 0;
                        while (i6 < 30) {
                            if (dVar.g < ((g) dVar.f).a() - 1) {
                                dVar.b(dVar.g + 1);
                            } else {
                                if (dVar.d == 1) {
                                    dVar.a(0, true);
                                }
                                dVar.b(0);
                            }
                            if (dVar.h.c() && dVar.a()) {
                                break;
                            } else {
                                i6++;
                            }
                        }
                        if (i6 == 30) {
                            dVar.d();
                        }
                    }
                } else if ((i3 == 3 || i3 == 4) && i2 == 1) {
                    dVar.d();
                }
                if (i2 == 4 || i2 == 1) {
                    dVar.i = false;
                }
            }
        }

        /* compiled from: UpnpPlayer.java */
        /* renamed from: b.b.a.a.b.u.d$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0033b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1077b;

            public RunnableC0033b(int i) {
                this.f1077b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.g gVar;
                d dVar = d.this;
                int i = this.f1077b;
                if (i > dVar.k && (gVar = dVar.h) != null) {
                    int i2 = gVar.g;
                    if (i2 == 0) {
                        dVar.k = i;
                    } else {
                        dVar.k = Math.min(i, i2);
                    }
                }
                c cVar = dVar.m;
                if (cVar != null) {
                    ((m) cVar).d(i);
                }
            }
        }

        public b() {
        }

        @Override // com.onkyo.jp.upnp.UpnpControl.Delegate
        public void onDmrPositionChanged(int i) {
            d.this.q.post(new RunnableC0033b(i));
        }

        @Override // com.onkyo.jp.upnp.UpnpControl.Delegate
        public void onDmrStatusChanged(int i) {
            d.this.q.post(new a(i));
        }
    }

    /* compiled from: UpnpPlayer.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* compiled from: UpnpPlayer.java */
    /* renamed from: b.b.a.a.b.u.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0034d {
    }

    public d(UpnpControl upnpControl, b.b.a.a.b.u.b bVar, InterfaceC0034d interfaceC0034d) {
        b bVar2 = new b();
        this.r = bVar2;
        this.f1068a = upnpControl;
        upnpControl.setDelegate(bVar2);
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        if (a2 != null) {
            this.f1070c = a2.b(b.b.a.a.d.a.f1116b.d);
            this.d = a2.b(b.b.a.a.d.a.f1116b.f1121c);
            this.e = false;
            this.n = false;
            this.p = bVar;
            this.o = interfaceC0034d;
            return;
        }
        throw null;
    }

    public boolean a() {
        int i;
        if (this.i && ((i = this.f1069b) == 4 || i == 3 || i == 2)) {
            this.e = true;
            return true;
        }
        return b();
    }

    public final void b(int i) {
        this.g = i;
        h hVar = this.f;
        short s = this.l[i];
        g gVar = (g) hVar;
        d.g gVar2 = null;
        if (gVar != null) {
            if (s >= 0 && s < gVar.f1114a.b()) {
                gVar2 = (d.g) gVar.f1114a.c(s);
            }
            h hVar2 = this.f;
            short s2 = this.l[i];
            g gVar3 = (g) hVar2;
            if (s2 < 0 || gVar3.f1114a.b() <= s2) {
                s2 = 0;
            }
            gVar3.f1115b = s2;
            this.h = gVar2;
            c cVar = this.m;
            if (cVar != null) {
                ((m) cVar).a(gVar2);
                return;
            }
            return;
        }
        throw null;
    }

    public int c() {
        return this.f1068a.status();
    }

    public String d(int i) {
        d.g gVar = this.h;
        return gVar != null ? gVar.a(i) : "";
    }

    @Override // com.onkyo.jp.upnp.Disposable
    public void disposeObjects() {
        d();
        this.f1068a.setDelegate(null);
        super.disposeObjects();
    }

    public int e() {
        return this.f1068a.position();
    }

    public void stop() {
        if (this.f1069b != 1) {
            Log.v("UPnP", "Stop");
            this.i = true;
            this.k = 0;
            this.e = false;
            this.f1068a.stop();
        }
    }

    public void c(int i) {
        if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("invalid repeat mode");
        }
        if (this.f1070c != i) {
            this.f1070c = i;
            b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
            int i2 = this.f1070c;
            if (a2 == null) {
                throw null;
            }
            a2.a(b.b.a.a.d.a.f1116b.d, i2);
        }
    }

    public final void d() {
        if (this.n) {
            Log.v("UPnP", "Streaming session ended");
            this.n = false;
            InterfaceC0034d interfaceC0034d = this.o;
            if (interfaceC0034d != null) {
                final RemoteApplicationService remoteApplicationService = RemoteApplicationService.this;
                remoteApplicationService.d = false;
                remoteApplicationService.e.post(new Runnable() { // from class: b.b.a.a.b.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        RemoteApplicationService.this.b();
                    }
                });
            }
        }
    }

    public final void a(int i, boolean z) {
        if (this.d == 0 || ((g) this.f).a() == 1) {
            a(0);
            return;
        }
        if (z) {
            a(0);
            short[] sArr = this.l;
            a(sArr, 0, sArr.length);
        } else {
            a(i);
            short[] sArr2 = this.l;
            a(sArr2, 1, sArr2.length - 1);
        }
    }

    public final void a(int i) {
        int i2 = 0;
        this.l[0] = (short) i;
        int i3 = 1;
        while (true) {
            short[] sArr = this.l;
            if (i2 >= sArr.length) {
                return;
            }
            if (i2 != i) {
                sArr[i3] = (short) i2;
                i3++;
            }
            i2++;
        }
    }

    public final void a(short[] sArr, int i, int i2) {
        Random random = new Random();
        int i3 = i2 + i;
        while (i < i3 - 1) {
            int i4 = i + 1;
            int nextInt = random.nextInt((i3 - i) - 1) + i4;
            short s = sArr[i];
            sArr[i] = sArr[nextInt];
            sArr[nextInt] = s;
            i = i4;
        }
    }

    public final boolean b() {
        d.g gVar;
        boolean z = false;
        this.j = false;
        if (this.f != null && (gVar = this.h) != null && gVar.c()) {
            if (!this.n) {
                this.n = true;
                InterfaceC0034d interfaceC0034d = this.o;
                if (interfaceC0034d != null) {
                    RemoteApplicationService.a(RemoteApplicationService.this);
                }
            }
            this.p.f1062b = this.h;
            this.i = false;
            this.k = 0;
            this.e = false;
            UpnpContent upnpContent = new UpnpContent();
            d.g gVar2 = this.h;
            int i = gVar2.f1093a;
            upnpContent.persistentId = i;
            upnpContent.title = gVar2.f1094b;
            upnpContent.artist = gVar2.f1095c;
            upnpContent.album = gVar2.d;
            upnpContent.duration = gVar2.g;
            upnpContent.mimeType = gVar2.j;
            upnpContent.streamUrl = this.p.a(i, "stream");
            upnpContent.artworkUrl = this.p.a(this.h.f1093a, "artwork");
            Log.v("UPnP", String.format("Play : %s", upnpContent.streamUrl));
            z = this.f1068a.play(upnpContent, new a());
            if (!z) {
                d();
            }
        }
        return z;
    }
}
