package b.b.a.a.f;

import java.util.TimerTask;

/* compiled from: UiTimer.java */
/* loaded from: classes.dex */
public class f0 extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f1186b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0 f1187c;

    public f0(g0 g0Var, Runnable runnable) {
        this.f1187c = g0Var;
        this.f1186b = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f1187c.f1193a.post(this.f1186b);
    }
}
