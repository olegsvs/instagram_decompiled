package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass210;
import X.AnonymousClass211;
import X.AnonymousClass212;
import X.AnonymousClass213;
import X.AnonymousClass214;
import X.AnonymousClass215;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzcqn extends zza {
    public static final Creator CREATOR = new AnonymousClass214();
    /* renamed from: J */
    private static byte[][] f25260J = new byte[0][];
    /* renamed from: B */
    private String f25261B;
    /* renamed from: C */
    private byte[] f25262C;
    /* renamed from: D */
    private byte[][] f25263D;
    /* renamed from: E */
    private byte[][] f25264E;
    /* renamed from: F */
    private byte[][] f25265F;
    /* renamed from: G */
    private byte[][] f25266G;
    /* renamed from: H */
    private int[] f25267H;
    /* renamed from: I */
    private byte[][] f25268I;

    static {
        String str = JsonProperty.USE_DEFAULT_NAME;
        byte[][] bArr = f25260J;
        zzcqn zzcqn = new zzcqn(str, null, bArr, bArr, bArr, bArr, null, null);
        AnonymousClass210 anonymousClass210 = new AnonymousClass210();
        AnonymousClass211 anonymousClass211 = new AnonymousClass211();
        AnonymousClass212 anonymousClass212 = new AnonymousClass212();
        AnonymousClass213 anonymousClass213 = new AnonymousClass213();
    }

    public zzcqn(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f25261B = str;
        this.f25262C = bArr;
        this.f25263D = bArr2;
        this.f25264E = bArr3;
        this.f25265F = bArr4;
        this.f25266G = bArr5;
        this.f25267H = iArr;
        this.f25268I = bArr6;
    }

    /* renamed from: B */
    private static void m14173B(StringBuilder stringBuilder, String str, byte[][] bArr) {
        String str2;
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            stringBuilder.append("(");
            int length = bArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                byte[] bArr2 = bArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append("'");
                stringBuilder.append(Base64.encodeToString(bArr2, 3));
                stringBuilder.append("'");
                i++;
                obj = null;
            }
            str2 = ")";
        }
        stringBuilder.append(str2);
    }

    /* renamed from: C */
    private static List m14174C(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: D */
    private static List m14175D(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcqn) {
            zzcqn zzcqn = (zzcqn) obj;
            if (AnonymousClass215.m14176B(this.f25261B, zzcqn.f25261B) && Arrays.equals(this.f25262C, zzcqn.f25262C) && AnonymousClass215.m14176B(m14174C(this.f25263D), m14174C(zzcqn.f25263D)) && AnonymousClass215.m14176B(m14174C(this.f25264E), m14174C(zzcqn.f25264E)) && AnonymousClass215.m14176B(m14174C(this.f25265F), m14174C(zzcqn.f25265F)) && AnonymousClass215.m14176B(m14174C(this.f25266G), m14174C(zzcqn.f25266G)) && AnonymousClass215.m14176B(m14175D(this.f25267H), m14175D(zzcqn.f25267H)) && AnonymousClass215.m14176B(m14174C(this.f25268I), m14174C(zzcqn.f25268I))) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f25261B == null) {
            str = "null";
        } else {
            str = "'";
            String valueOf = String.valueOf(str);
            String str2 = this.f25261B;
            String valueOf2 = String.valueOf(str);
            StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf).length() + String.valueOf(str2).length()) + String.valueOf(valueOf2).length());
            stringBuilder2.append(valueOf);
            stringBuilder2.append(str2);
            stringBuilder2.append(valueOf2);
            str = stringBuilder2.toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        byte[] bArr = this.f25262C;
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            str = "null";
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            str = "'";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        m14173B(stringBuilder, "GAIA", this.f25263D);
        stringBuilder.append(", ");
        m14173B(stringBuilder, "PSEUDO", this.f25264E);
        stringBuilder.append(", ");
        m14173B(stringBuilder, "ALWAYS", this.f25265F);
        stringBuilder.append(", ");
        m14173B(stringBuilder, "OTHER", this.f25266G);
        stringBuilder.append(", ");
        int[] iArr = this.f25267H;
        stringBuilder.append("weak");
        stringBuilder.append("=");
        if (iArr == null) {
            str = "null";
        } else {
            stringBuilder.append("(");
            int length = iArr.length;
            int i = 0;
            Object obj = 1;
            while (i < length) {
                int i2 = iArr[i];
                if (obj == null) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(i2);
                i++;
                obj = null;
            }
            str = ")";
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        m14173B(stringBuilder, "directs", this.f25268I);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14061I(parcel, 2, this.f25261B, false);
        AnonymousClass1zC.m14064L(parcel, 3, this.f25262C, false);
        AnonymousClass1zC.m14068P(parcel, 4, this.f25263D, false);
        AnonymousClass1zC.m14068P(parcel, 5, this.f25264E, false);
        AnonymousClass1zC.m14068P(parcel, 6, this.f25265F, false);
        AnonymousClass1zC.m14068P(parcel, 7, this.f25266G, false);
        AnonymousClass1zC.m14065M(parcel, 8, this.f25267H, false);
        AnonymousClass1zC.m14068P(parcel, 9, this.f25268I, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
