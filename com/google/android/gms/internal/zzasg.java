package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

public abstract class zzasg extends zzee implements zzasf {
    public zzasg() {
        int I = AnonymousClass0cQ.I(this, -871980894);
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
        AnonymousClass0cQ.H(this, -22311228, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, -1881210220);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -935890652;
        } else if (i == 1) {
            JYA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
            i3 = -888287984;
        } else {
            AnonymousClass0cQ.H(this, -1779664038, I);
            return false;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
