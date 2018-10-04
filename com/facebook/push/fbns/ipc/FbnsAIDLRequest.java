package com.facebook.push.fbns.ipc;

import X.AnonymousClass1EB;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Creator CREATOR = new AnonymousClass1EB();
    /* renamed from: B */
    public int f15845B;

    public FbnsAIDLRequest(Bundle bundle, int i) {
        super(bundle);
        this.f15845B = i;
    }

    public FbnsAIDLRequest(Parcel parcel) {
        super(parcel);
        this.f15845B = parcel.readInt();
    }

    /* renamed from: B */
    public final void mo2249B(Parcel parcel, int i) {
        super.mo2249B(parcel, i);
        parcel.writeInt(this.f15845B);
    }
}
