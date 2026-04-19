package com.onkyo.jp.onkyoremote.view.settings;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.b.a.a.b.i;
import b.b.a.a.e.d;
import b.b.a.a.f.n0.e;
import b.b.a.a.f.n0.f;
import b.b.a.a.f.n0.g;
import b.b.a.a.f.n0.n;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NetworkServiceSettingsActivity extends n {
    public i t;
    public f u;
    public b v;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
        }

        @Override // b.b.a.a.f.n0.f.a
        public void a(int i, int i2) {
            NetworkServiceSettingsActivity.this.t.f741a.a(i, i2);
            NetworkServiceSettingsActivity.this.v.b();
        }
    }

    /* loaded from: classes.dex */
    public class b extends n.a<b.b.a.a.b.o.f> {
        public b() {
            super();
            b();
        }

        @Override // b.b.a.a.f.n0.n.a
        public int a() {
            return R.layout.layout_settings_net_service_cell;
        }

        @Override // b.b.a.a.f.n0.n.a
        public void a(int i, b.b.a.a.b.o.f fVar, View view) {
            b.b.a.a.b.o.f fVar2 = fVar;
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.visible_check);
            i iVar = NetworkServiceSettingsActivity.this.t;
            checkBox.setChecked(iVar.f741a.a(iVar.a(fVar2.f808a)));
            checkBox.setOnCheckedChangeListener(new g(this, fVar2));
            ((ImageView) view.findViewById(R.id.service_icon_view)).setImageDrawable(fVar2.e);
            ((TextView) view.findViewById(R.id.name_label)).setText(fVar2.f809b);
            View findViewById = view.findViewById(R.id.reorder_mark);
            f fVar3 = NetworkServiceSettingsActivity.this.u;
            if (fVar3 != null) {
                findViewById.setOnTouchListener(new e(fVar3, view, i));
                return;
            }
            throw null;
        }

        public void b() {
            this.f1584b = NetworkServiceSettingsActivity.this.t.f741a.f1137b;
            notifyDataSetChanged();
            notifyDataSetChanged();
        }
    }

    @Override // b.b.a.a.f.n0.n, b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.t = this.q.p;
        this.v = new b();
        this.u = new f(this, this.s, new a());
        this.s.setAdapter((ListAdapter) this.v);
    }

    @Override // b.b.a.a.f.n0.m, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_netservice_settings, menu);
        return true;
    }

    @Override // b.b.a.a.f.n0.m, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_reset) {
            d<b.b.a.a.b.o.f> dVar = this.t.f741a;
            if (dVar != null) {
                dVar.f1137b = new ArrayList<>(dVar.f1136a);
                dVar.f1138c = new ArrayList<>(dVar.f1136a);
                this.v.b();
                return true;
            }
            throw null;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // b.b.a.a.f.n0.m, a.h.a.d, android.app.Activity
    public void onPause() {
        super.onPause();
        i();
    }
}
