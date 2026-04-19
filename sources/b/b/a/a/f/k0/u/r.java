package b.b.a.a.f.k0.u;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.a.a.b.r.y;
import com.onkyo.integraRemote4A.R;

/* compiled from: NetUsbPopupPage.java */
/* loaded from: classes.dex */
public class r extends n implements y.b {
    public TextView e;
    public LinearLayout f;
    public Resources g;
    public b.b.a.a.b.r.l h;
    public y i;

    public r(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        b.b.a.a.b.r.l lVar = dVar.q;
        this.h = lVar;
        this.i = lVar.l();
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.i.j.a(this);
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_netusb_popup);
        this.e = (TextView) a2.findViewById(R.id.title_label);
        this.f = (LinearLayout) a2.findViewById(R.id.content_frame);
        this.g = this.f1597b.getResources();
        g();
        this.d = a2;
        return a2;
    }

    public final void g() {
        this.e.setText(this.i.f1031c);
        this.f.removeAllViews();
        y yVar = this.i;
        if (yVar.f1030b) {
            int i = 0;
            while (true) {
                y yVar2 = this.i;
                int i2 = yVar2.d;
                if (i >= i2) {
                    break;
                }
                y.a aVar = null;
                if (yVar2 != null) {
                    if (i >= 0 && i < i2) {
                        aVar = yVar2.f[i];
                    }
                    this.f.addView(a(aVar.f1032a, 3));
                    this.f.addView(a(aVar.f1033b, 5));
                    i++;
                } else {
                    throw null;
                }
            }
        } else {
            this.f.addView(a(yVar.e, 3));
        }
        int i3 = 0;
        while (i3 < this.i.g) {
            LinearLayout linearLayout = this.f;
            Button button = new Button(this.f1597b);
            button.setBackgroundDrawable(this.g.getDrawable(R.drawable.ntc_button_frame));
            button.setTextColor(this.g.getColorStateList(R.color.ntc_button_text));
            button.setTextSize(18.0f);
            button.setAllCaps(false);
            button.setGravity(17);
            button.setText(this.i.h[i3]);
            button.setOnClickListener(new q(this, i3));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = i3 == 0 ? b(12) : b(8);
            layoutParams.bottomMargin = b(0);
            layoutParams.leftMargin = b(8);
            layoutParams.rightMargin = b(8);
            button.setLayoutParams(layoutParams);
            linearLayout.addView(button);
            i3++;
        }
    }

    @Override // b.b.a.a.b.r.y.b
    public void a() {
        g();
    }

    public final TextView a(String str, int i) {
        TextView textView = new TextView(this.f1597b);
        textView.setText(str);
        textView.setTextSize(16.0f);
        textView.setTextColor(this.g.getColor(R.color.ntc_line_text));
        textView.setGravity(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = b(2);
        layoutParams.bottomMargin = b(2);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.i.j.b(this);
    }

    public final int b(int i) {
        return (int) TypedValue.applyDimension(1, i, this.g.getDisplayMetrics());
    }
}
