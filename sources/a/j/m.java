package a.j;

import androidx.lifecycle.LiveData;

/* compiled from: MutableLiveData.java */
/* loaded from: classes.dex */
public class m<T> extends LiveData<T> {
    public void a(T t) {
        LiveData.a("setValue");
        this.f++;
        this.d = t;
        b(null);
    }
}
