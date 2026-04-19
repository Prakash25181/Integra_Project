package b.b.a.a.f.n0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;

/* compiled from: SettingsListActivity.java */
/* loaded from: classes.dex */
public class n extends m {
    public LayoutInflater r;
    public ListView s;

    /* compiled from: SettingsListActivity.java */
    /* loaded from: classes.dex */
    public class a<T> extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<T> f1584b;

        public a() {
        }

        public int a() {
            throw null;
        }

        public void a(int i, T t, View view) {
            throw null;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            ArrayList<T> arrayList = this.f1584b;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            ArrayList<T> arrayList = this.f1584b;
            if (arrayList == null) {
                return null;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = n.this.r.inflate(a(), (ViewGroup) null);
            }
            a(i, this.f1584b.get(i), view);
            return view;
        }
    }

    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_settings_list);
        this.r = (LayoutInflater) getSystemService("layout_inflater");
        this.s = (ListView) findViewById(R.id.listView);
    }
}
