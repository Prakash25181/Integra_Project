package b.b.a.a.f;

import android.view.MotionEvent;
import android.view.View;
import b.b.a.a.f.s;

/* compiled from: SidebarFragment.java */
/* loaded from: classes.dex */
public class y implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.f f1639b;

    public y(s.f fVar) {
        this.f1639b = fVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1639b.f1629a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                s.f fVar = this.f1639b;
                fVar.h = true;
                fVar.a();
                return true;
            }
            if (action == 1) {
                s.f fVar2 = this.f1639b;
                if (fVar2.h) {
                    fVar2.h = false;
                    fVar2.a();
                    if (this.f1639b.f1629a != null && 0.0f <= motionEvent.getX() && motionEvent.getX() < view.getWidth() && 0.0f <= motionEvent.getY() && motionEvent.getY() < view.getHeight()) {
                        s.f fVar3 = this.f1639b;
                        s.a(s.this, fVar3.f1629a);
                    }
                }
                return true;
            }
            if (action == 2) {
                return this.f1639b.h;
            }
            if (action == 3 || action == 4) {
                s.f fVar4 = this.f1639b;
                fVar4.h = false;
                fVar4.a();
                return true;
            }
        }
        return false;
    }
}
