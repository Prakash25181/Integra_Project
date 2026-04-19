package b.b.a.a.f.k0.v;

import android.text.Editable;
import android.text.TextWatcher;

/* compiled from: UpnpMediaDirectoryBase.java */
/* loaded from: classes.dex */
public class h implements TextWatcher {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f1350b;

    public h(k kVar) {
        this.f1350b = kVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        k kVar = this.f1350b;
        kVar.l.a(kVar.h.getText().toString());
        k kVar2 = this.f1350b;
        if (kVar2.l.d != null) {
            kVar2.i.setVisibility(0);
            this.f1350b.k.setFastScrollAlwaysVisible(false);
            this.f1350b.k.setFastScrollEnabled(false);
            return;
        }
        kVar2.i.setVisibility(8);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
