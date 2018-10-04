package com.facebook.exoplayer.ipc;

import X.AnonymousClass2kz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RendererContext implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2kz();
    /* renamed from: B */
    public final int f33349B;
    /* renamed from: C */
    public final String f33350C;
    /* renamed from: D */
    public final int f33351D;
    /* renamed from: E */
    public final String f33352E;

    public final int describeContents() {
        return 0;
    }

    public RendererContext(Parcel parcel) {
        this(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString());
    }

    public RendererContext(String str, int i, int i2, String str2) {
        this.f33352E = str;
        this.f33349B = i;
        this.f33351D = i2;
        this.f33350C = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33352E);
        parcel.writeInt(this.f33349B);
        parcel.writeInt(this.f33351D);
        parcel.writeString(this.f33350C);
    }
}
