package a.e.l;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* compiled from: TextViewCompat.java */
/* loaded from: classes.dex */
public class d implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f474a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f475b;

    /* renamed from: c, reason: collision with root package name */
    public Class f476c;
    public Method d;
    public boolean e;
    public boolean f = false;

    public d(ActionMode.Callback callback, TextView textView) {
        this.f474a = callback;
        this.f475b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f474a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f474a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode actionMode) {
        this.f474a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.l.d.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
