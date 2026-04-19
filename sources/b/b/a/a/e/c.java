package b.b.a.a.e;

import android.os.AsyncTask;
import b.b.a.a.e.c;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: HttpGetTask.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b> f1133a = new ArrayList<>();

    /* compiled from: HttpGetTask.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(HttpURLConnection httpURLConnection);
    }

    /* compiled from: HttpGetTask.java */
    /* loaded from: classes.dex */
    public static class b extends AsyncTask<String, Integer, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public String f1134a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0038c f1135b;

        public b(String str, InterfaceC0038c interfaceC0038c) {
            this.f1134a = str;
            this.f1135b = interfaceC0038c;
        }

        @Override // android.os.AsyncTask
        public Integer doInBackground(String[] strArr) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f1134a).openConnection();
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.addRequestProperty("User-Agent", System.getProperty("http.agent"));
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    this.f1135b.a(this, httpURLConnection);
                } else {
                    this.f1135b.a(this, null);
                }
                httpURLConnection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
                this.f1135b.a(this, null);
            }
            return 0;
        }
    }

    /* compiled from: HttpGetTask.java */
    /* renamed from: b.b.a.a.e.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0038c {
        void a(b bVar, HttpURLConnection httpURLConnection);
    }

    public void a() {
        ArrayList arrayList;
        synchronized (this.f1133a) {
            arrayList = new ArrayList(this.f1133a);
            this.f1133a.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).cancel(true);
        }
    }

    public void a(String str, final a aVar) {
        b bVar = new b(str, new InterfaceC0038c() { // from class: b.b.a.a.e.a
            @Override // b.b.a.a.e.c.InterfaceC0038c
            public final void a(c.b bVar2, HttpURLConnection httpURLConnection) {
                c.this.a(aVar, bVar2, httpURLConnection);
            }
        });
        synchronized (this.f1133a) {
            this.f1133a.add(bVar);
        }
        bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, str);
    }

    public /* synthetic */ void a(a aVar, b bVar, HttpURLConnection httpURLConnection) {
        synchronized (this.f1133a) {
            this.f1133a.remove(bVar);
        }
        aVar.a(httpURLConnection);
    }
}
