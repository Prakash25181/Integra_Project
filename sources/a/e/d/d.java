package a.e.d;

import a.e.k.c;
import a.e.k.n;
import a.j.e;
import a.j.p;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public class d extends Activity implements a.j.h, c.a {

    /* renamed from: b, reason: collision with root package name */
    public a.j.i f347b = new a.j.i(this);

    @Override // a.e.k.c.a
    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !n.b(decorView, keyEvent)) {
            return a.e.k.c.a(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !n.b(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p.a(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f347b.a(e.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
