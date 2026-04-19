package a.b.p;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: AppCompatToggleButton.java */
/* loaded from: classes.dex */
public class b0 extends ToggleButton {

    /* renamed from: b, reason: collision with root package name */
    public final y f165b;

    public b0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        y yVar = new y(this);
        this.f165b = yVar;
        yVar.a(attributeSet, R.attr.buttonStyleToggle);
    }
}
