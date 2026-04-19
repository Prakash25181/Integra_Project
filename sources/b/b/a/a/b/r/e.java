package b.b.a.a.b.r;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import b.b.a.a.b.r.v;
import b.b.a.a.e.e;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: IscpImageReceiver.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<b> f955a;

    /* renamed from: b, reason: collision with root package name */
    public c f956b;

    /* renamed from: c, reason: collision with root package name */
    public int f957c;
    public boolean d;
    public a e;
    public Handler f = new Handler();
    public b.b.a.a.e.c g = new b.b.a.a.e.c();
    public Bitmap h;
    public b.b.a.a.e.e i;
    public int j;

    /* compiled from: IscpImageReceiver.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    /* compiled from: IscpImageReceiver.java */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f958a = 0;

        /* renamed from: b, reason: collision with root package name */
        public byte[] f959b = new byte[512];

        public b(e eVar) {
        }
    }

    /* compiled from: IscpImageReceiver.java */
    /* loaded from: classes.dex */
    public enum c {
        UNKNOWN('*'),
        NONE('n'),
        BMP('0'),
        JPEG('1'),
        LINK('2');

        public static final Map<Character, c> h = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final char f961b;

        static {
            for (c cVar : values()) {
                h.put(Character.valueOf(cVar.f961b), cVar);
            }
        }

        c(char c2) {
            this.f961b = c2;
        }
    }

    public e(a aVar) {
        this.e = aVar;
    }

    public final byte a(char c2) {
        int i;
        if ('0' > c2 || c2 > '9') {
            char c3 = 'A';
            if ('A' > c2 || c2 > 'F') {
                c3 = 'a';
                if ('a' > c2 || c2 > 'f') {
                    throw new CharConversionException();
                }
            }
            i = (c2 - c3) + 10;
        } else {
            i = c2 - '0';
        }
        return (byte) i;
    }

    public void b() {
        b.b.a.a.e.e eVar = this.i;
        if (eVar != null) {
            eVar.a();
            this.i = null;
        }
        this.j = 0;
        this.g.a();
        if (this.h != null) {
            this.h = null;
            ((v) this.e).a((Bitmap) null);
        }
    }

    public final void a() {
        this.f956b = c.UNKNOWN;
        this.f957c = 0;
        ArrayList<b> arrayList = this.f955a;
        if (arrayList != null) {
            arrayList.clear();
            this.f955a = null;
        }
    }

    public /* synthetic */ void a(final String str, HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                final Bitmap a2 = a(httpURLConnection.getInputStream());
                r0 = a2 != null;
                this.f.post(new Runnable() { // from class: b.b.a.a.b.r.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.this.a(a2);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (r0) {
            return;
        }
        this.f.post(new Runnable() { // from class: b.b.a.a.b.r.c
            @Override // java.lang.Runnable
            public final void run() {
                e.this.a(str);
            }
        });
    }

    public /* synthetic */ void a(Bitmap bitmap) {
        this.h = bitmap;
        v vVar = (v) this.e;
        vVar.l = bitmap;
        vVar.f1009a.a(v.a.JACKET_IMAGE);
    }

    public /* synthetic */ void a(String str) {
        int i = this.j + 1;
        this.j = i;
        if (i < 5) {
            b.b.a.a.e.e a2 = b.b.a.a.e.e.a((e.b) new d(this, str), true);
            this.i = a2;
            a2.a(false, 3000);
        }
    }

    public final Bitmap a(InputStream inputStream) {
        int i;
        byte[] byteArray;
        byte b2;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int read = inputStream.read(bArr);
        Bitmap bitmap = null;
        if (read < 0) {
            byteArray = null;
        } else {
            for (int i2 = 0; i2 < read - 1 && (((b2 = bArr[i2]) == 10 || b2 == 13 || b2 >= 32) && b2 < Byte.MAX_VALUE); i2++) {
                if (b2 == 10 && bArr[i2 + 1] == 10) {
                    i = i2 + 2;
                    break;
                }
            }
            i = 0;
            byteArrayOutputStream.write(bArr, i, read - i);
            while (true) {
                int read2 = inputStream.read(bArr);
                if (read2 < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read2);
            }
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray != null && byteArray.length > 0) {
            bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        if (bitmap != null || byteArray.length <= 256) {
            return bitmap;
        }
        for (int i3 = 0; i3 < 252; i3++) {
            if (byteArray[i3] == 13 && byteArray[i3 + 1] == 10 && byteArray[i3 + 2] == 13 && byteArray[i3 + 3] == 10) {
                int i4 = i3 + 4;
                return BitmapFactory.decodeByteArray(byteArray, i4, byteArray.length - i4);
            }
        }
        return bitmap;
    }
}
