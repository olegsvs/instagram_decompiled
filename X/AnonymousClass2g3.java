package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.android.maps.model.LatLng;

/* renamed from: X.2g3 */
public final class AnonymousClass2g3 implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new LatLng(parcel);
    }

    public final Object[] newArray(int i) {
        return new LatLng[i];
    }
}
