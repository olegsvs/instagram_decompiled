package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1xh;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableTimeRange implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1xh();
    /* renamed from: B */
    public final long f24708B;
    /* renamed from: C */
    public final long f24709C;

    public final int describeContents() {
        return 0;
    }

    public ParcelableTimeRange(long j, long j2) {
        this.f24709C = j;
        this.f24708B = j2;
    }

    public ParcelableTimeRange(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24709C);
        parcel.writeLong(this.f24708B);
    }
}
