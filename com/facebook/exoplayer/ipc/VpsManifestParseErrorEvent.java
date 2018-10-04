package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsManifestParseErrorEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public Exception f45735B;
    /* renamed from: C */
    public String f45736C;

    public VpsManifestParseErrorEvent(Parcel parcel) {
        this.f45736C = parcel.readString();
        this.f45735B = (Exception) parcel.readSerializable();
    }

    public VpsManifestParseErrorEvent(String str, Exception exception) {
        this.f45736C = str;
        this.f45735B = exception;
    }

    public final int describeContents() {
        return AnonymousClass2l3.MANIFEST_PARSE_ERROR.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45736C);
        parcel.writeSerializable(this.f45735B);
    }
}
