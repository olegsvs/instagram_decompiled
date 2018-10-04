package com.google.android.exoplayer2.metadata.emsg;

import X.AnonymousClass2w3;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import java.util.Arrays;

public final class EventMessage implements Entry {
    public static final Creator CREATOR = new AnonymousClass2w3();
    /* renamed from: B */
    public final long f46971B;
    /* renamed from: C */
    public final long f46972C;
    /* renamed from: D */
    public final byte[] f46973D;
    /* renamed from: E */
    public final long f46974E;
    /* renamed from: F */
    public final String f46975F;
    /* renamed from: G */
    public final String f46976G;
    /* renamed from: H */
    private int f46977H;

    public final int describeContents() {
        return 0;
    }

    public EventMessage(Parcel parcel) {
        this.f46975F = parcel.readString();
        this.f46976G = parcel.readString();
        this.f46974E = parcel.readLong();
        this.f46971B = parcel.readLong();
        this.f46972C = parcel.readLong();
        this.f46973D = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr, long j3) {
        this.f46975F = str;
        this.f46976G = str2;
        this.f46971B = j;
        this.f46972C = j2;
        this.f46973D = bArr;
        this.f46974E = j3;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    EventMessage eventMessage = (EventMessage) obj;
                    if (this.f46974E != eventMessage.f46974E || this.f46971B != eventMessage.f46971B || this.f46972C != eventMessage.f46972C || !AnonymousClass2yi.m18082C(this.f46975F, eventMessage.f46975F) || !AnonymousClass2yi.m18082C(this.f46976G, eventMessage.f46976G) || !Arrays.equals(this.f46973D, eventMessage.f46973D)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f46977H == 0) {
            String str = this.f46975F;
            int i = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            str = this.f46976G;
            if (str != null) {
                i = str.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            long j = this.f46974E;
            i2 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.f46971B;
            i2 = (i2 + ((int) (j ^ (j >>> 32)))) * 31;
            j = this.f46972C;
            this.f46977H = ((i2 + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f46973D);
        }
        return this.f46977H;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EMSG: scheme=");
        stringBuilder.append(this.f46975F);
        stringBuilder.append(", id=");
        stringBuilder.append(this.f46972C);
        stringBuilder.append(", value=");
        stringBuilder.append(this.f46976G);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f46975F);
        parcel.writeString(this.f46976G);
        parcel.writeLong(this.f46974E);
        parcel.writeLong(this.f46971B);
        parcel.writeLong(this.f46972C);
        parcel.writeByteArray(this.f46973D);
    }
}
