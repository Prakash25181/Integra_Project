package a.e.k;

import android.view.KeyEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: KeyEventDispatcher.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f428a = false;

    /* renamed from: b, reason: collision with root package name */
    public static Method f429b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f430c = false;
    public static Field d;

    /* compiled from: KeyEventDispatcher.java */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(a.e.k.c.a r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto Lf
            boolean r7 = r7.a(r10)
            return r7
        Lf:
            boolean r1 = r9 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L80
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L63
            android.app.ActionBar r8 = r9.getActionBar()
            int r1 = r10.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L63
            if (r8 == 0) goto L63
            boolean r1 = a.e.k.c.f428a
            if (r1 != 0) goto L4c
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r0] = r6     // Catch: java.lang.NoSuchMethodException -> L4a
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4a
            a.e.k.c.f429b = r1     // Catch: java.lang.NoSuchMethodException -> L4a
        L4a:
            a.e.k.c.f428a = r3
        L4c:
            java.lang.reflect.Method r1 = a.e.k.c.f429b
            if (r1 == 0) goto L60
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5f
            r4[r0] = r10     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L5f
            boolean r0 = r8.booleanValue()     // Catch: java.lang.Throwable -> L5f
            goto L60
        L5f:
        L60:
            if (r0 == 0) goto L63
            goto L7f
        L63:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6a
            goto L7f
        L6a:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = a.e.k.n.a(r7, r10)
            if (r8 == 0) goto L75
            goto L7f
        L75:
            if (r7 == 0) goto L7b
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        L7b:
            boolean r3 = r10.dispatch(r9, r2, r9)
        L7f:
            return r3
        L80:
            boolean r1 = r9 instanceof android.app.Dialog
            if (r1 == 0) goto Ld3
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = a.e.k.c.f430c
            if (r7 != 0) goto L99
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L97
            a.e.k.c.d = r7     // Catch: java.lang.NoSuchFieldException -> L97
            r7.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L97
        L97:
            a.e.k.c.f430c = r3
        L99:
            java.lang.reflect.Field r7 = a.e.k.c.d
            if (r7 == 0) goto La4
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La4
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La4
            goto La5
        La4:
            r7 = r2
        La5:
            if (r7 == 0) goto Lb2
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb2
            goto Ld2
        Lb2:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbd
            goto Ld2
        Lbd:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = a.e.k.n.a(r7, r10)
            if (r8 == 0) goto Lc8
            goto Ld2
        Lc8:
            if (r7 == 0) goto Lce
            android.view.KeyEvent$DispatcherState r2 = r7.getKeyDispatcherState()
        Lce:
            boolean r3 = r10.dispatch(r9, r2, r9)
        Ld2:
            return r3
        Ld3:
            if (r8 == 0) goto Ldb
            boolean r8 = a.e.k.n.a(r8, r10)
            if (r8 != 0) goto Le1
        Ldb:
            boolean r7 = r7.a(r10)
            if (r7 == 0) goto Le2
        Le1:
            r0 = 1
        Le2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.k.c.a(a.e.k.c$a, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }
}
