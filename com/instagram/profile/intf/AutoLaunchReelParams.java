package com.instagram.profile.intf;

import X.AnonymousClass0hc;
import X.AnonymousClass0hd;
import X.AnonymousClass1Ul;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AutoLaunchReelParams implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Ul();
    /* renamed from: B */
    public final AnonymousClass0hd f8448B;
    /* renamed from: C */
    public final String f8449C;
    /* renamed from: D */
    public final String f8450D;
    /* renamed from: E */
    public final String f8451E;
    /* renamed from: F */
    public final boolean f8452F;

    public final int describeContents() {
        return 0;
    }

    public AutoLaunchReelParams(AnonymousClass0hc anonymousClass0hc) {
        this.f8448B = anonymousClass0hc.f8440B;
        this.f8451E = anonymousClass0hc.f8443E;
        this.f8450D = anonymousClass0hc.f8442D;
        this.f8452F = anonymousClass0hc.f8444F;
        this.f8449C = anonymousClass0hc.f8441C;
    }

    public AutoLaunchReelParams(Parcel parcel) {
        this.f8448B = (AnonymousClass0hd) parcel.readSerializable();
        this.f8451E = parcel.readString();
        this.f8450D = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f8452F = z;
        this.f8449C = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f8448B);
        parcel.writeString(this.f8451E);
        parcel.writeString(this.f8450D);
        parcel.writeInt(this.f8452F);
        parcel.writeString(this.f8449C);
    }
}
