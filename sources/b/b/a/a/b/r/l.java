package b.b.a.a.b.r;

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NetUsbList.java */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public d f980a = new d(this);

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.p.d f981b;

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public enum a {
        NO_CHANGE(0),
        UP(-1),
        DOWN(1),
        REPLACE(2);

        a(int i) {
        }
    }

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN,
        STANDARD,
        EXTENDED,
        VIDEO
    }

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(b.b.a.a.b.o.f fVar, b.b.a.a.b.o.f fVar2);

        void a(i iVar);

        void a(e eVar, a aVar);

        void a(f fVar);

        void a(x xVar);
    }

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public enum e {
        LIST(0),
        MENU(1),
        PLAYBACK(2),
        POPUP(3),
        KEYBOARD(4),
        MENU_LIST(5),
        SERVICE_CHANGING(6),
        USB_NON_CONTROLABLE(256),
        CUSTOM_POPUP(257),
        UNKNOWN(-1);

        public static final Map<Integer, e> m = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final int f987b;

        static {
            for (e eVar : values()) {
                m.put(Integer.valueOf(eVar.f987b), eVar);
            }
        }

        e(int i) {
            this.f987b = i;
        }
    }

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public enum f {
        UNKNOWN,
        NONE,
        DISABLED,
        MEMORY,
        IPOD_STANDARD,
        IPOD_EXTENDED,
        WIRELESS_ADAPTER,
        BLUETOOTH_ADAPTER
    }

    public l(b.b.a.a.b.p.d dVar) {
        this.f981b = dVar;
    }

    public i a() {
        throw null;
    }

    public void a(int i) {
        throw null;
    }

    public void a(b.b.a.a.b.o.f fVar, b.b.a.a.b.o.f fVar2) {
        b.b.a.a.b.u.c cVar;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(fVar2 != null ? fVar2.f808a.f807b : 0);
        objArr[1] = Integer.valueOf(fVar != null ? fVar.f808a.f807b : 0);
        Log.v("NET", String.format("Service Changed  %02X -> %02X", objArr));
        if ((fVar2 == null || fVar2.f808a == b.b.a.a.b.o.e.THIS_DEVICE) && fVar.f808a != b.b.a.a.b.o.e.THIS_DEVICE && (cVar = b.b.a.a.b.u.c.i) != null) {
            cVar.c();
        }
        if (fVar.f808a != b.b.a.a.b.o.e.NET_TOP) {
            k().e();
        }
        this.f980a.a(fVar2, fVar);
    }

    public void a(b.b.a.a.b.o.f fVar, boolean z) {
        throw null;
    }

    public void a(b.b.a.a.b.o.h hVar, b.b.a.a.b.l lVar, boolean z) {
    }

    public void a(b.b.a.a.b.p.v.b bVar) {
        throw null;
    }

    public boolean b() {
        return false;
    }

    public boolean c() {
        throw null;
    }

    public boolean d() {
        throw null;
    }

    public void e() {
    }

    public b.b.a.a.b.o.f f() {
        throw null;
    }

    public b.b.a.a.b.o.e g() {
        b.b.a.a.b.o.f f2 = f();
        if (f2 != null) {
            return f2.f808a;
        }
        return b.b.a.a.b.o.e.NONE;
    }

    public e h() {
        throw null;
    }

    public x i() {
        return null;
    }

    public k j() {
        throw null;
    }

    public v k() {
        throw null;
    }

    public y l() {
        throw null;
    }

    public void m() {
        a("RETURN");
    }

    public void n() {
        throw null;
    }

    public f o() {
        throw null;
    }

    /* compiled from: NetUsbList.java */
    /* loaded from: classes.dex */
    public class d extends b.b.a.a.e.b<c> implements c {
        public d(l lVar) {
        }

        @Override // b.b.a.a.b.r.l.c
        public void a(b.b.a.a.b.o.f fVar, b.b.a.a.b.o.f fVar2) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(fVar, fVar2);
            }
        }

        @Override // b.b.a.a.b.r.l.c
        public void a(e eVar, a aVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(eVar, aVar);
            }
        }

        @Override // b.b.a.a.b.r.l.c
        public void a(x xVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(xVar);
            }
        }

        @Override // b.b.a.a.b.r.l.c
        public void a(i iVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(iVar);
            }
        }

        @Override // b.b.a.a.b.r.l.c
        public void a(f fVar) {
            Iterator it = ((HashSet) g()).iterator();
            while (it.hasNext()) {
                ((c) it.next()).a(fVar);
            }
        }
    }

    public void a(String str) {
        if (str != "MENU" && str != "TOP" && str != "MODE" && str != "LIST") {
            b.b.a.a.b.p.d dVar = this.f981b;
            dVar.a(dVar.b().b(), str);
        } else {
            this.f981b.a(b.b.a.a.b.p.v.a.NTC, str);
        }
    }

    public a a(e eVar, e eVar2) {
        int ordinal = eVar.ordinal();
        if (ordinal != 7 && ordinal != 9) {
            switch (eVar2) {
                case LIST:
                    if (eVar != e.LIST) {
                        return a.UP;
                    }
                    return a.NO_CHANGE;
                case MENU:
                    int ordinal2 = eVar.ordinal();
                    if (ordinal2 == 1) {
                        return a.UP;
                    }
                    if (ordinal2 != 5) {
                        return a.NO_CHANGE;
                    }
                    return a.DOWN;
                case PLAYBACK:
                    int ordinal3 = eVar.ordinal();
                    if (ordinal3 != 1 && ordinal3 != 5) {
                        return a.DOWN;
                    }
                    return a.UP;
                case POPUP:
                case KEYBOARD:
                case CUSTOM_POPUP:
                    return a.DOWN;
                case MENU_LIST:
                    if (eVar != eVar2) {
                        return a.DOWN;
                    }
                    return a.NO_CHANGE;
                case SERVICE_CHANGING:
                default:
                    return a.NO_CHANGE;
                case USB_NON_CONTROLABLE:
                    return a.REPLACE;
            }
        }
        return a.REPLACE;
    }
}
