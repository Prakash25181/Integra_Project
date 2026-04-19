package b.b.a.a.f.j0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b.b.a.a.b.l;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: TrebleBassToneControlView.java */
/* loaded from: classes.dex */
public class e extends b.b.a.a.f.j0.a {
    public l d;
    public b.b.a.a.b.o.l e;
    public StepSlideBar f;
    public StepSlideBar g;

    /* compiled from: TrebleBassToneControlView.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            e eVar = e.this;
            eVar.d.a(eVar.e.f, l.b.TREBLE, i);
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    /* compiled from: TrebleBassToneControlView.java */
    /* loaded from: classes.dex */
    public class b implements StepSlideBar.c {
        public b() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.c
        public String a(int i) {
            e eVar = e.this;
            return eVar.a(i, eVar.e.d);
        }
    }

    /* compiled from: TrebleBassToneControlView.java */
    /* loaded from: classes.dex */
    public class c implements StepSlideBar.a {
        public c() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            e eVar = e.this;
            eVar.d.a(eVar.e.f, l.b.BASS, i);
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    /* compiled from: TrebleBassToneControlView.java */
    /* loaded from: classes.dex */
    public class d implements StepSlideBar.c {
        public d() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.c
        public String a(int i) {
            e eVar = e.this;
            return eVar.a(i, eVar.e.d);
        }
    }

    public e(Context context, l lVar, b.b.a.a.b.o.l lVar2) {
        super(context);
        this.d = lVar;
        this.e = lVar2;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_control_tone_treble_bass);
        ((TextView) a2.findViewById(R.id.title_label)).setText(this.e.f821a);
        StepSlideBar stepSlideBar = (StepSlideBar) a2.findViewById(R.id.treble_seekbar);
        this.f = stepSlideBar;
        b.b.a.a.b.o.l lVar = this.e;
        stepSlideBar.a(lVar.f822b, lVar.f823c, lVar.d);
        this.f.setDelegate(new a());
        this.f.setValueIndicator(new b());
        StepSlideBar stepSlideBar2 = (StepSlideBar) a2.findViewById(R.id.bass_seekbar);
        this.g = stepSlideBar2;
        b.b.a.a.b.o.l lVar2 = this.e;
        stepSlideBar2.a(lVar2.f822b, lVar2.f823c, lVar2.d);
        this.g.setDelegate(new c());
        this.g.setValueIndicator(new d());
        f();
        return a2;
    }

    @Override // b.b.a.a.f.j0.a
    public void f() {
        this.f.setValue(this.d.a(this.e.f, l.b.TREBLE));
        this.g.setValue(this.d.a(this.e.f, l.b.BASS));
    }
}
