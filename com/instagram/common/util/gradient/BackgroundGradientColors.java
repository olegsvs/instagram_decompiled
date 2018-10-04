package com.instagram.common.util.gradient;

import X.AnonymousClass26m;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BackgroundGradientColors implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass26m();
    /* renamed from: B */
    public int f26046B;
    /* renamed from: C */
    public int f26047C;

    public final int describeContents() {
        return 0;
    }

    public BackgroundGradientColors(int i, int i2) {
        this.f26047C = i;
        this.f26046B = i2;
    }

    public BackgroundGradientColors(Parcel parcel) {
        this.f26047C = parcel.readInt();
        this.f26046B = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26047C);
        parcel.writeInt(this.f26046B);
    }
}
