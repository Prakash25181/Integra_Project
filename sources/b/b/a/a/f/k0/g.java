package b.b.a.a.f.k0;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;

/* compiled from: ControlPage.java */
/* loaded from: classes.dex */
public abstract class g extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public RemoteApplication f1232b;

    /* renamed from: c, reason: collision with root package name */
    public a f1233c;
    public boolean d = false;

    /* compiled from: ControlPage.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public abstract void a(View view, Bundle bundle);

    public boolean a() {
        return true;
    }

    public void b() {
    }

    public final boolean d() {
        View view = getView();
        if (view == null) {
            return false;
        }
        if (this.f1232b == null) {
            this.f1232b = (RemoteApplication) view.getContext().getApplicationContext();
        }
        return this.f1232b.b() != null;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public void h() {
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        if (d() && this.d) {
            e();
        }
        this.d = false;
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        if (d()) {
            this.d = true;
            f();
        }
    }

    @Override // android.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (d()) {
            a(view, bundle);
        }
    }
}
