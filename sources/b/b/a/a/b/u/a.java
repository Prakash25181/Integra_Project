package b.b.a.a.b.u;

import android.util.Log;
import b.b.a.a.b.u.b;
import java.io.IOException;
import java.net.ServerSocket;

/* compiled from: HttpStreamingServer.java */
/* loaded from: classes.dex */
public class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1060b;

    public a(b bVar) {
        this.f1060b = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.a aVar = this.f1060b.f1063c;
        if (aVar != null) {
            try {
                ServerSocket serverSocket = aVar.f1643c;
                if (serverSocket != null) {
                    try {
                        serverSocket.close();
                    } catch (IOException unused) {
                    }
                }
                aVar.a();
                if (aVar.e != null) {
                    aVar.e.join();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Log.v("UPnP", "HTTP Server Stopped");
            return;
        }
        throw null;
    }
}
