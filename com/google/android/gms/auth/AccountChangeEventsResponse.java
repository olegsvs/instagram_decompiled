package com.google.android.gms.auth;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass5fU;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public class AccountChangeEventsResponse extends zza {
    public static final Creator CREATOR = new AnonymousClass5fU();
    /* renamed from: B */
    private int f67862B;
    /* renamed from: C */
    private List f67863C;

    public AccountChangeEventsResponse(int i, List list) {
        this.f67862B = i;
        this.f67863C = (List) AnonymousClass1Ew.I(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67862B);
        AnonymousClass1zC.T(parcel, 2, this.f67863C, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
