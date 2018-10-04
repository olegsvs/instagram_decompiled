package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1xk;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class SpatialAudioFocusParams implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1xk();
    /* renamed from: B */
    public final boolean f24765B;
    /* renamed from: C */
    public final double f24766C;
    /* renamed from: D */
    public final double f24767D;

    public final int describeContents() {
        return 0;
    }

    public SpatialAudioFocusParams(Parcel parcel) {
        boolean z = true;
        if (parcel.readByte() != (byte) 1) {
            z = false;
        }
        this.f24765B = z;
        this.f24767D = parcel.readDouble();
        this.f24766C = parcel.readDouble();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) this.f24765B);
        parcel.writeDouble(this.f24767D);
        parcel.writeDouble(this.f24766C);
    }
}
