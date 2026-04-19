package a.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* compiled from: MenuPopupWindow.java */
/* loaded from: classes.dex */
public class m0 extends k0 implements l0 {
    public static Method H;
    public l0 G;

    /* compiled from: MenuPopupWindow.java */
    /* loaded from: classes.dex */
    public static class a extends f0 {
        public final int p;
        public final int q;
        public l0 r;
        public MenuItem s;

        public a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (Build.VERSION.SDK_INT >= 17 && 1 == configuration.getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
            } else {
                this.p = 22;
                this.q = 21;
            }
        }

        @Override // a.b.p.f0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            a.b.o.i.f fVar;
            int pointToPosition;
            int i2;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (a.b.o.i.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (a.b.o.i.f) adapter;
                }
                a.b.o.i.i iVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < fVar.getCount()) {
                    iVar = fVar.getItem(i2);
                }
                MenuItem menuItem = this.s;
                if (menuItem != iVar) {
                    a.b.o.i.g gVar = fVar.f126b;
                    if (menuItem != null) {
                        this.r.b(gVar, menuItem);
                    }
                    this.s = iVar;
                    if (iVar != null) {
                        this.r.a(gVar, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && i == this.q) {
                setSelection(-1);
                ((a.b.o.i.f) getAdapter()).f126b.a(false);
                return true;
            }
            return super.onKeyDown(i, keyEvent);
        }

        public void setHoverListener(l0 l0Var) {
            this.r = l0Var;
        }

        @Override // a.b.p.f0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                H = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public m0(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // a.b.p.k0
    public f0 a(Context context, boolean z) {
        a aVar = new a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    @Override // a.b.p.l0
    public void b(a.b.o.i.g gVar, MenuItem menuItem) {
        l0 l0Var = this.G;
        if (l0Var != null) {
            l0Var.b(gVar, menuItem);
        }
    }

    @Override // a.b.p.l0
    public void a(a.b.o.i.g gVar, MenuItem menuItem) {
        l0 l0Var = this.G;
        if (l0Var != null) {
            l0Var.a(gVar, menuItem);
        }
    }
}
