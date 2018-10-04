package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;

/* renamed from: X.5dI */
public final class AnonymousClass5dI implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new CanMakePaymentJSBridgeCallResult(parcel);
    }

    public final Object[] newArray(int i) {
        return new CanMakePaymentJSBridgeCallResult[i];
    }
}
