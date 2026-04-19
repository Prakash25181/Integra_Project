package com.onkyo.jp.onkyoremote.view.widget;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/* loaded from: classes.dex */
public class GlowButton extends Button {

    /* renamed from: b, reason: collision with root package name */
    public LayerDrawable f1763b;

    /* renamed from: c, reason: collision with root package name */
    public TransitionDrawable f1764c;

    public GlowButton(Context context) {
        super(context);
    }

    public final void a(AttributeSet attributeSet) {
        int attributeResourceValue = attributeSet.getAttributeResourceValue(null, "glow_drawable", -1);
        if (attributeResourceValue != -1) {
            setGlowDrawable(getResources().getDrawable(attributeResourceValue));
        }
    }

    public Drawable getGlowDrawable() {
        return this.f1764c;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        TransitionDrawable transitionDrawable;
        int action = motionEvent.getAction();
        if (action == 0) {
            TransitionDrawable transitionDrawable2 = this.f1764c;
            if (transitionDrawable2 != null) {
                transitionDrawable2.startTransition(0);
            }
        } else if ((action == 1 || action == 3 || action == 4) && (transitionDrawable = this.f1764c) != null) {
            transitionDrawable.reverseTransition(300);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        a(this.f1764c, drawable);
    }

    public void setGlowDrawable(Drawable drawable) {
        TransitionDrawable transitionDrawable;
        if (drawable instanceof BitmapDrawable) {
            transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(0), drawable});
        } else {
            transitionDrawable = (TransitionDrawable) drawable;
        }
        a(transitionDrawable, getBackground());
    }

    public GlowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public final void a(TransitionDrawable transitionDrawable, Drawable drawable) {
        if (drawable == this.f1764c) {
            drawable = null;
        }
        if (transitionDrawable != null && drawable != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, transitionDrawable});
            this.f1763b = layerDrawable;
            super.setBackgroundDrawable(layerDrawable);
        } else {
            this.f1763b = null;
            if (transitionDrawable != null) {
                super.setBackgroundDrawable(transitionDrawable);
            } else if (drawable != null) {
                super.setBackgroundDrawable(drawable);
            } else {
                super.setBackgroundDrawable(null);
            }
        }
        this.f1764c = transitionDrawable;
        refreshDrawableState();
    }

    public GlowButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }
}
