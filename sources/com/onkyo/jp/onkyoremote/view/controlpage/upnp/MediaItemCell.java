package com.onkyo.jp.onkyoremote.view.controlpage.upnp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.c.d;
import b.b.a.a.f.k0.v.k;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public class MediaItemCell extends LinearLayout implements b.b.a.a.c.c {

    /* renamed from: b, reason: collision with root package name */
    public k f1708b;

    /* renamed from: c, reason: collision with root package name */
    public int f1709c;
    public d.n d;
    public View.OnClickListener e;
    public View.OnLongClickListener f;
    public View.OnTouchListener g;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MediaItemCell.this.f1708b.g()) {
                MediaItemCell mediaItemCell = MediaItemCell.this;
                mediaItemCell.f1708b.b(mediaItemCell.f1709c);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            MediaItemCell mediaItemCell = MediaItemCell.this;
            mediaItemCell.f1708b.a(mediaItemCell, mediaItemCell.d.a());
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return MediaItemCell.this.f1708b.a(motionEvent);
        }
    }

    public MediaItemCell(Context context) {
        super(context);
        this.e = new a();
        this.f = new b();
        this.g = new c();
    }

    public void a(k kVar, int i, d.n nVar) {
        d.n nVar2 = this.d;
        if (nVar2 != null) {
            nVar2.b(this);
        }
        this.f1708b = kVar;
        this.f1709c = i;
        this.d = nVar;
        TextView textView = (TextView) findViewById(R.id.title_label);
        this.d.a(this);
        textView.setText(this.d.a());
        setOnClickListener(this.e);
        setOnLongClickListener(this.f);
        setOnTouchListener(this.g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        d.n nVar = this.d;
        if (nVar != null) {
            nVar.b(this);
        }
        super.onDetachedFromWindow();
    }

    public MediaItemCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new a();
        this.f = new b();
        this.g = new c();
    }

    public MediaItemCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new a();
        this.f = new b();
        this.g = new c();
    }

    @Override // b.b.a.a.c.c
    public void a(Drawable drawable) {
        ((ImageView) findViewById(R.id.content_icon)).setImageDrawable(drawable);
    }
}
