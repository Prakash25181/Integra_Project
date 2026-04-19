package b.b.a.a.f.k0.v;

import a.b.k.r;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SectionIndexer;
import b.b.a.a.c.d;
import b.b.a.a.f.d0;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.MainActivity;

/* compiled from: UpnpMediaDirectoryBase.java */
/* loaded from: classes.dex */
public abstract class k extends e {
    public d.m f;
    public View g;
    public EditText h;
    public Button i;
    public boolean j;
    public ListView k;
    public c l;
    public boolean m;
    public boolean n;
    public boolean o;
    public d0 p;
    public d.h q;
    public AbsListView.OnScrollListener r;

    /* compiled from: UpnpMediaDirectoryBase.java */
    /* loaded from: classes.dex */
    public class a implements d.h {
        public a() {
        }

        @Override // b.b.a.a.c.d.h
        public void a(d.m mVar) {
            k kVar = k.this;
            if (kVar.o) {
                kVar.o = false;
                kVar.j();
                kVar.h();
                kVar.k();
            }
            kVar.l.notifyDataSetChanged();
        }
    }

    /* compiled from: UpnpMediaDirectoryBase.java */
    /* loaded from: classes.dex */
    public class b implements AbsListView.OnScrollListener {
        public b() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            k.this.p.a();
            k.this.n = false;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    public k(Context context, b.b.a.a.b.p.d dVar, p pVar) {
        super(context, pVar);
        this.q = new a();
        this.r = new b();
        this.p = d0.f1176b;
    }

    public void a(ListView listView, c cVar) {
        this.k = listView;
        this.l = cVar;
        listView.setFocusable(true);
        this.k.setFastScrollAlwaysVisible(false);
        this.k.setFastScrollEnabled(false);
        this.k.setOnScrollListener(this.r);
        boolean d = this.f.d();
        this.o = d;
        if (!d) {
            j();
        }
        if (this.o) {
            return;
        }
        h();
        r.a((View) this.k, (i0) new g(this));
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.l.a(null);
        this.f.c();
        this.f.a(this.q);
    }

    public boolean g() {
        if (!this.n) {
            return true;
        }
        this.n = false;
        return false;
    }

    public final void h() {
        if (this.f.a() && this.f.b() > 20) {
            if (!this.j) {
                if (this.g == null) {
                    View inflate = ((LayoutInflater) this.f1597b.getSystemService("layout_inflater")).inflate(R.layout.layout_upnp_search_cell, (ViewGroup) null);
                    this.g = inflate;
                    EditText editText = (EditText) inflate.findViewById(R.id.search_edit_text);
                    this.h = editText;
                    editText.setEnabled(true);
                    this.h.addTextChangedListener(new h(this));
                    this.h.setOnEditorActionListener(new i(this));
                    Button button = (Button) this.g.findViewById(R.id.cancel_button);
                    this.i = button;
                    button.setOnClickListener(new j(this));
                }
                this.k.addHeaderView(this.g);
                this.j = true;
            }
        } else if (this.j) {
            this.k.removeHeaderView(this.g);
            this.j = false;
        }
        this.k.setAdapter((ListAdapter) this.l);
    }

    public void i() {
        this.h.setText("");
        this.k.setFastScrollAlwaysVisible(this.l.a());
        this.k.setFastScrollEnabled(this.l.a());
        f();
    }

    public void j() {
        if (this.l.getCount() > 20) {
            this.k.setFastScrollAlwaysVisible(this.l.a());
            this.k.setFastScrollEnabled(this.l.a());
        }
    }

    public abstract void k();

    /* compiled from: UpnpMediaDirectoryBase.java */
    /* loaded from: classes.dex */
    public static abstract class c extends BaseAdapter implements SectionIndexer {

        /* renamed from: b, reason: collision with root package name */
        public d.m f1355b;

        /* renamed from: c, reason: collision with root package name */
        public LayoutInflater f1356c;
        public String d;

        public c(Context context, d.m mVar) {
            this.f1355b = mVar;
            this.f1356c = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public abstract View a(LayoutInflater layoutInflater, int i, View view);

        public boolean a(String str) {
            if (str != null && str.isEmpty()) {
                str = null;
            }
            String str2 = this.d;
            if (str == str2) {
                return false;
            }
            if (str != null && str2 != null && str.equals(str2)) {
                return false;
            }
            this.d = str;
            return true;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.SectionIndexer
        public int getPositionForSection(int i) {
            if (a()) {
                return this.f1355b.g().getPositionForSection(i);
            }
            return 0;
        }

        @Override // android.widget.SectionIndexer
        public int getSectionForPosition(int i) {
            if (a()) {
                return this.f1355b.g().getSectionForPosition(i);
            }
            return 0;
        }

        @Override // android.widget.SectionIndexer
        public Object[] getSections() {
            if (a()) {
                return this.f1355b.g().getSections();
            }
            return null;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return a(this.f1356c, i, view);
        }

        public boolean a() {
            return this.d == null && this.f1355b.g() != null;
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        d.m mVar = this.f;
        mVar.f1101c = this.q;
        mVar.a(true);
    }

    public boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.m = false;
            EditText editText = this.h;
            if (editText != null && editText.hasFocus()) {
                f();
                this.m = true;
                return true;
            }
        }
        if (action == 1 || action == 3) {
            this.p.a();
            if (action == 3) {
                this.n = false;
            }
        }
        if (this.m) {
            if (action != 2 && action != 4) {
                if (action == 1) {
                    this.m = false;
                }
            }
            return true;
        }
        return false;
    }

    public void a(View view, String str) {
        d0 d0Var = this.p;
        d0.b bVar = d0.b.ContentIInfo;
        d0.a aVar = d0Var.f1177a;
        if (aVar != null) {
            MainActivity.a(MainActivity.this, view, str, bVar);
        }
        this.n = true;
    }
}
