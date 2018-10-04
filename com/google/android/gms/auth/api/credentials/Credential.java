package com.google.android.gms.auth.api.credentials;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass5f6;
import X.AnonymousClass5fb;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Credential extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5f6();
    /* renamed from: B */
    public final String f67882B;
    /* renamed from: C */
    public final String f67883C;
    /* renamed from: D */
    public final Uri f67884D;
    /* renamed from: E */
    public final List f67885E;
    /* renamed from: F */
    public final String f67886F;
    /* renamed from: G */
    public final String f67887G;
    /* renamed from: H */
    public final String f67888H;
    /* renamed from: I */
    public final String f67889I;
    /* renamed from: J */
    public final String f67890J;
    /* renamed from: K */
    private final String f67891K;
    /* renamed from: L */
    private int f67892L;

    public Credential(int i, String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f67892L = i;
        String trim = ((String) AnonymousClass1Ew.E(str, "credential identifier cannot be null")).trim();
        AnonymousClass1Ew.H(trim, "credential identifier cannot be empty");
        this.f67883C = trim;
        if (str2 != null && TextUtils.isEmpty(str2.trim())) {
            str2 = null;
        }
        this.f67882B = str2;
        this.f67884D = uri;
        this.f67885E = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.f67886F = str3;
        if (str3 != null) {
            if (str3.isEmpty()) {
                throw new IllegalArgumentException("password cannot be empty");
            }
        }
        if (!TextUtils.isEmpty(str4)) {
            AnonymousClass5fb.m28226B(str4);
        }
        this.f67887G = str4;
        this.f67888H = str5;
        this.f67891K = str6;
        this.f67889I = str7;
        this.f67890J = str8;
        if (!TextUtils.isEmpty(this.f67886F)) {
            if (!TextUtils.isEmpty(this.f67887G)) {
                throw new IllegalStateException("password and accountType cannot both be set");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Credential) {
                Credential credential = (Credential) obj;
                if (TextUtils.equals(this.f67883C, credential.f67883C) && TextUtils.equals(this.f67882B, credential.f67882B) && AnonymousClass1zL.B(this.f67884D, credential.f67884D) && TextUtils.equals(this.f67886F, credential.f67886F) && TextUtils.equals(this.f67887G, credential.f67887G) && TextUtils.equals(this.f67888H, credential.f67888H)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67883C, this.f67882B, this.f67884D, this.f67886F, this.f67887G, this.f67888H});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f67883C, false);
        AnonymousClass1zC.I(parcel, 2, this.f67882B, false);
        AnonymousClass1zC.G(parcel, 3, this.f67884D, i, false);
        AnonymousClass1zC.T(parcel, 4, this.f67885E, false);
        AnonymousClass1zC.I(parcel, 5, this.f67886F, false);
        AnonymousClass1zC.I(parcel, 6, this.f67887G, false);
        AnonymousClass1zC.I(parcel, 7, this.f67888H, false);
        AnonymousClass1zC.S(parcel, JsonMappingException.MAX_REFS_TO_LIST, this.f67892L);
        AnonymousClass1zC.I(parcel, 8, this.f67891K, false);
        AnonymousClass1zC.I(parcel, 9, this.f67889I, false);
        AnonymousClass1zC.I(parcel, 10, this.f67890J, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
