package com.facebook.location;

import X.AnonymousClass47S;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeofenceResult implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47S();
    /* renamed from: B */
    public final long f50489B;
    /* renamed from: C */
    public final ImmutableLocation f50490C;
    /* renamed from: D */
    public final float f50491D;
    /* renamed from: E */
    public final long f50492E;

    public final int describeContents() {
        return 0;
    }

    public GeofenceResult(Parcel parcel) {
        this.f50490C = (ImmutableLocation) parcel.readParcelable(ImmutableLocation.class.getClassLoader());
        this.f50492E = parcel.readLong();
        this.f50489B = parcel.readLong();
        this.f50491D = parcel.readFloat();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f50490C, i);
        parcel.writeLong(this.f50492E);
        parcel.writeLong(this.f50489B);
        parcel.writeFloat(this.f50491D);
    }
}
