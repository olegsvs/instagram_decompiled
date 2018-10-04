package com.facebook.video.heroplayer.ipc;

import X.AnonymousClass1e8;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public final class ParcelableFormat implements Parcelable, Serializable {
    public static final Creator CREATOR = new AnonymousClass1e8();
    /* renamed from: B */
    public final int f20846B;
    /* renamed from: C */
    public final int f20847C;
    /* renamed from: D */
    public final int f20848D;
    /* renamed from: E */
    public final String f20849E;
    /* renamed from: F */
    public final boolean f20850F;
    /* renamed from: G */
    public final boolean f20851G;
    /* renamed from: H */
    public final boolean f20852H;
    /* renamed from: I */
    public final boolean f20853I;
    /* renamed from: J */
    public final boolean f20854J;
    /* renamed from: K */
    public final boolean f20855K;
    /* renamed from: L */
    public final String f20856L;
    /* renamed from: M */
    public final String f20857M;
    /* renamed from: N */
    public final String f20858N;
    /* renamed from: O */
    public final float f20859O;
    /* renamed from: P */
    public final int f20860P;
    /* renamed from: Q */
    public final String f20861Q;
    /* renamed from: R */
    public final String f20862R;
    /* renamed from: S */
    public final String f20863S;
    /* renamed from: T */
    public final int f20864T;

    public final int describeContents() {
        return 0;
    }

    public ParcelableFormat(Parcel parcel) {
        this(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1, parcel.readInt() == 1);
    }

    public ParcelableFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f20861Q = str;
        this.f20863S = str2;
        this.f20864T = i;
        this.f20860P = i2;
        this.f20859O = f;
        this.f20846B = i3;
        this.f20847C = i4;
        this.f20848D = i5;
        this.f20862R = str3;
        this.f20849E = str4;
        this.f20858N = str5;
        this.f20856L = str6;
        this.f20857M = str7;
        this.f20852H = z;
        this.f20853I = z2;
        this.f20854J = z3;
        this.f20851G = z4;
        this.f20850F = z5;
        this.f20855K = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return ((ParcelableFormat) obj).f20861Q.equals(this.f20861Q);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20861Q.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20861Q);
        parcel.writeString(this.f20863S);
        parcel.writeInt(this.f20864T);
        parcel.writeInt(this.f20860P);
        parcel.writeFloat(this.f20859O);
        parcel.writeInt(this.f20846B);
        parcel.writeInt(this.f20847C);
        parcel.writeInt(this.f20848D);
        parcel.writeString(this.f20862R);
        parcel.writeString(this.f20849E);
        parcel.writeString(this.f20858N);
        parcel.writeString(this.f20856L);
        parcel.writeString(this.f20857M);
        parcel.writeInt(this.f20852H);
        parcel.writeInt(this.f20853I);
        parcel.writeInt(this.f20854J);
        parcel.writeInt(this.f20851G);
        parcel.writeInt(this.f20850F);
        parcel.writeInt(this.f20855K);
    }
}
