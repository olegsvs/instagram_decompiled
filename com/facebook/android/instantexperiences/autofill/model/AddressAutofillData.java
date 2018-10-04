package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass5cq;
import X.AnonymousClass5cr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class AddressAutofillData extends BrowserExtensionsAutofillData {
    /* renamed from: B */
    public static final Set f73944B = new AnonymousClass5cq();
    public static final Creator CREATOR = new AnonymousClass5cr();

    /* renamed from: B */
    public final String mo6776B() {
        return "address-autofill-data";
    }

    public AddressAutofillData(Parcel parcel) {
        super(parcel);
    }

    public AddressAutofillData(Map map) {
        super(map);
    }

    public AddressAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ BrowserExtensionsAutofillData mo6775A(Set set) {
        return new AddressAutofillData(m29395C(set));
    }

    /* renamed from: C */
    private static boolean m29862C(StringBuilder stringBuilder, String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        if (stringBuilder.length() != 0) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(str);
        return true;
    }

    /* renamed from: D */
    public final String mo6777D() {
        StringBuilder stringBuilder = new StringBuilder();
        if (!m29862C(stringBuilder, (String) this.f72860B.get("street-address"))) {
            m29862C(stringBuilder, (String) this.f72860B.get("address-line1"));
            m29862C(stringBuilder, (String) this.f72860B.get("address-line2"));
            m29862C(stringBuilder, (String) this.f72860B.get("address-line3"));
        }
        m29862C(stringBuilder, (String) this.f72860B.get("address-level4"));
        m29862C(stringBuilder, (String) this.f72860B.get("address-level3"));
        m29862C(stringBuilder, (String) this.f72860B.get("address-level2"));
        m29862C(stringBuilder, (String) this.f72860B.get("address-level1"));
        m29862C(stringBuilder, (String) this.f72860B.get("postal-code"));
        if (!m29862C(stringBuilder, (String) this.f72860B.get("country"))) {
            m29862C(stringBuilder, (String) this.f72860B.get("country-name"));
        }
        return stringBuilder.toString();
    }

    public final /* bridge */ /* synthetic */ FbAutofillData gE(Set set) {
        return new AddressAutofillData(m29395C(set));
    }

    public final /* bridge */ /* synthetic */ Map gI() {
        return new HashMap(this.f72860B);
    }
}
