package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass0Ip;
import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import X.AnonymousClass5dL;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import org.json.JSONObject;

public final class PaymentsCheckoutJSBridgeCall extends PaymentsJSBridgeCall {
    public static final Creator CREATOR = new AnonymousClass5dL();

    /* renamed from: A */
    public final String mo6306A() {
        return "paymentsCheckout";
    }

    public PaymentsCheckoutJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsCheckoutJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }

    /* renamed from: D */
    public final void mo6307D() {
        super.mo6307D();
        if (AnonymousClass0Ip.B(String.valueOf(m28150B("configuration")))) {
            throw new AnonymousClass5d9(AnonymousClass5dA.INVALID_PARAM, "Checkout configuration object can not be null or empty");
        }
    }
}
