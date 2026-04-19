package a.e.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: SelfDestructiveThread.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    public HandlerThread f409b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f410c;
    public final int f;
    public final int g;
    public final String h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f408a = new Object();
    public Handler.Callback e = new a();
    public int d = 0;

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                c.this.a();
                return true;
            }
            if (i != 1) {
                return true;
            }
            c.this.a((Runnable) message.obj);
            return true;
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f412b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Callable f413c;
        public final /* synthetic */ ReentrantLock d;
        public final /* synthetic */ AtomicBoolean e;
        public final /* synthetic */ Condition f;

        public b(c cVar, AtomicReference atomicReference, Callable callable, ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, Condition condition) {
            this.f412b = atomicReference;
            this.f413c = callable;
            this.d = reentrantLock;
            this.e = atomicBoolean;
            this.f = condition;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f412b.set(this.f413c.call());
            } catch (Exception unused) {
            }
            this.d.lock();
            try {
                this.e.set(false);
                this.f.signal();
            } finally {
                this.d.unlock();
            }
        }
    }

    /* compiled from: SelfDestructiveThread.java */
    /* renamed from: a.e.h.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0015c<T> {
        void a(T t);
    }

    public c(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
    }

    public <T> T a(Callable<T> callable, int i) {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        b(new b(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition));
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return (T) atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            do {
                try {
                    nanos = newCondition.awaitNanos(nanos);
                } catch (InterruptedException unused) {
                }
                if (!atomicBoolean.get()) {
                    return (T) atomicReference.get();
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(Runnable runnable) {
        synchronized (this.f408a) {
            if (this.f409b == null) {
                HandlerThread handlerThread = new HandlerThread(this.h, this.g);
                this.f409b = handlerThread;
                handlerThread.start();
                this.f410c = new Handler(this.f409b.getLooper(), this.e);
                this.d++;
            }
            this.f410c.removeMessages(0);
            this.f410c.sendMessage(this.f410c.obtainMessage(1, runnable));
        }
    }

    public void a(Runnable runnable) {
        runnable.run();
        synchronized (this.f408a) {
            this.f410c.removeMessages(0);
            this.f410c.sendMessageDelayed(this.f410c.obtainMessage(0), this.f);
        }
    }

    public void a() {
        synchronized (this.f408a) {
            if (this.f410c.hasMessages(1)) {
                return;
            }
            this.f409b.quit();
            this.f409b = null;
            this.f410c = null;
        }
    }
}
