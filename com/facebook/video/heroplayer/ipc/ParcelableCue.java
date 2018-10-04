package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1xf;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public final class ParcelableCue implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1xf();
    /* renamed from: B */
    public CharSequence f24699B;

    public final int describeContents() {
        return 0;
    }

    public ParcelableCue(Parcel parcel) {
        this.f24699B = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    public ParcelableCue(CharSequence charSequence) {
        this.f24699B = charSequence;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.f24699B, parcel, 0);
    }
}
