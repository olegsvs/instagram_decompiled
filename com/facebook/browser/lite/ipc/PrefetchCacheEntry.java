package com.facebook.browser.lite.ipc;

import X.AnonymousClass1qq;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class PrefetchCacheEntry implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1qq();
    /* renamed from: B */
    public String f23353B;
    /* renamed from: C */
    public String f23354C;
    /* renamed from: D */
    public String f23355D;
    /* renamed from: E */
    public String f23356E;

    public final int describeContents() {
        return 0;
    }

    public PrefetchCacheEntry(Parcel parcel) {
        this.f23356E = parcel.readString();
        this.f23354C = parcel.readString();
        this.f23355D = parcel.readString();
        this.f23353B = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23356E);
        parcel.writeString(this.f23354C);
        parcel.writeString(this.f23355D);
        parcel.writeString(this.f23353B);
    }
}
