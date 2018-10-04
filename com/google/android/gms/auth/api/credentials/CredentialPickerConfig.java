package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1zC;
import X.AnonymousClass5ez;
import X.AnonymousClass5f7;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class CredentialPickerConfig extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5f7();
    /* renamed from: B */
    public final boolean f67896B;
    /* renamed from: C */
    public final boolean f67897C;
    /* renamed from: D */
    private int f67898D;
    /* renamed from: E */
    private final int f67899E;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.f67898D = i;
        this.f67897C = z;
        this.f67896B = z2;
        int i3 = 1;
        if (i < 2) {
            if (z3) {
                i3 = 3;
            }
            this.f67899E = i3;
            return;
        }
        this.f67899E = i2;
    }

    public CredentialPickerConfig(AnonymousClass5ez anonymousClass5ez) {
        this(2, anonymousClass5ez.f67894C, anonymousClass5ez.f67893B, false, anonymousClass5ez.f67895D);
    }

    /* renamed from: A */
    public final boolean m28205A() {
        return this.f67899E == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.K(parcel, 1, this.f67897C);
        AnonymousClass1zC.K(parcel, 2, this.f67896B);
        AnonymousClass1zC.K(parcel, 3, m28205A());
        AnonymousClass1zC.S(parcel, 4, this.f67899E);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67898D);
        AnonymousClass1zC.B(parcel, U);
    }
}
