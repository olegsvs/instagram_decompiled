package com.google.android.p001a;

import X.AnonymousClass0cQ;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.a.b */
public class C0053b extends Binder implements IInterface {
    public C0053b(String str) {
        int I = AnonymousClass0cQ.I(this, 1028811942);
        attachInterface(this, str);
        AnonymousClass0cQ.H(this, 1705782931, I);
    }

    /* renamed from: A */
    public boolean mo3144A(int i, Parcel parcel) {
        AnonymousClass0cQ.H(this, -1807593207, AnonymousClass0cQ.I(this, 640888886));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0cQ.H(this, 874657991, AnonymousClass0cQ.I(this, 1139030055));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean onTransact;
        boolean z;
        int i3;
        int I = AnonymousClass0cQ.I(this, -492863429);
        if (i > 16777215) {
            onTransact = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            onTransact = false;
        }
        if (onTransact) {
            z = true;
            i3 = 379135364;
        } else {
            z = mo3144A(i, parcel);
            i3 = 1929075254;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return z;
    }
}
