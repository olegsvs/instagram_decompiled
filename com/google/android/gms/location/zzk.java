package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.zzee;

public abstract class zzk extends zzee implements zzj {
    /* renamed from: B */
    public static zzj m29438B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzj ? (zzj) queryLocalInterface : new zzl(iBinder);
    }
}
