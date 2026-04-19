package b.b.a.a.f.k0.v;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.c.d;
import b.b.a.a.f.k0.v.k;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.controlpage.upnp.MediaItemCell;

/* compiled from: UpnpMediaDirectoryPage.java */
/* loaded from: classes.dex */
public class l extends k {
    public int s;

    public l(Context context, b.b.a.a.b.p.d dVar, p pVar) {
        super(context, dVar, pVar);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_upnp_media_directory);
        ListView listView = (ListView) a2.findViewById(R.id.content_list);
        int i = 0;
        d.m mVar = this.f;
        if (mVar.d == 6) {
            i = mVar.f1099a.d == 3 ? 1 : 3;
        }
        a(listView, new a(this, this.f, i));
        this.d = a2;
        return a2;
    }

    @Override // b.b.a.a.f.k0.v.k
    public void k() {
        int headerViewsCount = this.k.getHeaderViewsCount() + this.s;
        if (headerViewsCount > 0) {
            this.k.setSelectionFromTop(headerViewsCount, (int) this.f1597b.getResources().getDisplayMetrics().density);
        }
    }

    /* compiled from: UpnpMediaDirectoryPage.java */
    /* loaded from: classes.dex */
    public static final class a extends k.c {
        public l e;
        public d.m f;
        public int g;
        public d.h h;

        /* compiled from: UpnpMediaDirectoryPage.java */
        /* renamed from: b.b.a.a.f.k0.v.l$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0050a implements d.h {
            public C0050a() {
            }

            @Override // b.b.a.a.c.d.h
            public void a(d.m mVar) {
                a aVar = a.this;
                if (mVar == aVar.f) {
                    aVar.notifyDataSetChanged();
                }
            }
        }

        public a(l lVar, d.m mVar, int i) {
            super(lVar.f1597b, mVar);
            this.f = null;
            this.h = new C0050a();
            this.e = lVar;
            this.g = i;
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
            if (this.d != null) {
                d.m a2 = this.f1355b.a(str);
                this.f = a2;
                a2.f1101c = this.h;
                a2.a(true);
                z = true;
            }
            if (z) {
                notifyDataSetChanged();
            }
            return true;
        }

        public d.m b() {
            d.m mVar = this.f;
            return mVar != null ? mVar : this.f1355b;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return b().b();
        }

        @Override // b.b.a.a.f.k0.v.k.c
        public View a(LayoutInflater layoutInflater, int i, View view) {
            d.n c2 = b().c(i);
            int i2 = b().d;
            int i3 = (i2 == 6 || i2 == 7) ? R.layout.layout_upnp_song_cell : i2 == 0 ? R.layout.layout_upnp_root_cell : R.layout.layout_upnp_media_cell;
            if (view == null) {
                view = layoutInflater.inflate(i3, (ViewGroup) null);
            }
            MediaItemCell mediaItemCell = (MediaItemCell) view;
            mediaItemCell.a(this.e, i, c2);
            int i4 = this.g;
            TextView textView = (TextView) mediaItemCell.findViewById(R.id.subtitle_label);
            if (textView != null) {
                if ((c2 instanceof d.g) && i4 != 0) {
                    d.g gVar = (d.g) c2;
                    String str = (i4 & 1) != 0 ? gVar.f1095c : null;
                    String str2 = (i4 & 2) != 0 ? gVar.d : null;
                    if (str != null && str2 != null) {
                        textView.setText(str + " / " + str2);
                    } else if (str != null) {
                        textView.setText(str);
                    } else if (str2 != null) {
                        textView.setText(str2);
                    } else {
                        textView.setText("");
                    }
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            return mediaItemCell;
        }
    }

    @Override // b.b.a.a.f.k0.v.e
    public void b(int i) {
        d.m mVar = ((a) this.l).f;
        if (mVar != null) {
            i = mVar.d(i);
        }
        super.b(i);
    }
}
