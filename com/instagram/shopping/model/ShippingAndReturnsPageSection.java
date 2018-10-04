package com.instagram.shopping.model;

import X.AnonymousClass3g2;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ShippingAndReturnsPageSection implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3g2();
    /* renamed from: B */
    public String f43231B;
    /* renamed from: C */
    public String f43232C;

    public final int describeContents() {
        return 0;
    }

    public ShippingAndReturnsPageSection(Parcel parcel) {
        this.f43232C = parcel.readString();
        this.f43231B = parcel.readString();
    }

    public ShippingAndReturnsPageSection(String str, String str2) {
        this.f43232C = str;
        this.f43231B = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f43232C);
        parcel.writeString(this.f43231B);
    }
}
