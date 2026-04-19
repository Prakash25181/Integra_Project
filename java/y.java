package b.b.a.a.f.m0;

import com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView;

/* compiled from: BdDvdPlayerRemoteControllerView.java */
/* loaded from: classes.dex */
public class y implements SwipeCursorView.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f1552a;

    public y(i0 i0Var) {
        this.f1552a = i0Var;
    }

    @Override // com.onkyo.jp.onkyoremote.view.widget.SwipeCursorView.c
    public void a(int i) {
        if (i == 1) {
            b.b.a.a.b.m.a aVar = this.f1552a.i;
            aVar.f764a.a(aVar.f765b, "ENTER");
            return;
        }
        if (i == 2) {
            b.b.a.a.b.m.a aVar2 = this.f1552a.i;
            aVar2.f764a.a(aVar2.f765b, "UP");
            return;
        }
        if (i == 3) {
            b.b.a.a.b.m.a aVar3 = this.f1552a.i;
            aVar3.f764a.a(aVar3.f765b, "DOWN");
        } else if (i == 4) {
            b.b.a.a.b.m.a aVar4 = this.f1552a.i;
            aVar4.f764a.a(aVar4.f765b, "LEFT");
        } else {
            if (i != 5) {
                return;
            }
            b.b.a.a.b.m.a aVar5 = this.f1552a.i;
            aVar5.f764a.a(aVar5.f765b, "RIGHT");
        }
    }
}
