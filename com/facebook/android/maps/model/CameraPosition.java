package com.facebook.android.maps.model;

import X.AnonymousClass2g1;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class CameraPosition implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2g1();
    /* renamed from: B */
    public final float f32295B;
    /* renamed from: C */
    public final LatLng f32296C;
    /* renamed from: D */
    public final float f32297D;
    /* renamed from: E */
    public final float f32298E;

    public final int describeContents() {
        return 0;
    }

    public CameraPosition(Parcel parcel) {
        this.f32296C = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f32298E = parcel.readFloat();
        this.f32297D = parcel.readFloat();
        this.f32295B = parcel.readFloat();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CameraPosition)) {
                return false;
            }
            CameraPosition cameraPosition = (CameraPosition) obj;
            if (this.f32295B == cameraPosition.f32295B) {
                LatLng latLng = this.f32296C;
                if (latLng == null) {
                    if (cameraPosition.f32296C == null) {
                    }
                } else if (latLng.equals(cameraPosition.f32296C) && this.f32297D == cameraPosition.f32297D && this.f32298E == cameraPosition.f32298E) {
                }
            }
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        LatLng latLng = this.f32296C;
        return (int) (((((((latLng != null ? 527.0f + ((float) latLng.hashCode()) : 17.0f) * 31.0f) + this.f32298E) * 31.0f) + this.f32297D) * 31.0f) + this.f32295B);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("{target=");
        stringBuilder.append(this.f32296C);
        stringBuilder.append(", zoom=");
        stringBuilder.append(this.f32298E);
        stringBuilder.append(", tilt=");
        stringBuilder.append(this.f32297D);
        stringBuilder.append(", bearing=");
        stringBuilder.append(this.f32295B);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f32296C, i);
        parcel.writeFloat(this.f32298E);
        parcel.writeFloat(this.f32297D);
        parcel.writeFloat(this.f32295B);
    }
}
