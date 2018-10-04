package com.instagram.leadads.model;

import X.AnonymousClass3S0;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LeadAdsInputFieldResponse implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3S0();
    /* renamed from: B */
    public String f41313B;
    /* renamed from: C */
    public String f41314C;

    public final int describeContents() {
        return 0;
    }

    public LeadAdsInputFieldResponse(Parcel parcel) {
        this.f41314C = parcel.readString();
        this.f41313B = parcel.readString();
    }

    public LeadAdsInputFieldResponse(String str, String str2) {
        this.f41314C = str;
        this.f41313B = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41314C);
        parcel.writeString(this.f41313B);
    }
}
