package b.b.a.a.f.k0.u;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.b.r.i;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbListPage2011.java */
/* loaded from: classes.dex */
public class h extends n implements i.a {
    public ListView e;
    public e f;
    public b.b.a.a.b.r.l g;
    public b.b.a.a.b.r.i h;

    /* compiled from: NetUsbListPage2011.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.g.a("LEFT");
        }
    }

    /* compiled from: NetUsbListPage2011.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.g.a("RIGHT");
        }
    }

    /* compiled from: NetUsbListPage2011.java */
    /* loaded from: classes.dex */
    public class c implements AdapterView.OnItemClickListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            h.this.g.a(i);
        }
    }

    /* compiled from: NetUsbListPage2011.java */
    /* loaded from: classes.dex */
    public class d implements i0 {
        public d() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            int min;
            DisplayMetrics displayMetrics = h.this.f1597b.getResources().getDisplayMetrics();
            if (h.this.h.a() == 0) {
                min = (int) TypedValue.applyDimension(1, 50.0f, displayMetrics);
            } else {
                min = Math.min(Math.max((h.this.e.getHeight() / h.this.h.a()) - 1, (int) TypedValue.applyDimension(1, 25.0f, displayMetrics)), (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
            }
            h.this.f = new e(min);
            h hVar = h.this;
            hVar.e.setAdapter((ListAdapter) hVar.f);
        }
    }

    /* compiled from: NetUsbListPage2011.java */
    /* loaded from: classes.dex */
    public class e extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f1312b;

        /* renamed from: c, reason: collision with root package name */
        public int f1313c;

        public e(int i) {
            this.f1312b = (LayoutInflater) h.this.f1597b.getSystemService("layout_inflater");
            this.f1313c = i;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            for (int i = 0; i < h.this.h.a(); i++) {
                if (!isEnabled(i)) {
                    return false;
                }
            }
            return super.areAllItemsEnabled();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return h.this.h.a();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            String str;
            View inflate = this.f1312b.inflate(R.layout.layout_netusb_content_cell_2011, (ViewGroup) null);
            b.b.a.a.b.r.h a2 = h.this.h.a(i);
            TextView textView = (TextView) inflate.findViewById(R.id.title_label);
            View findViewById = inflate.findViewById(R.id.table_indicator);
            if (a2 != null && (str = a2.f962a) != null) {
                textView.setText(str);
                findViewById.setVisibility(0);
                inflate.setEnabled(true);
            } else {
                textView.setText("");
                findViewById.setVisibility(4);
                inflate.setEnabled(false);
            }
            inflate.setMinimumHeight(this.f1313c);
            return inflate;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            b.b.a.a.b.r.h a2 = h.this.h.a(i);
            return (a2 == null || a2.f962a == null) ? false : true;
        }
    }

    public h(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        b.b.a.a.b.r.l lVar = dVar.q;
        this.g = lVar;
        this.h = lVar.a();
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.h.f967a = this;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_list_2011);
        a2.findViewById(R.id.page_up_button).setOnClickListener(new a());
        a2.findViewById(R.id.page_down_button).setOnClickListener(new b());
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        this.e = listView;
        listView.setOnItemClickListener(new c());
        a.b.k.r.a((View) this.e, (i0) new d());
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.b.r.i.a
    public void b(b.b.a.a.b.r.i iVar) {
    }

    @Override // b.b.a.a.b.r.i.a
    public void a(b.b.a.a.b.r.i iVar, int i, int i2, float f) {
        e eVar = this.f;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        b.b.a.a.b.r.i iVar = this.h;
        if (iVar.f967a == this) {
            iVar.f967a = null;
        }
    }
}
