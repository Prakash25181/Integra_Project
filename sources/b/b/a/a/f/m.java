package b.b.a.a.f;

import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.widget.TipsFrame;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public class m implements TipsFrame.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1396a;

    public m(MainActivity mainActivity) {
        this.f1396a = mainActivity;
    }

    @Override // com.onkyo.jp.onkyoremote.view.widget.TipsFrame.c
    public void a(TipsFrame tipsFrame, boolean z) {
        this.f1396a.p.removeView(tipsFrame);
        MainActivity mainActivity = this.f1396a;
        if (mainActivity.c0 == tipsFrame) {
            mainActivity.c0 = null;
        }
    }
}
