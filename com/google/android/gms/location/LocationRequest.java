package com.google.android.gms.location;

import X.AnonymousClass1zC;
import X.AnonymousClass5g4;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;

public final class LocationRequest extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new AnonymousClass5g4();
    /* renamed from: B */
    public int f68037B;
    /* renamed from: C */
    public boolean f68038C;
    /* renamed from: D */
    public long f68039D;
    /* renamed from: E */
    public long f68040E;
    /* renamed from: F */
    public long f68041F;
    /* renamed from: G */
    private long f68042G;
    /* renamed from: H */
    private int f68043H;
    /* renamed from: I */
    private float f68044I;

    public LocationRequest() {
        this.f68037B = ParserMinimalBase.INT_f;
        this.f68039D = 3600000;
        this.f68040E = 600000;
        this.f68038C = false;
        this.f68042G = Long.MAX_VALUE;
        this.f68043H = Integer.MAX_VALUE;
        this.f68044I = 0.0f;
        this.f68041F = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f68037B = i;
        this.f68039D = j;
        this.f68040E = j2;
        this.f68038C = z;
        this.f68042G = j3;
        this.f68043H = i2;
        this.f68044I = f;
        this.f68041F = j4;
    }

    /* renamed from: B */
    public static void m28249B(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("invalid interval: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationRequest) {
                LocationRequest locationRequest = (LocationRequest) obj;
                if (this.f68037B == locationRequest.f68037B && this.f68039D == locationRequest.f68039D && this.f68040E == locationRequest.f68040E && this.f68038C == locationRequest.f68038C && this.f68042G == locationRequest.f68042G && this.f68043H == locationRequest.f68043H && this.f68044I == locationRequest.f68044I) {
                    long j = this.f68041F;
                    long j2 = this.f68039D;
                    if (j < j2) {
                        j = j2;
                    }
                    long j3 = locationRequest.f68041F;
                    j2 = locationRequest.f68039D;
                    if (j3 < j2) {
                        j3 = j2;
                    }
                    if (j == j3) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68037B), Long.valueOf(this.f68039D), Float.valueOf(this.f68044I), Long.valueOf(this.f68041F)});
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[");
        switch (this.f68037B) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case ParserMinimalBase.INT_f /*102*/:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        stringBuilder.append(str);
        if (this.f68037B != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f68039D);
            stringBuilder.append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.f68040E);
        stringBuilder.append("ms");
        if (this.f68041F > this.f68039D) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.f68041F);
            stringBuilder.append("ms");
        }
        if (this.f68044I > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.f68044I);
            stringBuilder.append("m");
        }
        long j = this.f68042G;
        if (j != Long.MAX_VALUE) {
            j -= SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j);
            stringBuilder.append("ms");
        }
        if (this.f68043H != Integer.MAX_VALUE) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.f68043H);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.S(parcel, 1, this.f68037B);
        AnonymousClass1zC.C(parcel, 2, this.f68039D);
        AnonymousClass1zC.C(parcel, 3, this.f68040E);
        AnonymousClass1zC.K(parcel, 4, this.f68038C);
        AnonymousClass1zC.C(parcel, 5, this.f68042G);
        AnonymousClass1zC.S(parcel, 6, this.f68043H);
        float f = this.f68044I;
        AnonymousClass1zC.Q(parcel, 7, 4);
        parcel.writeFloat(f);
        AnonymousClass1zC.C(parcel, 8, this.f68041F);
        AnonymousClass1zC.B(parcel, U);
    }
}
