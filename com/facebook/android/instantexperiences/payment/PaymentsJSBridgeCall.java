package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import android.os.Parcel;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.Locale;
import org.json.JSONObject;

public abstract class PaymentsJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public PaymentsJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public PaymentsJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }

    /* renamed from: D */
    public void mo6307D() {
        super.mo6307D();
        if (this.f67518E.XI() == null) {
            throw new AnonymousClass5d9(AnonymousClass5dA.MISSING_APP_ID, String.format(Locale.US, "An App ID must be set to use this call", new Object[0]));
        }
    }
}
