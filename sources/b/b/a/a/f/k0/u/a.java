package b.b.a.a.f.k0.u;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetTopListPage.java */
/* loaded from: classes.dex */
public class a extends n {
    public ListView e;
    public View f;
    public b.b.a.a.b.p.d g;
    public g0 h;
    public AdapterView.OnItemClickListener i;

    /* compiled from: NetTopListPage.java */
    /* renamed from: b.b.a.a.f.k0.u.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043a implements AdapterView.OnItemClickListener {

        /* compiled from: NetTopListPage.java */
        /* renamed from: b.b.a.a.f.k0.u.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0044a implements Runnable {
            public RunnableC0044a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f.setVisibility(0);
            }
        }

        /* compiled from: NetTopListPage.java */
        /* renamed from: b.b.a.a.f.k0.u.a$a$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e.setEnabled(true);
                a.this.f.setVisibility(8);
            }
        }

        public C0043a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            a.this.g.b().a(a.this.g.p.f741a.f1138c.get(i));
            a.this.e.setEnabled(false);
            a.this.h.a(0, 1500, new RunnableC0044a());
            a.this.h.a(1, 15000, new b());
        }
    }

    /* compiled from: NetTopListPage.java */
    /* loaded from: classes.dex */
    public class b extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f1278b;

        /* renamed from: c, reason: collision with root package name */
        public b.b.a.a.b.i f1279c;

        public b(a aVar, Context context, b.b.a.a.b.i iVar) {
            this.f1278b = (LayoutInflater) context.getSystemService("layout_inflater");
            this.f1279c = iVar;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f1279c.f741a.f1138c.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f1279c.f741a.f1138c.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            b.b.a.a.b.o.f fVar = this.f1279c.f741a.f1138c.get(i);
            if (view == null) {
                view = this.f1278b.inflate(R.layout.layout_netusb_service_cell, (ViewGroup) null);
            }
            ((TextView) view.findViewById(R.id.title_label)).setText(fVar.f809b);
            ((ImageView) view.findViewById(R.id.content_icon)).setImageDrawable(fVar.f);
            return view;
        }
    }

    public a(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.i = new C0043a();
        this.g = dVar;
        this.h = new g0(new Handler(), 2);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_net_top);
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        this.e = listView;
        listView.setAdapter((ListAdapter) new b(this, this.f1597b, this.g.p));
        this.e.setOnItemClickListener(this.i);
        View findViewById = a2.findViewById(R.id.indicator_view);
        this.f = findViewById;
        findViewById.setVisibility(8);
        this.d = a2;
        return a2;
    }
}
