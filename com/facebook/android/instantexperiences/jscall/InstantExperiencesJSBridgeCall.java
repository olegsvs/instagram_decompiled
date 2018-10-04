package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Ip;
import X.AnonymousClass5d9;
import X.AnonymousClass5dA;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.core.InstantExperiencesParameters;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class InstantExperiencesJSBridgeCall implements Parcelable {
    /* renamed from: H */
    private static final String f67514H = "InstantExperiencesJSBridgeCall";
    /* renamed from: B */
    public final String f67515B;
    /* renamed from: C */
    public final String f67516C;
    /* renamed from: D */
    public InstantExperiencesCallResult f67517D;
    /* renamed from: E */
    public final InstantExperiencesParameters f67518E;
    /* renamed from: F */
    private final Bundle f67519F;
    /* renamed from: G */
    private final String f67520G;

    /* renamed from: A */
    public abstract String mo6306A();

    public final int describeContents() {
        return 0;
    }

    public InstantExperiencesJSBridgeCall(Parcel parcel) {
        this.f67518E = (InstantExperiencesParameters) parcel.readParcelable(InstantExperiencesParameters.class.getClassLoader());
        this.f67515B = parcel.readString();
        this.f67520G = parcel.readString();
        this.f67516C = parcel.readString();
        this.f67519F = parcel.readBundle();
        this.f67517D = (InstantExperiencesCallResult) parcel.readParcelable(InstantExperiencesCallResult.class.getClassLoader());
    }

    public InstantExperiencesJSBridgeCall(String str, InstantExperiencesParameters instantExperiencesParameters, String str2, JSONObject jSONObject) {
        this.f67520G = str;
        this.f67518E = instantExperiencesParameters;
        this.f67516C = str2;
        this.f67515B = jSONObject.getString("callbackID");
        this.f67519F = m28148B(jSONObject);
    }

    /* renamed from: B */
    private static Bundle m28148B(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            try {
                Object obj = jSONObject.get(str);
                if (obj != null) {
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Long) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else {
                        if (!(obj instanceof JSONObject)) {
                            if (!(obj instanceof JSONArray)) {
                                if (obj == JSONObject.NULL) {
                                    bundle.putString(str, null);
                                }
                            }
                        }
                        bundle.putString(str, obj.toString());
                    }
                }
            } catch (Throwable e) {
                AnonymousClass0Dc.G(f67514H, StringFormatUtil.formatStrLocaleSafe("JSONObject.keys() provided a problematic key : %s", str), e);
            }
        }
        return bundle;
    }

    /* renamed from: B */
    public final Object m28150B(String str) {
        if (this.f67519F.containsKey(str)) {
            return this.f67519F.get(str);
        }
        return null;
    }

    /* renamed from: C */
    public final void m28151C(InstantExperiencesCallResult instantExperiencesCallResult) {
        this.f67517D = instantExperiencesCallResult;
        instantExperiencesCallResult.f67510B = this.f67515B;
        this.f67517D.f67512D = this.f67520G;
    }

    /* renamed from: D */
    public void mo6307D() {
        String str = this.f67516C;
        if ((this.f67518E.RI().booleanValue() ^ 1) != 0) {
            if (!AnonymousClass0Ip.B(str)) {
                Uri parse = Uri.parse(str);
                if (!(parse == null || parse.getHost() == null || parse.getScheme() == null || !parse.getScheme().equalsIgnoreCase("https"))) {
                    if (parse.getPort() != 443) {
                        if (parse.getPort() == -1) {
                        }
                    }
                }
            }
            throw new AnonymousClass5d9(AnonymousClass5dA.URL_NOT_ALLOWED, null);
        }
        if (!this.f67518E.tY(str)) {
            throw new AnonymousClass5d9(AnonymousClass5dA.URL_NOT_ALLOWED, "This url cannot make this call");
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f67518E, i);
        parcel.writeString(this.f67515B);
        parcel.writeString(this.f67520G);
        parcel.writeString(this.f67516C);
        parcel.writeBundle(this.f67519F);
        parcel.writeParcelable(this.f67517D, i);
    }
}
