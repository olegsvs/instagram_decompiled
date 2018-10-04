package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l2;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class VideoPlayerServiceEvent implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2l2();

    public int describeContents() {
        throw new AbstractMethodError("describeContents");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
