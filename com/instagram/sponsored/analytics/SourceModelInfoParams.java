package com.instagram.sponsored.analytics;

import X.AnonymousClass3gA;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SourceModelInfoParams implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3gA();
    /* renamed from: B */
    public int f11877B;
    /* renamed from: C */
    public String f11878C;
    /* renamed from: D */
    public int f11879D;
    /* renamed from: E */
    public String f11880E;
    /* renamed from: F */
    public String f11881F;
    /* renamed from: G */
    public int f11882G;
    /* renamed from: H */
    public int f11883H;
    /* renamed from: I */
    public String f11884I;

    public final int describeContents() {
        return 0;
    }

    public SourceModelInfoParams(Parcel parcel) {
        this.f11881F = parcel.readString();
        this.f11882G = parcel.readInt();
        this.f11877B = parcel.readInt();
        this.f11884I = parcel.readString();
        this.f11880E = parcel.readString();
        this.f11878C = parcel.readString();
        this.f11879D = parcel.readInt();
        this.f11883H = parcel.readInt();
    }

    public SourceModelInfoParams(String str, int i, int i2) {
        this.f11881F = str;
        this.f11882G = i;
        this.f11877B = i2;
    }

    public SourceModelInfoParams(String str, String str2, String str3, int i, int i2, String str4) {
        this.f11884I = str;
        this.f11880E = str2;
        this.f11878C = str3;
        this.f11879D = i;
        this.f11883H = i2;
        this.f11881F = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11881F);
        parcel.writeInt(this.f11882G);
        parcel.writeInt(this.f11877B);
        parcel.writeString(this.f11884I);
        parcel.writeString(this.f11880E);
        parcel.writeString(this.f11878C);
        parcel.writeInt(this.f11879D);
        parcel.writeInt(this.f11883H);
    }
}
