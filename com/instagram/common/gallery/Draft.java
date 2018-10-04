package com.instagram.common.gallery;

import X.AnonymousClass24k;
import X.AnonymousClass257;
import X.AnonymousClass25C;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class Draft implements AnonymousClass257, Parcelable {
    public static final Creator CREATOR = new AnonymousClass24k();
    /* renamed from: B */
    public final String f30890B;
    /* renamed from: C */
    public final boolean f30891C;
    /* renamed from: D */
    private final int f30892D;
    /* renamed from: E */
    private final String f30893E;
    /* renamed from: F */
    private final String f30894F;
    /* renamed from: G */
    private final boolean f30895G;
    /* renamed from: H */
    private final boolean f30896H;

    public final int describeContents() {
        return 0;
    }

    public final int zQ() {
        return 0;
    }

    public Draft(Parcel parcel) {
        this.f30890B = parcel.readString();
        this.f30894F = parcel.readString();
        boolean z = false;
        this.f30896H = parcel.readInt() == 1;
        this.f30895G = parcel.readInt() == 1;
        this.f30893E = parcel.readString();
        this.f30892D = parcel.readInt();
        if (parcel.readInt() == 1) {
            z = true;
        }
        this.f30891C = z;
    }

    public Draft(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        this.f30894F = str;
        this.f30890B = str2;
        this.f30896H = z;
        this.f30895G = z2;
        this.f30893E = AnonymousClass25C.m14360B(i);
        this.f30892D = i;
        this.f30891C = z3;
    }

    public final String RM() {
        return this.f30893E;
    }

    public final String SN() {
        return this.f30894F;
    }

    public final boolean eW() {
        return this.f30895G;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass().equals(obj.getClass())) {
                return this.f30894F.equals(((Draft) obj).SN());
            }
        }
        return false;
    }

    public final int getDuration() {
        return this.f30892D;
    }

    public final int hashCode() {
        return this.f30894F.hashCode();
    }

    public final boolean isValid() {
        return (this.f30890B == null || this.f30890B.isEmpty()) ? false : true;
    }

    public final boolean wY() {
        return this.f30896H;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f30890B);
        parcel.writeString(this.f30894F);
        parcel.writeInt(this.f30896H);
        parcel.writeInt(this.f30895G);
        parcel.writeString(this.f30893E);
        parcel.writeInt(this.f30892D);
        parcel.writeInt(this.f30891C);
    }
}
