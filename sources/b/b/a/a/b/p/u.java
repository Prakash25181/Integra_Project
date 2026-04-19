package b.b.a.a.b.p;

import android.graphics.Bitmap;
import b.b.a.a.b.p.f;
import b.b.a.a.b.p.g;
import com.onkyo.jp.upnp.UpnpAdvDevice;
import com.onkyo.jp.upnp.UpnpDeviceDescriptor;
import com.onkyo.jp.upnp.UpnpIcon;

/* compiled from: UpnpDeviceInfo.java */
/* loaded from: classes.dex */
public class u extends g {
    public UpnpAdvDevice m;

    /* compiled from: UpnpDeviceInfo.java */
    /* loaded from: classes.dex */
    public class a implements f.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f.b f907a;

        public a(f.b bVar) {
            this.f907a = bVar;
        }

        @Override // b.b.a.a.b.p.f.b
        public void a(Bitmap bitmap) {
            u.this.k = bitmap;
            this.f907a.a(bitmap);
        }
    }

    public u(UpnpAdvDevice upnpAdvDevice) {
        UpnpDeviceDescriptor descriptor = upnpAdvDevice.descriptor();
        this.f873b = '1';
        this.f874c = descriptor.modelNumber();
        this.d = 60128;
        this.e = g.b.UNKNOWN;
        this.f = null;
        this.g = a(descriptor.udn());
        String b2 = b.b.a.a.d.a.a().b(this.g);
        if (b2 != null && b2.length() > 0) {
            this.h = b2;
        } else if (descriptor.friendlyName() != null && descriptor.friendlyName().length() > 0) {
            this.h = descriptor.friendlyName();
        } else {
            this.h = null;
        }
        this.j = upnpAdvDevice.host();
        this.k = null;
        this.m = upnpAdvDevice;
    }

    public static String a(String str) {
        return (str == null || str.length() <= 5 || !str.substring(0, 5).equals("uuid:")) ? str : str.substring(5);
    }

    @Override // b.b.a.a.b.p.g
    public boolean a(long j) {
        return false;
    }

    @Override // b.b.a.a.b.p.g
    public String a() {
        return this.m.ipAddress();
    }

    @Override // b.b.a.a.b.p.g
    public void a(f fVar, f.b bVar) {
        if (fVar.b(this.g)) {
            Bitmap a2 = fVar.a(this.g);
            this.k = a2;
            bVar.a(a2);
            return;
        }
        UpnpDeviceDescriptor descriptor = this.m.descriptor();
        if (descriptor != null && descriptor.icons() != null && descriptor.icons().length > 0) {
            UpnpIcon upnpIcon = descriptor.icons()[0];
            String str = this.g;
            String url = upnpIcon.url();
            upnpIcon.mimeType();
            fVar.f866a.a(url, new b(fVar, str, new a(bVar)));
            return;
        }
        bVar.a(null);
    }
}
