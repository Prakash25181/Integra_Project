package b.b.a.a.b.p;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Xml;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: IscpDeviceIconCache.java */
/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public b.b.a.a.e.c f866a = new b.b.a.a.e.c();

    /* renamed from: b, reason: collision with root package name */
    public HashMap<String, Bitmap> f867b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f868c = new Object();

    /* compiled from: IscpDeviceIconCache.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Bitmap bitmap);
    }

    /* compiled from: IscpDeviceIconCache.java */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public String f869a;

        /* renamed from: b, reason: collision with root package name */
        public int f870b;

        /* renamed from: c, reason: collision with root package name */
        public int f871c;
        public int d;
        public String e;

        public /* synthetic */ c(f fVar, a aVar) {
        }
    }

    public Bitmap a(String str) {
        Bitmap bitmap;
        synchronized (this.f868c) {
            bitmap = this.f867b.get(str);
        }
        return bitmap;
    }

    public boolean b(String str) {
        boolean containsKey;
        synchronized (this.f868c) {
            containsKey = this.f867b.containsKey(str);
        }
        return containsKey;
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (this.f868c) {
            this.f867b.put(str, bitmap);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void b(java.lang.String r3, b.b.a.a.b.p.f.b r4, java.net.HttpURLConnection r5) {
        /*
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L10
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Exception -> Lc
            b.b.a.a.b.p.f$c r5 = r2.a(r5)     // Catch: java.lang.Exception -> Lc
            goto L11
        Lc:
            r5 = move-exception
            r5.printStackTrace()
        L10:
            r5 = r0
        L11:
            if (r5 == 0) goto L20
            java.lang.String r5 = r5.e
            b.b.a.a.e.c r0 = r2.f866a
            b.b.a.a.b.p.b r1 = new b.b.a.a.b.p.b
            r1.<init>(r2, r3, r4)
            r0.a(r5, r1)
            goto L23
        L20:
            r4.a(r0)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.f.b(java.lang.String, b.b.a.a.b.p.f$b, java.net.HttpURLConnection):void");
    }

    public /* synthetic */ void a(String str, b bVar, HttpURLConnection httpURLConnection) {
        Bitmap bitmap = null;
        if (httpURLConnection != null) {
            try {
                bitmap = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
                a(str, bitmap);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        bVar.a(bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final c a(InputStream inputStream) {
        String str;
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, "UTF-8");
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList();
        c cVar = null;
        Object[] objArr = 0;
        String str2 = "";
        c cVar2 = null;
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                arrayList.add(Integer.valueOf(str2.length()));
                str = str2 + "/" + newPullParser.getName();
                if (str.equals("/root/device/iconList/icon")) {
                    cVar2 = new c(this, objArr == true ? 1 : 0);
                }
            } else if (eventType == 3) {
                if (str2.equals("/root/device/iconList/icon")) {
                    if (cVar2 != null && cVar2.f869a != null && cVar2.f871c > 0 && cVar2.d > 0 && cVar2.f870b > 0 && cVar2.e != null) {
                        arrayList2.add(cVar2);
                    }
                    cVar2 = null;
                }
                str = str2.substring(0, ((Integer) arrayList.get(arrayList.size() - 1)).intValue());
                arrayList.remove(arrayList.size() - 1);
            } else {
                if (eventType == 4 && cVar2 != null) {
                    String text = newPullParser.getText();
                    if (str2.equals("/root/device/iconList/icon/mimetype")) {
                        cVar2.f869a = text;
                    } else if (str2.equals("/root/device/iconList/icon/width")) {
                        cVar2.f871c = Integer.parseInt(text);
                    } else if (str2.equals("/root/device/iconList/icon/height")) {
                        cVar2.d = Integer.parseInt(text);
                    } else if (str2.equals("/root/device/iconList/icon/depth")) {
                        cVar2.f870b = Integer.parseInt(text);
                    } else if (str2.equals("/root/device/iconList/icon/url")) {
                        cVar2.e = text;
                    }
                }
            }
            str2 = str;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            c cVar3 = (c) it.next();
            if (cVar == null || cVar3.f871c * cVar3.d > cVar.f871c * cVar.d) {
                cVar = cVar3;
            }
        }
        return cVar;
    }
}
