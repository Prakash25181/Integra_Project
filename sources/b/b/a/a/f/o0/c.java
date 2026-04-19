package b.b.a.a.f.o0;

import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;
import java.util.TimerTask;

/* compiled from: StepSlideBar.java */
/* loaded from: classes.dex */
public class c extends TimerTask {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StepSlideBar f1600b;

    /* compiled from: StepSlideBar.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StepSlideBar stepSlideBar = c.this.f1600b;
            stepSlideBar.s = null;
            stepSlideBar.b();
        }
    }

    public c(StepSlideBar stepSlideBar) {
        this.f1600b = stepSlideBar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f1600b.r.post(new a());
    }
}
