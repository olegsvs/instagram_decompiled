package com.instagram.save.model;

import X.AnonymousClass0LQ;
import X.AnonymousClass0P7;
import X.AnonymousClass0Pn;
import X.AnonymousClass107;
import X.AnonymousClass1Y3;
import X.AnonymousClass3dX;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SavedCollection extends AnonymousClass0Pn implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Y3();
    /* renamed from: B */
    public String f12480B;
    /* renamed from: C */
    public String f12481C;
    /* renamed from: D */
    public AnonymousClass0P7 f12482D;
    /* renamed from: E */
    public List f12483E = new ArrayList();
    /* renamed from: F */
    public List f12484F = new ArrayList();
    /* renamed from: G */
    public AnonymousClass3dX f12485G = AnonymousClass3dX.f42902F;

    public final int describeContents() {
        return 0;
    }

    public SavedCollection(AnonymousClass3dX anonymousClass3dX) {
        this.f12480B = anonymousClass3dX.B();
        this.f12481C = anonymousClass3dX.B();
        this.f12485G = anonymousClass3dX;
    }

    public SavedCollection(Parcel parcel) {
        this.f12480B = parcel.readString();
        this.f12481C = parcel.readString();
        AnonymousClass107 anonymousClass107 = AnonymousClass107.f13182C;
        this.f12482D = anonymousClass107.m8703A(parcel.readString());
        this.f12485G = AnonymousClass3dX.B(parcel.readString());
        List<String> arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        for (String A : arrayList) {
            AnonymousClass0P7 A2 = anonymousClass107.m8703A(A);
            if (A2 != null) {
                this.f12483E.add(A2);
            }
        }
    }

    public SavedCollection(String str, String str2) {
        this.f12480B = str;
        this.f12481C = str2;
    }

    /* renamed from: F */
    public final List m8506F() {
        return Collections.unmodifiableList(this.f12483E);
    }

    /* renamed from: G */
    public final String m8507G(Context context) {
        AnonymousClass0P7 anonymousClass0P7 = this.f12482D;
        return anonymousClass0P7 != null ? anonymousClass0P7.m3794x(context) : null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SavedCollection)) {
            return false;
        }
        SavedCollection savedCollection = (SavedCollection) obj;
        if (AnonymousClass0LQ.m2954B(this.f12480B, savedCollection.f12480B) && AnonymousClass0LQ.m2954B(this.f12481C, savedCollection.f12481C) && AnonymousClass0LQ.m2954B(this.f12482D, savedCollection.f12482D) && AnonymousClass0LQ.m2954B(this.f12485G, savedCollection.f12485G) && AnonymousClass0LQ.m2954B(this.f12483E, savedCollection.m8506F())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.m2956D(this.f12480B, this.f12481C, this.f12482D, this.f12485G, this.f12483E);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12480B);
        parcel.writeString(this.f12481C);
        AnonymousClass0P7 anonymousClass0P7 = this.f12482D;
        parcel.writeString(anonymousClass0P7 != null ? anonymousClass0P7.NO() : null);
        parcel.writeString(this.f12485G.B());
        List arrayList = new ArrayList();
        for (AnonymousClass0P7 anonymousClass0P72 : this.f12483E) {
            arrayList.add(anonymousClass0P72.NO());
        }
        parcel.writeStringList(arrayList);
    }
}
