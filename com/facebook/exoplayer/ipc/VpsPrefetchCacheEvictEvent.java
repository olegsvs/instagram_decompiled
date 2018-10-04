package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsPrefetchCacheEvictEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public String f45737B;

    public VpsPrefetchCacheEvictEvent(Parcel parcel) {
        this.f45737B = parcel.readString();
    }

    public VpsPrefetchCacheEvictEvent(String str) {
        this.f45737B = str;
    }

    public final int describeContents() {
        return AnonymousClass2l3.PREFETCH_CACHE_EVICT.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45737B);
    }
}
