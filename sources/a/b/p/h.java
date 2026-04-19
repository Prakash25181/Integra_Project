package a.b.p;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* compiled from: AppCompatCheckedTextView.java */
/* loaded from: classes.dex */
public class h extends CheckedTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f189c = {R.attr.checkMark};

    /* renamed from: b, reason: collision with root package name */
    public final y f190b;

    public h(Context context, AttributeSet attributeSet) {
        super(u0.a(context), attributeSet, R.attr.checkedTextViewStyle);
        y yVar = new y(this);
        this.f190b = yVar;
        yVar.a(attributeSet, R.attr.checkedTextViewStyle);
        this.f190b.a();
        x0 a2 = x0.a(getContext(), attributeSet, f189c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(a2.b(0));
        a2.f275b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f190b;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.b.k.r.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(a.b.l.a.a.c(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.b.k.r.a((TextView) this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.f190b;
        if (yVar != null) {
            yVar.a(context, i);
        }
    }
}
