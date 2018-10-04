package com.instagram.pendingmedia.model;

import X.AnonymousClass0Ci;
import X.AnonymousClass0Ck;
import X.AnonymousClass0LQ;
import X.AnonymousClass1FO;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class PendingRecipient implements AnonymousClass0Ck, Parcelable {
    public static final Creator CREATOR = new AnonymousClass1FO();
    /* renamed from: B */
    public String f6060B;
    /* renamed from: C */
    public Boolean f6061C;
    /* renamed from: D */
    public String f6062D;
    /* renamed from: E */
    public String f6063E;
    /* renamed from: F */
    public String f6064F;

    public final int describeContents() {
        return 0;
    }

    public PendingRecipient(AnonymousClass0Ci anonymousClass0Ci) {
        this.f6063E = anonymousClass0Ci.getId();
        this.f6064F = anonymousClass0Ci.uT();
        this.f6062D = anonymousClass0Ci.DQ();
        this.f6060B = anonymousClass0Ci.f1757z;
        this.f6061C = Boolean.valueOf(anonymousClass0Ci.m1030u());
    }

    public PendingRecipient(Parcel parcel) {
        this.f6063E = parcel.readString();
        this.f6064F = parcel.readString();
        this.f6062D = parcel.readString();
        this.f6060B = parcel.readString();
        this.f6061C = (Boolean) parcel.readValue(Boolean.class.getClassLoader());
    }

    public PendingRecipient(String str, String str2, String str3) {
        this.f6063E = str;
        this.f6064F = str2;
        this.f6062D = str3;
    }

    /* renamed from: A */
    public final boolean m5177A() {
        Boolean bool = this.f6061C;
        return bool != null && bool.booleanValue();
    }

    /* renamed from: B */
    public static ArrayList m5175B(List list) {
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass0Ci pendingRecipient : list) {
            arrayList.add(new PendingRecipient(pendingRecipient));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static boolean m5176C(List list, String str) {
        if (list != null) {
            for (AnonymousClass0Ck id : list) {
                if (str.equals(id.getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String DQ() {
        return this.f6062D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                return AnonymousClass0LQ.m2954B(this.f6063E, ((PendingRecipient) obj).f6063E);
            }
        }
        return false;
    }

    public final String getId() {
        return this.f6063E;
    }

    public final int hashCode() {
        return this.f6063E.hashCode();
    }

    public final String uT() {
        return this.f6064F;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6063E);
        parcel.writeString(this.f6064F);
        parcel.writeString(this.f6062D);
        parcel.writeString(this.f6060B);
        parcel.writeValue(this.f6061C);
    }
}
