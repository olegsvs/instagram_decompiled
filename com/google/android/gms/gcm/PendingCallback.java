package com.google.android.gms.gcm;

import X.AnonymousClass1zt;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;

public class PendingCallback implements Parcelable, ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass1zt();
    /* renamed from: B */
    public final IBinder f20350B;

    public PendingCallback(Parcel parcel) {
        this.f20350B = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f20350B);
    }
}
