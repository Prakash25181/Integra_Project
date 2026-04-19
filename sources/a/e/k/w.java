package a.e.k;

/* compiled from: WindowInsetsCompat.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Object f457a;

    public w(Object obj) {
        this.f457a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        Object obj2 = this.f457a;
        Object obj3 = ((w) obj).f457a;
        return obj2 == null ? obj3 == null : obj2.equals(obj3);
    }

    public int hashCode() {
        Object obj = this.f457a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }
}
