package com.google.android.gms.gcm;

import X.AnonymousClass1FE;
import X.AnonymousClass1zs;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class OneoffTask extends Task {
    public static final Creator CREATOR = new AnonymousClass1zs();
    /* renamed from: B */
    public final long f25123B;
    /* renamed from: C */
    public final long f25124C;

    public OneoffTask(AnonymousClass1FE anonymousClass1FE) {
        super(anonymousClass1FE);
        this.f25123B = anonymousClass1FE.f15991B;
        this.f25124C = anonymousClass1FE.f15992C;
    }

    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.f25123B = parcel.readLong();
        this.f25124C = parcel.readLong();
    }

    /* renamed from: A */
    public final void m14123A(Bundle bundle) {
        super.A(bundle);
        bundle.putLong("window_start", this.f25123B);
        bundle.putLong("window_end", this.f25124C);
    }

    public final String toString() {
        String valueOf = String.valueOf(super.toString());
        long j = this.f25123B;
        long j2 = this.f25124C;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 64);
        stringBuilder.append(valueOf);
        stringBuilder.append(" windowStart=");
        stringBuilder.append(j);
        stringBuilder.append(" windowEnd=");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f25123B);
        parcel.writeLong(this.f25124C);
    }
}
