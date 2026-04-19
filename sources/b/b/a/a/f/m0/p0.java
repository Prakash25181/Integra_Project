package b.b.a.a.f.m0;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: NcpPopupContent.java */
/* loaded from: classes.dex */
public class p0 implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b.b.a.a.b.q.o f1519b;

    public p0(t0 t0Var, b.b.a.a.b.q.o oVar) {
        this.f1519b = oVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.f1519b.f = editable.toString();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
