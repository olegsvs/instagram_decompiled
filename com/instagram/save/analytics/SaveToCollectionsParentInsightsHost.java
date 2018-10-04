package com.instagram.save.analytics;

import X.AnonymousClass0P7;
import X.AnonymousClass0db;
import X.AnonymousClass0uD;
import X.AnonymousClass1Q9;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class SaveToCollectionsParentInsightsHost implements AnonymousClass0uD, Parcelable {
    public static final Creator CREATOR = new AnonymousClass1Q9();
    /* renamed from: B */
    private final AnonymousClass0db f12486B;
    /* renamed from: C */
    private final String f12487C;
    /* renamed from: D */
    private final boolean f12488D;
    /* renamed from: E */
    private final boolean f12489E;

    public final int describeContents() {
        return 0;
    }

    public SaveToCollectionsParentInsightsHost(String str, boolean z, boolean z2, AnonymousClass0db anonymousClass0db) {
        this.f12487C = str;
        this.f12489E = z;
        this.f12488D = z2;
        this.f12486B = anonymousClass0db;
    }

    public final AnonymousClass0db CIA(AnonymousClass0P7 anonymousClass0P7) {
        AnonymousClass0db anonymousClass0db = this.f12486B;
        return anonymousClass0db != null ? anonymousClass0db : AnonymousClass0db.m6067C();
    }

    public final String getModuleName() {
        return this.f12487C;
    }

    public final boolean isOrganicEligible() {
        return this.f12488D;
    }

    public final boolean isSponsoredEligible() {
        return this.f12489E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12487C);
        parcel.writeByte((byte) this.f12489E);
        parcel.writeByte((byte) this.f12488D);
    }
}
