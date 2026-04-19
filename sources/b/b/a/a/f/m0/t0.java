package b.b.a.a.f.m0;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import b.b.a.a.b.q.e;
import com.onkyo.integraRemote4A.R;

/* compiled from: NcpPopupContent.java */
/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    public LayoutInflater f1532a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f1533b;

    /* renamed from: c, reason: collision with root package name */
    public Context f1534c;
    public b.b.a.a.b.q.m d;
    public a e;
    public EditText f;

    /* compiled from: NcpPopupContent.java */
    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    public t0(Context context, b.b.a.a.b.q.m mVar) {
        this.f1534c = context;
        this.d = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.widget.LinearLayout, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v1, types: [b.b.a.a.b.q.e] */
    /* JADX WARN: Type inference failed for: r14v3, types: [b.b.a.a.b.q.e] */
    public final void a(LinearLayout linearLayout, b.b.a.a.b.q.f fVar) {
        CompoundButton checkBox;
        for (b.b.a.a.b.q.j jVar = fVar.f932b; jVar != null; jVar = jVar.f933c) {
            if (!(jVar instanceof b.b.a.a.b.q.c) && !(jVar instanceof b.b.a.a.b.q.d) && !(jVar instanceof b.b.a.a.b.q.g) && !(jVar instanceof b.b.a.a.b.q.p)) {
                if (jVar instanceof b.b.a.a.b.q.j) {
                    LinearLayout a2 = a((ViewGroup) linearLayout, jVar);
                    b.b.a.a.b.q.j jVar2 = jVar;
                    for (b.b.a.a.b.q.e eVar = jVar2.f932b; eVar != null; eVar = eVar.f933c) {
                        if (eVar instanceof b.b.a.a.b.q.i) {
                            if (jVar2.g) {
                                checkBox = new RadioButton(this.f1534c);
                            } else {
                                checkBox = new CheckBox(this.f1534c);
                            }
                            checkBox.setTextColor(this.f1533b.getColor(R.color.ntc_listbox_text));
                            checkBox.setTextSize(16.0f);
                            b.b.a.a.b.q.i iVar = (b.b.a.a.b.q.i) eVar;
                            checkBox.setText(iVar.f);
                            checkBox.setChecked(iVar.h);
                            checkBox.setOnCheckedChangeListener(new r0(this, iVar));
                            iVar.e = new s0(this, checkBox);
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, a(48));
                            layoutParams.setMargins(a(12), 0, a(12), 0);
                            a2.addView(checkBox, -1, layoutParams);
                        }
                    }
                } else if (jVar instanceof b.b.a.a.b.q.b) {
                    b.b.a.a.b.q.b bVar = (b.b.a.a.b.q.b) jVar;
                    Button button = new Button(this.f1534c);
                    button.setBackgroundDrawable(this.f1533b.getDrawable(R.drawable.ntc_button_frame));
                    button.setTextColor(this.f1533b.getColorStateList(R.color.ntc_button_text));
                    button.setTextSize(18.0f);
                    button.setAllCaps(false);
                    button.setGravity(a(bVar.f) | 16);
                    button.setText(bVar.e);
                    button.setMinHeight(a(48));
                    button.setOnClickListener(new o0(this, bVar));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(a(12), a(6), a(12), a(6));
                    linearLayout.addView(button, -1, layoutParams2);
                } else if (jVar instanceof b.b.a.a.b.q.h) {
                    b.b.a.a.b.q.h hVar = (b.b.a.a.b.q.h) jVar;
                    TextView textView = new TextView(this.f1534c);
                    textView.setTextColor(this.f1533b.getColor(R.color.ntc_line_text));
                    textView.setTextSize(16.0f);
                    textView.setText(hVar.e);
                    textView.setGravity(a(hVar.g));
                    linearLayout.addView(textView, -1, new LinearLayout.LayoutParams(-1, -2));
                } else if (jVar instanceof b.b.a.a.b.q.o) {
                    b.b.a.a.b.q.o oVar = (b.b.a.a.b.q.o) jVar;
                    LinearLayout linearLayout2 = (LinearLayout) this.f1532a.inflate(R.layout.layout_ncp_textbox, (ViewGroup) linearLayout, false);
                    TextView textView2 = (TextView) linearLayout2.findViewById(R.id.text_label);
                    EditText editText = (EditText) linearLayout2.findViewById(R.id.text_box);
                    a(textView2, oVar.e, oVar.g);
                    if (oVar.h == e.c.PASSWORD) {
                        editText.setInputType(129);
                    }
                    editText.setText(oVar.f);
                    editText.addTextChangedListener(new p0(this, oVar));
                    linearLayout.addView(linearLayout2);
                    a.b.k.r.a((View) editText, (b.b.a.a.f.i0) new q0(this, editText, oVar));
                    if (this.f == null) {
                        this.f = editText;
                    }
                } else if (!(jVar instanceof b.b.a.a.b.q.q)) {
                    boolean z = jVar instanceof b.b.a.a.b.q.r;
                }
            } else {
                b.b.a.a.b.q.j jVar3 = jVar;
                a(a((ViewGroup) linearLayout, jVar3), (b.b.a.a.b.q.f) jVar3);
            }
        }
    }

    public EditText a(LinearLayout linearLayout) {
        this.f1532a = (LayoutInflater) this.f1534c.getSystemService("layout_inflater");
        this.f1533b = this.f1534c.getResources();
        this.f = null;
        a(linearLayout, (b.b.a.a.b.q.f) this.d);
        this.f1532a = null;
        this.f1533b = null;
        EditText editText = this.f;
        this.f = null;
        return editText;
    }

    public final LinearLayout a(ViewGroup viewGroup, b.b.a.a.b.q.f fVar) {
        LinearLayout linearLayout = (LinearLayout) this.f1532a.inflate(R.layout.layout_popup_content_group, viewGroup, false);
        a((TextView) linearLayout.findViewById(R.id.title_label), fVar.e, fVar.f);
        viewGroup.addView(linearLayout);
        return linearLayout;
    }

    public void a(TextView textView) {
        b.b.a.a.b.q.m mVar = this.d;
        a(textView, mVar.e, mVar.f);
    }

    public final void a(TextView textView, String str, e.a aVar) {
        if (str != null && str.length() > 0) {
            textView.setVisibility(0);
            textView.setText(str);
            textView.setGravity(a(aVar));
            return;
        }
        textView.setVisibility(8);
    }

    public final int a(e.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? 3 : 5;
        }
        return 1;
    }

    public final int a(int i) {
        return (int) TypedValue.applyDimension(1, i, this.f1533b.getDisplayMetrics());
    }
}
