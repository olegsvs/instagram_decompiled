package com.google.android.gms.common.internal;

import X.AnonymousClass1zZ;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public final class BinderWrapper implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1zZ();
    /* renamed from: B */
    private IBinder f25014B = null;

    public BinderWrapper(Parcel parcel) {
        this.f25014B = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f25014B);
    }
}
