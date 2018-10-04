package com.facebook.exoplayer.ipc;

import X.AnonymousClass2l3;
import android.os.Parcel;

public class VpsCacheErrorEvent extends VideoPlayerServiceEvent {
    /* renamed from: B */
    public final String f45726B;
    /* renamed from: C */
    public final String f45727C;
    /* renamed from: D */
    public final int f45728D;
    /* renamed from: E */
    public final int f45729E;
    /* renamed from: F */
    public final String f45730F;

    public VpsCacheErrorEvent(Parcel parcel) {
        this.f45726B = parcel.readString();
        this.f45730F = parcel.readString();
        this.f45727C = parcel.readString();
        this.f45729E = parcel.readInt();
        this.f45728D = parcel.readInt();
    }

    public VpsCacheErrorEvent(String str, String str2, String str3, int i, int i2) {
        this.f45726B = str;
        this.f45730F = str2;
        this.f45727C = str3;
        this.f45729E = i;
        this.f45728D = i2;
    }

    public final int describeContents() {
        return AnonymousClass2l3.CACHE_ERROR.f33374B;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f45726B);
        parcel.writeString(this.f45730F);
        parcel.writeString(this.f45727C);
        parcel.writeInt(this.f45729E);
        parcel.writeInt(this.f45728D);
    }
}
