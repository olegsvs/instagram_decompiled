package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AnonymousClass5dO;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.instagram.realtimeclient.RealtimeConstants;
import org.json.JSONObject;

public final class PaymentsChargeRequestSuccessCall extends PaymentsChargeRequestCall {
    public static final Creator CREATOR = new AnonymousClass5dO();

    public PaymentsChargeRequestSuccessCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsChargeRequestSuccessCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
        this.f72865B = RealtimeConstants.SEND_SUCCESS;
    }
}
