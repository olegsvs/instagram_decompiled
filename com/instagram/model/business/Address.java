package com.instagram.model.business;

import X.AnonymousClass2Dy;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Address implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2Dy();
    /* renamed from: B */
    public String f27737B;
    /* renamed from: C */
    public String f27738C;
    /* renamed from: D */
    public String f27739D;
    /* renamed from: E */
    public String f27740E;
    /* renamed from: F */
    public String f27741F;

    public final int describeContents() {
        return 0;
    }

    public Address(Parcel parcel) {
        this.f27740E = parcel.readString();
        this.f27741F = parcel.readString();
        this.f27738C = parcel.readString();
        this.f27737B = parcel.readString();
        this.f27739D = parcel.readString();
    }

    public Address(String str, String str2, String str3, String str4, String str5) {
        String str6;
        String str7 = null;
        if (str == null) {
            str6 = null;
        } else {
            str6 = str.trim();
        }
        this.f27741F = str6;
        this.f27738C = str2;
        if (str4 != null) {
            str7 = str4.trim();
        }
        this.f27739D = str7;
        this.f27737B = str3;
        this.f27740E = str5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27740E);
        parcel.writeString(this.f27741F);
        parcel.writeString(this.f27738C);
        parcel.writeString(this.f27737B);
        parcel.writeString(this.f27739D);
    }
}
