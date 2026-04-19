package b.b.a.a.f.k0.u;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbNonControllablePage.java */
/* loaded from: classes.dex */
public class i extends n {
    public TextView e;
    public String f;

    public i(Context context) {
        super(context);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_non_controllable);
        TextView textView = (TextView) a2.findViewById(R.id.message_label);
        this.e = textView;
        String str = this.f;
        if (str != null) {
            textView.setText(str);
        }
        this.d = a2;
        return a2;
    }
}
