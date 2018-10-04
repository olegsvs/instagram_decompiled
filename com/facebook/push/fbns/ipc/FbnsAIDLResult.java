package com.facebook.push.fbns.ipc;

import X.AnonymousClass1EA;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;

public class FbnsAIDLResult implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1EA();
    /* renamed from: B */
    private Bundle f15846B;
    /* renamed from: C */
    private final long f15847C;

    public final int describeContents() {
        return 0;
    }

    public FbnsAIDLResult(Bundle bundle) {
        this.f15847C = SystemClock.elapsedRealtime();
        this.f15846B = bundle;
    }

    public FbnsAIDLResult(Parcel parcel) {
        this.f15847C = parcel.readLong();
        this.f15846B = parcel.readBundle();
    }

    /* renamed from: A */
    public final Bundle m10173A() {
        Bundle bundle = this.f15846B;
        return bundle == null ? Bundle.EMPTY : bundle;
    }

    /* renamed from: B */
    public void mo2249B(Parcel parcel, int i) {
        parcel.writeLong(this.f15847C);
        parcel.writeBundle(this.f15846B);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        mo2249B(parcel, i);
    }
}
