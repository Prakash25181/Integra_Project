package a.f.a;

import a.b.p.r0;
import android.database.Cursor;
import android.widget.Filter;

/* compiled from: CursorFilter.java */
/* loaded from: classes.dex */
public class b extends Filter {

    /* renamed from: a, reason: collision with root package name */
    public a f481a;

    /* compiled from: CursorFilter.java */
    /* loaded from: classes.dex */
    public interface a {
    }

    public b(a aVar) {
        this.f481a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((r0) this.f481a).b((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            a.f.a.b$a r0 = r4.f481a
            a.b.p.r0 r0 = (a.b.p.r0) r0
            r1 = 0
            if (r0 == 0) goto L4e
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
            goto L10
        Lc:
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r2 = r0.m
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L37
            androidx.appcompat.widget.SearchView r2 = r0.m
            int r2 = r2.getWindowVisibility()
            if (r2 == 0) goto L21
            goto L37
        L21:
            android.app.SearchableInfo r2 = r0.n     // Catch: java.lang.RuntimeException -> L2f
            r3 = 50
            android.database.Cursor r5 = r0.a(r2, r5, r3)     // Catch: java.lang.RuntimeException -> L2f
            if (r5 == 0) goto L37
            r5.getCount()     // Catch: java.lang.RuntimeException -> L2f
            goto L38
        L2f:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r2 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r2, r5)
        L37:
            r5 = r1
        L38:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L48
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L4d
        L48:
            r5 = 0
            r0.count = r5
            r0.values = r1
        L4d:
            return r0
        L4e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f.a.b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f481a;
        Cursor cursor = ((a.f.a.a) aVar).d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((r0) aVar).a((Cursor) obj);
    }
}
