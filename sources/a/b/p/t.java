package a.b.p;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/* compiled from: AppCompatSeekBar.java */
/* loaded from: classes.dex */
public class t extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final u f252b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(android.content.Context r2, android.util.AttributeSet r3) {
        /*
            r1 = this;
            int r0 = a.b.a.seekBarStyle
            r1.<init>(r2, r3, r0)
            a.b.p.u r2 = new a.b.p.u
            r2.<init>(r1)
            r1.f252b = r2
            r2.a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.b.p.t.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.f252b;
        Drawable drawable = uVar.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(uVar.d.getDrawableState())) {
            uVar.d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f252b.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f252b.a(canvas);
    }
}
