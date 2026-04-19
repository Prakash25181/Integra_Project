package com.onkyo.jp.onkyoremote.view.controlpage.upnp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import b.b.a.a.f.k0.v.k;

/* loaded from: classes.dex */
public class NonSelectableCell extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public k f1713b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnClickListener f1714c;
    public View.OnTouchListener d;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a(NonSelectableCell nonSelectableCell) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnTouchListener {
        public b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return NonSelectableCell.this.f1713b.a(motionEvent);
        }
    }

    public NonSelectableCell(Context context) {
        super(context);
        this.f1714c = new a(this);
        this.d = new b();
    }

    public NonSelectableCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1714c = new a(this);
        this.d = new b();
    }

    public NonSelectableCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1714c = new a(this);
        this.d = new b();
    }
}
