package a.e.i;

import a.b.k.r;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

/* compiled from: PrecomputedTextCompat.java */
/* loaded from: classes.dex */
public class a implements Spannable {
    @Override // java.lang.CharSequence
    public char charAt(int i) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        throw null;
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public int length() {
        throw null;
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        throw null;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        throw null;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        throw null;
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        throw null;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        throw null;
    }

    /* compiled from: PrecomputedTextCompat.java */
    /* renamed from: a.e.i.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0016a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f418a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f419b;

        /* renamed from: c, reason: collision with root package name */
        public final int f420c;
        public final int d;
        public final PrecomputedText.Params e = null;

        public C0016a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f418a = textPaint;
            this.f419b = textDirectionHeuristic;
            this.f420c = i;
            this.d = i2;
        }

        public boolean a(C0016a c0016a) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(c0016a.e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.f420c != c0016a.f420c || this.d != c0016a.d)) || this.f418a.getTextSize() != c0016a.f418a.getTextSize() || this.f418a.getTextScaleX() != c0016a.f418a.getTextScaleX() || this.f418a.getTextSkewX() != c0016a.f418a.getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.f418a.getLetterSpacing() != c0016a.f418a.getLetterSpacing() || !TextUtils.equals(this.f418a.getFontFeatureSettings(), c0016a.f418a.getFontFeatureSettings()))) || this.f418a.getFlags() != c0016a.f418a.getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.f418a.getTextLocales().equals(c0016a.f418a.getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f418a.getTextLocale().equals(c0016a.f418a.getTextLocale())) {
                return false;
            }
            return this.f418a.getTypeface() == null ? c0016a.f418a.getTypeface() == null : this.f418a.getTypeface().equals(c0016a.f418a.getTypeface());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0016a)) {
                return false;
            }
            C0016a c0016a = (C0016a) obj;
            if (a(c0016a)) {
                return Build.VERSION.SDK_INT < 18 || this.f419b == c0016a.f419b;
            }
            return false;
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return r.a(Float.valueOf(this.f418a.getTextSize()), Float.valueOf(this.f418a.getTextScaleX()), Float.valueOf(this.f418a.getTextSkewX()), Float.valueOf(this.f418a.getLetterSpacing()), Integer.valueOf(this.f418a.getFlags()), this.f418a.getTextLocales(), this.f418a.getTypeface(), Boolean.valueOf(this.f418a.isElegantTextHeight()), this.f419b, Integer.valueOf(this.f420c), Integer.valueOf(this.d));
            }
            if (i >= 21) {
                return r.a(Float.valueOf(this.f418a.getTextSize()), Float.valueOf(this.f418a.getTextScaleX()), Float.valueOf(this.f418a.getTextSkewX()), Float.valueOf(this.f418a.getLetterSpacing()), Integer.valueOf(this.f418a.getFlags()), this.f418a.getTextLocale(), this.f418a.getTypeface(), Boolean.valueOf(this.f418a.isElegantTextHeight()), this.f419b, Integer.valueOf(this.f420c), Integer.valueOf(this.d));
            }
            if (i >= 18) {
                return r.a(Float.valueOf(this.f418a.getTextSize()), Float.valueOf(this.f418a.getTextScaleX()), Float.valueOf(this.f418a.getTextSkewX()), Integer.valueOf(this.f418a.getFlags()), this.f418a.getTextLocale(), this.f418a.getTypeface(), this.f419b, Integer.valueOf(this.f420c), Integer.valueOf(this.d));
            }
            if (i >= 17) {
                return r.a(Float.valueOf(this.f418a.getTextSize()), Float.valueOf(this.f418a.getTextScaleX()), Float.valueOf(this.f418a.getTextSkewX()), Integer.valueOf(this.f418a.getFlags()), this.f418a.getTextLocale(), this.f418a.getTypeface(), this.f419b, Integer.valueOf(this.f420c), Integer.valueOf(this.d));
            }
            return r.a(Float.valueOf(this.f418a.getTextSize()), Float.valueOf(this.f418a.getTextScaleX()), Float.valueOf(this.f418a.getTextSkewX()), Integer.valueOf(this.f418a.getFlags()), this.f418a.getTypeface(), this.f419b, Integer.valueOf(this.f420c), Integer.valueOf(this.d));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder a2 = b.a.a.a.a.a("textSize=");
            a2.append(this.f418a.getTextSize());
            sb.append(a2.toString());
            sb.append(", textScaleX=" + this.f418a.getTextScaleX());
            sb.append(", textSkewX=" + this.f418a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                StringBuilder a3 = b.a.a.a.a.a(", letterSpacing=");
                a3.append(this.f418a.getLetterSpacing());
                sb.append(a3.toString());
                sb.append(", elegantTextHeight=" + this.f418a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                StringBuilder a4 = b.a.a.a.a.a(", textLocale=");
                a4.append(this.f418a.getTextLocales());
                sb.append(a4.toString());
            } else if (i >= 17) {
                StringBuilder a5 = b.a.a.a.a.a(", textLocale=");
                a5.append(this.f418a.getTextLocale());
                sb.append(a5.toString());
            }
            StringBuilder a6 = b.a.a.a.a.a(", typeface=");
            a6.append(this.f418a.getTypeface());
            sb.append(a6.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder a7 = b.a.a.a.a.a(", variationSettings=");
                a7.append(this.f418a.getFontVariationSettings());
                sb.append(a7.toString());
            }
            StringBuilder a8 = b.a.a.a.a.a(", textDir=");
            a8.append(this.f419b);
            sb.append(a8.toString());
            sb.append(", breakStrategy=" + this.f420c);
            sb.append(", hyphenationFrequency=" + this.d);
            sb.append("}");
            return sb.toString();
        }

        public C0016a(PrecomputedText.Params params) {
            this.f418a = params.getTextPaint();
            this.f419b = params.getTextDirection();
            this.f420c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }
    }
}
