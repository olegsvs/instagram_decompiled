package com.google.android.gms.gcm;

import X.AnonymousClass1FI;
import X.AnonymousClass1zu;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public class PeriodicTask extends Task {
    public static final Creator CREATOR = new AnonymousClass1zu();
    /* renamed from: B */
    public long f25125B = -1;
    /* renamed from: C */
    public long f25126C = -1;

    public PeriodicTask(AnonymousClass1FI anonymousClass1FI) {
        super(anonymousClass1FI);
        this.f25126C = anonymousClass1FI.f16010B;
        this.f25125B = Math.min(anonymousClass1FI.f16011C, this.f25126C);
    }

    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.f25126C = parcel.readLong();
        this.f25125B = Math.min(parcel.readLong(), this.f25126C);
    }

    /* renamed from: A */
    public final void m14124A(Bundle bundle) {
        super.A(bundle);
        bundle.putLong("period", this.f25126C);
        bundle.putLong("period_flex", this.f25125B);
    }

    public final String toString() {
        String valueOf = String.valueOf(super.toString());
        long j = this.f25126C;
        long j2 = this.f25125B;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 54);
        stringBuilder.append(valueOf);
        stringBuilder.append(" period=");
        stringBuilder.append(j);
        stringBuilder.append(" flex=");
        stringBuilder.append(j2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.f25126C);
        parcel.writeLong(this.f25125B);
    }
}
