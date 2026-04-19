package b.b.a.a.f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import b.b.a.a.d.a;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.TipsFrame;
import java.util.HashSet;
import java.util.Hashtable;

/* compiled from: Tips.java */
/* loaded from: classes.dex */
public class c0 {
    public static final Object g = new Object();
    public static c0 h = new c0();

    /* renamed from: a, reason: collision with root package name */
    public int f1171a;

    /* renamed from: b, reason: collision with root package name */
    public Hashtable<a.c, View> f1172b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet<a.c> f1173c;
    public b.b.a.a.f.o0.g d;
    public Context e;
    public FrameLayout f;

    public void a(a.c cVar, View view) {
        this.f1172b.put(cVar, view);
        a();
    }

    public void b() {
        synchronized (g) {
            if (this.f1171a > 0) {
                this.f1171a--;
                a();
            }
        }
    }

    public void a(a.c cVar, boolean z) {
        if (z) {
            if (b.b.a.a.d.a.a().a(cVar)) {
                this.f1173c.add(cVar);
                a();
                return;
            }
            return;
        }
        b.b.a.a.f.o0.g gVar = this.d;
        if (gVar != null && gVar.e == cVar) {
            gVar.a(false);
        }
        this.f1173c.remove(cVar);
    }

    public void a() {
        if (this.f1171a == 0 && !this.f1173c.isEmpty() && this.d == null) {
            for (a.c cVar : a.c.g) {
                if (this.f1173c.contains(cVar) && this.f1172b.containsKey(cVar)) {
                    View view = this.f1172b.get(cVar);
                    if (view.getParent() != null) {
                        boolean z = false;
                        if (b.b.a.a.d.a.a().a(cVar)) {
                            b.b.a.a.f.o0.g gVar = new b.b.a.a.f.o0.g(this.e);
                            this.d = gVar;
                            gVar.e = cVar;
                            String string = gVar.f1605a.getResources().getString(cVar.f1123b);
                            String string2 = gVar.f1605a.getResources().getString(cVar.f1124c);
                            FrameLayout frameLayout = (FrameLayout) ((LayoutInflater) gVar.f1605a.getSystemService("layout_inflater")).inflate(R.layout.layout_popup_tips, (ViewGroup) null);
                            gVar.f1606b = frameLayout;
                            TipsFrame tipsFrame = (TipsFrame) frameLayout.findViewById(R.id.tips_frame);
                            gVar.f1607c = tipsFrame;
                            tipsFrame.setOnClickListener(new b.b.a.a.f.o0.e(gVar));
                            gVar.f1607c.setDelegate(new b.b.a.a.f.o0.f(gVar));
                            TextView textView = (TextView) gVar.f1606b.findViewById(R.id.title_label);
                            if (textView != null) {
                                if (string != null && string.length() > 0) {
                                    textView.setVisibility(0);
                                    textView.setText(string);
                                } else {
                                    textView.setVisibility(8);
                                }
                            }
                            TextView textView2 = (TextView) gVar.f1606b.findViewById(R.id.message_label);
                            if (textView2 != null) {
                                if (string2 != null && string2.length() > 0) {
                                    textView2.setVisibility(0);
                                    textView2.setText(string2);
                                } else {
                                    textView2.setVisibility(8);
                                }
                            }
                            gVar.f1607c.a(gVar.f1606b, view);
                            this.d.d = new b0(this);
                            this.f.addView(this.d.f1606b, new FrameLayout.LayoutParams(-1, -1));
                            z = true;
                        }
                        if (z) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
    }
}
