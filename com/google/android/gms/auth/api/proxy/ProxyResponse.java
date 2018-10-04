package com.google.android.gms.auth.api.proxy;

import X.AnonymousClass1zC;
import X.AnonymousClass5fG;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.safeparcel.zza;

public class ProxyResponse extends zza {
    public static final Creator CREATOR = new AnonymousClass5fG();
    /* renamed from: B */
    public final byte[] f67951B;
    /* renamed from: C */
    public final int f67952C;
    /* renamed from: D */
    public final PendingIntent f67953D;
    /* renamed from: E */
    public final int f67954E;
    /* renamed from: F */
    private int f67955F;
    /* renamed from: G */
    private Bundle f67956G;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.f67955F = i;
        this.f67952C = i2;
        this.f67954E = i3;
        this.f67956G = bundle;
        this.f67951B = bArr;
        this.f67953D = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f67952C);
        AnonymousClass1zC.G(parcel, 2, this.f67953D, i, false);
        AnonymousClass1zC.S(parcel, 3, this.f67954E);
        AnonymousClass1zC.D(parcel, 4, this.f67956G, false);
        AnonymousClass1zC.L(parcel, 5, this.f67951B, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67955F);
        AnonymousClass1zC.B(parcel, U);
    }
}
