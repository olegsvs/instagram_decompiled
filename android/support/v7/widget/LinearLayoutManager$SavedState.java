package android.support.v7.widget;

import X.AnonymousClass1Cz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Cz();
    /* renamed from: B */
    public boolean f15614B;
    /* renamed from: C */
    public int f15615C;
    /* renamed from: D */
    public int f15616D;

    public final int describeContents() {
        return 0;
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.f15616D = parcel.readInt();
        this.f15615C = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f15614B = z;
    }

    public LinearLayoutManager$SavedState(LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.f15616D = linearLayoutManager$SavedState.f15616D;
        this.f15615C = linearLayoutManager$SavedState.f15615C;
        this.f15614B = linearLayoutManager$SavedState.f15614B;
    }

    /* renamed from: A */
    public final boolean m9960A() {
        return this.f15616D >= 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f15616D);
        parcel.writeInt(this.f15615C);
        parcel.writeInt(this.f15614B);
    }
}
