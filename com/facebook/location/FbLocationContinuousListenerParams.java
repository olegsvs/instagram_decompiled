package com.facebook.location;

import X.AnonymousClass1h9;
import X.AnonymousClass47O;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class FbLocationContinuousListenerParams implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass47O();
    /* renamed from: B */
    public final long f50477B;
    /* renamed from: C */
    public final Long f50478C;
    /* renamed from: D */
    public final long f50479D;
    /* renamed from: E */
    public final float f50480E;
    /* renamed from: F */
    public final long f50481F;
    /* renamed from: G */
    public final AnonymousClass1h9 f50482G;

    public final int describeContents() {
        return 0;
    }

    public FbLocationContinuousListenerParams(Parcel parcel) {
        this.f50482G = AnonymousClass1h9.values()[parcel.readInt()];
        this.f50477B = parcel.readLong();
        this.f50481F = parcel.readLong();
        this.f50480E = parcel.readFloat();
        this.f50479D = parcel.readLong();
        this.f50478C = m23287B(parcel);
    }

    /* renamed from: B */
    public static Long m23287B(Parcel parcel) {
        if (parcel.readByte() == (byte) 0) {
            return null;
        }
        return Long.valueOf(parcel.readLong());
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    FbLocationContinuousListenerParams fbLocationContinuousListenerParams = (FbLocationContinuousListenerParams) obj;
                    if (this.f50477B == fbLocationContinuousListenerParams.f50477B) {
                        if (this.f50481F == fbLocationContinuousListenerParams.f50481F) {
                            if (Float.compare(fbLocationContinuousListenerParams.f50480E, this.f50480E) == 0) {
                                if (this.f50479D == fbLocationContinuousListenerParams.f50479D) {
                                    if (this.f50482G == fbLocationContinuousListenerParams.f50482G) {
                                        Long l = this.f50478C;
                                        if (l != null) {
                                            z = l.equals(fbLocationContinuousListenerParams.f50478C);
                                        } else if (fbLocationContinuousListenerParams.f50478C != null) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        AnonymousClass1h9 anonymousClass1h9 = this.f50482G;
        int i = 0;
        int hashCode = (anonymousClass1h9 != null ? anonymousClass1h9.hashCode() : 0) * 31;
        long j = this.f50477B;
        hashCode = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.f50481F;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        float f = this.f50480E;
        hashCode = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        j = this.f50479D;
        int i3 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.f50478C;
        if (l != null) {
            i = l.hashCode();
        }
        return i3 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f50482G.ordinal());
        parcel.writeLong(this.f50477B);
        parcel.writeLong(this.f50481F);
        parcel.writeFloat(this.f50480E);
        parcel.writeLong(this.f50479D);
        Long l = this.f50478C;
        if (l == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeLong(l.longValue());
    }
}
