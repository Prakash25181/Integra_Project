package a.e.k;

import a.e.k.n;
import android.view.View;

/* compiled from: ViewCompat.java */
/* loaded from: classes.dex */
public final class o extends n.b<Boolean> {
    public o(int i, Class cls, int i2) {
        super(i, cls, i2);
    }

    @Override // a.e.k.n.b
    public Boolean a(View view) {
        return Boolean.valueOf(view.isScreenReaderFocusable());
    }
}
