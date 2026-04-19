package com.onkyo.jp.onkyoremote.view.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.TextView;
import b.b.a.a.b.l;
import b.b.a.a.b.o.r;
import b.b.a.a.b.o.s;
import b.b.a.a.f.n0.n;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ZoneNameSettingsActivity extends n {

    /* loaded from: classes.dex */
    public class a extends n.a<l> {
        public a() {
            super();
            ArrayList<T> arrayList = new ArrayList<>();
            for (int i = 0; i < ZoneNameSettingsActivity.this.q.q(); i++) {
                arrayList.add(ZoneNameSettingsActivity.this.q.a(r.a(i)));
            }
            this.f1584b = arrayList;
            notifyDataSetChanged();
        }

        @Override // b.b.a.a.f.n0.n.a
        public int a() {
            return R.layout.layout_settings_zone_name;
        }

        @Override // b.b.a.a.f.n0.n.a
        public void a(int i, l lVar, View view) {
            String str;
            l lVar2 = lVar;
            TextView textView = (TextView) view.findViewById(R.id.title_label);
            s sVar = lVar2.f755b;
            s sVar2 = sVar.f838a;
            if (sVar2 != null) {
                str = sVar2.f840c;
            } else {
                str = sVar.f840c;
            }
            textView.setText(str);
            TextView textView2 = (TextView) view.findViewById(R.id.edit_text);
            textView2.setText(lVar2.f755b.f840c);
            textView2.setOnClickListener(new b.b.a.a.f.n0.s(this, lVar2, i));
        }
    }

    @Override // b.b.a.a.f.n0.n, b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        super.a(bundle);
        this.s.setAdapter((ListAdapter) new a());
    }

    @Override // b.b.a.a.f.n0.m, a.h.a.d, android.app.Activity
    public void onPause() {
        i();
        super.onPause();
    }

    public static /* synthetic */ void a(ZoneNameSettingsActivity zoneNameSettingsActivity, l lVar, int i) {
        String string = zoneNameSettingsActivity.getString(R.string.stg_zoneNameStg);
        s sVar = lVar.f755b;
        String str = sVar.f840c;
        s sVar2 = sVar.f838a;
        zoneNameSettingsActivity.a(string, str, sVar2 != null ? sVar2.f840c : str, new b.b.a.a.f.n0.r(zoneNameSettingsActivity, lVar, i));
    }
}
