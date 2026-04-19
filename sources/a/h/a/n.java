package a.h.a;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<p> f522b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<String> f523c;
    public b[] d;
    public String e;
    public int f;

    /* compiled from: FragmentManagerState.java */
    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i) {
            return new n[i];
        }
    }

    public n() {
        this.e = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f522b);
        parcel.writeStringList(this.f523c);
        parcel.writeTypedArray(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    public n(Parcel parcel) {
        this.e = null;
        this.f522b = parcel.createTypedArrayList(p.CREATOR);
        this.f523c = parcel.createStringArrayList();
        this.d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }
}
