package b.b.a.a.f.m0;

import com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView;

/* compiled from: TvRemoteControllerView.java */
/* loaded from: classes.dex */
public class c2 implements SwipeCursorView.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l2 f1422a;

    public c2(l2 l2Var) {
        this.f1422a = l2Var;
    }

    @Override // com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView.c
    public void a(int i) {
        if (i == 1) {
            b.b.a.a.b.m.f fVar = this.f1422a.j;
            fVar.f772a.a(fVar.f773b, "ENTER");
            return;
        }
        if (i == 2) {
            b.b.a.a.b.m.f fVar2 = this.f1422a.j;
            fVar2.f772a.a(fVar2.f773b, "UP");
            return;
        }
        if (i == 3) {
            b.b.a.a.b.m.f fVar3 = this.f1422a.j;
            fVar3.f772a.a(fVar3.f773b, "DOWN");
        } else if (i == 4) {
            b.b.a.a.b.m.f fVar4 = this.f1422a.j;
            fVar4.f772a.a(fVar4.f773b, "LEFT");
        } else {
            if (i != 5) {
                return;
            }
            b.b.a.a.b.m.f fVar5 = this.f1422a.j;
            fVar5.f772a.a(fVar5.f773b, "RIGHT");
        }
    }
}
