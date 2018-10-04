package android.support.v7.widget;

import X.AnonymousClass1oO;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.List;

public class StaggeredGridLayoutManager$SavedState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1oO();
    /* renamed from: B */
    public boolean f22923B;
    /* renamed from: C */
    public int f22924C;
    /* renamed from: D */
    public List f22925D;
    /* renamed from: E */
    public boolean f22926E;
    /* renamed from: F */
    public boolean f22927F;
    /* renamed from: G */
    public int[] f22928G;
    /* renamed from: H */
    public int f22929H;
    /* renamed from: I */
    public int[] f22930I;
    /* renamed from: J */
    public int f22931J;
    /* renamed from: K */
    public int f22932K;

    public final int describeContents() {
        return 0;
    }

    public StaggeredGridLayoutManager$SavedState(Parcel parcel) {
        this.f22924C = parcel.readInt();
        this.f22932K = parcel.readInt();
        int readInt = parcel.readInt();
        this.f22931J = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f22930I = iArr;
            parcel.readIntArray(iArr);
        }
        readInt = parcel.readInt();
        this.f22929H = readInt;
        if (readInt > 0) {
            iArr = new int[readInt];
            this.f22928G = iArr;
            parcel.readIntArray(iArr);
        }
        boolean z = false;
        this.f22927F = parcel.readInt() == 1;
        this.f22923B = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f22926E = z;
        this.f22925D = parcel.readArrayList(StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class.getClassLoader());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22924C);
        parcel.writeInt(this.f22932K);
        parcel.writeInt(this.f22931J);
        if (this.f22931J > 0) {
            parcel.writeIntArray(this.f22930I);
        }
        parcel.writeInt(this.f22929H);
        if (this.f22929H > 0) {
            parcel.writeIntArray(this.f22928G);
        }
        parcel.writeInt(this.f22927F);
        parcel.writeInt(this.f22923B);
        parcel.writeInt(this.f22926E);
        parcel.writeList(this.f22925D);
    }
}
