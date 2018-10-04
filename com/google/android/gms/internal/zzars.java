package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzars extends zzee implements zzarr {
    public zzars() {
        int I = AnonymousClass0cQ.I(this, -1846154365);
        attachInterface(this, "com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        AnonymousClass0cQ.H(this, -1679891536, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, 513567730);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -2111951088;
        } else {
            switch (i) {
                case 1:
                    QXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), (Credential) AnonymousClass1FC.B(parcel, Credential.CREATOR));
                    break;
                case 2:
                    DYA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR));
                    break;
                case 3:
                    VXA((Status) AnonymousClass1FC.B(parcel, Status.CREATOR), parcel.readString());
                    break;
                default:
                    AnonymousClass0cQ.H(this, 1822125296, I);
                    return false;
            }
            parcel2.writeNoException();
            i3 = 802183146;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
