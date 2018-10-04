package com.facebook.android.instantexperiences.autofill;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Ip;
import X.AnonymousClass5co;
import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class RequestAutofillJSBridgeCall extends InstantExperiencesJSBridgeCall {
    /* renamed from: C */
    private static final String f72853C = "RequestAutofillJSBridgeCall";
    public static final Creator CREATOR = new AnonymousClass5co();
    /* renamed from: B */
    private volatile LinkedHashSet f72854B = null;

    /* renamed from: A */
    public final String mo6306A() {
        return "requestAutoFill";
    }

    public RequestAutofillJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public RequestAutofillJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }

    /* renamed from: D */
    public final void mo6307D() {
        super.mo6307D();
        if (AnonymousClass0Ip.B(String.valueOf(m28150B("selectedAutoCompleteTag")))) {
            throw new AnonymousClass5d9(AnonymousClass5dA.INVALID_PARAM, "Selected auto fill tag cannot be empty or null");
        } else if (AnonymousClass0Ip.B(String.valueOf(m28150B("autofillFields")))) {
            throw new AnonymousClass5d9(AnonymousClass5dA.INVALID_PARAM, "Autofill fields cannot be empty or null");
        } else if (!this.f67518E.mL().kW()) {
            throw new AnonymousClass5d9(AnonymousClass5dA.FEATURE_UNAVAILABLE, "This feature is not available at this time");
        }
    }

    /* renamed from: E */
    public final Set m29391E() {
        if (this.f72854B != null) {
            return this.f72854B;
        }
        String str = (String) m28150B("autofillFields");
        Collection arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
        } catch (Throwable e) {
            AnonymousClass0Dc.G(f72853C, StringFormatUtil.formatStrLocaleSafe("Failed to getRequestedFields."), e);
        }
        Collections.sort(arrayList);
        this.f72854B = new LinkedHashSet(arrayList);
        return this.f72854B;
    }
}
