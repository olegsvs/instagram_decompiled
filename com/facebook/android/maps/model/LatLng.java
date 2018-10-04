package com.facebook.android.maps.model;

import X.AnonymousClass2g3;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class LatLng implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2g3();
    /* renamed from: B */
    public final double f16936B;
    /* renamed from: C */
    public final double f16937C;

    public final int describeContents() {
        return 0;
    }

    public LatLng(double d, double d2) {
        this.f16936B = d;
        this.f16937C = d2;
    }

    public LatLng(Parcel parcel) {
        this.f16936B = parcel.readDouble();
        this.f16937C = parcel.readDouble();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LatLng)) {
                return false;
            }
            LatLng latLng = (LatLng) obj;
            if (Math.abs(this.f16936B - latLng.f16936B) >= 0.002d || Math.abs(this.f16937C - latLng.f16937C) >= 2.0E-4d) {
                z = false;
            }
        }
        return z;
    }

    public final int hashCode() {
        return (int) (((527.0d + this.f16936B) * 31.0d) + this.f16937C);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("{latitude=");
        stringBuilder.append(this.f16936B);
        stringBuilder.append(", longitude=");
        stringBuilder.append(this.f16937C);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f16936B);
        parcel.writeDouble(this.f16937C);
    }
}
