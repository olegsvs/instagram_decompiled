package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall;

/* renamed from: X.5dN */
public final class AnonymousClass5dN implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new PaymentsChargeRequestErrorCall(parcel);
    }

    public final Object[] newArray(int i) {
        return new PaymentsChargeRequestErrorCall[i];
    }
}
