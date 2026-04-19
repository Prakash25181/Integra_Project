package a.b.o;

import a.b.o.a;
import a.b.o.i.j;
import a.b.o.i.o;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

/* compiled from: SupportActionModeWrapper.java */
/* loaded from: classes.dex */
public class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f84a;

    /* renamed from: b, reason: collision with root package name */
    public final a.b.o.a f85b;

    public e(Context context, a.b.o.a aVar) {
        this.f84a = context;
        this.f85b = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f85b.a();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f85b.b();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f84a, (a.e.g.a.a) this.f85b.c());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f85b.d();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f85b.e();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f85b.f79b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f85b.f();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f85b.f80c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f85b.g();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f85b.h();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f85b.a(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f85b.a(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f85b.f79b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f85b.b(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f85b.a(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f85b.a(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f85b.b(i);
    }

    /* compiled from: SupportActionModeWrapper.java */
    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC0005a {

        /* renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f86a;

        /* renamed from: b, reason: collision with root package name */
        public final Context f87b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList<e> f88c = new ArrayList<>();
        public final a.d.h<Menu, Menu> d = new a.d.h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f87b = context;
            this.f86a = callback;
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean a(a.b.o.a aVar, Menu menu) {
            return this.f86a.onPrepareActionMode(b(aVar), a(menu));
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean b(a.b.o.a aVar, Menu menu) {
            return this.f86a.onCreateActionMode(b(aVar), a(menu));
        }

        @Override // a.b.o.a.InterfaceC0005a
        public boolean a(a.b.o.a aVar, MenuItem menuItem) {
            return this.f86a.onActionItemClicked(b(aVar), new j(this.f87b, (a.e.g.a.b) menuItem));
        }

        public ActionMode b(a.b.o.a aVar) {
            int size = this.f88c.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.f88c.get(i);
                if (eVar != null && eVar.f85b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f87b, aVar);
            this.f88c.add(eVar2);
            return eVar2;
        }

        @Override // a.b.o.a.InterfaceC0005a
        public void a(a.b.o.a aVar) {
            this.f86a.onDestroyActionMode(b(aVar));
        }

        public final Menu a(Menu menu) {
            Menu orDefault = this.d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            o oVar = new o(this.f87b, (a.e.g.a.a) menu);
            this.d.put(menu, oVar);
            return oVar;
        }
    }
}
