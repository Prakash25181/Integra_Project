package b.b.a.a.f;

import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.m.e f1610c;

    public q(MainActivity mainActivity, boolean z, b.b.a.a.b.m.e eVar) {
        this.f1609b = z;
        this.f1610c = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f1609b) {
            this.f1610c.a("MVLUP");
        } else {
            this.f1610c.a("MVLDOWN");
        }
    }
}
