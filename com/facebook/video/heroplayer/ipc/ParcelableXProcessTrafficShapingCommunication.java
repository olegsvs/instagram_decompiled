package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1a0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class ParcelableXProcessTrafficShapingCommunication implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1a0();
    /* renamed from: B */
    private long f24710B;
    /* renamed from: C */
    private long f24711C;

    public final int describeContents() {
        return 0;
    }

    public ParcelableXProcessTrafficShapingCommunication(Parcel parcel) {
        long[] jArr = new long[2];
        parcel.readLongArray(jArr);
        this.f24710B = jArr[0];
        this.f24711C = jArr[1];
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLongArray(new long[]{this.f24710B, this.f24711C});
    }
}
