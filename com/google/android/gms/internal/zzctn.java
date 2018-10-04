package com.google.android.gms.internal;

import X.AnonymousClass1yy;
import X.AnonymousClass1zC;
import X.AnonymousClass218;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class zzctn extends zza implements AnonymousClass1yy {
    public static final Creator CREATOR = new AnonymousClass218();
    /* renamed from: B */
    private int f30777B;
    /* renamed from: C */
    private int f30778C;
    /* renamed from: D */
    private Intent f30779D;

    public zzctn() {
        this(0, null);
    }

    public zzctn(int i, int i2, Intent intent) {
        this.f30777B = i;
        this.f30778C = i2;
        this.f30779D = intent;
    }

    private zzctn(int i, Intent intent) {
        this(2, 0, null);
    }

    public final Status HS() {
        return this.f30778C == 0 ? Status.f30573F : Status.f30577J;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f30777B);
        AnonymousClass1zC.m14071S(parcel, 2, this.f30778C);
        AnonymousClass1zC.m14059G(parcel, 3, this.f30779D, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
