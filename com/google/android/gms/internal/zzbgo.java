package com.google.android.gms.internal;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass20u;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzbgo extends zza {
    public static final Creator CREATOR = new AnonymousClass20u();
    /* renamed from: B */
    public final HashMap f25247B;
    /* renamed from: C */
    public final String f25248C;
    /* renamed from: D */
    private int f25249D;

    public zzbgo(int i, ArrayList arrayList, String str) {
        this.f25249D = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzbgp zzbgp = (zzbgp) arrayList.get(i2);
            String str2 = zzbgp.f25250B;
            HashMap hashMap2 = new HashMap();
            int size2 = zzbgp.f25251C.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zzbgq zzbgq = (zzbgq) zzbgp.f25251C.get(i3);
                hashMap2.put(zzbgq.f25253B, zzbgq.f25254C);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f25247B = hashMap;
        this.f25248C = (String) AnonymousClass1Ew.I(str);
        for (String str3 : this.f25247B.keySet()) {
            Map map = (Map) this.f25247B.get(str3);
            for (String str4 : map.keySet()) {
                ((zzbgj) map.get(str4)).f25244J = this;
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String str : this.f25247B.keySet()) {
            stringBuilder.append(str);
            stringBuilder.append(":\n");
            Map map = (Map) this.f25247B.get(str);
            for (String str2 : map.keySet()) {
                stringBuilder.append("  ");
                stringBuilder.append(str2);
                stringBuilder.append(": ");
                stringBuilder.append(map.get(str2));
            }
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25249D);
        List arrayList = new ArrayList();
        for (String str : this.f25247B.keySet()) {
            arrayList.add(new zzbgp(str, (Map) this.f25247B.get(str)));
        }
        AnonymousClass1zC.m14072T(parcel, 2, arrayList, false);
        AnonymousClass1zC.m14061I(parcel, 3, this.f25248C, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
