package b.b.a.a.f.o0;

import android.content.SharedPreferences;
import b.b.a.a.d.a;
import b.b.a.a.f.b0;
import b.b.a.a.f.c0;
import b.b.a.a.f.o0.g;
import com.onkyo.jp.onkyoremote.view.widget.TipsFrame;

/* compiled from: TipsView.java */
/* loaded from: classes.dex */
public class f implements TipsFrame.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f1604a;

    public f(g gVar) {
        this.f1604a = gVar;
    }

    @Override // com.onkyo.jp.onkyoremote.view.widget.TipsFrame.c
    public void a(TipsFrame tipsFrame, boolean z) {
        g gVar = this.f1604a;
        g.a aVar = gVar.d;
        if (aVar != null) {
            b0 b0Var = (b0) aVar;
            b0Var.f1153a.f.removeView(gVar.f1606b);
            c0 c0Var = b0Var.f1153a;
            if (c0Var.d == gVar) {
                c0Var.d = null;
            }
            if (z) {
                b.b.a.a.d.a a2 = b.b.a.a.d.a.a();
                a.c cVar = gVar.e;
                if (a2 != null) {
                    if (cVar != null) {
                        SharedPreferences.Editor edit = a2.f1118a.getSharedPreferences("onkyo_remote_settings", 0).edit();
                        edit.putBoolean(cVar.f1122a, false);
                        edit.commit();
                    }
                    b0Var.f1153a.f1173c.remove(gVar.e);
                    b0Var.f1153a.f1172b.remove(gVar.e);
                    b0Var.f1153a.a();
                    return;
                }
                throw null;
            }
        }
    }
}
