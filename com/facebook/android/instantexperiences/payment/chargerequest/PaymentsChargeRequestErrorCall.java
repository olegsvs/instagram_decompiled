package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AnonymousClass5dN;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import org.json.JSONObject;

public class PaymentsChargeRequestErrorCall extends PaymentsChargeRequestCall {
    public static final Creator CREATOR = new AnonymousClass5dN();

    public PaymentsChargeRequestErrorCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsChargeRequestErrorCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
        this.f72865B = "error";
    }
}
