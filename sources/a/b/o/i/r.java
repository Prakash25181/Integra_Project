package a.b.o.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: SubMenuBuilder.java */
/* loaded from: classes.dex */
public class r extends g implements SubMenu {
    public g A;
    public i B;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.A = gVar;
        this.B = iVar;
    }

    @Override // a.b.o.i.g
    public boolean a(g gVar, MenuItem menuItem) {
        return super.a(gVar, menuItem) || this.A.a(gVar, menuItem);
    }

    @Override // a.b.o.i.g
    public boolean b(i iVar) {
        return this.A.b(iVar);
    }

    @Override // a.b.o.i.g
    public g c() {
        return this.A.c();
    }

    @Override // a.b.o.i.g
    public boolean e() {
        return this.A.e();
    }

    @Override // a.b.o.i.g
    public boolean f() {
        return this.A.f();
    }

    @Override // a.b.o.i.g
    public boolean g() {
        return this.A.g();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.B;
    }

    @Override // a.b.o.i.g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.A.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.B.setIcon(drawable);
        return this;
    }

    @Override // a.b.o.i.g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.A.setQwertyMode(z);
    }

    @Override // a.b.o.i.g
    public String b() {
        i iVar = this.B;
        int i = iVar != null ? iVar.f133a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        a(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        a(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.B.setIcon(i);
        return this;
    }

    @Override // a.b.o.i.g
    public boolean a(i iVar) {
        return this.A.a(iVar);
    }
}
