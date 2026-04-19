package b.b.a.a.e;

import android.os.Handler;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: RepeatTask.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f1139a = true;

    /* renamed from: b, reason: collision with root package name */
    public Handler f1140b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f1141c;
    public b d;

    /* compiled from: RepeatTask.java */
    /* loaded from: classes.dex */
    public interface b {
        void run();
    }

    /* compiled from: RepeatTask.java */
    /* loaded from: classes.dex */
    public class c extends TimerTask {

        /* compiled from: RepeatTask.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.d.run();
            }
        }

        public /* synthetic */ c(a aVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (e.this.f1139a) {
                if (e.this.f1140b != null) {
                    e.this.f1140b.post(new a());
                } else {
                    e.this.d.run();
                }
            }
        }
    }

    public static e a(b bVar, boolean z) {
        e eVar = new e();
        eVar.d = bVar;
        if (z) {
            eVar.f1140b = new Handler();
        }
        return eVar;
    }

    public void a(boolean z, int i) {
        if (this.f1141c != null) {
            a();
        }
        Timer timer = new Timer(true);
        this.f1141c = timer;
        a aVar = null;
        if (z) {
            timer.schedule(new c(aVar), 0L, i);
        } else {
            timer.schedule(new c(aVar), i);
        }
    }

    public void a() {
        Timer timer = this.f1141c;
        if (timer != null) {
            timer.cancel();
            this.f1141c = null;
            synchronized (this.f1139a) {
            }
        }
    }
}
