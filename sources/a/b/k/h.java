package a.b.k;

import a.b.k.k;
import a.b.o.a;
import a.b.p.c1;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: AppCompatActivity.java */
/* loaded from: classes.dex */
public class h extends a.h.a.d implements i, a.e.d.k {
    public j n;
    public Resources o;

    @Override // a.b.k.i
    public a.b.o.a a(a.InterfaceC0005a interfaceC0005a) {
        return null;
    }

    @Override // a.b.k.i
    public void a(a.b.o.a aVar) {
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        k kVar = (k) g();
        kVar.a(false);
        kVar.J = true;
    }

    @Override // a.b.k.i
    public void b(a.b.o.a aVar) {
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        h();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.e.d.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        h();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // a.e.d.k
    public Intent e() {
        return r.a((Activity) this);
    }

    @Override // a.h.a.d
    public void f() {
        g().b();
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        k kVar = (k) g();
        kVar.f();
        return (T) kVar.f.findViewById(i);
    }

    public j g() {
        if (this.n == null) {
            this.n = j.a(this, this);
        }
        return this.n;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        k kVar = (k) g();
        if (kVar.j == null) {
            kVar.j();
            a aVar = kVar.i;
            kVar.j = new a.b.o.f(aVar != null ? aVar.c() : kVar.e);
        }
        return kVar.j;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.o == null) {
            c1.a();
        }
        Resources resources = this.o;
        return resources == null ? super.getResources() : resources;
    }

    public a h() {
        k kVar = (k) g();
        kVar.j();
        return kVar.i;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        g().b();
    }

    @Override // a.h.a.d, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.o != null) {
            this.o.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        k kVar = (k) g();
        if (kVar.A && kVar.u) {
            kVar.j();
            a aVar = kVar.i;
            if (aVar != null) {
                aVar.a(configuration);
            }
        }
        a.b.p.j.a().a(kVar.e);
        kVar.a(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        j g = g();
        g.a();
        g.a(bundle);
        super.onCreate(bundle);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k kVar = (k) g();
        if (kVar != null) {
            j.b(kVar);
            if (kVar.T) {
                kVar.f.getDecorView().removeCallbacks(kVar.V);
            }
            kVar.L = false;
            kVar.M = true;
            a aVar = kVar.i;
            k.g gVar = kVar.R;
            if (gVar != null) {
                gVar.a();
            }
            k.g gVar2 = kVar.S;
            if (gVar2 != null) {
                gVar2.a();
                return;
            }
            return;
        }
        throw null;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // a.h.a.d, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent a2;
        boolean z;
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        a h = h();
        if (menuItem.getItemId() != 16908332 || h == null || (h.b() & 4) == 0 || (a2 = r.a((Activity) this)) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            z = shouldUpRecreateTask(a2);
        } else {
            String action = getIntent().getAction();
            z = (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }
        if (z) {
            ArrayList arrayList = new ArrayList();
            Intent e = e();
            if (e == null) {
                e = r.a((Activity) this);
            }
            if (e != null) {
                ComponentName component = e.getComponent();
                if (component == null) {
                    component = e.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent a3 = r.a((Context) this, component);
                    while (a3 != null) {
                        arrayList.add(size, a3);
                        a3 = r.a((Context) this, a3.getComponent());
                    }
                    arrayList.add(e);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                a.e.e.a.a(this, intentArr, null);
                try {
                    a.e.d.a.a(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        if (Build.VERSION.SDK_INT >= 16) {
            navigateUpTo(a2);
            return true;
        }
        a2.addFlags(67108864);
        startActivity(a2);
        finish();
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // a.h.a.d, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((k) g()).f();
    }

    @Override // a.h.a.d, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        k kVar = (k) g();
        kVar.j();
        a aVar = kVar.i;
        if (aVar != null) {
            aVar.d(true);
        }
    }

    @Override // a.h.a.d, androidx.activity.ComponentActivity, a.e.d.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        k kVar = (k) g();
        if (kVar.N != -100) {
            k.a0.put(kVar.d.getClass(), Integer.valueOf(kVar.N));
        }
    }

    @Override // a.h.a.d, android.app.Activity
    public void onStart() {
        super.onStart();
        k kVar = (k) g();
        kVar.L = true;
        kVar.d();
        j.a(kVar);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onStop() {
        super.onStop();
        g().c();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        g().a(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        h();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        g().b(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((k) g()).O = i;
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        g().a(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().b(view, layoutParams);
    }
}
