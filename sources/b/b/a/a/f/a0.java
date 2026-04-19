package b.b.a.a.f;

import android.content.Intent;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.onkyoremote.view.StartupMainActivity;
import com.onkyo.jp.onkyoremote.view.discovery.ConnectionActivity;

/* compiled from: StartupMainActivity.java */
/* loaded from: classes.dex */
public class a0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StartupMainActivity f1151b;

    public a0(StartupMainActivity startupMainActivity) {
        this.f1151b = startupMainActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        Intent intent;
        if (this.f1151b.p.e.a()) {
            this.f1151b.q.a(1);
            StartupMainActivity startupMainActivity = this.f1151b;
            if (startupMainActivity.p.b().i()) {
                intent = new Intent(startupMainActivity, (Class<?>) MainActivity.class);
            } else {
                intent = new Intent(startupMainActivity, (Class<?>) ConnectionActivity.class);
                intent.setFlags(67108864);
                b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
                if (a2 != null) {
                    intent.putExtra("autoConnect", a2.a(b.b.a.a.d.a.f1116b.e));
                } else {
                    throw null;
                }
            }
            startupMainActivity.startActivity(intent);
            startupMainActivity.overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
            startupMainActivity.finish();
        }
    }
}
