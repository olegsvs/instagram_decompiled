package com.facebook.android.instantexperiences.autofill.model;

import android.os.Parcel;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public abstract class BrowserExtensionsAutofillData implements FbAutofillData {
    /* renamed from: B */
    public Map f72860B;

    /* renamed from: B */
    public static String m29392B(String str) {
        return str == null ? JsonProperty.USE_DEFAULT_NAME : str;
    }

    /* renamed from: A */
    public abstract BrowserExtensionsAutofillData mo6775A(Set set);

    /* renamed from: B */
    public abstract String mo6776B();

    /* renamed from: D */
    public abstract String mo6777D();

    public final int describeContents() {
        return 0;
    }

    public abstract Map gI();

    public BrowserExtensionsAutofillData() {
        this.f72860B = new HashMap();
    }

    public BrowserExtensionsAutofillData(Parcel parcel) {
        this.f72860B = parcel.readHashMap(String.class.getClassLoader());
    }

    public BrowserExtensionsAutofillData(Map map) {
        this.f72860B = map;
    }

    public BrowserExtensionsAutofillData(JSONObject jSONObject) {
        this();
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("autocomplete_data");
            if (optJSONObject != null) {
                Iterator keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    this.f72860B.put(str, optJSONObject.optString(str));
                }
            }
        }
    }

    /* renamed from: C */
    public final Map m29395C(Set set) {
        Map hashMap = new HashMap();
        for (String str : this.f72860B.keySet()) {
            if (set.contains(str)) {
                hashMap.put(str, this.f72860B.get(str));
            }
        }
        return hashMap;
    }

    /* renamed from: E */
    public JSONObject mo6778E() {
        JSONObject jSONObject = new JSONObject();
        Map gI = gI();
        for (String str : gI.keySet()) {
            jSONObject.put(str, gI.get(str));
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("autocomplete_data", jSONObject);
        return jSONObject2;
    }

    public final boolean KF() {
        for (String str : this.f72860B.keySet()) {
            if (this.f72860B.get(str) != null && !((String) this.f72860B.get(str)).isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (getClass().equals(obj.getClass())) {
                BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) obj;
                if (this.f72860B.size() == browserExtensionsAutofillData.f72860B.size()) {
                    Iterator it = this.f72860B.keySet().iterator();
                    while (true) {
                        int i = 1;
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            String str2 = (String) this.f72860B.get(str);
                            str = (String) browserExtensionsAutofillData.f72860B.get(str);
                            int i2 = str2 != null ? 1 : 0;
                            if (str == null) {
                                i = 0;
                            }
                            if ((i ^ i2) == 0) {
                                if (str2 != null && str != null && !str2.equals(str)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public /* bridge */ /* synthetic */ FbAutofillData gE(Set set) {
        return mo6775A(set);
    }

    public final boolean iY(FbAutofillData fbAutofillData) {
        if (fbAutofillData != null) {
            if (getClass().equals(fbAutofillData.getClass())) {
                BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) fbAutofillData;
                if (browserExtensionsAutofillData != null) {
                    if (this.f72860B.size() <= browserExtensionsAutofillData.f72860B.size()) {
                        for (String str : this.f72860B.keySet()) {
                            String str2 = (String) this.f72860B.get(str);
                            String str3 = (String) browserExtensionsAutofillData.f72860B.get(str);
                            if ((str2 == null || str3 != null) && (str2 == null || str3 == null || str2.equals(str3))) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f72860B);
    }
}
