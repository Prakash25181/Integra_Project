package c.a.a;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.PushbackInputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;

/* compiled from: NanoHTTPD.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public final int f1642b;

    /* renamed from: c, reason: collision with root package name */
    public ServerSocket f1643c;
    public Thread e;
    public Set<Socket> d = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f1641a = null;
    public o g = new g(this, null);
    public b f = new e();

    /* compiled from: NanoHTTPD.java */
    /* renamed from: c.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0057a implements Runnable {

        /* compiled from: NanoHTTPD.java */
        /* renamed from: c.a.a.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0058a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Socket f1645b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InputStream f1646c;

            public RunnableC0058a(Socket socket, InputStream inputStream) {
                this.f1645b = socket;
                this.f1646c = inputStream;
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
            
                if (r0 != null) goto L64;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
            
                r0.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
            
                if (r0 == null) goto L41;
             */
            /* JADX WARN: Removed duplicated region for block: B:61:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:69:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    r9 = this;
                    r0 = 0
                    java.net.Socket r1 = r9.f1645b     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
                    java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L50
                    c.a.a.a$a r2 = c.a.a.a.RunnableC0057a.this     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a r2 = c.a.a.a.this     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a$o r2 = r2.g     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a$g r2 = (c.a.a.a.g) r2     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    if (r2 == 0) goto L48
                    c.a.a.a$f r4 = new c.a.a.a$f     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    r4.<init>()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a$h r0 = new c.a.a.a$h     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a$a r2 = c.a.a.a.RunnableC0057a.this     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    c.a.a.a r3 = c.a.a.a.this     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    java.io.InputStream r5 = r9.f1646c     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    java.net.Socket r2 = r9.f1645b     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    java.net.InetAddress r7 = r2.getInetAddress()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    r2 = r0
                    r6 = r1
                    r2.<init>(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                L29:
                    java.net.Socket r2 = r9.f1645b     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    boolean r2 = r2.isClosed()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    if (r2 != 0) goto L35
                    r0.a()     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                    goto L29
                L35:
                    if (r1 == 0) goto L3a
                    r1.close()     // Catch: java.io.IOException -> L3a
                L3a:
                    java.io.InputStream r0 = r9.f1646c
                    if (r0 == 0) goto L41
                    r0.close()     // Catch: java.io.IOException -> L41
                L41:
                    java.net.Socket r0 = r9.f1645b
                    if (r0 == 0) goto L7a
                    goto L77
                L46:
                    r0 = move-exception
                    goto L84
                L48:
                    throw r0     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L49
                L49:
                    r0 = move-exception
                    goto L54
                L4b:
                    r1 = move-exception
                    r8 = r1
                    r1 = r0
                    r0 = r8
                    goto L84
                L50:
                    r1 = move-exception
                    r8 = r1
                    r1 = r0
                    r0 = r8
                L54:
                    boolean r2 = r0 instanceof java.net.SocketException     // Catch: java.lang.Throwable -> L46
                    if (r2 == 0) goto L64
                    java.lang.String r2 = "NanoHttpd Shutdown"
                    java.lang.String r3 = r0.getMessage()     // Catch: java.lang.Throwable -> L46
                    boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L46
                    if (r2 != 0) goto L67
                L64:
                    r0.printStackTrace()     // Catch: java.lang.Throwable -> L46
                L67:
                    if (r1 == 0) goto L6c
                    r1.close()     // Catch: java.io.IOException -> L6c
                L6c:
                    java.io.InputStream r0 = r9.f1646c
                    if (r0 == 0) goto L73
                    r0.close()     // Catch: java.io.IOException -> L73
                L73:
                    java.net.Socket r0 = r9.f1645b
                    if (r0 == 0) goto L7a
                L77:
                    r0.close()     // Catch: java.io.IOException -> L7a
                L7a:
                    c.a.a.a$a r0 = c.a.a.a.RunnableC0057a.this
                    c.a.a.a r0 = c.a.a.a.this
                    java.net.Socket r1 = r9.f1645b
                    r0.b(r1)
                    return
                L84:
                    if (r1 == 0) goto L89
                    r1.close()     // Catch: java.io.IOException -> L89
                L89:
                    java.io.InputStream r1 = r9.f1646c
                    if (r1 == 0) goto L90
                    r1.close()     // Catch: java.io.IOException -> L90
                L90:
                    java.net.Socket r1 = r9.f1645b
                    if (r1 == 0) goto L97
                    r1.close()     // Catch: java.io.IOException -> L97
                L97:
                    c.a.a.a$a r1 = c.a.a.a.RunnableC0057a.this
                    c.a.a.a r1 = c.a.a.a.this
                    java.net.Socket r2 = r9.f1645b
                    r1.b(r2)
                    goto La2
                La1:
                    throw r0
                La2:
                    goto La1
                */
                throw new UnsupportedOperationException("Method not decompiled: c.a.a.a.RunnableC0057a.RunnableC0058a.run():void");
            }
        }

        public RunnableC0057a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            do {
                try {
                    Socket accept = a.this.f1643c.accept();
                    a.this.a(accept);
                    accept.setSoTimeout(5000);
                    InputStream inputStream = accept.getInputStream();
                    ((e) a.this.f).a(new RunnableC0058a(accept, inputStream));
                } catch (IOException unused) {
                }
            } while (!a.this.f1643c.isClosed());
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public static class c {
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public class d implements Iterable<String> {

        /* renamed from: b, reason: collision with root package name */
        public HashMap<String, String> f1647b = new HashMap<>();

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<c> f1648c = new ArrayList<>();

        public d(a aVar, Map<String, String> map) {
            String str = map.get("cookie");
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split("=");
                    if (split.length == 2) {
                        this.f1647b.put(split[0], split[1]);
                    }
                }
            }
        }

        public void a(k kVar) {
            Iterator<c> it = this.f1648c.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    kVar.d.put("Set-Cookie", String.format("%s=%s; expires=%s", null, null, null));
                } else {
                    throw null;
                }
            }
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f1647b.keySet().iterator();
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public static class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public long f1649a;

        public void a(Runnable runnable) {
            this.f1649a++;
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            StringBuilder a2 = b.a.a.a.a.a("NanoHttpd Request Processor (#");
            a2.append(this.f1649a);
            a2.append(")");
            thread.setName(a2.toString());
            thread.start();
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public static class f implements n {

        /* renamed from: a, reason: collision with root package name */
        public final List<m> f1650a;

        public f() {
            System.getProperty("java.io.tmpdir");
            this.f1650a = new ArrayList();
        }

        public void a() {
            Iterator<m> it = this.f1650a.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a();
                } catch (Exception unused) {
                }
            }
            this.f1650a.clear();
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public class g implements o {
        public /* synthetic */ g(a aVar, RunnableC0057a runnableC0057a) {
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public interface i {
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public enum j {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS;

        public static j a(String str) {
            for (j jVar : values()) {
                if (jVar.toString().equalsIgnoreCase(str)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public interface m {
        void a();
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public interface n {
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public interface o {
    }

    public a(int i2) {
        this.f1642b = i2;
    }

    public abstract k a(i iVar);

    public synchronized void a(Socket socket) {
        this.d.add(socket);
    }

    public void b() {
        ServerSocket serverSocket = new ServerSocket();
        this.f1643c = serverSocket;
        serverSocket.setReuseAddress(true);
        this.f1643c.bind(this.f1641a != null ? new InetSocketAddress(this.f1641a, this.f1642b) : new InetSocketAddress(this.f1642b));
        Thread thread = new Thread(new RunnableC0057a());
        this.e = thread;
        thread.setDaemon(true);
        this.e.setName("NanoHttpd Main Listener");
        this.e.start();
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public static final class l extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final k.b f1661b;

        public l(k.b bVar, String str) {
            super(str);
            this.f1661b = bVar;
        }

        public l(k.b bVar, String str, Exception exc) {
            super(str, exc);
            this.f1661b = bVar;
        }
    }

    public synchronized void a() {
        for (Socket socket : this.d) {
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC0059a f1656a;

        /* renamed from: b, reason: collision with root package name */
        public String f1657b;

        /* renamed from: c, reason: collision with root package name */
        public InputStream f1658c;
        public Map<String, String> d = new HashMap();
        public j e;

        /* compiled from: NanoHTTPD.java */
        /* renamed from: c.a.a.a$k$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0059a {
        }

        /* compiled from: NanoHTTPD.java */
        /* loaded from: classes.dex */
        public enum b implements InterfaceC0059a {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(202, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(206, "Partial Content"),
            REDIRECT(301, "Moved Permanently"),
            NOT_MODIFIED(304, "Not Modified"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            RANGE_NOT_SATISFIABLE(416, "Requested Range Not Satisfiable"),
            INTERNAL_ERROR(500, "Internal Server Error");


            /* renamed from: b, reason: collision with root package name */
            public final int f1659b;

            /* renamed from: c, reason: collision with root package name */
            public final String f1660c;

            b(int i, String str) {
                this.f1659b = i;
                this.f1660c = str;
            }

            public String a() {
                StringBuilder a2 = b.a.a.a.a.a("");
                a2.append(this.f1659b);
                a2.append(" ");
                a2.append(this.f1660c);
                return a2.toString();
            }
        }

        public k(InterfaceC0059a interfaceC0059a, String str, InputStream inputStream) {
            this.f1656a = interfaceC0059a;
            this.f1657b = str;
            this.f1658c = inputStream;
        }

        public void a(OutputStream outputStream) {
            String str = this.f1657b;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f1656a != null) {
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    StringBuilder sb = new StringBuilder();
                    sb.append("HTTP/1.1 ");
                    sb.append(((b) this.f1656a).a());
                    sb.append(" \r\n");
                    printWriter.print(sb.toString());
                    if (str != null) {
                        printWriter.print("Content-Type: " + str + "\r\n");
                    }
                    if (this.d == null || this.d.get("Date") == null) {
                        printWriter.print("Date: " + simpleDateFormat.format(new Date()) + "\r\n");
                    }
                    if (this.d != null) {
                        for (String str2 : this.d.keySet()) {
                            printWriter.print(str2 + ": " + this.d.get(str2) + "\r\n");
                        }
                    }
                    if (!a(this.d, "connection")) {
                        printWriter.print("Connection: keep-alive\r\n");
                    }
                    j jVar = this.e;
                    j jVar2 = j.HEAD;
                    int available = this.f1658c != null ? this.f1658c.available() : 0;
                    if (!a(this.d, "content-length")) {
                        printWriter.print("Content-Length: " + available + "\r\n");
                    }
                    printWriter.print("\r\n");
                    printWriter.flush();
                    if (this.e != j.HEAD && this.f1658c != null) {
                        byte[] bArr = new byte[16384];
                        while (available > 0) {
                            int read = this.f1658c.read(bArr, 0, available > 16384 ? 16384 : available);
                            if (read <= 0) {
                                break;
                            }
                            outputStream.write(bArr, 0, read);
                            available -= read;
                        }
                    }
                    outputStream.flush();
                    InputStream inputStream = this.f1658c;
                    if (inputStream != null) {
                        inputStream.close();
                        return;
                    }
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException unused) {
            }
        }

        public k(InterfaceC0059a interfaceC0059a, String str, String str2) {
            ByteArrayInputStream byteArrayInputStream;
            this.f1656a = interfaceC0059a;
            this.f1657b = str;
            if (str2 != null) {
                try {
                    byteArrayInputStream = new ByteArrayInputStream(str2.getBytes("UTF-8"));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    return;
                }
            } else {
                byteArrayInputStream = null;
            }
            this.f1658c = byteArrayInputStream;
        }

        public final boolean a(Map<String, String> map, String str) {
            Iterator<String> it = map.keySet().iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= it.next().equalsIgnoreCase(str);
            }
            return z;
        }
    }

    public String a(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public synchronized void b(Socket socket) {
        this.d.remove(socket);
    }

    /* compiled from: NanoHTTPD.java */
    /* loaded from: classes.dex */
    public class h implements i {

        /* renamed from: a, reason: collision with root package name */
        public final n f1651a;

        /* renamed from: b, reason: collision with root package name */
        public final OutputStream f1652b;

        /* renamed from: c, reason: collision with root package name */
        public PushbackInputStream f1653c;
        public int d;
        public int e;
        public String f;
        public j g;
        public Map<String, String> h;
        public Map<String, String> i;
        public d j;

        public h(n nVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            this.f1651a = nVar;
            this.f1653c = new PushbackInputStream(inputStream, 8192);
            this.f1652b = outputStream;
            String str = (inetAddress.isLoopbackAddress() || inetAddress.isAnyLocalAddress()) ? "127.0.0.1" : inetAddress.getHostAddress().toString();
            HashMap hashMap = new HashMap();
            this.i = hashMap;
            hashMap.put("remote-addr", str);
            this.i.put("http-client-ip", str);
        }

        public void a() {
            byte[] bArr;
            int read;
            try {
                try {
                    try {
                        try {
                            bArr = new byte[8192];
                            this.d = 0;
                            this.e = 0;
                            try {
                                read = this.f1653c.read(bArr, 0, 8192);
                            } catch (Exception unused) {
                                PushbackInputStream pushbackInputStream = this.f1653c;
                                if (pushbackInputStream != null) {
                                    try {
                                        pushbackInputStream.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                OutputStream outputStream = this.f1652b;
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (IOException unused3) {
                                    }
                                }
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                        } catch (l e) {
                            new k(e.f1661b, "text/plain", e.getMessage()).a(this.f1652b);
                            OutputStream outputStream2 = this.f1652b;
                            if (outputStream2 != null) {
                                outputStream2.close();
                            }
                        }
                    } catch (SocketTimeoutException e2) {
                        throw e2;
                    }
                } catch (SocketException e3) {
                    throw e3;
                } catch (IOException e4) {
                    new k(k.b.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e4.getMessage()).a(this.f1652b);
                    OutputStream outputStream3 = this.f1652b;
                    if (outputStream3 != null) {
                        outputStream3.close();
                    }
                }
                if (read == -1) {
                    PushbackInputStream pushbackInputStream2 = this.f1653c;
                    if (pushbackInputStream2 != null) {
                        try {
                            pushbackInputStream2.close();
                        } catch (IOException unused4) {
                        }
                    }
                    OutputStream outputStream4 = this.f1652b;
                    if (outputStream4 != null) {
                        try {
                            outputStream4.close();
                        } catch (IOException unused5) {
                        }
                    }
                    throw new SocketException("NanoHttpd Shutdown");
                }
                while (read > 0) {
                    int i = this.e + read;
                    this.e = i;
                    int a2 = a(bArr, i);
                    this.d = a2;
                    if (a2 > 0) {
                        break;
                    } else {
                        read = this.f1653c.read(bArr, this.e, 8192 - this.e);
                    }
                }
                if (this.d < this.e) {
                    this.f1653c.unread(bArr, this.d, this.e - this.d);
                }
                this.h = new HashMap();
                if (this.i == null) {
                    this.i = new HashMap();
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.e)));
                HashMap hashMap = new HashMap();
                a(bufferedReader, hashMap, this.h, this.i);
                j a3 = j.a((String) hashMap.get("method"));
                this.g = a3;
                if (a3 != null) {
                    this.f = (String) hashMap.get("uri");
                    this.j = new d(a.this, this.i);
                    k a4 = a.this.a(this);
                    if (a4 != null) {
                        this.j.a(a4);
                        a4.e = this.g;
                        a4.a(this.f1652b);
                        return;
                    }
                    throw new l(k.b.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                }
                throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Syntax error.");
            } finally {
                ((f) this.f1651a).a();
            }
        }

        public final void a(BufferedReader bufferedReader, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
            String a2;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            a(nextToken.substring(indexOf + 1), map2);
                            a2 = a.this.a(nextToken.substring(0, indexOf));
                        } else {
                            a2 = a.this.a(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            String readLine2 = bufferedReader.readLine();
                            while (readLine2 != null && readLine2.trim().length() > 0) {
                                int indexOf2 = readLine2.indexOf(58);
                                if (indexOf2 >= 0) {
                                    map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                                }
                                readLine2 = bufferedReader.readLine();
                            }
                        }
                        map.put("uri", a2);
                        return;
                    }
                    throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new l(k.b.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            } catch (IOException e) {
                k.b bVar = k.b.INTERNAL_ERROR;
                StringBuilder a3 = b.a.a.a.a.a("SERVER INTERNAL ERROR: IOException: ");
                a3.append(e.getMessage());
                throw new l(bVar, a3.toString(), e);
            }
        }

        public final int a(byte[] bArr, int i) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 3;
                if (i3 >= i) {
                    return 0;
                }
                if (bArr[i2] == 13 && bArr[i2 + 1] == 10 && bArr[i2 + 2] == 13 && bArr[i3] == 10) {
                    return i2 + 4;
                }
                i2++;
            }
        }

        public final void a(String str, Map<String, String> map) {
            if (str == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    map.put(a.this.a(nextToken.substring(0, indexOf)).trim(), a.this.a(nextToken.substring(indexOf + 1)));
                } else {
                    map.put(a.this.a(nextToken).trim(), "");
                }
            }
        }
    }
}
