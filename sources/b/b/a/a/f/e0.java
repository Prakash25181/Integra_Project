package b.b.a.a.f;

import java.util.Timer;

/* compiled from: UiTimer.java */
/* loaded from: classes.dex */
public class e0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1183c;
    public final /* synthetic */ Runnable d;
    public final /* synthetic */ g0 e;

    public e0(g0 g0Var, int i, boolean z, Runnable runnable) {
        this.e = g0Var;
        this.f1182b = i;
        this.f1183c = z;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Timer[] timerArr = this.e.f1194b;
        int i = this.f1182b;
        if (timerArr[i] != null) {
            if (this.f1183c) {
                timerArr[i] = null;
            }
            this.d.run();
        }
    }
}
