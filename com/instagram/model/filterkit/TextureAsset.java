package com.instagram.model.filterkit;

import X.AnonymousClass1cL;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class TextureAsset implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1cL();
    /* renamed from: B */
    public final String f41632B;
    /* renamed from: C */
    public final String f41633C;

    public final int describeContents() {
        return 0;
    }

    public TextureAsset(Parcel parcel) {
        this.f41632B = parcel.readString();
        this.f41633C = parcel.readString();
    }

    public TextureAsset(String str, String str2) {
        this.f41632B = str;
        this.f41633C = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f41632B);
        parcel.writeString(this.f41633C);
    }
}
