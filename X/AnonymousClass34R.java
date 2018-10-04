package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.business.controller.datamodel.ConversionStep;

/* renamed from: X.34R */
public final class AnonymousClass34R implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return ConversionStep.valueOf(parcel.readString());
    }

    public final Object[] newArray(int i) {
        return new ConversionStep[i];
    }
}
