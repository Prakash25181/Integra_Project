package b.b.a.a.f;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.ListFragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import b.b.a.a.b.l;
import b.b.a.a.b.p.d;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.app.RemoteApplication;
import com.onkyo.jp.onkyoremote.view.MainActivity;
import com.onkyo.jp.upnp.UpnpControl;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: SelectorListFragment.java */
/* loaded from: classes.dex */
public class r extends ListFragment implements d.k {

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.b.p.d f1611b;

    /* renamed from: c, reason: collision with root package name */
    public int f1612c;
    public int d;
    public a e;
    public ArrayList<f> f;

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public class b implements f {
        public b(r rVar) {
        }

        @Override // b.b.a.a.f.r.f
        public View a(LayoutInflater layoutInflater) {
            return layoutInflater.inflate(R.layout.layout_selector_list_header, (ViewGroup) null);
        }

        @Override // b.b.a.a.f.r.f
        public boolean a(b.b.a.a.b.p.d dVar) {
            return false;
        }
    }

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public class e extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<f> f1617b;

        public e(r rVar, ArrayList<f> arrayList) {
            this.f1617b = arrayList;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f1617b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f1617b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return this.f1617b.get(i).a((LayoutInflater) viewGroup.getContext().getSystemService("layout_inflater"));
        }
    }

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public interface f {
        View a(LayoutInflater layoutInflater);

        boolean a(b.b.a.a.b.p.d dVar);
    }

    public r(a aVar) {
        this.e = aVar;
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, b.b.a.a.b.o.r rVar) {
        View childAt;
        if ((fVar == d.f.UPNP_RENDERER_DISCOVERED || fVar == d.f.UPNP_RENDERER_LOST) && this.d != -1) {
            ListView listView = getListView();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = this.d;
            if (firstVisiblePosition > i || i > listView.getLastVisiblePosition() || (childAt = listView.getChildAt(this.d - listView.getFirstVisiblePosition())) == null || ((Integer) childAt.getTag()).intValue() != b.b.a.a.b.o.e.THIS_DEVICE.f807b) {
                return;
            }
            ((c) this.f.get(this.d)).a(childAt);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getListView().setDivider(new ColorDrawable(a.b.k.r.u.getResources().getColor(R.color.selector_popup_table_separator)));
        getListView().setDividerHeight(1);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ArrayList<f> arrayList = new ArrayList<>();
        b.b.a.a.b.p.d b2 = ((RemoteApplication) activity.getApplication()).b();
        this.f1611b = b2;
        b.b.a.a.b.l b3 = b2.b();
        Iterator<b.b.a.a.b.o.i> it = b3.e.f747a.f1138c.iterator();
        while (it.hasNext()) {
            arrayList.add(new d(it.next()));
        }
        l.a aVar = b3.q;
        if (aVar.E || aVar.B) {
            arrayList.add(new b(this));
        }
        this.d = -1;
        if (b3.q.E) {
            this.d = arrayList.size();
            arrayList.add(new c(this.f1611b.p.a(b.b.a.a.b.o.e.THIS_DEVICE)));
        }
        if (b3.q.B) {
            Iterator<b.b.a.a.b.o.f> it2 = this.f1611b.p.f741a.f1138c.iterator();
            while (it2.hasNext()) {
                arrayList.add(new c(it2.next()));
            }
        }
        this.f = arrayList;
        setListAdapter(new e(this, arrayList));
    }

    @Override // android.app.Fragment
    public Animator onCreateAnimator(int i, boolean z, int i2) {
        if (i == 4097 || i == 8194) {
            return z ? ObjectAnimator.ofFloat(this, "y", -this.f1612c, 0.0f) : ObjectAnimator.ofFloat(this, "y", 0.0f, -this.f1612c);
        }
        return super.onCreateAnimator(i, z, i2);
    }

    @Override // android.app.ListFragment, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1612c = viewGroup.getHeight();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        ((MainActivity) getActivity()).E.setVisibility(8);
    }

    @Override // android.app.ListFragment
    public void onListItemClick(ListView listView, View view, int i, long j) {
        super.onListItemClick(listView, view, i, j);
        if (this.f.get(i).a(this.f1611b)) {
            ((MainActivity) getActivity()).l();
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        this.f1611b.x.b(this);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        this.f1611b.x.a((d.m) this);
    }

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public class d implements f {

        /* renamed from: a, reason: collision with root package name */
        public b.b.a.a.b.o.i f1615a;

        public d(b.b.a.a.b.o.i iVar) {
            this.f1615a = iVar;
        }

        @Override // b.b.a.a.f.r.f
        public View a(LayoutInflater layoutInflater) {
            View inflate = layoutInflater.inflate(R.layout.layout_selector_list_item, (ViewGroup) null);
            ((ImageView) inflate.findViewById(R.id.selector_icon)).setImageDrawable(this.f1615a.f818c.f813b);
            ((TextView) inflate.findViewById(R.id.selector_name)).setText(this.f1615a.d);
            return inflate;
        }

        @Override // b.b.a.a.f.r.f
        public boolean a(b.b.a.a.b.p.d dVar) {
            a aVar = r.this.e;
            ((i) aVar).f1202a.W.b().a(this.f1615a);
            return true;
        }
    }

    /* compiled from: SelectorListFragment.java */
    /* loaded from: classes.dex */
    public class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public b.b.a.a.b.o.f f1613a;

        public c(b.b.a.a.b.o.f fVar) {
            this.f1613a = fVar;
        }

        @Override // b.b.a.a.f.r.f
        public View a(LayoutInflater layoutInflater) {
            View inflate = layoutInflater.inflate(R.layout.layout_selector_list_item, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.selector_icon);
            if (r.this.getResources().getBoolean(R.bool.lightSelectorTable)) {
                imageView.setImageDrawable(this.f1613a.e);
            } else {
                imageView.setImageDrawable(this.f1613a.f);
            }
            ((TextView) inflate.findViewById(R.id.selector_name)).setText(this.f1613a.f809b);
            a(inflate);
            inflate.setTag(Integer.valueOf(this.f1613a.f808a.f807b));
            return inflate;
        }

        public void a(View view) {
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
            if (a()) {
                view.setEnabled(true);
                progressBar.setVisibility(8);
            } else {
                view.setEnabled(false);
                progressBar.setVisibility(0);
            }
        }

        @Override // b.b.a.a.f.r.f
        public boolean a(b.b.a.a.b.p.d dVar) {
            if (!a()) {
                return false;
            }
            a aVar = r.this.e;
            b.b.a.a.b.o.f fVar = this.f1613a;
            i iVar = (i) aVar;
            if (iVar != null) {
                if (fVar.f808a == b.b.a.a.b.o.e.THIS_DEVICE && Build.VERSION.SDK_INT >= 23 && a.e.e.a.a(iVar.f1202a, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    a.e.d.a.a(iVar.f1202a, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
                } else {
                    iVar.f1202a.W.b().a(fVar);
                }
                return true;
            }
            throw null;
        }

        public boolean a() {
            if (this.f1613a.f808a != b.b.a.a.b.o.e.THIS_DEVICE) {
                return true;
            }
            UpnpControl upnpControl = r.this.f1611b.t;
            return upnpControl != null && upnpControl.isConnecting();
        }
    }
}
