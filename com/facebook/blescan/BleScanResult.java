package com.facebook.blescan;

import X.AnonymousClass46s;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BleScanResult implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass46s();
    /* renamed from: B */
    public final String f22109B;
    /* renamed from: C */
    public final String f22110C;
    /* renamed from: D */
    public final int f22111D;
    /* renamed from: E */
    public final long f22112E;
    /* renamed from: F */
    public final long f22113F;

    public final int describeContents() {
        return 0;
    }

    public BleScanResult(long j, long j2, String str, int i, String str2) {
        this.f22112E = j;
        this.f22113F = j2;
        this.f22109B = str;
        this.f22111D = i;
        this.f22110C = str2;
    }

    public BleScanResult(Parcel parcel) {
        this.f22112E = parcel.readLong();
        this.f22113F = parcel.readLong();
        this.f22109B = parcel.readString();
        this.f22111D = parcel.readInt();
        this.f22110C = parcel.readString();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    BleScanResult bleScanResult = (BleScanResult) obj;
                    if (this.f22112E == bleScanResult.f22112E) {
                        if (this.f22113F == bleScanResult.f22113F) {
                            if (this.f22111D == bleScanResult.f22111D) {
                                String str = this.f22109B;
                                if (str != null) {
                                    if (!str.equals(bleScanResult.f22109B)) {
                                    }
                                } else if (bleScanResult.f22109B != null) {
                                }
                                str = this.f22110C;
                                if (str != null) {
                                    z = str.equals(bleScanResult.f22110C);
                                } else if (bleScanResult.f22110C != null) {
                                    z = false;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        long j = this.f22112E;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        j = this.f22113F;
        int i2 = (i + ((int) ((j >>> 32) ^ j))) * 31;
        String str = this.f22109B;
        int i3 = 0;
        i2 = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.f22111D) * 31;
        str = this.f22110C;
        if (str != null) {
            i3 = str.hashCode();
        }
        return i2 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f22112E);
        parcel.writeLong(this.f22113F);
        parcel.writeString(this.f22109B);
        parcel.writeInt(this.f22111D);
        parcel.writeString(this.f22110C);
    }
}
