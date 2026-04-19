package com.onkyo.jp.onkyoremote.view.controlpage.upnp;

import a.b.k.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.c.d;
import b.b.a.a.f.c;
import b.b.a.a.f.i0;
import com.onkyo.integraRemote4A.R;

/* loaded from: classes.dex */
public final class UpnpAlbumCell extends LinearLayout implements b.b.a.a.c.c {

    /* renamed from: b, reason: collision with root package name */
    public b.b.a.a.f.k0.v.d f1716b;

    /* renamed from: c, reason: collision with root package name */
    public d.m f1717c;
    public int d;
    public d.c e;
    public d f;
    public View.OnClickListener g;
    public View.OnLongClickListener h;
    public View.OnTouchListener i;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UpnpAlbumCell.this.f1716b.g()) {
                UpnpAlbumCell upnpAlbumCell = UpnpAlbumCell.this;
                if (upnpAlbumCell.f1716b.a(Integer.valueOf(upnpAlbumCell.e.f1102a))) {
                    UpnpAlbumCell.this.a(true);
                    return;
                }
                UpnpAlbumCell upnpAlbumCell2 = UpnpAlbumCell.this;
                d dVar = upnpAlbumCell2.f;
                if (dVar != null) {
                    d.a(dVar, true, new b.b.a.a.f.k0.v.a(upnpAlbumCell2));
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnLongClickListener {
        public b() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            String str;
            UpnpAlbumCell upnpAlbumCell = UpnpAlbumCell.this;
            d.c cVar = upnpAlbumCell.e;
            if (cVar == null) {
                return false;
            }
            if (upnpAlbumCell.f1716b.u) {
                str = UpnpAlbumCell.this.e.f1103b + "\n" + UpnpAlbumCell.this.e.e;
            } else {
                str = cVar.f1103b;
            }
            UpnpAlbumCell.this.f1716b.a(view, str);
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {
        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return UpnpAlbumCell.this.f1716b.a(motionEvent);
        }
    }

    public UpnpAlbumCell(Context context) {
        super(context);
        this.g = new a();
        this.h = new b();
        this.i = new c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        b.b.a.a.c.a aVar;
        a();
        d.c cVar = this.e;
        if (cVar != null && (aVar = cVar.f1104c) != null) {
            aVar.b(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // b.b.a.a.c.c
    public void a(Drawable drawable) {
        ((ImageView) findViewById(R.id.content_icon)).setImageDrawable(drawable);
    }

    /* loaded from: classes.dex */
    public final class d extends LinearLayout implements d.h {

        /* renamed from: b, reason: collision with root package name */
        public d.m f1721b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1722c;
        public boolean d;
        public View.OnClickListener e;
        public View.OnLongClickListener f;
        public View.OnTouchListener g;

        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (UpnpAlbumCell.this.f1716b.g()) {
                    d dVar = d.this;
                    UpnpAlbumCell upnpAlbumCell = UpnpAlbumCell.this;
                    upnpAlbumCell.f1716b.a(dVar.f1721b, upnpAlbumCell.d, ((Integer) view.getTag()).intValue());
                }
            }
        }

        /* loaded from: classes.dex */
        public class b implements View.OnLongClickListener {
            public b() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                UpnpAlbumCell.this.f1716b.a(view, d.this.f1721b.c(((Integer) view.getTag()).intValue()).a());
                return false;
            }
        }

        /* loaded from: classes.dex */
        public class c implements View.OnTouchListener {
            public c() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return UpnpAlbumCell.this.f1716b.a(motionEvent);
            }
        }

        public d(Context context, d.m mVar, boolean z) {
            super(context);
            this.e = new a();
            this.f = new b();
            this.g = new c();
            this.f1721b = mVar;
            this.f1722c = true;
            this.d = z;
            setOrientation(1);
        }

        public static /* synthetic */ void a(d dVar, boolean z, c.g gVar) {
            if (dVar == null) {
                throw null;
            }
            if (z) {
                b.b.a.a.f.c.c(dVar, (-dVar.getHeight()) / 2, null);
                b.b.a.a.f.c.b((View) dVar, 0.0f, (c.g) new b.b.a.a.f.k0.v.b(dVar, gVar));
            } else {
                gVar.a(true);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            d.m mVar = this.f1721b;
            mVar.f1101c = this;
            mVar.a(true);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.f1721b.c();
            d.m mVar = this.f1721b;
            if (mVar.f1101c != null) {
                mVar.f1101c = this;
            }
        }

        @Override // b.b.a.a.c.d.h
        public void a(d.m mVar) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService("layout_inflater");
            int b2 = this.f1721b.b();
            removeAllViews();
            for (int i = 0; i < b2; i++) {
                View inflate = layoutInflater.inflate(R.layout.layout_upnp_album_song_cell, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.title_label);
                TextView textView2 = (TextView) inflate.findViewById(R.id.dur_label);
                d.g gVar = (d.g) this.f1721b.c(i);
                int i2 = gVar.f;
                if (i2 > 0) {
                    textView.setText(String.format("%d.%s", Integer.valueOf(i2), gVar.f1094b));
                } else {
                    textView.setText(gVar.f1094b);
                }
                textView2.setText(gVar.a(gVar.g));
                inflate.setTag(Integer.valueOf(i));
                inflate.setOnClickListener(this.e);
                inflate.setOnLongClickListener(this.f);
                inflate.setOnTouchListener(this.g);
                addView(inflate, new LinearLayout.LayoutParams(-1, -2));
            }
            if (this.f1722c) {
                this.f1722c = false;
                if (this.d) {
                    r.a((View) this, (i0) new b.b.a.a.f.k0.v.c(this));
                }
            }
        }
    }

    public final void a(boolean z) {
        d dVar = new d(getContext(), this.f1717c.a(this.d), z);
        this.f = dVar;
        addView(dVar, new LinearLayout.LayoutParams(-1, -2));
    }

    public UpnpAlbumCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new a();
        this.h = new b();
        this.i = new c();
    }

    public final void a() {
        d dVar = this.f;
        if (dVar != null) {
            removeView(dVar);
            this.f = null;
        }
    }

    public UpnpAlbumCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new a();
        this.h = new b();
        this.i = new c();
    }
}
