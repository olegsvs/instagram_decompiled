package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass0Dc;
import X.AnonymousClass5dI;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import java.util.Arrays;
import org.json.JSONObject;

public final class CanMakePaymentJSBridgeCallResult extends InstantExperiencesCallResult {
    /* renamed from: B */
    public static final String f72863B = "CanMakePaymentJSBridgeCallResult";
    public static final Creator CREATOR = new AnonymousClass5dI();

    public final int describeContents() {
        return 0;
    }

    public CanMakePaymentJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }

    public CanMakePaymentJSBridgeCallResult(boolean z) {
        try {
            new JSONObject().put("canMakePayment", z);
        } catch (Throwable e) {
            AnonymousClass0Dc.I(f72863B, e, "Exception serializing return params!", new Object[0]);
        }
        super(Arrays.asList(new String[]{r5.toString()}));
    }
}
