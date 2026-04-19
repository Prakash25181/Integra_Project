package b.b.a.a.f.j0;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import b.b.a.a.b.h;
import b.b.a.a.b.l;
import b.b.a.a.b.o.r;
import b.b.a.a.b.p.d;
import b.b.a.a.f.g0;
import com.onkyo.integraRemote4A.R;

/* compiled from: ListeningModeView.java */
/* loaded from: classes.dex */
public class c extends b.b.a.a.f.o0.b implements d.k {
    public b.b.a.a.b.p.d d;
    public h e;
    public g0 f;
    public int g;
    public TextView h;

    /* compiled from: ListeningModeView.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f1206b;

        public a(int i) {
            this.f1206b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            switch (this.f1206b) {
                case 0:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "MOVIE");
                    return;
                case 1:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "MUSIC");
                    return;
                case 2:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "GAME");
                    return;
                case 3:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "04");
                    return;
                case 4:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "00");
                    return;
                case 5:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "01");
                    return;
                case 6:
                    c.this.e.f754a.a(b.b.a.a.b.p.v.a.LMD, "11");
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: ListeningModeView.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.e.e(false);
        }
    }

    public c(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.d = dVar;
        this.f = new g0(new Handler(), 1);
    }

    public final void a(View view, int i, String str, int i2) {
        Button button;
        if (i == 0) {
            button = (Button) view.findViewById(R.id.lm1_button);
        } else if (i == 1) {
            button = (Button) view.findViewById(R.id.lm2_button);
        } else if (i != 2) {
            button = i != 3 ? null : (Button) view.findViewById(R.id.lm4_button);
        } else {
            button = (Button) view.findViewById(R.id.lm3_button);
        }
        if (button != null) {
            if (str != null) {
                button.setVisibility(0);
                button.setText(str);
                button.setOnClickListener(new a(i2));
                return;
            }
            button.setVisibility(4);
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        int i;
        View a2 = a(R.layout.layout_control_listening_mode);
        l b2 = this.d.b();
        if (b2.f755b.f839b == r.MAIN && b2.q.f757a) {
            a2.setVisibility(0);
            this.e = (h) b2;
            this.h = (TextView) a2.findViewById(R.id.lm_label);
            if (this.e.q.f758b) {
                a(a2, 0, "MOVIE", 0);
                i = 1;
            } else {
                i = 0;
            }
            if (this.e.q.f759c) {
                a(a2, i, "MUSIC", 1);
                i++;
            }
            if (this.e.q.d) {
                a(a2, i, "GAME", 2);
                i++;
            }
            if (this.e.q.e) {
                a(a2, i, "THX", 3);
                i++;
            }
            if (this.e.q.f) {
                a(a2, i, "STEREO", 4);
                i++;
            }
            if (this.e.q.g) {
                a(a2, i, "DIRECT", 5);
                i++;
            }
            if (this.e.q.h) {
                a(a2, i, "PURE", 6);
                i++;
            }
            while (i < 4) {
                a(a2, i, null, 0);
                i++;
            }
        } else {
            a2.setVisibility(8);
            this.e = null;
        }
        return a2;
    }

    public final void f() {
        h hVar = this.e;
        if (hVar != null) {
            String str = hVar.y;
            if (str == null) {
                this.f.a(0, 1000, new b());
                int i = this.g + 1;
                this.g = i;
                if (i <= 3) {
                    this.h.setText("");
                    return;
                }
                Resources resources = this.f1597b.getResources();
                this.h.setText(resources.getString(R.string.lmNoAudio));
                this.h.setTextColor(resources.getColor(R.color.audio_lstn_mode_no_audio));
                return;
            }
            this.f.a(0);
            this.g = 0;
            this.h.setText(str);
            this.h.setTextColor(this.f1597b.getResources().getColor(R.color.audio_lstn_mode));
        }
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        this.d.x.a((d.m) this);
    }

    @Override // b.b.a.a.b.p.d.k
    public void a(d.f fVar, boolean z, r rVar) {
        if (fVar != d.f.LISTENING_MODE_DISPLAY_NAME || this.e == null) {
            return;
        }
        f();
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        this.d.x.b(this);
    }
}
