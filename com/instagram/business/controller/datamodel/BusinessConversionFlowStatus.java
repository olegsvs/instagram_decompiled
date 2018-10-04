package com.instagram.business.controller.datamodel;

import X.AnonymousClass0LH;
import X.AnonymousClass0LQ;
import X.AnonymousClass0Ow;
import X.AnonymousClass1jJ;
import X.AnonymousClass34M;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public class BusinessConversionFlowStatus implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass34M();
    /* renamed from: B */
    public final int f37529B;
    /* renamed from: C */
    public final AnonymousClass0Ow f37530C;

    public final int describeContents() {
        return 0;
    }

    public BusinessConversionFlowStatus(Parcel parcel) {
        this.f37529B = parcel.readInt();
        AnonymousClass1jJ anonymousClass1jJ = new AnonymousClass1jJ();
        Iterable arrayList = new ArrayList();
        parcel.readList(arrayList, BusinessConversionStep.class.getClassLoader());
        this.f37530C = anonymousClass1jJ.F(arrayList).H();
    }

    public BusinessConversionFlowStatus(List list) {
        this.f37530C = m18415B(list);
        this.f37529B = -1;
    }

    public BusinessConversionFlowStatus(List list, int i) {
        this.f37530C = m18415B(list);
        boolean z = i >= -1 && i <= this.f37530C.size();
        AnonymousClass0LH.H(z);
        this.f37529B = i;
    }

    /* renamed from: A */
    public final BusinessConversionStep m18416A() {
        if (m18420E()) {
            if (!m18419D()) {
                return (BusinessConversionStep) this.f37530C.get(this.f37529B);
            }
        }
        return null;
    }

    /* renamed from: B */
    private static AnonymousClass0Ow m18415B(List list) {
        boolean z = (list == null || list.isEmpty()) ? false : true;
        AnonymousClass0LH.H(z);
        return new AnonymousClass1jJ().F(list).H();
    }

    /* renamed from: B */
    public final BusinessConversionStep m18417B() {
        return (this.f37529B > 0 ? 1 : null) != null ? (BusinessConversionStep) this.f37530C.get(this.f37529B - 1) : null;
    }

    /* renamed from: C */
    public final boolean m18418C() {
        return this.f37529B < this.f37530C.size() + -1;
    }

    /* renamed from: D */
    public final boolean m18419D() {
        return this.f37529B == this.f37530C.size();
    }

    /* renamed from: E */
    public final boolean m18420E() {
        return this.f37529B > -1;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BusinessConversionFlowStatus)) {
            return false;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = (BusinessConversionFlowStatus) obj;
        if (businessConversionFlowStatus.f37529B == this.f37529B && businessConversionFlowStatus.f37530C.equals(this.f37530C)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{Integer.valueOf(this.f37529B), this.f37530C});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37529B);
        parcel.writeList(this.f37530C);
    }
}
