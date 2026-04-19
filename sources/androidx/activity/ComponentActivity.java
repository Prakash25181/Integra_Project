package androidx.activity;

import a.e.d.d;
import a.j.e;
import a.j.f;
import a.j.h;
import a.j.i;
import a.j.p;
import a.j.t;
import a.j.u;
import a.l.c;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class ComponentActivity extends d implements h, u, c, a.a.c {
    public t e;

    /* renamed from: c, reason: collision with root package name */
    public final i f618c = new i(this);
    public final a.l.b d = new a.l.b(this);
    public final OnBackPressedDispatcher f = new OnBackPressedDispatcher(new a());

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public t f622a;
    }

    public ComponentActivity() {
        i iVar = this.f618c;
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                iVar.a(new f() { // from class: androidx.activity.ComponentActivity.2
                    @Override // a.j.f
                    public void a(h hVar, e.a aVar) {
                        if (aVar == e.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            this.f618c.a(new f() { // from class: androidx.activity.ComponentActivity.3
                @Override // a.j.f
                public void a(h hVar, e.a aVar) {
                    if (aVar != e.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.d().a();
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 > i || i > 23) {
                return;
            }
            this.f618c.a(new ImmLeaksCleaner(this));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @Override // a.a.c
    public final OnBackPressedDispatcher b() {
        return this.f;
    }

    @Override // a.l.c
    public final a.l.a c() {
        return this.d.f586b;
    }

    @Override // a.j.u
    public t d() {
        if (getApplication() != null) {
            if (this.e == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.e = bVar.f622a;
                }
                if (this.e == null) {
                    this.e = new t();
                }
            }
            return this.e;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f.a();
    }

    @Override // a.e.d.d, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d.a(bundle);
        p.a(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        t tVar = this.e;
        if (tVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            tVar = bVar.f622a;
        }
        if (tVar == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.f622a = tVar;
        return bVar2;
    }

    @Override // a.e.d.d, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        i iVar = this.f618c;
        if (iVar instanceof i) {
            iVar.a(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.d.b(bundle);
    }

    @Override // a.j.h
    public e a() {
        return this.f618c;
    }
}
