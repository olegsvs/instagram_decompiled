package X;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.wifiscan.WifiScanConfig;

/* renamed from: X.1hE */
public final class AnonymousClass1hE implements Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new WifiScanConfig(parcel);
    }

    public final Object[] newArray(int i) {
        return new WifiScanConfig[i];
    }
}
