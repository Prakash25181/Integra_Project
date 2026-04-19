package b.b.a.a.b.p;

import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: IscpIo.java */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public a f900a;

    /* renamed from: b, reason: collision with root package name */
    public g f901b;

    /* renamed from: c, reason: collision with root package name */
    public Thread f902c;
    public Runnable d;
    public Object g = new Object();
    public Handler e = new Handler();
    public final LinkedList<b> f = new LinkedList<>();

    /* compiled from: IscpIo.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: IscpIo.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public b.b.a.a.b.p.v.a f903a;

        /* renamed from: b, reason: collision with root package name */
        public String f904b;

        public b(r rVar, b.b.a.a.b.p.v.a aVar, String str) {
            this.f903a = aVar;
            this.f904b = str;
        }
    }

    public r(g gVar, a aVar) {
        this.f901b = gVar;
        this.f900a = aVar;
    }

    public void a() {
        try {
            if (this.f902c != null && this.f902c.isAlive()) {
                this.f902c.interrupt();
                this.f902c.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f902c = null;
        this.f901b = null;
    }

    public boolean b() {
        boolean z;
        synchronized (this.g) {
            z = !this.f.isEmpty();
        }
        return z;
    }

    public abstract boolean c();

    public b d() {
        synchronized (this.g) {
            if (this.f.isEmpty()) {
                return null;
            }
            return this.f.pollFirst();
        }
    }

    public b e() {
        b pollFirst;
        synchronized (this.g) {
            while (this.f.peekFirst() == null) {
                this.g.wait();
            }
            pollFirst = this.f.pollFirst();
        }
        return pollFirst;
    }

    public void a(b.b.a.a.b.p.v.a aVar) {
        a(b.b.a.a.b.p.v.a.nul, aVar.f910b + "QSTN");
    }

    public void a(b.b.a.a.b.p.v.a aVar, String str) {
        if (aVar != b.b.a.a.b.p.v.a.nul) {
            synchronized (this.g) {
                boolean z = false;
                Iterator<b> it = this.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    b next = it.next();
                    if (next.f903a == aVar) {
                        if (z) {
                            this.f.remove(next);
                            break;
                        }
                        z = true;
                    }
                }
                this.f.add(new b(this, aVar, str));
            }
        } else {
            synchronized (this.g) {
                this.f.add(new b(this, aVar, str));
            }
        }
        synchronized (this.g) {
            this.g.notify();
        }
    }
}
