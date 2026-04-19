package b.b.a.a.b.o;

/* compiled from: ZoneInfo.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public s f838a;

    /* renamed from: b, reason: collision with root package name */
    public r f839b;

    /* renamed from: c, reason: collision with root package name */
    public String f840c;
    public boolean d;
    public int e;
    public int f;
    public a g;

    /* compiled from: ZoneInfo.java */
    /* loaded from: classes.dex */
    public enum a {
        ONE_DB,
        HALF_DB
    }

    public static s a(s sVar) {
        s sVar2 = new s();
        sVar2.f838a = sVar;
        sVar2.f840c = sVar.f840c;
        sVar2.f839b = sVar.f839b;
        sVar2.d = sVar.d;
        sVar2.e = sVar.e;
        sVar2.f = sVar.f;
        sVar2.g = sVar.g;
        return sVar2;
    }

    public void a(String str) {
        if (str != null && str.length() != 0) {
            this.f840c = str;
        } else {
            this.f840c = this.f838a.f840c;
        }
    }
}
