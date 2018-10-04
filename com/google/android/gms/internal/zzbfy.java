package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import android.os.Parcel;

public abstract class zzbfy extends zzee implements zzbfx {
    public zzbfy() {
        int I = AnonymousClass0cQ.I(this, -535968221);
        attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
        AnonymousClass0cQ.H(this, 1287834063, I);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, -632925785);
        if (A(i, parcel, parcel2, i2)) {
            i3 = -1075008788;
        } else if (i == 1) {
            oXA(parcel.readInt());
            parcel2.writeNoException();
            i3 = 1040393123;
        } else {
            AnonymousClass0cQ.H(this, 130083367, I);
            return false;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
