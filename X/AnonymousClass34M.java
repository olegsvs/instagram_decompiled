package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.business.controller.datamodel.BusinessConversionFlowStatus;

/* renamed from: X.34M */
public final class AnonymousClass34M implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new BusinessConversionFlowStatus(parcel);
    }

    public final Object[] newArray(int i) {
        return new BusinessConversionFlowStatus[i];
    }
}
