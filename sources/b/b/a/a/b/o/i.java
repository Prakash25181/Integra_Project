package b.b.a.a.b.o;

/* compiled from: SelectorInfo.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public i f816a = null;

    /* renamed from: b, reason: collision with root package name */
    public h f817b;

    /* renamed from: c, reason: collision with root package name */
    public g f818c;
    public String d;
    public int e;

    public static boolean a(h hVar) {
        return b(hVar) || d(hVar);
    }

    public static boolean b(h hVar) {
        int ordinal = hVar.ordinal();
        return ordinal == 20 || ordinal == 21 || ordinal == 24;
    }

    public static boolean c(h hVar) {
        int ordinal = hVar.ordinal();
        if (ordinal == 17 || ordinal == 18) {
            return true;
        }
        switch (ordinal) {
            case 30:
            case 31:
            case 32:
                return true;
            default:
                return false;
        }
    }

    public static boolean d(h hVar) {
        int ordinal = hVar.ordinal();
        return ordinal == 22 || ordinal == 23;
    }

    public void a(g gVar) {
        if (gVar == null) {
            this.f818c = this.f816a.f818c;
        } else {
            this.f818c = gVar;
        }
    }

    public void a(String str) {
        if (str != null && str.length() != 0) {
            this.d = str;
        } else {
            this.d = this.f816a.d;
        }
    }

    public String a() {
        i iVar = this.f816a;
        if (iVar != null) {
            return iVar.a();
        }
        return this.d;
    }
}
