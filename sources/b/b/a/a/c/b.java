package b.b.a.a.c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: AlbumArtCache.java */
/* loaded from: classes.dex */
public final class b {
    public Thread g;
    public boolean h;
    public Handler i;
    public int j;
    public int k;
    public Drawable l;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f1082a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, Integer> f1083b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<Integer, String> f1084c = new HashMap<>();
    public final ArrayList<b.b.a.a.c.a> d = new ArrayList<>(30);
    public final ArrayList<c> e = new ArrayList<>(30);
    public final Object f = new Object();
    public Runnable m = new a();

    /* compiled from: AlbumArtCache.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.b.a.a.c.a remove;
            Log.v("AlbumArt", "start album art cache thread");
            while (true) {
                try {
                    synchronized (b.this.f) {
                        b.this.f.wait();
                    }
                    if (!b.this.h) {
                        break;
                    }
                    while (true) {
                        synchronized (b.this.d) {
                            if (b.this.d.size() == 0) {
                                break;
                            } else {
                                remove = b.this.d.remove(0);
                            }
                        }
                        b.this.c(remove);
                    }
                } catch (InterruptedException unused) {
                }
            }
            Log.v("AlbumArt", "stop album art cache thread");
        }
    }

    /* compiled from: AlbumArtCache.java */
    /* renamed from: b.b.a.a.c.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0035b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.b.a.a.c.a f1086b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Drawable f1087c;

        public RunnableC0035b(b bVar, b.b.a.a.c.a aVar, Drawable drawable) {
            this.f1086b = aVar;
            this.f1087c = drawable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1086b.a(this.f1087c);
        }
    }

    /* compiled from: AlbumArtCache.java */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f1088a;

        /* renamed from: b, reason: collision with root package name */
        public Drawable f1089b;

        public c(b bVar, String str, Drawable drawable) {
            this.f1088a = str;
            this.f1089b = drawable;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a8, code lost:
    
        if (r12.f1084c.containsKey(r5) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00aa, code lost:
    
        r12.f1084c.put(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b5, code lost:
    
        if (r12.f1083b.containsKey(r6) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b7, code lost:
    
        r12.f1083b.put(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c0, code lost:
    
        if (r1.moveToNext() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c2, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x007d, code lost:
    
        if (r1.moveToFirst() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x007f, code lost:
    
        r5 = java.lang.Integer.valueOf(r1.getInt(r0));
        r6 = r1.getString(r2);
        r7 = r1.getString(r3);
        r9 = r1.getString(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0093, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x009b, code lost:
    
        if (r12.f1082a.containsKey(r7) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x009d, code lost:
    
        r12.f1082a.put(r7, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r13) {
        /*
            r12 = this;
            r12.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.f1082a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.f1083b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r12.f1084c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 30
            r0.<init>(r1)
            r12.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r12.e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r12.f = r0
            b.b.a.a.c.b$a r0 = new b.b.a.a.c.b$a
            r0.<init>()
            r12.m = r0
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131099894(0x7f0600f6, float:1.7812154E38)
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
            r12.l = r0
            android.content.ContentResolver r1 = r13.getContentResolver()
            android.net.Uri r2 = android.provider.MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI
            r0 = 4
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_id"
            r4 = 0
            r3[r4] = r0
            java.lang.String r7 = "album"
            r8 = 1
            r3[r8] = r7
            java.lang.String r9 = "artist"
            r10 = 2
            r3[r10] = r9
            java.lang.String r11 = "album_art"
            r4 = 3
            r3[r4] = r11
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)
            if (r1 == 0) goto Lc5
            int r0 = r1.getColumnIndex(r0)
            int r2 = r1.getColumnIndex(r7)
            int r3 = r1.getColumnIndex(r9)
            int r4 = r1.getColumnIndex(r11)
            boolean r5 = r1.moveToFirst()
            if (r5 == 0) goto Lc2
        L7f:
            int r5 = r1.getInt(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = r1.getString(r2)
            java.lang.String r7 = r1.getString(r3)
            java.lang.String r9 = r1.getString(r4)
            if (r9 == 0) goto Lbc
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r12.f1082a
            boolean r11 = r11.containsKey(r7)
            if (r11 != 0) goto La2
            java.util.HashMap<java.lang.String, java.lang.String> r11 = r12.f1082a
            r11.put(r7, r9)
        La2:
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r12.f1084c
            boolean r7 = r7.containsKey(r5)
            if (r7 != 0) goto Laf
            java.util.HashMap<java.lang.Integer, java.lang.String> r7 = r12.f1084c
            r7.put(r5, r9)
        Laf:
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r12.f1083b
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto Lbc
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r12.f1083b
            r7.put(r6, r5)
        Lbc:
            boolean r5 = r1.moveToNext()
            if (r5 != 0) goto L7f
        Lc2:
            r1.close()
        Lc5:
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r0 = r13.density
            int r0 = (int) r0
            r12.j = r0
            r0 = 1110966272(0x42380000, float:46.0)
            float r13 = android.util.TypedValue.applyDimension(r8, r0, r13)
            int r13 = (int) r13
            int r13 = r13 * 2
            r12.k = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.c.b.<init>(android.content.Context):void");
    }

    public b.b.a.a.c.a a(String str) {
        if (str != null) {
            return new b.b.a.a.c.a(this, str);
        }
        return null;
    }

    public void b(b.b.a.a.c.a aVar) {
        Thread thread = this.g;
        if (thread != null && thread.isAlive()) {
            synchronized (this.d) {
                synchronized (this.e) {
                    Iterator<c> it = this.e.iterator();
                    while (it.hasNext()) {
                        c next = it.next();
                        if (next.f1088a == aVar.f1080b || next.equals(aVar.f1080b)) {
                            aVar.a(next.f1089b);
                            return;
                        }
                    }
                    if (!this.d.contains(aVar)) {
                        this.d.add(aVar);
                        synchronized (this.f) {
                            this.f.notify();
                        }
                    }
                    return;
                }
            }
        }
        aVar.a((Drawable) null);
    }

    public final void c(b.b.a.a.c.a aVar) {
        String str = aVar.f1080b;
        BitmapDrawable bitmapDrawable = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inScaled = true;
            options2.inSampleSize = Math.max(options.outWidth, options.outHeight) / this.k;
            options2.inDensity = this.j;
            options2.inScaled = true;
            options2.inPurgeable = true;
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
            if (decodeFile != null) {
                bitmapDrawable = new BitmapDrawable(decodeFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (bitmapDrawable != null) {
            synchronized (this.e) {
                if (this.e.size() > 30) {
                    this.e.remove(0);
                }
                this.e.add(new c(this, aVar.f1080b, bitmapDrawable));
            }
        }
        this.i.post(new RunnableC0035b(this, aVar, bitmapDrawable));
    }

    public void a(b.b.a.a.c.a aVar) {
        synchronized (this.d) {
            this.d.remove(aVar);
        }
    }
}
