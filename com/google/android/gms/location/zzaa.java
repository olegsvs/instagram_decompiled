package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5fy;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Collections;
import java.util.List;

public final class zzaa extends zza {
    public static final Creator CREATOR = new AnonymousClass5fy();
    /* renamed from: B */
    private final PendingIntent f68063B;
    /* renamed from: C */
    private final String f68064C;
    /* renamed from: D */
    private final List f68065D;

    public zzaa(List list, PendingIntent pendingIntent, String str) {
        this.f68065D = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f68063B = pendingIntent;
        this.f68064C = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.R(parcel, 1, this.f68065D, false);
        AnonymousClass1zC.G(parcel, 2, this.f68063B, i, false);
        AnonymousClass1zC.I(parcel, 3, this.f68064C, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
