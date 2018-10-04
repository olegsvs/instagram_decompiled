package com.google.android.exoplayer2;

import X.AnonymousClass2uK;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Format implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2uK();
    /* renamed from: B */
    public final int f35552B;
    /* renamed from: C */
    public final int f35553C;
    /* renamed from: D */
    public final int f35554D;
    /* renamed from: E */
    public final String f35555E;
    /* renamed from: F */
    public final ColorInfo f35556F;
    /* renamed from: G */
    public final String f35557G;
    /* renamed from: H */
    public final DrmInitData f35558H;
    /* renamed from: I */
    public final int f35559I;
    /* renamed from: J */
    public final int f35560J;
    /* renamed from: K */
    public final boolean f35561K;
    /* renamed from: L */
    public final boolean f35562L;
    /* renamed from: M */
    public final boolean f35563M;
    /* renamed from: N */
    public final boolean f35564N;
    /* renamed from: O */
    public final String f35565O;
    /* renamed from: P */
    public final float f35566P;
    /* renamed from: Q */
    public final int f35567Q;
    /* renamed from: R */
    public final String f35568R;
    /* renamed from: S */
    public final List f35569S;
    /* renamed from: T */
    public final String f35570T;
    /* renamed from: U */
    public final int f35571U;
    /* renamed from: V */
    public final Metadata f35572V;
    /* renamed from: W */
    public final int f35573W;
    /* renamed from: X */
    public final float f35574X;
    /* renamed from: Y */
    public final byte[] f35575Y;
    /* renamed from: Z */
    public final int f35576Z;
    /* renamed from: a */
    public final String f35577a;
    /* renamed from: b */
    public final int f35578b;
    /* renamed from: c */
    public final int f35579c;
    /* renamed from: d */
    public final int f35580d;
    /* renamed from: e */
    public final long f35581e;
    /* renamed from: f */
    public final int f35582f;
    /* renamed from: g */
    private int f35583g;

    public final int describeContents() {
        return 0;
    }

    public Format(Parcel parcel) {
        this.f35568R = parcel.readString();
        this.f35557G = parcel.readString();
        this.f35577a = parcel.readString();
        this.f35555E = parcel.readString();
        this.f35553C = parcel.readInt();
        this.f35571U = parcel.readInt();
        this.f35582f = parcel.readInt();
        this.f35567Q = parcel.readInt();
        this.f35566P = parcel.readFloat();
        this.f35576Z = parcel.readInt();
        this.f35574X = parcel.readFloat();
        this.f35575Y = AnonymousClass2yi.m18104Y(parcel) ? parcel.createByteArray() : null;
        this.f35580d = parcel.readInt();
        this.f35556F = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f35554D = parcel.readInt();
        this.f35578b = parcel.readInt();
        this.f35573W = parcel.readInt();
        this.f35559I = parcel.readInt();
        this.f35560J = parcel.readInt();
        this.f35579c = parcel.readInt();
        this.f35570T = parcel.readString();
        this.f35552B = parcel.readInt();
        this.f35581e = parcel.readLong();
        int readInt = parcel.readInt();
        this.f35569S = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f35569S.add(parcel.createByteArray());
        }
        this.f35558H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f35572V = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f35565O = parcel.readString();
        this.f35563M = AnonymousClass2yi.m18104Y(parcel);
        this.f35564N = AnonymousClass2yi.m18104Y(parcel);
        this.f35562L = AnonymousClass2yi.m18104Y(parcel);
        this.f35561K = AnonymousClass2yi.m18104Y(parcel);
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, DrmInitData drmInitData, Metadata metadata) {
        int i14 = i11;
        int i15 = i10;
        int i16 = i9;
        int i17 = i;
        int i18 = i2;
        int i19 = i3;
        int i20 = i4;
        float f3 = f;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        int i21 = i5;
        float f4 = f2;
        byte[] bArr2 = bArr;
        int i22 = i6;
        ColorInfo colorInfo2 = colorInfo;
        int i23 = i7;
        int i24 = i8;
        this(str6, str7, str8, str9, i17, i18, i19, i20, f3, i21, f4, bArr2, i22, colorInfo2, i23, i24, i16, i15, i14, i12, str5, i13, j, list, drmInitData, metadata, null, false, false, false, false);
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, DrmInitData drmInitData, Metadata metadata, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i10;
        List list2 = list;
        this.f35568R = str;
        this.f35557G = str2;
        this.f35577a = str3;
        this.f35555E = str4;
        this.f35553C = i;
        this.f35571U = i2;
        this.f35582f = i3;
        this.f35567Q = i4;
        this.f35566P = f;
        int i16 = 0;
        if (i14 == -1) {
            i14 = 0;
        }
        this.f35576Z = i14;
        if (f2 == -1.0f) {
            f3 = 1.0f;
        }
        this.f35574X = f3;
        this.f35575Y = bArr;
        this.f35580d = i6;
        this.f35556F = colorInfo;
        this.f35554D = i7;
        this.f35578b = i8;
        this.f35573W = i9;
        if (i15 == -1) {
            i15 = 0;
        }
        this.f35559I = i15;
        i14 = i11;
        if (i14 != -1) {
            i16 = i14;
        }
        this.f35560J = i16;
        this.f35579c = i12;
        this.f35570T = str5;
        this.f35552B = i13;
        this.f35581e = j;
        if (list == null) {
            list2 = Collections.emptyList();
        }
        this.f35569S = list2;
        this.f35558H = drmInitData;
        this.f35572V = metadata;
        this.f35565O = str6;
        this.f35563M = z;
        this.f35564N = z2;
        this.f35562L = z3;
        this.f35561K = z4;
    }

    /* renamed from: A */
    public final Format m17677A(DrmInitData drmInitData) {
        String str = this.f35568R;
        String str2 = this.f35557G;
        String str3 = this.f35577a;
        String str4 = this.f35555E;
        int i = this.f35553C;
        int i2 = this.f35571U;
        int i3 = this.f35582f;
        int i4 = this.f35567Q;
        float f = this.f35566P;
        int i5 = this.f35576Z;
        float f2 = this.f35574X;
        byte[] bArr = this.f35575Y;
        int i6 = this.f35580d;
        ColorInfo colorInfo = this.f35556F;
        int i7 = this.f35554D;
        int i8 = this.f35578b;
        int i9 = this.f35573W;
        int i10 = this.f35559I;
        int i11 = this.f35560J;
        int i12 = this.f35579c;
        String str5 = this.f35570T;
        int i13 = this.f35552B;
        long j = this.f35581e;
        List list = this.f35569S;
        int i14 = i7;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, i14, i8, i9, i10, i11, i12, str5, i13, j, list, drmInitData, this.f35572V, this.f35565O, this.f35563M, this.f35564N, this.f35562L, this.f35561K);
    }

    /* renamed from: B */
    public final Format m17678B(int i, int i2) {
        String str = this.f35568R;
        String str2 = this.f35557G;
        String str3 = this.f35577a;
        String str4 = this.f35555E;
        int i3 = this.f35553C;
        int i4 = this.f35571U;
        int i5 = this.f35582f;
        int i6 = this.f35567Q;
        float f = this.f35566P;
        int i7 = this.f35576Z;
        float f2 = this.f35574X;
        byte[] bArr = this.f35575Y;
        int i8 = this.f35580d;
        ColorInfo colorInfo = this.f35556F;
        int i9 = this.f35554D;
        int i10 = this.f35578b;
        int i11 = this.f35573W;
        return new Format(str, str2, str3, str4, i3, i4, i5, i6, f, i7, f2, bArr, i8, colorInfo, i9, i10, i11, i, i2, this.f35579c, this.f35570T, this.f35552B, this.f35581e, this.f35569S, this.f35558H, this.f35572V, this.f35565O, this.f35563M, this.f35564N, this.f35562L, this.f35561K);
    }

    /* renamed from: B */
    public static Format m17671B(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List list, DrmInitData drmInitData, int i6, String str4) {
        return new Format(str, null, str2, str3, i, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i6, str4, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    /* renamed from: C */
    public final Format m17679C(Format format) {
        Format format2 = format;
        if (this == format2) {
            return this;
        }
        String str;
        String str2 = format2.f35568R;
        String str3 = r8.f35555E;
        if (str3 == null) {
            str3 = format2.f35555E;
        }
        int i = r8.f35553C;
        if (i == -1) {
            i = format2.f35553C;
        }
        float f = r8.f35566P;
        if (f == -1.0f) {
            f = format2.f35566P;
        }
        int i2 = r8.f35579c | format2.f35579c;
        String str4 = r8.f35570T;
        if (str4 == null) {
            str4 = format2.f35570T;
        }
        String str5 = r8.f35565O;
        if (str5 == null) {
            str5 = format2.f35565O;
        }
        DrmInitData drmInitData = format2.f35558H;
        DrmInitData drmInitData2 = r8.f35558H;
        List arrayList = new ArrayList();
        DrmInitData drmInitData3 = null;
        if (drmInitData != null) {
            str = drmInitData.f35789D;
            for (SchemeData schemeData : drmInitData.f35788C) {
                if (schemeData.m17769A()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.f35789D;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.f35788C) {
                if (schemeData2.m17769A() && !DrmInitData.m17770B(arrayList, size, schemeData2.f35785E)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            drmInitData3 = new DrmInitData(str, arrayList);
        }
        return new Format(str2, r8.f35557G, r8.f35577a, str3, i, r8.f35571U, r8.f35582f, r8.f35567Q, f, r8.f35576Z, r8.f35574X, r8.f35575Y, r8.f35580d, r8.f35556F, r8.f35554D, r8.f35578b, r8.f35573W, r8.f35559I, r8.f35560J, i2, str4, r8.f35552B, r8.f35581e, r8.f35569S, drmInitData3, r8.f35572V, str5, r8.f35563M, r8.f35564N, r8.f35562L, r8.f35561K);
    }

    /* renamed from: C */
    public static Format m17672C(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, DrmInitData drmInitData, int i5, String str4) {
        return m17671B(str, str2, str3, i, i2, i3, i4, -1, list, drmInitData, i5, str4);
    }

    /* renamed from: D */
    public final Format m17680D(long j) {
        String str = this.f35568R;
        String str2 = this.f35557G;
        String str3 = this.f35577a;
        String str4 = this.f35555E;
        int i = this.f35553C;
        int i2 = this.f35571U;
        int i3 = this.f35582f;
        int i4 = this.f35567Q;
        float f = this.f35566P;
        int i5 = this.f35576Z;
        float f2 = this.f35574X;
        byte[] bArr = this.f35575Y;
        int i6 = this.f35580d;
        ColorInfo colorInfo = this.f35556F;
        int i7 = this.f35554D;
        int i8 = this.f35578b;
        int i9 = this.f35573W;
        int i10 = this.f35559I;
        int i11 = this.f35560J;
        int i12 = this.f35579c;
        String str5 = this.f35570T;
        int i13 = this.f35552B;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, i7, i8, i9, i10, i11, i12, str5, i13, j, this.f35569S, this.f35558H, this.f35572V, this.f35565O, this.f35563M, this.f35564N, this.f35562L, this.f35561K);
    }

    /* renamed from: D */
    public static Format m17673D(String str, String str2, String str3, int i, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, drmInitData, null);
    }

    /* renamed from: E */
    public final int m17681E() {
        int i = this.f35582f;
        if (i == -1) {
            return -1;
        }
        int i2 = this.f35567Q;
        return i2 == -1 ? -1 : i * i2;
    }

    /* renamed from: E */
    public static Format m17674E(String str, String str2, int i, String str3, DrmInitData drmInitData) {
        return m17675F(str, str2, null, -1, i, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    /* renamed from: F */
    public static Format m17675F(String str, String str2, String str3, int i, int i2, String str4, int i3, DrmInitData drmInitData, long j, List list) {
        return new Format(str, null, str2, str3, i, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, i3, j, list, drmInitData, null);
    }

    /* renamed from: F */
    public final boolean m17682F(Format format) {
        if (this.f35569S.size() == format.f35569S.size()) {
            int i = 0;
            while (i < this.f35569S.size()) {
                if (Arrays.equals((byte[]) this.f35569S.get(i), (byte[]) format.f35569S.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public static Format m17676G(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, DrmInitData drmInitData) {
        return new Format(str, null, str2, str3, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, drmInitData, null);
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    Format format = (Format) obj;
                    if (this.f35553C != format.f35553C || this.f35571U != format.f35571U || this.f35582f != format.f35582f || this.f35567Q != format.f35567Q || this.f35566P != format.f35566P || this.f35576Z != format.f35576Z || this.f35574X != format.f35574X || this.f35580d != format.f35580d || this.f35554D != format.f35554D || this.f35578b != format.f35578b || this.f35573W != format.f35573W || this.f35559I != format.f35559I || this.f35560J != format.f35560J || this.f35581e != format.f35581e || this.f35579c != format.f35579c || !AnonymousClass2yi.m18082C(this.f35568R, format.f35568R) || !AnonymousClass2yi.m18082C(this.f35570T, format.f35570T) || this.f35552B != format.f35552B || !AnonymousClass2yi.m18082C(this.f35557G, format.f35557G) || !AnonymousClass2yi.m18082C(this.f35577a, format.f35577a) || !AnonymousClass2yi.m18082C(this.f35555E, format.f35555E) || !AnonymousClass2yi.m18082C(this.f35558H, format.f35558H) || !AnonymousClass2yi.m18082C(this.f35572V, format.f35572V) || !AnonymousClass2yi.m18082C(this.f35556F, format.f35556F) || !Arrays.equals(this.f35575Y, format.f35575Y) || !m17682F(format)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f35583g == 0) {
            String str = this.f35568R;
            int i = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            str = this.f35557G;
            hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            str = this.f35577a;
            hashCode = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            str = this.f35555E;
            hashCode = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f35553C) * 31) + this.f35582f) * 31) + this.f35567Q) * 31) + this.f35554D) * 31) + this.f35578b) * 31;
            str = this.f35570T;
            hashCode = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f35552B) * 31;
            DrmInitData drmInitData = this.f35558H;
            hashCode = (hashCode + (drmInitData == null ? 0 : drmInitData.hashCode())) * 31;
            Metadata metadata = this.f35572V;
            if (metadata != null) {
                i = metadata.hashCode();
            }
            this.f35583g = hashCode + i;
        }
        return this.f35583g;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Format(");
        stringBuilder.append(this.f35568R);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35557G);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35577a);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35553C);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35570T);
        stringBuilder.append(", [");
        stringBuilder.append(this.f35582f);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35567Q);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35566P);
        stringBuilder.append("]");
        stringBuilder.append(", [");
        stringBuilder.append(this.f35554D);
        stringBuilder.append(", ");
        stringBuilder.append(this.f35578b);
        stringBuilder.append("])");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35568R);
        parcel.writeString(this.f35557G);
        parcel.writeString(this.f35577a);
        parcel.writeString(this.f35555E);
        parcel.writeInt(this.f35553C);
        parcel.writeInt(this.f35571U);
        parcel.writeInt(this.f35582f);
        parcel.writeInt(this.f35567Q);
        parcel.writeFloat(this.f35566P);
        parcel.writeInt(this.f35576Z);
        parcel.writeFloat(this.f35574X);
        parcel.writeInt(this.f35575Y != null ? 1 : 0);
        byte[] bArr = this.f35575Y;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f35580d);
        parcel.writeParcelable(this.f35556F, i);
        parcel.writeInt(this.f35554D);
        parcel.writeInt(this.f35578b);
        parcel.writeInt(this.f35573W);
        parcel.writeInt(this.f35559I);
        parcel.writeInt(this.f35560J);
        parcel.writeInt(this.f35579c);
        parcel.writeString(this.f35570T);
        parcel.writeInt(this.f35552B);
        parcel.writeLong(this.f35581e);
        int size = this.f35569S.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.f35569S.get(i2));
        }
        parcel.writeParcelable(this.f35558H, 0);
        parcel.writeParcelable(this.f35572V, 0);
        parcel.writeString(this.f35565O);
        parcel.writeInt(this.f35563M);
        parcel.writeInt(this.f35564N);
        parcel.writeInt(this.f35562L);
        parcel.writeInt(this.f35561K);
    }
}
