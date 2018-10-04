package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass20o;
import X.AnonymousClass20r;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class zzbge extends zza implements AnonymousClass20r {
    public static final Creator CREATOR = new AnonymousClass20o();
    /* renamed from: B */
    public final HashMap f30774B;
    /* renamed from: C */
    public final SparseArray f30775C;
    /* renamed from: D */
    private int f30776D;

    public zzbge() {
        this.f30776D = 1;
        this.f30774B = new HashMap();
        this.f30775C = new SparseArray();
    }

    public zzbge(int i, ArrayList arrayList) {
        this.f30776D = i;
        this.f30774B = new HashMap();
        this.f30775C = new SparseArray();
        arrayList = arrayList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zzbgf zzbgf = (zzbgf) obj;
            String str = zzbgf.f25233B;
            int i3 = zzbgf.f25234C;
            this.f30774B.put(str, Integer.valueOf(i3));
            this.f30775C.put(i3, str);
        }
    }

    public final /* synthetic */ Object SF(Object obj) {
        String str = (String) this.f30775C.get(((Integer) obj).intValue());
        return (str == null && this.f30774B.containsKey("gms_unknown")) ? "gms_unknown" : str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f30776D);
        List arrayList = new ArrayList();
        for (String str : this.f30774B.keySet()) {
            arrayList.add(new zzbgf(str, ((Integer) this.f30774B.get(str)).intValue()));
        }
        AnonymousClass1zC.m14072T(parcel, 2, arrayList, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
