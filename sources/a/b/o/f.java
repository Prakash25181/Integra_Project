package a.b.o;

import a.b.o.i.i;
import a.b.o.i.j;
import a.b.p.e0;
import a.b.p.x0;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater.java */
/* loaded from: classes.dex */
public class f extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f89a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f90b;

    /* renamed from: c, reason: collision with root package name */
    public Context f91c;
    public Object d;

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c, reason: collision with root package name */
        public static final Class<?>[] f92c = {MenuItem.class};

        /* renamed from: a, reason: collision with root package name */
        public Object f93a;

        /* renamed from: b, reason: collision with root package name */
        public Method f94b;

        public a(Object obj, String str) {
            this.f93a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f94b = cls.getMethod(str, f92c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f94b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f94b.invoke(this.f93a, menuItem)).booleanValue();
                }
                this.f94b.invoke(this.f93a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public f(Context context) {
        super(context);
        this.f91c = context;
        Object[] objArr = {context};
        this.f89a = objArr;
        this.f90b = objArr;
    }

    public final void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(b.a.a.a.a.a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals("group")) {
                            bVar.f96b = 0;
                            bVar.f97c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                a.e.k.b bVar2 = bVar.A;
                                if (bVar2 != null && ((j.a) bVar2).f137b.hasSubMenu()) {
                                    bVar.a();
                                } else {
                                    bVar.h = true;
                                    bVar.a(bVar.f95a.add(bVar.f96b, bVar.i, bVar.j, bVar.k));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.f91c.obtainStyledAttributes(attributeSet, a.b.j.MenuGroup);
                        bVar.f96b = obtainStyledAttributes.getResourceId(a.b.j.MenuGroup_android_id, 0);
                        bVar.f97c = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_menuCategory, 0);
                        bVar.d = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_orderInCategory, 0);
                        bVar.e = obtainStyledAttributes.getInt(a.b.j.MenuGroup_android_checkableBehavior, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(a.b.j.MenuGroup_android_visible, true);
                        bVar.g = obtainStyledAttributes.getBoolean(a.b.j.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        x0 a2 = x0.a(f.this.f91c, attributeSet, a.b.j.MenuItem);
                        bVar.i = a2.e(a.b.j.MenuItem_android_id, 0);
                        bVar.j = (a2.c(a.b.j.MenuItem_android_menuCategory, bVar.f97c) & (-65536)) | (a2.c(a.b.j.MenuItem_android_orderInCategory, bVar.d) & 65535);
                        bVar.k = a2.e(a.b.j.MenuItem_android_title);
                        bVar.l = a2.e(a.b.j.MenuItem_android_titleCondensed);
                        bVar.m = a2.e(a.b.j.MenuItem_android_icon, 0);
                        String d = a2.d(a.b.j.MenuItem_android_alphabeticShortcut);
                        bVar.n = d == null ? (char) 0 : d.charAt(0);
                        bVar.o = a2.c(a.b.j.MenuItem_alphabeticModifiers, 4096);
                        String d2 = a2.d(a.b.j.MenuItem_android_numericShortcut);
                        bVar.p = d2 == null ? (char) 0 : d2.charAt(0);
                        bVar.q = a2.c(a.b.j.MenuItem_numericModifiers, 4096);
                        if (a2.f(a.b.j.MenuItem_android_checkable)) {
                            bVar.r = a2.a(a.b.j.MenuItem_android_checkable, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = a2.a(a.b.j.MenuItem_android_checked, false);
                        bVar.t = a2.a(a.b.j.MenuItem_android_visible, bVar.f);
                        bVar.u = a2.a(a.b.j.MenuItem_android_enabled, bVar.g);
                        bVar.v = a2.c(a.b.j.MenuItem_showAsAction, -1);
                        bVar.z = a2.d(a.b.j.MenuItem_android_onClick);
                        bVar.w = a2.e(a.b.j.MenuItem_actionLayout, 0);
                        bVar.x = a2.d(a.b.j.MenuItem_actionViewClass);
                        String d3 = a2.d(a.b.j.MenuItem_actionProviderClass);
                        bVar.y = d3;
                        boolean z3 = d3 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (a.e.k.b) bVar.a(bVar.y, f, f.this.f90b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = a2.e(a.b.j.MenuItem_contentDescription);
                        bVar.C = a2.e(a.b.j.MenuItem_tooltipText);
                        if (a2.f(a.b.j.MenuItem_iconTintMode)) {
                            bVar.E = e0.a(a2.c(a.b.j.MenuItem_iconTintMode, -1), bVar.E);
                        } else {
                            bVar.E = null;
                        }
                        if (a2.f(a.b.j.MenuItem_iconTint)) {
                            bVar.D = a2.a(a.b.j.MenuItem_iconTint);
                        } else {
                            bVar.D = null;
                        }
                        a2.f275b.recycle();
                        bVar.h = false;
                    } else if (name3.equals("menu")) {
                        a(xmlPullParser, attributeSet, bVar.a());
                    } else {
                        z2 = true;
                        str = name3;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.e.g.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f91c.getResources().getLayout(i);
                    a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* compiled from: SupportMenuInflater.java */
    /* loaded from: classes.dex */
    public class b {
        public a.e.k.b A;
        public CharSequence B;
        public CharSequence C;

        /* renamed from: a, reason: collision with root package name */
        public Menu f95a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: b, reason: collision with root package name */
        public int f96b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f97c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.f95a = menu;
        }

        public final void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (!f.this.f91c.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.d == null) {
                        fVar.d = fVar.a(fVar.f91c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.d, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof i;
            if (z2) {
            }
            if (this.r >= 2) {
                if (z2) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & (-5)) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        jVar.e.invoke(jVar.d, true);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) a(str, f.e, f.this.f89a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            a.e.k.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof a.e.g.a.b) {
                    ((a.e.g.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof a.e.g.a.b;
            if (z3) {
                ((a.e.g.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((a.e.g.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i3 = this.o;
            if (z3) {
                ((a.e.g.a.b) menuItem).setAlphabeticShortcut(c2, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i3);
            }
            char c3 = this.p;
            int i4 = this.q;
            if (z3) {
                ((a.e.g.a.b) menuItem).setNumericShortcut(c3, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i4);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((a.e.g.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                if (z3) {
                    ((a.e.g.a.b) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }

        public SubMenu a() {
            this.h = true;
            SubMenu addSubMenu = this.f95a.addSubMenu(this.f96b, this.i, this.j, this.k);
            a(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.f91c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }
}
