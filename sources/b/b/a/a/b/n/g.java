package b.b.a.a.b.n;

import android.util.Log;
import b.b.a.a.b.o.s;
import b.b.a.a.b.p.o;
import b.b.a.a.b.p.p;
import b.b.a.a.b.p.q;
import b.b.a.a.b.p.r;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: IscpIoDemo.java */
/* loaded from: classes.dex */
public class g extends r {
    public boolean h;
    public b.b.a.a.b.n.a i;

    /* compiled from: IscpIoDemo.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.h = true;
            gVar.e.post(new o(gVar));
            while (!g.this.f902c.isInterrupted()) {
                try {
                    r.b e = g.this.e();
                    if (e != null) {
                        b.b.a.a.b.p.v.b a2 = b.b.a.a.b.p.v.b.a(g.this.f901b.f873b, e.f904b);
                        Log.d("ISCP", "send  " + e.f904b);
                        g.this.i.a(a2);
                    }
                } catch (InterruptedException unused) {
                }
            }
            g gVar2 = g.this;
            gVar2.h = false;
            gVar2.e.post(new p(gVar2));
            Log.d("ISCPDEMO", "I/O thread terminated");
        }
    }

    public g(b.b.a.a.b.p.g gVar, r.a aVar) {
        super(gVar, aVar);
        b.b.a.a.b.n.a aVar2 = new b.b.a.a.b.n.a(this);
        aVar2.f775b = null;
        b.b.a.a.b.g a2 = b.b.a.a.b.g.a();
        if (a2 == null) {
            throw null;
        }
        String b2 = a2.b(String.format("%s/%s", "devicelist", "DEMO.xml"));
        aVar2.f776c = b2;
        b.b.a.a.b.o.c a3 = b2 != null ? b.b.a.a.b.o.c.a(aVar2.f774a.f901b, b2) : null;
        aVar2.f775b = a3;
        if (a3 == null) {
            aVar2 = null;
        } else {
            aVar2.i = new c(aVar2);
            aVar2.j = new d(aVar2);
            aVar2.d = new HashMap<>();
            Iterator<s> it = aVar2.f775b.U.iterator();
            while (it.hasNext()) {
                s next = it.next();
                aVar2.d.put(next.f839b, new f(aVar2, s.a(next)));
            }
        }
        this.i = aVar2;
        this.d = new a();
    }

    public void b(b.b.a.a.b.p.v.a aVar, String str) {
        b.b.a.a.b.p.v.b a2 = b.b.a.a.b.p.v.b.a(this.f901b.f873b, aVar.f910b + str);
        if (a2.f912b != b.b.a.a.b.p.v.a.nul) {
            StringBuilder a3 = b.a.a.a.a.a("reply ");
            a3.append(a2.f912b.f910b);
            a3.append(a2.f913c.f915a);
            Log.d("ISCP", a3.toString());
        } else {
            StringBuilder a4 = b.a.a.a.a.a("reply <NOT REGIST> ");
            a4.append(a2.f);
            a4.append(a2.f913c.f915a);
            Log.d("ISCP", a4.toString());
        }
        this.e.post(new q(this, a2));
    }

    @Override // b.b.a.a.b.p.r
    public boolean c() {
        return this.h;
    }
}
