package com.instagram.model.payments;

import X.AnonymousClass2EM;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PaymentInfoProductPrice implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2EM();
    /* renamed from: B */
    public String f27843B;
    /* renamed from: C */
    public String f27844C;

    public final int describeContents() {
        return 0;
    }

    public PaymentInfoProductPrice(Parcel parcel) {
        this.f27844C = parcel.readString();
        this.f27843B = parcel.readString();
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    PaymentInfoProductPrice paymentInfoProductPrice = (PaymentInfoProductPrice) obj;
                    if (!this.f27844C.equals(paymentInfoProductPrice.f27844C) || !this.f27843B.equals(paymentInfoProductPrice.f27843B)) {
                        z = false;
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.f27844C.hashCode() * 31) + this.f27843B.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27844C);
        parcel.writeString(this.f27843B);
    }
}
