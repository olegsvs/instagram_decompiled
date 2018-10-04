package com.google.android.exoplayer2.metadata.id3;

import X.AnonymousClass2w5;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ApicFrame extends Id3Frame {
    public static final Creator CREATOR = new AnonymousClass2w5();
    /* renamed from: B */
    public final String f49233B;
    /* renamed from: C */
    public final String f49234C;
    /* renamed from: D */
    public final byte[] f49235D;
    /* renamed from: E */
    public final int f49236E;

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.f49234C = parcel.readString();
        this.f49233B = parcel.readString();
        this.f49236E = parcel.readInt();
        this.f49235D = parcel.createByteArray();
    }

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f49234C = str;
        this.f49233B = str2;
        this.f49236E = i;
        this.f49235D = bArr;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ApicFrame apicFrame = (ApicFrame) obj;
                    if (this.f49236E != apicFrame.f49236E || !AnonymousClass2yi.m18082C(this.f49234C, apicFrame.f49234C) || !AnonymousClass2yi.m18082C(this.f49233B, apicFrame.f49233B) || !Arrays.equals(this.f49235D, apicFrame.f49235D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        int i = (527 + this.f49236E) * 31;
        String str = this.f49234C;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.f49233B;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i + i2) * 31) + Arrays.hashCode(this.f49235D);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f46978B);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(this.f49234C);
        stringBuilder.append(", description=");
        stringBuilder.append(this.f49233B);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f49234C);
        parcel.writeString(this.f49233B);
        parcel.writeInt(this.f49236E);
        parcel.writeByteArray(this.f49235D);
    }
}
