package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsManifestMisalignedEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public final String f45731B;
    /* renamed from: C */
    public final String f45732C;
    /* renamed from: D */
    public final String f45733D;
    /* renamed from: E */
    public final String f45734E;

    public VpsManifestMisalignedEvent(Parcel parcel) {
        this.f45734E = parcel.readString();
        this.f45733D = parcel.readString();
        this.f45732C = parcel.readString();
        this.f45731B = parcel.readString();
    }

    public VpsManifestMisalignedEvent(String str, String str2, String str3, String str4) {
        this.f45734E = str;
        this.f45733D = str2;
        this.f45732C = str3;
        this.f45731B = str4;
    }

    public final int describeContents() {
        return AnonymousClass2l3.MANIFEST_MISALIGNED.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45734E);
        parcel.writeString(this.f45733D);
        parcel.writeString(this.f45732C);
        parcel.writeString(this.f45731B);
    }
}
