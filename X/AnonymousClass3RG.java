package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.instagram.igtv.logging.IGTVLaunchAnalytics;

/* renamed from: X.3RG */
public final class AnonymousClass3RG implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new IGTVLaunchAnalytics(parcel);
    }

    public final Object[] newArray(int i) {
        return new IGTVLaunchAnalytics[i];
    }
}
