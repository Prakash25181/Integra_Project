package a.b.o.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: MenuPopup.java */
/* loaded from: classes.dex */
public abstract class k implements p, m, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Rect f144b;

    public static int a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean b(g gVar) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public abstract void a(int i);

    public abstract void a(g gVar);

    @Override // a.b.o.i.m
    public void a(Context context, g gVar) {
    }

    public abstract void a(View view);

    public abstract void a(PopupWindow.OnDismissListener onDismissListener);

    @Override // a.b.o.i.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    public abstract void b(int i);

    public abstract void b(boolean z);

    @Override // a.b.o.i.m
    public boolean b(g gVar, i iVar) {
        return false;
    }

    public abstract void c(int i);

    public abstract void c(boolean z);

    public boolean c() {
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        f fVar;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            fVar = (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            fVar = (f) listAdapter;
        }
        fVar.f126b.a((MenuItem) listAdapter.getItem(i), this, c() ? 0 : 4);
    }
}
