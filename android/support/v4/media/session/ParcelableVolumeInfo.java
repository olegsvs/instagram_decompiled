package android.support.v4.media.session;

import X.AnonymousClass1mG;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1mG();
    /* renamed from: B */
    public int f22559B;
    /* renamed from: C */
    public int f22560C;
    /* renamed from: D */
    public int f22561D;
    /* renamed from: E */
    public int f22562E;
    /* renamed from: F */
    public int f22563F;

    public final int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f22563F = parcel.readInt();
        this.f22560C = parcel.readInt();
        this.f22562E = parcel.readInt();
        this.f22561D = parcel.readInt();
        this.f22559B = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22563F);
        parcel.writeInt(this.f22560C);
        parcel.writeInt(this.f22562E);
        parcel.writeInt(this.f22561D);
        parcel.writeInt(this.f22559B);
    }
}
