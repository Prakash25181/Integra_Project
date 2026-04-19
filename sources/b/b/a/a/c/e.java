package b.b.a.a.c;

import android.widget.SectionIndexer;
import java.util.ArrayList;

/* compiled from: MediaSection.java */
/* loaded from: classes.dex */
public class e implements SectionIndexer {

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<f> f1111b;

    public e(ArrayList<f> arrayList) {
        this.f1111b = arrayList;
    }

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        ArrayList<f> arrayList = this.f1111b;
        if (arrayList == null || arrayList.size() == 0) {
            return 0;
        }
        if (i < this.f1111b.size()) {
            return this.f1111b.get(i).f1112a;
        }
        return this.f1111b.get(r2.size() - 1).f1112a;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        ArrayList<f> arrayList = this.f1111b;
        if (arrayList == null || arrayList.size() == 0) {
            return 0;
        }
        for (int i2 = 1; i2 < this.f1111b.size(); i2++) {
            if (this.f1111b.get(i2).f1112a > i) {
                return i2 - 1;
            }
        }
        return this.f1111b.size() - 1;
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        ArrayList<f> arrayList = this.f1111b;
        return arrayList != null ? arrayList.toArray() : new Object[0];
    }
}
