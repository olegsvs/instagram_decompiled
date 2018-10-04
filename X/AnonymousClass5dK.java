package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;

/* renamed from: X.5dK */
public final class AnonymousClass5dK implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new CanShowPaymentModuleJSBridgeCallResult(parcel);
    }

    public final Object[] newArray(int i) {
        return new CanShowPaymentModuleJSBridgeCallResult[i];
    }
}
