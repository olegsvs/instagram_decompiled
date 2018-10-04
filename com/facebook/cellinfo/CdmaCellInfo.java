package com.facebook.cellinfo;

import X.AnonymousClass46z;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class CdmaCellInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass46z();
    /* renamed from: B */
    public final int f22042B;
    /* renamed from: C */
    public final Double f22043C;
    /* renamed from: D */
    public final Double f22044D;
    /* renamed from: E */
    public final int f22045E;
    /* renamed from: F */
    public final int f22046F;

    public final int describeContents() {
        return 0;
    }

    public CdmaCellInfo(int i, int i2, int i3, Double d, Double d2) {
        this.f22045E = i;
        this.f22046F = i2;
        this.f22042B = i3;
        this.f22043C = d;
        this.f22044D = d2;
    }

    public CdmaCellInfo(Parcel parcel) {
        this.f22045E = parcel.readInt();
        this.f22046F = parcel.readInt();
        this.f22042B = parcel.readInt();
        this.f22043C = (Double) parcel.readValue(Double.class.getClassLoader());
        this.f22044D = (Double) parcel.readValue(Double.class.getClassLoader());
    }

    /* renamed from: B */
    public static double m12803B(int i) {
        double d = (double) i;
        if (Double.isNaN(d) || i < -2592000 || i > 2592000) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid coordiante value:");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Double.isNaN(d);
        return d / 14400.0d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22045E);
        parcel.writeInt(this.f22046F);
        parcel.writeInt(this.f22042B);
        parcel.writeValue(this.f22043C);
        parcel.writeValue(this.f22044D);
    }
}
