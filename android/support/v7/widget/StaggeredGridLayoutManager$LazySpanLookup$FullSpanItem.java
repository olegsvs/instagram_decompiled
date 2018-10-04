package android.support.v7.widget;

import X.AnonymousClass1oN;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1oN();
    /* renamed from: B */
    public int f22919B;
    /* renamed from: C */
    public int[] f22920C;
    /* renamed from: D */
    public boolean f22921D;
    /* renamed from: E */
    public int f22922E;

    public final int describeContents() {
        return 0;
    }

    public StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem(Parcel parcel) {
        this.f22922E = parcel.readInt();
        this.f22919B = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f22921D = z;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f22920C = iArr;
            parcel.readIntArray(iArr);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FullSpanItem{mPosition=");
        stringBuilder.append(this.f22922E);
        stringBuilder.append(", mGapDir=");
        stringBuilder.append(this.f22919B);
        stringBuilder.append(", mHasUnwantedGapAfter=");
        stringBuilder.append(this.f22921D);
        stringBuilder.append(", mGapPerSpan=");
        stringBuilder.append(Arrays.toString(this.f22920C));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22922E);
        parcel.writeInt(this.f22919B);
        parcel.writeInt(this.f22921D);
        int[] iArr = this.f22920C;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f22920C);
    }
}
