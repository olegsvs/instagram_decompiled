package com.facebook.browser.lite.ipc;

import X.AnonymousClass1qp;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class MissingCookiesTestInfo implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1qp();
    /* renamed from: B */
    public boolean f23351B;
    /* renamed from: C */
    public long f23352C;

    public final int describeContents() {
        return 0;
    }

    public MissingCookiesTestInfo(Parcel parcel) {
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f23351B = z;
        this.f23352C = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f23351B);
        parcel.writeLong(this.f23352C);
    }
}
