package com.instagram.business.controller.datamodel;

import X.AnonymousClass0LQ;
import X.AnonymousClass34P;
import X.AnonymousClass34Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class BusinessConversionStep implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass34P();
    /* renamed from: B */
    public final AnonymousClass34Q f37535B;
    /* renamed from: C */
    public final ConversionStep f37536C;

    public final int describeContents() {
        return 0;
    }

    public BusinessConversionStep(Parcel parcel) {
        this.f37536C = (ConversionStep) parcel.readParcelable(ConversionStep.class.getClassLoader());
        this.f37535B = AnonymousClass34Q.m18433B(parcel.readInt());
    }

    public BusinessConversionStep(ConversionStep conversionStep) {
        this(conversionStep, AnonymousClass34Q.NEXT);
    }

    public BusinessConversionStep(ConversionStep conversionStep, AnonymousClass34Q anonymousClass34Q) {
        this.f37536C = conversionStep;
        this.f37535B = anonymousClass34Q;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof BusinessConversionStep)) {
            return false;
        }
        BusinessConversionStep businessConversionStep = (BusinessConversionStep) obj;
        if (businessConversionStep.f37536C == this.f37536C && businessConversionStep.f37535B == this.f37535B) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass0LQ.D(new Object[]{this.f37536C, this.f37535B});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37536C, i);
        parcel.writeInt(this.f37535B.f37534B);
    }
}
