package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class VideoCacheStatus implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l0();
    /* renamed from: B */
    public boolean f33353B;
    /* renamed from: C */
    public String f33354C;

    public final int describeContents() {
        return 0;
    }

    public VideoCacheStatus(Parcel parcel) {
        this.f33354C = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f33353B = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33354C);
        parcel.writeInt(this.f33353B);
    }
}
