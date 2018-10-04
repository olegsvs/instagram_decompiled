package com.facebook.android.instantexperiences.payment.chargerequest;

import X.AnonymousClass0Ip;
import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.Locale;
import org.json.JSONObject;

public abstract class PaymentsChargeRequestCall extends InstantExperiencesJSBridgeCall {
    /* renamed from: B */
    public String f72865B;

    /* renamed from: A */
    public final String mo6306A() {
        return "paymentsChargeRequst";
    }

    public PaymentsChargeRequestCall(Parcel parcel) {
        super(parcel);
        this.f72865B = parcel.readString();
    }

    public PaymentsChargeRequestCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }

    /* renamed from: D */
    public final void mo6307D() {
        super.mo6307D();
        if (AnonymousClass0Ip.B(String.valueOf(m28150B("paymentId")))) {
            throw new AnonymousClass5d9(AnonymousClass5dA.INVALID_PARAM, "Payment ID can not be null or empty");
        } else if (this.f67518E.XI() == null) {
            throw new AnonymousClass5d9(AnonymousClass5dA.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", new Object[0]));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f72865B);
    }
}
