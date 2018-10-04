package com.instagram.business.model;

import X.AnonymousClass34y;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BusinessSignUpSplashRow implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass34y();
    /* renamed from: B */
    public final int f37642B;
    /* renamed from: C */
    public final int f37643C;
    /* renamed from: D */
    public final int f37644D;

    public final int describeContents() {
        return 0;
    }

    public BusinessSignUpSplashRow(Parcel parcel) {
        this.f37644D = parcel.readInt();
        this.f37642B = parcel.readInt();
        this.f37643C = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37644D);
        parcel.writeInt(this.f37642B);
        parcel.writeInt(this.f37643C);
    }
}
