package com.google.android.gms.internal;

import X.AnonymousClass1Ew;
import X.AnonymousClass1zC;
import X.AnonymousClass1zL;
import X.AnonymousClass1zM;
import X.AnonymousClass20r;
import X.AnonymousClass20s;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Map;

public final class zzbgj extends zza {
    public static final AnonymousClass20s CREATOR = new AnonymousClass20s();
    /* renamed from: B */
    public final int f25236B;
    /* renamed from: C */
    public final boolean f25237C;
    /* renamed from: D */
    public final int f25238D;
    /* renamed from: E */
    public final boolean f25239E;
    /* renamed from: F */
    public final String f25240F;
    /* renamed from: G */
    public final int f25241G;
    /* renamed from: H */
    public final Class f25242H;
    /* renamed from: I */
    public String f25243I;
    /* renamed from: J */
    public zzbgo f25244J;
    /* renamed from: K */
    public AnonymousClass20r f25245K;
    /* renamed from: L */
    private final int f25246L;

    public zzbgj(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zzbgc zzbgc) {
        this.f25246L = i;
        this.f25236B = i2;
        this.f25237C = z;
        this.f25238D = i3;
        this.f25239E = z2;
        this.f25240F = str;
        this.f25241G = i4;
        if (str2 == null) {
            this.f25242H = null;
            this.f25243I = null;
        } else {
            this.f25242H = zzbgt.class;
            this.f25243I = str2;
        }
        if (zzbgc == null) {
            this.f25245K = null;
            return;
        }
        AnonymousClass20r anonymousClass20r = zzbgc.f25231B;
        if (anonymousClass20r != null) {
            this.f25245K = anonymousClass20r;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    /* renamed from: A */
    public final boolean m14170A() {
        return this.f25245K != null;
    }

    /* renamed from: B */
    public final Map m14171B() {
        AnonymousClass1Ew.I(this.f25243I);
        AnonymousClass1Ew.I(this.f25244J);
        zzbgo zzbgo = this.f25244J;
        return (Map) zzbgo.f25247B.get(this.f25243I);
    }

    public final String toString() {
        AnonymousClass1zM A = AnonymousClass1zL.m14086C(this).m14087A("versionCode", Integer.valueOf(this.f25246L)).m14087A("typeIn", Integer.valueOf(this.f25236B)).m14087A("typeInArray", Boolean.valueOf(this.f25237C)).m14087A("typeOut", Integer.valueOf(this.f25238D)).m14087A("typeOutArray", Boolean.valueOf(this.f25239E)).m14087A("outputFieldName", this.f25240F).m14087A("safeParcelFieldId", Integer.valueOf(this.f25241G));
        String str = "concreteTypeName";
        Object obj = this.f25243I;
        if (obj == null) {
            obj = null;
        }
        A = A.m14087A(str, obj);
        Class cls = this.f25242H;
        if (cls != null) {
            A.m14087A("concreteType.class", cls.getCanonicalName());
        }
        AnonymousClass20r anonymousClass20r = this.f25245K;
        if (anonymousClass20r != null) {
            A.m14087A("converterName", anonymousClass20r.getClass().getCanonicalName());
        }
        return A.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Parcelable parcelable;
        int U = AnonymousClass1zC.m14073U(parcel);
        AnonymousClass1zC.m14071S(parcel, 1, this.f25246L);
        AnonymousClass1zC.m14071S(parcel, 2, this.f25236B);
        AnonymousClass1zC.m14063K(parcel, 3, this.f25237C);
        AnonymousClass1zC.m14071S(parcel, 4, this.f25238D);
        AnonymousClass1zC.m14063K(parcel, 5, this.f25239E);
        AnonymousClass1zC.m14061I(parcel, 6, this.f25240F, false);
        AnonymousClass1zC.m14071S(parcel, 7, this.f25241G);
        String str = this.f25243I;
        if (str == null) {
            str = null;
        }
        AnonymousClass1zC.m14061I(parcel, 8, str, false);
        AnonymousClass20r anonymousClass20r = this.f25245K;
        if (anonymousClass20r == null) {
            parcelable = null;
        } else if (anonymousClass20r instanceof zzbge) {
            parcelable = new zzbgc((zzbge) anonymousClass20r);
        } else {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
        AnonymousClass1zC.m14059G(parcel, 9, parcelable, i, false);
        AnonymousClass1zC.m14054B(parcel, U);
    }
}
