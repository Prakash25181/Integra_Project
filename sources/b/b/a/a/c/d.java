package b.b.a.a.c;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import com.onkyo.integraRemote4A.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: MediaLibrary.java */
/* loaded from: classes.dex */
public final class d {
    public static d e;

    /* renamed from: a, reason: collision with root package name */
    public Context f1090a;

    /* renamed from: b, reason: collision with root package name */
    public ContentResolver f1091b;

    /* renamed from: c, reason: collision with root package name */
    public m f1092c;
    public b.b.a.a.c.b d;

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class c extends o {
        public String e;

        public c(d dVar, int i, String str, String str2, b.b.a.a.c.a aVar) {
            super(i, str, aVar);
            this.e = str2;
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class g implements n {

        /* renamed from: a, reason: collision with root package name */
        public int f1093a;

        /* renamed from: b, reason: collision with root package name */
        public String f1094b;

        /* renamed from: c, reason: collision with root package name */
        public String f1095c;
        public String d;
        public int e;
        public int f;
        public int g;
        public String h;
        public b.b.a.a.c.a i;
        public String j;

        public /* synthetic */ g(int i, a aVar) {
            this.f1093a = i;
        }

        @Override // b.b.a.a.c.d.n
        public String a() {
            return this.f1094b;
        }

        @Override // b.b.a.a.c.d.n
        public int b() {
            return this.f1093a;
        }

        public boolean c() {
            return new File(this.h).exists();
        }

        public String a(int i) {
            if (this.g < 3600) {
                int i2 = i / 60;
                return String.format("%2d:%02d", Integer.valueOf(i2), Integer.valueOf(i - (i2 * 60)));
            }
            int i3 = i / 3600;
            int i4 = i - (i3 * 3600);
            int i5 = i4 / 60;
            return String.format("%2d:%02d:%02d", Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(i4 - (i5 * 60)));
        }

        @Override // b.b.a.a.c.d.n
        public void b(b.b.a.a.c.c cVar) {
            b.b.a.a.c.a aVar = this.i;
            if (aVar != null) {
                aVar.b(cVar);
            }
        }

        @Override // b.b.a.a.c.d.n
        public void a(b.b.a.a.c.c cVar) {
            b.b.a.a.c.a aVar = this.i;
            if (aVar != null) {
                aVar.a(cVar);
            } else {
                cVar.a(d.this.d.l);
            }
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public interface h {
        void a(m mVar);
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public static final class k extends AsyncQueryHandler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<l> f1096a;

        public k(l lVar, ContentResolver contentResolver) {
            super(contentResolver);
            this.f1096a = new WeakReference<>(lVar);
        }

        @Override // android.content.AsyncQueryHandler
        public void onQueryComplete(int i, Object obj, Cursor cursor) {
            l lVar = this.f1096a.get();
            if (lVar != null) {
                lVar.a(cursor, -1);
            }
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public abstract class m {

        /* renamed from: a, reason: collision with root package name */
        public m f1099a;

        /* renamed from: b, reason: collision with root package name */
        public n f1100b;

        /* renamed from: c, reason: collision with root package name */
        public h f1101c;
        public int d;
        public boolean e;

        public m(d dVar, m mVar, n nVar, int i) {
            this.f1099a = mVar;
            this.f1100b = nVar;
            this.d = i;
            this.e = i == 6 || i == 7;
        }

        public abstract m a(int i);

        public m a(String str) {
            return null;
        }

        public void a(h hVar) {
            if (this.f1101c != null) {
                this.f1101c = hVar;
            }
        }

        public abstract void a(boolean z);

        public boolean a() {
            return false;
        }

        public abstract int b();

        public int b(int i) {
            return -1;
        }

        public m b(String str) {
            return null;
        }

        public abstract n c(int i);

        public abstract void c();

        public int d(int i) {
            return -1;
        }

        public boolean d() {
            return false;
        }

        public b.b.a.a.c.h e() {
            return null;
        }

        public void f() {
            h hVar = this.f1101c;
            if (hVar != null) {
                hVar.a(this);
            }
        }

        public b.b.a.a.c.e g() {
            return null;
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public interface n {
        String a();

        void a(b.b.a.a.c.c cVar);

        int b();

        void b(b.b.a.a.c.c cVar);
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public class o implements n {

        /* renamed from: a, reason: collision with root package name */
        public int f1102a;

        /* renamed from: b, reason: collision with root package name */
        public String f1103b;

        /* renamed from: c, reason: collision with root package name */
        public b.b.a.a.c.a f1104c;

        public o(int i, String str, b.b.a.a.c.a aVar) {
            this.f1102a = i;
            this.f1103b = str == null ? "" : str;
            this.f1104c = aVar;
        }

        @Override // b.b.a.a.c.d.n
        public String a() {
            return this.f1103b;
        }

        @Override // b.b.a.a.c.d.n
        public int b() {
            return this.f1102a;
        }

        public String toString() {
            return this.f1103b;
        }

        @Override // b.b.a.a.c.d.n
        public void a(b.b.a.a.c.c cVar) {
            b.b.a.a.c.a aVar = this.f1104c;
            if (aVar != null) {
                aVar.a(cVar);
            } else {
                cVar.a(d.this.d.l);
            }
        }

        @Override // b.b.a.a.c.d.n
        public void b(b.b.a.a.c.c cVar) {
            b.b.a.a.c.a aVar = this.f1104c;
            if (aVar != null) {
                aVar.b(cVar);
            }
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class r extends m {
        public a[] f;

        /* compiled from: MediaLibrary.java */
        /* loaded from: classes.dex */
        public final class a implements n {

            /* renamed from: a, reason: collision with root package name */
            public String f1105a;

            /* renamed from: b, reason: collision with root package name */
            public Drawable f1106b;

            /* renamed from: c, reason: collision with root package name */
            public int f1107c;

            public /* synthetic */ a(r rVar, String str, Drawable drawable, int i, a aVar) {
                this.f1105a = str;
                this.f1106b = drawable;
                this.f1107c = i;
            }

            @Override // b.b.a.a.c.d.n
            public String a() {
                return this.f1105a;
            }

            @Override // b.b.a.a.c.d.n
            public int b() {
                return 0;
            }

            @Override // b.b.a.a.c.d.n
            public void b(b.b.a.a.c.c cVar) {
            }

            @Override // b.b.a.a.c.d.n
            public void a(b.b.a.a.c.c cVar) {
                cVar.a(this.f1106b);
            }
        }

        public /* synthetic */ r(a aVar) {
            super(d.this, null, null, 0);
            this.f = new a[5];
            Resources resources = d.this.f1090a.getResources();
            a aVar2 = null;
            this.f[0] = new a(this, resources.getString(R.string.iPod_Artist), resources.getDrawable(R.drawable.ic_genre_artist), 1, aVar2);
            this.f[1] = new a(this, resources.getString(R.string.iPod_Album), resources.getDrawable(R.drawable.ic_genre_album), 3, aVar2);
            this.f[2] = new a(this, resources.getString(R.string.iPod_Songs), resources.getDrawable(R.drawable.ic_genre_all), 6, aVar2);
            this.f[3] = new a(this, resources.getString(R.string.iPod_Genres), resources.getDrawable(R.drawable.ic_genre_genre), 4, aVar2);
            this.f[4] = new a(this, resources.getString(R.string.iPod_Playlist), resources.getDrawable(R.drawable.ic_genre_playlist), 5, null);
        }

        @Override // b.b.a.a.c.d.m
        public m a(int i) {
            a[] aVarArr = this.f;
            int i2 = aVarArr[i].f1107c;
            if (i2 == 1) {
                return new e(this, aVarArr[0]);
            }
            if (i2 == 3) {
                return new b(this, aVarArr[1], null);
            }
            if (i2 == 4) {
                return new j(this, aVarArr[3]);
            }
            if (i2 == 5) {
                return new p(this, aVarArr[4]);
            }
            if (i2 != 6) {
                return null;
            }
            return new s(this, aVarArr[2], 6);
        }

        @Override // b.b.a.a.c.d.m
        public void a(boolean z) {
        }

        @Override // b.b.a.a.c.d.m
        public int b() {
            return this.f.length;
        }

        @Override // b.b.a.a.c.d.m
        public n c(int i) {
            return this.f[i];
        }

        @Override // b.b.a.a.c.d.m
        public void c() {
        }
    }

    public d(Context context) {
        this.f1090a = context;
        this.f1091b = context.getContentResolver();
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class e extends l {
        public int l;
        public int m;

        public e(m mVar, n nVar) {
            super(mVar, nVar, 1);
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            this.m = -1;
            if (cursor != null) {
                this.l = cursor.getColumnIndex("_id");
                cursor.getColumnIndex("artist_key");
                this.m = cursor.getColumnIndex("artist");
            }
            super.a(cursor, this.m);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String str;
            String[] strArr = {"_id", "artist_key", "artist"};
            Uri build = MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI.buildUpon().appendQueryParameter("distinct", "true").build();
            String[] strArr2 = null;
            if (this.i != null) {
                str = c("artist");
                strArr2 = new String[]{this.i};
            } else {
                str = null;
            }
            return a(z, build, strArr, str, strArr2, "artist_key");
        }

        public e(m mVar) {
            super(mVar);
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            n b2 = b(i, cursor);
            return new b(this, b2, ((o) b2).f1103b);
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            int i2 = cursor.getInt(this.l);
            String string = cursor.getString(this.m);
            d dVar = d.this;
            b.b.a.a.c.b bVar = dVar.d;
            return new o(i2, string, bVar.a(bVar.f1082a.get(string)));
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            e eVar = new e(this);
            eVar.d(str);
            return eVar;
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.l, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class j extends l {
        public int l;
        public int m;

        public j(m mVar, n nVar) {
            super(mVar, nVar, 4);
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            if (cursor != null) {
                this.l = cursor.getColumnIndex("_id");
                this.m = cursor.getColumnIndex("name");
            }
            super.a(cursor, -1);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String str;
            String[] strArr = {"_id", "name"};
            Uri build = MediaStore.Audio.Genres.EXTERNAL_CONTENT_URI.buildUpon().appendQueryParameter("distinct", "true").build();
            String[] strArr2 = null;
            if (this.i != null) {
                str = c("name");
                strArr2 = new String[]{this.i};
            } else {
                str = null;
            }
            return a(z, build, strArr, str, strArr2, "name");
        }

        public j(j jVar) {
            super(jVar);
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            return new i(this, b(i, cursor));
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            j jVar = new j(this);
            jVar.d(str);
            return jVar;
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            return new o(cursor.getInt(this.l), cursor.getString(this.m), null);
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.l, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class p extends l {
        public int l;
        public int m;

        public p(m mVar, n nVar) {
            super(mVar, nVar, 5);
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            if (cursor != null) {
                this.l = cursor.getColumnIndex("_id");
                this.m = cursor.getColumnIndex("name");
            }
            super.a(cursor, i);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String str;
            String[] strArr = {"_id", "name"};
            Uri uri = MediaStore.Audio.Playlists.EXTERNAL_CONTENT_URI;
            String[] strArr2 = null;
            if (this.i != null) {
                str = c("name");
                strArr2 = new String[]{this.i};
            } else {
                str = null;
            }
            return a(z, uri, strArr, str, strArr2, null);
        }

        public p(p pVar) {
            super(pVar);
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            return new q(this, b(i, cursor));
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            p pVar = new p(this);
            pVar.d(str);
            return pVar;
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            return new o(cursor.getInt(this.l), cursor.getString(this.m), null);
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.l, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public class s extends l {
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public boolean v;

        /* compiled from: MediaLibrary.java */
        /* loaded from: classes.dex */
        public final class a {

            /* renamed from: a, reason: collision with root package name */
            public String f1108a;

            /* renamed from: b, reason: collision with root package name */
            public String[] f1109b;

            /* renamed from: c, reason: collision with root package name */
            public String f1110c;

            public a(s sVar) {
            }
        }

        public s(m mVar, n nVar, int i) {
            super(mVar, nVar, i);
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            this.m = -1;
            if (cursor != null) {
                this.l = cursor.getColumnIndex("_id");
                this.m = cursor.getColumnIndex("name");
                this.l = cursor.getColumnIndex("_id");
                this.m = cursor.getColumnIndex("title");
                this.n = cursor.getColumnIndex("artist");
                this.o = cursor.getColumnIndex("artist_id");
                this.p = cursor.getColumnIndex("album");
                this.q = cursor.getColumnIndex("album_id");
                this.r = cursor.getColumnIndex("track");
                this.s = cursor.getColumnIndex("duration");
                this.t = cursor.getColumnIndex("mime_type");
                this.u = cursor.getColumnIndex("_data");
            }
            super.a(cursor, this.v ? this.m : -1);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String[] strArr = {"_id", "title", "artist", "artist_id", "album", "album_id", "track", "duration", "mime_type", "_data"};
            a h = h();
            String str = h.f1110c;
            this.v = str == "title" || str == "title_key";
            return a(z, i(), strArr, h.f1108a, h.f1109b, h.f1110c);
        }

        @Override // b.b.a.a.c.d.m
        public b.b.a.a.c.h e() {
            return new b.b.a.a.c.g(this);
        }

        public a h() {
            a aVar = new a(this);
            if (this.i != null) {
                aVar.f1108a = c("title");
                aVar.f1109b = new String[]{this.i};
            } else {
                aVar.f1108a = null;
                aVar.f1109b = null;
            }
            aVar.f1110c = "title_key";
            return aVar;
        }

        public Uri i() {
            return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendQueryParameter("distinct", "true").build();
        }

        public s(s sVar) {
            super(sVar);
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            g gVar = new g(cursor.getInt(this.l), null);
            gVar.f1094b = cursor.getString(this.m);
            cursor.getInt(this.o);
            gVar.f1095c = cursor.getString(this.n);
            int i2 = cursor.getInt(this.q);
            String string = cursor.getString(this.p);
            gVar.e = i2;
            gVar.d = string;
            gVar.f = cursor.getInt(this.r);
            gVar.g = cursor.getInt(this.s) / 1000;
            gVar.j = cursor.getString(this.t);
            gVar.h = cursor.getString(this.u);
            int i3 = cursor.getInt(this.q);
            if (i3 > 0) {
                b.b.a.a.c.b bVar = d.this.d;
                gVar.i = bVar.a(bVar.f1084c.get(Integer.valueOf(i3)));
            }
            return gVar;
        }

        public /* synthetic */ s(s sVar, a aVar) {
            super(sVar);
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            n b2 = b(i, cursor);
            return new b(this, b2, ((g) b2).f1094b);
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            s sVar = new s(this);
            sVar.d(str);
            return sVar;
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.l, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class b extends l {
        public int l;
        public int m;
        public int n;
        public int o;
        public String p;

        public b(m mVar, n nVar, String str) {
            super(mVar, nVar, str != null ? 2 : 3);
            this.p = str;
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            this.m = -1;
            if (cursor != null) {
                this.l = cursor.getColumnIndex("_id");
                this.m = cursor.getColumnIndex("album");
                this.n = cursor.getColumnIndex("artist");
                this.o = cursor.getColumnIndex("album_art");
            }
            super.a(cursor, this.m);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String str;
            String[] strArr;
            String[] strArr2 = {"_id", "album", "artist", "album_art"};
            Uri build = MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI.buildUpon().appendQueryParameter("distinct", "true").build();
            String str2 = this.p;
            if (str2 != null) {
                if (this.i != null) {
                    StringBuilder a2 = b.a.a.a.a.a("artist=? AND ");
                    a2.append(c("album"));
                    String sb = a2.toString();
                    strArr = new String[]{this.p, this.i};
                    str = sb;
                } else {
                    strArr = new String[]{str2};
                    str = "artist=?";
                }
            } else if (this.i != null) {
                str = c("album");
                strArr = new String[]{this.i};
            } else {
                str = null;
                strArr = null;
            }
            return a(z, build, strArr2, str, strArr, "album_key");
        }

        public b(b bVar) {
            super(bVar);
            this.p = bVar.p;
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            return new C0036d(this, b(i, cursor), 7, -1, cursor.getInt(this.l));
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            b bVar = new b(this);
            bVar.d(str);
            return bVar;
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            int i2 = cursor.getInt(this.l);
            String string = cursor.getString(this.m);
            String string2 = cursor.getString(this.n);
            String string3 = cursor.getString(this.o);
            d dVar = d.this;
            return new c(dVar, i2, string, string2, dVar.d.a(string3));
        }

        @Override // b.b.a.a.c.d.m
        public m b(String str) {
            l sVar;
            if (this.p != null) {
                sVar = new f(this, this.f1100b, str);
            } else {
                sVar = new s(this, this.f1100b, 6);
            }
            sVar.d(str);
            return sVar;
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.l, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class i extends l {
        public int l;
        public int m;
        public int n;
        public int o;

        public i(m mVar, n nVar) {
            super(mVar, nVar, 8);
            this.l = nVar.b();
        }

        @Override // b.b.a.a.c.d.l
        public void a(Cursor cursor, int i) {
            if (cursor != null) {
                this.m = cursor.getColumnIndex("album_id");
                this.n = cursor.getColumnIndex("album");
                this.o = cursor.getColumnIndex("artist");
            }
            super.a(cursor, -1);
        }

        @Override // b.b.a.a.c.d.l
        public AsyncQueryHandler b(boolean z) {
            String str;
            String[] strArr = {"album_id", "album", "artist"};
            Uri build = MediaStore.Audio.Genres.Members.getContentUri("external", this.l).buildUpon().appendQueryParameter("distinct", "true").build();
            String[] strArr2 = null;
            if (this.i != null) {
                str = c("album");
                strArr2 = new String[]{this.i};
            } else {
                str = null;
            }
            return a(z, build, strArr, str, strArr2, "album");
        }

        public i(i iVar) {
            super(iVar);
            this.l = iVar.l;
        }

        @Override // b.b.a.a.c.d.l
        public m a(int i, Cursor cursor) {
            n b2 = b(i, cursor);
            return new C0036d(this, b2, 7, this.l, ((o) b2).f1102a);
        }

        @Override // b.b.a.a.c.d.m
        public m a(String str) {
            i iVar = new i(this);
            iVar.d(str);
            return iVar;
        }

        @Override // b.b.a.a.c.d.l
        public n b(int i, Cursor cursor) {
            int i2 = cursor.getInt(this.m);
            String string = cursor.getString(this.n);
            String string2 = cursor.getString(this.o);
            d dVar = d.this;
            b.b.a.a.c.b bVar = dVar.d;
            Integer num = bVar.f1083b.get(string);
            return new c(dVar, i2, string, string2, num != null ? bVar.a(bVar.f1084c.get(num)) : null);
        }

        @Override // b.b.a.a.c.d.m
        public m b(String str) {
            C0036d c0036d = new C0036d(this, this.f1100b, 7, this.l, -1);
            c0036d.d(str);
            return c0036d;
        }

        @Override // b.b.a.a.c.d.m
        public int b(int i) {
            return a(this.m, i);
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public abstract class l extends m {
        public AsyncQueryHandler f;
        public Cursor g;
        public int h;
        public String i;
        public b.b.a.a.c.e j;

        /* compiled from: MediaLibrary.java */
        /* loaded from: classes.dex */
        public class a extends AsyncTask<Void, Void, Void> {

            /* renamed from: a, reason: collision with root package name */
            public l f1097a;

            /* renamed from: b, reason: collision with root package name */
            public int f1098b;

            public /* synthetic */ a(l lVar, l lVar2, int i, a aVar) {
                this.f1097a = lVar2;
                this.f1098b = i;
            }

            @Override // android.os.AsyncTask
            public Void doInBackground(Void[] voidArr) {
                l lVar = this.f1097a;
                int i = this.f1098b;
                if (lVar == null) {
                    throw null;
                }
                ArrayList arrayList = new ArrayList();
                Cursor cursor = lVar.g;
                if (cursor != null && cursor.moveToFirst()) {
                    String string = cursor.getString(i);
                    char a2 = lVar.a((string == null || string.length() == 0) ? (char) 0 : string.charAt(0));
                    arrayList.add(new b.b.a.a.c.f(0, a2));
                    int i2 = 1;
                    while (cursor.moveToNext()) {
                        String string2 = cursor.getString(i);
                        char a3 = lVar.a((string2 == null || string2.length() == 0) ? (char) 0 : string2.charAt(0));
                        if (a3 != a2) {
                            arrayList.add(new b.b.a.a.c.f(i2, a3));
                            a2 = a3;
                        }
                        i2++;
                    }
                }
                lVar.j = new b.b.a.a.c.e(arrayList);
                return null;
            }

            @Override // android.os.AsyncTask
            public void onPostExecute(Void r2) {
                l lVar = this.f1097a;
                lVar.f = null;
                lVar.f();
            }
        }

        public l(m mVar, n nVar, int i) {
            super(d.this, mVar, nVar, i);
            this.h = 0;
            this.i = null;
        }

        public final char a(char c2) {
            int i;
            int i2;
            int i3;
            int i4 = 97;
            if ('a' > c2 || c2 > 'z') {
                if (c2 >= 256) {
                    int i5 = 65345;
                    if (65345 > c2 || c2 > 65370) {
                        i5 = 65281;
                        if (65281 > c2 || c2 > 65374) {
                            i4 = 12449;
                            if (12449 <= c2 && c2 <= 12534) {
                                i = c2 + 12353;
                            }
                        } else {
                            i2 = c2 + '!';
                        }
                    } else {
                        i2 = c2 + 'A';
                    }
                    i3 = i2 - i5;
                    return (char) i3;
                }
                return c2;
            }
            i = c2 + 'A';
            i3 = i - i4;
            return (char) i3;
        }

        public abstract m a(int i, Cursor cursor);

        @Override // b.b.a.a.c.d.m
        public void a(boolean z) {
            this.h++;
            if (this.g == null && this.f == null) {
                this.f = b(z);
            }
        }

        @Override // b.b.a.a.c.d.m
        public boolean a() {
            return true;
        }

        @Override // b.b.a.a.c.d.m
        public int b() {
            Cursor cursor = this.g;
            if (cursor != null) {
                return cursor.getCount();
            }
            return 0;
        }

        public abstract AsyncQueryHandler b(boolean z);

        public abstract n b(int i, Cursor cursor);

        @Override // b.b.a.a.c.d.m
        public void c() {
            int i = this.h - 1;
            this.h = i;
            if (i == 0) {
                AsyncQueryHandler asyncQueryHandler = this.f;
                if (asyncQueryHandler != null) {
                    asyncQueryHandler.cancelOperation(0);
                    this.f = null;
                }
                Cursor cursor = this.g;
                if (cursor != null) {
                    cursor.close();
                    this.g = null;
                }
            }
        }

        public void d(String str) {
            if (str != null) {
                this.i = "%" + str.replace("$", "$$").replace("%", "$%").replace("*", "$*").replace("_", "$_") + "%";
                return;
            }
            this.i = null;
        }

        @Override // b.b.a.a.c.d.m
        public b.b.a.a.c.e g() {
            return this.j;
        }

        @Override // b.b.a.a.c.d.m
        public m a(int i) {
            Cursor cursor = this.g;
            if (cursor == null || !cursor.moveToPosition(i)) {
                return null;
            }
            return a(i, this.g);
        }

        public l(m mVar) {
            super(d.this, mVar, mVar.f1100b, mVar.d);
            this.h = 0;
            this.i = null;
        }

        public AsyncQueryHandler a(boolean z, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
            if (z) {
                k kVar = new k(this, d.this.f1091b);
                kVar.startQuery(0, null, uri, strArr, str, strArr2, str2);
                return kVar;
            }
            a(d.this.f1091b.query(uri, strArr, str, strArr2, str2), -1);
            return null;
        }

        @Override // b.b.a.a.c.d.m
        public boolean d() {
            return this.g == null || this.f != null;
        }

        @Override // b.b.a.a.c.d.m
        public n c(int i) {
            Cursor cursor = this.g;
            if (cursor == null || !cursor.moveToPosition(i)) {
                return null;
            }
            return b(i, this.g);
        }

        @Override // b.b.a.a.c.d.m
        public int d(int i) {
            n c2 = c(i);
            if (c2 == null || !this.f1099a.getClass().equals(getClass())) {
                return -1;
            }
            return this.f1099a.b(c2.b());
        }

        public String c(String str) {
            return b.a.a.a.a.a(str, " LIKE ? escape '$'");
        }

        public void a(Cursor cursor, int i) {
            this.g = cursor;
            a aVar = null;
            if (cursor == null) {
                this.f = null;
                f();
            } else {
                if (i != -1) {
                    new a(this, this, i, aVar).execute(new Void[0]);
                    return;
                }
                cursor.moveToFirst();
                this.f = null;
                f();
            }
        }

        public int a(int i, int i2) {
            Cursor cursor = this.g;
            if (cursor == null || !cursor.moveToFirst()) {
                return -1;
            }
            int i3 = 0;
            while (this.g.getInt(i) != i2) {
                i3++;
                if (!this.g.moveToNext()) {
                    return -1;
                }
            }
            return i3;
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class q extends s {
        public int x;

        public q(m mVar, n nVar) {
            super(mVar, nVar, 6);
            this.x = nVar.b();
        }

        @Override // b.b.a.a.c.d.s, b.b.a.a.c.d.m
        public m a(String str) {
            q qVar = new q(this);
            qVar.d(str);
            return qVar;
        }

        @Override // b.b.a.a.c.d.s
        public s.a h() {
            s.a h = super.h();
            h.f1110c = "play_order";
            return h;
        }

        @Override // b.b.a.a.c.d.s
        public Uri i() {
            return MediaStore.Audio.Playlists.Members.getContentUri("external", this.x);
        }

        public q(q qVar) {
            super(qVar, null);
            this.x = qVar.x;
        }
    }

    /* compiled from: MediaLibrary.java */
    /* loaded from: classes.dex */
    public final class f extends s {
        public int x;

        public f(m mVar, n nVar, String str) {
            super(mVar, nVar, 6);
            this.x = nVar.b();
            if (str != null) {
                d(str);
            }
        }

        @Override // b.b.a.a.c.d.s, b.b.a.a.c.d.m
        public m a(String str) {
            f fVar = new f(this);
            fVar.d(str);
            return fVar;
        }

        @Override // b.b.a.a.c.d.s
        public s.a h() {
            s.a aVar = new s.a(this);
            if (this.i != null) {
                StringBuilder a2 = b.a.a.a.a.a("artist_id=? AND ");
                a2.append(c("title"));
                aVar.f1108a = a2.toString();
                StringBuilder a3 = b.a.a.a.a.a("");
                a3.append(this.x);
                aVar.f1109b = new String[]{a3.toString(), this.i};
            } else {
                aVar.f1108a = "artist_id=?";
                StringBuilder a4 = b.a.a.a.a.a("");
                a4.append(this.x);
                aVar.f1109b = new String[]{a4.toString()};
            }
            aVar.f1110c = "track";
            return aVar;
        }

        public f(f fVar) {
            super(fVar, null);
            this.x = fVar.x;
        }
    }

    /* compiled from: MediaLibrary.java */
    /* renamed from: b.b.a.a.c.d$d, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class C0036d extends s {
        public int x;
        public int y;

        public C0036d(m mVar, n nVar, int i, int i2, int i3) {
            super(mVar, nVar, i);
            this.x = -1;
            this.x = i2;
            this.y = i3;
        }

        @Override // b.b.a.a.c.d.s, b.b.a.a.c.d.m
        public m a(String str) {
            C0036d c0036d = new C0036d(this);
            c0036d.d(str);
            return c0036d;
        }

        @Override // b.b.a.a.c.d.s
        public s.a h() {
            s.a aVar = new s.a(this);
            if (this.y != -1) {
                if (this.i != null) {
                    StringBuilder a2 = b.a.a.a.a.a("album_id=? AND ");
                    a2.append(c("title"));
                    aVar.f1108a = a2.toString();
                    StringBuilder a3 = b.a.a.a.a.a("");
                    a3.append(this.y);
                    aVar.f1109b = new String[]{a3.toString(), this.i};
                } else {
                    aVar.f1108a = "album_id=?";
                    StringBuilder a4 = b.a.a.a.a.a("");
                    a4.append(this.y);
                    aVar.f1109b = new String[]{a4.toString()};
                }
            } else if (this.i != null) {
                aVar.f1108a = c("title");
                aVar.f1109b = new String[]{this.i};
            } else {
                aVar.f1108a = null;
                aVar.f1109b = null;
            }
            aVar.f1110c = "track";
            return aVar;
        }

        @Override // b.b.a.a.c.d.s
        public Uri i() {
            int i = this.x;
            if (i == -1) {
                return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI.buildUpon().appendQueryParameter("distinct", "true").build();
            }
            return MediaStore.Audio.Genres.Members.getContentUri("external", i);
        }

        public C0036d(C0036d c0036d) {
            super(c0036d, null);
            this.x = -1;
            this.x = c0036d.x;
            this.y = c0036d.y;
        }
    }
}
