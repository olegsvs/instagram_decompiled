package com.instagram.common.analytics.intf;

import X.AnonymousClass23O;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class AnalyticsEventDebugInfo implements Parcelable {
    /* renamed from: B */
    public String f25483B;
    /* renamed from: C */
    public String f25484C;
    /* renamed from: D */
    private List f25485D;

    public final int describeContents() {
        return 0;
    }

    static {
        AnonymousClass23O anonymousClass23O = new AnonymousClass23O();
    }

    public AnalyticsEventDebugInfo() {
        this.f25485D = new ArrayList();
    }

    public AnalyticsEventDebugInfo(Parcel parcel) {
        List arrayList = new ArrayList();
        this.f25485D = arrayList;
        parcel.readTypedList(arrayList, AnalyticsEventEntry.CREATOR);
        this.f25483B = parcel.readString();
        this.f25484C = parcel.readString();
    }

    /* renamed from: A */
    public final void m14300A(AnalyticsEventEntry analyticsEventEntry) {
        this.f25485D.add(analyticsEventEntry);
    }

    /* renamed from: B */
    public final AnalyticsEventEntry m14301B(int i) {
        return (AnalyticsEventEntry) this.f25485D.get(i);
    }

    /* renamed from: C */
    public final int m14302C() {
        return this.f25485D.size();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f25485D);
        parcel.writeString(this.f25483B);
        parcel.writeString(this.f25484C);
    }
}
