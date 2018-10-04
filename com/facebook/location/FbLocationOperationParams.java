package com.facebook.location;

import X.AnonymousClass1Fn;
import X.AnonymousClass1h7;
import X.AnonymousClass47P;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class FbLocationOperationParams implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1h7();
    /* renamed from: B */
    public final Float f16117B;
    /* renamed from: C */
    public final Long f16118C;
    /* renamed from: D */
    public final float f16119D;
    /* renamed from: E */
    public final long f16120E;
    /* renamed from: F */
    public final AnonymousClass47P f16121F;
    /* renamed from: G */
    public final float f16122G;
    /* renamed from: H */
    public final long f16123H;
    /* renamed from: I */
    public final long f16124I;
    /* renamed from: J */
    public final long f16125J;

    public final int describeContents() {
        return 0;
    }

    public FbLocationOperationParams(AnonymousClass1Fn anonymousClass1Fn) {
        this.f16121F = anonymousClass1Fn.f16112F;
        this.f16120E = anonymousClass1Fn.f16111E;
        this.f16119D = anonymousClass1Fn.f16110D;
        this.f16125J = anonymousClass1Fn.f16116J;
        this.f16118C = anonymousClass1Fn.f16109C;
        this.f16117B = anonymousClass1Fn.f16108B;
        this.f16124I = anonymousClass1Fn.f16115I;
        this.f16123H = anonymousClass1Fn.f16114H;
        this.f16122G = anonymousClass1Fn.f16113G;
    }

    public FbLocationOperationParams(Parcel parcel) {
        this.f16121F = AnonymousClass47P.valueOf(parcel.readString());
        this.f16120E = parcel.readLong();
        this.f16119D = parcel.readFloat();
        this.f16125J = parcel.readLong();
        if (parcel.readInt() == 0) {
            this.f16118C = null;
        } else {
            this.f16118C = Long.valueOf(parcel.readLong());
        }
        if (parcel.readInt() == 0) {
            this.f16117B = null;
        } else {
            this.f16117B = Float.valueOf(parcel.readFloat());
        }
        this.f16124I = parcel.readLong();
        this.f16123H = parcel.readLong();
        this.f16122G = parcel.readFloat();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16121F.name());
        parcel.writeLong(this.f16120E);
        parcel.writeFloat(this.f16119D);
        parcel.writeLong(this.f16125J);
        int i2 = 1;
        parcel.writeInt(this.f16118C != null ? 1 : 0);
        Long l = this.f16118C;
        if (l != null) {
            parcel.writeLong(l.longValue());
        }
        if (this.f16117B == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        Float f = this.f16117B;
        if (f != null) {
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeLong(this.f16124I);
        parcel.writeLong(this.f16123H);
        parcel.writeFloat(this.f16122G);
    }
}
