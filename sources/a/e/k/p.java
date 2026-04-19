package a.e.k;

import a.e.k.n;
import android.view.View;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class p extends n.b<CharSequence> {
    public p(int i, Class cls, int i2, int i3) {
        super(i, cls, i2, i3);
    }

    @Override // a.e.k.n.b
    public CharSequence a(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
