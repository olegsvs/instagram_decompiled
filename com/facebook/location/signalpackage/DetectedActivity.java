package com.facebook.location.signalpackage;

import X.AnonymousClass47c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class DetectedActivity implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47c();
    /* renamed from: B */
    public final int f50515B;
    /* renamed from: C */
    public final int f50516C;

    public final int describeContents() {
        return 0;
    }

    public DetectedActivity(int i, int i2) {
        this.f50516C = i;
        this.f50515B = i2;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DetectedActivity detectedActivity = (DetectedActivity) obj;
                    if (this.f50516C == detectedActivity.f50516C) {
                        if (this.f50515B != detectedActivity.f50515B) {
                            z = false;
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.f50516C * 31) + this.f50515B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50516C);
        parcel.writeInt(this.f50515B);
    }
}
