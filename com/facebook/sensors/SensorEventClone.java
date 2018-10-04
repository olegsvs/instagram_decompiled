package com.facebook.sensors;

import X.AnonymousClass47j;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public class SensorEventClone implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47j();
    /* renamed from: B */
    public final int f50551B;
    /* renamed from: C */
    public final int f50552C;
    /* renamed from: D */
    public final long f50553D;
    /* renamed from: E */
    public final float[] f50554E;

    public final int describeContents() {
        return 0;
    }

    public SensorEventClone(Parcel parcel) {
        this.f50551B = parcel.readInt();
        this.f50552C = parcel.readInt();
        this.f50553D = parcel.readLong();
        float[] fArr = new float[parcel.readInt()];
        this.f50554E = fArr;
        parcel.readFloatArray(fArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                SensorEventClone sensorEventClone = (SensorEventClone) obj;
                if (this.f50551B == sensorEventClone.f50551B) {
                    if (this.f50552C == sensorEventClone.f50552C) {
                        if (this.f50553D == sensorEventClone.f50553D) {
                            return Arrays.equals(this.f50554E, sensorEventClone.f50554E);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f50551B * 31) + this.f50552C) * 31;
        long j = this.f50553D;
        return ((i + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f50554E);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50551B);
        parcel.writeInt(this.f50552C);
        parcel.writeLong(this.f50553D);
        parcel.writeInt(this.f50554E.length);
        parcel.writeFloatArray(this.f50554E);
    }
}
