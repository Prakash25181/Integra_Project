package a.e.e.b;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f359a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f360b;

    /* renamed from: c, reason: collision with root package name */
    public int f361c;

    public a(Shader shader, ColorStateList colorStateList, int i) {
        this.f359a = shader;
        this.f360b = colorStateList;
        this.f361c = i;
    }

    public boolean a() {
        return this.f359a != null;
    }

    public boolean b() {
        ColorStateList colorStateList;
        return this.f359a == null && (colorStateList = this.f360b) != null && colorStateList.isStateful();
    }

    public boolean a(int[] iArr) {
        if (b()) {
            ColorStateList colorStateList = this.f360b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f361c) {
                this.f361c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x014f, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.e.e.b.a a(android.content.res.Resources r26, int r27, android.content.res.Resources.Theme r28) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.e.b.a.a(android.content.res.Resources, int, android.content.res.Resources$Theme):a.e.e.b.a");
    }
}
