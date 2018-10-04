package com.facebook.android.instantexperiences.autofill.model;

import X.AnonymousClass5d1;
import X.AnonymousClass5d2;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class TelephoneAutofillData extends BrowserExtensionsAutofillData {
    /* renamed from: C */
    public static final Set f73947C = new AnonymousClass5d1();
    public static final Creator CREATOR = new AnonymousClass5d2();
    /* renamed from: B */
    public final String f73948B;

    /* renamed from: B */
    public final String mo6776B() {
        return "telephone-autofill-data";
    }

    public TelephoneAutofillData(Parcel parcel) {
        super(parcel);
        this.f73948B = parcel.readString();
    }

    public TelephoneAutofillData(Map map, String str) {
        this.f72860B = map;
        this.f73948B = str;
    }

    public TelephoneAutofillData(org.json.JSONObject r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r2.<init>(r3);
        if (r3 == 0) goto L_0x0017;
    L_0x0005:
        r0 = "display_number";	 Catch:{ JSONException -> 0x000c }
        r0 = r3.getString(r0);	 Catch:{ JSONException -> 0x000c }
        goto L_0x0018;	 Catch:{ JSONException -> 0x000c }
    L_0x000c:
        r1 = r2.f72860B;
        r0 = "tel";
        r0 = r1.get(r0);
        r0 = (java.lang.String) r0;
        goto L_0x0018;
    L_0x0017:
        r0 = 0;
    L_0x0018:
        r2.f73948B = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData.<init>(org.json.JSONObject):void");
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ BrowserExtensionsAutofillData mo6775A(Set set) {
        return new TelephoneAutofillData(m29395C(set), this.f73948B);
    }

    /* renamed from: D */
    public final String mo6777D() {
        return this.f73948B;
    }

    /* renamed from: E */
    public final JSONObject mo6778E() {
        JSONObject E = super.mo6778E();
        E.put("display_number", this.f73948B);
        return E;
    }

    public final /* bridge */ /* synthetic */ FbAutofillData gE(Set set) {
        return new TelephoneAutofillData(m29395C(set), this.f73948B);
    }

    public final /* bridge */ /* synthetic */ Map gI() {
        return new HashMap(this.f72860B);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f73948B);
    }
}
