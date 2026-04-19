package com.onkyo.jp.onkyoremote.view.settings;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import b.b.a.a.f.n0.d;
import b.b.a.a.f.n0.m;
import b.b.a.a.f.n0.o;
import b.b.a.a.f.n0.p;
import b.b.a.a.f.n0.q;
import com.onkyo.integraRemote4A.R;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AppSettingsActivity extends m {
    public ListView r;
    public AlertDialog s;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.b.a.a.d.a f1736a;

        public a(AppSettingsActivity appSettingsActivity, b.b.a.a.d.a aVar) {
            this.f1736a = aVar;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            b.b.a.a.d.a aVar = this.f1736a;
            if (aVar == null) {
                throw null;
            }
            aVar.a(b.b.a.a.d.a.f1116b.e, z);
        }
    }

    /* loaded from: classes.dex */
    public class b implements q {

        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AppSettingsActivity.a(AppSettingsActivity.this);
            }
        }

        public b() {
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
            ((Button) view.findViewById(R.id.app_reset_button)).setOnClickListener(new a());
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return false;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_app_reset_cell;
        }
    }

    /* loaded from: classes.dex */
    public class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public String f1739a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1740b;

        /* renamed from: c, reason: collision with root package name */
        public CompoundButton.OnCheckedChangeListener f1741c;

        public c(AppSettingsActivity appSettingsActivity, String str, boolean z, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            this.f1739a = str;
            this.f1740b = z;
            this.f1741c = onCheckedChangeListener;
        }

        @Override // b.b.a.a.f.n0.q
        public void a(int i, View view) {
            TextView textView = (TextView) view.findViewById(R.id.title_label);
            Switch r3 = (Switch) view.findViewById(R.id.setting_switch);
            textView.setText(this.f1739a);
            r3.setChecked(this.f1740b);
            r3.setOnCheckedChangeListener(this.f1741c);
        }

        @Override // b.b.a.a.f.n0.q
        public boolean a() {
            return false;
        }

        @Override // b.b.a.a.f.n0.q
        public int b() {
            return R.layout.layout_settings_switch_cell;
        }
    }

    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_app_settings);
        b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
        ListView listView = (ListView) findViewById(R.id.settings_list);
        this.r = listView;
        q[] qVarArr = new q[4];
        qVarArr[0] = new o();
        String string = getString(R.string.stg_autoConnect);
        if (a2 != null) {
            qVarArr[1] = new c(this, string, a2.a(b.b.a.a.d.a.f1116b.e), new a(this, a2));
            qVarArr[2] = new o();
            qVarArr[3] = new b();
            listView.setAdapter((ListAdapter) new p(this, new ArrayList(Arrays.asList(qVarArr))));
            return;
        }
        throw null;
    }

    @Override // b.b.a.a.f.n0.m, a.h.a.d, android.app.Activity
    public void onPause() {
        super.onPause();
        AlertDialog alertDialog = this.s;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.s = null;
        }
    }

    public static /* synthetic */ void a(AppSettingsActivity appSettingsActivity) {
        if (appSettingsActivity != null) {
            appSettingsActivity.s = new AlertDialog.Builder(appSettingsActivity).setTitle(appSettingsActivity.getString(R.string.appResetTitle)).setMessage(appSettingsActivity.getString(R.string.appResetMessage)).setCancelable(true).setPositiveButton(appSettingsActivity.getString(R.string.reset), new d(appSettingsActivity)).setNegativeButton(appSettingsActivity.getString(R.string.cancel), new b.b.a.a.f.n0.c(appSettingsActivity)).setOnCancelListener(new b.b.a.a.f.n0.b(appSettingsActivity)).show();
            return;
        }
        throw null;
    }
}
