package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass0Ip;
import X.AnonymousClass5cz;
import X.AnonymousClass5d0;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class NameAutofillData extends BrowserExtensionsAutofillData {
    /* renamed from: B */
    public static final Set f73946B = new AnonymousClass5cz();
    public static final Creator CREATOR = new AnonymousClass5d0();

    /* renamed from: B */
    public final String mo6776B() {
        return "name-autofill-data";
    }

    public NameAutofillData(Parcel parcel) {
        super(parcel);
    }

    public NameAutofillData(Map map) {
        super(map);
    }

    public NameAutofillData(JSONObject jSONObject) {
        super(jSONObject);
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ BrowserExtensionsAutofillData mo6775A(Set set) {
        return new NameAutofillData(m29395C(set));
    }

    /* renamed from: D */
    public final String mo6777D() {
        String str = "name";
        if (!AnonymousClass0Ip.B((String) this.f72860B.get(str))) {
            return (String) this.f72860B.get(str);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(BrowserExtensionsAutofillData.m29392B((String) this.f72860B.get("given-name")));
        stringBuilder.append(" ");
        stringBuilder.append(BrowserExtensionsAutofillData.m29392B((String) this.f72860B.get("family-name")));
        return stringBuilder.toString().trim();
    }

    public final /* bridge */ /* synthetic */ FbAutofillData gE(Set set) {
        return new NameAutofillData(m29395C(set));
    }

    public final /* bridge */ /* synthetic */ Map gI() {
        Map hashMap = new HashMap(this.f72860B);
        for (String str : new LinkedList(hashMap.keySet())) {
            String str2 = (String) hashMap.get(str);
            if (str2 == null || str2.isEmpty()) {
                hashMap.remove(str);
            }
        }
        return hashMap;
    }
}
