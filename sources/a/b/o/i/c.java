package a.b.o.i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

/* compiled from: BaseMenuWrapper.java */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f110a;

    /* renamed from: b, reason: collision with root package name */
    public Map<a.e.g.a.b, MenuItem> f111b;

    /* renamed from: c, reason: collision with root package name */
    public Map<a.e.g.a.c, SubMenu> f112c;

    public c(Context context) {
        this.f110a = context;
    }

    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof a.e.g.a.b)) {
            return menuItem;
        }
        a.e.g.a.b bVar = (a.e.g.a.b) menuItem;
        if (this.f111b == null) {
            this.f111b = new a.d.a();
        }
        MenuItem menuItem2 = this.f111b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f110a, bVar);
        this.f111b.put(bVar, jVar);
        return jVar;
    }

    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof a.e.g.a.c)) {
            return subMenu;
        }
        a.e.g.a.c cVar = (a.e.g.a.c) subMenu;
        if (this.f112c == null) {
            this.f112c = new a.d.a();
        }
        SubMenu subMenu2 = this.f112c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f110a, cVar);
        this.f112c.put(cVar, sVar);
        return sVar;
    }
}
