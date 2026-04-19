package b.b.a.a.b.r;

import b.b.a.a.b.r.l;
import java.io.CharConversionException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: NetUsbListTitleInfo.java */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.b.o.e f990a;

    /* renamed from: b, reason: collision with root package name */
    public l.e f991b;

    /* renamed from: c, reason: collision with root package name */
    public int f992c;
    public boolean d;
    public int e;
    public int f;
    public String g;

    /* compiled from: NetUsbListTitleInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        NET_TOP(0),
        SERICE_TOP(1),
        DLNA_USB_IPOD_TOP(2),
        SECOND_LAYER(3),
        UNKNOWN(-1);

        public static final Map<Integer, a> h = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final int f994b;

        static {
            for (a aVar : values()) {
                h.put(Integer.valueOf(aVar.f994b), aVar);
            }
        }

        a(int i2) {
            this.f994b = i2;
        }
    }

    public n(b.b.a.a.b.p.v.d dVar, boolean z) {
        try {
            this.f990a = b.b.a.a.b.o.e.a(dVar.a(0, 2));
        } catch (CharConversionException unused) {
        }
        if (this.f990a == null) {
            this.f990a = b.b.a.a.b.o.e.NONE;
        }
        boolean z2 = true;
        try {
            l.e eVar = l.e.m.get(Integer.valueOf(dVar.a(2, 1)));
            this.f991b = eVar == null ? l.e.UNKNOWN : eVar;
        } catch (CharConversionException unused2) {
            this.f991b = l.e.UNKNOWN;
        }
        if (z) {
            a aVar = a.UNKNOWN;
            try {
                this.f992c = dVar.a(3, 1);
            } catch (CharConversionException unused3) {
                this.f992c = 0;
            }
            this.d = false;
        } else {
            try {
                if (a.h.get(Integer.valueOf(dVar.a(3, 1))) == null) {
                    a aVar2 = a.UNKNOWN;
                }
            } catch (CharConversionException unused4) {
                a aVar3 = a.UNKNOWN;
            }
            try {
                this.f992c = dVar.a(12, 2);
            } catch (CharConversionException unused5) {
                this.f992c = 0;
            }
            try {
                dVar.a(14, 1);
            } catch (CharConversionException unused6) {
            }
            try {
                if (dVar.a(15, 1) == 0) {
                    z2 = false;
                }
                this.d = z2;
            } catch (CharConversionException unused7) {
                this.d = false;
            }
        }
        try {
            this.e = dVar.a(4, 4);
        } catch (CharConversionException unused8) {
            this.e = 0;
        }
        try {
            this.f = dVar.a(8, 4);
        } catch (CharConversionException unused9) {
            this.f = 0;
        }
        try {
            dVar.a(16, 2);
        } catch (CharConversionException unused10) {
        }
        try {
            dVar.a(18, 2);
        } catch (CharConversionException unused11) {
        }
        this.g = dVar.f915a.substring(22);
    }
}
