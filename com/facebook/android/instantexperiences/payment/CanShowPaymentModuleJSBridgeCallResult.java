package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass5dK;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;

public class CanShowPaymentModuleJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Creator CREATOR = new AnonymousClass5dK();

    public final int describeContents() {
        return 0;
    }

    public CanShowPaymentModuleJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }
}
