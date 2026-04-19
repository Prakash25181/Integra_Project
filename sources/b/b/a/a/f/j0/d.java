package b.b.a.a.f.j0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b.b.a.a.b.l;
import b.b.a.a.b.o.j;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: SpLevelControlView.java */
/* loaded from: classes.dex */
public class d extends b.b.a.a.f.j0.a {
    public l d;
    public j e;
    public StepSlideBar f;

    /* compiled from: SpLevelControlView.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            b.b.a.a.b.p.v.a aVar;
            d dVar = d.this;
            l lVar = dVar.d;
            j.a aVar2 = dVar.e.f;
            j jVar = lVar.g.get(aVar2.f819b);
            if (jVar == null || (lVar.q.G & aVar2.f820c) == 0 || (aVar = lVar.f756c.j[aVar2.f819b]) == b.b.a.a.b.p.v.a.nul) {
                return;
            }
            int i2 = jVar.f823c;
            if (i >= i2) {
                i = i2;
            }
            int i3 = jVar.f822b;
            if (i < i3) {
                i = i3;
            }
            lVar.f754a.a(aVar, aVar, b.b.a.a.b.p.v.d.b(i, lVar.d.f801c >= 2016 ? 2 : 1));
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    /* compiled from: SpLevelControlView.java */
    /* loaded from: classes.dex */
    public class b implements StepSlideBar.c {
        public b() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.c
        public String a(int i) {
            d dVar = d.this;
            return dVar.a(i, dVar.e.d);
        }
    }

    public d(Context context, l lVar, j jVar) {
        super(context);
        this.d = lVar;
        this.e = jVar;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_control_sp_level);
        ((TextView) a2.findViewById(R.id.title_label)).setText(this.e.f821a);
        StepSlideBar stepSlideBar = (StepSlideBar) a2.findViewById(R.id.sp_level_seekbar);
        this.f = stepSlideBar;
        j jVar = this.e;
        stepSlideBar.a(jVar.f822b, jVar.f823c, jVar.d);
        this.f.setDelegate(new a());
        this.f.setValueIndicator(new b());
        f();
        return a2;
    }

    @Override // b.b.a.a.f.j0.a
    public void f() {
        StepSlideBar stepSlideBar = this.f;
        l lVar = this.d;
        j.a aVar = this.e.f;
        stepSlideBar.setValue((lVar.q.G & aVar.f820c) != 0 ? lVar.n.get(aVar.f819b).intValue() : 0);
    }
}
