package b.b.a.a.b.u;

import android.net.Uri;
import android.util.Log;
import b.b.a.a.c.d;
import c.a.a.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/* compiled from: HttpStreamingServer.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public d.g f1061a;

    /* renamed from: b, reason: collision with root package name */
    public d.g f1062b;

    /* renamed from: c, reason: collision with root package name */
    public a f1063c = new a(18657);

    public final String a(int i, String str) {
        String str2;
        Object[] objArr = new Object[3];
        ServerSocket serverSocket = this.f1063c.f1643c;
        int localPort = serverSocket == null ? -1 : serverSocket.getLocalPort();
        if (localPort == -1) {
            localPort = 18657;
        }
        Object[] objArr2 = new Object[2];
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            loop0: while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                if (nextElement.getName().equals("wlan0")) {
                    Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                    while (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement2 = inetAddresses.nextElement();
                        if (!nextElement2.isLoopbackAddress() && (nextElement2 instanceof Inet4Address)) {
                            str2 = nextElement2.getHostAddress().toString();
                            break loop0;
                        }
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        str2 = null;
        objArr2[0] = str2;
        objArr2[1] = Integer.valueOf(localPort);
        objArr[0] = String.format("http://%s:%d", objArr2);
        objArr[1] = Integer.valueOf(i);
        objArr[2] = str;
        return String.format("%s/%d?type=%s", objArr);
    }

    /* compiled from: HttpStreamingServer.java */
    /* loaded from: classes.dex */
    public class a extends c.a.a.a {

        /* compiled from: HttpStreamingServer.java */
        /* renamed from: b.b.a.a.b.u.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0031a extends FileInputStream {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f1064b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0031a(a aVar, File file, long j) {
                super(file);
                this.f1064b = j;
            }

            @Override // java.io.FileInputStream, java.io.InputStream
            public int available() {
                return (int) this.f1064b;
            }
        }

        public a(int i) {
            super(i);
        }

        @Override // c.a.a.a
        public a.k a(a.i iVar) {
            a.h hVar = (a.h) iVar;
            Map<String, String> map = hVar.i;
            Map<String, String> map2 = hVar.h;
            Uri parse = Uri.parse(hVar.f);
            if (hVar.g != a.j.GET) {
                return a(a.k.b.METHOD_NOT_ALLOWED);
            }
            StringBuilder a2 = b.a.a.a.a.a("HTTP Request : ");
            a2.append(hVar.f);
            Log.v("UPnP", a2.toString());
            String str = map2.get("type");
            List<String> pathSegments = parse.getPathSegments();
            if (str != null) {
                try {
                    if (pathSegments.size() != 1) {
                        return a(a.k.b.BAD_REQUEST);
                    }
                    int parseInt = Integer.parseInt(pathSegments.get(0));
                    if (str.compareTo("stream") == 0) {
                        if (b.this.f1062b != null && parseInt == b.this.f1062b.f1093a) {
                            b.this.f1061a = b.this.f1062b;
                            b.this.f1062b = null;
                        }
                        if (b.this.f1061a != null && parseInt == b.this.f1061a.f1093a) {
                            d.g gVar = b.this.f1061a;
                            return a(map, gVar.j, gVar.h);
                        }
                        Log.v("UPnP", "Invalid Stream Requested");
                    }
                    if (str.compareTo("artwork") == 0) {
                        if (b.this.f1061a != null && parseInt == b.this.f1061a.f1093a) {
                            return a(map, b.this.f1061a);
                        }
                        if (b.this.f1062b != null && parseInt == b.this.f1062b.f1093a) {
                            return a(map, b.this.f1062b);
                        }
                        Log.v("UPnP", "Invalid Album Requested");
                    }
                } catch (NumberFormatException unused) {
                }
            }
            return a(a.k.b.BAD_REQUEST);
        }

        public final a.k a(Map<String, String> map, String str, String str2) {
            a aVar;
            int indexOf;
            long parseLong;
            File file;
            long length;
            a.k kVar;
            try {
                try {
                    String str3 = map.get("range");
                    long j = -1;
                    if (str3 != null) {
                        try {
                            if (str3.startsWith("bytes=") && (indexOf = (str3 = str3.substring(6)).indexOf(45)) > 0) {
                                try {
                                    parseLong = Long.parseLong(str3.substring(0, indexOf));
                                    try {
                                        j = Long.parseLong(str3.substring(indexOf + 1));
                                    } catch (NumberFormatException unused) {
                                    }
                                } catch (NumberFormatException unused2) {
                                }
                                file = new File(str2);
                                length = file.length();
                                if (str3 != null || parseLong < 0) {
                                    kVar = new a.k(a.k.b.OK, str, new FileInputStream(file));
                                    kVar.d.put("Accept-Ranges", "bytes");
                                    kVar.d.put("Content-Length", "" + length);
                                } else if (parseLong >= length) {
                                    kVar = new a.k(a.k.b.RANGE_NOT_SATISFIABLE, "text/plain", "");
                                    kVar.d.put("Accept-Ranges", "bytes");
                                    kVar.d.put("Content-Range", "bytes 0-0/" + length);
                                } else {
                                    if (j < 0) {
                                        j = length - 1;
                                    }
                                    long j2 = (j - parseLong) + 1;
                                    long j3 = j2 >= 0 ? j2 : 0L;
                                    C0031a c0031a = new C0031a(this, file, j3);
                                    c0031a.skip(parseLong);
                                    a.k kVar2 = new a.k(a.k.b.PARTIAL_CONTENT, str, c0031a);
                                    kVar2.d.put("Accept-Ranges", "bytes");
                                    kVar2.d.put("Content-Length", "" + j3);
                                    kVar2.d.put("Content-Range", "bytes " + parseLong + "-" + j + "/" + length);
                                    kVar = kVar2;
                                }
                                Log.v("UPnP", "Start Streaming : " + str2);
                                return kVar;
                            }
                        } catch (FileNotFoundException unused3) {
                            aVar = this;
                            return aVar.a(a.k.b.NO_CONTENT);
                        }
                    }
                    parseLong = 0;
                    file = new File(str2);
                    length = file.length();
                    if (str3 != null) {
                    }
                    kVar = new a.k(a.k.b.OK, str, new FileInputStream(file));
                    kVar.d.put("Accept-Ranges", "bytes");
                    kVar.d.put("Content-Length", "" + length);
                    Log.v("UPnP", "Start Streaming : " + str2);
                    return kVar;
                } catch (FileNotFoundException unused4) {
                    aVar = this;
                }
            } catch (IOException unused5) {
                return a(a.k.b.INTERNAL_ERROR);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final c.a.a.a.k a(java.util.Map<java.lang.String, java.lang.String> r10, b.b.a.a.c.d.g r11) {
            /*
                r9 = this;
                b.b.a.a.c.a r11 = r11.i
                r0 = 0
                if (r11 == 0) goto L8
                java.lang.String r11 = r11.f1080b
                goto L9
            L8:
                r11 = r0
            L9:
                if (r11 != 0) goto L12
                c.a.a.a$k$b r10 = c.a.a.a.k.b.NOT_FOUND
                c.a.a.a$k r10 = r9.a(r10)
                return r10
            L12:
                r1 = 46
                int r1 = r11.lastIndexOf(r1)
                r2 = -1
                java.lang.String r3 = "image/jpeg"
                java.lang.String r4 = "image/png"
                if (r1 == r2) goto L43
                java.lang.String r1 = r11.substring(r1)
                java.lang.String r1 = r1.toLowerCase()
                java.lang.String r2 = ".png"
                int r2 = r1.compareTo(r2)
                if (r2 != 0) goto L31
                r1 = r4
                goto L44
            L31:
                java.lang.String r2 = ".jpg"
                int r2 = r1.compareTo(r2)
                if (r2 == 0) goto L41
                java.lang.String r2 = ".jpeg"
                int r1 = r1.compareTo(r2)
                if (r1 != 0) goto L43
            L41:
                r1 = r3
                goto L44
            L43:
                r1 = r0
            L44:
                if (r1 != 0) goto L88
                r1 = 8
                byte[] r2 = new byte[r1]     // Catch: java.io.IOException -> L87
                java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.io.IOException -> L87
                r5.<init>(r11)     // Catch: java.io.IOException -> L87
                r6 = 0
                int r7 = r5.read(r2, r6, r1)     // Catch: java.io.IOException -> L87
                r5.close()     // Catch: java.io.IOException -> L87
                if (r7 != r1) goto L87
                r1 = r2[r6]     // Catch: java.io.IOException -> L87
                r5 = 137(0x89, float:1.92E-43)
                r7 = 2
                r8 = 1
                if (r1 != r5) goto L76
                r1 = r2[r8]     // Catch: java.io.IOException -> L87
                r5 = 80
                if (r1 != r5) goto L76
                r1 = r2[r7]     // Catch: java.io.IOException -> L87
                r5 = 78
                if (r1 != r5) goto L76
                r1 = 3
                r1 = r2[r1]     // Catch: java.io.IOException -> L87
                r5 = 71
                if (r1 != r5) goto L76
                r0 = r4
                goto L87
            L76:
                r1 = r2[r6]     // Catch: java.io.IOException -> L87
                r4 = 255(0xff, float:3.57E-43)
                if (r1 != r4) goto L87
                r1 = r2[r8]     // Catch: java.io.IOException -> L87
                r5 = 216(0xd8, float:3.03E-43)
                if (r1 != r5) goto L87
                r1 = r2[r7]     // Catch: java.io.IOException -> L87
                if (r1 != r4) goto L87
                r0 = r3
            L87:
                r1 = r0
            L88:
                c.a.a.a$k r10 = r9.a(r10, r1, r11)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.u.b.a.a(java.util.Map, b.b.a.a.c.d$g):c.a.a.a$k");
        }

        public final a.k a(a.k.b bVar) {
            return new a.k(bVar, "text/plain", bVar.a());
        }
    }
}
