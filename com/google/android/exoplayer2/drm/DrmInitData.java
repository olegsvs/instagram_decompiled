package com.google.android.exoplayer2.drm;

import X.AnonymousClass2uA;
import X.AnonymousClass2vD;
import X.AnonymousClass2vE;
import X.AnonymousClass2yO;
import X.AnonymousClass2yi;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class DrmInitData implements Comparator, Parcelable {
    public static final Creator CREATOR = new AnonymousClass2vD();
    /* renamed from: B */
    public final int f35787B;
    /* renamed from: C */
    public final SchemeData[] f35788C;
    /* renamed from: D */
    public final String f35789D;
    /* renamed from: E */
    private int f35790E;

    public final class SchemeData implements Parcelable {
        public static final Creator CREATOR = new AnonymousClass2vE();
        /* renamed from: B */
        public final byte[] f35782B;
        /* renamed from: C */
        public final String f35783C;
        /* renamed from: D */
        public final boolean f35784D;
        /* renamed from: E */
        public final UUID f35785E;
        /* renamed from: F */
        private int f35786F;

        public final int describeContents() {
            return 0;
        }

        public SchemeData(Parcel parcel) {
            this.f35785E = new UUID(parcel.readLong(), parcel.readLong());
            this.f35783C = parcel.readString();
            this.f35782B = parcel.createByteArray();
            this.f35784D = parcel.readByte() != (byte) 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f35785E = (UUID) AnonymousClass2yO.m18016E(uuid);
            this.f35783C = (String) AnonymousClass2yO.m18016E(str);
            this.f35782B = bArr;
            this.f35784D = z;
        }

        /* renamed from: A */
        public final boolean m17769A() {
            return this.f35782B != null;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            boolean z = true;
            if (obj != this) {
                SchemeData schemeData = (SchemeData) obj;
                if (!this.f35783C.equals(schemeData.f35783C) || !AnonymousClass2yi.m18082C(this.f35785E, schemeData.f35785E) || !Arrays.equals(this.f35782B, schemeData.f35782B)) {
                    z = false;
                }
            }
            return z;
        }

        public final int hashCode() {
            if (this.f35786F == 0) {
                this.f35786F = (((this.f35785E.hashCode() * 31) + this.f35783C.hashCode()) * 31) + Arrays.hashCode(this.f35782B);
            }
            return this.f35786F;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f35785E.getMostSignificantBits());
            parcel.writeLong(this.f35785E.getLeastSignificantBits());
            parcel.writeString(this.f35783C);
            parcel.writeByteArray(this.f35782B);
            parcel.writeByte((byte) this.f35784D);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public DrmInitData(Parcel parcel) {
        this.f35789D = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.f35788C = schemeDataArr;
        this.f35787B = schemeDataArr.length;
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    private DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.f35789D = str;
        if (z) {
            schemeDataArr = (SchemeData[]) schemeDataArr.clone();
        }
        Arrays.sort(schemeDataArr, this);
        this.f35788C = schemeDataArr;
        this.f35787B = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* renamed from: A */
    public final DrmInitData m17771A(String str) {
        if (AnonymousClass2yi.m18082C(this.f35789D, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f35788C);
    }

    /* renamed from: B */
    public static boolean m17770B(ArrayList arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((SchemeData) arrayList.get(i2)).f35785E.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public final int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = AnonymousClass2uA.f35532E;
        if (uuid.equals(schemeData.f35785E)) {
            return uuid.equals(schemeData2.f35785E) ? 0 : 1;
        } else {
            return schemeData.f35785E.compareTo(schemeData2.f35785E);
        }
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    DrmInitData drmInitData = (DrmInitData) obj;
                    if (!AnonymousClass2yi.m18082C(this.f35789D, drmInitData.f35789D) || !Arrays.equals(this.f35788C, drmInitData.f35788C)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        if (this.f35790E == 0) {
            String str = this.f35789D;
            this.f35790E = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f35788C);
        }
        return this.f35790E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35789D);
        parcel.writeTypedArray(this.f35788C, 0);
    }
}
