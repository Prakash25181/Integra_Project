package a.e.j;

import android.util.Log;
import java.io.Writer;

/* compiled from: LogWriter.java */
/* loaded from: classes.dex */
public class a extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final String f421b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f422c = new StringBuilder(128);

    public a(String str) {
        this.f421b = str;
    }

    public final void a() {
        if (this.f422c.length() > 0) {
            Log.d(this.f421b, this.f422c.toString());
            StringBuilder sb = this.f422c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f422c.append(c2);
            }
        }
    }
}
