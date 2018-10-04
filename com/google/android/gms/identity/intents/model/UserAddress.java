package com.google.android.gms.identity.intents.model;

import X.AnonymousClass1zC;
import X.AnonymousClass5fX;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;

public final class UserAddress extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5fX();
    /* renamed from: B */
    private String f67977B;
    /* renamed from: C */
    private String f67978C;
    /* renamed from: D */
    private String f67979D;
    /* renamed from: E */
    private String f67980E;
    /* renamed from: F */
    private String f67981F;
    /* renamed from: G */
    private String f67982G;
    /* renamed from: H */
    private String f67983H;
    /* renamed from: I */
    private String f67984I;
    /* renamed from: J */
    private String f67985J;
    /* renamed from: K */
    private String f67986K;
    /* renamed from: L */
    private String f67987L;
    /* renamed from: M */
    private String f67988M;
    /* renamed from: N */
    private boolean f67989N;
    /* renamed from: O */
    private String f67990O;
    /* renamed from: P */
    private String f67991P;

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.f67977B = str;
        this.f67980E = str2;
        this.f67981F = str3;
        this.f67982G = str4;
        this.f67983H = str5;
        this.f67984I = str6;
        this.f67985J = str7;
        this.f67986K = str8;
        this.f67979D = str9;
        this.f67987L = str10;
        this.f67988M = str11;
        this.f67978C = str12;
        this.f67989N = z;
        this.f67990O = str13;
        this.f67991P = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 2, this.f67977B, false);
        AnonymousClass1zC.I(parcel, 3, this.f67980E, false);
        AnonymousClass1zC.I(parcel, 4, this.f67981F, false);
        AnonymousClass1zC.I(parcel, 5, this.f67982G, false);
        AnonymousClass1zC.I(parcel, 6, this.f67983H, false);
        AnonymousClass1zC.I(parcel, 7, this.f67984I, false);
        AnonymousClass1zC.I(parcel, 8, this.f67985J, false);
        AnonymousClass1zC.I(parcel, 9, this.f67986K, false);
        AnonymousClass1zC.I(parcel, 10, this.f67979D, false);
        AnonymousClass1zC.I(parcel, 11, this.f67987L, false);
        AnonymousClass1zC.I(parcel, 12, this.f67988M, false);
        AnonymousClass1zC.I(parcel, 13, this.f67978C, false);
        AnonymousClass1zC.K(parcel, 14, this.f67989N);
        AnonymousClass1zC.I(parcel, 15, this.f67990O, false);
        AnonymousClass1zC.I(parcel, 16, this.f67991P, false);
        AnonymousClass1zC.B(parcel, U);
    }
}
