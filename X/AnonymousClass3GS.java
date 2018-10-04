package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.creation.photo.edit.filter.BlurredLumAdjustFilter;

/* renamed from: X.3GS */
public final class AnonymousClass3GS implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new BlurredLumAdjustFilter(parcel);
    }

    public final Object[] newArray(int i) {
        return new BlurredLumAdjustFilter[i];
    }
}
