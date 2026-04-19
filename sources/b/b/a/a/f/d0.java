package b.b.a.a.f;

import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.widget.TipsFrame;

/* compiled from: TipsService.java */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: b, reason: collision with root package name */
    public static d0 f1176b = new d0();

    /* renamed from: a, reason: collision with root package name */
    public a f1177a;

    /* compiled from: TipsService.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: TipsService.java */
    /* loaded from: classes.dex */
    public enum b {
        ContentIInfo(0),
        ValueIndicator(1);


        /* renamed from: b, reason: collision with root package name */
        public final int f1179b;

        b(int i) {
            this.f1179b = i;
        }
    }

    public void a() {
        MainActivity mainActivity;
        TipsFrame tipsFrame;
        a aVar = this.f1177a;
        if (aVar == null || (tipsFrame = (mainActivity = MainActivity.this).c0) == null) {
            return;
        }
        tipsFrame.a(true, true);
        mainActivity.c0 = null;
    }
}
