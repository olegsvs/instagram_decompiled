package com.google.android.gms.location;

import X.AnonymousClass1yy;
import X.AnonymousClass1zC;
import X.AnonymousClass5g9;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class LocationSettingsResult extends zza implements AnonymousClass1yy {
    public static final Creator CREATOR = new AnonymousClass5g9();
    /* renamed from: B */
    public final LocationSettingsStates f68055B;
    /* renamed from: C */
    private final Status f68056C;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f68056C = status;
        this.f68055B = locationSettingsStates;
    }

    public final Status HS() {
        return this.f68056C;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, HS(), i, false);
        AnonymousClass1zC.G(parcel, 2, this.f68055B, i, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
