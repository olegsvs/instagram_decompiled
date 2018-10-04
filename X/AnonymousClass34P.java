package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.business.controller.datamodel.BusinessConversionStep;

/* renamed from: X.34P */
public final class AnonymousClass34P implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new BusinessConversionStep(parcel);
    }

    public final Object[] newArray(int i) {
        return new BusinessConversionStep[i];
    }
}
