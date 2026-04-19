package a.h.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* compiled from: FragmentHostCallback.java */
/* loaded from: classes.dex */
public abstract class h<E> extends e {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f496b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f497c;
    public final Handler d;
    public final int e;
    public final j f;

    public h(d dVar) {
        Handler handler = new Handler();
        this.f = new j();
        this.f496b = dVar;
        a.b.k.r.a(dVar, (Object) "context == null");
        this.f497c = dVar;
        a.b.k.r.a(handler, "handler == null");
        this.d = handler;
        this.e = 0;
    }
}
