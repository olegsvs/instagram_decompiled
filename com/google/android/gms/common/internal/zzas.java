package com.google.android.gms.common.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.zzee;

public abstract class zzas extends zzee implements zzar {
    public zzas() {
        int I = AnonymousClass0cQ.m5859I(this, 583388642);
        attachInterface(this, "com.google.android.gms.common.internal.ICertData");
        AnonymousClass0cQ.m5858H(this, 22106478, I);
    }

    /* renamed from: C */
    public static zzar m10297C(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof zzar ? (zzar) queryLocalInterface : new zzat(iBinder);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.m5859I(this, -494632913);
        if (m10298A(i, parcel, parcel2, i2)) {
            i3 = 1851851488;
        } else {
            switch (i) {
                case 1:
                    IInterface VYA = VYA();
                    parcel2.writeNoException();
                    AnonymousClass1FC.m10313C(parcel2, VYA);
                    break;
                case 2:
                    i3 = WYA();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                default:
                    AnonymousClass0cQ.m5858H(this, 14486095, I);
                    return false;
            }
            i3 = -1256613007;
        }
        AnonymousClass0cQ.m5858H(this, i3, I);
        return true;
    }
}
