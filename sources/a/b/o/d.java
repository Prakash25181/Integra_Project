package a.b.o;

import a.b.o.a;
import a.b.o.i.g;
import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: StandaloneActionMode.java */
/* loaded from: classes.dex */
public class d extends a implements g.a {
    public Context d;
    public ActionBarContextView e;
    public a.InterfaceC0005a f;
    public WeakReference<View> g;
    public boolean h;
    public a.b.o.i.g i;

    public d(Context context, ActionBarContextView actionBarContextView, a.InterfaceC0005a interfaceC0005a, boolean z) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = interfaceC0005a;
        a.b.o.i.g gVar = new a.b.o.i.g(actionBarContextView.getContext());
        gVar.l = 1;
        this.i = gVar;
        gVar.e = this;
    }

    @Override // a.b.o.a
    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // a.b.o.a
    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // a.b.o.a
    public Menu c() {
        return this.i;
    }

    @Override // a.b.o.a
    public MenuInflater d() {
        return new f(this.e.getContext());
    }

    @Override // a.b.o.a
    public CharSequence e() {
        return this.e.getSubtitle();
    }

    @Override // a.b.o.a
    public CharSequence f() {
        return this.e.getTitle();
    }

    @Override // a.b.o.a
    public void g() {
        this.f.a(this, this.i);
    }

    @Override // a.b.o.a
    public boolean h() {
        return this.e.s;
    }

    @Override // a.b.o.a
    public void a(int i) {
        this.e.setSubtitle(this.d.getString(i));
    }

    @Override // a.b.o.a
    public void b(int i) {
        this.e.setTitle(this.d.getString(i));
    }

    @Override // a.b.o.a
    public void a(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // a.b.o.a
    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // a.b.o.a
    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.a(this);
    }

    @Override // a.b.o.a
    public void a(boolean z) {
        this.f80c = z;
        this.e.setTitleOptional(z);
    }

    @Override // a.b.o.i.g.a
    public boolean a(a.b.o.i.g gVar, MenuItem menuItem) {
        return this.f.a(this, menuItem);
    }

    @Override // a.b.o.i.g.a
    public void a(a.b.o.i.g gVar) {
        g();
        a.b.p.c cVar = this.e.e;
        if (cVar != null) {
            cVar.f();
        }
    }
}
