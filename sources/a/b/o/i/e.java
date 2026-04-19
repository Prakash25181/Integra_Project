package a.b.o.i;

import a.b.k.g;
import a.b.o.i.m;
import a.b.o.i.n;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.view.menu.ExpandedMenuView;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
/* loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Context f122b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f123c;
    public g d;
    public ExpandedMenuView e;
    public int f;
    public int g = 0;
    public int h;
    public m.a i;
    public a j;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public int f124b = -1;

        public a() {
            a();
        }

        public void a() {
            g gVar = e.this.d;
            i iVar = gVar.w;
            if (iVar != null) {
                gVar.a();
                ArrayList<i> arrayList = gVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == iVar) {
                        this.f124b = i;
                        return;
                    }
                }
            }
            this.f124b = -1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            g gVar = e.this.d;
            gVar.a();
            int size = gVar.j.size() - e.this.f;
            return this.f124b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f123c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).a(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public i getItem(int i) {
            g gVar = e.this.d;
            gVar.a();
            ArrayList<i> arrayList = gVar.j;
            int i2 = i + e.this.f;
            int i3 = this.f124b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }
    }

    public e(Context context, int i) {
        this.h = i;
        this.f122b = context;
        this.f123c = LayoutInflater.from(context);
    }

    @Override // a.b.o.i.m
    public void a(Context context, g gVar) {
        if (this.g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
            this.f122b = contextThemeWrapper;
            this.f123c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f122b != null) {
            this.f122b = context;
            if (this.f123c == null) {
                this.f123c = LayoutInflater.from(context);
            }
        }
        this.d = gVar;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.o.i.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.o.i.m
    public boolean b() {
        return false;
    }

    @Override // a.b.o.i.m
    public boolean b(g gVar, i iVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.d.a(this.j.getItem(i), this, 0);
    }

    public ListAdapter a() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // a.b.o.i.m
    public void a(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // a.b.o.i.m
    public void a(m.a aVar) {
        this.i = aVar;
    }

    @Override // a.b.o.i.m
    public boolean a(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        h hVar = new h(rVar);
        g gVar = hVar.f131b;
        g.a aVar = new g.a(gVar.f128a);
        e eVar = new e(aVar.f13a.f639a, a.b.g.abc_list_menu_item_layout);
        hVar.d = eVar;
        eVar.i = hVar;
        g gVar2 = hVar.f131b;
        gVar2.a(eVar, gVar2.f128a);
        ListAdapter a2 = hVar.d.a();
        AlertController.b bVar = aVar.f13a;
        bVar.l = a2;
        bVar.m = hVar;
        View view = gVar.o;
        if (view != null) {
            bVar.g = view;
        } else {
            bVar.d = gVar.n;
            bVar.f = gVar.m;
        }
        aVar.f13a.k = hVar;
        a.b.k.g a3 = aVar.a();
        hVar.f132c = a3;
        a3.setOnDismissListener(hVar);
        WindowManager.LayoutParams attributes = hVar.f132c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        hVar.f132c.show();
        m.a aVar2 = this.i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.a(rVar);
        return true;
    }

    @Override // a.b.o.i.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }
}
