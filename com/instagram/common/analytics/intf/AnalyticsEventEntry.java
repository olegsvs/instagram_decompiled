package com.instagram.common.analytics.intf;

import X.AnonymousClass23P;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class AnalyticsEventEntry implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass23P();
    /* renamed from: B */
    public AnalyticsEventDebugInfo f25486B;
    /* renamed from: C */
    public String f25487C;
    /* renamed from: D */
    public String f25488D;

    public final int describeContents() {
        return 0;
    }

    public AnalyticsEventEntry(Parcel parcel) {
        this.f25487C = parcel.readString();
        this.f25488D = parcel.readString();
        this.f25486B = (AnalyticsEventDebugInfo) parcel.readParcelable(AnalyticsEventDebugInfo.class.getClassLoader());
    }

    public AnalyticsEventEntry(String str, AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        this.f25487C = str;
        this.f25486B = analyticsEventDebugInfo;
    }

    public AnalyticsEventEntry(String str, String str2) {
        this.f25487C = str;
        this.f25488D = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25487C);
        parcel.writeString(this.f25488D);
        parcel.writeParcelable(this.f25486B, i);
    }
}
