package b.b.a.a.f;

import android.os.Handler;
import java.util.Timer;

/* compiled from: UiTimer.java */
/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public Handler f1193a;

    /* renamed from: b, reason: collision with root package name */
    public Timer[] f1194b;

    public g0(Handler handler, int i) {
        this.f1193a = handler;
        this.f1194b = new Timer[i];
    }

    public void a(int i, int i2, int i3, Runnable runnable) {
        a(i);
        this.f1194b[i] = new Timer();
        this.f1194b[i].schedule(new f0(this, new e0(this, i, false, runnable)), i2, i3);
    }

    public void a(int i, int i2, Runnable runnable) {
        a(i);
        this.f1194b[i] = new Timer();
        this.f1194b[i].schedule(new f0(this, new e0(this, i, true, runnable)), i2);
    }

    public void a(int i) {
        Timer[] timerArr = this.f1194b;
        if (timerArr[i] != null) {
            timerArr[i].cancel();
            this.f1194b[i] = null;
        }
    }

    public void a() {
        int i = 0;
        while (true) {
            Timer[] timerArr = this.f1194b;
            if (i >= timerArr.length) {
                return;
            }
            if (timerArr[i] != null) {
                timerArr[i].cancel();
                this.f1194b[i] = null;
            }
            i++;
        }
    }
}
