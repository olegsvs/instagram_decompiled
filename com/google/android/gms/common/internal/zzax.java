package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import android.os.IBinder;
import android.os.Parcel;

public final class zzax implements zzaw {
    /* renamed from: B */
    private final IBinder f30589B;

    public zzax(IBinder iBinder) {
        int I = AnonymousClass0cQ.I(this, 233367115);
        this.f30589B = iBinder;
        AnonymousClass0cQ.H(this, 1532694747, I);
    }

    public final void aXA(zzau zzau, zzx zzx) {
        int I = AnonymousClass0cQ.I(this, 716933425);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(zzau.asBinder());
            obtain.writeInt(1);
            zzx.writeToParcel(obtain, 0);
            this.f30589B.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0cQ.H(this, -1130668640, I);
        }
    }

    public final IBinder asBinder() {
        int I = AnonymousClass0cQ.I(this, 1487107254);
        IBinder iBinder = this.f30589B;
        AnonymousClass0cQ.H(this, -569993845, I);
        return iBinder;
    }
}
