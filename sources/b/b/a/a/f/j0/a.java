package b.b.a.a.f.j0;

import android.content.Context;

/* compiled from: AudioSettingControl.java */
/* loaded from: classes.dex */
public abstract class a extends b.b.a.a.f.o0.b {
    public a(Context context) {
        super(context);
    }

    public String a(int i, float f) {
        return i == 0 ? "  0" : f == 0.5f ? i > 0 ? String.format("+%.1f", Float.valueOf(i / 2.0f)) : String.format("-%.1f", Float.valueOf((-i) / 2.0f)) : i > 0 ? String.format("+%2d", Integer.valueOf(i)) : String.format("-%2d", Integer.valueOf(-i));
    }

    public abstract void f();
}
