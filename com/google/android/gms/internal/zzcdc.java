package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsResult;

public abstract class zzcdc extends zzee implements zzcdb {
    public zzcdc() {
        int I = AnonymousClass0cQ.I(this, 728576932);
        attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
        AnonymousClass0cQ.H(this, -123156398, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, -125119183);
        if (A(i, parcel, parcel2, i2)) {
            i3 = 1525916201;
        } else if (i == 1) {
            lXA((LocationSettingsResult) AnonymousClass1FC.B(parcel, LocationSettingsResult.CREATOR));
            i3 = -1227049118;
        } else {
            AnonymousClass0cQ.H(this, 872377246, I);
            return false;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
