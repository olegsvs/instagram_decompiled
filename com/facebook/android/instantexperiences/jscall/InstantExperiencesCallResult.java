package com.facebook.android.instantexperiences.jscall;

import X.AnonymousClass0Dc;
import X.AnonymousClass0Ip;
import X.AnonymousClass5dA;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;

public abstract class InstantExperiencesCallResult implements Parcelable {
    /* renamed from: B */
    public String f67510B;
    /* renamed from: C */
    public final AnonymousClass5dA f67511C;
    /* renamed from: D */
    public String f67512D;
    /* renamed from: E */
    public final List f67513E;

    public int describeContents() {
        return 0;
    }

    public InstantExperiencesCallResult(AnonymousClass5dA anonymousClass5dA, String str) {
        this.f67513E = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", Integer.toString(anonymousClass5dA.m28147A()));
            if (!AnonymousClass0Ip.B(str)) {
                jSONObject.put("errorMessage", str);
            }
        } catch (Throwable e) {
            AnonymousClass0Dc.C(InstantExperiencesCallResult.class, "Failed to create error", e);
        }
        this.f67513E.add(jSONObject.toString());
        this.f67511C = anonymousClass5dA;
    }

    public InstantExperiencesCallResult(Parcel parcel) {
        this.f67513E = (ArrayList) parcel.readSerializable();
        this.f67512D = parcel.readString();
        this.f67510B = parcel.readString();
        this.f67511C = (AnonymousClass5dA) parcel.readSerializable();
    }

    public InstantExperiencesCallResult(List list) {
        this.f67513E = list;
        this.f67511C = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Collection collection = this.f67513E;
        parcel.writeSerializable(collection == null ? null : new ArrayList(collection));
        parcel.writeString(this.f67512D);
        parcel.writeString(this.f67510B);
        parcel.writeSerializable(this.f67511C);
    }
}
