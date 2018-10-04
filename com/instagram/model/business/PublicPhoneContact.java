package com.instagram.model.business;

import X.AnonymousClass2E2;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PublicPhoneContact implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2E2();
    /* renamed from: B */
    public String f27760B;
    /* renamed from: C */
    public String f27761C;
    /* renamed from: D */
    public String f27762D;
    /* renamed from: E */
    public String f27763E;

    public final int describeContents() {
        return 0;
    }

    public PublicPhoneContact(Parcel parcel) {
        this.f27763E = parcel.readString();
        this.f27760B = parcel.readString();
        this.f27761C = parcel.readString();
        this.f27762D = parcel.readString();
    }

    public PublicPhoneContact(String str, String str2, String str3, String str4) {
        this.f27761C = str;
        this.f27762D = str2;
        this.f27763E = str3;
        this.f27760B = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27763E);
        parcel.writeString(this.f27760B);
        parcel.writeString(this.f27761C);
        parcel.writeString(this.f27762D);
    }
}
