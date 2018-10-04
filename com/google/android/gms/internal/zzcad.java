package com.google.android.gms.internal;

import X.AnonymousClass0cQ;
import X.AnonymousClass1FC;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper.zza;

public abstract class zzcad extends zzee implements zzcac {
    public zzcad() {
        int I = AnonymousClass0cQ.I(this, 1016740873);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        AnonymousClass0cQ.H(this, 1743328387, I);
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int I = AnonymousClass0cQ.I(this, -1080605109);
        if (A(i, parcel, parcel2, i2)) {
            i3 = 754359424;
        } else {
            switch (i) {
                case 1:
                    init(zza.C(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 2:
                    boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), AnonymousClass1FC.E(parcel), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(booleanFlagValue);
                    break;
                case 3:
                    i3 = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    break;
                case 4:
                    long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(longFlagValue);
                    break;
                case 5:
                    String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeString(stringFlagValue);
                    break;
                default:
                    AnonymousClass0cQ.H(this, 1543817687, I);
                    return false;
            }
            i3 = -1406252104;
        }
        AnonymousClass0cQ.H(this, i3, I);
        return true;
    }
}
