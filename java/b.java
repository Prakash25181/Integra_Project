package b.b.a.a.f.m0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.onkyo.integraRemote4A.R;

/* compiled from: AudioSettingsPopup.java */
/* loaded from: classes.dex */
public class b extends g1 {
    public b.b.a.a.b.p.d h;
    public c i;
    public b.b.a.a.f.j0.c j;

    public b(Context context, b.b.a.a.b.p.d dVar) {
        super(context);
        this.h = dVar;
    }

    @Override // b.b.a.a.f.o0.b
    public void a(View view) {
        b.b.a.a.f.j0.c cVar = this.j;
        if (cVar != null) {
            cVar.f();
        }
    }

    @Override // b.b.a.a.f.o0.b
    public View b() {
        View a2;
        b.b.a.a.b.l b2 = this.h.b();
        if (b2.q.f757a) {
            a2 = a(R.layout.layout_popup_audio_settings_lm);
        } else {
            a2 = a(R.layout.layout_popup_audio_settings);
        }
        this.i = new c(this.f1597b, this.h);
        ((ViewGroup) a2.findViewById(R.id.audio_settings_parent)).addView(this.i.b());
        if (b2.q.f757a) {
            this.j = new b.b.a.a.f.j0.c(this.f1597b, this.h);
            ((ViewGroup) a2.findViewById(R.id.listening_mode_parent)).addView(this.j.b());
        }
        return a2;
    }

    @Override // b.b.a.a.f.o0.b
    public void b(View view) {
        b.b.a.a.f.j0.c cVar = this.j;
        if (cVar != null) {
            cVar.f.a(0);
        }
    }
}
