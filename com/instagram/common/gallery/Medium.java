package com.instagram.common.gallery;

import X.AnonymousClass257;
import X.AnonymousClass258;
import X.AnonymousClass25C;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.common.util.gradient.BackgroundGradientColors;

public class Medium implements AnonymousClass257, Parcelable {
    public static final Creator CREATOR = new AnonymousClass258();
    /* renamed from: B */
    public String f30912B;
    /* renamed from: C */
    public String f30913C;
    /* renamed from: D */
    public BackgroundGradientColors f30914D;
    /* renamed from: E */
    public int f30915E;
    /* renamed from: F */
    public String f30916F;
    /* renamed from: G */
    public long f30917G;
    /* renamed from: H */
    public long f30918H;
    /* renamed from: I */
    public int f30919I;
    /* renamed from: J */
    public boolean f30920J;
    /* renamed from: K */
    public String f30921K;
    /* renamed from: L */
    public int f30922L;
    /* renamed from: M */
    public int f30923M;
    /* renamed from: N */
    public String f30924N;
    /* renamed from: O */
    public int f30925O;
    /* renamed from: P */
    public String f30926P;
    /* renamed from: Q */
    public int f30927Q;
    /* renamed from: R */
    public String f30928R;

    public final int describeContents() {
        return 0;
    }

    public final boolean eW() {
        return false;
    }

    public Medium(int i, int i2, String str, int i3, String str2, int i4, int i5, long j, long j2, Uri uri) {
        this.f30922L = i;
        this.f30927Q = i2;
        this.f30924N = str;
        this.f30915E = i3;
        this.f30916F = str2;
        this.f30925O = i4;
        this.f30919I = i5;
        this.f30917G = j;
        this.f30918H = j2;
        this.f30928R = uri.toString();
        this.f30921K = AnonymousClass25C.m14360B(i5);
    }

    public Medium(Parcel parcel) {
        this.f30922L = parcel.readInt();
        this.f30927Q = parcel.readInt();
        this.f30924N = parcel.readString();
        this.f30915E = parcel.readInt();
        this.f30916F = parcel.readString();
        this.f30919I = parcel.readInt();
        this.f30921K = parcel.readString();
        this.f30928R = parcel.readString();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f30920J = z;
        this.f30926P = parcel.readString();
        this.f30925O = parcel.readInt();
        this.f30918H = parcel.readLong();
        this.f30917G = parcel.readLong();
        this.f30923M = parcel.readInt();
        this.f30912B = parcel.readString();
        this.f30914D = (BackgroundGradientColors) parcel.readParcelable(BackgroundGradientColors.class.getClassLoader());
    }

    /* renamed from: A */
    public final Uri m16056A() {
        return Uri.parse(this.f30928R);
    }

    /* renamed from: B */
    public final boolean m16057B() {
        return this.f30927Q == 1;
    }

    public final String RM() {
        return this.f30921K;
    }

    public final String SN() {
        return String.valueOf(this.f30922L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass().equals(obj.getClass())) {
                return this.f30924N.equals(((Medium) obj).f30924N);
            }
        }
        return false;
    }

    public final int getDuration() {
        return this.f30919I;
    }

    public final int hashCode() {
        return this.f30924N.hashCode();
    }

    public final boolean isValid() {
        if (!this.f30920J && (m16057B() || wY())) {
            String str = this.f30924N;
            if (!(str == null || str.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final boolean wY() {
        return this.f30927Q == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f30922L);
        parcel.writeInt(this.f30927Q);
        parcel.writeString(this.f30924N);
        parcel.writeInt(this.f30915E);
        parcel.writeString(this.f30916F);
        parcel.writeInt(this.f30919I);
        parcel.writeString(this.f30921K);
        parcel.writeString(this.f30928R);
        parcel.writeInt(this.f30920J);
        parcel.writeString(this.f30926P);
        parcel.writeInt(this.f30925O);
        parcel.writeLong(this.f30918H);
        parcel.writeLong(this.f30917G);
        parcel.writeInt(this.f30923M);
        parcel.writeString(this.f30912B);
        parcel.writeParcelable(this.f30914D, i);
    }

    public final int zQ() {
        return this.f30925O;
    }
}
