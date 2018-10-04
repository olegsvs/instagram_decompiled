package com.facebook.ccu.data;

import X.AnonymousClass5eK;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class InvitableContactImpl implements ResponseData$InvitableContact {
    public static final Creator CREATOR = new AnonymousClass5eK();
    /* renamed from: B */
    private final String f72881B;
    /* renamed from: C */
    private final String f72882C;
    /* renamed from: D */
    private final String f72883D;

    public final int describeContents() {
        return 0;
    }

    public InvitableContactImpl(Parcel parcel) {
        this.f72881B = parcel.readString();
        this.f72882C = parcel.readString();
        this.f72883D = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72881B);
        parcel.writeString(this.f72882C);
        parcel.writeString(this.f72883D);
    }
}
