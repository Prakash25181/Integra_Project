package a.b.o.i;

import a.b.o.i.m;
import a.b.o.i.n;
import a.b.p.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter.java */
/* loaded from: classes.dex */
public abstract class b implements m {

    /* renamed from: b, reason: collision with root package name */
    public Context f108b;

    /* renamed from: c, reason: collision with root package name */
    public Context f109c;
    public g d;
    public LayoutInflater e;
    public m.a f;
    public int g;
    public int h;
    public n i;

    public b(Context context, int i, int i2) {
        this.f108b = context;
        this.e = LayoutInflater.from(context);
        this.g = i;
        this.h = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.b.o.i.m
    public void a(boolean z) {
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.i;
        if (viewGroup == null) {
            return;
        }
        g gVar = this.d;
        if (gVar != null) {
            gVar.a();
            ArrayList<i> d = this.d.d();
            int size = d.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i iVar = d.get(i2);
                if (iVar.d()) {
                    View childAt = viewGroup.getChildAt(i);
                    i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                    View a2 = a(iVar, childAt, viewGroup);
                    if (iVar != itemData) {
                        a2.setPressed(false);
                        a2.jumpDrawablesToCurrentState();
                    }
                    if (a2 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(a2);
                        }
                        ((ViewGroup) this.i).addView(a2, i);
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        while (i < viewGroup.getChildCount()) {
            if (viewGroup.getChildAt(i) == ((a.b.p.c) this).j) {
                z2 = false;
            } else {
                viewGroup.removeViewAt(i);
                z2 = true;
            }
            if (!z2) {
                i++;
            }
        }
    }

    @Override // a.b.o.i.m
    public boolean a(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.o.i.m
    public boolean b(g gVar, i iVar) {
        return false;
    }

    @Override // a.b.o.i.m
    public void a(m.a aVar) {
        this.f = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v4, types: [a.b.o.i.n$a] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public View a(i iVar, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        if (view instanceof n.a) {
            actionMenuItemView = (n.a) view;
        } else {
            actionMenuItemView = (n.a) this.e.inflate(this.h, viewGroup, false);
        }
        a.b.p.c cVar = (a.b.p.c) this;
        actionMenuItemView.a(iVar, 0);
        ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
        actionMenuItemView2.setItemInvoker((ActionMenuView) cVar.i);
        if (cVar.x == null) {
            cVar.x = new c.b();
        }
        actionMenuItemView2.setPopupCallback(cVar.x);
        return actionMenuItemView;
    }

    @Override // a.b.o.i.m
    public boolean a(r rVar) {
        m.a aVar = this.f;
        if (aVar != null) {
            return aVar.a(rVar);
        }
        return false;
    }
}
