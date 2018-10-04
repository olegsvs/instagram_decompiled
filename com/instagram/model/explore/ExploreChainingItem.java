package com.instagram.model.explore;

import X.AnonymousClass3UT;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ExploreChainingItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3UT();
    /* renamed from: B */
    public String f21053B;
    /* renamed from: C */
    public String f21054C;
    /* renamed from: D */
    public String f21055D;
    /* renamed from: E */
    public int f21056E;

    public final int describeContents() {
        return 0;
    }

    public ExploreChainingItem(Parcel parcel) {
        this.f21055D = parcel.readString();
        this.f21056E = parcel.readInt();
        this.f21054C = parcel.readString();
        this.f21053B = parcel.readString();
    }

    public ExploreChainingItem(String str, int i, String str2, String str3) {
        this.f21055D = str;
        this.f21056E = i;
        this.f21054C = str2;
        this.f21053B = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21055D);
        parcel.writeInt(this.f21056E);
        parcel.writeString(this.f21054C);
        parcel.writeString(this.f21053B);
    }
}
