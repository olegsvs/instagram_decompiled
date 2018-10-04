package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1xc;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class DeviceOrientationFrame implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1xc();
    /* renamed from: B */
    public float f24681B;
    /* renamed from: C */
    public float f24682C;
    /* renamed from: D */
    public float[] f24683D;
    /* renamed from: E */
    public float f24684E;

    public final int describeContents() {
        return 0;
    }

    public DeviceOrientationFrame(Parcel parcel) {
        this.f24681B = parcel.readFloat();
        this.f24684E = parcel.readFloat();
        this.f24682C = parcel.readFloat();
        this.f24683D = parcel.createFloatArray();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f24681B);
        parcel.writeFloat(this.f24684E);
        parcel.writeFloat(this.f24682C);
        parcel.writeFloatArray(this.f24683D);
    }
}
