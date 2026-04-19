package a.b.k;

import a.b.o.a;
import a.e.k.c;
import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: AppCompatDialog.java */
/* loaded from: classes.dex */
public class q extends Dialog implements i {

    /* renamed from: b, reason: collision with root package name */
    public j f39b;

    /* renamed from: c, reason: collision with root package name */
    public final c.a f40c;

    /* compiled from: AppCompatDialog.java */
    /* loaded from: classes.dex */
    public class a implements c.a {
        public a() {
        }

        @Override // a.e.k.c.a
        public boolean a(KeyEvent keyEvent) {
            return q.this.a(keyEvent);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            if (r6 != 0) goto L14
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r2 = r5.getTheme()
            int r3 = a.b.a.dialogTheme
            r2.resolveAttribute(r3, r1, r0)
            int r1 = r1.resourceId
            goto L15
        L14:
            r1 = r6
        L15:
            r4.<init>(r5, r1)
            a.b.k.q$a r1 = new a.b.k.q$a
            r1.<init>()
            r4.f40c = r1
            a.b.k.j r1 = r4.a()
            if (r6 != 0) goto L35
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            int r2 = a.b.a.dialogTheme
            r5.resolveAttribute(r2, r6, r0)
            int r6 = r6.resourceId
        L35:
            r5 = r1
            a.b.k.k r5 = (a.b.k.k) r5
            r5.O = r6
            r5 = 0
            r1.a(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.k.q.<init>(android.content.Context, int):void");
    }

    public j a() {
        if (this.f39b == null) {
            this.f39b = j.a(this, this);
        }
        return this.f39b;
    }

    @Override // a.b.k.i
    public a.b.o.a a(a.InterfaceC0005a interfaceC0005a) {
        return null;
    }

    @Override // a.b.k.i
    public void a(a.b.o.a aVar) {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // a.b.k.i
    public void b(a.b.o.a aVar) {
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a.e.k.c.a(this.f40c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        k kVar = (k) a();
        kVar.f();
        return (T) kVar.f.findViewById(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().a();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().c();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().b(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    public boolean a(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
