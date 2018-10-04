package com.instagram.model.shopping;

import X.AnonymousClass2EW;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.instagram.model.payments.PaymentInfoProductPrice;

public class ProductCheckoutProperties implements Parcelable {
    public static final Creator CREATOR = new AnonymousClass2EW();
    /* renamed from: B */
    public int f27871B;
    /* renamed from: C */
    public PaymentInfoProductPrice f27872C;

    public final int describeContents() {
        return 0;
    }

    public ProductCheckoutProperties(Parcel parcel) {
        this.f27871B = parcel.readInt();
        this.f27872C = (PaymentInfoProductPrice) parcel.readParcelable(PaymentInfoProductPrice.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj != null) {
                if (getClass() == obj.getClass()) {
                    ProductCheckoutProperties productCheckoutProperties = (ProductCheckoutProperties) obj;
                    if (this.f27871B == productCheckoutProperties.f27871B) {
                        if (this.f27872C != productCheckoutProperties.f27872C) {
                            z = false;
                        }
                    }
                }
            }
            return false;
        }
        return z;
    }

    public final int hashCode() {
        return (this.f27871B * 31) + this.f27872C.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27871B);
        parcel.writeParcelable(this.f27872C, i);
    }
}
