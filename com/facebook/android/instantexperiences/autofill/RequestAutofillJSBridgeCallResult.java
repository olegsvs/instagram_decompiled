package com.facebook.android.instantexperiences.autofill;

import X.AnonymousClass0Dc;
import X.AnonymousClass5cp;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class RequestAutofillJSBridgeCallResult extends InstantExperiencesCallResult {
    /* renamed from: B */
    public static final String f72855B = "RequestAutofillJSBridgeCallResult";
    public static final Creator CREATOR = new AnonymousClass5cp();

    public final int describeContents() {
        return 0;
    }

    public RequestAutofillJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }

    public RequestAutofillJSBridgeCallResult(List list) {
        JSONObject jSONObject = new JSONObject();
        for (FbAutofillData gI : list) {
            Map gI2 = gI.gI();
            for (String str : gI2.keySet()) {
                try {
                    jSONObject.put(str, gI2.get(str));
                } catch (Throwable e) {
                    AnonymousClass0Dc.G(f72855B, StringFormatUtil.formatStrLocaleSafe("Autocomplete data can't be added to JSONObject "), e);
                }
            }
        }
        super(Arrays.asList(new String[]{jSONObject.toString()}));
    }
}
