package a.b.p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper.java */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public TextView f272a;

    /* renamed from: b, reason: collision with root package name */
    public TextClassifier f273b;

    public x(TextView textView) {
        if (textView != null) {
            this.f272a = textView;
            return;
        }
        throw null;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f273b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.f272a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
