package b.b.a.a.b.p.v;

/* compiled from: IscpMessage.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public char f911a;

    /* renamed from: b, reason: collision with root package name */
    public a f912b;

    /* renamed from: c, reason: collision with root package name */
    public d f913c;
    public e d;
    public f e;
    public String f;

    public static b a(char c2, String str) {
        b bVar = new b();
        bVar.f911a = c2;
        bVar.f912b = a.a(str.substring(0, 3));
        bVar.f = str.substring(0, 3);
        String substring = str.substring(3);
        d dVar = new d();
        dVar.f915a = substring;
        bVar.f913c = dVar;
        return bVar;
    }

    public boolean a() {
        return this.f913c.f915a.equals("QSTN");
    }
}
