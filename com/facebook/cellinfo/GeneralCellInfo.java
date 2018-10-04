package com.facebook.cellinfo;

import X.AnonymousClass470;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class GeneralCellInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass470();
    /* renamed from: B */
    public final CdmaCellInfo f22020B;
    /* renamed from: C */
    public final boolean f22021C;
    /* renamed from: D */
    public final boolean f22022D;
    /* renamed from: E */
    public final String f22023E;
    /* renamed from: F */
    public final String f22024F;
    /* renamed from: G */
    public final String f22025G;
    /* renamed from: H */
    public final String f22026H;
    /* renamed from: I */
    public final String f22027I;
    /* renamed from: J */
    public final String f22028J;
    /* renamed from: K */
    public final String f22029K;
    /* renamed from: L */
    public final String f22030L;

    public final int describeContents() {
        return 0;
    }

    public GeneralCellInfo(Parcel parcel) {
        this.f22027I = parcel.readString();
        this.f22028J = parcel.readString();
        this.f22029K = parcel.readString();
        this.f22030L = parcel.readString();
        boolean z = true;
        this.f22021C = parcel.readByte() != (byte) 0;
        this.f22026H = parcel.readString();
        this.f22023E = parcel.readString();
        this.f22024F = parcel.readString();
        this.f22025G = parcel.readString();
        if (parcel.readByte() == (byte) 0) {
            z = false;
        }
        this.f22022D = z;
        this.f22020B = (CdmaCellInfo) parcel.readParcelable(CdmaCellInfo.class.getClassLoader());
    }

    public GeneralCellInfo(String str, String str2, String str3, String str4, boolean z, String str5, String str6, String str7, String str8, boolean z2, CdmaCellInfo cdmaCellInfo) {
        this.f22027I = str;
        this.f22028J = str2;
        this.f22029K = str3;
        this.f22030L = str4;
        this.f22021C = z;
        this.f22026H = str5;
        this.f22023E = str6;
        this.f22024F = str7;
        this.f22025G = str8;
        this.f22022D = z2;
        this.f22020B = cdmaCellInfo;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f22027I);
        parcel.writeString(this.f22028J);
        parcel.writeString(this.f22029K);
        parcel.writeString(this.f22030L);
        parcel.writeByte(this.f22021C);
        parcel.writeString(this.f22026H);
        parcel.writeString(this.f22023E);
        parcel.writeString(this.f22024F);
        parcel.writeString(this.f22025G);
        parcel.writeByte(this.f22022D);
        parcel.writeParcelable(this.f22020B, i);
    }
}
