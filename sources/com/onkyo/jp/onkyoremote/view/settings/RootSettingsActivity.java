package com.onkyo.jp.onkyoremote.view.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import b.b.a.a.b.f;
import b.b.a.a.f.n0.h;
import b.b.a.a.f.n0.m;
import b.b.a.a.f.n0.o;
import b.b.a.a.f.n0.p;
import b.b.a.a.f.n0.q;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class RootSettingsActivity extends m {
    public ListView r;
    public q s;
    public q t;
    public q u;
    public q v;
    public q w;
    public q x;
    public b.b.a.a.b.o.c y;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            q qVar = (q) RootSettingsActivity.this.r.getAdapter().getItem(i);
            RootSettingsActivity rootSettingsActivity = RootSettingsActivity.this;
            if (qVar == rootSettingsActivity.s) {
                if (rootSettingsActivity.j()) {
                    RootSettingsActivity.this.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) DeviceRestrictionActivity.class));
                    return;
                }
                return;
            }
            if (qVar == rootSettingsActivity.t) {
                rootSettingsActivity.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) ZoneNameSettingsActivity.class));
                return;
            }
            if (qVar == rootSettingsActivity.u) {
                if (rootSettingsActivity.q.q() == 1) {
                    RootSettingsActivity.this.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) SelectorSettingsActivity.class));
                    return;
                } else {
                    RootSettingsActivity.this.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) ZoneSelectActivity.class));
                    return;
                }
            }
            if (qVar == rootSettingsActivity.v) {
                rootSettingsActivity.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) NetworkServiceSettingsActivity.class));
            } else if (qVar == rootSettingsActivity.w) {
                rootSettingsActivity.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) AppSettingsActivity.class));
            } else if (qVar == rootSettingsActivity.x) {
                rootSettingsActivity.startActivity(new Intent(RootSettingsActivity.this, (Class<?>) LicenseActivity.class));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements q {
        public b(RootSettingsActivity rootSettingsActivity) {
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return false;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_app_version;
        }
    }

    /* loaded from: classes.dex */
    public class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public String f1748a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f1749b;

        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f1751b;

            public a(int i) {
                this.f1751b = i;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                RootSettingsActivity.a(RootSettingsActivity.this, this.f1751b);
            }
        }

        public c(String str) {
            this.f1748a = str;
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
            ((TextView) view.findViewById(R.id.title_label)).setText(this.f1748a);
            TextView textView = (TextView) view.findViewById(R.id.edit_text);
            this.f1749b = textView;
            textView.setText(RootSettingsActivity.this.q.h());
            this.f1749b.setOnClickListener(new a(i));
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return false;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_edit_cell;
        }
    }

    /* loaded from: classes.dex */
    public class d implements q {

        /* renamed from: a, reason: collision with root package name */
        public String f1753a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1754b;

        public d(RootSettingsActivity rootSettingsActivity, String str, boolean z) {
            this.f1753a = str;
            this.f1754b = z;
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return this.f1754b;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_link_cell;
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
            ((TextView) view.findViewById(R.id.title_label)).setText(this.f1753a);
            View findViewById = view.findViewById(R.id.cell_accessory);
            if (this.f1754b) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
    }

    /* loaded from: classes.dex */
    public class e implements q {

        /* renamed from: a, reason: collision with root package name */
        public String f1755a;

        /* renamed from: b, reason: collision with root package name */
        public String f1756b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1757c;

        public e(RootSettingsActivity rootSettingsActivity, String str, String str2, boolean z) {
            this.f1755a = str;
            this.f1756b = str2;
            this.f1757c = z;
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return this.f1757c;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_text_cell;
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
            TextView textView = (TextView) view.findViewById(R.id.title_label);
            TextView textView2 = (TextView) view.findViewById(R.id.data_label);
            textView.setText(this.f1755a);
            textView2.setText(this.f1756b);
            view.setEnabled(this.f1757c);
            View findViewById = view.findViewById(R.id.cell_accessory);
            if (this.f1757c) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
    }

    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_settings_root);
        this.y = this.q.f852c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new o(getString(R.string.stg_deviceInfo)));
        boolean z = false;
        arrayList.add(new e(this, getString(R.string.stg_modelName), this.y.d, false));
        String string = getString(R.string.stg_modelYear);
        StringBuilder a2 = b.a.a.a.a.a("");
        b.b.a.a.b.o.c cVar = this.y;
        a2.append(cVar.d.equals("NF-07") ? 2016 : cVar.f801c);
        e eVar = new e(this, string, a2.toString(), j());
        this.s = eVar;
        arrayList.add(eVar);
        arrayList.add(new e(this, getString(R.string.stg_ipAddress), this.y.f799a.a(), false));
        arrayList.add(new e(this, getString(R.string.stg_version), this.y.f, false));
        arrayList.add(new c(getString(R.string.stg_displayName)));
        arrayList.add(new o(getString(R.string.stg_deviceStg)));
        d dVar = new d(this, getString(R.string.stg_zone), true);
        this.t = dVar;
        arrayList.add(dVar);
        d dVar2 = new d(this, getString(R.string.stg_inputSelector), true);
        this.u = dVar2;
        arrayList.add(dVar2);
        d dVar3 = new d(this, getString(R.string.stg_networkService), this.y.f801c >= 2011);
        this.v = dVar3;
        arrayList.add(dVar3);
        arrayList.add(new o());
        d dVar4 = new d(this, getString(R.string.stg_appStg), true);
        this.w = dVar4;
        arrayList.add(dVar4);
        try {
            if (getAssets().list("licenses").length > 0) {
                z = true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (z) {
            d dVar5 = new d(this, getString(R.string.stg_licenseInfo), true);
            this.x = dVar5;
            arrayList.add(dVar5);
        }
        arrayList.add(new b(this));
        ListView listView = (ListView) findViewById(R.id.settings_list);
        this.r = listView;
        listView.setAdapter((ListAdapter) new p(this, arrayList));
        this.r.setOnItemClickListener(new a());
    }

    public final boolean j() {
        return f.f == f.onkyo || f.f == f.integra;
    }

    public static /* synthetic */ void a(RootSettingsActivity rootSettingsActivity, int i) {
        rootSettingsActivity.a(rootSettingsActivity.getString(R.string.stg_displayName), rootSettingsActivity.q.h(), rootSettingsActivity.q.f852c.d, new h(rootSettingsActivity, i));
    }
}
