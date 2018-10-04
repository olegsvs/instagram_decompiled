package com.facebook.profilo.ipc;

import X.AnonymousClass01M;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class TraceConfigData implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass01M();
    /* renamed from: B */
    public long f158B;
    /* renamed from: C */
    public int f159C;
    /* renamed from: D */
    public int f160D;

    public final int describeContents() {
        return 0;
    }

    public TraceConfigData(Parcel parcel) {
        this.f158B = parcel.readLong();
        this.f160D = parcel.readInt();
        this.f159C = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f158B);
        parcel.writeInt(this.f160D);
        parcel.writeInt(this.f159C);
    }
}
