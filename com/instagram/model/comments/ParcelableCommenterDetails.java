package com.instagram.model.comments;

import X.AnonymousClass3UQ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ParcelableCommenterDetails implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3UQ();
    /* renamed from: B */
    public final String f41602B;
    /* renamed from: C */
    public final boolean f41603C;
    /* renamed from: D */
    public final boolean f41604D;
    /* renamed from: E */
    public final Double f41605E;
    /* renamed from: F */
    public final String f41606F;
    /* renamed from: G */
    public final String f41607G;
    /* renamed from: H */
    public final String f41608H;

    public final int describeContents() {
        return 0;
    }

    public ParcelableCommenterDetails(Parcel parcel) {
        this.f41605E = Double.valueOf(parcel.readDouble());
        boolean z = false;
        this.f41604D = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f41603C = z;
        this.f41608H = parcel.readString();
        this.f41602B = parcel.readString();
        this.f41607G = parcel.readString();
        this.f41606F = parcel.readString();
    }

    public ParcelableCommenterDetails(Double d, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        this.f41605E = d;
        this.f41604D = z;
        this.f41603C = z2;
        this.f41608H = str;
        this.f41602B = str2;
        this.f41607G = str3;
        this.f41606F = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f41605E.doubleValue());
        parcel.writeInt(this.f41604D);
        parcel.writeInt(this.f41603C);
        parcel.writeString(this.f41608H);
        parcel.writeString(this.f41602B);
        parcel.writeString(this.f41607G);
        parcel.writeString(this.f41606F);
    }
}
