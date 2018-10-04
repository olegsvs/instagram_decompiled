package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsPrefetchStartEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public String f45738B;

    public VpsPrefetchStartEvent(Parcel parcel) {
        this.f45738B = parcel.readString();
    }

    public VpsPrefetchStartEvent(String str) {
        this.f45738B = str;
    }

    public final int describeContents() {
        return AnonymousClass2l3.PREFETCH_START.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45738B);
    }
}
