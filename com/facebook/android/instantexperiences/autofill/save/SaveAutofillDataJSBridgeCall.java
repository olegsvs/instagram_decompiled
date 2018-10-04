package com.facebook.android.instantexperiences.autofill.save;

import X.AnonymousClass0Dc;
import X.AnonymousClass5d6;
import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

public class SaveAutofillDataJSBridgeCall extends InstantExperiencesJSBridgeCall {
    /* renamed from: B */
    private static final String f72861B = "SaveAutofillDataJSBridgeCall";
    public static final Creator CREATOR = new AnonymousClass5d6();

    /* renamed from: A */
    public final String mo6306A() {
        return "saveAutofillData";
    }

    public SaveAutofillDataJSBridgeCall(Parcel parcel) {
        super(parcel);
    }

    public SaveAutofillDataJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        super(str, instantExperiencesParameters, str2, jSONObject);
    }

    /* renamed from: D */
    public final void mo6307D() {
        super.mo6307D();
        if (!(m28150B("raw_autofill_data") instanceof String)) {
            throw new AnonymousClass5d9(AnonymousClass5dA.INVALID_PARAM, String.format(Locale.US, "The raw autofill data must be a string", new Object[0]));
        }
    }

    /* renamed from: E */
    public final HashMap m29400E() {
        String valueOf = String.valueOf(m28150B("raw_autofill_data"));
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(valueOf);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                JSONArray jSONArray = jSONObject.getJSONArray(str);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj != null) {
                        arrayList.add(obj.toString());
                    }
                }
                hashMap.put(str, arrayList);
            }
            return hashMap;
        } catch (Throwable e) {
            AnonymousClass0Dc.G(f72861B, StringFormatUtil.formatStrLocaleSafe("Failed to getRawAutofillData."), e);
            return hashMap;
        }
    }
}
