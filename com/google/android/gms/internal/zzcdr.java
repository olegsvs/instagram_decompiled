package com.google.android.gms.internal;

import X.AnonymousClass1zC;
import X.AnonymousClass5fo;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Locale;

public final class zzcdr extends zza {
    public static final Creator CREATOR = new AnonymousClass5fo();
    /* renamed from: B */
    public final String f72910B;
    /* renamed from: C */
    private final int f72911C;
    /* renamed from: D */
    private final short f72912D;
    /* renamed from: E */
    private final double f72913E;
    /* renamed from: F */
    private final double f72914F;
    /* renamed from: G */
    private final float f72915G;
    /* renamed from: H */
    private final int f72916H;
    /* renamed from: I */
    private final int f72917I;
    /* renamed from: J */
    private final long f72918J;

    public zzcdr(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str != null) {
            if (str.length() <= 100) {
                StringBuilder stringBuilder;
                if (f <= 0.0f) {
                    stringBuilder = new StringBuilder(31);
                    stringBuilder.append("invalid radius: ");
                    stringBuilder.append(f);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (d > 90.0d || d < -90.0d) {
                    stringBuilder = new StringBuilder(42);
                    stringBuilder.append("invalid latitude: ");
                    stringBuilder.append(d);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else if (d2 > 180.0d || d2 < -180.0d) {
                    stringBuilder = new StringBuilder(43);
                    stringBuilder.append("invalid longitude: ");
                    stringBuilder.append(d2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                } else {
                    int i4 = i & 7;
                    if (i4 != 0) {
                        this.f72912D = s;
                        this.f72910B = str;
                        this.f72913E = d;
                        this.f72914F = d2;
                        this.f72915G = f;
                        this.f72918J = j;
                        this.f72911C = i4;
                        this.f72916H = i2;
                        this.f72917I = i3;
                        return;
                    }
                    stringBuilder = new StringBuilder(46);
                    stringBuilder.append("No supported transition specified: ");
                    stringBuilder.append(i);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        String str2 = "requestId is null or too long: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null) {
                if (obj instanceof zzcdr) {
                    zzcdr zzcdr = (zzcdr) obj;
                    if (this.f72915G == zzcdr.f72915G) {
                        if (this.f72913E == zzcdr.f72913E) {
                            if (this.f72914F == zzcdr.f72914F) {
                                if (this.f72912D != zzcdr.f72912D) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f72913E);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f72914F);
        return (((((((i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2))) * 31) + Float.floatToIntBits(this.f72915G)) * 31) + this.f72912D) * 31) + this.f72911C;
    }

    public final String toString() {
        Locale locale = Locale.US;
        String str = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        objArr[0] = this.f72912D != (short) 1 ? null : "CIRCLE";
        objArr[1] = this.f72910B;
        objArr[2] = Integer.valueOf(this.f72911C);
        objArr[3] = Double.valueOf(this.f72913E);
        objArr[4] = Double.valueOf(this.f72914F);
        objArr[5] = Float.valueOf(this.f72915G);
        objArr[6] = Integer.valueOf(this.f72916H / JsonMappingException.MAX_REFS_TO_LIST);
        objArr[7] = Integer.valueOf(this.f72917I);
        objArr[8] = Long.valueOf(this.f72918J);
        return String.format(locale, str, objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int U = AnonymousClass1zC.U(parcel);
        AnonymousClass1zC.I(parcel, 1, this.f72910B, false);
        AnonymousClass1zC.C(parcel, 2, this.f72918J);
        short s = this.f72912D;
        AnonymousClass1zC.Q(parcel, 3, 4);
        parcel.writeInt(s);
        double d = this.f72913E;
        AnonymousClass1zC.Q(parcel, 4, 8);
        parcel.writeDouble(d);
        double d2 = this.f72914F;
        AnonymousClass1zC.Q(parcel, 5, 8);
        parcel.writeDouble(d2);
        float f = this.f72915G;
        AnonymousClass1zC.Q(parcel, 6, 4);
        parcel.writeFloat(f);
        AnonymousClass1zC.S(parcel, 7, this.f72911C);
        AnonymousClass1zC.S(parcel, 8, this.f72916H);
        AnonymousClass1zC.S(parcel, 9, this.f72917I);
        AnonymousClass1zC.B(parcel, U);
    }
}
