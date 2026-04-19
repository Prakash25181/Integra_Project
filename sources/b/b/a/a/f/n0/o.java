package b.b.a.a.f.n0;

import android.view.View;
import android.widget.TextView;
import com.onkyo.integraRemote4A.R;

/* compiled from: SettingsUtil.java */
/* loaded from: classes.dex */
public class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public String f1586a;

    public o() {
        this.f1586a = null;
    }

    @Override // b.b.a.a.f.n0.q
    public void a(int i, View view) {
        TextView textView = (TextView) view.findViewById(R.id.title_label);
        String str = this.f1586a;
        if (str != null && str.length() > 0) {
            textView.setVisibility(0);
            textView.setText(this.f1586a);
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // b.b.a.a.f.n0.q
    public boolean a() {
        return false;
    }

    @Override // b.b.a.a.f.n0.q
    public int b() {
        return R.layout.layout_settings_list_header;
    }

    public o(String str) {
        this.f1586a = str;
    }
}
