package b.b.a.a.b.p;

import java.util.TimerTask;

/* compiled from: IscpIoReal.java */
/* loaded from: classes.dex */
public class t extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f906b;

    public t(s sVar) {
        this.f906b = sVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        s sVar = this.f906b;
        sVar.m = null;
        sVar.n = true;
        if (sVar.k && sVar.j != null && sVar.b()) {
            this.f906b.i.wakeup();
        }
    }
}
