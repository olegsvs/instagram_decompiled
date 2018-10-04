package com.facebook.location;

import X.AnonymousClass47N;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Coordinates implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47N();
    /* renamed from: B */
    public final Float f50474B;
    /* renamed from: C */
    public final double f50475C;
    /* renamed from: D */
    public final double f50476D;

    public final int describeContents() {
        return 0;
    }

    public Coordinates(Parcel parcel) {
        this.f50475C = parcel.readDouble();
        this.f50476D = parcel.readDouble();
        this.f50474B = (Float) parcel.readValue(null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f50475C);
        parcel.writeDouble(this.f50476D);
        parcel.writeValue(this.f50474B);
    }
}
