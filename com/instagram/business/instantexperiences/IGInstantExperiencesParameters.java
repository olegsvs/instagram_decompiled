package com.instagram.business.instantexperiences;

import X.AnonymousClass0Ip;
import X.AnonymousClass5gW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.core.InstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class IGInstantExperiencesParameters implements InstantExperiencesParameters {
    public static final Creator CREATOR = new AnonymousClass5gW();
    /* renamed from: K */
    public static final String f72924K = "IGInstantExperiencesParameters";
    /* renamed from: B */
    public String f72925B;
    /* renamed from: C */
    public final String f72926C;
    /* renamed from: D */
    public String f72927D;
    /* renamed from: E */
    public String f72928E;
    /* renamed from: F */
    private final InstantExperiencesFeatureEnabledList f72929F;
    /* renamed from: G */
    private final String f72930G;
    /* renamed from: H */
    private final long f72931H;
    /* renamed from: I */
    private final Uri f72932I;
    /* renamed from: J */
    private final Set f72933J;

    public final int describeContents() {
        return 0;
    }

    public IGInstantExperiencesParameters(String str) {
        this(str, Long.valueOf(new Random().nextLong()));
    }

    public IGInstantExperiencesParameters(String str, Long l) {
        this.f72930G = str;
        this.f72931H = l.longValue();
        JSONObject jSONObject = new JSONObject(this.f72930G);
        this.f72929F = new IGInstantExperiencesFeatureEnabledList();
        String B = m29440B(jSONObject, "whitelisted_domains");
        this.f72933J = new HashSet();
        for (String parse : B.split(",")) {
            Uri parse2 = Uri.parse(parse);
            if (!(parse2 == null || AnonymousClass0Ip.B(parse2.getHost()))) {
                this.f72933J.add(parse2.getHost());
            }
        }
        m29440B(jSONObject, "page_name");
        boolean B2 = AnonymousClass0Ip.B(jSONObject.optString("app_name"));
        this.f72926C = m29440B(jSONObject, "business_id");
        this.f72932I = Uri.parse(m29440B(jSONObject, "website_uri"));
    }

    /* renamed from: B */
    private static String m29440B(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str);
        if (!string.equals(JsonProperty.USE_DEFAULT_NAME)) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Empty strings are not allowed for parameter key: ");
        stringBuilder.append(str);
        throw new JSONException(stringBuilder.toString());
    }

    public final long JN() {
        return this.f72931H;
    }

    public final Boolean RI() {
        return Boolean.valueOf(false);
    }

    public final String XI() {
        return this.f72925B;
    }

    public final InstantExperiencesFeatureEnabledList mL() {
        return this.f72929F;
    }

    public final Uri nT() {
        return this.f72932I;
    }

    public final boolean tY(String str) {
        if (!TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getHost() == null)) {
                if (parse.getScheme() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f72930G);
        parcel.writeLong(this.f72931H);
    }
}
