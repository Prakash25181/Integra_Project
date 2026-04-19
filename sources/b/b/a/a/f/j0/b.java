package b.b.a.a.f.j0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b.b.a.a.b.l;
import com.onkyo.integraRemote4A.R;
import com.onkyo.jp.onkyoremote.view.widget.StepSlideBar;

/* compiled from: BassToneControlView.java */
/* loaded from: classes.dex */
public class b extends b.b.a.a.f.j0.a {
    public l d;
    public b.b.a.a.b.o.l e;
    public StepSlideBar f;

    /* compiled from: BassToneControlView.java */
    /* loaded from: classes.dex */
    public class a implements StepSlideBar.a {
        public a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void a(int i) {
            b bVar = b.this;
            bVar.d.a(bVar.e.f, l.b.BASS, i);
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.a
        public void b() {
        }
    }

    /* compiled from: BassToneControlView.java */
    /* renamed from: b.b.a.a.f.j0.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0040b implements StepSlideBar.c {
        public C0040b() {
        }

        @Override // com.onkyo.jp.onkyoremote.view.widget.StepSlideBar.c
        public String a(int i) {
            b bVar = b.this;
            return bVar.a(i, bVar.e.d);
        }
    }

    public b(Context context, l lVar, b.b.a.a.b.o.l lVar2) {
        super(context);
        this.d = lVar;
        this.e = lVar2;
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2 = a(R.layout.layout_control_tone_bass);
        ((TextView) a2.findViewById(R.id.title_label)).setText(this.e.f821a);
        StepSlideBar stepSlideBar = (StepSlideBar) a2.findViewById(R.id.bass_seekbar);
        this.f = stepSlideBar;
        b.b.a.a.b.o.l lVar = this.e;
        stepSlideBar.a(lVar.f822b, lVar.f823c, lVar.d);
        this.f.setDelegate(new a());
        this.f.setValueIndicator(new C0040b());
        f();
        return a2;
    }

    @Override // b.b.a.a.f.j0.a
    public void f() {
        this.f.setValue(this.d.a(this.e.f, l.b.BASS));
    }
}
