package com.onkyo.jp.onkyoremote.view.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.b.a.a.b.j;
import b.b.a.a.b.l;
import b.b.a.a.b.o.g;
import b.b.a.a.b.o.h;
import b.b.a.a.b.o.i;
import b.b.a.a.b.o.r;
import b.b.a.a.e.d;
import b.b.a.a.f.n0.e;
import b.b.a.a.f.n0.f;
import b.b.a.a.f.n0.k;
import b.b.a.a.f.n0.n;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class SelectorSettingsActivity extends n {
    public l t;
    public j u;
    public f v;
    public b w;

    /* loaded from: classes.dex */
    public class a implements f.a {
        public a() {
        }

        @Override // b.b.a.a.f.n0.f.a
        public void a(int i, int i2) {
            SelectorSettingsActivity.this.u.f747a.a(i, i2);
            SelectorSettingsActivity.this.w.b();
        }
    }

    /* loaded from: classes.dex */
    public class b extends n.a<i> {
        public b() {
            super();
            b();
        }

        @Override // b.b.a.a.f.n0.n.a
        public int a() {
            return R.layout.layout_settings_selector_cell;
        }

        @Override // b.b.a.a.f.n0.n.a
        public void a(int i, i iVar, View view) {
            i iVar2 = iVar;
            CheckBox checkBox = (CheckBox) view.findViewById(R.id.visible_check);
            j jVar = SelectorSettingsActivity.this.u;
            checkBox.setChecked(jVar.f747a.a(jVar.a(iVar2.f817b)));
            checkBox.setOnCheckedChangeListener(new b.b.a.a.f.n0.j(this, iVar2));
            ImageButton imageButton = (ImageButton) view.findViewById(R.id.selector_icon_button);
            imageButton.setImageDrawable(iVar2.f818c.f813b);
            imageButton.setOnClickListener(new k(this, iVar2));
            TextView textView = (TextView) view.findViewById(R.id.edit_text);
            textView.setText(iVar2.d);
            textView.setOnClickListener(new b.b.a.a.f.n0.l(this, iVar2, i));
            View findViewById = view.findViewById(R.id.reorder_mark);
            f fVar = SelectorSettingsActivity.this.v;
            if (fVar != null) {
                findViewById.setOnTouchListener(new e(fVar, view, i));
                return;
            }
            throw null;
        }

        public void b() {
            this.f1584b = SelectorSettingsActivity.this.u.f747a.f1137b;
            notifyDataSetChanged();
            notifyDataSetChanged();
        }
    }

    @Override // b.b.a.a.f.n0.n, b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        super.a(bundle);
        l a2 = this.q.a(r.a(getIntent().getIntExtra("com.onkyo.jp.onkyoremote.extra.zoneIndex", r.MAIN.f836b)));
        this.t = a2;
        this.u = a2.e;
        this.w = new b();
        this.v = new f(this, this.s, new a());
        this.s.setAdapter((ListAdapter) this.w);
    }

    @Override // a.h.a.d, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        i a2;
        if (i2 == -1 && (a2 = this.u.a(h.a(i))) != null) {
            a2.a(g.a(intent.getStringExtra("com.onkyo.jp.onkyoremote.extra.selectedIconId")));
            this.w.notifyDataSetChanged();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // b.b.a.a.f.n0.m, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_selector_settings, menu);
        return true;
    }

    @Override // b.b.a.a.f.n0.m, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.action_reset) {
            j jVar = this.u;
            d<i> dVar = jVar.f747a;
            if (dVar != null) {
                dVar.f1137b = new ArrayList<>(dVar.f1136a);
                dVar.f1138c = new ArrayList<>(dVar.f1136a);
                Iterator<i> it = jVar.f747a.f1137b.iterator();
                while (it.hasNext()) {
                    i next = it.next();
                    next.a((g) null);
                    next.a((String) null);
                }
                this.w.b();
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

    public static /* synthetic */ void a(SelectorSettingsActivity selectorSettingsActivity, i iVar) {
        if (selectorSettingsActivity != null) {
            Intent intent = new Intent(selectorSettingsActivity, (Class<?>) IconSelectActivity.class);
            intent.putExtra("com.onkyo.jp.onkyoremote.extra.currentIconId", iVar.f818c.f812a);
            selectorSettingsActivity.startActivityForResult(intent, iVar.f817b.f815b);
            return;
        }
        throw null;
    }
}
