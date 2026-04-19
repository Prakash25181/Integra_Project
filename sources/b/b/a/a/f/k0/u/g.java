package b.b.a.a.f.k0.u;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.b.r.i;
import b.b.a.a.b.r.t;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbListPage2010.java */
/* loaded from: classes.dex */
public class g extends n implements i.a {
    public ListView e;
    public C0048g f;
    public b.b.a.a.b.r.l g;
    public t h;

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.g.a("LEFT");
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.g.a("RIGHT");
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.g.a("UP");
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.g.a("DOWN");
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.g.a("SELECT");
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* loaded from: classes.dex */
    public class f implements i0 {
        public f() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            DisplayMetrics displayMetrics = g.this.f1597b.getResources().getDisplayMetrics();
            int min = Math.min(Math.max((g.this.e.getHeight() / 10) - 1, (int) TypedValue.applyDimension(1, 25.0f, displayMetrics)), (int) TypedValue.applyDimension(1, 50.0f, displayMetrics));
            g.this.f = new C0048g(min);
            g gVar = g.this;
            gVar.e.setAdapter((ListAdapter) gVar.f);
        }
    }

    /* compiled from: NetUsbListPage2010.java */
    /* renamed from: b.b.a.a.f.k0.u.g$g, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0048g extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public Drawable[] f1306b = new Drawable[2];

        /* renamed from: c, reason: collision with root package name */
        public int[] f1307c = new int[2];
        public LayoutInflater d;
        public int e;

        public C0048g(int i) {
            this.d = (LayoutInflater) g.this.f1597b.getSystemService("layout_inflater");
            this.e = i;
            Resources resources = g.this.f1597b.getResources();
            this.f1306b[0] = new ColorDrawable(resources.getColor(R.color.net_cell_bkgnd));
            this.f1306b[1] = new ColorDrawable(resources.getColor(R.color.net_cell_select));
            this.f1307c[0] = resources.getColor(R.color.net_cell_title_normal);
            this.f1307c[1] = resources.getColor(R.color.net_cell_title_select);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return 10;
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
            View inflate = this.d.inflate(R.layout.layout_netusb_content_cell_2010, (ViewGroup) null);
            b.b.a.a.b.r.h a2 = g.this.h.a(i);
            TextView textView = (TextView) inflate.findViewById(R.id.title_label);
            if (a2 != null && (str = a2.f962a) != null) {
                textView.setText(str);
            } else {
                textView.setText("");
            }
            if (i == g.this.h.h) {
                inflate.setBackgroundDrawable(this.f1306b[1]);
                textView.setTextColor(this.f1307c[1]);
            } else {
                inflate.setBackgroundDrawable(this.f1306b[0]);
                textView.setTextColor(this.f1307c[0]);
            }
            inflate.setMinimumHeight(this.e);
            return inflate;
        }
    }

    public g(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        b.b.a.a.b.r.l lVar = dVar.q;
        this.g = lVar;
        this.h = (t) lVar.a();
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.h.f967a = this;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_list_2010);
        a2.findViewById(R.id.page_up_button).setOnClickListener(new a());
        a2.findViewById(R.id.page_down_button).setOnClickListener(new b());
        a2.findViewById(R.id.up_button).setOnClickListener(new c());
        a2.findViewById(R.id.down_button).setOnClickListener(new d());
        a2.findViewById(R.id.select_button).setOnClickListener(new e());
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        this.e = listView;
        a.b.k.r.a((View) listView, (i0) new f());
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.b.r.i.a
    public void a(b.b.a.a.b.r.i iVar, int i, int i2, float f2) {
        C0048g c0048g = this.f;
        if (c0048g != null) {
            c0048g.notifyDataSetChanged();
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        t tVar = this.h;
        if (tVar.f967a == this) {
            tVar.f967a = null;
        }
    }

    @Override // b.b.a.a.b.r.i.a
    public void b(b.b.a.a.b.r.i iVar) {
        C0048g c0048g = this.f;
        if (c0048g != null) {
            c0048g.notifyDataSetChanged();
        }
    }
}
