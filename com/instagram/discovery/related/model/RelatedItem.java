package com.instagram.discovery.related.model;

import X.AnonymousClass3JO;
import X.AnonymousClass3JP;
import X.AnonymousClass3JQ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class RelatedItem implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass3JO();
    /* renamed from: B */
    public String f40033B;
    /* renamed from: C */
    public String f40034C;
    /* renamed from: D */
    public String f40035D;
    /* renamed from: E */
    public AnonymousClass3JQ f40036E;

    public final int describeContents() {
        return 0;
    }

    public RelatedItem(Parcel parcel) {
        this.f40033B = parcel.readString();
        this.f40035D = parcel.readString();
        this.f40034C = parcel.readString();
    }

    public RelatedItem(String str, String str2, AnonymousClass3JQ anonymousClass3JQ) {
        this.f40033B = str;
        this.f40035D = str2;
        this.f40034C = anonymousClass3JQ.m19339A();
        this.f40036E = anonymousClass3JQ;
    }

    /* renamed from: A */
    public final String m19340A() {
        if (AnonymousClass3JP.f40026B[m19341B().ordinal()] != 1) {
            return this.f40035D;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("#");
        stringBuilder.append(this.f40035D);
        return stringBuilder.toString();
    }

    /* renamed from: B */
    public final AnonymousClass3JQ m19341B() {
        if (this.f40036E == null) {
            this.f40036E = AnonymousClass3JQ.m19338B(this.f40034C);
        }
        return this.f40036E;
    }

    /* renamed from: C */
    public final String m19342C() {
        if (AnonymousClass3JP.f40026B[m19341B().ordinal()] != 1) {
            return this.f40033B;
        }
        return this.f40035D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f40033B);
        parcel.writeString(this.f40035D);
        parcel.writeString(this.f40034C);
    }
}
