package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass5ez;
import X.AnonymousClass5f0;
import X.AnonymousClass5f8;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class CredentialRequest extends zza {
    public static final Creator CREATOR = new AnonymousClass5f8();
    /* renamed from: B */
    public final boolean f67907B;
    /* renamed from: C */
    public final String[] f67908C;
    /* renamed from: D */
    public final CredentialPickerConfig f67909D;
    /* renamed from: E */
    public final CredentialPickerConfig f67910E;
    /* renamed from: F */
    public final boolean f67911F;
    /* renamed from: G */
    public final String f67912G;
    /* renamed from: H */
    public final String f67913H;
    /* renamed from: I */
    private int f67914I;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2) {
        this.f67914I = i;
        this.f67907B = z;
        this.f67908C = (String[]) AnonymousClass1Ew.I(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new CredentialPickerConfig(new AnonymousClass5ez());
        }
        this.f67909D = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new CredentialPickerConfig(new AnonymousClass5ez());
        }
        this.f67910E = credentialPickerConfig2;
        if (i < 3) {
            this.f67911F = true;
            this.f67912G = null;
            this.f67913H = null;
            return;
        }
        this.f67911F = z2;
        this.f67912G = str;
        this.f67913H = str2;
    }

    public CredentialRequest(AnonymousClass5f0 anonymousClass5f0) {
        this(3, anonymousClass5f0.f67900B, anonymousClass5f0.f67901C, anonymousClass5f0.f67902D, anonymousClass5f0.f67903E, anonymousClass5f0.f67904F, anonymousClass5f0.f67905G, anonymousClass5f0.f67906H);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.K(parcel, 1, this.f67907B);
        AnonymousClass1zC.O(parcel, 2, this.f67908C, false);
        AnonymousClass1zC.G(parcel, 3, this.f67909D, i, false);
        AnonymousClass1zC.G(parcel, 4, this.f67910E, i, false);
        AnonymousClass1zC.K(parcel, 5, this.f67911F);
        AnonymousClass1zC.I(parcel, 6, this.f67912G, false);
        AnonymousClass1zC.I(parcel, 7, this.f67913H, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67914I);
        AnonymousClass1zC.B(parcel, U);
    }
}
