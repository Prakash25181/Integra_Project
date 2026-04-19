package a.b.o.i;

import a.b.o.i.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public g f126b;

    /* renamed from: c, reason: collision with root package name */
    public int f127c = -1;
    public boolean d;
    public final boolean e;
    public final LayoutInflater f;
    public final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.e = z;
        this.f = layoutInflater;
        this.f126b = gVar;
        this.g = i;
        a();
    }

    public void a() {
        g gVar = this.f126b;
        i iVar = gVar.w;
        if (iVar != null) {
            gVar.a();
            ArrayList<i> arrayList = gVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == iVar) {
                    this.f127c = i;
                    return;
                }
            }
        }
        this.f127c = -1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> d;
        if (this.e) {
            g gVar = this.f126b;
            gVar.a();
            d = gVar.j;
        } else {
            d = this.f126b.d();
        }
        if (this.f127c < 0) {
            return d.size();
        }
        return d.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f.inflate(this.g, viewGroup, false);
        }
        int i2 = getItem(i).f134b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f126b.e() && i2 != (i3 >= 0 ? getItem(i3).f134b : i2));
        n.a aVar = (n.a) view;
        if (this.d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.a(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public i getItem(int i) {
        ArrayList<i> d;
        if (this.e) {
            g gVar = this.f126b;
            gVar.a();
            d = gVar.j;
        } else {
            d = this.f126b.d();
        }
        int i2 = this.f127c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return d.get(i);
    }
}
