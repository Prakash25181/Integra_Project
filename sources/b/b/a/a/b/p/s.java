package b.b.a.a.b.p;

import android.util.Log;
import b.b.a.a.b.p.r;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Timer;

/* compiled from: IscpIoReal.java */
/* loaded from: classes.dex */
public class s extends r {
    public SocketChannel h;
    public Selector i;
    public SelectionKey j;
    public boolean k;
    public ByteBuffer l;
    public Timer m;
    public boolean n;
    public int o;

    /* compiled from: IscpIoReal.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = s.this;
            sVar.h = null;
            sVar.i = null;
            sVar.j = null;
            try {
                sVar.h = SocketChannel.open(new InetSocketAddress(s.this.f901b.j, s.this.f901b.d));
                s.this.h.configureBlocking(false);
                s sVar2 = s.this;
                sVar2.k = true;
                sVar2.n = true;
                sVar2.e.post(new o(sVar2));
                try {
                    s.this.l = ByteBuffer.allocate(32768);
                    s.this.o = 0;
                    s.this.i = Selector.open();
                    s.this.j = s.this.h.register(s.this.i, 1);
                    while (!s.this.f902c.isInterrupted()) {
                        try {
                            s.this.j.interestOps((s.this.n && s.this.b()) ? 5 : 1);
                            if (s.this.i.select() > 0 && s.this.i.selectedKeys().contains(s.this.j)) {
                                s.this.i.selectedKeys().remove(s.this.j);
                                if (!s.this.i.isOpen()) {
                                    break;
                                }
                                if (s.this.j.isReadable()) {
                                    s.a(s.this, (SocketChannel) s.this.j.channel());
                                }
                                if (s.this.j.isWritable()) {
                                    s.b(s.this, (SocketChannel) s.this.j.channel());
                                }
                            }
                        } catch (CancelledKeyException unused) {
                        }
                    }
                } catch (ClosedChannelException e) {
                    e.printStackTrace();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                s.a(s.this);
                Timer timer = s.this.m;
                if (timer != null) {
                    timer.cancel();
                    s.this.m = null;
                }
                s sVar3 = s.this;
                boolean z = sVar3.k;
                sVar3.k = false;
                sVar3.n = false;
                if (z) {
                    sVar3.e.post(new p(sVar3));
                }
                Log.d("ISCP", "I/O thread terminated");
            } catch (IOException e3) {
                e3.printStackTrace();
                s.a(s.this);
                s sVar4 = s.this;
                sVar4.e.post(new n(sVar4));
            }
        }
    }

    public s(g gVar, r.a aVar) {
        super(gVar, aVar);
        this.d = new a();
    }

    public static /* synthetic */ void a(s sVar) {
        SelectionKey selectionKey = sVar.j;
        if (selectionKey != null) {
            selectionKey.cancel();
            sVar.j = null;
        }
        Selector selector = sVar.i;
        if (selector != null) {
            try {
                if (selector.isOpen()) {
                    sVar.i.close();
                }
                sVar.i = null;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (sVar.h != null && sVar.h.isOpen() && sVar.h.isConnected()) {
                sVar.h.socket().shutdownInput();
                sVar.h.socket().shutdownOutput();
            }
        } catch (IOException unused) {
        }
        try {
            if (sVar.h != null && sVar.h.isOpen()) {
                sVar.h.close();
            }
        } catch (IOException unused2) {
        }
        sVar.h = null;
    }

    public static /* synthetic */ void b(s sVar, SocketChannel socketChannel) {
        sVar.n = false;
        r.b d = sVar.d();
        if (d == null) {
            sVar.n = true;
            return;
        }
        byte[] a2 = b.b.a.a.b.p.v.c.a(sVar.f901b.f873b, d.f904b);
        socketChannel.write(ByteBuffer.wrap(a2));
        Log.d("ISCP", "send " + d.f904b + " (" + a2.length + ")bytes ");
        Timer timer = new Timer(false);
        sVar.m = timer;
        timer.schedule(new t(sVar), 100L);
    }

    @Override // b.b.a.a.b.p.r
    public boolean c() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r8.l.position(r2);
        r8.l.compact();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(b.b.a.a.b.p.s r8, java.nio.channels.SocketChannel r9) {
        /*
            java.nio.ByteBuffer r0 = r8.l
            int r1 = r0.capacity()
            r0.limit(r1)
            java.nio.ByteBuffer r0 = r8.l
            int r9 = r9.read(r0)
            if (r9 > 0) goto L13
            goto Ld6
        L13:
            java.nio.ByteBuffer r0 = r8.l
            r0.flip()
            java.nio.ByteBuffer r0 = r8.l
            byte[] r0 = r0.array()
            int r1 = r8.o
            int r9 = r9 + r1
            r1 = 0
            r2 = 0
        L23:
            java.nio.ByteBuffer r3 = r8.l
            int r3 = r3.limit()
            if (r2 >= r3) goto Lcc
            int r3 = r9 - r2
            int r4 = b.b.a.a.b.p.v.c.a(r0, r2, r3)
            java.lang.String r5 = "ISCP"
            if (r4 >= 0) goto L43
            java.lang.String r9 = "invalid packet"
            android.util.Log.w(r5, r9)
            r8.o = r1
            java.nio.ByteBuffer r8 = r8.l
            r8.clear()
            goto Ld6
        L43:
            r8.o = r4
            if (r4 <= 0) goto L6f
            if (r2 != 0) goto Lcc
            int r9 = b.b.a.a.b.p.v.c.b(r0, r2, r3)
            java.nio.ByteBuffer r0 = r8.l
            int r0 = r0.capacity()
            if (r9 <= r0) goto Lcc
            r9 = 1
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9[r1] = r0
            java.lang.String r0 = "packet size too big (%d bytes)"
            java.lang.String r9 = java.lang.String.format(r0, r9)
            android.util.Log.w(r5, r9)
            r8.o = r1
            java.nio.ByteBuffer r9 = r8.l
            r9.clear()
            goto Lcc
        L6f:
            int r4 = b.b.a.a.b.p.v.c.b(r0, r2, r3)
            if (r4 > r3) goto Lc8
            r3 = 0
            b.b.a.a.b.p.v.b r3 = b.b.a.a.b.p.v.c.a(r0, r2, r4, r3)
            if (r3 == 0) goto Lc2
            b.b.a.a.b.p.v.a r6 = r3.f912b
            b.b.a.a.b.p.v.a r7 = b.b.a.a.b.p.v.a.nul
            if (r6 == r7) goto L9e
            java.lang.String r6 = "rcv "
            java.lang.StringBuilder r6 = b.a.a.a.a.a(r6)
            b.b.a.a.b.p.v.a r7 = r3.f912b
            java.lang.String r7 = r7.f910b
            r6.append(r7)
            b.b.a.a.b.p.v.d r7 = r3.f913c
            java.lang.String r7 = r7.f915a
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto Lb7
        L9e:
            java.lang.String r6 = "rcv <NOT REGIST> "
            java.lang.StringBuilder r6 = b.a.a.a.a.a(r6)
            java.lang.String r7 = r3.f
            r6.append(r7)
            b.b.a.a.b.p.v.d r7 = r3.f913c
            java.lang.String r7 = r7.f915a
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        Lb7:
            android.os.Handler r5 = r8.e
            b.b.a.a.b.p.q r6 = new b.b.a.a.b.p.q
            r6.<init>(r8, r3)
            r5.post(r6)
            goto Lc9
        Lc2:
            java.lang.String r3 = "command parse failed "
            android.util.Log.w(r5, r3)
            goto Lc9
        Lc8:
            r4 = 0
        Lc9:
            int r2 = r2 + r4
            goto L23
        Lcc:
            java.nio.ByteBuffer r9 = r8.l
            r9.position(r2)
            java.nio.ByteBuffer r8 = r8.l
            r8.compact()
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.a.a.b.p.s.a(b.b.a.a.b.p.s, java.nio.channels.SocketChannel):void");
    }

    @Override // b.b.a.a.b.p.r
    public void a() {
        SelectionKey selectionKey = this.j;
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        super.a();
    }

    @Override // b.b.a.a.b.p.r
    public void a(b.b.a.a.b.p.v.a aVar, String str) {
        super.a(aVar, str);
        if (this.k && this.n && this.j != null) {
            this.i.wakeup();
        }
    }
}
