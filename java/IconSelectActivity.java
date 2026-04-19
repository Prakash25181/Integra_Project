package com.onkyo.jp.onkyoremote.view.settings;

import a.b.k.r;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import b.b.a.a.b.o.g;
import b.b.a.a.f.i0;
import b.b.a.a.f.n0.m;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class IconSelectActivity extends m {
    public b r;
    public GridView s;
    public String t;

    /* loaded from: classes.dex */
    public class a implements i0 {

        /* renamed from: com.onkyo.jp.onkyoremote.view.settings.IconSelectActivity$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0062a implements AdapterView.OnItemClickListener {
            public C0062a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                g gVar = IconSelectActivity.this.r.f1745c[i];
                Intent intent = new Intent();
                intent.putExtra("com.onkyo.jp.onkyoremote.extra.selectedIconId", gVar.f812a);
                IconSelectActivity.this.setResult(-1, intent);
                IconSelectActivity.this.onBackPressed();
            }
        }

        public a() {
        }

        @Override // b.b.a.a.f.i0
        public void a() {
            GridView gridView = IconSelectActivity.this.s;
            gridView.setNumColumns(gridView.getWidth() / IconSelectActivity.a(IconSelectActivity.this, 70));
            IconSelectActivity iconSelectActivity = IconSelectActivity.this;
            iconSelectActivity.s.setAdapter((ListAdapter) iconSelectActivity.r);
            IconSelectActivity.this.s.setOnItemClickListener(new C0062a());
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        public LayoutInflater f1744b;

        /* renamed from: c, reason: collision with root package name */
        public g[] f1745c = g.e;

        public b(Context context) {
            this.f1744b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f1745c.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f1745c[i];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            g gVar = this.f1745c[i];
            if (view == null) {
                view = this.f1744b.inflate(R.layout.layout_icon_select_cell, (ViewGroup) null);
            }
            ((ImageView) view.findViewById(R.id.icon_image)).setImageDrawable(gVar.f813b);
            view.setMinimumWidth(IconSelectActivity.a(IconSelectActivity.this, 70));
            view.setMinimumHeight(IconSelectActivity.a(IconSelectActivity.this, 70));
            view.setSelected(gVar.f812a.equals(IconSelectActivity.this.t));
            return view;
        }
    }

    @Override // b.b.a.a.f.n0.m
    public void a(Bundle bundle) {
        setContentView(R.layout.activity_settings_icon_select);
        this.s = (GridView) findViewById(R.id.gridView);
        this.r = new b(this);
        this.t = getIntent().getStringExtra("com.onkyo.jp.onkyoremote.extra.currentIconId");
        r.a((View) this.s, (i0) new a());
    }

    public static /* synthetic */ int a(IconSelectActivity iconSelectActivity, int i) {
        return (int) TypedValue.applyDimension(1, i, iconSelectActivity.getResources().getDisplayMetrics());
    }
}
