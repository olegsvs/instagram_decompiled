package com.google.android.exoplayer2.video;

import X.AnonymousClass2yi;
import X.AnonymousClass2yl;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2yl();
    /* renamed from: B */
    public final int f36558B;
    /* renamed from: C */
    public final int f36559C;
    /* renamed from: D */
    public final int f36560D;
    /* renamed from: E */
    public final byte[] f36561E;
    /* renamed from: F */
    private int f36562F;

    public final int describeContents() {
        return 0;
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f36559C = i;
        this.f36558B = i2;
        this.f36560D = i3;
        this.f36561E = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.f36559C = parcel.readInt();
        this.f36558B = parcel.readInt();
        this.f36560D = parcel.readInt();
        this.f36561E = AnonymousClass2yi.m18104Y(parcel) ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ColorInfo colorInfo = (ColorInfo) obj;
                    if (this.f36559C != colorInfo.f36559C || this.f36558B != colorInfo.f36558B || this.f36560D != colorInfo.f36560D || !Arrays.equals(this.f36561E, colorInfo.f36561E)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f36562F == 0) {
            this.f36562F = ((((((527 + this.f36559C) * 31) + this.f36558B) * 31) + this.f36560D) * 31) + Arrays.hashCode(this.f36561E);
        }
        return this.f36562F;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(this.f36559C);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36558B);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36560D);
        stringBuilder.append(", ");
        stringBuilder.append(this.f36561E != null);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36559C);
        parcel.writeInt(this.f36558B);
        parcel.writeInt(this.f36560D);
        parcel.writeInt(this.f36561E != null ? 1 : 0);
        byte[] bArr = this.f36561E;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
