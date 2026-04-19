package a.b.o.i;

import a.b.o.i.m;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* compiled from: MenuDialogHelper.java */
/* loaded from: classes.dex */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {

    /* renamed from: b, reason: collision with root package name */
    public g f131b;

    /* renamed from: c, reason: collision with root package name */
    public a.b.k.g f132c;
    public e d;

    public h(g gVar) {
        this.f131b = gVar;
    }

    @Override // a.b.o.i.m.a
    public void a(g gVar, boolean z) {
        a.b.k.g gVar2;
        if ((z || gVar == this.f131b) && (gVar2 = this.f132c) != null) {
            gVar2.dismiss();
        }
    }

    @Override // a.b.o.i.m.a
    public boolean a(g gVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f131b.a((i) this.d.a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        e eVar = this.d;
        g gVar = this.f131b;
        m.a aVar = eVar.i;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f132c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f132c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f131b.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f131b.performShortcut(i, keyEvent, 0);
    }
}
