package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.zzee;

public abstract class zzav extends zzee implements zzau {
    public zzav() {
        int I = AnonymousClass0cQ.I(this, 1674444779);
        attachInterface(this, "com.google.android.gms.common.internal.IGmsCallbacks");
        AnonymousClass0cQ.H(this, -46721363, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, 777512092);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -484663411;
        } else {
            switch (i) {
                case 1:
                    NXA(parcel.readInt(), parcel.readStrongBinder(), (Bundle) AnonymousClass1FC.B(parcel, Bundle.CREATOR));
                    break;
                case 2:
                    MXA(parcel.readInt(), (Bundle) AnonymousClass1FC.B(parcel, Bundle.CREATOR));
                    break;
                default:
                    AnonymousClass0cQ.H(this, -258132570, I);
                    return false;
            }
            parcel2.writeNoException();
            i3 = 956979432;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
