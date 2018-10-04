package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsVideoCacheDatabaseFullEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public final String f45739B;

    public VpsVideoCacheDatabaseFullEvent(Parcel parcel) {
        this.f45739B = parcel.readString();
    }

    public VpsVideoCacheDatabaseFullEvent(String str) {
        this.f45739B = str;
    }

    public final int describeContents() {
        return AnonymousClass2l3.DATABASE_FULL.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45739B);
    }
}
