package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass0Dc;
import X.AnonymousClass1c5;
import X.AnonymousClass1eC;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class ServicePlayerState implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass1c5();
    /* renamed from: U */
    private static final String f16682U = "ServicePlayerState";
    /* renamed from: B */
    public long f16683B;
    /* renamed from: C */
    public long f16684C;
    /* renamed from: D */
    public final long f16685D;
    /* renamed from: E */
    public long f16686E;
    /* renamed from: F */
    public boolean f16687F;
    /* renamed from: G */
    public boolean f16688G;
    /* renamed from: H */
    public boolean f16689H;
    /* renamed from: I */
    public long f16690I;
    /* renamed from: J */
    public long f16691J;
    /* renamed from: K */
    public long f16692K;
    /* renamed from: L */
    public long f16693L;
    /* renamed from: M */
    public int f16694M;
    /* renamed from: N */
    public long f16695N;
    /* renamed from: O */
    public long f16696O;
    /* renamed from: P */
    public int f16697P;
    /* renamed from: Q */
    public long f16698Q;
    /* renamed from: R */
    public long f16699R;
    /* renamed from: S */
    public final String f16700S;
    /* renamed from: T */
    public long f16701T;

    public final int describeContents() {
        return 0;
    }

    public ServicePlayerState() {
        this.f16701T = 0;
        this.f16688G = false;
        this.f16689H = false;
        this.f16687F = false;
        this.f16685D = 0;
        this.f16683B = 0;
        this.f16696O = 0;
        this.f16684C = 0;
        this.f16690I = 0;
        this.f16691J = 0;
        this.f16697P = 0;
        this.f16693L = 0;
        this.f16692K = 0;
        this.f16700S = JsonProperty.USE_DEFAULT_NAME;
        this.f16698Q = -1;
        this.f16699R = -1;
        this.f16694M = 0;
        this.f16695N = 0;
        this.f16686E = 0;
    }

    public ServicePlayerState(long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4, long j5, long j6, long j7, int i, long j8, long j9, String str, long j10, long j11, int i2, long j12, long j13) {
        this.f16701T = j;
        this.f16688G = z;
        this.f16689H = z2;
        this.f16687F = z3;
        this.f16685D = j2;
        this.f16683B = j3;
        this.f16696O = j4;
        this.f16684C = j5;
        this.f16690I = j6;
        this.f16691J = j7;
        this.f16697P = i;
        this.f16693L = j8;
        this.f16692K = j9;
        this.f16700S = str;
        this.f16698Q = j10;
        this.f16699R = j11;
        this.f16694M = i2;
        this.f16695N = j12;
        this.f16686E = j13;
    }

    public ServicePlayerState(Parcel parcel) {
        this.f16701T = parcel.readLong();
        boolean z = false;
        this.f16688G = parcel.readInt() == 1;
        this.f16689H = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f16687F = z;
        this.f16685D = parcel.readLong();
        this.f16683B = parcel.readLong();
        this.f16696O = parcel.readLong();
        this.f16684C = parcel.readLong();
        this.f16690I = parcel.readLong();
        this.f16691J = parcel.readLong();
        this.f16697P = parcel.readInt();
        this.f16693L = parcel.readLong();
        this.f16692K = parcel.readLong();
        this.f16700S = parcel.readString();
        this.f16698Q = parcel.readLong();
        this.f16699R = parcel.readLong();
        this.f16694M = parcel.readInt();
        this.f16695N = parcel.readLong();
        this.f16686E = parcel.readLong();
    }

    /* renamed from: A */
    public final long m10610A() {
        return m10609B(AnonymousClass1eC.DASH_LIVE.toString().equals(this.f16700S) ? this.f16696O : this.f16683B);
    }

    /* renamed from: B */
    private long m10609B(long j) {
        if (!AnonymousClass1eC.DASH_LIVE.toString().equals(this.f16700S)) {
            if (j < 0) {
                AnonymousClass0Dc.m1255R(f16682U, "negative position=%d", Long.valueOf(j));
                return 0;
            }
            long j2 = this.f16685D;
            if (j2 > 0 && j > j2) {
                AnonymousClass0Dc.m1255R(f16682U, "position=%d bigger than duration=%d", Long.valueOf(j), Long.valueOf(this.f16685D));
                return this.f16685D;
            }
        }
        return j;
    }

    /* renamed from: C */
    public final long m10611C(long j) {
        if (this.f16688G) {
            if (!this.f16687F) {
                return j - this.f16701T;
            }
        }
        return 0;
    }

    /* renamed from: D */
    public final boolean m10612D(ServicePlayerState servicePlayerState, long j, long j2) {
        long j3 = this.f16701T - servicePlayerState.f16701T;
        if (this.f16688G != servicePlayerState.f16688G || this.f16689H != servicePlayerState.f16689H || this.f16687F != servicePlayerState.f16687F) {
            return true;
        }
        if (j3 >= j) {
            return true;
        }
        if (Math.abs((this.f16683B - servicePlayerState.f16683B) - j3) > j2) {
            return true;
        }
        if (Math.abs((this.f16696O - servicePlayerState.f16696O) - j3) > j2) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f16701T);
        parcel.writeInt(this.f16688G);
        parcel.writeInt(this.f16689H);
        parcel.writeInt(this.f16687F);
        parcel.writeLong(this.f16685D);
        parcel.writeLong(this.f16683B);
        parcel.writeLong(this.f16696O);
        parcel.writeLong(this.f16684C);
        parcel.writeLong(this.f16690I);
        parcel.writeLong(this.f16691J);
        parcel.writeInt(this.f16697P);
        parcel.writeLong(this.f16693L);
        parcel.writeLong(this.f16692K);
        parcel.writeString(this.f16700S);
        parcel.writeLong(this.f16698Q);
        parcel.writeLong(this.f16699R);
        parcel.writeInt(this.f16694M);
        parcel.writeLong(this.f16695N);
        parcel.writeLong(this.f16686E);
    }
}
