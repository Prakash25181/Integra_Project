package b.b.a.a.f.n0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: SettingsUtil.java */
/* loaded from: classes.dex */
public class p extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f1587b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<q> f1588c;

    public p(Context context, ArrayList<q> arrayList) {
        this.f1587b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f1588c = arrayList;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1588c.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return this.f1588c.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.f1587b.inflate(this.f1588c.get(i).b(), (ViewGroup) null);
        this.f1588c.get(i).a(i, inflate);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i) {
        return this.f1588c.get(i).a();
    }
}
