package b.b.a.a.f.k0.v;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.c.d;
import b.b.a.a.f.k0.v.k;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.controlpage.upnp.MediaItemCell;
import com.onkyo.jp.onkyoremote.view.controlpage.upnp.NonSelectableCell;
import com.onkyo.jp.onkyoremote.view.controlpage.upnp.UpnpAlbumCell;
import java.util.HashSet;

/* compiled from: UpnpAlbumListPage.java */
/* loaded from: classes.dex */
public final class d extends k {
    public int s;
    public int t;
    public boolean u;
    public HashSet<Integer> v;

    public d(Context context, b.b.a.a.b.p.d dVar, p pVar) {
        super(context, dVar, pVar);
        this.s = -1;
        this.v = new HashSet<>();
    }

    public boolean a(Integer num) {
        if (!this.v.contains(num)) {
            this.v.add(num);
            return true;
        }
        this.v.remove(num);
        return false;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_upnp_album_list);
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        if (this.f.d == 2) {
            this.u = false;
        } else {
            this.u = true;
        }
        a(listView, new a(this, this.f));
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.f.k0.v.k
    public void j() {
        super.j();
        int i = this.s;
        if (i != -1) {
            this.v.add(Integer.valueOf(this.f.c(i).b()));
        }
    }

    @Override // b.b.a.a.f.k0.v.k
    public void k() {
        int headerViewsCount = this.k.getHeaderViewsCount();
        int i = this.s;
        if (i != -1) {
            headerViewsCount += i;
        }
        if (headerViewsCount > 0) {
            DisplayMetrics displayMetrics = this.f1597b.getResources().getDisplayMetrics();
            int i2 = 0;
            if (this.s != -1) {
                int applyDimension = (int) TypedValue.applyDimension(1, (this.t * 40) + 50, displayMetrics);
                if (((int) TypedValue.applyDimension(1, 40, displayMetrics)) + applyDimension >= this.d.getHeight()) {
                    i2 = applyDimension - (this.d.getHeight() / 2);
                }
            }
            this.k.setSelectionFromTop(headerViewsCount, (int) (displayMetrics.density - i2));
        }
    }

    @Override // b.b.a.a.f.k0.v.e
    public void b(int i) {
        int b2;
        a.b a2;
        d.g gVar;
        a aVar = (a) this.l;
        String str = aVar.d;
        if (str == null) {
            super.b(i);
            return;
        }
        int[] iArr = {-1, -1};
        if (str != null && (a2 = aVar.a(i)) != null) {
            int i2 = a2.f1347a;
            if (i2 == 2) {
                d.n c2 = aVar.f.c(a2.f1348b);
                if (c2 != null) {
                    iArr[0] = c2.b();
                    iArr[1] = -1;
                }
            } else if (i2 == 4 && (gVar = (d.g) aVar.g.c(a2.f1348b)) != null) {
                iArr[0] = gVar.e;
                iArr[1] = gVar.f1093a;
            }
        }
        if (iArr[0] == -1 || (b2 = this.f.b(iArr[0])) == -1) {
            return;
        }
        if (iArr[1] == -1) {
            a(Integer.valueOf(iArr[0]));
            i();
            ListView listView = this.k;
            listView.setSelectionFromTop(listView.getHeaderViewsCount() + b2, 0);
            return;
        }
        d.m a3 = this.f.a(b2);
        if (a3 != null) {
            a3.a(false);
            int b3 = a3.b(iArr[1]);
            if (b3 != -1) {
                a(a3, b2, b3);
            }
            a3.c();
        }
    }

    /* compiled from: UpnpAlbumListPage.java */
    /* loaded from: classes.dex */
    public static class a extends k.c {
        public d e;
        public d.m f;
        public d.m g;
        public d.h h;

        /* compiled from: UpnpAlbumListPage.java */
        /* renamed from: b.b.a.a.f.k0.v.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0049a implements d.h {
            public C0049a() {
            }

            @Override // b.b.a.a.c.d.h
            public void a(d.m mVar) {
                a aVar = a.this;
                if (mVar == aVar.f || mVar == aVar.g) {
                    a.this.notifyDataSetChanged();
                }
            }
        }

        /* compiled from: UpnpAlbumListPage.java */
        /* loaded from: classes.dex */
        public class b {

            /* renamed from: a, reason: collision with root package name */
            public int f1347a;

            /* renamed from: b, reason: collision with root package name */
            public int f1348b;

            public b(a aVar) {
            }
        }

        public a(d dVar, d.m mVar) {
            super(dVar.f1597b, mVar);
            this.f = null;
            this.g = null;
            this.h = new C0049a();
            this.e = dVar;
        }

        @Override // b.b.a.a.f.k0.v.k.c
        public View a(LayoutInflater layoutInflater, int i, View view) {
            UpnpAlbumCell upnpAlbumCell;
            b.b.a.a.c.a aVar;
            if (this.d != null) {
                b a2 = a(i);
                if (a2 == null) {
                    return null;
                }
                if (view == null || view.getTag() == null || ((Integer) view.getTag()).intValue() != a2.f1347a) {
                    int i2 = a2.f1347a;
                    int i3 = R.layout.layout_upnp_search_result_cell;
                    if (i2 == 1) {
                        i3 = R.layout.layout_upnp_search_album_header;
                    } else if (i2 != 2) {
                        if (i2 == 3) {
                            i3 = R.layout.layout_upnp_search_content_header;
                        } else if (i2 != 4) {
                            if (i2 != 5) {
                                return null;
                            }
                            i3 = R.layout.layout_upnp_search_no_result_cell;
                        }
                    }
                    view = layoutInflater.inflate(i3, (ViewGroup) null);
                }
                view.setTag(Integer.valueOf(a2.f1347a));
                int i4 = a2.f1347a;
                if (i4 == 1 || i4 == 3 || i4 == 5) {
                    NonSelectableCell nonSelectableCell = (NonSelectableCell) view;
                    nonSelectableCell.f1713b = this.e;
                    nonSelectableCell.setOnClickListener(nonSelectableCell.f1714c);
                    nonSelectableCell.setOnTouchListener(nonSelectableCell.d);
                } else if (i4 == 2) {
                    ((MediaItemCell) view).a(this.e, i, this.f.c(a2.f1348b));
                } else if (i4 == 4) {
                    ((MediaItemCell) view).a(this.e, i, this.g.c(a2.f1348b));
                }
                return view;
            }
            d.c cVar = (d.c) this.f1355b.c(i);
            if (view != null && (view instanceof UpnpAlbumCell)) {
                upnpAlbumCell = (UpnpAlbumCell) view;
            } else {
                upnpAlbumCell = (UpnpAlbumCell) layoutInflater.inflate(R.layout.layout_upnp_album_cell, (ViewGroup) null);
            }
            d dVar = this.e;
            d.m mVar = this.f1355b;
            upnpAlbumCell.a();
            d.c cVar2 = upnpAlbumCell.e;
            if (cVar2 != null && (aVar = cVar2.f1104c) != null) {
                aVar.b(upnpAlbumCell);
            }
            upnpAlbumCell.f1716b = dVar;
            upnpAlbumCell.f1717c = mVar;
            upnpAlbumCell.d = i;
            upnpAlbumCell.e = cVar;
            ViewGroup viewGroup = (ViewGroup) upnpAlbumCell.findViewById(R.id.content_frame);
            TextView textView = (TextView) upnpAlbumCell.findViewById(R.id.title_label);
            TextView textView2 = (TextView) upnpAlbumCell.findViewById(R.id.subtitle_label);
            b.b.a.a.c.a aVar2 = cVar.f1104c;
            if (aVar2 != null) {
                aVar2.a(upnpAlbumCell);
            } else {
                upnpAlbumCell.a(b.b.a.a.c.d.this.d.l);
            }
            textView.setText(cVar.f1103b);
            if (dVar.u) {
                textView2.setVisibility(0);
                textView2.setText(cVar.e);
            } else {
                textView2.setVisibility(8);
            }
            if (dVar.v.contains(Integer.valueOf(cVar.f1102a))) {
                upnpAlbumCell.a(false);
            } else {
                UpnpAlbumCell.d dVar2 = upnpAlbumCell.f;
                if (dVar2 != null) {
                    UpnpAlbumCell.d.a(dVar2, false, new b.b.a.a.f.k0.v.a(upnpAlbumCell));
                }
            }
            viewGroup.setOnClickListener(upnpAlbumCell.g);
            viewGroup.setOnLongClickListener(upnpAlbumCell.h);
            viewGroup.setOnTouchListener(upnpAlbumCell.i);
            return upnpAlbumCell;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.d != null) {
                int i = 0;
                d.m mVar = this.f;
                if (mVar != null) {
                    if (mVar.d()) {
                        i = 1;
                    } else {
                        i = this.f.b() == 0 ? 2 : this.f.b() + 1;
                    }
                }
                d.m mVar2 = this.g;
                if (mVar2 == null) {
                    return i;
                }
                int i2 = i + 1;
                return !mVar2.d() ? this.g.b() == 0 ? i2 + 1 : i2 + this.g.b() : i2;
            }
            return this.f1355b.b();
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            if (this.d == null) {
                return true;
            }
            b a2 = a(i);
            if (a2 == null) {
                return false;
            }
            int i2 = a2.f1347a;
            return i2 == 2 || i2 == 4 || i2 == 5;
        }

        @Override // b.b.a.a.f.k0.v.k.c
        public boolean a(String str) {
            boolean z = false;
            if (!super.a(str)) {
                return false;
            }
            d.m mVar = this.f;
            if (mVar != null) {
                mVar.a(this.h);
                this.f.c();
                this.f = null;
                z = true;
            }
            d.m mVar2 = this.g;
            if (mVar2 != null) {
                mVar2.a(this.h);
                this.g.c();
                this.g = null;
                z = true;
            }
            if (this.d != null) {
                d.m a2 = this.f1355b.a(str);
                this.f = a2;
                a2.f1101c = this.h;
                d.m b2 = this.f1355b.b(str);
                this.g = b2;
                b2.f1101c = this.h;
                this.f.a(true);
                this.g.a(true);
                z = true;
            }
            if (z) {
                notifyDataSetChanged();
            }
            return true;
        }

        public final b a(int i) {
            b bVar = new b(this);
            d.m mVar = this.f;
            if (mVar != null) {
                if (i == 0) {
                    bVar.f1347a = 1;
                    bVar.f1348b = 0;
                    return bVar;
                }
                i--;
                if (!mVar.d()) {
                    if (this.f.b() == 0) {
                        if (i == 0) {
                            bVar.f1347a = 5;
                            bVar.f1348b = 0;
                            return bVar;
                        }
                        i--;
                    } else {
                        if (i < this.f.b()) {
                            bVar.f1347a = 2;
                            bVar.f1348b = i;
                            return bVar;
                        }
                        i -= this.f.b();
                    }
                }
            }
            d.m mVar2 = this.g;
            if (mVar2 == null) {
                return null;
            }
            if (i == 0) {
                bVar.f1347a = 3;
                bVar.f1348b = 0;
                return bVar;
            }
            int i2 = i - 1;
            if (bVar.f1347a != 0 || mVar2.d()) {
                return null;
            }
            if (this.g.b() == 0) {
                if (i2 != 0) {
                    return null;
                }
                bVar.f1347a = 5;
                bVar.f1348b = 0;
                return bVar;
            }
            if (i2 >= this.g.b()) {
                return null;
            }
            bVar.f1347a = 4;
            bVar.f1348b = i2;
            return bVar;
        }
    }
}
