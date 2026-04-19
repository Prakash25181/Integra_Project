package com.onkyo.jp.onkyoremote.view.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.b.a.a.b.l;
import b.b.a.a.b.o.r;
import b.b.a.a.f.n0.n;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ZoneSelectActivity extends n {

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            l lVar = (l) ((b) ZoneSelectActivity.this.s.getAdapter()).f1584b.get(i);
            Intent intent = new Intent(ZoneSelectActivity.this, (Class<?>) SelectorSettingsActivity.class);
            intent.putExtra("com.onkyo.jp.onkyoremote.extra.zoneIndex", lVar.f755b.f839b.f836b);
            ZoneSelectActivity.this.startActivity(intent);
        }
    }

    /* loaded from: classes.dex */
    public class b extends n.a<l> {
        public b(ZoneSelectActivity zoneSelectActivity) {
            super();
            ArrayList<T> arrayList = new ArrayList<>();
            for (int i = 0; i < zoneSelectActivity.q.q(); i++) {
                arrayList.add(zoneSelectActivity.q.a(r.a(i)));
            }
            this.f1584b = arrayList;
            notifyDataSetChanged();
        }

        @Override // b.b.a.a.f.n0.n.a
        public int a() {
            return R.layout.layout_settings_link_cell;
        }

        @Override // b.b.a.a.f.n0.n.a
        public void a(int i, l lVar, View view) {
            ((TextView) view.findViewById(R.id.title_label)).setText(lVar.f755b.f840c);
        }
    }

    @Override // b.b.a.a.f.n0.n, b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.s.setAdapter((ListAdapter) new b(this));
        this.s.setOnItemClickListener(new a());
    }
}
