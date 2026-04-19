package b.b.a.a.f;

import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: MainActivity.java */
/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f1215b;

    public k(MainActivity mainActivity) {
        this.f1215b = mainActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        MainActivity mainActivity = this.f1215b;
        mainActivity.V.a(1);
        mainActivity.M.a();
    }
}
