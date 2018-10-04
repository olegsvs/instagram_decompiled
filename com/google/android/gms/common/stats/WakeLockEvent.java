package com.google.android.gms.common.stats;

import X.AnonymousClass1zC;
import X.AnonymousClass1zd;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public final class WakeLockEvent extends StatsEvent {
    public static final Creator CREATOR = new AnonymousClass1zd();
    /* renamed from: B */
    private final long f30598B;
    /* renamed from: C */
    private final long f30599C;
    /* renamed from: D */
    private int f30600D;
    /* renamed from: E */
    private final String f30601E;
    /* renamed from: F */
    private final String f30602F;
    /* renamed from: G */
    private final String f30603G;
    /* renamed from: H */
    private final int f30604H;
    /* renamed from: I */
    private final List f30605I;
    /* renamed from: J */
    private final String f30606J;
    /* renamed from: K */
    private final long f30607K;
    /* renamed from: L */
    private int f30608L;
    /* renamed from: M */
    private final String f30609M;
    /* renamed from: N */
    private final float f30610N;
    /* renamed from: O */
    private long f30611O = -1;
    /* renamed from: P */
    private int f30612P;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.f30612P = i;
        this.f30599C = j;
        this.f30600D = i2;
        this.f30601E = str;
        this.f30602F = str3;
        this.f30603G = str5;
        this.f30604H = i3;
        this.f30605I = list;
        this.f30606J = str2;
        this.f30607K = j2;
        this.f30608L = i4;
        this.f30609M = str4;
        this.f30610N = f;
        this.f30598B = j3;
    }

    /* renamed from: A */
    public final int mo3056A() {
        return this.f30600D;
    }

    /* renamed from: B */
    public final long mo3057B() {
        return this.f30599C;
    }

    /* renamed from: C */
    public final long mo3058C() {
        return this.f30611O;
    }

    /* renamed from: D */
    public final String mo3059D() {
        String valueOf = String.valueOf("\t");
        String valueOf2 = String.valueOf(this.f30601E);
        String str = "\t";
        String valueOf3 = String.valueOf(str);
        int i = this.f30604H;
        String valueOf4 = String.valueOf(str);
        Iterable iterable = this.f30605I;
        String join = iterable == null ? JsonProperty.USE_DEFAULT_NAME : TextUtils.join(",", iterable);
        str = "\t";
        String valueOf5 = String.valueOf(str);
        int i2 = r1.f30608L;
        String valueOf6 = String.valueOf(str);
        String str2 = r1.f30602F;
        if (str2 == null) {
            str2 = JsonProperty.USE_DEFAULT_NAME;
        }
        String valueOf7 = String.valueOf(str);
        String str3 = r1.f30609M;
        if (str3 == null) {
            str3 = JsonProperty.USE_DEFAULT_NAME;
        }
        String valueOf8 = String.valueOf(str);
        float f = r1.f30610N;
        String valueOf9 = String.valueOf("\t");
        String str4 = r1.f30603G;
        if (str4 == null) {
            str4 = JsonProperty.USE_DEFAULT_NAME;
        }
        StringBuilder stringBuilder = new StringBuilder(((((((((((((String.valueOf(valueOf).length() + 37) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(join).length()) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length()) + String.valueOf(str2).length()) + String.valueOf(valueOf7).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf8).length()) + String.valueOf(valueOf9).length()) + String.valueOf(str4).length());
        stringBuilder.append(valueOf);
        stringBuilder.append(valueOf2);
        stringBuilder.append(valueOf3);
        stringBuilder.append(i);
        stringBuilder.append(valueOf4);
        stringBuilder.append(join);
        stringBuilder.append(valueOf5);
        stringBuilder.append(i2);
        stringBuilder.append(valueOf6);
        stringBuilder.append(str2);
        stringBuilder.append(valueOf7);
        stringBuilder.append(str3);
        stringBuilder.append(valueOf8);
        stringBuilder.append(f);
        stringBuilder.append(valueOf9);
        stringBuilder.append(str4);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f30612P);
        AnonymousClass1zC.m14055C(parcel, 2, this.f30599C);
        AnonymousClass1zC.m14061I(parcel, 4, this.f30601E, false);
        AnonymousClass1zC.m14071S(parcel, 5, this.f30604H);
        AnonymousClass1zC.m14070R(parcel, 6, this.f30605I, false);
        AnonymousClass1zC.m14055C(parcel, 8, this.f30607K);
        AnonymousClass1zC.m14061I(parcel, 10, this.f30602F, false);
        AnonymousClass1zC.m14071S(parcel, 11, this.f30600D);
        AnonymousClass1zC.m14061I(parcel, 12, this.f30606J, false);
        AnonymousClass1zC.m14061I(parcel, 13, this.f30609M, false);
        AnonymousClass1zC.m14071S(parcel, 14, this.f30608L);
        float f = this.f30610N;
        AnonymousClass1zC.m14069Q(parcel, 15, 4);
        parcel.writeFloat(f);
        AnonymousClass1zC.m14055C(parcel, 16, this.f30598B);
        AnonymousClass1zC.m14061I(parcel, 17, this.f30603G, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
