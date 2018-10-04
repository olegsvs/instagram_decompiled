package com.google.android.gms.identity.intents;

import X.AnonymousClass1zC;
import X.AnonymousClass5fY;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

public final class UserAddressRequest extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fY();
    /* renamed from: B */
    public List f67975B;

    public UserAddressRequest(List list) {
        this.f67975B = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.T(parcel, 2, this.f67975B, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
