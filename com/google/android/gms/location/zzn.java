package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.zzee;

public abstract class zzn extends zzee implements zzm {
    /* renamed from: B */
    public static zzm m29439B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new zzo(iBinder);
    }
}
