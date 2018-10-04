package com.instagram.user.userdetail;

import X.AnonymousClass3mW;
import X.AnonymousClass3mX;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UserDetailEntryInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3mW();
    /* renamed from: B */
    public String f44341B;
    /* renamed from: C */
    public String f44342C;
    /* renamed from: D */
    public String f44343D;
    /* renamed from: E */
    public String f44344E;

    public final int describeContents() {
        return 0;
    }

    public UserDetailEntryInfo(AnonymousClass3mX anonymousClass3mX) {
        this.f44342C = anonymousClass3mX.f44338C;
        this.f44343D = anonymousClass3mX.f44339D;
        this.f44341B = anonymousClass3mX.f44337B;
        this.f44344E = anonymousClass3mX.f44340E;
    }

    public UserDetailEntryInfo(Parcel parcel) {
        this.f44342C = parcel.readString();
        this.f44343D = parcel.readString();
        this.f44341B = parcel.readString();
        this.f44344E = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f44342C);
        parcel.writeString(this.f44343D);
        parcel.writeString(this.f44341B);
        parcel.writeString(this.f44344E);
    }
}
