package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass5f3;
import X.AnonymousClass5f9;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class HintRequest extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5f9();
    /* renamed from: B */
    public final String[] f67922B;
    /* renamed from: C */
    public final boolean f67923C;
    /* renamed from: D */
    public final String f67924D;
    /* renamed from: E */
    public final String f67925E;
    /* renamed from: F */
    public final CredentialPickerConfig f67926F;
    /* renamed from: G */
    public final boolean f67927G;
    /* renamed from: H */
    private int f67928H;
    /* renamed from: I */
    private final boolean f67929I;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.f67928H = i;
        this.f67926F = (CredentialPickerConfig) AnonymousClass1Ew.I(credentialPickerConfig);
        this.f67927G = z;
        this.f67929I = z2;
        this.f67922B = (String[]) AnonymousClass1Ew.I(strArr);
        if (this.f67928H < 2) {
            this.f67923C = true;
            this.f67924D = null;
            this.f67925E = null;
            return;
        }
        this.f67923C = z3;
        this.f67924D = str;
        this.f67925E = str2;
    }

    public HintRequest(AnonymousClass5f3 anonymousClass5f3) {
        this(2, anonymousClass5f3.f67919F, anonymousClass5f3.f67920G, anonymousClass5f3.f67921H, anonymousClass5f3.f67915B, anonymousClass5f3.f67916C, anonymousClass5f3.f67917D, anonymousClass5f3.f67918E);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.G(parcel, 1, this.f67926F, i, false);
        AnonymousClass1zC.K(parcel, 2, this.f67927G);
        AnonymousClass1zC.K(parcel, 3, this.f67929I);
        AnonymousClass1zC.O(parcel, 4, this.f67922B, false);
        AnonymousClass1zC.K(parcel, 5, this.f67923C);
        AnonymousClass1zC.I(parcel, 6, this.f67924D, false);
        AnonymousClass1zC.I(parcel, 7, this.f67925E, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67928H);
        AnonymousClass1zC.B(parcel, U);
    }
}
