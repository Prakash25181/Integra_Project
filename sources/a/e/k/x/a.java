package a.e.k.x;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b, reason: collision with root package name */
    public final int f458b;

    /* renamed from: c, reason: collision with root package name */
    public final b f459c;
    public final int d;

    public a(int i, b bVar, int i2) {
        this.f458b = i;
        this.f459c = bVar;
        this.d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f458b);
        b bVar = this.f459c;
        int i = this.d;
        if (bVar != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                bVar.f460a.performAction(i, bundle);
                return;
            }
            return;
        }
        throw null;
    }
}
