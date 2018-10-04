package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass20v;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.Map;

public final class zzbgp extends zza {
    public static final Creator CREATOR = new AnonymousClass20v();
    /* renamed from: B */
    public final String f25250B;
    /* renamed from: C */
    public ArrayList f25251C;
    /* renamed from: D */
    private int f25252D;

    public zzbgp(int i, String str, ArrayList arrayList) {
        this.f25252D = i;
        this.f25250B = str;
        this.f25251C = arrayList;
    }

    public zzbgp(String str, Map map) {
        ArrayList arrayList;
        this.f25252D = 1;
        this.f25250B = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zzbgq(str2, (zzbgj) map.get(str2)));
            }
        }
        this.f25251C = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25252D);
        AnonymousClass1zC.m14061I(parcel, 2, this.f25250B, false);
        AnonymousClass1zC.m14072T(parcel, 3, this.f25251C, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
