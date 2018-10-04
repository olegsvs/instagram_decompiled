package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class zzee extends Binder implements IInterface {
    public zzee() {
        AnonymousClass0cQ.m5858H(this, 802425084, AnonymousClass0cQ.m5859I(this, 1414600153));
    }

    /* renamed from: A */
    public final boolean m10298A(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean onTransact;
        int i3;
        int I = AnonymousClass0cQ.m5859I(this, -373598971);
        if (i > 16777215) {
            onTransact = super.onTransact(i, parcel, parcel2, i2);
            i3 = 808695403;
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            onTransact = false;
            i3 = 1742863099;
        }
        AnonymousClass0cQ.m5858H(this, i3, I);
        return onTransact;
    }

    public IBinder asBinder() {
        AnonymousClass0cQ.m5858H(this, -1747307835, AnonymousClass0cQ.m5859I(this, -1292125169));
        return this;
    }
}
