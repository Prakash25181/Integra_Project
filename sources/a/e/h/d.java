package a.e.h;

import a.e.h.c;
import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: SelfDestructiveThread.java */
/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Handler f415c;
    public final /* synthetic */ c.InterfaceC0015c d;

    /* compiled from: SelfDestructiveThread.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f416b;

        public a(Object obj) {
            this.f416b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.d.a(this.f416b);
        }
    }

    public d(c cVar, Callable callable, Handler handler, c.InterfaceC0015c interfaceC0015c) {
        this.f414b = callable;
        this.f415c = handler;
        this.d = interfaceC0015c;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        try {
            obj = this.f414b.call();
        } catch (Exception unused) {
            obj = null;
        }
        this.f415c.post(new a(obj));
    }
}
