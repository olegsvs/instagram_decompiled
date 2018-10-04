package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass5dH;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import org.json.JSONObject;

public class CanMakePaymentJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Creator CREATOR = new AnonymousClass5dH();

    /* renamed from: A */
    public final String mo6306A() {
        return "canMakePayment";
    }

    public CanMakePaymentJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public CanMakePaymentJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }
}
