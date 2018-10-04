package com.instagram.leadads.model;

import X.AnonymousClass3Rz;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LeadAdsDisclaimerResponse implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3Rz();
    /* renamed from: B */
    public String f41311B;
    /* renamed from: C */
    public boolean f41312C;

    public final int describeContents() {
        return 0;
    }

    public LeadAdsDisclaimerResponse(Parcel parcel) {
        this.f41311B = parcel.readString();
        this.f41312C = parcel.readByte() != (byte) 0;
    }

    public LeadAdsDisclaimerResponse(String str, boolean z) {
        this.f41311B = str;
        this.f41312C = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41311B);
        parcel.writeByte((byte) this.f41312C);
    }
}
