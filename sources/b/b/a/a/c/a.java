package b.b.a.a.c;

import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: AlbumArt.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f1079a;

    /* renamed from: b, reason: collision with root package name */
    public String f1080b;

    /* renamed from: c, reason: collision with root package name */
    public HashSet<c> f1081c;

    public a(b bVar, String str) {
        this.f1079a = bVar;
        this.f1080b = str;
    }

    public void a(Drawable drawable) {
        synchronized (this) {
            if (this.f1081c != null) {
                if (drawable != null) {
                    Iterator<c> it = this.f1081c.iterator();
                    while (it.hasNext()) {
                        it.next().a(drawable);
                    }
                }
                this.f1081c.clear();
                this.f1081c = null;
            }
        }
    }

    public void b(c cVar) {
        synchronized (this) {
            if (this.f1081c != null) {
                this.f1081c.remove(cVar);
                if (this.f1081c.size() == 0) {
                    this.f1081c = null;
                    this.f1079a.a(this);
                }
            }
        }
    }

    public void a(c cVar) {
        if (this.f1080b == null) {
            cVar.a(this.f1079a.l);
            return;
        }
        synchronized (this) {
            if (this.f1081c == null) {
                this.f1081c = new HashSet<>();
            }
            this.f1081c.add(cVar);
        }
        this.f1079a.b(this);
    }
}
