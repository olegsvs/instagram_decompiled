package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass5cv;
import X.AnonymousClass5cw;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class EmailAutofillData extends BrowserExtensionsAutofillData {
    /* renamed from: B */
    public static final Set f73945B = new AnonymousClass5cv();
    public static final Creator CREATOR = new AnonymousClass5cw();

    /* renamed from: B */
    public final String mo6776B() {
        return "email-autofill-data";
    }

    public EmailAutofillData(Parcel parcel) {
        super(parcel);
    }

    public EmailAutofillData(String str, String str2) {
        this.f72860B.put(str, str2);
    }

    public EmailAutofillData(Map map) {
        super(map);
    }

    public EmailAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ BrowserExtensionsAutofillData mo6775A(Set set) {
        return new EmailAutofillData(m29395C(set));
    }

    /* renamed from: D */
    public final String mo6777D() {
        return (String) this.f72860B.get((String) this.f72860B.keySet().iterator().next());
    }

    public final /* bridge */ /* synthetic */ FbAutofillData gE(Set set) {
        return new EmailAutofillData(m29395C(set));
    }

    public final /* bridge */ /* synthetic */ Map gI() {
        return new HashMap(this.f72860B);
    }
}
