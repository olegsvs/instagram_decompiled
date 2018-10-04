package com.facebook.wifiscan;

import X.AnonymousClass1hE;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class WifiScanConfig implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1hE();
    /* renamed from: B */
    public final int f16101B;
    /* renamed from: C */
    public final int f16102C;
    /* renamed from: D */
    public final int f16103D;
    /* renamed from: E */
    private final boolean f16104E;
    /* renamed from: F */
    private final long f16105F;
    /* renamed from: G */
    private final long f16106G;
    /* renamed from: H */
    private final long f16107H;

    public final int describeContents() {
        return 0;
    }

    public WifiScanConfig(Parcel parcel) {
        this.f16104E = parcel.readInt() > 0;
        this.f16105F = parcel.readLong();
        this.f16107H = parcel.readLong();
        this.f16106G = parcel.readLong();
        parcel.readLong();
        this.f16102C = parcel.readInt();
        this.f16103D = parcel.readInt();
        this.f16101B = parcel.readInt();
    }

    public WifiScanConfig(boolean z, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f16104E = z;
        this.f16105F = j;
        this.f16107H = j2;
        this.f16106G = j3;
        this.f16102C = (int) j5;
        this.f16103D = (int) j6;
        this.f16101B = (int) j7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16104E);
        parcel.writeLong(this.f16105F);
        parcel.writeLong(this.f16107H);
        parcel.writeLong(this.f16106G);
        parcel.writeInt(this.f16102C);
        parcel.writeInt(this.f16103D);
        parcel.writeInt(this.f16101B);
    }
}
