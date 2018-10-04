package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass5dJ;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

public class CanShowPaymentModuleJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Creator CREATOR = new AnonymousClass5dJ();

    /* renamed from: A */
    public final String mo6306A() {
        return "canShowPaymentModule";
    }

    public CanShowPaymentModuleJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
