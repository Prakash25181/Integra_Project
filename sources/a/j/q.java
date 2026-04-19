package a.j;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel.java */
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f576a = new HashMap();

    public final void a() {
        Map<String, Object> map = this.f576a;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.f576a.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        b();
    }

    public void b() {
    }
}
