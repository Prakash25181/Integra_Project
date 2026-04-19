package a.b.o.i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder.java */
/* loaded from: classes.dex */
public class g implements a.e.g.a.a {
    public static final int[] z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f128a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f129b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f130c;
    public boolean d;
    public a e;
    public CharSequence m;
    public Drawable n;
    public View o;
    public i w;
    public boolean y;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public boolean x = false;
    public ArrayList<i> f = new ArrayList<>();
    public ArrayList<i> g = new ArrayList<>();
    public boolean h = true;
    public ArrayList<i> i = new ArrayList<>();
    public ArrayList<i> j = new ArrayList<>();
    public boolean k = true;

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(g gVar);

        boolean a(g gVar, MenuItem menuItem);
    }

    /* compiled from: MenuBuilder.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        boolean z2 = false;
        this.f128a = context;
        this.f129b = context.getResources();
        if (this.f129b.getConfiguration().keyboard != 1 && a.e.k.r.a(ViewConfiguration.get(this.f128a), this.f128a)) {
            z2 = true;
        }
        this.d = z2;
    }

    public void a(m mVar, Context context) {
        this.v.add(new WeakReference<>(mVar));
        mVar.a(context, this);
        this.k = true;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f128a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public String b() {
        return "android:menu:actionviewstates";
    }

    public void b(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(b(), sparseArray);
        }
    }

    public g c() {
        return this;
    }

    @Override // android.view.Menu
    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            a(iVar);
        }
        this.f.clear();
        b(true);
    }

    public void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        b(false);
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public ArrayList<i> d() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            i iVar = this.f.get(i);
            if (iVar.isVisible()) {
                this.g.add(iVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean e() {
        return this.x;
    }

    public boolean f() {
        return this.f130c;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f133a == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g() {
        return this.d;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f.get(i);
    }

    public void h() {
        this.k = true;
        b(true);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        this.p = false;
        if (this.q) {
            this.q = false;
            b(this.r);
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    public void j() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        i a2 = a(i, keyEvent);
        boolean a3 = a2 != null ? a(a2, (m) null, i2) : false;
        if ((i2 & 2) != 0) {
            a(true);
        }
        return a3;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f.get(i2).f134b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f.get(i2).f134b != i) {
                    break;
                }
                a(i2, false);
                i3 = i4;
            }
            b(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f.get(i2).f133a == i) {
                break;
            } else {
                i2++;
            }
        }
        a(i2, true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z2, boolean z3) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f134b == i) {
                iVar.x = (iVar.x & (-5)) | (z3 ? 4 : 0);
                iVar.setCheckable(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z2) {
        this.x = z2;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z2) {
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f134b == i) {
                iVar.setEnabled(z2);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z2) {
        int size = this.f.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.f134b == i && iVar.c(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z2) {
        this.f130c = z2;
        b(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f129b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f129b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        i iVar = (i) a(i, i2, i3, charSequence);
        r rVar = new r(this.f128a, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.e);
        return rVar;
    }

    public void a(m mVar) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.v.remove(next);
            }
        }
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f129b.getString(i4));
    }

    public void a(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(b());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).a(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f129b.getString(i4));
    }

    public void b(boolean z2) {
        if (!this.p) {
            if (z2) {
                this.h = true;
                this.k = true;
            }
            if (this.v.isEmpty()) {
                return;
            }
            j();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    mVar.a(z2);
                }
            }
            i();
            return;
        }
        this.q = true;
        if (z2) {
            this.r = true;
        }
    }

    public final void a(int i, boolean z2) {
        if (i < 0 || i >= this.f.size()) {
            return;
        }
        this.f.remove(i);
        if (z2) {
            b(true);
        }
    }

    public MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = z;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                i iVar = new i(this, i, i2, i3, i6, charSequence, this.l);
                ArrayList<i> arrayList = this.f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                        break;
                    }
                    if (arrayList.get(size).d <= i6) {
                        i4 = size + 1;
                        break;
                    }
                }
                arrayList.add(i4, iVar);
                b(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public boolean b(i iVar) {
        boolean z2 = false;
        if (this.v.isEmpty()) {
            return false;
        }
        j();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                z2 = mVar.a(this, iVar);
                if (z2) {
                    break;
                }
            }
        }
        i();
        if (z2) {
            this.w = iVar;
        }
        return z2;
    }

    public final void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f129b;
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = resources.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = a.e.e.a.b(this.f128a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        b(false);
    }

    public boolean a(g gVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public void a(List<i> list, int i, KeyEvent keyEvent) {
        char c2;
        int i2;
        boolean f = f();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f.get(i3);
                if (iVar.hasSubMenu()) {
                    iVar.o.a(list, i, keyEvent);
                }
                if (f) {
                    c2 = iVar.j;
                } else {
                    c2 = iVar.h;
                }
                if (f) {
                    i2 = iVar.k;
                } else {
                    i2 = iVar.i;
                }
                if (((modifiers & 69647) == (i2 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (f && c2 == '\b' && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public i a(int i, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.u;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean f = f();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = arrayList.get(i2);
            if (f) {
                c2 = iVar.j;
            } else {
                c2 = iVar.h;
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (f && c2 == '\b' && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (m) null, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.MenuItem r7, a.b.o.i.m r8, int r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.o.i.g.a(android.view.MenuItem, a.b.o.i.m, int):boolean");
    }

    public final void a(boolean z2) {
        if (this.t) {
            return;
        }
        this.t = true;
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                mVar.a(this, z2);
            }
        }
        this.t = false;
    }

    public void a() {
        ArrayList<i> d = d();
        if (this.k) {
            Iterator<WeakReference<m>> it = this.v.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z2 |= mVar.b();
                }
            }
            if (z2) {
                this.i.clear();
                this.j.clear();
                int size = d.size();
                for (int i = 0; i < size; i++) {
                    i iVar = d.get(i);
                    if (iVar.d()) {
                        this.i.add(iVar);
                    } else {
                        this.j.add(iVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(d());
            }
            this.k = false;
        }
    }

    public boolean a(i iVar) {
        boolean z2 = false;
        if (!this.v.isEmpty() && this.w == iVar) {
            j();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z2 = mVar.b(this, iVar);
                    if (z2) {
                        break;
                    }
                }
            }
            i();
            if (z2) {
                this.w = null;
            }
        }
        return z2;
    }
}
