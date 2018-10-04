package com.facebook.android.instantexperiences.payment;

import X.AnonymousClass0Dc;
import X.AnonymousClass5dM;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

public final class PaymentsCheckoutJSBridgeCallResult extends InstantExperiencesCallResult {
    /* renamed from: B */
    private static final String f72864B = "PaymentsCheckoutJSBridgeCallResult";
    public static final Creator CREATOR = new AnonymousClass5dM();

    public final int describeContents() {
        return 0;
    }

    public PaymentsCheckoutJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }

    public PaymentsCheckoutJSBridgeCallResult(String str, String str2) {
        super(m29403B(str, str2));
    }

    /* renamed from: B */
    private static List m29403B(String str, String str2) {
        Object obj = -1;
        try {
            JSONObject jSONObject;
            int hashCode = str.hashCode();
            if (hashCode != -796076093) {
                if (hashCode != -669403845) {
                    if (hashCode != -516235858) {
                        if (hashCode == 704699232) {
                            if (str.equals("checkoutCancel")) {
                                obj = 3;
                            }
                        }
                    } else if (str.equals("shipping")) {
                        obj = null;
                    }
                } else if (str.equals("chargeRequest")) {
                    obj = 2;
                }
            } else if (str.equals("shippingOption")) {
                obj = 1;
            }
            String str3;
            switch (obj) {
                case null:
                    jSONObject = new JSONObject();
                    jSONObject.put("shippingAddress", new JSONObject(str2));
                    jSONObject.put("status", "shipping");
                    break;
                case 1:
                    jSONObject = new JSONObject();
                    str3 = "shippingOption";
                    jSONObject.put(str3, str2);
                    jSONObject.put("status", str3);
                    break;
                case 2:
                    jSONObject = new JSONObject();
                    str3 = "chargeRequest";
                    jSONObject.put(str3, new JSONObject(str2));
                    jSONObject.put("status", str3);
                    break;
                case 3:
                    jSONObject = new JSONObject();
                    jSONObject.put("status", "checkoutCancel");
                    break;
                default:
                    jSONObject = new JSONObject();
                    break;
            }
            return Arrays.asList(new String[]{jSONObject.toString()});
        } catch (Throwable e) {
            AnonymousClass0Dc.I(f72864B, e, "Exception serializing return params!", new Object[0]);
            return new ArrayList();
        }
    }
}
